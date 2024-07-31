package p243n0;

import p190k0.C9102d;
import p190k0.C9107i;
import p243n0.C9621d;
import p243n0.C9622e;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public class C9618a extends C9626i {

    /* renamed from: N0 */
    private int f23416N0 = 0;

    /* renamed from: O0 */
    private boolean f23417O0 = true;

    /* renamed from: P0 */
    private int f23418P0 = 0;

    /* renamed from: Q0 */
    boolean f23419Q0 = false;

    @Override // p243n0.C9622e
    /* renamed from: g */
    public void mo28625g(C9102d c9102d, boolean z10) {
        C9621d[] c9621dArr;
        boolean z11;
        C9107i c9107i;
        C9621d c9621d;
        int i10;
        int i11;
        int i12;
        C9107i c9107i2;
        int i13;
        C9621d[] c9621dArr2 = this.f23485W;
        c9621dArr2[0] = this.f23477O;
        c9621dArr2[2] = this.f23478P;
        c9621dArr2[1] = this.f23479Q;
        c9621dArr2[3] = this.f23480R;
        int i14 = 0;
        while (true) {
            c9621dArr = this.f23485W;
            if (i14 >= c9621dArr.length) {
                break;
            }
            C9621d c9621d2 = c9621dArr[i14];
            c9621d2.f23450i = c9102d.m26792q(c9621d2);
            i14++;
        }
        int i15 = this.f23416N0;
        if (i15 < 0 || i15 >= 4) {
            return;
        }
        C9621d c9621d3 = c9621dArr[i15];
        if (!this.f23419Q0) {
            m28629q1();
        }
        if (this.f23419Q0) {
            this.f23419Q0 = false;
            int i16 = this.f23416N0;
            if (i16 == 0 || i16 == 1) {
                c9102d.m26783f(this.f23477O.f23450i, this.f23500f0);
                c9107i2 = this.f23479Q.f23450i;
                i13 = this.f23500f0;
            } else {
                if (i16 != 2 && i16 != 3) {
                    return;
                }
                c9102d.m26783f(this.f23478P.f23450i, this.f23502g0);
                c9107i2 = this.f23480R.f23450i;
                i13 = this.f23502g0;
            }
            c9102d.m26783f(c9107i2, i13);
            return;
        }
        for (int i17 = 0; i17 < this.f23583M0; i17++) {
            C9622e c9622e = this.f23582L0[i17];
            if ((this.f23417O0 || c9622e.mo28626h()) && ((((i11 = this.f23416N0) == 0 || i11 == 1) && c9622e.m28769y() == C9622e.b.MATCH_CONSTRAINT && c9622e.f23477O.f23447f != null && c9622e.f23479Q.f23447f != null) || (((i12 = this.f23416N0) == 2 || i12 == 3) && c9622e.m28702R() == C9622e.b.MATCH_CONSTRAINT && c9622e.f23478P.f23447f != null && c9622e.f23480R.f23447f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f23477O.m28653k() || this.f23479Q.m28653k();
        boolean z13 = this.f23478P.m28653k() || this.f23480R.m28653k();
        int i18 = !(!z11 && (((i10 = this.f23416N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i19 = 0; i19 < this.f23583M0; i19++) {
            C9622e c9622e2 = this.f23582L0[i19];
            if (this.f23417O0 || c9622e2.mo28626h()) {
                C9107i m26792q = c9102d.m26792q(c9622e2.f23485W[this.f23416N0]);
                C9621d[] c9621dArr3 = c9622e2.f23485W;
                int i20 = this.f23416N0;
                C9621d c9621d4 = c9621dArr3[i20];
                c9621d4.f23450i = m26792q;
                C9621d c9621d5 = c9621d4.f23447f;
                int i21 = (c9621d5 == null || c9621d5.f23445d != this) ? 0 : c9621d4.f23448g + 0;
                if (i20 == 0 || i20 == 2) {
                    c9102d.m26786i(c9621d3.f23450i, m26792q, this.f23418P0 - i21, z11);
                } else {
                    c9102d.m26784g(c9621d3.f23450i, m26792q, this.f23418P0 + i21, z11);
                }
                c9102d.m26782e(c9621d3.f23450i, m26792q, this.f23418P0 + i21, i18);
            }
        }
        int i22 = this.f23416N0;
        if (i22 == 0) {
            c9102d.m26782e(this.f23479Q.f23450i, this.f23477O.f23450i, 0, 8);
            c9102d.m26782e(this.f23477O.f23450i, this.f23490a0.f23479Q.f23450i, 0, 4);
            c9107i = this.f23477O.f23450i;
            c9621d = this.f23490a0.f23477O;
        } else if (i22 == 1) {
            c9102d.m26782e(this.f23477O.f23450i, this.f23479Q.f23450i, 0, 8);
            c9102d.m26782e(this.f23477O.f23450i, this.f23490a0.f23477O.f23450i, 0, 4);
            c9107i = this.f23477O.f23450i;
            c9621d = this.f23490a0.f23479Q;
        } else if (i22 == 2) {
            c9102d.m26782e(this.f23480R.f23450i, this.f23478P.f23450i, 0, 8);
            c9102d.m26782e(this.f23478P.f23450i, this.f23490a0.f23480R.f23450i, 0, 4);
            c9107i = this.f23478P.f23450i;
            c9621d = this.f23490a0.f23478P;
        } else {
            if (i22 != 3) {
                return;
            }
            c9102d.m26782e(this.f23478P.f23450i, this.f23480R.f23450i, 0, 8);
            c9102d.m26782e(this.f23478P.f23450i, this.f23490a0.f23478P.f23450i, 0, 4);
            c9107i = this.f23478P.f23450i;
            c9621d = this.f23490a0.f23480R;
        }
        c9102d.m26782e(c9107i, c9621d.f23450i, 0, 0);
    }

    @Override // p243n0.C9622e
    /* renamed from: h */
    public boolean mo28626h() {
        return true;
    }

    @Override // p243n0.C9622e
    /* renamed from: l0 */
    public boolean mo28627l0() {
        return this.f23419Q0;
    }

    @Override // p243n0.C9622e
    /* renamed from: m0 */
    public boolean mo28628m0() {
        return this.f23419Q0;
    }

    /* renamed from: q1 */
    public boolean m28629q1() {
        int i10;
        C9621d.b bVar;
        C9621d.b bVar2;
        C9621d.b bVar3;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f23583M0;
            if (i13 >= i10) {
                break;
            }
            C9622e c9622e = this.f23582L0[i13];
            if ((this.f23417O0 || c9622e.mo28626h()) && ((((i11 = this.f23416N0) == 0 || i11 == 1) && !c9622e.mo28627l0()) || (((i12 = this.f23416N0) == 2 || i12 == 3) && !c9622e.mo28628m0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f23583M0; i15++) {
            C9622e c9622e2 = this.f23582L0[i15];
            if (this.f23417O0 || c9622e2.mo28626h()) {
                if (!z11) {
                    int i16 = this.f23416N0;
                    if (i16 == 0) {
                        bVar3 = C9621d.b.LEFT;
                    } else if (i16 == 1) {
                        bVar3 = C9621d.b.RIGHT;
                    } else if (i16 == 2) {
                        bVar3 = C9621d.b.TOP;
                    } else {
                        if (i16 == 3) {
                            bVar3 = C9621d.b.BOTTOM;
                        }
                        z11 = true;
                    }
                    i14 = c9622e2.mo28747m(bVar3).m28646d();
                    z11 = true;
                }
                int i17 = this.f23416N0;
                if (i17 == 0) {
                    bVar2 = C9621d.b.LEFT;
                } else {
                    if (i17 == 1) {
                        bVar = C9621d.b.RIGHT;
                    } else if (i17 == 2) {
                        bVar2 = C9621d.b.TOP;
                    } else if (i17 == 3) {
                        bVar = C9621d.b.BOTTOM;
                    }
                    i14 = Math.max(i14, c9622e2.mo28747m(bVar).m28646d());
                }
                i14 = Math.min(i14, c9622e2.mo28747m(bVar2).m28646d());
            }
        }
        int i18 = i14 + this.f23418P0;
        int i19 = this.f23416N0;
        if (i19 == 0 || i19 == 1) {
            m28675C0(i18, i18);
        } else {
            m28681F0(i18, i18);
        }
        this.f23419Q0 = true;
        return true;
    }

    /* renamed from: r1 */
    public boolean m28630r1() {
        return this.f23417O0;
    }

    /* renamed from: s1 */
    public int m28631s1() {
        return this.f23416N0;
    }

    /* renamed from: t1 */
    public int m28632t1() {
        return this.f23418P0;
    }

    @Override // p243n0.C9622e
    public String toString() {
        String str = "[Barrier] " + m28758r() + " {";
        for (int i10 = 0; i10 < this.f23583M0; i10++) {
            C9622e c9622e = this.f23582L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + c9622e.m28758r();
        }
        return str + "}";
    }

    /* renamed from: u1 */
    public int m28633u1() {
        int i10 = this.f23416N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v1 */
    public void m28634v1() {
        for (int i10 = 0; i10 < this.f23583M0; i10++) {
            C9622e c9622e = this.f23582L0[i10];
            if (this.f23417O0 || c9622e.mo28626h()) {
                int i11 = this.f23416N0;
                if (i11 == 0 || i11 == 1) {
                    c9622e.m28699P0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    c9622e.m28699P0(1, true);
                }
            }
        }
    }

    /* renamed from: w1 */
    public void m28635w1(boolean z10) {
        this.f23417O0 = z10;
    }

    /* renamed from: x1 */
    public void m28636x1(int i10) {
        this.f23416N0 = i10;
    }

    /* renamed from: y1 */
    public void m28637y1(int i10) {
        this.f23418P0 = i10;
    }
}
