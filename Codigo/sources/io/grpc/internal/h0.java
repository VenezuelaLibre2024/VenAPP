package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes3.dex */
abstract class h0 implements q {
    @Override // io.grpc.internal.i2
    public void a(vi.n nVar) {
        p().a(nVar);
    }

    @Override // io.grpc.internal.i2
    public void b(int i10) {
        p().b(i10);
    }

    @Override // io.grpc.internal.q
    public void c(vi.g1 g1Var) {
        p().c(g1Var);
    }

    @Override // io.grpc.internal.i2
    public boolean d() {
        return p().d();
    }

    @Override // io.grpc.internal.q
    public void e(int i10) {
        p().e(i10);
    }

    @Override // io.grpc.internal.q
    public void f(int i10) {
        p().f(i10);
    }

    @Override // io.grpc.internal.i2
    public void flush() {
        p().flush();
    }

    @Override // io.grpc.internal.q
    public void g(vi.t tVar) {
        p().g(tVar);
    }

    @Override // io.grpc.internal.i2
    public void h(InputStream inputStream) {
        p().h(inputStream);
    }

    @Override // io.grpc.internal.i2
    public void i() {
        p().i();
    }

    @Override // io.grpc.internal.q
    public void j(boolean z10) {
        p().j(z10);
    }

    @Override // io.grpc.internal.q
    public void k(vi.v vVar) {
        p().k(vVar);
    }

    @Override // io.grpc.internal.q
    public void l(String str) {
        p().l(str);
    }

    @Override // io.grpc.internal.q
    public void m(w0 w0Var) {
        p().m(w0Var);
    }

    @Override // io.grpc.internal.q
    public void n() {
        p().n();
    }

    @Override // io.grpc.internal.q
    public void o(r rVar) {
        p().o(rVar);
    }

    protected abstract q p();

    public String toString() {
        return eb.i.c(this).d("delegate", p()).toString();
    }
}
