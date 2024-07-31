package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class v1 extends r1 {

    /* renamed from: c, reason: collision with root package name */
    public final b1 f9478c;

    public v1(b1 b1Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f9478c = b1Var;
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final /* bridge */ /* synthetic */ void d(b0 b0Var, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean f(l0 l0Var) {
        return this.f9478c.f9328a.f();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final ca.d[] g(l0 l0Var) {
        return this.f9478c.f9328a.c();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final void h(l0 l0Var) {
        this.f9478c.f9328a.d(l0Var.s(), this.f9462b);
        k.a b10 = this.f9478c.f9328a.b();
        if (b10 != null) {
            l0Var.u().put(b10, this.f9478c);
        }
    }
}
