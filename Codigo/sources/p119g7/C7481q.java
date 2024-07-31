package p119g7;

import p363t8.C11146e0;
import p459y6.InterfaceC12622l;

/* renamed from: g7.q */
/* loaded from: classes.dex */
final class C7481q {

    /* renamed from: a */
    public C7467c f17609a;

    /* renamed from: b */
    public long f17610b;

    /* renamed from: c */
    public long f17611c;

    /* renamed from: d */
    public long f17612d;

    /* renamed from: e */
    public int f17613e;

    /* renamed from: f */
    public int f17614f;

    /* renamed from: l */
    public boolean f17620l;

    /* renamed from: n */
    public C7480p f17622n;

    /* renamed from: p */
    public boolean f17624p;

    /* renamed from: q */
    public long f17625q;

    /* renamed from: r */
    public boolean f17626r;

    /* renamed from: g */
    public long[] f17615g = new long[0];

    /* renamed from: h */
    public int[] f17616h = new int[0];

    /* renamed from: i */
    public int[] f17617i = new int[0];

    /* renamed from: j */
    public long[] f17618j = new long[0];

    /* renamed from: k */
    public boolean[] f17619k = new boolean[0];

    /* renamed from: m */
    public boolean[] f17621m = new boolean[0];

    /* renamed from: o */
    public final C11146e0 f17623o = new C11146e0();

    /* renamed from: a */
    public void m22750a(C11146e0 c11146e0) {
        c11146e0.m34688l(this.f17623o.m34682e(), 0, this.f17623o.m34684g());
        this.f17623o.m34677U(0);
        this.f17624p = false;
    }

    /* renamed from: b */
    public void m22751b(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.readFully(this.f17623o.m34682e(), 0, this.f17623o.m34684g());
        this.f17623o.m34677U(0);
        this.f17624p = false;
    }

    /* renamed from: c */
    public long m22752c(int i10) {
        return this.f17618j[i10];
    }

    /* renamed from: d */
    public void m22753d(int i10) {
        this.f17623o.m34673Q(i10);
        this.f17620l = true;
        this.f17624p = true;
    }

    /* renamed from: e */
    public void m22754e(int i10, int i11) {
        this.f17613e = i10;
        this.f17614f = i11;
        if (this.f17616h.length < i10) {
            this.f17615g = new long[i10];
            this.f17616h = new int[i10];
        }
        if (this.f17617i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f17617i = new int[i12];
            this.f17618j = new long[i12];
            this.f17619k = new boolean[i12];
            this.f17621m = new boolean[i12];
        }
    }

    /* renamed from: f */
    public void m22755f() {
        this.f17613e = 0;
        this.f17625q = 0L;
        this.f17626r = false;
        this.f17620l = false;
        this.f17624p = false;
        this.f17622n = null;
    }

    /* renamed from: g */
    public boolean m22756g(int i10) {
        return this.f17620l && this.f17621m[i10];
    }
}
