package io.grpc.internal;

import io.grpc.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g0 implements s {

    /* renamed from: a, reason: collision with root package name */
    final vi.g1 f18852a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f18853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(vi.g1 g1Var, r.a aVar) {
        eb.o.e(!g1Var.p(), "error must not be OK");
        this.f18852a = g1Var;
        this.f18853b = aVar;
    }

    @Override // io.grpc.internal.s
    public q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
        return new f0(this.f18852a, this.f18853b, kVarArr);
    }

    @Override // vi.n0
    public vi.i0 e() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
