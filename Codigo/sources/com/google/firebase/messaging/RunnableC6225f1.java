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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.f1 */
/* loaded from: classes.dex */
public class RunnableC6225f1 implements Runnable {

    /* renamed from: f */
    private static final Object f13313f = new Object();

    /* renamed from: r */
    private static Boolean f13314r;

    /* renamed from: s */
    private static Boolean f13315s;

    /* renamed from: a */
    private final Context f13316a;

    /* renamed from: b */
    private final C6236j0 f13317b;

    /* renamed from: c */
    private final PowerManager.WakeLock f13318c;

    /* renamed from: d */
    private final C6222e1 f13319d;

    /* renamed from: e */
    private final long f13320e;

    /* renamed from: com.google.firebase.messaging.f1$a */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6225f1 f13321a;

        public a(RunnableC6225f1 runnableC6225f1) {
            this.f13321a = runnableC6225f1;
        }

        /* renamed from: a */
        public void m17021a() {
            if (RunnableC6225f1.m17012b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC6225f1.this.f13316a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC6225f1 runnableC6225f1 = this.f13321a;
            if (runnableC6225f1 == null) {
                return;
            }
            if (runnableC6225f1.m17019i()) {
                if (RunnableC6225f1.m17012b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f13321a.f13319d.m17003m(this.f13321a, 0L);
                context.unregisterReceiver(this);
                this.f13321a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6225f1(C6222e1 c6222e1, Context context, C6236j0 c6236j0, long j10) {
        this.f13319d = c6222e1;
        this.f13316a = context;
        this.f13320e = j10;
        this.f13317b = c6236j0;
        this.f13318c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: b */
    static /* synthetic */ boolean m17012b() {
        return m17020j();
    }

    /* renamed from: e */
    private static String m17015e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m17016f(Context context) {
        boolean booleanValue;
        synchronized (f13313f) {
            Boolean bool = f13315s;
            Boolean valueOf = Boolean.valueOf(bool == null ? m17017g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f13315s = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m17017g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m17015e(str));
        }
        return z10;
    }

    /* renamed from: h */
    private static boolean m17018h(Context context) {
        boolean booleanValue;
        synchronized (f13313f) {
            Boolean bool = f13314r;
            Boolean valueOf = Boolean.valueOf(bool == null ? m17017g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f13314r = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m17019i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13316a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    /* renamed from: j */
    private static boolean m17020j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m17018h(this.f13316a)) {
            this.f13318c.acquire(C6217d.f13283a);
        }
        try {
            try {
                try {
                    this.f13319d.m17005o(true);
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f13319d.m17005o(false);
                    if (!m17018h(this.f13316a)) {
                        return;
                    } else {
                        wakeLock = this.f13318c;
                    }
                }
                if (!this.f13317b.m17076g()) {
                    this.f13319d.m17005o(false);
                    if (m17018h(this.f13316a)) {
                        try {
                            this.f13318c.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (m17016f(this.f13316a) && !m17019i()) {
                    new a(this).m17021a();
                    if (m17018h(this.f13316a)) {
                        try {
                            this.f13318c.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f13319d.m17008s()) {
                    this.f13319d.m17005o(false);
                } else {
                    this.f13319d.m17009t(this.f13320e);
                }
                if (m17018h(this.f13316a)) {
                    wakeLock = this.f13318c;
                    wakeLock.release();
                }
            } catch (Throwable th2) {
                if (m17018h(this.f13316a)) {
                    try {
                        this.f13318c.release();
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
