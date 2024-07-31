package io.grpc.internal;

import io.grpc.internal.j1;
import io.grpc.internal.s;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
abstract class j0 implements v {
    protected abstract v a();

    @Override // io.grpc.internal.j1
    public void b(vi.g1 g1Var) {
        a().b(g1Var);
    }

    @Override // io.grpc.internal.s
    public q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
        return a().c(x0Var, w0Var, cVar, kVarArr);
    }

    @Override // io.grpc.internal.j1
    public void d(vi.g1 g1Var) {
        a().d(g1Var);
    }

    @Override // vi.n0
    public vi.i0 e() {
        return a().e();
    }

    @Override // io.grpc.internal.s
    public void f(s.a aVar, Executor executor) {
        a().f(aVar, executor);
    }

    @Override // io.grpc.internal.j1
    public Runnable g(j1.a aVar) {
        return a().g(aVar);
    }

    public String toString() {
        return eb.i.c(this).d("delegate", a()).toString();
    }
}
