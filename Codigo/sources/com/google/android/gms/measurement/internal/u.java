package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzcp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f10662d;

    /* renamed from: a, reason: collision with root package name */
    private final w6 f10663a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f10664b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f10665c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w6 w6Var) {
        com.google.android.gms.common.internal.s.j(w6Var);
        this.f10663a = w6Var;
        this.f10664b = new t(this, w6Var);
    }

    private final Handler f() {
        Handler handler;
        if (f10662d != null) {
            return f10662d;
        }
        synchronized (u.class) {
            if (f10662d == null) {
                f10662d = new zzcp(this.f10663a.zza().getMainLooper());
            }
            handler = f10662d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f10665c = 0L;
        f().removeCallbacks(this.f10664b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f10665c = this.f10663a.zzb().a();
            if (f().postDelayed(this.f10664b, j10)) {
                return;
            }
            this.f10663a.zzj().B().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f10665c != 0;
    }
}
