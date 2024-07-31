package p243n0;

import p190k0.C9102d;
import p190k0.C9107i;
import p243n0.C9621d;
import p243n0.C9622e;

/* renamed from: n0.g */
/* loaded from: classes.dex */
public class C9624g extends C9622e {

    /* renamed from: L0 */
    protected float f23573L0 = -1.0f;

    /* renamed from: M0 */
    protected int f23574M0 = -1;

    /* renamed from: N0 */
    protected int f23575N0 = -1;

    /* renamed from: O0 */
    protected boolean f23576O0 = true;

    /* renamed from: P0 */
    private C9621d f23577P0 = this.f23478P;

    /* renamed from: Q0 */
    private int f23578Q0 = 0;

    /* renamed from: R0 */
    private int f23579R0 = 0;

    /* renamed from: S0 */
    private boolean f23580S0;

    /* renamed from: n0.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23581a;

        static {
            int[] iArr = new int[C9621d.b.values().length];
            f23581a = iArr;
            try {
                iArr[C9621d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23581a[C9621d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23581a[C9621d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23581a[C9621d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23581a[C9621d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23581a[C9621d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23581a[C9621d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23581a[C9621d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23581a[C9621d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C9624g() {
        this.f23486X.clear();
        this.f23486X.add(this.f23577P0);
        int length = this.f23485W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f23485W[i10] = this.f23577P0;
        }
    }

    @Override // p243n0.C9622e
    /* renamed from: g */
    public void mo28625g(C9102d c9102d, boolean z10) {
        C9623f c9623f = (C9623f) m28686I();
        if (c9623f == null) {
            return;
        }
        C9621d mo28747m = c9623f.mo28747m(C9621d.b.LEFT);
        C9621d mo28747m2 = c9623f.mo28747m(C9621d.b.RIGHT);
        C9622e c9622e = this.f23490a0;
        boolean z11 = c9622e != null && c9622e.f23488Z[0] == C9622e.b.WRAP_CONTENT;
        if (this.f23578Q0 == 0) {
            mo28747m = c9623f.mo28747m(C9621d.b.TOP);
            mo28747m2 = c9623f.mo28747m(C9621d.b.BOTTOM);
            C9622e c9622e2 = this.f23490a0;
            z11 = c9622e2 != null && c9622e2.f23488Z[1] == C9622e.b.WRAP_CONTENT;
        }
        if (this.f23580S0 && this.f23577P0.m28655m()) {
            C9107i m26792q = c9102d.m26792q(this.f23577P0);
            c9102d.m26783f(m26792q, this.f23577P0.m28646d());
            if (this.f23574M0 != -1) {
                if (z11) {
                    c9102d.m26785h(c9102d.m26792q(mo28747m2), m26792q, 0, 5);
                }
            } else if (this.f23575N0 != -1 && z11) {
                C9107i m26792q2 = c9102d.m26792q(mo28747m2);
                c9102d.m26785h(m26792q, c9102d.m26792q(mo28747m), 0, 5);
                c9102d.m26785h(m26792q2, m26792q, 0, 5);
            }
            this.f23580S0 = false;
            return;
        }
        if (this.f23574M0 != -1) {
            C9107i m26792q3 = c9102d.m26792q(this.f23577P0);
            c9102d.m26782e(m26792q3, c9102d.m26792q(mo28747m), this.f23574M0, 8);
            if (z11) {
                c9102d.m26785h(c9102d.m26792q(mo28747m2), m26792q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f23575N0 == -1) {
            if (this.f23573L0 != -1.0f) {
                c9102d.m26781d(C9102d.m26773s(c9102d, c9102d.m26792q(this.f23577P0), c9102d.m26792q(mo28747m2), this.f23573L0));
                return;
            }
            return;
        }
        C9107i m26792q4 = c9102d.m26792q(this.f23577P0);
        C9107i m26792q5 = c9102d.m26792q(mo28747m2);
        c9102d.m26782e(m26792q4, m26792q5, -this.f23575N0, 8);
        if (z11) {
            c9102d.m26785h(m26792q4, c9102d.m26792q(mo28747m), 0, 5);
            c9102d.m26785h(m26792q5, m26792q4, 0, 5);
        }
    }

    @Override // p243n0.C9622e
    /* renamed from: h */
    public boolean mo28626h() {
        return true;
    }

    @Override // p243n0.C9622e
    /* renamed from: l0 */
    public boolean mo28627l0() {
        return this.f23580S0;
    }

    @Override // p243n0.C9622e
    /* renamed from: m */
    public C9621d mo28747m(C9621d.b bVar) {
        int i10 = a.f23581a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f23578Q0 == 1) {
                return this.f23577P0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f23578Q0 == 0) {
            return this.f23577P0;
        }
        return null;
    }

    @Override // p243n0.C9622e
    /* renamed from: m0 */
    public boolean mo28628m0() {
        return this.f23580S0;
    }

    @Override // p243n0.C9622e
    /* renamed from: n1 */
    public void mo28751n1(C9102d c9102d, boolean z10) {
        if (m28686I() == null) {
            return;
        }
        int m26796x = c9102d.m26796x(this.f23577P0);
        if (this.f23578Q0 == 1) {
            m28741j1(m26796x);
            m28744k1(0);
            m28687I0(m28686I().m28765v());
            m28736h1(0);
            return;
        }
        m28741j1(0);
        m28744k1(m26796x);
        m28736h1(m28686I().m28708U());
        m28687I0(0);
    }

    /* renamed from: o1 */
    public C9621d m28805o1() {
        return this.f23577P0;
    }

    /* renamed from: p1 */
    public int m28806p1() {
        return this.f23578Q0;
    }

    /* renamed from: q1 */
    public int m28807q1() {
        return this.f23574M0;
    }

    /* renamed from: r1 */
    public int m28808r1() {
        return this.f23575N0;
    }

    /* renamed from: s1 */
    public float m28809s1() {
        return this.f23573L0;
    }

    /* renamed from: t1 */
    public void m28810t1(int i10) {
        this.f23577P0.m28661s(i10);
        this.f23580S0 = true;
    }

    /* renamed from: u1 */
    public void m28811u1(int i10) {
        if (i10 > -1) {
            this.f23573L0 = -1.0f;
            this.f23574M0 = i10;
            this.f23575N0 = -1;
        }
    }

    /* renamed from: v1 */
    public void m28812v1(int i10) {
        if (i10 > -1) {
            this.f23573L0 = -1.0f;
            this.f23574M0 = -1;
            this.f23575N0 = i10;
        }
    }

    /* renamed from: w1 */
    public void m28813w1(float f10) {
        if (f10 > -1.0f) {
            this.f23573L0 = f10;
            this.f23574M0 = -1;
            this.f23575N0 = -1;
        }
    }

    /* renamed from: x1 */
    public void m28814x1(int i10) {
        if (this.f23578Q0 == i10) {
            return;
        }
        this.f23578Q0 = i10;
        this.f23486X.clear();
        this.f23577P0 = this.f23578Q0 == 1 ? this.f23477O : this.f23478P;
        this.f23486X.add(this.f23577P0);
        int length = this.f23485W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f23485W[i11] = this.f23577P0;
        }
    }
}
