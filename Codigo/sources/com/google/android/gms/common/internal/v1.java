package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v1 extends i {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f9659f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f9660g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f9661h;

    /* renamed from: i, reason: collision with root package name */
    private final u1 f9662i;

    /* renamed from: j, reason: collision with root package name */
    private final ka.b f9663j;

    /* renamed from: k, reason: collision with root package name */
    private final long f9664k;

    /* renamed from: l, reason: collision with root package name */
    private final long f9665l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Executor f9666m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(Context context, Looper looper, Executor executor) {
        u1 u1Var = new u1(this, null);
        this.f9662i = u1Var;
        this.f9660g = context.getApplicationContext();
        this.f9661h = new zzi(looper, u1Var);
        this.f9663j = ka.b.b();
        this.f9664k = 5000L;
        this.f9665l = 300000L;
        this.f9666m = executor;
    }

    @Override // com.google.android.gms.common.internal.i
    protected final void f(q1 q1Var, ServiceConnection serviceConnection, String str) {
        s.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9659f) {
            s1 s1Var = (s1) this.f9659f.get(q1Var);
            if (s1Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + q1Var.toString());
            }
            if (!s1Var.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + q1Var.toString());
            }
            s1Var.f(serviceConnection, str);
            if (s1Var.i()) {
                this.f9661h.sendMessageDelayed(this.f9661h.obtainMessage(0, q1Var), this.f9664k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.i
    public final boolean h(q1 q1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        s.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9659f) {
            s1 s1Var = (s1) this.f9659f.get(q1Var);
            if (executor == null) {
                executor = this.f9666m;
            }
            if (s1Var == null) {
                s1Var = new s1(this, q1Var);
                s1Var.d(serviceConnection, serviceConnection, str);
                s1Var.e(str, executor);
                this.f9659f.put(q1Var, s1Var);
            } else {
                this.f9661h.removeMessages(0, q1Var);
                if (s1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + q1Var.toString());
                }
                s1Var.d(serviceConnection, serviceConnection, str);
                int a10 = s1Var.a();
                if (a10 == 1) {
                    serviceConnection.onServiceConnected(s1Var.b(), s1Var.c());
                } else if (a10 == 2) {
                    s1Var.e(str, executor);
                }
            }
            j10 = s1Var.j();
        }
        return j10;
    }
}
