package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class w1 extends u0 {

    /* renamed from: b, reason: collision with root package name */
    private final w f9491b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f9492c;

    /* renamed from: d, reason: collision with root package name */
    private final u f9493d;

    public w1(int i10, w wVar, TaskCompletionSource taskCompletionSource, u uVar) {
        super(i10);
        this.f9492c = taskCompletionSource;
        this.f9491b = wVar;
        this.f9493d = uVar;
        if (i10 == 2 && wVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void a(Status status) {
        this.f9492c.trySetException(this.f9493d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void b(Exception exc) {
        this.f9492c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void c(l0 l0Var) {
        try {
            this.f9491b.b(l0Var.s(), this.f9492c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(y1.e(e11));
        } catch (RuntimeException e12) {
            this.f9492c.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void d(b0 b0Var, boolean z10) {
        b0Var.d(this.f9492c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean f(l0 l0Var) {
        return this.f9491b.c();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final ca.d[] g(l0 l0Var) {
        return this.f9491b.e();
    }
}
