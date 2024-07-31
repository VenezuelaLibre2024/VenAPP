package p243n0;

import java.util.ArrayList;
import p243n0.C9622e;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public class C9620c {

    /* renamed from: a */
    protected C9622e f23420a;

    /* renamed from: b */
    protected C9622e f23421b;

    /* renamed from: c */
    protected C9622e f23422c;

    /* renamed from: d */
    protected C9622e f23423d;

    /* renamed from: e */
    protected C9622e f23424e;

    /* renamed from: f */
    protected C9622e f23425f;

    /* renamed from: g */
    protected C9622e f23426g;

    /* renamed from: h */
    protected ArrayList<C9622e> f23427h;

    /* renamed from: i */
    protected int f23428i;

    /* renamed from: j */
    protected int f23429j;

    /* renamed from: k */
    protected float f23430k = 0.0f;

    /* renamed from: l */
    int f23431l;

    /* renamed from: m */
    int f23432m;

    /* renamed from: n */
    int f23433n;

    /* renamed from: o */
    boolean f23434o;

    /* renamed from: p */
    private int f23435p;

    /* renamed from: q */
    private boolean f23436q;

    /* renamed from: r */
    protected boolean f23437r;

    /* renamed from: s */
    protected boolean f23438s;

    /* renamed from: t */
    protected boolean f23439t;

    /* renamed from: u */
    protected boolean f23440u;

    /* renamed from: v */
    private boolean f23441v;

    public C9620c(C9622e c9622e, int i10, boolean z10) {
        this.f23420a = c9622e;
        this.f23435p = i10;
        this.f23436q = z10;
    }

    /* renamed from: b */
    private void m28640b() {
        int i10 = this.f23435p * 2;
        C9622e c9622e = this.f23420a;
        this.f23434o = true;
        C9622e c9622e2 = c9622e;
        boolean z10 = false;
        while (!z10) {
            this.f23428i++;
            C9622e[] c9622eArr = c9622e.f23464F0;
            int i11 = this.f23435p;
            C9622e c9622e3 = null;
            c9622eArr[i11] = null;
            c9622e.f23462E0[i11] = null;
            if (c9622e.m28706T() != 8) {
                this.f23431l++;
                C9622e.b m28760s = c9622e.m28760s(this.f23435p);
                C9622e.b bVar = C9622e.b.MATCH_CONSTRAINT;
                if (m28760s != bVar) {
                    this.f23432m += c9622e.m28674C(this.f23435p);
                }
                int m28647e = this.f23432m + c9622e.f23485W[i10].m28647e();
                this.f23432m = m28647e;
                int i12 = i10 + 1;
                this.f23432m = m28647e + c9622e.f23485W[i12].m28647e();
                int m28647e2 = this.f23433n + c9622e.f23485W[i10].m28647e();
                this.f23433n = m28647e2;
                this.f23433n = m28647e2 + c9622e.f23485W[i12].m28647e();
                if (this.f23421b == null) {
                    this.f23421b = c9622e;
                }
                this.f23423d = c9622e;
                C9622e.b[] bVarArr = c9622e.f23488Z;
                int i13 = this.f23435p;
                if (bVarArr[i13] == bVar) {
                    int i14 = c9622e.f23537y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f23429j++;
                        float f10 = c9622e.f23460D0[i13];
                        if (f10 > 0.0f) {
                            this.f23430k += f10;
                        }
                        if (m28641c(c9622e, i13)) {
                            if (f10 < 0.0f) {
                                this.f23437r = true;
                            } else {
                                this.f23438s = true;
                            }
                            if (this.f23427h == null) {
                                this.f23427h = new ArrayList<>();
                            }
                            this.f23427h.add(c9622e);
                        }
                        if (this.f23425f == null) {
                            this.f23425f = c9622e;
                        }
                        C9622e c9622e4 = this.f23426g;
                        if (c9622e4 != null) {
                            c9622e4.f23462E0[this.f23435p] = c9622e;
                        }
                        this.f23426g = c9622e;
                    }
                    if (this.f23435p != 0 ? !(c9622e.f23535x == 0 && c9622e.f23457C == 0 && c9622e.f23459D == 0) : !(c9622e.f23533w == 0 && c9622e.f23539z == 0 && c9622e.f23453A == 0)) {
                        this.f23434o = false;
                    }
                    if (c9622e.f23496d0 != 0.0f) {
                        this.f23434o = false;
                        this.f23440u = true;
                    }
                }
            }
            if (c9622e2 != c9622e) {
                c9622e2.f23464F0[this.f23435p] = c9622e;
            }
            C9621d c9621d = c9622e.f23485W[i10 + 1].f23447f;
            if (c9621d != null) {
                C9622e c9622e5 = c9621d.f23445d;
                C9621d c9621d2 = c9622e5.f23485W[i10].f23447f;
                if (c9621d2 != null && c9621d2.f23445d == c9622e) {
                    c9622e3 = c9622e5;
                }
            }
            if (c9622e3 == null) {
                c9622e3 = c9622e;
                z10 = true;
            }
            c9622e2 = c9622e;
            c9622e = c9622e3;
        }
        C9622e c9622e6 = this.f23421b;
        if (c9622e6 != null) {
            this.f23432m -= c9622e6.f23485W[i10].m28647e();
        }
        C9622e c9622e7 = this.f23423d;
        if (c9622e7 != null) {
            this.f23432m -= c9622e7.f23485W[i10 + 1].m28647e();
        }
        this.f23422c = c9622e;
        if (this.f23435p == 0 && this.f23436q) {
            this.f23424e = c9622e;
        } else {
            this.f23424e = this.f23420a;
        }
        this.f23439t = this.f23438s && this.f23437r;
    }

    /* renamed from: c */
    private static boolean m28641c(C9622e c9622e, int i10) {
        int i11;
        return c9622e.m28706T() != 8 && c9622e.f23488Z[i10] == C9622e.b.MATCH_CONSTRAINT && ((i11 = c9622e.f23537y[i10]) == 0 || i11 == 3);
    }

    /* renamed from: a */
    public void m28642a() {
        if (!this.f23441v) {
            m28640b();
        }
        this.f23441v = true;
    }
}
