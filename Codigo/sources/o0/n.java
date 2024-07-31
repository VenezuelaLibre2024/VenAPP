package o0;

import n0.e;
import o0.f;
import o0.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k */
    public f f22108k;

    /* renamed from: l */
    g f22109l;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22110a;

        static {
            int[] iArr = new int[p.b.values().length];
            f22110a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22110a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22110a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(n0.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f22108k = fVar;
        this.f22109l = null;
        this.f22133h.f22086e = f.a.TOP;
        this.f22134i.f22086e = f.a.BOTTOM;
        fVar.f22086e = f.a.BASELINE;
        this.f22131f = 1;
    }

    @Override // o0.p, o0.d
    public void a(d dVar) {
        int i10;
        float t10;
        int i11 = a.f22110a[this.f22135j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            n0.e eVar = this.f22127b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f22130e;
        if (gVar.f22084c && !gVar.f22091j && this.f22129d == e.b.MATCH_CONSTRAINT) {
            n0.e eVar2 = this.f22127b;
            int i12 = eVar2.f21640x;
            if (i12 == 2) {
                n0.e I = eVar2.I();
                if (I != null) {
                    if (I.f21604f.f22130e.f22091j) {
                        i10 = (int) ((r7.f22088g * this.f22127b.E) + 0.5f);
                        this.f22130e.d(i10);
                    }
                }
            } else if (i12 == 3 && eVar2.f21602e.f22130e.f22091j) {
                int u10 = eVar2.u();
                if (u10 != -1) {
                    if (u10 == 0) {
                        t10 = r7.f21602e.f22130e.f22088g * this.f22127b.t();
                        i10 = (int) (t10 + 0.5f);
                        this.f22130e.d(i10);
                    } else if (u10 != 1) {
                        i10 = 0;
                        this.f22130e.d(i10);
                    }
                }
                t10 = r7.f21602e.f22130e.f22088g / this.f22127b.t();
                i10 = (int) (t10 + 0.5f);
                this.f22130e.d(i10);
            }
        }
        f fVar = this.f22133h;
        if (fVar.f22084c) {
            f fVar2 = this.f22134i;
            if (fVar2.f22084c) {
                if (fVar.f22091j && fVar2.f22091j && this.f22130e.f22091j) {
                    return;
                }
                if (!this.f22130e.f22091j && this.f22129d == e.b.MATCH_CONSTRAINT) {
                    n0.e eVar3 = this.f22127b;
                    if (eVar3.f21638w == 0 && !eVar3.i0()) {
                        f fVar3 = this.f22133h.f22093l.get(0);
                        f fVar4 = this.f22134i.f22093l.get(0);
                        int i13 = fVar3.f22088g;
                        f fVar5 = this.f22133h;
                        int i14 = i13 + fVar5.f22087f;
                        int i15 = fVar4.f22088g + this.f22134i.f22087f;
                        fVar5.d(i14);
                        this.f22134i.d(i15);
                        this.f22130e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f22130e.f22091j && this.f22129d == e.b.MATCH_CONSTRAINT && this.f22126a == 1 && this.f22133h.f22093l.size() > 0 && this.f22134i.f22093l.size() > 0) {
                    f fVar6 = this.f22133h.f22093l.get(0);
                    int i16 = (this.f22134i.f22093l.get(0).f22088g + this.f22134i.f22087f) - (fVar6.f22088g + this.f22133h.f22087f);
                    g gVar2 = this.f22130e;
                    int i17 = gVar2.f22094m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f22130e.f22091j && this.f22133h.f22093l.size() > 0 && this.f22134i.f22093l.size() > 0) {
                    f fVar7 = this.f22133h.f22093l.get(0);
                    f fVar8 = this.f22134i.f22093l.get(0);
                    int i18 = fVar7.f22088g + this.f22133h.f22087f;
                    int i19 = fVar8.f22088g + this.f22134i.f22087f;
                    float P = this.f22127b.P();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f22088g;
                        i19 = fVar8.f22088g;
                        P = 0.5f;
                    }
                    this.f22133h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f22130e.f22088g) * P)));
                    this.f22134i.d(this.f22133h.f22088g + this.f22130e.f22088g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02dd, code lost:
    
        if (r10.f22127b.X() != false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02df, code lost:
    
        r0 = r10.f22108k;
        r1 = r10.f22133h;
        r2 = r10.f22109l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0332, code lost:
    
        if (r0.f22129d == r1) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d9, code lost:
    
        r0.f22130e.f22092k.add(r10.f22130e);
        r10.f22130e.f22093l.add(r10.f22127b.f21602e.f22130e);
        r10.f22130e.f22082a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0362, code lost:
    
        if (r10.f22127b.X() != false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d7, code lost:
    
        if (r0.f22129d == r1) goto L328;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // o0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.n.d():void");
    }

    @Override // o0.p
    public void e() {
        f fVar = this.f22133h;
        if (fVar.f22091j) {
            this.f22127b.k1(fVar.f22088g);
        }
    }

    @Override // o0.p
    public void f() {
        this.f22128c = null;
        this.f22133h.c();
        this.f22134i.c();
        this.f22108k.c();
        this.f22130e.c();
        this.f22132g = false;
    }

    @Override // o0.p
    public boolean m() {
        return this.f22129d != e.b.MATCH_CONSTRAINT || this.f22127b.f21640x == 0;
    }

    public void q() {
        this.f22132g = false;
        this.f22133h.c();
        this.f22133h.f22091j = false;
        this.f22134i.c();
        this.f22134i.f22091j = false;
        this.f22108k.c();
        this.f22108k.f22091j = false;
        this.f22130e.f22091j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f22127b.r();
    }
}
