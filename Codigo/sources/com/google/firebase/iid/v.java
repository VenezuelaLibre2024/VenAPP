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
/* loaded from: classes.dex */
public class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f11927a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f11928b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseInstanceId f11929c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f11930d = b.b();

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private v f11931a;

        public a(v vVar) {
            this.f11931a = vVar;
        }

        public void a() {
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f11931a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            v vVar = this.f11931a;
            if (vVar != null && vVar.c()) {
                if (FirebaseInstanceId.r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f11931a.f11929c.g(this.f11931a, 0L);
                this.f11931a.b().unregisterReceiver(this);
                this.f11931a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f11929c = firebaseInstanceId;
        this.f11927a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11928b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    Context b() {
        return this.f11929c.h().m();
    }

    boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean d() {
        String str;
        if (!this.f11929c.F(this.f11929c.p())) {
            return true;
        }
        try {
            if (this.f11929c.d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            if (k.g(e10.getMessage())) {
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
        if (t.a().c(b())) {
            this.f11928b.acquire();
        }
        try {
            try {
                this.f11929c.C(true);
                if (!this.f11929c.s()) {
                    this.f11929c.C(false);
                    if (!t.a().c(b())) {
                        return;
                    }
                } else if (!t.a().b(b()) || c()) {
                    if (d()) {
                        this.f11929c.C(false);
                    } else {
                        this.f11929c.E(this.f11927a);
                    }
                    if (!t.a().c(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!t.a().c(b())) {
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
                this.f11929c.C(false);
                if (!t.a().c(b())) {
                    return;
                }
            }
            this.f11928b.release();
        } catch (Throwable th2) {
            if (t.a().c(b())) {
                this.f11928b.release();
            }
            throw th2;
        }
    }
}
