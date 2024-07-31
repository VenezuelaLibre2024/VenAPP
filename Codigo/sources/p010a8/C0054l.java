package p010a8;

import p361t6.C11113v1;
import p363t8.C11137a;
import p397v7.InterfaceC11734v0;
import p414w6.C12082g;

/* renamed from: a8.l */
/* loaded from: classes.dex */
final class C0054l implements InterfaceC11734v0 {

    /* renamed from: a */
    private final int f215a;

    /* renamed from: b */
    private final C0058p f216b;

    /* renamed from: c */
    private int f217c = -1;

    public C0054l(C0058p c0058p, int i10) {
        this.f216b = c0058p;
        this.f215a = i10;
    }

    /* renamed from: c */
    private boolean m261c() {
        int i10 = this.f217c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: a */
    public void mo262a() {
        int i10 = this.f217c;
        if (i10 == -2) {
            throw new C0060r(this.f216b.m325r().m36857c(this.f215a).m36849d(0).f28797w);
        }
        if (i10 == -1) {
            this.f216b.m297T();
        } else if (i10 != -3) {
            this.f216b.m298U(i10);
        }
    }

    /* renamed from: b */
    public void m263b() {
        C11137a.m34599a(this.f217c == -1);
        this.f217c = this.f216b.m327x(this.f215a);
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: d */
    public boolean mo264d() {
        return this.f217c == -3 || (m261c() && this.f216b.m295P(this.f217c));
    }

    /* renamed from: e */
    public void m265e() {
        if (this.f217c != -1) {
            this.f216b.m322o0(this.f215a);
            this.f217c = -1;
        }
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: p */
    public int mo266p(long j10) {
        if (m261c()) {
            return this.f216b.m320n0(this.f217c, j10);
        }
        return 0;
    }

    @Override // p397v7.InterfaceC11734v0
    /* renamed from: q */
    public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
        if (this.f217c == -3) {
            c12082g.m38789m(4);
            return -4;
        }
        if (m261c()) {
            return this.f216b.m309d0(this.f217c, c11113v1, c12082g, i10);
        }
        return -3;
    }
}
