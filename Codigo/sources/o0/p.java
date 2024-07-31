package o0;

import n0.d;
import n0.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a */
    public int f22126a;

    /* renamed from: b */
    n0.e f22127b;

    /* renamed from: c */
    m f22128c;

    /* renamed from: d */
    protected e.b f22129d;

    /* renamed from: e */
    g f22130e = new g(this);

    /* renamed from: f */
    public int f22131f = 0;

    /* renamed from: g */
    boolean f22132g = false;

    /* renamed from: h */
    public f f22133h = new f(this);

    /* renamed from: i */
    public f f22134i = new f(this);

    /* renamed from: j */
    protected b f22135j = b.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22136a;

        static {
            int[] iArr = new int[d.b.values().length];
            f22136a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22136a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22136a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22136a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22136a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(n0.e eVar) {
        this.f22127b = eVar;
    }

    private void l(int i10, int i11) {
        g gVar;
        int g10;
        int i12 = this.f22126a;
        if (i12 != 0) {
            if (i12 == 1) {
                int g11 = g(this.f22130e.f22094m, i10);
                gVar = this.f22130e;
                g10 = Math.min(g11, i11);
                gVar.d(g10);
            }
            if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                n0.e eVar = this.f22127b;
                p pVar = eVar.f21602e;
                e.b bVar = pVar.f22129d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f22126a == 3) {
                    n nVar = eVar.f21604f;
                    if (nVar.f22129d == bVar2 && nVar.f22126a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    pVar = eVar.f21604f;
                }
                if (pVar.f22130e.f22091j) {
                    float t10 = eVar.t();
                    this.f22130e.d(i10 == 1 ? (int) ((pVar.f22130e.f22088g / t10) + 0.5f) : (int) ((t10 * pVar.f22130e.f22088g) + 0.5f));
                    return;
                }
                return;
            }
            n0.e I = this.f22127b.I();
            if (I == null) {
                return;
            }
            if (!(i10 == 0 ? I.f21602e : I.f21604f).f22130e.f22091j) {
                return;
            }
            n0.e eVar2 = this.f22127b;
            i11 = (int) ((r9.f22088g * (i10 == 0 ? eVar2.B : eVar2.E)) + 0.5f);
        }
        gVar = this.f22130e;
        g10 = g(i11, i10);
        gVar.d(g10);
    }

    @Override // o0.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f22093l.add(fVar2);
        fVar.f22087f = i10;
        fVar2.f22092k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f22093l.add(fVar2);
        fVar.f22093l.add(this.f22130e);
        fVar.f22089h = i10;
        fVar.f22090i = gVar;
        fVar2.f22092k.add(fVar);
        gVar.f22092k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            n0.e eVar = this.f22127b;
            int i12 = eVar.A;
            max = Math.max(eVar.f21644z, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            n0.e eVar2 = this.f22127b;
            int i13 = eVar2.D;
            max = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public final f h(n0.d dVar) {
        p pVar;
        p pVar2;
        n0.d dVar2 = dVar.f21589f;
        if (dVar2 == null) {
            return null;
        }
        n0.e eVar = dVar2.f21587d;
        int i10 = a.f22136a[dVar2.f21588e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                pVar2 = eVar.f21602e;
            } else if (i10 == 3) {
                pVar = eVar.f21604f;
            } else {
                if (i10 == 4) {
                    return eVar.f21604f.f22108k;
                }
                if (i10 != 5) {
                    return null;
                }
                pVar2 = eVar.f21604f;
            }
            return pVar2.f22134i;
        }
        pVar = eVar.f21602e;
        return pVar.f22133h;
    }

    public final f i(n0.d dVar, int i10) {
        n0.d dVar2 = dVar.f21589f;
        if (dVar2 == null) {
            return null;
        }
        n0.e eVar = dVar2.f21587d;
        p pVar = i10 == 0 ? eVar.f21602e : eVar.f21604f;
        int i11 = a.f22136a[dVar2.f21588e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f22134i;
        }
        return pVar.f22133h;
    }

    public long j() {
        if (this.f22130e.f22091j) {
            return r0.f22088g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f22132g;
    }

    public abstract boolean m();

    public void n(d dVar, n0.d dVar2, n0.d dVar3, int i10) {
        f fVar;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f22091j && h11.f22091j) {
            int e10 = h10.f22088g + dVar2.e();
            int e11 = h11.f22088g - dVar3.e();
            int i11 = e11 - e10;
            if (!this.f22130e.f22091j && this.f22129d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f22130e;
            if (gVar.f22091j) {
                if (gVar.f22088g == i11) {
                    this.f22133h.d(e10);
                    fVar = this.f22134i;
                } else {
                    n0.e eVar = this.f22127b;
                    float w10 = i10 == 0 ? eVar.w() : eVar.P();
                    if (h10 == h11) {
                        e10 = h10.f22088g;
                        e11 = h11.f22088g;
                        w10 = 0.5f;
                    }
                    this.f22133h.d((int) (e10 + 0.5f + (((e11 - e10) - this.f22130e.f22088g) * w10)));
                    fVar = this.f22134i;
                    e11 = this.f22133h.f22088g + this.f22130e.f22088g;
                }
                fVar.d(e11);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
