package io.grpc.internal;

import vi.y0;

/* loaded from: classes3.dex */
abstract class m0 extends vi.y0 {

    /* renamed from: a, reason: collision with root package name */
    private final vi.y0 f18987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(vi.y0 y0Var) {
        eb.o.p(y0Var, "delegate can not be null");
        this.f18987a = y0Var;
    }

    @Override // vi.y0
    public void b() {
        this.f18987a.b();
    }

    @Override // vi.y0
    public void c() {
        this.f18987a.c();
    }

    @Override // vi.y0
    public void d(y0.e eVar) {
        this.f18987a.d(eVar);
    }

    @Override // vi.y0
    @Deprecated
    public void e(y0.f fVar) {
        this.f18987a.e(fVar);
    }

    public String toString() {
        return eb.i.c(this).d("delegate", this.f18987a).toString();
    }
}
