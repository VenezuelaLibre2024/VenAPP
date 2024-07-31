package p456y3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC2121g;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;
import p022b4.C1655c;
import p036c4.C1861b;
import p036c4.C1870k;
import p036c4.C1871l;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.EnumC7618b;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7628l;
import p171j3.AbstractC8963j;
import p302q3.C10241g0;
import p302q3.C10251q;
import p302q3.C10253s;
import p346s3.C10792j;
import p373u3.C11308c;
import p373u3.C11311f;
import p373u3.C11314i;
import p456y3.AbstractC12586a;

/* renamed from: y3.a */
/* loaded from: classes.dex */
public abstract class AbstractC12586a<T extends AbstractC12586a<T>> implements Cloneable {

    /* renamed from: A */
    private int f34100A;

    /* renamed from: E */
    private boolean f34104E;

    /* renamed from: F */
    private Resources.Theme f34105F;

    /* renamed from: G */
    private boolean f34106G;

    /* renamed from: H */
    private boolean f34107H;

    /* renamed from: I */
    private boolean f34108I;

    /* renamed from: K */
    private boolean f34110K;

    /* renamed from: a */
    private int f34111a;

    /* renamed from: e */
    private Drawable f34115e;

    /* renamed from: f */
    private int f34116f;

    /* renamed from: r */
    private Drawable f34117r;

    /* renamed from: s */
    private int f34118s;

    /* renamed from: x */
    private boolean f34123x;

    /* renamed from: z */
    private Drawable f34125z;

    /* renamed from: b */
    private float f34112b = 1.0f;

    /* renamed from: c */
    private AbstractC8963j f34113c = AbstractC8963j.f21392e;

    /* renamed from: d */
    private EnumC2121g f34114d = EnumC2121g.NORMAL;

    /* renamed from: t */
    private boolean f34119t = true;

    /* renamed from: u */
    private int f34120u = -1;

    /* renamed from: v */
    private int f34121v = -1;

    /* renamed from: w */
    private InterfaceC7622f f34122w = C1655c.m9115c();

    /* renamed from: y */
    private boolean f34124y = true;

    /* renamed from: B */
    private C7624h f34101B = new C7624h();

    /* renamed from: C */
    private Map<Class<?>, InterfaceC7628l<?>> f34102C = new C1861b();

    /* renamed from: D */
    private Class<?> f34103D = Object.class;

    /* renamed from: J */
    private boolean f34109J = true;

    /* renamed from: I */
    private boolean m41329I(int i10) {
        return m41330J(this.f34111a, i10);
    }

