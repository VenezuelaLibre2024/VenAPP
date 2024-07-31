package p175j7;

import p363t8.C11172r0;
import p459y6.C12607a0;
import p459y6.InterfaceC12636z;

/* renamed from: j7.e */
/* loaded from: classes.dex */
final class C8996e implements InterfaceC12636z {

    /* renamed from: a */
    private final C8994c f21582a;

    /* renamed from: b */
    private final int f21583b;

    /* renamed from: c */
    private final long f21584c;

    /* renamed from: d */
    private final long f21585d;

    /* renamed from: e */
    private final long f21586e;

    public C8996e(C8994c c8994c, int i10, long j10, long j11) {
        this.f21582a = c8994c;
        this.f21583b = i10;
        this.f21584c = j10;
        long j12 = (j11 - j10) / c8994c.f21577e;
        this.f21585d = j12;
        this.f21586e = m26410a(j12);
    }

    /* renamed from: a */
    private long m26410a(long j10) {
        return C11172r0.m34885O0(j10 * this.f21583b, 1000000L, this.f21582a.f21575c);
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        long m34944r = C11172r0.m34944r((this.f21582a.f21575c * j10) / (this.f21583b * 1000000), 0L, this.f21585d - 1);
        long j11 = this.f21584c + (this.f21582a.f21577e * m34944r);
        long m26410a = m26410a(m34944r);
        C12607a0 c12607a0 = new C12607a0(m26410a, j11);
        if (m26410a >= j10 || m34944r == this.f21585d - 1) {
            return new InterfaceC12636z.a(c12607a0);
        }
        long j12 = m34944r + 1;
        return new InterfaceC12636z.a(c12607a0, new C12607a0(m26410a(j12), this.f21584c + (this.f21582a.f21577e * j12)));
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f21586e;
    }
}
