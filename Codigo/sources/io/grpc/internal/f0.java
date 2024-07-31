package io.grpc.internal;

import io.grpc.internal.r;

/* loaded from: classes3.dex */
public final class f0 extends n1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f18718b;

    /* renamed from: c, reason: collision with root package name */
    private final vi.g1 f18719c;

    /* renamed from: d, reason: collision with root package name */
    private final r.a f18720d;

    /* renamed from: e, reason: collision with root package name */
    private final vi.k[] f18721e;

    public f0(vi.g1 g1Var, r.a aVar, vi.k[] kVarArr) {
        eb.o.e(!g1Var.p(), "error must not be OK");
        this.f18719c = g1Var;
        this.f18720d = aVar;
        this.f18721e = kVarArr;
    }

    public f0(vi.g1 g1Var, vi.k[] kVarArr) {
        this(g1Var, r.a.PROCESSED, kVarArr);
    }

    @Override // io.grpc.internal.n1, io.grpc.internal.q
    public void m(w0 w0Var) {
        w0Var.b("error", this.f18719c).b("progress", this.f18720d);
    }

    @Override // io.grpc.internal.n1, io.grpc.internal.q
    public void o(r rVar) {
        eb.o.v(!this.f18718b, "already started");
        this.f18718b = true;
        for (vi.k kVar : this.f18721e) {
            kVar.i(this.f18719c);
        }
        rVar.d(this.f18719c, this.f18720d, new vi.w0());
    }
}
