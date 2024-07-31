package p260o0;

import p243n0.C9621d;
import p243n0.C9622e;

/* renamed from: o0.p */
/* loaded from: classes.dex */
public abstract class AbstractC9768p implements InterfaceC9756d {

    /* renamed from: a */
    public int f24059a;

    /* renamed from: b */
    C9622e f24060b;

    /* renamed from: c */
    C9765m f24061c;

    /* renamed from: d */
    protected C9622e.b f24062d;

    /* renamed from: e */
    C9759g f24063e = new C9759g(this);

    /* renamed from: f */
    public int f24064f = 0;

    /* renamed from: g */
    boolean f24065g = false;

    /* renamed from: h */
    public C9758f f24066h = new C9758f(this);

    /* renamed from: i */
    public C9758f f24067i = new C9758f(this);

    /* renamed from: j */
    protected b f24068j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.p$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24069a;

        static {
            int[] iArr = new int[C9621d.b.values().length];
            f24069a = iArr;
            try {
                iArr[C9621d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24069a[C9621d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24069a[C9621d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24069a[C9621d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24069a[C9621d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o0.p$b */
    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC9768p(C9622e c9622e) {
        this.f24060b = c9622e;
    }

    /* renamed from: l */
    private void m29296l(int i10, int i11) {
        C9759g c9759g;
        int m29299g;
        int i12 = this.f24059a;
        if (i12 != 0) {
            if (i12 == 1) {
                int m29299g2 = m29299g(this.f24063e.f24027m, i10);
                c9759g = this.f24063e;
                m29299g = Math.min(m29299g2, i11);
                c9759g.mo29263d(m29299g);
            }
            if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                C9622e c9622e = this.f24060b;
                AbstractC9768p abstractC9768p = c9622e.f23497e;
                C9622e.b bVar = abstractC9768p.f24062d;
                C9622e.b bVar2 = C9622e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && abstractC9768p.f24059a == 3) {
                    C9766n c9766n = c9622e.f23499f;
                    if (c9766n.f24062d == bVar2 && c9766n.f24059a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    abstractC9768p = c9622e.f23499f;
                }
                if (abstractC9768p.f24063e.f24024j) {
                    float m28762t = c9622e.m28762t();
                    this.f24063e.mo29263d(i10 == 1 ? (int) ((abstractC9768p.f24063e.f24021g / m28762t) + 0.5f) : (int) ((m28762t * abstractC9768p.f24063e.f24021g) + 0.5f));
                    return;
                }
                return;
            }
            C9622e m28686I = this.f24060b.m28686I();
            if (m28686I == null) {
                return;
            }
            if (!(i10 == 0 ? m28686I.f23497e : m28686I.f23499f).f24063e.f24024j) {
                return;
            }
            C9622e c9622e2 = this.f24060b;
            i11 = (int) ((r9.f24021g * (i10 == 0 ? c9622e2.f23455B : c9622e2.f23461E)) + 0.5f);
        }
        c9759g = this.f24063e;
        m29299g = m29299g(i11, i10);
        c9759g.mo29263d(m29299g);
    }

    @Override // p260o0.InterfaceC9756d
    /* renamed from: a */
    public void mo29241a(InterfaceC9756d interfaceC9756d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m29297b(C9758f c9758f, C9758f c9758f2, int i10) {
        c9758f.f24026l.add(c9758f2);
        c9758f.f24020f = i10;
        c9758f2.f24025k.add(c9758f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m29298c(C9758f c9758f, C9758f c9758f2, int i10, C9759g c9759g) {
        c9758f.f24026l.add(c9758f2);
        c9758f.f24026l.add(this.f24063e);
        c9758f.f24022h = i10;
        c9758f.f24023i = c9759g;
        c9758f2.f24025k.add(c9758f);
        c9759g.f24025k.add(c9758f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo29242d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo29243e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo29244f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int m29299g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            C9622e c9622e = this.f24060b;
            int i12 = c9622e.f23453A;
            max = Math.max(c9622e.f23539z, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            C9622e c9622e2 = this.f24060b;
            int i13 = c9622e2.f23459D;
            max = Math.max(c9622e2.f23457C, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C9758f m29300h(C9621d c9621d) {
        AbstractC9768p abstractC9768p;
        AbstractC9768p abstractC9768p2;
        C9621d c9621d2 = c9621d.f23447f;
        if (c9621d2 == null) {
            return null;
        }
        C9622e c9622e = c9621d2.f23445d;
        int i10 = a.f24069a[c9621d2.f23446e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                abstractC9768p2 = c9622e.f23497e;
            } else if (i10 == 3) {
                abstractC9768p = c9622e.f23499f;
            } else {
                if (i10 == 4) {
                    return c9622e.f23499f.f24041k;
                }
                if (i10 != 5) {
                    return null;
                }
                abstractC9768p2 = c9622e.f23499f;
            }
            return abstractC9768p2.f24067i;
        }
        abstractC9768p = c9622e.f23497e;
        return abstractC9768p.f24066h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C9758f m29301i(C9621d c9621d, int i10) {
        C9621d c9621d2 = c9621d.f23447f;
        if (c9621d2 == null) {
            return null;
        }
        C9622e c9622e = c9621d2.f23445d;
        AbstractC9768p abstractC9768p = i10 == 0 ? c9622e.f23497e : c9622e.f23499f;
        int i11 = a.f24069a[c9621d2.f23446e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return abstractC9768p.f24067i;
        }
        return abstractC9768p.f24066h;
    }

    /* renamed from: j */
    public long mo29245j() {
        if (this.f24063e.f24024j) {
            return r0.f24021g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m29302k() {
        return this.f24065g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo29246m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m29303n(InterfaceC9756d interfaceC9756d, C9621d c9621d, C9621d c9621d2, int i10) {
        C9758f c9758f;
        C9758f m29300h = m29300h(c9621d);
        C9758f m29300h2 = m29300h(c9621d2);
        if (m29300h.f24024j && m29300h2.f24024j) {
            int m28647e = m29300h.f24021g + c9621d.m28647e();
            int m28647e2 = m29300h2.f24021g - c9621d2.m28647e();
            int i11 = m28647e2 - m28647e;
            if (!this.f24063e.f24024j && this.f24062d == C9622e.b.MATCH_CONSTRAINT) {
                m29296l(i10, i11);
            }
            C9759g c9759g = this.f24063e;
            if (c9759g.f24024j) {
                if (c9759g.f24021g == i11) {
                    this.f24066h.mo29263d(m28647e);
                    c9758f = this.f24067i;
                } else {
                    C9622e c9622e = this.f24060b;
                    float m28766w = i10 == 0 ? c9622e.m28766w() : c9622e.m28698P();
                    if (m29300h == m29300h2) {
                        m28647e = m29300h.f24021g;
                        m28647e2 = m29300h2.f24021g;
                        m28766w = 0.5f;
                    }
                    this.f24066h.mo29263d((int) (m28647e + 0.5f + (((m28647e2 - m28647e) - this.f24063e.f24021g) * m28766w)));
                    c9758f = this.f24067i;
                    m28647e2 = this.f24066h.f24021g + this.f24063e.f24021g;
                }
                c9758f.mo29263d(m28647e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m29304o(InterfaceC9756d interfaceC9756d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m29305p(InterfaceC9756d interfaceC9756d) {
    }
}
