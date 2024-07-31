package o0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import n0.d;
import n0.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final ArrayList<n0.e> f22055a = new ArrayList<>();

    /* renamed from: b */
    private a f22056b = new a();

    /* renamed from: c */
    private n0.f f22057c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k */
        public static int f22058k = 0;

        /* renamed from: l */
        public static int f22059l = 1;

        /* renamed from: m */
        public static int f22060m = 2;

        /* renamed from: a */
        public e.b f22061a;

        /* renamed from: b */
        public e.b f22062b;

        /* renamed from: c */
        public int f22063c;

        /* renamed from: d */
        public int f22064d;

        /* renamed from: e */
        public int f22065e;

        /* renamed from: f */
        public int f22066f;

        /* renamed from: g */
        public int f22067g;

        /* renamed from: h */
        public boolean f22068h;

        /* renamed from: i */
        public boolean f22069i;

        /* renamed from: j */
        public int f22070j;
    }

    /* renamed from: o0.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0362b {
        void a();

        void b(n0.e eVar, a aVar);
    }

    public b(n0.f fVar) {
        this.f22057c = fVar;
    }

    private boolean a(InterfaceC0362b interfaceC0362b, n0.e eVar, int i10) {
        this.f22056b.f22061a = eVar.y();
        this.f22056b.f22062b = eVar.R();
        this.f22056b.f22063c = eVar.U();
        this.f22056b.f22064d = eVar.v();
        a aVar = this.f22056b;
        aVar.f22069i = false;
        aVar.f22070j = i10;
        e.b bVar = aVar.f22061a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f22062b == bVar2;
        boolean z12 = z10 && eVar.f21601d0 > 0.0f;
        boolean z13 = z11 && eVar.f21601d0 > 0.0f;
        if (z12 && eVar.f21642y[0] == 4) {
            aVar.f22061a = e.b.FIXED;
        }
        if (z13 && eVar.f21642y[1] == 4) {
            aVar.f22062b = e.b.FIXED;
        }
        interfaceC0362b.b(eVar, aVar);
        eVar.h1(this.f22056b.f22065e);
        eVar.I0(this.f22056b.f22066f);
        eVar.H0(this.f22056b.f22068h);
        eVar.x0(this.f22056b.f22067g);
        a aVar2 = this.f22056b;
        aVar2.f22070j = a.f22058k;
        return aVar2.f22069i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.f21601d0 <= 0.0f) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(n0.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<n0.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            o0.b$b r2 = r13.F1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<n0.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            n0.e r5 = (n0.e) r5
            boolean r6 = r5 instanceof n0.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof n0.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            o0.l r6 = r5.f21602e
            if (r6 == 0) goto L47
            o0.n r7 = r5.f21604f
            if (r7 == 0) goto L47
            o0.g r6 = r6.f22130e
            boolean r6 = r6.f22091j
            if (r6 == 0) goto L47
            o0.g r6 = r7.f22130e
            boolean r6 = r6.f22091j
            if (r6 == 0) goto L47
            goto La0
        L47:
            n0.e$b r6 = r5.s(r3)
            r7 = 1
            n0.e$b r8 = r5.s(r7)
            n0.e$b r9 = n0.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f21638w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f21640x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof n0.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f21638w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f21640x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f21601d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = o0.b.a.f22058k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b.b(n0.f):void");
    }

    private void c(n0.f fVar, String str, int i10, int i11, int i12) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i11);
        fVar.I0(i12);
        fVar.X0(G);
        fVar.W0(F);
        this.f22057c.T1(i10);
        this.f22057c.p1();
    }

    public long d(n0.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        n0.f fVar2;
        int i20;
        boolean z11;
        int i21;
        int i22;
        boolean z12;
        b bVar = this;
        InterfaceC0362b F1 = fVar.F1();
        int size = fVar.L0.size();
        int U = fVar.U();
        int v10 = fVar.v();
        boolean b10 = n0.j.b(i10, RecognitionOptions.ITF);
        boolean z13 = b10 || n0.j.b(i10, 64);
        if (z13) {
            for (int i23 = 0; i23 < size; i23++) {
                n0.e eVar = fVar.L0.get(i23);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (y10 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z14) || ((eVar.i0() && z14) || (eVar instanceof n0.k) || eVar.g0() || eVar.i0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = k0.d.f20093r;
        }
        boolean z16 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        int i24 = 2;
        if (z16) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.U() != min) {
                fVar.h1(min);
                fVar.I1();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.I0(min2);
                fVar.I1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.C1(b10);
                i19 = 2;
            } else {
                boolean D1 = fVar.D1(b10);
                if (i13 == 1073741824) {
                    D1 &= fVar.E1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.E1(b10, 1) & D1;
                    i19++;
                } else {
                    z10 = D1;
                }
            }
            if (z10) {
                fVar.m1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int G1 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f22055a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, U, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z17 = y11 == bVar3;
            boolean z18 = fVar.R() == bVar3;
            int max = Math.max(fVar.U(), bVar.f22057c.G());
            int max2 = Math.max(fVar.v(), bVar.f22057c.F());
            int i25 = 0;
            boolean z19 = false;
            while (i25 < size2) {
                n0.e eVar2 = bVar.f22055a.get(i25);
                if (eVar2 instanceof n0.k) {
                    int U2 = eVar2.U();
                    int v11 = eVar2.v();
                    i22 = G1;
                    boolean a10 = bVar.a(F1, eVar2, a.f22059l) | z19;
                    int U3 = eVar2.U();
                    int v12 = eVar2.v();
                    if (U3 != U2) {
                        eVar2.h1(U3);
                        if (z17 && eVar2.K() > max) {
                            max = Math.max(max, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                        }
                        z12 = true;
                    } else {
                        z12 = a10;
                    }
                    if (v12 != v11) {
                        eVar2.I0(v12);
                        if (z18 && eVar2.p() > max2) {
                            max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                        }
                        z12 = true;
                    }
                    z19 = z12 | ((n0.k) eVar2).s1();
                } else {
                    i22 = G1;
                }
                i25++;
                G1 = i22;
                i24 = 2;
            }
            int i26 = G1;
            int i27 = i24;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    n0.e eVar3 = bVar.f22055a.get(i29);
                    if (((eVar3 instanceof n0.h) && !(eVar3 instanceof n0.k)) || (eVar3 instanceof n0.g) || eVar3.T() == 8 || ((z16 && eVar3.f21602e.f22130e.f22091j && eVar3.f21604f.f22130e.f22091j) || (eVar3 instanceof n0.k))) {
                        z11 = z16;
                        i21 = size2;
                    } else {
                        int U4 = eVar3.U();
                        int v13 = eVar3.v();
                        z11 = z16;
                        int n10 = eVar3.n();
                        int i30 = a.f22059l;
                        i21 = size2;
                        if (i28 == 1) {
                            i30 = a.f22060m;
                        }
                        boolean a11 = bVar.a(F1, eVar3, i30) | z19;
                        int U5 = eVar3.U();
                        int v14 = eVar3.v();
                        if (U5 != U4) {
                            eVar3.h1(U5);
                            if (z17 && eVar3.K() > max) {
                                max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                            }
                            a11 = true;
                        }
                        if (v14 != v13) {
                            eVar3.I0(v14);
                            if (z18 && eVar3.p() > max2) {
                                max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                            }
                            a11 = true;
                        }
                        z19 = (!eVar3.X() || n10 == eVar3.n()) ? a11 : true;
                    }
                    i29++;
                    bVar = this;
                    z16 = z11;
                    size2 = i21;
                }
                boolean z20 = z16;
                int i31 = size2;
                if (!z19) {
                    break;
                }
                i28++;
                c(fVar, "intermediate pass", i28, U, v10);
                bVar = this;
                z16 = z20;
                size2 = i31;
                i27 = 2;
                z19 = false;
            }
            fVar2 = fVar;
            i20 = i26;
        } else {
            fVar2 = fVar;
            i20 = G1;
        }
        fVar2.S1(i20);
        return 0L;
    }

    public void e(n0.f fVar) {
        this.f22055a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0.e eVar = fVar.L0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.R() == bVar) {
                this.f22055a.add(eVar);
            }
        }
        fVar.I1();
    }
}
