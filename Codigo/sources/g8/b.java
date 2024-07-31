package g8;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import t6.o;
import t8.r0;

/* loaded from: classes.dex */
public final class b implements t6.o {
    public static final b C = new C0262b().o("").a();
    private static final String D = r0.r0(0);
    private static final String E = r0.r0(1);
    private static final String F = r0.r0(2);
    private static final String G = r0.r0(3);
    private static final String H = r0.r0(4);
    private static final String I = r0.r0(5);
    private static final String J = r0.r0(6);
    private static final String K = r0.r0(7);
    private static final String L = r0.r0(8);
    private static final String M = r0.r0(9);
    private static final String N = r0.r0(10);
    private static final String O = r0.r0(11);
    private static final String P = r0.r0(12);
    private static final String Q = r0.r0(13);
    private static final String R = r0.r0(14);
    private static final String S = r0.r0(15);
    private static final String T = r0.r0(16);
    public static final o.a<b> U = new o.a() { // from class: g8.a
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            b d10;
            d10 = b.d(bundle);
            return d10;
        }
    };
    public final int A;
    public final float B;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f16042a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f16043b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f16044c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f16045d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16046e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16047f;

    /* renamed from: r, reason: collision with root package name */
    public final int f16048r;

    /* renamed from: s, reason: collision with root package name */
    public final float f16049s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16050t;

    /* renamed from: u, reason: collision with root package name */
    public final float f16051u;

    /* renamed from: v, reason: collision with root package name */
    public final float f16052v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f16053w;

    /* renamed from: x, reason: collision with root package name */
    public final int f16054x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16055y;

    /* renamed from: z, reason: collision with root package name */
    public final float f16056z;

    /* renamed from: g8.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0262b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f16057a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f16058b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f16059c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f16060d;

        /* renamed from: e, reason: collision with root package name */
        private float f16061e;

        /* renamed from: f, reason: collision with root package name */
        private int f16062f;

        /* renamed from: g, reason: collision with root package name */
        private int f16063g;

        /* renamed from: h, reason: collision with root package name */
        private float f16064h;

        /* renamed from: i, reason: collision with root package name */
        private int f16065i;

        /* renamed from: j, reason: collision with root package name */
        private int f16066j;

        /* renamed from: k, reason: collision with root package name */
        private float f16067k;

        /* renamed from: l, reason: collision with root package name */
        private float f16068l;

        /* renamed from: m, reason: collision with root package name */
        private float f16069m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f16070n;

        /* renamed from: o, reason: collision with root package name */
        private int f16071o;

        /* renamed from: p, reason: collision with root package name */
        private int f16072p;

        /* renamed from: q, reason: collision with root package name */
        private float f16073q;

        public C0262b() {
            this.f16057a = null;
            this.f16058b = null;
            this.f16059c = null;
            this.f16060d = null;
            this.f16061e = -3.4028235E38f;
            this.f16062f = Integer.MIN_VALUE;
            this.f16063g = Integer.MIN_VALUE;
            this.f16064h = -3.4028235E38f;
            this.f16065i = Integer.MIN_VALUE;
            this.f16066j = Integer.MIN_VALUE;
            this.f16067k = -3.4028235E38f;
            this.f16068l = -3.4028235E38f;
            this.f16069m = -3.4028235E38f;
            this.f16070n = false;
            this.f16071o = -16777216;
            this.f16072p = Integer.MIN_VALUE;
        }

        private C0262b(b bVar) {
            this.f16057a = bVar.f16042a;
            this.f16058b = bVar.f16045d;
            this.f16059c = bVar.f16043b;
            this.f16060d = bVar.f16044c;
            this.f16061e = bVar.f16046e;
            this.f16062f = bVar.f16047f;
            this.f16063g = bVar.f16048r;
            this.f16064h = bVar.f16049s;
            this.f16065i = bVar.f16050t;
            this.f16066j = bVar.f16055y;
            this.f16067k = bVar.f16056z;
            this.f16068l = bVar.f16051u;
            this.f16069m = bVar.f16052v;
            this.f16070n = bVar.f16053w;
            this.f16071o = bVar.f16054x;
            this.f16072p = bVar.A;
            this.f16073q = bVar.B;
        }

        public b a() {
            return new b(this.f16057a, this.f16059c, this.f16060d, this.f16058b, this.f16061e, this.f16062f, this.f16063g, this.f16064h, this.f16065i, this.f16066j, this.f16067k, this.f16068l, this.f16069m, this.f16070n, this.f16071o, this.f16072p, this.f16073q);
        }

        public C0262b b() {
            this.f16070n = false;
            return this;
        }

        public int c() {
            return this.f16063g;
        }

        public int d() {
            return this.f16065i;
        }

        public CharSequence e() {
            return this.f16057a;
        }

        public C0262b f(Bitmap bitmap) {
            this.f16058b = bitmap;
            return this;
        }

        public C0262b g(float f10) {
            this.f16069m = f10;
            return this;
        }

        public C0262b h(float f10, int i10) {
            this.f16061e = f10;
            this.f16062f = i10;
            return this;
        }

        public C0262b i(int i10) {
            this.f16063g = i10;
            return this;
        }

        public C0262b j(Layout.Alignment alignment) {
            this.f16060d = alignment;
            return this;
        }

        public C0262b k(float f10) {
            this.f16064h = f10;
            return this;
        }

        public C0262b l(int i10) {
            this.f16065i = i10;
            return this;
        }

        public C0262b m(float f10) {
            this.f16073q = f10;
            return this;
        }

        public C0262b n(float f10) {
            this.f16068l = f10;
            return this;
        }

        public C0262b o(CharSequence charSequence) {
            this.f16057a = charSequence;
            return this;
        }

        public C0262b p(Layout.Alignment alignment) {
            this.f16059c = alignment;
            return this;
        }

        public C0262b q(float f10, int i10) {
            this.f16067k = f10;
            this.f16066j = i10;
            return this;
        }

        public C0262b r(int i10) {
            this.f16072p = i10;
            return this;
        }

        public C0262b s(int i10) {
            this.f16071o = i10;
            this.f16070n = true;
            return this;
        }
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            t8.a.e(bitmap);
        } else {
            t8.a.a(bitmap == null);
        }
        this.f16042a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f16043b = alignment;
        this.f16044c = alignment2;
        this.f16045d = bitmap;
        this.f16046e = f10;
        this.f16047f = i10;
        this.f16048r = i11;
        this.f16049s = f11;
        this.f16050t = i12;
        this.f16051u = f13;
        this.f16052v = f14;
        this.f16053w = z10;
        this.f16054x = i14;
        this.f16055y = i13;
        this.f16056z = f12;
        this.A = i15;
        this.B = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(Bundle bundle) {
        C0262b c0262b = new C0262b();
        CharSequence charSequence = bundle.getCharSequence(D);
        if (charSequence != null) {
            c0262b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(E);
        if (alignment != null) {
            c0262b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(F);
        if (alignment2 != null) {
            c0262b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(G);
        if (bitmap != null) {
            c0262b.f(bitmap);
        }
        String str = H;
        if (bundle.containsKey(str)) {
            String str2 = I;
            if (bundle.containsKey(str2)) {
                c0262b.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = J;
        if (bundle.containsKey(str3)) {
            c0262b.i(bundle.getInt(str3));
        }
        String str4 = K;
        if (bundle.containsKey(str4)) {
            c0262b.k(bundle.getFloat(str4));
        }
        String str5 = L;
        if (bundle.containsKey(str5)) {
            c0262b.l(bundle.getInt(str5));
        }
        String str6 = N;
        if (bundle.containsKey(str6)) {
            String str7 = M;
            if (bundle.containsKey(str7)) {
                c0262b.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = O;
        if (bundle.containsKey(str8)) {
            c0262b.n(bundle.getFloat(str8));
        }
        String str9 = P;
        if (bundle.containsKey(str9)) {
            c0262b.g(bundle.getFloat(str9));
        }
        String str10 = Q;
        if (bundle.containsKey(str10)) {
            c0262b.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(R, false)) {
            c0262b.b();
        }
        String str11 = S;
        if (bundle.containsKey(str11)) {
            c0262b.r(bundle.getInt(str11));
        }
        String str12 = T;
        if (bundle.containsKey(str12)) {
            c0262b.m(bundle.getFloat(str12));
        }
        return c0262b.a();
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(D, this.f16042a);
        bundle.putSerializable(E, this.f16043b);
        bundle.putSerializable(F, this.f16044c);
        bundle.putParcelable(G, this.f16045d);
        bundle.putFloat(H, this.f16046e);
        bundle.putInt(I, this.f16047f);
        bundle.putInt(J, this.f16048r);
        bundle.putFloat(K, this.f16049s);
        bundle.putInt(L, this.f16050t);
        bundle.putInt(M, this.f16055y);
        bundle.putFloat(N, this.f16056z);
        bundle.putFloat(O, this.f16051u);
        bundle.putFloat(P, this.f16052v);
        bundle.putBoolean(R, this.f16053w);
        bundle.putInt(Q, this.f16054x);
        bundle.putInt(S, this.A);
        bundle.putFloat(T, this.B);
        return bundle;
    }

    public C0262b c() {
        return new C0262b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f16042a, bVar.f16042a) && this.f16043b == bVar.f16043b && this.f16044c == bVar.f16044c && ((bitmap = this.f16045d) != null ? !((bitmap2 = bVar.f16045d) == null || !bitmap.sameAs(bitmap2)) : bVar.f16045d == null) && this.f16046e == bVar.f16046e && this.f16047f == bVar.f16047f && this.f16048r == bVar.f16048r && this.f16049s == bVar.f16049s && this.f16050t == bVar.f16050t && this.f16051u == bVar.f16051u && this.f16052v == bVar.f16052v && this.f16053w == bVar.f16053w && this.f16054x == bVar.f16054x && this.f16055y == bVar.f16055y && this.f16056z == bVar.f16056z && this.A == bVar.A && this.B == bVar.B;
    }

    public int hashCode() {
        return eb.k.b(this.f16042a, this.f16043b, this.f16044c, this.f16045d, Float.valueOf(this.f16046e), Integer.valueOf(this.f16047f), Integer.valueOf(this.f16048r), Float.valueOf(this.f16049s), Integer.valueOf(this.f16050t), Float.valueOf(this.f16051u), Float.valueOf(this.f16052v), Boolean.valueOf(this.f16053w), Integer.valueOf(this.f16054x), Integer.valueOf(this.f16055y), Float.valueOf(this.f16056z), Integer.valueOf(this.A), Float.valueOf(this.B));
    }
}