    /* renamed from: J */
    private static boolean m41330J(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: S */
    private T m41331S() {
        return this;
    }

    /* renamed from: A */
    public final Resources.Theme m41332A() {
        return this.f34105F;
    }

    /* renamed from: B */
    public final Map<Class<?>, InterfaceC7628l<?>> m41333B() {
        return this.f34102C;
    }

    /* renamed from: C */
    public final boolean m41334C() {
        return this.f34110K;
    }

    /* renamed from: D */
    public final boolean m41335D() {
        return this.f34107H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean m41336E() {
        return this.f34106G;
    }

    /* renamed from: F */
    public final boolean m41337F() {
        return this.f34119t;
    }

    /* renamed from: G */
    public final boolean m41338G() {
        return m41329I(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean m41339H() {
        return this.f34109J;
    }

    /* renamed from: K */
    public final boolean m41340K() {
        return this.f34123x;
    }

    /* renamed from: L */
    public final boolean m41341L() {
        return C1871l.m9971t(this.f34121v, this.f34120u);
    }

    /* renamed from: M */
    public T m41342M() {
        this.f34104E = true;
        return m41331S();
    }

    /* renamed from: N */
    public T m41343N(int i10, int i11) {
        if (this.f34106G) {
            return (T) clone().m41343N(i10, i11);
        }
        this.f34121v = i10;
        this.f34120u = i11;
        this.f34111a |= RecognitionOptions.UPC_A;
        return m41347T();
    }

    /* renamed from: O */
    public T m41344O(int i10) {
        if (this.f34106G) {
            return (T) clone().m41344O(i10);
        }
        this.f34118s = i10;
        int i11 = this.f34111a | RecognitionOptions.ITF;
        this.f34117r = null;
        this.f34111a = i11 & (-65);
        return m41347T();
    }

    /* renamed from: P */
    public T m41345P(EnumC2121g enumC2121g) {
        if (this.f34106G) {
            return (T) clone().m41345P(enumC2121g);
        }
        this.f34114d = (EnumC2121g) C1870k.m9950d(enumC2121g);
        this.f34111a |= 8;
        return m41347T();
    }

    /* renamed from: R */
    T m41346R(C7623g<?> c7623g) {
        if (this.f34106G) {
            return (T) clone().m41346R(c7623g);
        }
        this.f34101B.m23149e(c7623g);
        return m41347T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public final T m41347T() {
        if (this.f34104E) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m41331S();
    }

    /* renamed from: U */
    public <Y> T m41348U(C7623g<Y> c7623g, Y y10) {
        if (this.f34106G) {
            return (T) clone().m41348U(c7623g, y10);
        }
        C1870k.m9950d(c7623g);
        C1870k.m9950d(y10);
        this.f34101B.m23150f(c7623g, y10);
        return m41347T();
    }

    /* renamed from: V */
    public T m41349V(InterfaceC7622f interfaceC7622f) {
        if (this.f34106G) {
            return (T) clone().m41349V(interfaceC7622f);
        }
        this.f34122w = (InterfaceC7622f) C1870k.m9950d(interfaceC7622f);
        this.f34111a |= RecognitionOptions.UPC_E;
        return m41347T();
    }

    /* renamed from: W */
    public T m41350W(float f10) {
        if (this.f34106G) {
            return (T) clone().m41350W(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f34112b = f10;
        this.f34111a |= 2;
        return m41347T();
    }

    /* renamed from: X */
    public T m41351X(boolean z10) {
        if (this.f34106G) {
            return (T) clone().m41351X(true);
        }
        this.f34119t = !z10;
        this.f34111a |= RecognitionOptions.QR_CODE;
        return m41347T();
    }

    /* renamed from: Y */
    public T m41352Y(Resources.Theme theme) {
        if (this.f34106G) {
            return (T) clone().m41352Y(theme);
        }
        this.f34105F = theme;
        if (theme != null) {
            this.f34111a |= RecognitionOptions.TEZ_CODE;
            return m41348U(C10792j.f27245b, theme);
        }
        this.f34111a &= -32769;
        return m41346R(C10792j.f27245b);
    }

    /* renamed from: Z */
    public T m41353Z(InterfaceC7628l<Bitmap> interfaceC7628l) {
        return m41355b0(interfaceC7628l, true);
    }

    /* renamed from: a */
    public T mo10708a(AbstractC12586a<?> abstractC12586a) {
        if (this.f34106G) {
            return (T) clone().mo10708a(abstractC12586a);
        }
        if (m41330J(abstractC12586a.f34111a, 2)) {
            this.f34112b = abstractC12586a.f34112b;
        }
        if (m41330J(abstractC12586a.f34111a, 262144)) {
            this.f34107H = abstractC12586a.f34107H;
        }
        if (m41330J(abstractC12586a.f34111a, 1048576)) {
            this.f34110K = abstractC12586a.f34110K;
        }
        if (m41330J(abstractC12586a.f34111a, 4)) {
            this.f34113c = abstractC12586a.f34113c;
        }
        if (m41330J(abstractC12586a.f34111a, 8)) {
            this.f34114d = abstractC12586a.f34114d;
        }
        if (m41330J(abstractC12586a.f34111a, 16)) {
            this.f34115e = abstractC12586a.f34115e;
            this.f34116f = 0;
            this.f34111a &= -33;
        }
        if (m41330J(abstractC12586a.f34111a, 32)) {
            this.f34116f = abstractC12586a.f34116f;
            this.f34115e = null;
            this.f34111a &= -17;
        }
        if (m41330J(abstractC12586a.f34111a, 64)) {
            this.f34117r = abstractC12586a.f34117r;
            this.f34118s = 0;
            this.f34111a &= -129;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.ITF)) {
            this.f34118s = abstractC12586a.f34118s;
            this.f34117r = null;
            this.f34111a &= -65;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.QR_CODE)) {
            this.f34119t = abstractC12586a.f34119t;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.UPC_A)) {
            this.f34121v = abstractC12586a.f34121v;
            this.f34120u = abstractC12586a.f34120u;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.UPC_E)) {
            this.f34122w = abstractC12586a.f34122w;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.AZTEC)) {
            this.f34103D = abstractC12586a.f34103D;
        }
        if (m41330J(abstractC12586a.f34111a, 8192)) {
            this.f34125z = abstractC12586a.f34125z;
            this.f34100A = 0;
            this.f34111a &= -16385;
        }
        if (m41330J(abstractC12586a.f34111a, 16384)) {
            this.f34100A = abstractC12586a.f34100A;
            this.f34125z = null;
            this.f34111a &= -8193;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.TEZ_CODE)) {
            this.f34105F = abstractC12586a.f34105F;
        }
        if (m41330J(abstractC12586a.f34111a, 65536)) {
            this.f34124y = abstractC12586a.f34124y;
        }
        if (m41330J(abstractC12586a.f34111a, 131072)) {
            this.f34123x = abstractC12586a.f34123x;
        }
        if (m41330J(abstractC12586a.f34111a, RecognitionOptions.PDF417)) {
            this.f34102C.putAll(abstractC12586a.f34102C);
            this.f34109J = abstractC12586a.f34109J;
        }
        if (m41330J(abstractC12586a.f34111a, 524288)) {
            this.f34108I = abstractC12586a.f34108I;
        }
        if (!this.f34124y) {
            this.f34102C.clear();
            int i10 = this.f34111a & (-2049);
            this.f34123x = false;
            this.f34111a = i10 & (-131073);
            this.f34109J = true;
        }
        this.f34111a |= abstractC12586a.f34111a;
        this.f34101B.m23148d(abstractC12586a.f34101B);
        return m41347T();
    }

    /* renamed from: b */
    public T m41354b() {
        if (this.f34104E && !this.f34106G) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f34106G = true;
        return m41342M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b0 */
    T m41355b0(InterfaceC7628l<Bitmap> interfaceC7628l, boolean z10) {
        if (this.f34106G) {
            return (T) clone().m41355b0(interfaceC7628l, z10);
        }
        C10253s c10253s = new C10253s(interfaceC7628l, z10);
        m41357d0(Bitmap.class, interfaceC7628l, z10);
        m41357d0(Drawable.class, c10253s, z10);
        m41357d0(BitmapDrawable.class, c10253s.m30693c(), z10);
        m41357d0(C11308c.class, new C11311f(interfaceC7628l), z10);
        return m41347T();
    }

    @Override // 
    /* renamed from: c */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            C7624h c7624h = new C7624h();
            t10.f34101B = c7624h;
            c7624h.m23148d(this.f34101B);
            C1861b c1861b = new C1861b();
            t10.f34102C = c1861b;
            c1861b.putAll(this.f34102C);
            t10.f34104E = false;
            t10.f34106G = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d */
    public T m41356d(Class<?> cls) {
        if (this.f34106G) {
            return (T) clone().m41356d(cls);
        }
        this.f34103D = (Class) C1870k.m9950d(cls);
        this.f34111a |= RecognitionOptions.AZTEC;
        return m41347T();
    }

    /* renamed from: d0 */
    <Y> T m41357d0(Class<Y> cls, InterfaceC7628l<Y> interfaceC7628l, boolean z10) {
        if (this.f34106G) {
            return (T) clone().m41357d0(cls, interfaceC7628l, z10);
        }
        C1870k.m9950d(cls);
        C1870k.m9950d(interfaceC7628l);
        this.f34102C.put(cls, interfaceC7628l);
        int i10 = this.f34111a | RecognitionOptions.PDF417;
        this.f34124y = true;
        int i11 = i10 | 65536;
        this.f34111a = i11;
        this.f34109J = false;
        if (z10) {
            this.f34111a = i11 | 131072;
            this.f34123x = true;
        }
        return m41347T();
    }

    /* renamed from: e */
    public T m41358e(AbstractC8963j abstractC8963j) {
        if (this.f34106G) {
            return (T) clone().m41358e(abstractC8963j);
        }
        this.f34113c = (AbstractC8963j) C1870k.m9950d(abstractC8963j);
        this.f34111a |= 4;
        return m41347T();
    }

    /* renamed from: e0 */
    public T m41359e0(boolean z10) {
        if (this.f34106G) {
            return (T) clone().m41359e0(z10);
        }
        this.f34110K = z10;
        this.f34111a |= 1048576;
        return m41347T();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC12586a)) {
            return false;
        }
        AbstractC12586a abstractC12586a = (AbstractC12586a) obj;
        return Float.compare(abstractC12586a.f34112b, this.f34112b) == 0 && this.f34116f == abstractC12586a.f34116f && C1871l.m9955d(this.f34115e, abstractC12586a.f34115e) && this.f34118s == abstractC12586a.f34118s && C1871l.m9955d(this.f34117r, abstractC12586a.f34117r) && this.f34100A == abstractC12586a.f34100A && C1871l.m9955d(this.f34125z, abstractC12586a.f34125z) && this.f34119t == abstractC12586a.f34119t && this.f34120u == abstractC12586a.f34120u && this.f34121v == abstractC12586a.f34121v && this.f34123x == abstractC12586a.f34123x && this.f34124y == abstractC12586a.f34124y && this.f34107H == abstractC12586a.f34107H && this.f34108I == abstractC12586a.f34108I && this.f34113c.equals(abstractC12586a.f34113c) && this.f34114d == abstractC12586a.f34114d && this.f34101B.equals(abstractC12586a.f34101B) && this.f34102C.equals(abstractC12586a.f34102C) && this.f34103D.equals(abstractC12586a.f34103D) && C1871l.m9955d(this.f34122w, abstractC12586a.f34122w) && C1871l.m9955d(this.f34105F, abstractC12586a.f34105F);
    }

