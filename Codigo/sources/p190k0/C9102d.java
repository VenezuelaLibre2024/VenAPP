package p190k0;

import java.util.Arrays;
import java.util.HashMap;
import p190k0.C9107i;
import p243n0.C9621d;
import p243n0.C9622e;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public class C9102d {

    /* renamed from: r */
    public static boolean f21872r = false;

    /* renamed from: s */
    public static boolean f21873s = true;

    /* renamed from: t */
    public static boolean f21874t = true;

    /* renamed from: u */
    public static boolean f21875u = true;

    /* renamed from: v */
    public static boolean f21876v = false;

    /* renamed from: w */
    private static int f21877w = 1000;

    /* renamed from: x */
    public static long f21878x;

    /* renamed from: y */
    public static long f21879y;

    /* renamed from: d */
    private a f21883d;

    /* renamed from: g */
    C9100b[] f21886g;

    /* renamed from: n */
    final C9101c f21893n;

    /* renamed from: q */
    private a f21896q;

    /* renamed from: a */
    public boolean f21880a = false;

    /* renamed from: b */
    int f21881b = 0;

    /* renamed from: c */
    private HashMap<String, C9107i> f21882c = null;

    /* renamed from: e */
    private int f21884e = 32;

    /* renamed from: f */
    private int f21885f = 32;

    /* renamed from: h */
    public boolean f21887h = false;

    /* renamed from: i */
    public boolean f21888i = false;

    /* renamed from: j */
    private boolean[] f21889j = new boolean[32];

    /* renamed from: k */
    int f21890k = 1;

    /* renamed from: l */
    int f21891l = 0;

    /* renamed from: m */
    private int f21892m = 32;

    /* renamed from: o */
    private C9107i[] f21894o = new C9107i[f21877w];

    /* renamed from: p */
    private int f21895p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C9107i mo26744a(C9102d c9102d, boolean[] zArr);

        /* renamed from: b */
        void mo26745b(a aVar);

        /* renamed from: c */
        void mo26746c(C9107i c9107i);

        void clear();

        C9107i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.d$b */
    /* loaded from: classes.dex */
    public class b extends C9100b {
        public b(C9101c c9101c) {
            this.f21866e = new C9108j(this, c9101c);
        }
    }

    public C9102d() {
        this.f21886g = null;
        this.f21886g = new C9100b[32];
        m26769C();
        C9101c c9101c = new C9101c();
        this.f21893n = c9101c;
        this.f21883d = new C9106h(c9101c);
        this.f21896q = f21876v ? new b(c9101c) : new C9100b(c9101c);
    }

    /* renamed from: B */
    private final int m26768B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f21890k; i10++) {
            this.f21889j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f21890k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f21889j[aVar.getKey().f21915c] = true;
            }
            C9107i mo26744a = aVar.mo26744a(this, this.f21889j);
            if (mo26744a != null) {
                boolean[] zArr = this.f21889j;
                int i12 = mo26744a.f21915c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (mo26744a != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f21891l; i14++) {
                    C9100b c9100b = this.f21886g[i14];
                    if (c9100b.f21862a.f21922u != C9107i.a.UNRESTRICTED && !c9100b.f21867f && c9100b.m26763t(mo26744a)) {
                        float mo26736j = c9100b.f21866e.mo26736j(mo26744a);
                        if (mo26736j < 0.0f) {
                            float f11 = (-c9100b.f21863b) / mo26736j;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C9100b c9100b2 = this.f21886g[i13];
                    c9100b2.f21862a.f21916d = -1;
                    c9100b2.m26765x(mo26744a);
                    C9107i c9107i = c9100b2.f21862a;
                    c9107i.f21916d = i13;
                    c9107i.m26817p(this, c9100b2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    /* renamed from: C */
    private void m26769C() {
        int i10 = 0;
        if (f21876v) {
            while (i10 < this.f21891l) {
                C9100b c9100b = this.f21886g[i10];
                if (c9100b != null) {
                    this.f21893n.f21868a.mo26798a(c9100b);
                }
                this.f21886g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f21891l) {
            C9100b c9100b2 = this.f21886g[i10];
            if (c9100b2 != null) {
                this.f21893n.f21869b.mo26798a(c9100b2);
            }
            this.f21886g[i10] = null;
            i10++;
        }
    }

    /* renamed from: a */
    private C9107i m26770a(C9107i.a aVar, String str) {
        C9107i mo26799b = this.f21893n.f21870c.mo26799b();
        if (mo26799b == null) {
            mo26799b = new C9107i(aVar, str);
        } else {
            mo26799b.m26814m();
        }
        mo26799b.m26816o(aVar, str);
        int i10 = this.f21895p;
        int i11 = f21877w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f21877w = i12;
            this.f21894o = (C9107i[]) Arrays.copyOf(this.f21894o, i12);
        }
        C9107i[] c9107iArr = this.f21894o;
        int i13 = this.f21895p;
        this.f21895p = i13 + 1;
        c9107iArr[i13] = mo26799b;
        return mo26799b;
    }

    /* renamed from: l */
    private final void m26771l(C9100b c9100b) {
        int i10;
        if (f21874t && c9100b.f21867f) {
            c9100b.f21862a.m26815n(this, c9100b.f21863b);
        } else {
            C9100b[] c9100bArr = this.f21886g;
            int i11 = this.f21891l;
            c9100bArr[i11] = c9100b;
            C9107i c9107i = c9100b.f21862a;
            c9107i.f21916d = i11;
            this.f21891l = i11 + 1;
            c9107i.m26817p(this, c9100b);
        }
        if (f21874t && this.f21880a) {
            int i12 = 0;
            while (i12 < this.f21891l) {
                if (this.f21886g[i12] == null) {
                    System.out.println("WTF");
                }
                C9100b c9100b2 = this.f21886g[i12];
                if (c9100b2 != null && c9100b2.f21867f) {
                    c9100b2.f21862a.m26815n(this, c9100b2.f21863b);
                    (f21876v ? this.f21893n.f21868a : this.f21893n.f21869b).mo26798a(c9100b2);
                    this.f21886g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f21891l;
                        if (i13 >= i10) {
                            break;
                        }
                        C9100b[] c9100bArr2 = this.f21886g;
                        int i15 = i13 - 1;
                        C9100b c9100b3 = c9100bArr2[i13];
                        c9100bArr2[i15] = c9100b3;
                        C9107i c9107i2 = c9100b3.f21862a;
                        if (c9107i2.f21916d == i13) {
                            c9107i2.f21916d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f21886g[i14] = null;
                    }
                    this.f21891l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f21880a = false;
        }
    }

    /* renamed from: n */
    private void m26772n() {
        for (int i10 = 0; i10 < this.f21891l; i10++) {
            C9100b c9100b = this.f21886g[i10];
            c9100b.f21862a.f21918f = c9100b.f21863b;
        }
    }

    /* renamed from: s */
    public static C9100b m26773s(C9102d c9102d, C9107i c9107i, C9107i c9107i2, float f10) {
        return c9102d.m26793r().m26753j(c9107i, c9107i2, f10);
    }

    /* renamed from: u */
    private int m26774u(a aVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f21891l) {
                z10 = false;
                break;
            }
            C9100b c9100b = this.f21886g[i10];
            if (c9100b.f21862a.f21922u != C9107i.a.UNRESTRICTED && c9100b.f21863b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f21891l; i15++) {
                C9100b c9100b2 = this.f21886g[i15];
                if (c9100b2.f21862a.f21922u != C9107i.a.UNRESTRICTED && !c9100b2.f21867f && c9100b2.f21863b < 0.0f) {
                    int i16 = 9;
                    if (f21875u) {
                        int mo26734h = c9100b2.f21866e.mo26734h();
                        int i17 = 0;
                        while (i17 < mo26734h) {
                            C9107i mo26727a = c9100b2.f21866e.mo26727a(i17);
                            float mo26736j = c9100b2.f21866e.mo26736j(mo26727a);
                            if (mo26736j > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f11 = mo26727a.f21920s[i18] / mo26736j;
                                    if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = mo26727a.f21915c;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f11;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f21890k; i19++) {
                            C9107i c9107i = this.f21893n.f21871d[i19];
                            float mo26736j2 = c9100b2.f21866e.mo26736j(c9107i);
                            if (mo26736j2 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f12 = c9107i.f21920s[i20] / mo26736j2;
                                    if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i12 = i15;
                                        i14 = i20;
                                        f10 = f12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                C9100b c9100b3 = this.f21886g[i12];
                c9100b3.f21862a.f21916d = -1;
                c9100b3.m26765x(this.f21893n.f21871d[i13]);
                C9107i c9107i2 = c9100b3.f21862a;
                c9107i2.f21916d = i12;
                c9107i2.m26817p(this, c9100b3);
            } else {
                z11 = true;
            }
            if (i11 > this.f21890k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    /* renamed from: w */
    public static C9103e m26775w() {
        return null;
    }

    /* renamed from: y */
    private void m26776y() {
        int i10 = this.f21884e * 2;
        this.f21884e = i10;
        this.f21886g = (C9100b[]) Arrays.copyOf(this.f21886g, i10);
        C9101c c9101c = this.f21893n;
        c9101c.f21871d = (C9107i[]) Arrays.copyOf(c9101c.f21871d, this.f21884e);
        int i11 = this.f21884e;
        this.f21889j = new boolean[i11];
        this.f21885f = i11;
        this.f21892m = i11;
    }

    /* renamed from: A */
    void m26777A(a aVar) {
        m26774u(aVar);
        m26768B(aVar, false);
        m26772n();
    }

    /* renamed from: D */
    public void m26778D() {
        C9101c c9101c;
        int i10 = 0;
        while (true) {
            c9101c = this.f21893n;
            C9107i[] c9107iArr = c9101c.f21871d;
            if (i10 >= c9107iArr.length) {
                break;
            }
            C9107i c9107i = c9107iArr[i10];
            if (c9107i != null) {
                c9107i.m26814m();
            }
            i10++;
        }
        c9101c.f21870c.mo26800c(this.f21894o, this.f21895p);
        this.f21895p = 0;
        Arrays.fill(this.f21893n.f21871d, (Object) null);
        HashMap<String, C9107i> hashMap = this.f21882c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f21881b = 0;
        this.f21883d.clear();
        this.f21890k = 1;
        for (int i11 = 0; i11 < this.f21891l; i11++) {
            C9100b c9100b = this.f21886g[i11];
            if (c9100b != null) {
                c9100b.f21864c = false;
            }
        }
        m26769C();
        this.f21891l = 0;
        this.f21896q = f21876v ? new b(this.f21893n) : new C9100b(this.f21893n);
    }

    /* renamed from: b */
    public void m26779b(C9622e c9622e, C9622e c9622e2, float f10, int i10) {
        C9621d.b bVar = C9621d.b.LEFT;
        C9107i m26792q = m26792q(c9622e.mo28747m(bVar));
        C9621d.b bVar2 = C9621d.b.TOP;
        C9107i m26792q2 = m26792q(c9622e.mo28747m(bVar2));
        C9621d.b bVar3 = C9621d.b.RIGHT;
        C9107i m26792q3 = m26792q(c9622e.mo28747m(bVar3));
        C9621d.b bVar4 = C9621d.b.BOTTOM;
        C9107i m26792q4 = m26792q(c9622e.mo28747m(bVar4));
        C9107i m26792q5 = m26792q(c9622e2.mo28747m(bVar));
        C9107i m26792q6 = m26792q(c9622e2.mo28747m(bVar2));
        C9107i m26792q7 = m26792q(c9622e2.mo28747m(bVar3));
        C9107i m26792q8 = m26792q(c9622e2.mo28747m(bVar4));
        C9100b m26793r = m26793r();
        double d10 = f10;
        double d11 = i10;
        m26793r.m26760q(m26792q2, m26792q4, m26792q6, m26792q8, (float) (Math.sin(d10) * d11));
        m26781d(m26793r);
        C9100b m26793r2 = m26793r();
        m26793r2.m26760q(m26792q, m26792q3, m26792q5, m26792q7, (float) (Math.cos(d10) * d11));
        m26781d(m26793r2);
    }

    /* renamed from: c */
    public void m26780c(C9107i c9107i, C9107i c9107i2, int i10, float f10, C9107i c9107i3, C9107i c9107i4, int i11, int i12) {
        C9100b m26793r = m26793r();
        m26793r.m26751h(c9107i, c9107i2, i10, f10, c9107i3, c9107i4, i11);
        if (i12 != 8) {
            m26793r.m26747d(this, i12);
        }
        m26781d(m26793r);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26781d(p190k0.C9100b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f21891l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f21892m
            if (r0 >= r2) goto L12
            int r0 = r5.f21890k
            int r0 = r0 + r1
            int r2 = r5.f21885f
            if (r0 < r2) goto L15
        L12:
            r5.m26776y()
        L15:
            boolean r0 = r6.f21867f
            r2 = 0
            if (r0 != 0) goto L81
            r6.m26743D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.m26761r()
            boolean r0 = r6.m26749f(r5)
            if (r0 == 0) goto L78
            k0.i r0 = r5.m26791p()
            r6.f21862a = r0
            int r3 = r5.f21891l
            r5.m26771l(r6)
            int r4 = r5.f21891l
            int r3 = r3 + r1
            if (r4 != r3) goto L78
            k0.d$a r2 = r5.f21896q
            r2.mo26745b(r6)
            k0.d$a r2 = r5.f21896q
            r5.m26768B(r2, r1)
            int r2 = r0.f21916d
            r3 = -1
            if (r2 != r3) goto L79
            k0.i r2 = r6.f21862a
            if (r2 != r0) goto L59
            k0.i r0 = r6.m26764v(r0)
            if (r0 == 0) goto L59
            r6.m26765x(r0)
        L59:
            boolean r0 = r6.f21867f
            if (r0 != 0) goto L62
            k0.i r0 = r6.f21862a
            r0.m26817p(r5, r6)
        L62:
            boolean r0 = p190k0.C9102d.f21876v
            if (r0 == 0) goto L6b
            k0.c r0 = r5.f21893n
            k0.f<k0.b> r0 = r0.f21868a
            goto L6f
        L6b:
            k0.c r0 = r5.f21893n
            k0.f<k0.b> r0 = r0.f21869b
        L6f:
            r0.mo26798a(r6)
            int r0 = r5.f21891l
            int r0 = r0 - r1
            r5.f21891l = r0
            goto L79
        L78:
            r1 = r2
        L79:
            boolean r0 = r6.m26762s()
            if (r0 != 0) goto L80
            return
        L80:
            r2 = r1
        L81:
            if (r2 != 0) goto L86
            r5.m26771l(r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190k0.C9102d.m26781d(k0.b):void");
    }

    /* renamed from: e */
    public C9100b m26782e(C9107i c9107i, C9107i c9107i2, int i10, int i11) {
        if (f21873s && i11 == 8 && c9107i2.f21919r && c9107i.f21916d == -1) {
            c9107i.m26815n(this, c9107i2.f21918f + i10);
            return null;
        }
        C9100b m26793r = m26793r();
        m26793r.m26757n(c9107i, c9107i2, i10);
        if (i11 != 8) {
            m26793r.m26747d(this, i11);
        }
        m26781d(m26793r);
        return m26793r;
    }

    /* renamed from: f */
    public void m26783f(C9107i c9107i, int i10) {
        C9100b m26793r;
        if (f21873s && c9107i.f21916d == -1) {
            float f10 = i10;
            c9107i.m26815n(this, f10);
            for (int i11 = 0; i11 < this.f21881b + 1; i11++) {
                C9107i c9107i2 = this.f21893n.f21871d[i11];
                if (c9107i2 != null && c9107i2.f21926y && c9107i2.f21927z == c9107i.f21915c) {
                    c9107i2.m26815n(this, c9107i2.f21911A + f10);
                }
            }
            return;
        }
        int i12 = c9107i.f21916d;
        if (i12 != -1) {
            C9100b c9100b = this.f21886g[i12];
            if (!c9100b.f21867f) {
                if (c9100b.f21866e.mo26734h() == 0) {
                    c9100b.f21867f = true;
                } else {
                    m26793r = m26793r();
                    m26793r.m26756m(c9107i, i10);
                }
            }
            c9100b.f21863b = i10;
            return;
        }
        m26793r = m26793r();
        m26793r.m26752i(c9107i, i10);
        m26781d(m26793r);
    }

    /* renamed from: g */
    public void m26784g(C9107i c9107i, C9107i c9107i2, int i10, boolean z10) {
        C9100b m26793r = m26793r();
        C9107i m26794t = m26794t();
        m26794t.f21917e = 0;
        m26793r.m26758o(c9107i, c9107i2, m26794t, i10);
        m26781d(m26793r);
    }

    /* renamed from: h */
    public void m26785h(C9107i c9107i, C9107i c9107i2, int i10, int i11) {
        C9100b m26793r = m26793r();
        C9107i m26794t = m26794t();
        m26794t.f21917e = 0;
        m26793r.m26758o(c9107i, c9107i2, m26794t, i10);
        if (i11 != 8) {
            m26789m(m26793r, (int) (m26793r.f21866e.mo26736j(m26794t) * (-1.0f)), i11);
        }
        m26781d(m26793r);
    }

    /* renamed from: i */
    public void m26786i(C9107i c9107i, C9107i c9107i2, int i10, boolean z10) {
        C9100b m26793r = m26793r();
        C9107i m26794t = m26794t();
        m26794t.f21917e = 0;
        m26793r.m26759p(c9107i, c9107i2, m26794t, i10);
        m26781d(m26793r);
    }

    /* renamed from: j */
    public void m26787j(C9107i c9107i, C9107i c9107i2, int i10, int i11) {
        C9100b m26793r = m26793r();
        C9107i m26794t = m26794t();
        m26794t.f21917e = 0;
        m26793r.m26759p(c9107i, c9107i2, m26794t, i10);
        if (i11 != 8) {
            m26789m(m26793r, (int) (m26793r.f21866e.mo26736j(m26794t) * (-1.0f)), i11);
        }
        m26781d(m26793r);
    }

    /* renamed from: k */
    public void m26788k(C9107i c9107i, C9107i c9107i2, C9107i c9107i3, C9107i c9107i4, float f10, int i10) {
        C9100b m26793r = m26793r();
        m26793r.m26754k(c9107i, c9107i2, c9107i3, c9107i4, f10);
        if (i10 != 8) {
            m26793r.m26747d(this, i10);
        }
        m26781d(m26793r);
    }

    /* renamed from: m */
    void m26789m(C9100b c9100b, int i10, int i11) {
        c9100b.m26748e(m26790o(i11, null), i10);
    }

    /* renamed from: o */
    public C9107i m26790o(int i10, String str) {
        if (this.f21890k + 1 >= this.f21885f) {
            m26776y();
        }
        C9107i m26770a = m26770a(C9107i.a.ERROR, str);
        int i11 = this.f21881b + 1;
        this.f21881b = i11;
        this.f21890k++;
        m26770a.f21915c = i11;
        m26770a.f21917e = i10;
        this.f21893n.f21871d[i11] = m26770a;
        this.f21883d.mo26746c(m26770a);
        return m26770a;
    }

    /* renamed from: p */
    public C9107i m26791p() {
        if (this.f21890k + 1 >= this.f21885f) {
            m26776y();
        }
        C9107i m26770a = m26770a(C9107i.a.SLACK, null);
        int i10 = this.f21881b + 1;
        this.f21881b = i10;
        this.f21890k++;
        m26770a.f21915c = i10;
        this.f21893n.f21871d[i10] = m26770a;
        return m26770a;
    }

    /* renamed from: q */
    public C9107i m26792q(Object obj) {
        C9107i c9107i = null;
        if (obj == null) {
            return null;
        }
        if (this.f21890k + 1 >= this.f21885f) {
            m26776y();
        }
        if (obj instanceof C9621d) {
            C9621d c9621d = (C9621d) obj;
            c9107i = c9621d.m28650h();
            if (c9107i == null) {
                c9621d.m28660r(this.f21893n);
                c9107i = c9621d.m28650h();
            }
            int i10 = c9107i.f21915c;
            if (i10 == -1 || i10 > this.f21881b || this.f21893n.f21871d[i10] == null) {
                if (i10 != -1) {
                    c9107i.m26814m();
                }
                int i11 = this.f21881b + 1;
                this.f21881b = i11;
                this.f21890k++;
                c9107i.f21915c = i11;
                c9107i.f21922u = C9107i.a.UNRESTRICTED;
                this.f21893n.f21871d[i11] = c9107i;
            }
        }
        return c9107i;
    }

    /* renamed from: r */
    public C9100b m26793r() {
        C9100b mo26799b;
        if (f21876v) {
            mo26799b = this.f21893n.f21868a.mo26799b();
            if (mo26799b == null) {
                mo26799b = new b(this.f21893n);
                f21879y++;
            }
            mo26799b.m26766y();
        } else {
            mo26799b = this.f21893n.f21869b.mo26799b();
            if (mo26799b == null) {
                mo26799b = new C9100b(this.f21893n);
                f21878x++;
            }
            mo26799b.m26766y();
        }
        C9107i.m26810i();
        return mo26799b;
    }

    /* renamed from: t */
    public C9107i m26794t() {
        if (this.f21890k + 1 >= this.f21885f) {
            m26776y();
        }
        C9107i m26770a = m26770a(C9107i.a.SLACK, null);
        int i10 = this.f21881b + 1;
        this.f21881b = i10;
        this.f21890k++;
        m26770a.f21915c = i10;
        this.f21893n.f21871d[i10] = m26770a;
        return m26770a;
    }

    /* renamed from: v */
    public C9101c m26795v() {
        return this.f21893n;
    }

    /* renamed from: x */
    public int m26796x(Object obj) {
        C9107i m28650h = ((C9621d) obj).m28650h();
        if (m28650h != null) {
            return (int) (m28650h.f21918f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void m26797z() {
        if (this.f21883d.isEmpty()) {
            m26772n();
            return;
        }
        if (this.f21887h || this.f21888i) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f21891l) {
                    z10 = true;
                    break;
                } else if (!this.f21886g[i10].f21867f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                m26772n();
                return;
            }
        }
        m26777A(this.f21883d);
    }
}
