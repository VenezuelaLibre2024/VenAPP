package com.google.firebase.iid;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.v */
/* loaded from: classes.dex */
public class RunnableC6190v implements Runnable {

    /* renamed from: a */
    private final long f13142a;

    /* renamed from: b */
    private final PowerManager.WakeLock f13143b;

    /* renamed from: c */
    private final FirebaseInstanceId f13144c;

    /* renamed from: d */
    ExecutorService f13145d = C6170b.m16751b();

    /* renamed from: com.google.firebase.iid.v$a */
    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6190v f13146a;

        public a(RunnableC6190v runnableC6190v) {
            this.f13146a = runnableC6190v;
        }

        /* renamed from: a */
        public void m16795a() {
            if (FirebaseInstanceId.m16719r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f13146a.m16792b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC6190v runnableC6190v = this.f13146a;
            if (runnableC6190v != null && runnableC6190v.m16793c()) {
                if (FirebaseInstanceId.m16719r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f13146a.f13144c.m16731g(this.f13146a, 0L);
                this.f13146a.m16792b().unregisterReceiver(this);
                this.f13146a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6190v(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f13144c = firebaseInstanceId;
        this.f13142a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m16792b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f13143b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    Context m16792b() {
        return this.f13144c.m16732h().m42630m();
    }

    /* renamed from: c */
    boolean m16793c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m16792b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: d */
    boolean m16794d() {
        String str;
        if (!this.f13144c.m16727F(this.f13144c.m16737p())) {
            return true;
        }
        try {
            if (this.f13144c.m16729d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            if (C6179k.m16756g(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                str = sb2.toString();
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseInstanceId", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C6188t.m16773a().m16775c(m16792b())) {
            this.f13143b.acquire();
        }
        try {
            try {
                this.f13144c.m16724C(true);
                if (!this.f13144c.m16739s()) {
                    this.f13144c.m16724C(false);
                    if (!C6188t.m16773a().m16775c(m16792b())) {
                        return;
                    }
                } else if (!C6188t.m16773a().m16774b(m16792b()) || m16793c()) {
                    if (m16794d()) {
                        this.f13144c.m16724C(false);
                    } else {
                        this.f13144c.m16726E(this.f13142a);
                    }
                    if (!C6188t.m16773a().m16775c(m16792b())) {
                        return;
                    }
                } else {
                    new a(this).m16795a();
                    if (!C6188t.m16773a().m16775c(m16792b())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb2.toString());
                this.f13144c.m16724C(false);
                if (!C6188t.m16773a().m16775c(m16792b())) {
                    return;
                }
            }
            this.f13143b.release();
        } catch (Throwable th2) {
            if (C6188t.m16773a().m16775c(m16792b())) {
                this.f13143b.release();
            }
            throw th2;
        }
    }
}