    /* renamed from: g */
    public T m41360g(EnumC7618b enumC7618b) {
        C1870k.m9950d(enumC7618b);
        return (T) m41348U(C10251q.f25423f, enumC7618b).m41348U(C11314i.f29370a, enumC7618b);
    }

    /* renamed from: h */
    public T m41361h(long j10) {
        return m41348U(C10241g0.f25397d, Long.valueOf(j10));
    }

    public int hashCode() {
        return C1871l.m9966o(this.f34105F, C1871l.m9966o(this.f34122w, C1871l.m9966o(this.f34103D, C1871l.m9966o(this.f34102C, C1871l.m9966o(this.f34101B, C1871l.m9966o(this.f34114d, C1871l.m9966o(this.f34113c, C1871l.m9967p(this.f34108I, C1871l.m9967p(this.f34107H, C1871l.m9967p(this.f34124y, C1871l.m9967p(this.f34123x, C1871l.m9965n(this.f34121v, C1871l.m9965n(this.f34120u, C1871l.m9967p(this.f34119t, C1871l.m9966o(this.f34125z, C1871l.m9965n(this.f34100A, C1871l.m9966o(this.f34117r, C1871l.m9965n(this.f34118s, C1871l.m9966o(this.f34115e, C1871l.m9965n(this.f34116f, C1871l.m9963l(this.f34112b)))))))))))))))))))));
    }

