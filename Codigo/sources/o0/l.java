package o0;

import java.util.List;
import n0.d;
import n0.e;
import o0.f;
import o0.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k */
    private static int[] f22098k = new int[2];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22099a;

        static {
            int[] iArr = new int[p.b.values().length];
            f22099a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22099a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22099a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(n0.e eVar) {
        super(eVar);
        this.f22133h.f22086e = f.a.LEFT;
        this.f22134i.f22086e = f.a.RIGHT;
        this.f22131f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
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
    
        if (r14 != 1) goto L322;
     */
    @Override // o0.p, o0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(o0.d r17) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l.a(o0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o0.p
    public void d() {
        n0.e I;
        f fVar;
        f fVar2;
        int V;
        f fVar3;
        n0.d dVar;
        List<d> list;
        d dVar2;
        f fVar4;
        f fVar5;
        f fVar6;
        int V2;
        f fVar7;
        f fVar8;
        int i10;
        n0.e I2;
        n0.e eVar = this.f22127b;
        if (eVar.f21594a) {
            this.f22130e.d(eVar.U());
        }
        if (this.f22130e.f22091j) {
            e.b bVar = this.f22129d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (I = this.f22127b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar2)) {
                b(this.f22133h, I.f21602e.f22133h, this.f22127b.O.e());
                b(this.f22134i, I.f21602e.f22134i, -this.f22127b.Q.e());
                return;
            }
        } else {
            e.b y10 = this.f22127b.y();
            this.f22129d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (y10 == bVar3 && (I2 = this.f22127b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar3)) {
                    int U = (I2.U() - this.f22127b.O.e()) - this.f22127b.Q.e();
                    b(this.f22133h, I2.f21602e.f22133h, this.f22127b.O.e());
                    b(this.f22134i, I2.f21602e.f22134i, -this.f22127b.Q.e());
                    this.f22130e.d(U);
                    return;
                }
                if (this.f22129d == e.b.FIXED) {
                    this.f22130e.d(this.f22127b.U());
                }
            }
        }
        g gVar = this.f22130e;
        if (gVar.f22091j) {
            n0.e eVar2 = this.f22127b;
            if (eVar2.f21594a) {
                n0.d[] dVarArr = eVar2.W;
                n0.d dVar3 = dVarArr[0];
                n0.d dVar4 = dVar3.f21589f;
                if (dVar4 != null && dVarArr[1].f21589f != null) {
                    if (eVar2.g0()) {
                        this.f22133h.f22087f = this.f22127b.W[0].e();
                        fVar3 = this.f22134i;
                        dVar = this.f22127b.W[1];
                        fVar3.f22087f = -dVar.e();
                        return;
                    }
                    f h10 = h(this.f22127b.W[0]);
                    if (h10 != null) {
                        b(this.f22133h, h10, this.f22127b.W[0].e());
                    }
                    f h11 = h(this.f22127b.W[1]);
                    if (h11 != null) {
                        b(this.f22134i, h11, -this.f22127b.W[1].e());
                    }
                    this.f22133h.f22083b = true;
                    this.f22134i.f22083b = true;
                    return;
                }
                if (dVar4 != null) {
                    fVar5 = h(dVar3);
                    if (fVar5 == null) {
                        return;
                    }
                    fVar6 = this.f22133h;
                    V2 = this.f22127b.W[0].e();
                } else {
                    n0.d dVar5 = dVarArr[1];
                    if (dVar5.f21589f != null) {
                        f h12 = h(dVar5);
                        if (h12 != null) {
                            b(this.f22134i, h12, -this.f22127b.W[1].e());
                            fVar7 = this.f22133h;
                            fVar8 = this.f22134i;
                            i10 = -this.f22130e.f22088g;
                            b(fVar7, fVar8, i10);
                            return;
                        }
                        return;
                    }
                    if ((eVar2 instanceof n0.h) || eVar2.I() == null || this.f22127b.m(d.b.CENTER).f21589f != null) {
                        return;
                    }
                    fVar5 = this.f22127b.I().f21602e.f22133h;
                    fVar6 = this.f22133h;
                    V2 = this.f22127b.V();
                }
                b(fVar6, fVar5, V2);
                fVar7 = this.f22134i;
                fVar8 = this.f22133h;
                i10 = this.f22130e.f22088g;
                b(fVar7, fVar8, i10);
                return;
            }
        }
        if (this.f22129d == e.b.MATCH_CONSTRAINT) {
            n0.e eVar3 = this.f22127b;
            int i11 = eVar3.f21638w;
            if (i11 == 2) {
                n0.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f21604f.f22130e;
                    this.f22130e.f22093l.add(gVar2);
                    gVar2.f22092k.add(this.f22130e);
                    g gVar3 = this.f22130e;
                    gVar3.f22083b = true;
                    gVar3.f22092k.add(this.f22133h);
                    list = this.f22130e.f22092k;
                    dVar2 = this.f22134i;
                    list.add(dVar2);
                }
            } else if (i11 == 3) {
                if (eVar3.f21640x == 3) {
                    this.f22133h.f22082a = this;
                    this.f22134i.f22082a = this;
                    n nVar = eVar3.f21604f;
                    nVar.f22133h.f22082a = this;
                    nVar.f22134i.f22082a = this;
                    gVar.f22082a = this;
                    if (eVar3.i0()) {
                        this.f22130e.f22093l.add(this.f22127b.f21604f.f22130e);
                        this.f22127b.f21604f.f22130e.f22092k.add(this.f22130e);
                        n nVar2 = this.f22127b.f21604f;
                        nVar2.f22130e.f22082a = this;
                        this.f22130e.f22093l.add(nVar2.f22133h);
                        this.f22130e.f22093l.add(this.f22127b.f21604f.f22134i);
                        this.f22127b.f21604f.f22133h.f22092k.add(this.f22130e);
                        list = this.f22127b.f21604f.f22134i.f22092k;
                        dVar2 = this.f22130e;
                        list.add(dVar2);
                    } else if (this.f22127b.g0()) {
                        this.f22127b.f21604f.f22130e.f22093l.add(this.f22130e);
                        list = this.f22130e.f22092k;
                        dVar2 = this.f22127b.f21604f.f22130e;
                        list.add(dVar2);
                    } else {
                        fVar4 = this.f22127b.f21604f.f22130e;
                    }
                } else {
                    g gVar4 = eVar3.f21604f.f22130e;
                    gVar.f22093l.add(gVar4);
                    gVar4.f22092k.add(this.f22130e);
                    this.f22127b.f21604f.f22133h.f22092k.add(this.f22130e);
                    this.f22127b.f21604f.f22134i.f22092k.add(this.f22130e);
                    g gVar5 = this.f22130e;
                    gVar5.f22083b = true;
                    gVar5.f22092k.add(this.f22133h);
                    this.f22130e.f22092k.add(this.f22134i);
                    this.f22133h.f22093l.add(this.f22130e);
                    fVar4 = this.f22134i;
                }
                list = fVar4.f22093l;
                dVar2 = this.f22130e;
                list.add(dVar2);
            }
            fVar3.f22087f = -dVar.e();
            return;
        }
        n0.e eVar4 = this.f22127b;
        n0.d[] dVarArr2 = eVar4.W;
        n0.d dVar6 = dVarArr2[0];
        n0.d dVar7 = dVar6.f21589f;
        if (dVar7 != null && dVarArr2[1].f21589f != null) {
            if (eVar4.g0()) {
                this.f22133h.f22087f = this.f22127b.W[0].e();
                fVar3 = this.f22134i;
                dVar = this.f22127b.W[1];
                fVar3.f22087f = -dVar.e();
                return;
            }
            f h13 = h(this.f22127b.W[0]);
            f h14 = h(this.f22127b.W[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.f22135j = p.b.CENTER;
            return;
        }
        if (dVar7 != null) {
            fVar = h(dVar6);
            if (fVar == null) {
                return;
            }
            fVar2 = this.f22133h;
            V = this.f22127b.W[0].e();
        } else {
            n0.d dVar8 = dVarArr2[1];
            if (dVar8.f21589f != null) {
                f h15 = h(dVar8);
                if (h15 != null) {
                    b(this.f22134i, h15, -this.f22127b.W[1].e());
                    c(this.f22133h, this.f22134i, -1, this.f22130e);
                    return;
                }
                return;
            }
            if ((eVar4 instanceof n0.h) || eVar4.I() == null) {
                return;
            }
            fVar = this.f22127b.I().f21602e.f22133h;
            fVar2 = this.f22133h;
            V = this.f22127b.V();
        }
        b(fVar2, fVar, V);
        c(this.f22134i, this.f22133h, 1, this.f22130e);
    }

    @Override // o0.p
    public void e() {
        f fVar = this.f22133h;
        if (fVar.f22091j) {
            this.f22127b.j1(fVar.f22088g);
        }
    }

    @Override // o0.p
    public void f() {
        this.f22128c = null;
        this.f22133h.c();
        this.f22134i.c();
        this.f22130e.c();
        this.f22132g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o0.p
    public boolean m() {
        return this.f22129d != e.b.MATCH_CONSTRAINT || this.f22127b.f21638w == 0;
    }

    public void r() {
        this.f22132g = false;
        this.f22133h.c();
        this.f22133h.f22091j = false;
        this.f22134i.c();
        this.f22134i.f22091j = false;
        this.f22130e.f22091j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f22127b.r();
    }
}
