package p260o0;

import java.util.List;
import p243n0.C9621d;
import p243n0.C9622e;
import p243n0.InterfaceC9625h;
import p260o0.AbstractC9768p;
import p260o0.C9758f;

/* renamed from: o0.l */
/* loaded from: classes.dex */
public class C9764l extends AbstractC9768p {

    /* renamed from: k */
    private static int[] f24031k = new int[2];

    /* renamed from: o0.l$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24032a;

        static {
            int[] iArr = new int[AbstractC9768p.b.values().length];
            f24032a = iArr;
            try {
                iArr[AbstractC9768p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24032a[AbstractC9768p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24032a[AbstractC9768p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C9764l(C9622e c9622e) {
        super(c9622e);
        this.f24066h.f24019e = C9758f.a.LEFT;
        this.f24067i.f24019e = C9758f.a.RIGHT;
        this.f24064f = 0;
    }

    /* renamed from: q */
    private void m29279q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0296, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // p260o0.AbstractC9768p, p260o0.InterfaceC9756d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo29241a(p260o0.InterfaceC9756d r17) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9764l.mo29241a(o0.d):void");
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: d */
    void mo29242d() {
        C9622e m28686I;
        C9758f c9758f;
        C9758f c9758f2;
        int m28710V;
        C9758f c9758f3;
        C9621d c9621d;
        List<InterfaceC9756d> list;
        InterfaceC9756d interfaceC9756d;
        C9758f c9758f4;
        C9758f c9758f5;
        C9758f c9758f6;
        int m28710V2;
        C9758f c9758f7;
        C9758f c9758f8;
        int i10;
        C9622e m28686I2;
        C9622e c9622e = this.f24060b;
        if (c9622e.f23489a) {
            this.f24063e.mo29263d(c9622e.m28708U());
        }
        if (this.f24063e.f24024j) {
            C9622e.b bVar = this.f24062d;
            C9622e.b bVar2 = C9622e.b.MATCH_PARENT;
            if (bVar == bVar2 && (m28686I = this.f24060b.m28686I()) != null && (m28686I.m28769y() == C9622e.b.FIXED || m28686I.m28769y() == bVar2)) {
                m29297b(this.f24066h, m28686I.f23497e.f24066h, this.f24060b.f23477O.m28647e());
                m29297b(this.f24067i, m28686I.f23497e.f24067i, -this.f24060b.f23479Q.m28647e());
                return;
            }
        } else {
            C9622e.b m28769y = this.f24060b.m28769y();
            this.f24062d = m28769y;
            if (m28769y != C9622e.b.MATCH_CONSTRAINT) {
                C9622e.b bVar3 = C9622e.b.MATCH_PARENT;
                if (m28769y == bVar3 && (m28686I2 = this.f24060b.m28686I()) != null && (m28686I2.m28769y() == C9622e.b.FIXED || m28686I2.m28769y() == bVar3)) {
                    int m28708U = (m28686I2.m28708U() - this.f24060b.f23477O.m28647e()) - this.f24060b.f23479Q.m28647e();
                    m29297b(this.f24066h, m28686I2.f23497e.f24066h, this.f24060b.f23477O.m28647e());
                    m29297b(this.f24067i, m28686I2.f23497e.f24067i, -this.f24060b.f23479Q.m28647e());
                    this.f24063e.mo29263d(m28708U);
                    return;
                }
                if (this.f24062d == C9622e.b.FIXED) {
                    this.f24063e.mo29263d(this.f24060b.m28708U());
                }
            }
        }
        C9759g c9759g = this.f24063e;
        if (c9759g.f24024j) {
            C9622e c9622e2 = this.f24060b;
            if (c9622e2.f23489a) {
                C9621d[] c9621dArr = c9622e2.f23485W;
                C9621d c9621d2 = c9621dArr[0];
                C9621d c9621d3 = c9621d2.f23447f;
                if (c9621d3 != null && c9621dArr[1].f23447f != null) {
                    if (c9622e2.m28733g0()) {
                        this.f24066h.f24020f = this.f24060b.f23485W[0].m28647e();
                        c9758f3 = this.f24067i;
                        c9621d = this.f24060b.f23485W[1];
                        c9758f3.f24020f = -c9621d.m28647e();
                        return;
                    }
                    C9758f m29300h = m29300h(this.f24060b.f23485W[0]);
                    if (m29300h != null) {
                        m29297b(this.f24066h, m29300h, this.f24060b.f23485W[0].m28647e());
                    }
                    C9758f m29300h2 = m29300h(this.f24060b.f23485W[1]);
                    if (m29300h2 != null) {
                        m29297b(this.f24067i, m29300h2, -this.f24060b.f23485W[1].m28647e());
                    }
                    this.f24066h.f24016b = true;
                    this.f24067i.f24016b = true;
                    return;
                }
                if (c9621d3 != null) {
                    c9758f5 = m29300h(c9621d2);
                    if (c9758f5 == null) {
                        return;
                    }
                    c9758f6 = this.f24066h;
                    m28710V2 = this.f24060b.f23485W[0].m28647e();
                } else {
                    C9621d c9621d4 = c9621dArr[1];
                    if (c9621d4.f23447f != null) {
                        C9758f m29300h3 = m29300h(c9621d4);
                        if (m29300h3 != null) {
                            m29297b(this.f24067i, m29300h3, -this.f24060b.f23485W[1].m28647e());
                            c9758f7 = this.f24066h;
                            c9758f8 = this.f24067i;
                            i10 = -this.f24063e.f24021g;
                            m29297b(c9758f7, c9758f8, i10);
                            return;
                        }
                        return;
                    }
                    if ((c9622e2 instanceof InterfaceC9625h) || c9622e2.m28686I() == null || this.f24060b.mo28747m(C9621d.b.CENTER).f23447f != null) {
                        return;
                    }
                    c9758f5 = this.f24060b.m28686I().f23497e.f24066h;
                    c9758f6 = this.f24066h;
                    m28710V2 = this.f24060b.m28710V();
                }
                m29297b(c9758f6, c9758f5, m28710V2);
                c9758f7 = this.f24067i;
                c9758f8 = this.f24066h;
                i10 = this.f24063e.f24021g;
                m29297b(c9758f7, c9758f8, i10);
                return;
            }
        }
        if (this.f24062d == C9622e.b.MATCH_CONSTRAINT) {
            C9622e c9622e3 = this.f24060b;
            int i11 = c9622e3.f23533w;
            if (i11 == 2) {
                C9622e m28686I3 = c9622e3.m28686I();
                if (m28686I3 != null) {
                    C9759g c9759g2 = m28686I3.f23499f.f24063e;
                    this.f24063e.f24026l.add(c9759g2);
                    c9759g2.f24025k.add(this.f24063e);
                    C9759g c9759g3 = this.f24063e;
                    c9759g3.f24016b = true;
                    c9759g3.f24025k.add(this.f24066h);
                    list = this.f24063e.f24025k;
                    interfaceC9756d = this.f24067i;
                    list.add(interfaceC9756d);
                }
            } else if (i11 == 3) {
                if (c9622e3.f23535x == 3) {
                    this.f24066h.f24015a = this;
                    this.f24067i.f24015a = this;
                    C9766n c9766n = c9622e3.f23499f;
                    c9766n.f24066h.f24015a = this;
                    c9766n.f24067i.f24015a = this;
                    c9759g.f24015a = this;
                    if (c9622e3.m28737i0()) {
                        this.f24063e.f24026l.add(this.f24060b.f23499f.f24063e);
                        this.f24060b.f23499f.f24063e.f24025k.add(this.f24063e);
                        C9766n c9766n2 = this.f24060b.f23499f;
                        c9766n2.f24063e.f24015a = this;
                        this.f24063e.f24026l.add(c9766n2.f24066h);
                        this.f24063e.f24026l.add(this.f24060b.f23499f.f24067i);
                        this.f24060b.f23499f.f24066h.f24025k.add(this.f24063e);
                        list = this.f24060b.f23499f.f24067i.f24025k;
                        interfaceC9756d = this.f24063e;
                        list.add(interfaceC9756d);
                    } else if (this.f24060b.m28733g0()) {
                        this.f24060b.f23499f.f24063e.f24026l.add(this.f24063e);
                        list = this.f24063e.f24025k;
                        interfaceC9756d = this.f24060b.f23499f.f24063e;
                        list.add(interfaceC9756d);
                    } else {
                        c9758f4 = this.f24060b.f23499f.f24063e;
                    }
                } else {
                    C9759g c9759g4 = c9622e3.f23499f.f24063e;
                    c9759g.f24026l.add(c9759g4);
                    c9759g4.f24025k.add(this.f24063e);
                    this.f24060b.f23499f.f24066h.f24025k.add(this.f24063e);
                    this.f24060b.f23499f.f24067i.f24025k.add(this.f24063e);
                    C9759g c9759g5 = this.f24063e;
                    c9759g5.f24016b = true;
                    c9759g5.f24025k.add(this.f24066h);
                    this.f24063e.f24025k.add(this.f24067i);
                    this.f24066h.f24026l.add(this.f24063e);
                    c9758f4 = this.f24067i;
                }
                list = c9758f4.f24026l;
                interfaceC9756d = this.f24063e;
                list.add(interfaceC9756d);
            }
            c9758f3.f24020f = -c9621d.m28647e();
            return;
        }
        C9622e c9622e4 = this.f24060b;
        C9621d[] c9621dArr2 = c9622e4.f23485W;
        C9621d c9621d5 = c9621dArr2[0];
        C9621d c9621d6 = c9621d5.f23447f;
        if (c9621d6 != null && c9621dArr2[1].f23447f != null) {
            if (c9622e4.m28733g0()) {
                this.f24066h.f24020f = this.f24060b.f23485W[0].m28647e();
                c9758f3 = this.f24067i;
                c9621d = this.f24060b.f23485W[1];
                c9758f3.f24020f = -c9621d.m28647e();
                return;
            }
            C9758f m29300h4 = m29300h(this.f24060b.f23485W[0]);
            C9758f m29300h5 = m29300h(this.f24060b.f23485W[1]);
            if (m29300h4 != null) {
                m29300h4.m29261b(this);
            }
            if (m29300h5 != null) {
                m29300h5.m29261b(this);
            }
            this.f24068j = AbstractC9768p.b.CENTER;
            return;
        }
        if (c9621d6 != null) {
            c9758f = m29300h(c9621d5);
            if (c9758f == null) {
                return;
            }
            c9758f2 = this.f24066h;
            m28710V = this.f24060b.f23485W[0].m28647e();
        } else {
            C9621d c9621d7 = c9621dArr2[1];
            if (c9621d7.f23447f != null) {
                C9758f m29300h6 = m29300h(c9621d7);
                if (m29300h6 != null) {
                    m29297b(this.f24067i, m29300h6, -this.f24060b.f23485W[1].m28647e());
                    m29298c(this.f24066h, this.f24067i, -1, this.f24063e);
                    return;
                }
                return;
            }
            if ((c9622e4 instanceof InterfaceC9625h) || c9622e4.m28686I() == null) {
                return;
            }
            c9758f = this.f24060b.m28686I().f23497e.f24066h;
            c9758f2 = this.f24066h;
            m28710V = this.f24060b.m28710V();
        }
        m29297b(c9758f2, c9758f, m28710V);
        m29298c(this.f24067i, this.f24066h, 1, this.f24063e);
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: e */
    public void mo29243e() {
        C9758f c9758f = this.f24066h;
        if (c9758f.f24024j) {
            this.f24060b.m28741j1(c9758f.f24021g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: f */
    public void mo29244f() {
        this.f24061c = null;
        this.f24066h.m29262c();
        this.f24067i.m29262c();
        this.f24063e.m29262c();
        this.f24065g = false;
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: m */
    boolean mo29246m() {
        return this.f24062d != C9622e.b.MATCH_CONSTRAINT || this.f24060b.f23533w == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m29280r() {
        this.f24065g = false;
        this.f24066h.m29262c();
        this.f24066h.f24024j = false;
        this.f24067i.m29262c();
        this.f24067i.f24024j = false;
        this.f24063e.f24024j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f24060b.m28758r();
    }
}
