package p459y6;

import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.C12630t;
import p459y6.InterfaceC12636z;

/* renamed from: y6.s */
/* loaded from: classes.dex */
public final class C12629s implements InterfaceC12636z {

    /* renamed from: a */
    private final C12630t f34306a;

    /* renamed from: b */
    private final long f34307b;

    public C12629s(C12630t c12630t, long j10) {
        this.f34306a = c12630t;
        this.f34307b = j10;
    }

    /* renamed from: a */
    private C12607a0 m41591a(long j10, long j11) {
        return new C12607a0((j10 * 1000000) / this.f34306a.f34312e, this.f34307b + j11);
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        C11137a.m34607i(this.f34306a.f34318k);
        C12630t c12630t = this.f34306a;
        C12630t.a aVar = c12630t.f34318k;
        long[] jArr = aVar.f34320a;
        long[] jArr2 = aVar.f34321b;
        int m34926i = C11172r0.m34926i(jArr, c12630t.m41601i(j10), true, false);
        C12607a0 m41591a = m41591a(m34926i == -1 ? 0L : jArr[m34926i], m34926i != -1 ? jArr2[m34926i] : 0L);
        if (m41591a.f34223a == j10 || m34926i == jArr.length - 1) {
            return new InterfaceC12636z.a(m41591a);
        }
        int i10 = m34926i + 1;
        return new InterfaceC12636z.a(m41591a, m41591a(jArr[i10], jArr2[i10]));
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f34306a.m41598f();
    }
}
