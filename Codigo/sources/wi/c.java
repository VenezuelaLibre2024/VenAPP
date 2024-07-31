package wi;

import java.util.List;

/* loaded from: classes3.dex */
abstract class c implements xi.c {

    /* renamed from: a, reason: collision with root package name */
    private final xi.c f30034a;

    public c(xi.c cVar) {
        this.f30034a = (xi.c) eb.o.p(cVar, "delegate");
    }

    @Override // xi.c
    public void F(int i10, xi.a aVar, byte[] bArr) {
        this.f30034a.F(i10, aVar, bArr);
    }

    @Override // xi.c
    public void G() {
        this.f30034a.G();
    }

    @Override // xi.c
    public void P0(xi.i iVar) {
        this.f30034a.P0(iVar);
    }

    @Override // xi.c
    public void X0(boolean z10, int i10, dm.b bVar, int i11) {
        this.f30034a.X0(z10, i10, bVar, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30034a.close();
    }

    @Override // xi.c
    public void d(int i10, long j10) {
        this.f30034a.d(i10, j10);
    }

    @Override // xi.c
    public void flush() {
        this.f30034a.flush();
    }

    @Override // xi.c
    public void h(boolean z10, int i10, int i11) {
        this.f30034a.h(z10, i10, i11);
    }

    @Override // xi.c
    public void o1(xi.i iVar) {
        this.f30034a.o1(iVar);
    }

    @Override // xi.c
    public int p0() {
        return this.f30034a.p0();
    }

    @Override // xi.c
    public void r1(boolean z10, boolean z11, int i10, int i11, List<xi.d> list) {
        this.f30034a.r1(z10, z11, i10, i11, list);
    }

    @Override // xi.c
    public void s(int i10, xi.a aVar) {
        this.f30034a.s(i10, aVar);
    }
}
