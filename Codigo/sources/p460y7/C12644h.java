package p460y7;

import p459y6.C12610c;
import p482z7.C12817i;

/* renamed from: y7.h */
/* loaded from: classes.dex */
public final class C12644h implements InterfaceC12642f {

    /* renamed from: a */
    private final C12610c f34342a;

    /* renamed from: b */
    private final long f34343b;

    public C12644h(C12610c c12610c, long j10) {
        this.f34342a = c12610c;
        this.f34343b = j10;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: a */
    public long mo41618a(long j10, long j11) {
        return this.f34342a.f34232d[(int) j10];
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: b */
    public long mo41619b(long j10, long j11) {
        return 0L;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: c */
    public long mo41620c(long j10) {
        return this.f34342a.f34233e[(int) j10] - this.f34343b;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: d */
    public long mo41621d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: e */
    public C12817i mo41622e(long j10) {
        return new C12817i(null, this.f34342a.f34231c[(int) j10], r0.f34230b[r8]);
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: f */
    public long mo41623f(long j10, long j11) {
        return this.f34342a.m41513a(j10 + this.f34343b);
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: g */
    public long mo41624g(long j10) {
        return this.f34342a.f34229a;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: h */
    public boolean mo41625h() {
        return true;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: i */
    public long mo41626i() {
        return 0L;
    }

    @Override // p460y7.InterfaceC12642f
    /* renamed from: j */
    public long mo41627j(long j10, long j11) {
        return this.f34342a.f34229a;
    }
}
