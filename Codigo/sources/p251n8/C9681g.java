package p251n8;

import android.text.Layout;

/* renamed from: n8.g */
/* loaded from: classes.dex */
final class C9681g {

    /* renamed from: a */
    private String f23817a;

    /* renamed from: b */
    private int f23818b;

    /* renamed from: c */
    private boolean f23819c;

    /* renamed from: d */
    private int f23820d;

    /* renamed from: e */
    private boolean f23821e;

    /* renamed from: k */
    private float f23827k;

    /* renamed from: l */
    private String f23828l;

    /* renamed from: o */
    private Layout.Alignment f23831o;

    /* renamed from: p */
    private Layout.Alignment f23832p;

    /* renamed from: r */
    private C9676b f23834r;

    /* renamed from: f */
    private int f23822f = -1;

    /* renamed from: g */
    private int f23823g = -1;

    /* renamed from: h */
    private int f23824h = -1;

    /* renamed from: i */
    private int f23825i = -1;

    /* renamed from: j */
    private int f23826j = -1;

    /* renamed from: m */
    private int f23829m = -1;

    /* renamed from: n */
    private int f23830n = -1;

    /* renamed from: q */
    private int f23833q = -1;

    /* renamed from: s */
    private float f23835s = Float.MAX_VALUE;

    /* renamed from: r */
    private C9681g m29025r(C9681g c9681g, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c9681g != null) {
            if (!this.f23819c && c9681g.f23819c) {
                m29058w(c9681g.f23818b);
            }
            if (this.f23824h == -1) {
                this.f23824h = c9681g.f23824h;
            }
            if (this.f23825i == -1) {
                this.f23825i = c9681g.f23825i;
            }
            if (this.f23817a == null && (str = c9681g.f23817a) != null) {
                this.f23817a = str;
            }
            if (this.f23822f == -1) {
                this.f23822f = c9681g.f23822f;
            }
            if (this.f23823g == -1) {
                this.f23823g = c9681g.f23823g;
            }
            if (this.f23830n == -1) {
                this.f23830n = c9681g.f23830n;
            }
            if (this.f23831o == null && (alignment2 = c9681g.f23831o) != null) {
                this.f23831o = alignment2;
            }
            if (this.f23832p == null && (alignment = c9681g.f23832p) != null) {
                this.f23832p = alignment;
            }
            if (this.f23833q == -1) {
                this.f23833q = c9681g.f23833q;
            }
            if (this.f23826j == -1) {
                this.f23826j = c9681g.f23826j;
                this.f23827k = c9681g.f23827k;
            }
            if (this.f23834r == null) {
                this.f23834r = c9681g.f23834r;
            }
            if (this.f23835s == Float.MAX_VALUE) {
                this.f23835s = c9681g.f23835s;
            }
            if (z10 && !this.f23821e && c9681g.f23821e) {
                m29056u(c9681g.f23820d);
            }
            if (z10 && this.f23829m == -1 && (i10 = c9681g.f23829m) != -1) {
                this.f23829m = i10;
            }
        }
        return this;
    }

    /* renamed from: A */
    public C9681g m29026A(String str) {
        this.f23828l = str;
        return this;
    }

    /* renamed from: B */
    public C9681g m29027B(boolean z10) {
        this.f23825i = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C9681g m29028C(boolean z10) {
        this.f23822f = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public C9681g m29029D(Layout.Alignment alignment) {
        this.f23832p = alignment;
        return this;
    }

    /* renamed from: E */
    public C9681g m29030E(int i10) {
        this.f23830n = i10;
        return this;
    }

    /* renamed from: F */
    public C9681g m29031F(int i10) {
        this.f23829m = i10;
        return this;
    }

    /* renamed from: G */
    public C9681g m29032G(float f10) {
        this.f23835s = f10;
        return this;
    }

    /* renamed from: H */
    public C9681g m29033H(Layout.Alignment alignment) {
        this.f23831o = alignment;
        return this;
    }

    /* renamed from: I */
    public C9681g m29034I(boolean z10) {
        this.f23833q = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public C9681g m29035J(C9676b c9676b) {
        this.f23834r = c9676b;
        return this;
    }

    /* renamed from: K */
    public C9681g m29036K(boolean z10) {
        this.f23823g = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C9681g m29037a(C9681g c9681g) {
        return m29025r(c9681g, true);
    }

    /* renamed from: b */
    public int m29038b() {
        if (this.f23821e) {
            return this.f23820d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m29039c() {
        if (this.f23819c) {
            return this.f23818b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m29040d() {
        return this.f23817a;
    }

    /* renamed from: e */
    public float m29041e() {
        return this.f23827k;
    }

    /* renamed from: f */
    public int m29042f() {
        return this.f23826j;
    }

    /* renamed from: g */
    public String m29043g() {
        return this.f23828l;
    }

    /* renamed from: h */
    public Layout.Alignment m29044h() {
        return this.f23832p;
    }

    /* renamed from: i */
    public int m29045i() {
        return this.f23830n;
    }

    /* renamed from: j */
    public int m29046j() {
        return this.f23829m;
    }

    /* renamed from: k */
    public float m29047k() {
        return this.f23835s;
    }

    /* renamed from: l */
    public int m29048l() {
        int i10 = this.f23824h;
        if (i10 == -1 && this.f23825i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f23825i == 1 ? 2 : 0);
    }

    /* renamed from: m */
    public Layout.Alignment m29049m() {
        return this.f23831o;
    }

    /* renamed from: n */
    public boolean m29050n() {
        return this.f23833q == 1;
    }

    /* renamed from: o */
    public C9676b m29051o() {
        return this.f23834r;
    }

    /* renamed from: p */
    public boolean m29052p() {
        return this.f23821e;
    }

    /* renamed from: q */
    public boolean m29053q() {
        return this.f23819c;
    }

    /* renamed from: s */
    public boolean m29054s() {
        return this.f23822f == 1;
    }

    /* renamed from: t */
    public boolean m29055t() {
        return this.f23823g == 1;
    }

    /* renamed from: u */
    public C9681g m29056u(int i10) {
        this.f23820d = i10;
        this.f23821e = true;
        return this;
    }

    /* renamed from: v */
    public C9681g m29057v(boolean z10) {
        this.f23824h = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C9681g m29058w(int i10) {
        this.f23818b = i10;
        this.f23819c = true;
        return this;
    }

    /* renamed from: x */
    public C9681g m29059x(String str) {
        this.f23817a = str;
        return this;
    }

    /* renamed from: y */
    public C9681g m29060y(float f10) {
        this.f23827k = f10;
        return this;
    }

    /* renamed from: z */
    public C9681g m29061z(int i10) {
        this.f23826j = i10;
        return this;
    }
}
