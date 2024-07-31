package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.r;

/* loaded from: classes3.dex */
abstract class i0 implements r {
    @Override // io.grpc.internal.j2
    public void a(j2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.r
    public void b(vi.w0 w0Var) {
        e().b(w0Var);
    }

    @Override // io.grpc.internal.j2
    public void c() {
        e().c();
    }

    @Override // io.grpc.internal.r
    public void d(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
        e().d(g1Var, aVar, w0Var);
    }

    protected abstract r e();

    public String toString() {
        return eb.i.c(this).d("delegate", e()).toString();
    }
}
