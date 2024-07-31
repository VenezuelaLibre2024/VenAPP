package p099f7;

import p363t8.C11172r0;
import p363t8.C11175t;
import p459y6.C12607a0;
import p459y6.InterfaceC12636z;

/* renamed from: f7.b */
/* loaded from: classes.dex */
final class C7306b implements InterfaceC7311g {

    /* renamed from: a */
    private final long f16381a;

    /* renamed from: b */
    private final C11175t f16382b;

    /* renamed from: c */
    private final C11175t f16383c;

    /* renamed from: d */
    private long f16384d;

    public C7306b(long j10, long j11, long j12) {
        this.f16384d = j10;
        this.f16381a = j12;
        C11175t c11175t = new C11175t();
        this.f16382b = c11175t;
        C11175t c11175t2 = new C11175t();
        this.f16383c = c11175t2;
        c11175t.m34984a(0L);
        c11175t2.m34984a(j11);
    }

    /* renamed from: a */
    public boolean m21889a(long j10) {
        C11175t c11175t = this.f16382b;
        return j10 - c11175t.m34985b(c11175t.m34986c() - 1) < 100000;
    }

    /* renamed from: b */
    public void m21890b(long j10, long j11) {
        if (m21889a(j10)) {
            return;
        }
        this.f16382b.m34984a(j10);
        this.f16383c.m34984a(j11);
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: c */
    public long mo21887c(long j10) {
        return this.f16382b.m34985b(C11172r0.m34922g(this.f16383c, j10, true, true));
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        int m34922g = C11172r0.m34922g(this.f16382b, j10, true, true);
        C12607a0 c12607a0 = new C12607a0(this.f16382b.m34985b(m34922g), this.f16383c.m34985b(m34922g));
        if (c12607a0.f34223a == j10 || m34922g == this.f16382b.m34986c() - 1) {
            return new InterfaceC12636z.a(c12607a0);
        }
        int i10 = m34922g + 1;
        return new InterfaceC12636z.a(c12607a0, new C12607a0(this.f16382b.m34985b(i10), this.f16383c.m34985b(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m21891e(long j10) {
        this.f16384d = j10;
    }

    @Override // p099f7.InterfaceC7311g
    /* renamed from: g */
    public long mo21888g() {
        return this.f16381a;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f16384d;
    }
}
