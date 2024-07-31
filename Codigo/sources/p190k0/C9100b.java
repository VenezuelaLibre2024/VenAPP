package p190k0;

import java.util.ArrayList;
import p190k0.C9102d;
import p190k0.C9107i;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public class C9100b implements C9102d.a {

    /* renamed from: e */
    public a f21866e;

    /* renamed from: a */
    C9107i f21862a = null;

    /* renamed from: b */
    float f21863b = 0.0f;

    /* renamed from: c */
    boolean f21864c = false;

    /* renamed from: d */
    ArrayList<C9107i> f21865d = new ArrayList<>();

    /* renamed from: f */
    boolean f21867f = false;

    /* renamed from: k0.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C9107i mo26727a(int i10);

        /* renamed from: b */
        void mo26728b();

        /* renamed from: c */
        void mo26729c(C9107i c9107i, float f10, boolean z10);

        void clear();

        /* renamed from: d */
        float mo26730d(C9100b c9100b, boolean z10);

        /* renamed from: e */
        void mo26731e(C9107i c9107i, float f10);

        /* renamed from: f */
        float mo26732f(C9107i c9107i, boolean z10);

        /* renamed from: g */
        boolean mo26733g(C9107i c9107i);

        /* renamed from: h */
        int mo26734h();

        /* renamed from: i */
        float mo26735i(int i10);

        /* renamed from: j */
        float mo26736j(C9107i c9107i);

        /* renamed from: k */
        void mo26737k(float f10);
    }

    public C9100b() {
    }

    public C9100b(C9101c c9101c) {
        this.f21866e = new C9099a(this, c9101c);
    }

    /* renamed from: u */
    private boolean m26738u(C9107i c9107i, C9102d c9102d) {
        return c9107i.f21925x <= 1;
    }

    /* renamed from: w */
    private C9107i m26739w(boolean[] zArr, C9107i c9107i) {
        C9107i.a aVar;
        int mo26734h = this.f21866e.mo26734h();
        C9107i c9107i2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < mo26734h; i10++) {
            float mo26735i = this.f21866e.mo26735i(i10);
            if (mo26735i < 0.0f) {
                C9107i mo26727a = this.f21866e.mo26727a(i10);
                if ((zArr == null || !zArr[mo26727a.f21915c]) && mo26727a != c9107i && (((aVar = mo26727a.f21922u) == C9107i.a.SLACK || aVar == C9107i.a.ERROR) && mo26735i < f10)) {
                    f10 = mo26735i;
                    c9107i2 = mo26727a;
                }
            }
        }
        return c9107i2;
    }

    /* renamed from: A */
    public void m26740A(C9102d c9102d, C9107i c9107i, boolean z10) {
        if (c9107i == null || !c9107i.f21919r) {
            return;
        }
        this.f21863b += c9107i.f21918f * this.f21866e.mo26736j(c9107i);
        this.f21866e.mo26732f(c9107i, z10);
        if (z10) {
            c9107i.m26813l(this);
        }
        if (C9102d.f21874t && this.f21866e.mo26734h() == 0) {
            this.f21867f = true;
            c9102d.f21880a = true;
        }
    }

    /* renamed from: B */
    public void mo26741B(C9102d c9102d, C9100b c9100b, boolean z10) {
        this.f21863b += c9100b.f21863b * this.f21866e.mo26730d(c9100b, z10);
        if (z10) {
            c9100b.f21862a.m26813l(this);
        }
        if (C9102d.f21874t && this.f21862a != null && this.f21866e.mo26734h() == 0) {
            this.f21867f = true;
            c9102d.f21880a = true;
        }
    }

    /* renamed from: C */
    public void m26742C(C9102d c9102d, C9107i c9107i, boolean z10) {
        if (c9107i == null || !c9107i.f21926y) {
            return;
        }
        float mo26736j = this.f21866e.mo26736j(c9107i);
        this.f21863b += c9107i.f21911A * mo26736j;
        this.f21866e.mo26732f(c9107i, z10);
        if (z10) {
            c9107i.m26813l(this);
        }
        this.f21866e.mo26729c(c9102d.f21893n.f21871d[c9107i.f21927z], mo26736j, z10);
        if (C9102d.f21874t && this.f21866e.mo26734h() == 0) {
            this.f21867f = true;
            c9102d.f21880a = true;
        }
    }

    /* renamed from: D */
    public void m26743D(C9102d c9102d) {
        if (c9102d.f21886g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int mo26734h = this.f21866e.mo26734h();
            for (int i10 = 0; i10 < mo26734h; i10++) {
                C9107i mo26727a = this.f21866e.mo26727a(i10);
                if (mo26727a.f21916d != -1 || mo26727a.f21919r || mo26727a.f21926y) {
                    this.f21865d.add(mo26727a);
                }
            }
            int size = this.f21865d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C9107i c9107i = this.f21865d.get(i11);
                    if (c9107i.f21919r) {
                        m26740A(c9102d, c9107i, true);
                    } else if (c9107i.f21926y) {
                        m26742C(c9102d, c9107i, true);
                    } else {
                        mo26741B(c9102d, c9102d.f21886g[c9107i.f21916d], true);
                    }
                }
                this.f21865d.clear();
            } else {
                z10 = true;
            }
        }
        if (C9102d.f21874t && this.f21862a != null && this.f21866e.mo26734h() == 0) {
            this.f21867f = true;
            c9102d.f21880a = true;
        }
    }

    @Override // p190k0.C9102d.a
    /* renamed from: a */
    public C9107i mo26744a(C9102d c9102d, boolean[] zArr) {
        return m26739w(zArr, null);
    }

    @Override // p190k0.C9102d.a
    /* renamed from: b */
    public void mo26745b(C9102d.a aVar) {
        if (aVar instanceof C9100b) {
            C9100b c9100b = (C9100b) aVar;
            this.f21862a = null;
            this.f21866e.clear();
            for (int i10 = 0; i10 < c9100b.f21866e.mo26734h(); i10++) {
                this.f21866e.mo26729c(c9100b.f21866e.mo26727a(i10), c9100b.f21866e.mo26735i(i10), true);
            }
        }
    }

    @Override // p190k0.C9102d.a
    /* renamed from: c */
    public void mo26746c(C9107i c9107i) {
        int i10 = c9107i.f21917e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f21866e.mo26731e(c9107i, f10);
    }

    @Override // p190k0.C9102d.a
    public void clear() {
        this.f21866e.clear();
        this.f21862a = null;
        this.f21863b = 0.0f;
    }

    /* renamed from: d */
    public C9100b m26747d(C9102d c9102d, int i10) {
        this.f21866e.mo26731e(c9102d.m26790o(i10, "ep"), 1.0f);
        this.f21866e.mo26731e(c9102d.m26790o(i10, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C9100b m26748e(C9107i c9107i, int i10) {
        this.f21866e.mo26731e(c9107i, i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m26749f(C9102d c9102d) {
        boolean z10;
        C9107i m26750g = m26750g(c9102d);
        if (m26750g == null) {
            z10 = true;
        } else {
            m26765x(m26750g);
            z10 = false;
        }
        if (this.f21866e.mo26734h() == 0) {
            this.f21867f = true;
        }
        return z10;
    }

    /* renamed from: g */
    C9107i m26750g(C9102d c9102d) {
        int mo26734h = this.f21866e.mo26734h();
        C9107i c9107i = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        C9107i c9107i2 = null;
        for (int i10 = 0; i10 < mo26734h; i10++) {
            float mo26735i = this.f21866e.mo26735i(i10);
            C9107i mo26727a = this.f21866e.mo26727a(i10);
            if (mo26727a.f21922u == C9107i.a.UNRESTRICTED) {
                if (c9107i == null || f10 > mo26735i) {
                    z10 = m26738u(mo26727a, c9102d);
                    f10 = mo26735i;
                    c9107i = mo26727a;
                } else if (!z10 && m26738u(mo26727a, c9102d)) {
                    f10 = mo26735i;
                    c9107i = mo26727a;
                    z10 = true;
                }
            } else if (c9107i == null && mo26735i < 0.0f) {
                if (c9107i2 == null || f11 > mo26735i) {
                    z11 = m26738u(mo26727a, c9102d);
                    f11 = mo26735i;
                    c9107i2 = mo26727a;
                } else if (!z11 && m26738u(mo26727a, c9102d)) {
                    f11 = mo26735i;
                    c9107i2 = mo26727a;
                    z11 = true;
                }
            }
        }
        return c9107i != null ? c9107i : c9107i2;
    }

    @Override // p190k0.C9102d.a
    public C9107i getKey() {
        return this.f21862a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C9100b m26751h(C9107i c9107i, C9107i c9107i2, int i10, float f10, C9107i c9107i3, C9107i c9107i4, int i11) {
        float f11;
        int i12;
        if (c9107i2 == c9107i3) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i4, 1.0f);
            this.f21866e.mo26731e(c9107i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
            this.f21866e.mo26731e(c9107i3, -1.0f);
            this.f21866e.mo26731e(c9107i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
                f11 = i12;
            }
            return this;
        }
        if (f10 <= 0.0f) {
            this.f21866e.mo26731e(c9107i, -1.0f);
            this.f21866e.mo26731e(c9107i2, 1.0f);
            f11 = i10;
        } else {
            if (f10 < 1.0f) {
                float f12 = 1.0f - f10;
                this.f21866e.mo26731e(c9107i, f12 * 1.0f);
                this.f21866e.mo26731e(c9107i2, f12 * (-1.0f));
                this.f21866e.mo26731e(c9107i3, (-1.0f) * f10);
                this.f21866e.mo26731e(c9107i4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    f11 = ((-i10) * f12) + (i11 * f10);
                }
                return this;
            }
            this.f21866e.mo26731e(c9107i4, -1.0f);
            this.f21866e.mo26731e(c9107i3, 1.0f);
            i12 = -i11;
            f11 = i12;
        }
        this.f21863b = f11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C9100b m26752i(C9107i c9107i, int i10) {
        this.f21862a = c9107i;
        float f10 = i10;
        c9107i.f21918f = f10;
        this.f21863b = f10;
        this.f21867f = true;
        return this;
    }

    @Override // p190k0.C9102d.a
    public boolean isEmpty() {
        return this.f21862a == null && this.f21863b == 0.0f && this.f21866e.mo26734h() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C9100b m26753j(C9107i c9107i, C9107i c9107i2, float f10) {
        this.f21866e.mo26731e(c9107i, -1.0f);
        this.f21866e.mo26731e(c9107i2, f10);
        return this;
    }

    /* renamed from: k */
    public C9100b m26754k(C9107i c9107i, C9107i c9107i2, C9107i c9107i3, C9107i c9107i4, float f10) {
        this.f21866e.mo26731e(c9107i, -1.0f);
        this.f21866e.mo26731e(c9107i2, 1.0f);
        this.f21866e.mo26731e(c9107i3, f10);
        this.f21866e.mo26731e(c9107i4, -f10);
        return this;
    }

    /* renamed from: l */
    public C9100b m26755l(float f10, float f11, float f12, C9107i c9107i, C9107i c9107i2, C9107i c9107i3, C9107i c9107i4) {
        this.f21863b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
            this.f21866e.mo26731e(c9107i4, 1.0f);
            this.f21866e.mo26731e(c9107i3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f21866e.mo26731e(c9107i3, 1.0f);
            this.f21866e.mo26731e(c9107i4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
            this.f21866e.mo26731e(c9107i4, f13);
            this.f21866e.mo26731e(c9107i3, -f13);
        }
        return this;
    }

    /* renamed from: m */
    public C9100b m26756m(C9107i c9107i, int i10) {
        a aVar;
        float f10;
        if (i10 < 0) {
            this.f21863b = i10 * (-1);
            aVar = this.f21866e;
            f10 = 1.0f;
        } else {
            this.f21863b = i10;
            aVar = this.f21866e;
            f10 = -1.0f;
        }
        aVar.mo26731e(c9107i, f10);
        return this;
    }

    /* renamed from: n */
    public C9100b m26757n(C9107i c9107i, C9107i c9107i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f21863b = i10;
        }
        if (z10) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
        } else {
            this.f21866e.mo26731e(c9107i, -1.0f);
            this.f21866e.mo26731e(c9107i2, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C9100b m26758o(C9107i c9107i, C9107i c9107i2, C9107i c9107i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f21863b = i10;
        }
        if (z10) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
            this.f21866e.mo26731e(c9107i3, -1.0f);
        } else {
            this.f21866e.mo26731e(c9107i, -1.0f);
            this.f21866e.mo26731e(c9107i2, 1.0f);
            this.f21866e.mo26731e(c9107i3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C9100b m26759p(C9107i c9107i, C9107i c9107i2, C9107i c9107i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f21863b = i10;
        }
        if (z10) {
            this.f21866e.mo26731e(c9107i, 1.0f);
            this.f21866e.mo26731e(c9107i2, -1.0f);
            this.f21866e.mo26731e(c9107i3, 1.0f);
        } else {
            this.f21866e.mo26731e(c9107i, -1.0f);
            this.f21866e.mo26731e(c9107i2, 1.0f);
            this.f21866e.mo26731e(c9107i3, -1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C9100b m26760q(C9107i c9107i, C9107i c9107i2, C9107i c9107i3, C9107i c9107i4, float f10) {
        this.f21866e.mo26731e(c9107i3, 0.5f);
        this.f21866e.mo26731e(c9107i4, 0.5f);
        this.f21866e.mo26731e(c9107i, -0.5f);
        this.f21866e.mo26731e(c9107i2, -0.5f);
        this.f21863b = -f10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m26761r() {
        float f10 = this.f21863b;
        if (f10 < 0.0f) {
            this.f21863b = f10 * (-1.0f);
            this.f21866e.mo26728b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m26762s() {
        C9107i c9107i = this.f21862a;
        return c9107i != null && (c9107i.f21922u == C9107i.a.UNRESTRICTED || this.f21863b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m26763t(C9107i c9107i) {
        return this.f21866e.mo26733g(c9107i);
    }

    public String toString() {
        return m26767z();
    }

    /* renamed from: v */
    public C9107i m26764v(C9107i c9107i) {
        return m26739w(null, c9107i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m26765x(C9107i c9107i) {
        C9107i c9107i2 = this.f21862a;
        if (c9107i2 != null) {
            this.f21866e.mo26731e(c9107i2, -1.0f);
            this.f21862a.f21916d = -1;
            this.f21862a = null;
        }
        float mo26732f = this.f21866e.mo26732f(c9107i, true) * (-1.0f);
        this.f21862a = c9107i;
        if (mo26732f == 1.0f) {
            return;
        }
        this.f21863b /= mo26732f;
        this.f21866e.mo26737k(mo26732f);
    }

    /* renamed from: y */
    public void m26766y() {
        this.f21862a = null;
        this.f21866e.clear();
        this.f21863b = 0.0f;
        this.f21867f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m26767z() {
        /*
            r10 = this;
            k0.i r0 = r10.f21862a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            k0.i r1 = r10.f21862a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f21863b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f21863b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L53
        L52:
            r1 = r3
        L53:
            k0.b$a r5 = r10.f21866e
            int r5 = r5.mo26734h()
        L59:
            if (r3 >= r5) goto Ld1
            k0.b$a r6 = r10.f21866e
            k0.i r6 = r6.mo26727a(r3)
            if (r6 != 0) goto L64
            goto Lce
        L64:
            k0.b$a r7 = r10.f21866e
            float r7 = r7.mo26735i(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lce
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Laa
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Laa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc3
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        Lce:
            int r3 = r3 + 1
            goto L59
        Ld1:
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p190k0.C9100b.m26767z():java.lang.String");
    }
}
