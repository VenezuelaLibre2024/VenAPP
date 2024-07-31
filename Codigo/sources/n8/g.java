package n8;

import android.text.Layout;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f21884a;

    /* renamed from: b, reason: collision with root package name */
    private int f21885b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21886c;

    /* renamed from: d, reason: collision with root package name */
    private int f21887d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21888e;

    /* renamed from: k, reason: collision with root package name */
    private float f21894k;

    /* renamed from: l, reason: collision with root package name */
    private String f21895l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f21898o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f21899p;

    /* renamed from: r, reason: collision with root package name */
    private b f21901r;

    /* renamed from: f, reason: collision with root package name */
    private int f21889f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f21890g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f21891h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f21892i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f21893j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f21896m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f21897n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f21900q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f21902s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f21886c && gVar.f21886c) {
                w(gVar.f21885b);
            }
            if (this.f21891h == -1) {
                this.f21891h = gVar.f21891h;
            }
            if (this.f21892i == -1) {
                this.f21892i = gVar.f21892i;
            }
            if (this.f21884a == null && (str = gVar.f21884a) != null) {
                this.f21884a = str;
            }
            if (this.f21889f == -1) {
                this.f21889f = gVar.f21889f;
            }
            if (this.f21890g == -1) {
                this.f21890g = gVar.f21890g;
            }
            if (this.f21897n == -1) {
                this.f21897n = gVar.f21897n;
            }
            if (this.f21898o == null && (alignment2 = gVar.f21898o) != null) {
                this.f21898o = alignment2;
            }
            if (this.f21899p == null && (alignment = gVar.f21899p) != null) {
                this.f21899p = alignment;
            }
            if (this.f21900q == -1) {
                this.f21900q = gVar.f21900q;
            }
            if (this.f21893j == -1) {
                this.f21893j = gVar.f21893j;
                this.f21894k = gVar.f21894k;
            }
            if (this.f21901r == null) {
                this.f21901r = gVar.f21901r;
            }
            if (this.f21902s == Float.MAX_VALUE) {
                this.f21902s = gVar.f21902s;
            }
            if (z10 && !this.f21888e && gVar.f21888e) {
                u(gVar.f21887d);
            }
            if (z10 && this.f21896m == -1 && (i10 = gVar.f21896m) != -1) {
                this.f21896m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f21895l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f21892i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f21889f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f21899p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f21897n = i10;
        return this;
    }

    public g F(int i10) {
        this.f21896m = i10;
        return this;
    }

    public g G(float f10) {
        this.f21902s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f21898o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f21900q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f21901r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f21890g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f21888e) {
            return this.f21887d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f21886c) {
            return this.f21885b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f21884a;
    }

    public float e() {
        return this.f21894k;
    }

    public int f() {
        return this.f21893j;
    }

    public String g() {
        return this.f21895l;
    }

    public Layout.Alignment h() {
        return this.f21899p;
    }

    public int i() {
        return this.f21897n;
    }

    public int j() {
        return this.f21896m;
    }

    public float k() {
        return this.f21902s;
    }

    public int l() {
        int i10 = this.f21891h;
        if (i10 == -1 && this.f21892i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f21892i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f21898o;
    }

    public boolean n() {
        return this.f21900q == 1;
    }

    public b o() {
        return this.f21901r;
    }

    public boolean p() {
        return this.f21888e;
    }

    public boolean q() {
        return this.f21886c;
    }

    public boolean s() {
        return this.f21889f == 1;
    }

    public boolean t() {
        return this.f21890g == 1;
    }

    public g u(int i10) {
        this.f21887d = i10;
        this.f21888e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f21891h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f21885b = i10;
        this.f21886c = true;
        return this;
    }

    public g x(String str) {
        this.f21884a = str;
        return this;
    }

    public g y(float f10) {
        this.f21894k = f10;
        return this;
    }

    public g z(int i10) {
        this.f21893j = i10;
        return this;
    }
}
