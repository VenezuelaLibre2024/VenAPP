package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class u1 extends y1 {

    /* renamed from: b, reason: collision with root package name */
    protected final d f9475b;

    public u1(int i10, d dVar) {
        super(i10);
        this.f9475b = (d) com.google.android.gms.common.internal.s.k(dVar, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void a(Status status) {
        try {
            this.f9475b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void b(Exception exc) {
        try {
            this.f9475b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void c(l0 l0Var) {
        try {
            this.f9475b.run(l0Var.s());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void d(b0 b0Var, boolean z10) {
        b0Var.c(this.f9475b, z10);
    }
}
