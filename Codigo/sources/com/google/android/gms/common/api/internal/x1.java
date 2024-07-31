package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class x1 extends r1 {

    /* renamed from: c */
    public final k.a f9498c;

    public x1(k.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f9498c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final /* bridge */ /* synthetic */ void d(b0 b0Var, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean f(l0 l0Var) {
        b1 b1Var = (b1) l0Var.u().get(this.f9498c);
        return b1Var != null && b1Var.f9328a.f();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final ca.d[] g(l0 l0Var) {
        b1 b1Var = (b1) l0Var.u().get(this.f9498c);
        if (b1Var == null) {
            return null;
        }
        return b1Var.f9328a.c();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final void h(l0 l0Var) {
        b1 b1Var = (b1) l0Var.u().remove(this.f9498c);
        if (b1Var == null) {
            this.f9462b.trySetResult(Boolean.FALSE);
        } else {
            b1Var.f9329b.b(l0Var.s(), this.f9462b);
            b1Var.f9328a.a();
        }
    }
}
