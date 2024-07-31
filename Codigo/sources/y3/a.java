package y3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;
import q3.g0;
import q3.q;
import q3.s;
import y3.a;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private int A;
    private boolean E;
    private Resources.Theme F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean K;

    /* renamed from: a */
    private int f31580a;

    /* renamed from: e */
    private Drawable f31584e;

    /* renamed from: f */
    private int f31585f;

    /* renamed from: r */
    private Drawable f31586r;

    /* renamed from: s */
    private int f31587s;

    /* renamed from: x */
    private boolean f31592x;

    /* renamed from: z */
    private Drawable f31594z;

    /* renamed from: b */
    private float f31581b = 1.0f;

    /* renamed from: c */
    private j3.j f31582c = j3.j.f19624e;

    /* renamed from: d */
    private com.bumptech.glide.g f31583d = com.bumptech.glide.g.NORMAL;

    /* renamed from: t */
    private boolean f31588t = true;

    /* renamed from: u */
    private int f31589u = -1;

    /* renamed from: v */
    private int f31590v = -1;

    /* renamed from: w */
    private h3.f f31591w = b4.c.c();

    /* renamed from: y */
    private boolean f31593y = true;
    private h3.h B = new h3.h();
    private Map<Class<?>, h3.l<?>> C = new c4.b();
    private Class<?> D = Object.class;
    private boolean J = true;

    private boolean I(int i10) {
        return J(this.f31580a, i10);
    }

    private static boolean J(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T S() {
        return this;
    }

    public final Resources.Theme A() {
        return this.F;
    }

    public final Map<Class<?>, h3.l<?>> B() {
        return this.C;
    }

    public final boolean C() {
        return this.K;
    }

    public final boolean D() {
        return this.H;
    }

    public final boolean E() {
        return this.G;
    }

    public final boolean F() {
        return this.f31588t;
    }

    public final boolean G() {
        return I(8);
    }

    public boolean H() {
        return this.J;
    }

    public final boolean K() {
        return this.f31592x;
    }

    public final boolean L() {
        return c4.l.t(this.f31590v, this.f31589u);
    }

    public T M() {
        this.E = true;
        return S();
    }

    public T N(int i10, int i11) {
        if (this.G) {
            return (T) clone().N(i10, i11);
        }
        this.f31590v = i10;
        this.f31589u = i11;
        this.f31580a |= RecognitionOptions.UPC_A;
        return T();
    }

    public T O(int i10) {
        if (this.G) {
            return (T) clone().O(i10);
        }
        this.f31587s = i10;
        int i11 = this.f31580a | RecognitionOptions.ITF;
        this.f31586r = null;
        this.f31580a = i11 & (-65);
        return T();
    }

    public T P(com.bumptech.glide.g gVar) {
        if (this.G) {
            return (T) clone().P(gVar);
        }
        this.f31583d = (com.bumptech.glide.g) c4.k.d(gVar);
        this.f31580a |= 8;
        return T();
    }

    T R(h3.g<?> gVar) {
        if (this.G) {
            return (T) clone().R(gVar);
        }
        this.B.e(gVar);
        return T();
    }

    public final T T() {
        if (this.E) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return S();
    }

    public <Y> T U(h3.g<Y> gVar, Y y10) {
        if (this.G) {
            return (T) clone().U(gVar, y10);
        }
        c4.k.d(gVar);
        c4.k.d(y10);
        this.B.f(gVar, y10);
        return T();
    }

    public T V(h3.f fVar) {
        if (this.G) {
            return (T) clone().V(fVar);
        }
        this.f31591w = (h3.f) c4.k.d(fVar);
        this.f31580a |= RecognitionOptions.UPC_E;
        return T();
    }

    public T W(float f10) {
        if (this.G) {
            return (T) clone().W(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f31581b = f10;
        this.f31580a |= 2;
        return T();
    }

    public T X(boolean z10) {
        if (this.G) {
            return (T) clone().X(true);
        }
        this.f31588t = !z10;
        this.f31580a |= RecognitionOptions.QR_CODE;
        return T();
    }

    public T Y(Resources.Theme theme) {
        if (this.G) {
            return (T) clone().Y(theme);
        }
        this.F = theme;
        if (theme != null) {
            this.f31580a |= RecognitionOptions.TEZ_CODE;
            return U(s3.j.f25126b, theme);
        }
        this.f31580a &= -32769;
        return R(s3.j.f25126b);
    }

    public T Z(h3.l<Bitmap> lVar) {
        return b0(lVar, true);
    }

    public T a(a<?> aVar) {
        if (this.G) {
            return (T) clone().a(aVar);
        }
        if (J(aVar.f31580a, 2)) {
            this.f31581b = aVar.f31581b;
        }
        if (J(aVar.f31580a, 262144)) {
            this.H = aVar.H;
        }
        if (J(aVar.f31580a, 1048576)) {
            this.K = aVar.K;
        }
        if (J(aVar.f31580a, 4)) {
            this.f31582c = aVar.f31582c;
        }
        if (J(aVar.f31580a, 8)) {
            this.f31583d = aVar.f31583d;
        }
        if (J(aVar.f31580a, 16)) {
            this.f31584e = aVar.f31584e;
            this.f31585f = 0;
            this.f31580a &= -33;
        }
        if (J(aVar.f31580a, 32)) {
            this.f31585f = aVar.f31585f;
            this.f31584e = null;
            this.f31580a &= -17;
        }
        if (J(aVar.f31580a, 64)) {
            this.f31586r = aVar.f31586r;
            this.f31587s = 0;
            this.f31580a &= -129;
        }
        if (J(aVar.f31580a, RecognitionOptions.ITF)) {
            this.f31587s = aVar.f31587s;
            this.f31586r = null;
            this.f31580a &= -65;
        }
        if (J(aVar.f31580a, RecognitionOptions.QR_CODE)) {
            this.f31588t = aVar.f31588t;
        }
        if (J(aVar.f31580a, RecognitionOptions.UPC_A)) {
            this.f31590v = aVar.f31590v;
            this.f31589u = aVar.f31589u;
        }
        if (J(aVar.f31580a, RecognitionOptions.UPC_E)) {
            this.f31591w = aVar.f31591w;
        }
        if (J(aVar.f31580a, RecognitionOptions.AZTEC)) {
            this.D = aVar.D;
        }
        if (J(aVar.f31580a, 8192)) {
            this.f31594z = aVar.f31594z;
            this.A = 0;
            this.f31580a &= -16385;
        }
        if (J(aVar.f31580a, 16384)) {
            this.A = aVar.A;
            this.f31594z = null;
            this.f31580a &= -8193;
        }
        if (J(aVar.f31580a, RecognitionOptions.TEZ_CODE)) {
            this.F = aVar.F;
        }
        if (J(aVar.f31580a, 65536)) {
            this.f31593y = aVar.f31593y;
        }
        if (J(aVar.f31580a, 131072)) {
            this.f31592x = aVar.f31592x;
        }
        if (J(aVar.f31580a, RecognitionOptions.PDF417)) {
            this.C.putAll(aVar.C);
            this.J = aVar.J;
        }
        if (J(aVar.f31580a, 524288)) {
            this.I = aVar.I;
        }
        if (!this.f31593y) {
            this.C.clear();
            int i10 = this.f31580a & (-2049);
            this.f31592x = false;
            this.f31580a = i10 & (-131073);
            this.J = true;
        }
        this.f31580a |= aVar.f31580a;
        this.B.d(aVar.B);
        return T();
    }

    public T b() {
        if (this.E && !this.G) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.G = true;
        return M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    T b0(h3.l<Bitmap> lVar, boolean z10) {
        if (this.G) {
            return (T) clone().b0(lVar, z10);
        }
        s sVar = new s(lVar, z10);
        d0(Bitmap.class, lVar, z10);
        d0(Drawable.class, sVar, z10);
        d0(BitmapDrawable.class, sVar.c(), z10);
        d0(u3.c.class, new u3.f(lVar), z10);
        return T();
    }

    @Override // 
    /* renamed from: c */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            h3.h hVar = new h3.h();
            t10.B = hVar;
            hVar.d(this.B);
            c4.b bVar = new c4.b();
            t10.C = bVar;
            bVar.putAll(this.C);
            t10.E = false;
            t10.G = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T d(Class<?> cls) {
        if (this.G) {
            return (T) clone().d(cls);
        }
        this.D = (Class) c4.k.d(cls);
        this.f31580a |= RecognitionOptions.AZTEC;
        return T();
    }

    <Y> T d0(Class<Y> cls, h3.l<Y> lVar, boolean z10) {
        if (this.G) {
            return (T) clone().d0(cls, lVar, z10);
        }
        c4.k.d(cls);
        c4.k.d(lVar);
        this.C.put(cls, lVar);
        int i10 = this.f31580a | RecognitionOptions.PDF417;
        this.f31593y = true;
        int i11 = i10 | 65536;
        this.f31580a = i11;
        this.J = false;
        if (z10) {
            this.f31580a = i11 | 131072;
            this.f31592x = true;
        }
        return T();
    }

    public T e(j3.j jVar) {
        if (this.G) {
            return (T) clone().e(jVar);
        }
        this.f31582c = (j3.j) c4.k.d(jVar);
        this.f31580a |= 4;
        return T();
    }

    public T e0(boolean z10) {
        if (this.G) {
            return (T) clone().e0(z10);
        }
        this.K = z10;
        this.f31580a |= 1048576;
        return T();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f31581b, this.f31581b) == 0 && this.f31585f == aVar.f31585f && c4.l.d(this.f31584e, aVar.f31584e) && this.f31587s == aVar.f31587s && c4.l.d(this.f31586r, aVar.f31586r) && this.A == aVar.A && c4.l.d(this.f31594z, aVar.f31594z) && this.f31588t == aVar.f31588t && this.f31589u == aVar.f31589u && this.f31590v == aVar.f31590v && this.f31592x == aVar.f31592x && this.f31593y == aVar.f31593y && this.H == aVar.H && this.I == aVar.I && this.f31582c.equals(aVar.f31582c) && this.f31583d == aVar.f31583d && this.B.equals(aVar.B) && this.C.equals(aVar.C) && this.D.equals(aVar.D) && c4.l.d(this.f31591w, aVar.f31591w) && c4.l.d(this.F, aVar.F);
    }

    public T g(h3.b bVar) {
        c4.k.d(bVar);
        return (T) U(q.f23455f, bVar).U(u3.i.f27068a, bVar);
    }

    public T h(long j10) {
        return U(g0.f23429d, Long.valueOf(j10));
    }

    public int hashCode() {
        return c4.l.o(this.F, c4.l.o(this.f31591w, c4.l.o(this.D, c4.l.o(this.C, c4.l.o(this.B, c4.l.o(this.f31583d, c4.l.o(this.f31582c, c4.l.p(this.I, c4.l.p(this.H, c4.l.p(this.f31593y, c4.l.p(this.f31592x, c4.l.n(this.f31590v, c4.l.n(this.f31589u, c4.l.p(this.f31588t, c4.l.o(this.f31594z, c4.l.n(this.A, c4.l.o(this.f31586r, c4.l.n(this.f31587s, c4.l.o(this.f31584e, c4.l.n(this.f31585f, c4.l.l(this.f31581b)))))))))))))))))))));
    }

    public final j3.j i() {
        return this.f31582c;
    }

    public final int j() {
        return this.f31585f;
    }

    public final Drawable k() {
        return this.f31584e;
    }

    public final Drawable l() {
        return this.f31594z;
    }

    public final int m() {
        return this.A;
    }

    public final boolean p() {
        return this.I;
    }

    public final h3.h q() {
        return this.B;
    }

    public final int r() {
        return this.f31589u;
    }

    public final int s() {
        return this.f31590v;
    }

    public final Drawable t() {
        return this.f31586r;
    }

    public final int u() {
        return this.f31587s;
    }

    public final com.bumptech.glide.g v() {
        return this.f31583d;
    }

    public final Class<?> w() {
        return this.D;
    }

    public final h3.f x() {
        return this.f31591w;
    }

    public final float z() {
        return this.f31581b;
    }
}
