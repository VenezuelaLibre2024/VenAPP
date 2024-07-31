package p260o0;

import java.util.Iterator;
import p243n0.C9618a;
import p243n0.C9622e;
import p260o0.C9758f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o0.k */
/* loaded from: classes.dex */
public class C9763k extends AbstractC9768p {
    public C9763k(C9622e c9622e) {
        super(c9622e);
    }

    /* renamed from: q */
    private void m29278q(C9758f c9758f) {
        this.f24066h.f24025k.add(c9758f);
        c9758f.f24026l.add(this.f24066h);
    }

    @Override // p260o0.AbstractC9768p, p260o0.InterfaceC9756d
    /* renamed from: a */
    public void mo29241a(InterfaceC9756d interfaceC9756d) {
        C9618a c9618a = (C9618a) this.f24060b;
        int m28631s1 = c9618a.m28631s1();
        Iterator<C9758f> it = this.f24066h.f24026l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f24021g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (m28631s1 == 0 || m28631s1 == 2) {
            this.f24066h.mo29263d(i11 + c9618a.m28632t1());
        } else {
            this.f24066h.mo29263d(i10 + c9618a.m28632t1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: d */
    public void mo29242d() {
        AbstractC9768p abstractC9768p;
        C9622e c9622e = this.f24060b;
        if (c9622e instanceof C9618a) {
            this.f24066h.f24016b = true;
            C9618a c9618a = (C9618a) c9622e;
            int m28631s1 = c9618a.m28631s1();
            boolean m28630r1 = c9618a.m28630r1();
            int i10 = 0;
            if (m28631s1 == 0) {
                this.f24066h.f24019e = C9758f.a.LEFT;
                while (i10 < c9618a.f23583M0) {
                    C9622e c9622e2 = c9618a.f23582L0[i10];
                    if (m28630r1 || c9622e2.m28706T() != 8) {
                        C9758f c9758f = c9622e2.f23497e.f24066h;
                        c9758f.f24025k.add(this.f24066h);
                        this.f24066h.f24026l.add(c9758f);
                    }
                    i10++;
                }
            } else {
                if (m28631s1 != 1) {
                    if (m28631s1 == 2) {
                        this.f24066h.f24019e = C9758f.a.TOP;
                        while (i10 < c9618a.f23583M0) {
                            C9622e c9622e3 = c9618a.f23582L0[i10];
                            if (m28630r1 || c9622e3.m28706T() != 8) {
                                C9758f c9758f2 = c9622e3.f23499f.f24066h;
                                c9758f2.f24025k.add(this.f24066h);
                                this.f24066h.f24026l.add(c9758f2);
                            }
                            i10++;
                        }
                    } else {
                        if (m28631s1 != 3) {
                            return;
                        }
                        this.f24066h.f24019e = C9758f.a.BOTTOM;
                        while (i10 < c9618a.f23583M0) {
                            C9622e c9622e4 = c9618a.f23582L0[i10];
                            if (m28630r1 || c9622e4.m28706T() != 8) {
                                C9758f c9758f3 = c9622e4.f23499f.f24067i;
                                c9758f3.f24025k.add(this.f24066h);
                                this.f24066h.f24026l.add(c9758f3);
                            }
                            i10++;
                        }
                    }
                    m29278q(this.f24060b.f23499f.f24066h);
                    abstractC9768p = this.f24060b.f23499f;
                    m29278q(abstractC9768p.f24067i);
                }
                this.f24066h.f24019e = C9758f.a.RIGHT;
                while (i10 < c9618a.f23583M0) {
                    C9622e c9622e5 = c9618a.f23582L0[i10];
                    if (m28630r1 || c9622e5.m28706T() != 8) {
                        C9758f c9758f4 = c9622e5.f23497e.f24067i;
                        c9758f4.f24025k.add(this.f24066h);
                        this.f24066h.f24026l.add(c9758f4);
                    }
                    i10++;
                }
            }
            m29278q(this.f24060b.f23497e.f24066h);
            abstractC9768p = this.f24060b.f23497e;
            m29278q(abstractC9768p.f24067i);
        }
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: e */
    public void mo29243e() {
        C9622e c9622e = this.f24060b;
        if (c9622e instanceof C9618a) {
            int m28631s1 = ((C9618a) c9622e).m28631s1();
            if (m28631s1 == 0 || m28631s1 == 1) {
                this.f24060b.m28741j1(this.f24066h.f24021g);
            } else {
                this.f24060b.m28744k1(this.f24066h.f24021g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: f */
    public void mo29244f() {
        this.f24061c = null;
        this.f24066h.m29262c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: m */
    public boolean mo29246m() {
        return false;
    }
}
