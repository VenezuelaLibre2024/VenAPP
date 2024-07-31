package p260o0;

import p243n0.C9622e;
import p260o0.AbstractC9768p;
import p260o0.C9758f;

/* renamed from: o0.n */
/* loaded from: classes.dex */
public class C9766n extends AbstractC9768p {

    /* renamed from: k */
    public C9758f f24041k;

    /* renamed from: l */
    C9759g f24042l;

    /* renamed from: o0.n$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24043a;

        static {
            int[] iArr = new int[AbstractC9768p.b.values().length];
            f24043a = iArr;
            try {
                iArr[AbstractC9768p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24043a[AbstractC9768p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24043a[AbstractC9768p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C9766n(C9622e c9622e) {
        super(c9622e);
        C9758f c9758f = new C9758f(this);
        this.f24041k = c9758f;
        this.f24042l = null;
        this.f24066h.f24019e = C9758f.a.TOP;
        this.f24067i.f24019e = C9758f.a.BOTTOM;
        c9758f.f24019e = C9758f.a.BASELINE;
        this.f24064f = 1;
    }

    @Override // p260o0.AbstractC9768p, p260o0.InterfaceC9756d
    /* renamed from: a */
    public void mo29241a(InterfaceC9756d interfaceC9756d) {
        int i10;
        float m28762t;
        int i11 = a.f24043a[this.f24068j.ordinal()];
        if (i11 == 1) {
            m29305p(interfaceC9756d);
        } else if (i11 == 2) {
            m29304o(interfaceC9756d);
        } else if (i11 == 3) {
            C9622e c9622e = this.f24060b;
            m29303n(interfaceC9756d, c9622e.f23478P, c9622e.f23480R, 1);
            return;
        }
        C9759g c9759g = this.f24063e;
        if (c9759g.f24017c && !c9759g.f24024j && this.f24062d == C9622e.b.MATCH_CONSTRAINT) {
            C9622e c9622e2 = this.f24060b;
            int i12 = c9622e2.f23535x;
            if (i12 == 2) {
                C9622e m28686I = c9622e2.m28686I();
                if (m28686I != null) {
                    if (m28686I.f23499f.f24063e.f24024j) {
                        i10 = (int) ((r7.f24021g * this.f24060b.f23461E) + 0.5f);
                        this.f24063e.mo29263d(i10);
                    }
                }
            } else if (i12 == 3 && c9622e2.f23497e.f24063e.f24024j) {
                int m28764u = c9622e2.m28764u();
                if (m28764u != -1) {
                    if (m28764u == 0) {
                        m28762t = r7.f23497e.f24063e.f24021g * this.f24060b.m28762t();
                        i10 = (int) (m28762t + 0.5f);
                        this.f24063e.mo29263d(i10);
                    } else if (m28764u != 1) {
                        i10 = 0;
                        this.f24063e.mo29263d(i10);
                    }
                }
                m28762t = r7.f23497e.f24063e.f24021g / this.f24060b.m28762t();
                i10 = (int) (m28762t + 0.5f);
                this.f24063e.mo29263d(i10);
            }
        }
        C9758f c9758f = this.f24066h;
        if (c9758f.f24017c) {
            C9758f c9758f2 = this.f24067i;
            if (c9758f2.f24017c) {
                if (c9758f.f24024j && c9758f2.f24024j && this.f24063e.f24024j) {
                    return;
                }
                if (!this.f24063e.f24024j && this.f24062d == C9622e.b.MATCH_CONSTRAINT) {
                    C9622e c9622e3 = this.f24060b;
                    if (c9622e3.f23533w == 0 && !c9622e3.m28737i0()) {
                        C9758f c9758f3 = this.f24066h.f24026l.get(0);
                        C9758f c9758f4 = this.f24067i.f24026l.get(0);
                        int i13 = c9758f3.f24021g;
                        C9758f c9758f5 = this.f24066h;
                        int i14 = i13 + c9758f5.f24020f;
                        int i15 = c9758f4.f24021g + this.f24067i.f24020f;
                        c9758f5.mo29263d(i14);
                        this.f24067i.mo29263d(i15);
                        this.f24063e.mo29263d(i15 - i14);
                        return;
                    }
                }
                if (!this.f24063e.f24024j && this.f24062d == C9622e.b.MATCH_CONSTRAINT && this.f24059a == 1 && this.f24066h.f24026l.size() > 0 && this.f24067i.f24026l.size() > 0) {
                    C9758f c9758f6 = this.f24066h.f24026l.get(0);
                    int i16 = (this.f24067i.f24026l.get(0).f24021g + this.f24067i.f24020f) - (c9758f6.f24021g + this.f24066h.f24020f);
                    C9759g c9759g2 = this.f24063e;
                    int i17 = c9759g2.f24027m;
                    if (i16 < i17) {
                        c9759g2.mo29263d(i16);
                    } else {
                        c9759g2.mo29263d(i17);
                    }
                }
                if (this.f24063e.f24024j && this.f24066h.f24026l.size() > 0 && this.f24067i.f24026l.size() > 0) {
                    C9758f c9758f7 = this.f24066h.f24026l.get(0);
                    C9758f c9758f8 = this.f24067i.f24026l.get(0);
                    int i18 = c9758f7.f24021g + this.f24066h.f24020f;
                    int i19 = c9758f8.f24021g + this.f24067i.f24020f;
                    float m28698P = this.f24060b.m28698P();
                    if (c9758f7 == c9758f8) {
                        i18 = c9758f7.f24021g;
                        i19 = c9758f8.f24021g;
                        m28698P = 0.5f;
                    }
                    this.f24066h.mo29263d((int) (i18 + 0.5f + (((i19 - i18) - this.f24063e.f24021g) * m28698P)));
                    this.f24067i.mo29263d(this.f24066h.f24021g + this.f24063e.f24021g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02dd, code lost:
    
        if (r10.f24060b.m28714X() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02df, code lost:
    
        r0 = r10.f24041k;
        r1 = r10.f24066h;
        r2 = r10.f24042l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0332, code lost:
    
        if (r0.f24062d == r1) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d9, code lost:
    
        r0.f24063e.f24025k.add(r10.f24063e);
        r10.f24063e.f24026l.add(r10.f24060b.f23497e.f24063e);
        r10.f24063e.f24015a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0362, code lost:
    
        if (r10.f24060b.m28714X() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d7, code lost:
    
        if (r0.f24062d == r1) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // p260o0.AbstractC9768p
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo29242d() {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9766n.mo29242d():void");
    }

    @Override // p260o0.AbstractC9768p
    /* renamed from: e */
    public void mo29243e() {
        C9758f c9758f = this.f24066h;
        if (c9758f.f24024j) {
            this.f24060b.m28744k1(c9758f.f24021g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: f */
    public void mo29244f() {
        this.f24061c = null;
        this.f24066h.m29262c();
        this.f24067i.m29262c();
        this.f24041k.m29262c();
        this.f24063e.m29262c();
        this.f24065g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p260o0.AbstractC9768p
    /* renamed from: m */
    public boolean mo29246m() {
        return this.f24062d != C9622e.b.MATCH_CONSTRAINT || this.f24060b.f23535x == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m29285q() {
        this.f24065g = false;
        this.f24066h.m29262c();
        this.f24066h.f24024j = false;
        this.f24067i.m29262c();
        this.f24067i.f24024j = false;
        this.f24041k.m29262c();
        this.f24041k.f24024j = false;
        this.f24063e.f24024j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f24060b.m28758r();
    }
}
