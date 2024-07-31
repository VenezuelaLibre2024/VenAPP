package io.grpc.internal;

/* loaded from: classes3.dex */
abstract class l0 extends vi.s0 {

    /* renamed from: a, reason: collision with root package name */
    private final vi.s0 f18961a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(vi.s0 s0Var) {
        this.f18961a = s0Var;
    }

    @Override // vi.d
    public String a() {
        return this.f18961a.a();
    }

    @Override // vi.d
    public <RequestT, ResponseT> vi.g<RequestT, ResponseT> h(vi.x0<RequestT, ResponseT> x0Var, vi.c cVar) {
        return this.f18961a.h(x0Var, cVar);
    }

    public String toString() {
        return eb.i.c(this).d("delegate", this.f18961a).toString();
    }
}
