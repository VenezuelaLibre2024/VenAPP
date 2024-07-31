package p425wi;

import dm.C7056b;
import java.util.List;
import p082eb.C7159o;
import p448xi.C12491d;
import p448xi.C12496i;
import p448xi.EnumC12488a;
import p448xi.InterfaceC12490c;

/* renamed from: wi.c */
/* loaded from: classes3.dex */
abstract class AbstractC12202c implements InterfaceC12490c {

    /* renamed from: a */
    private final InterfaceC12490c f32503a;

    public AbstractC12202c(InterfaceC12490c interfaceC12490c) {
        this.f32503a = (InterfaceC12490c) C7159o.m21313p(interfaceC12490c, "delegate");
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: F */
    public void mo39170F(int i10, EnumC12488a enumC12488a, byte[] bArr) {
        this.f32503a.mo39170F(i10, enumC12488a, bArr);
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: G */
    public void mo39171G() {
        this.f32503a.mo39171G();
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: P0 */
    public void mo39172P0(C12496i c12496i) {
        this.f32503a.mo39172P0(c12496i);
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: X0 */
    public void mo39173X0(boolean z10, int i10, C7056b c7056b, int i11) {
        this.f32503a.mo39173X0(z10, i10, c7056b, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32503a.close();
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: d */
    public void mo39174d(int i10, long j10) {
        this.f32503a.mo39174d(i10, j10);
    }

    @Override // p448xi.InterfaceC12490c
    public void flush() {
        this.f32503a.flush();
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: h */
    public void mo39166h(boolean z10, int i10, int i11) {
        this.f32503a.mo39166h(z10, i10, i11);
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: o1 */
    public void mo39167o1(C12496i c12496i) {
        this.f32503a.mo39167o1(c12496i);
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: p0 */
    public int mo39175p0() {
        return this.f32503a.mo39175p0();
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: r1 */
    public void mo39176r1(boolean z10, boolean z11, int i10, int i11, List<C12491d> list) {
        this.f32503a.mo39176r1(z10, z11, i10, i11, list);
    }

    @Override // p448xi.InterfaceC12490c
    /* renamed from: s */
    public void mo39168s(int i10, EnumC12488a enumC12488a) {
        this.f32503a.mo39168s(i10, enumC12488a);
    }
}
