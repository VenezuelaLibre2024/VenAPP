package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ma.ThreadFactoryC9560b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.a1 */
/* loaded from: classes.dex */
public class RunnableC6210a1 implements Runnable {

    /* renamed from: a */
    private final long f13263a;

    /* renamed from: b */
    private final PowerManager.WakeLock f13264b;

    /* renamed from: c */
    private final FirebaseMessaging f13265c;

    /* renamed from: d */
    ExecutorService f13266d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC9560b("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.a1$a */
    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6210a1 f13267a;

        public a(RunnableC6210a1 runnableC6210a1) {
            this.f13267a = runnableC6210a1;
        }

        /* renamed from: a */
        public void m16936a() {
            if (RunnableC6210a1.m16932c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f13267a.m16933b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC6210a1 runnableC6210a1 = this.f13267a;
            if (runnableC6210a1 != null && runnableC6210a1.m16934d()) {
                if (RunnableC6210a1.m16932c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f13267a.f13265c.m16915p(this.f13267a, 0L);
                this.f13267a.m16933b().unregisterReceiver(this);
                this.f13267a = null;
            }
        }
    }

    public RunnableC6210a1(FirebaseMessaging firebaseMessaging, long j10) {
        this.f13265c = firebaseMessaging;
        this.f13263a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m16933b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f13264b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m16932c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* renamed from: b */
    Context m16933b() {
        return this.f13265c.m16916q();
    }

    /* renamed from: d */
    boolean m16934d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m16933b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    boolean m16935e() {
        String str;
        try {
            if (this.f13265c.m16913n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (C6221e0.m16982h(e10.getMessage())) {
                str = "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval";
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C6266w0.m17198b().m17202e(m16933b())) {
            this.f13264b.acquire();
        }
        try {
            try {
                this.f13265c.m16908O(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f13265c.m16908O(false);
                if (!C6266w0.m17198b().m17202e(m16933b())) {
                    return;
                }
            }
            if (!this.f13265c.m16920z()) {
                this.f13265c.m16908O(false);
                if (C6266w0.m17198b().m17202e(m16933b())) {
                    this.f13264b.release();
                    return;
                }
                return;
            }
            if (C6266w0.m17198b().m17201d(m16933b()) && !m16934d()) {
                new a(this).m16936a();
                if (C6266w0.m17198b().m17202e(m16933b())) {
                    this.f13264b.release();
                    return;
                }
                return;
            }
            if (m16935e()) {
                this.f13265c.m16908O(false);
            } else {
                this.f13265c.m16910S(this.f13263a);
            }
            if (!C6266w0.m17198b().m17202e(m16933b())) {
                return;
            }
            this.f13264b.release();
        } catch (Throwable th2) {
            if (C6266w0.m17198b().m17202e(m16933b())) {
                this.f13264b.release();
            }
            throw th2;
        }
    }
}