    /* renamed from: i */
    public final AbstractC8963j m41362i() {
        return this.f34113c;
    }

    /* renamed from: j */
    public final int m41363j() {
        return this.f34116f;
    }

    /* renamed from: k */
    public final Drawable m41364k() {
        return this.f34115e;
    }

    /* renamed from: l */
    public final Drawable m41365l() {
        return this.f34125z;
    }

    /* renamed from: m */
    public final int m41366m() {
        return this.f34100A;
    }

    /* renamed from: p */
    public final boolean m41367p() {
        return this.f34108I;
    }

    /* renamed from: q */
    public final C7624h m41368q() {
        return this.f34101B;
    }

    /* renamed from: r */
    public final int m41369r() {
        return this.f34120u;
    }

    /* renamed from: s */
    public final int m41370s() {
        return this.f34121v;
    }

    /* renamed from: t */
    public final Drawable m41371t() {
        return this.f34117r;
    }

    /* renamed from: u */
    public final int m41372u() {
        return this.f34118s;
    }

    /* renamed from: v */
    public final EnumC2121g m41373v() {
        return this.f34114d;
    }

    /* renamed from: w */
    public final Class<?> m41374w() {
        return this.f34103D;
    }

    /* renamed from: x */
    public final InterfaceC7622f m41375x() {
        return this.f34122w;
    }

    /* renamed from: z */
    public final float m41376z() {
        return this.f34112b;
    }
}
