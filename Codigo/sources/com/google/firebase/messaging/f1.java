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

/* loaded from: classes.dex */
public class f1 implements Runnable {

    /* renamed from: f */
    private static final Object f12098f = new Object();

    /* renamed from: r */
    private static Boolean f12099r;

    /* renamed from: s */
    private static Boolean f12100s;

    /* renamed from: a */
    private final Context f12101a;

    /* renamed from: b */
    private final j0 f12102b;

    /* renamed from: c */
    private final PowerManager.WakeLock f12103c;

    /* renamed from: d */
    private final e1 f12104d;

    /* renamed from: e */
    private final long f12105e;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a */
        private f1 f12106a;

        public a(f1 f1Var) {
            this.f12106a = f1Var;
        }

        public void a() {
            if (f1.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            f1.this.f12101a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            f1 f1Var = this.f12106a;
            if (f1Var == null) {
                return;
            }
            if (f1Var.i()) {
                if (f1.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f12106a.f12104d.m(this.f12106a, 0L);
                context.unregisterReceiver(this);
                this.f12106a = null;
            }
        }
    }

    public f1(e1 e1Var, Context context, j0 j0Var, long j10) {
        this.f12104d = e1Var;
        this.f12101a = context;
        this.f12105e = j10;
        this.f12102b = j0Var;
        this.f12103c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f12098f) {
            Boolean bool = f12100s;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f12100s = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f12098f) {
            Boolean bool = f12099r;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f12099r = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public synchronized boolean i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f12101a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f12101a)) {
            this.f12103c.acquire(d.f12068a);
        }
        try {
            try {
                try {
                    this.f12104d.o(true);
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f12104d.o(false);
                    if (!h(this.f12101a)) {
                        return;
                    } else {
                        wakeLock = this.f12103c;
                    }
                }
                if (!this.f12102b.g()) {
                    this.f12104d.o(false);
                    if (h(this.f12101a)) {
                        try {
                            this.f12103c.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f12101a) && !i()) {
                    new a(this).a();
                    if (h(this.f12101a)) {
                        try {
                            this.f12103c.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f12104d.s()) {
                    this.f12104d.o(false);
                } else {
                    this.f12104d.t(this.f12105e);
                }
                if (h(this.f12101a)) {
                    wakeLock = this.f12103c;
                    wakeLock.release();
                }
            } catch (Throwable th2) {
                if (h(this.f12101a)) {
                    try {
                        this.f12103c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
