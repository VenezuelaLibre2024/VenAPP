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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f12048a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f12049b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f12050c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f12051d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ma.b("firebase-iid-executor"));

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private a1 f12052a;

        public a(a1 a1Var) {
            this.f12052a = a1Var;
        }

        public void a() {
            if (a1.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f12052a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a1 a1Var = this.f12052a;
            if (a1Var != null && a1Var.d()) {
                if (a1.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f12052a.f12050c.p(this.f12052a, 0L);
                this.f12052a.b().unregisterReceiver(this);
                this.f12052a = null;
            }
        }
    }

    public a1(FirebaseMessaging firebaseMessaging, long j10) {
        this.f12050c = firebaseMessaging;
        this.f12048a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f12049b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f12050c.q();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() {
        String str;
        try {
            if (this.f12050c.n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (e0.h(e10.getMessage())) {
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
        if (w0.b().e(b())) {
            this.f12049b.acquire();
        }
        try {
            try {
                this.f12050c.O(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f12050c.O(false);
                if (!w0.b().e(b())) {
                    return;
                }
            }
            if (!this.f12050c.z()) {
                this.f12050c.O(false);
                if (w0.b().e(b())) {
                    this.f12049b.release();
                    return;
                }
                return;
            }
            if (w0.b().d(b()) && !d()) {
                new a(this).a();
                if (w0.b().e(b())) {
                    this.f12049b.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f12050c.O(false);
            } else {
                this.f12050c.S(this.f12048a);
            }
            if (!w0.b().e(b())) {
                return;
            }
            this.f12049b.release();
        } catch (Throwable th2) {
            if (w0.b().e(b())) {
                this.f12049b.release();
            }
            throw th2;
        }
    }
}
