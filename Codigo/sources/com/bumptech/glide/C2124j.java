package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p022b4.C1653a;
import p036c4.C1864e;
import p036c4.C1870k;
import p036c4.C1871l;
import p171j3.AbstractC8963j;
import p456y3.AbstractC12586a;
import p456y3.C12587b;
import p456y3.C12592g;
import p456y3.C12594i;
import p456y3.C12596k;
import p456y3.C12597l;
import p456y3.InterfaceC12590e;
import p456y3.InterfaceC12591f;
import p456y3.InterfaceC12593h;
import p456y3.InterfaceFutureC12589d;
import p478z3.InterfaceC12798d;

/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public class C2124j<TranscodeType> extends AbstractC12586a<C2124j<TranscodeType>> {

    /* renamed from: Z */
    protected static final C12594i f8366Z = new C12594i().m41358e(AbstractC8963j.f21390c).m41345P(EnumC2121g.LOW).m41351X(true);

    /* renamed from: L */
    private final Context f8367L;

    /* renamed from: M */
    private final ComponentCallbacks2C2125k f8368M;

    /* renamed from: N */
    private final Class<TranscodeType> f8369N;

    /* renamed from: O */
    private final ComponentCallbacks2C2116b f8370O;

    /* renamed from: P */
    private final C2118d f8371P;

    /* renamed from: Q */
    private AbstractC2126l<?, ? super TranscodeType> f8372Q;

    /* renamed from: R */
    private Object f8373R;

    /* renamed from: S */
    private List<InterfaceC12593h<TranscodeType>> f8374S;

    /* renamed from: T */
    private C2124j<TranscodeType> f8375T;

    /* renamed from: U */
    private C2124j<TranscodeType> f8376U;

    /* renamed from: V */
    private Float f8377V;

    /* renamed from: W */
    private boolean f8378W = true;

    /* renamed from: X */
    private boolean f8379X;

    /* renamed from: Y */
    private boolean f8380Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8381a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8382b;

        static {
            int[] iArr = new int[EnumC2121g.values().length];
            f8382b = iArr;
            try {
                iArr[EnumC2121g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8382b[EnumC2121g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8382b[EnumC2121g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8382b[EnumC2121g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f8381a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8381a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8381a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8381a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8381a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8381a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8381a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8381a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2124j(ComponentCallbacks2C2116b componentCallbacks2C2116b, ComponentCallbacks2C2125k componentCallbacks2C2125k, Class<TranscodeType> cls, Context context) {
        this.f8370O = componentCallbacks2C2116b;
        this.f8368M = componentCallbacks2C2125k;
        this.f8369N = cls;
        this.f8367L = context;
        this.f8372Q = componentCallbacks2C2125k.m10727p(cls);
        this.f8371P = componentCallbacks2C2116b.m10654j();
        m10702n0(componentCallbacks2C2125k.m10725n());
        mo10708a(componentCallbacks2C2125k.m10726o());
    }

    /* renamed from: h0 */
    private C2124j<TranscodeType> m10697h0(C2124j<TranscodeType> c2124j) {
        return c2124j.m41352Y(this.f8367L.getTheme()).m41349V(C1653a.m9109c(this.f8367L));
    }

    /* renamed from: i0 */
    private InterfaceC12590e m10698i0(InterfaceC12798d<TranscodeType> interfaceC12798d, InterfaceC12593h<TranscodeType> interfaceC12593h, AbstractC12586a<?> abstractC12586a, Executor executor) {
        return m10699j0(new Object(), interfaceC12798d, interfaceC12593h, null, this.f8372Q, abstractC12586a.m41373v(), abstractC12586a.m41370s(), abstractC12586a.m41369r(), abstractC12586a, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j0 */
    private InterfaceC12590e m10699j0(Object obj, InterfaceC12798d<TranscodeType> interfaceC12798d, InterfaceC12593h<TranscodeType> interfaceC12593h, InterfaceC12591f interfaceC12591f, AbstractC2126l<?, ? super TranscodeType> abstractC2126l, EnumC2121g enumC2121g, int i10, int i11, AbstractC12586a<?> abstractC12586a, Executor executor) {
        InterfaceC12591f interfaceC12591f2;
        InterfaceC12591f interfaceC12591f3;
        if (this.f8376U != null) {
            interfaceC12591f3 = new C12587b(obj, interfaceC12591f);
            interfaceC12591f2 = interfaceC12591f3;
        } else {
            interfaceC12591f2 = null;
            interfaceC12591f3 = interfaceC12591f;
        }
        InterfaceC12590e m10700k0 = m10700k0(obj, interfaceC12798d, interfaceC12593h, interfaceC12591f3, abstractC2126l, enumC2121g, i10, i11, abstractC12586a, executor);
        if (interfaceC12591f2 == null) {
            return m10700k0;
        }
        int m41370s = this.f8376U.m41370s();
        int m41369r = this.f8376U.m41369r();
        if (C1871l.m9971t(i10, i11) && !this.f8376U.m41341L()) {
            m41370s = abstractC12586a.m41370s();
            m41369r = abstractC12586a.m41369r();
        }
        C2124j<TranscodeType> c2124j = this.f8376U;
        C12587b c12587b = interfaceC12591f2;
        c12587b.m41391o(m10700k0, c2124j.m10699j0(obj, interfaceC12798d, interfaceC12593h, c12587b, c2124j.f8372Q, c2124j.m41373v(), m41370s, m41369r, this.f8376U, executor));
        return c12587b;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [y3.a] */
    /* renamed from: k0 */
    private InterfaceC12590e m10700k0(Object obj, InterfaceC12798d<TranscodeType> interfaceC12798d, InterfaceC12593h<TranscodeType> interfaceC12593h, InterfaceC12591f interfaceC12591f, AbstractC2126l<?, ? super TranscodeType> abstractC2126l, EnumC2121g enumC2121g, int i10, int i11, AbstractC12586a<?> abstractC12586a, Executor executor) {
        C2124j<TranscodeType> c2124j = this.f8375T;
        if (c2124j == null) {
            if (this.f8377V == null) {
                return m10707x0(obj, interfaceC12798d, interfaceC12593h, abstractC12586a, interfaceC12591f, abstractC2126l, enumC2121g, i10, i11, executor);
            }
            C12597l c12597l = new C12597l(obj, interfaceC12591f);
            c12597l.m41431n(m10707x0(obj, interfaceC12798d, interfaceC12593h, abstractC12586a, c12597l, abstractC2126l, enumC2121g, i10, i11, executor), m10707x0(obj, interfaceC12798d, interfaceC12593h, abstractC12586a.clone().m41350W(this.f8377V.floatValue()), c12597l, abstractC2126l, m10701m0(enumC2121g), i10, i11, executor));
            return c12597l;
        }
        if (this.f8380Y) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC2126l<?, ? super TranscodeType> abstractC2126l2 = c2124j.f8378W ? abstractC2126l : c2124j.f8372Q;
        EnumC2121g m41373v = c2124j.m41338G() ? this.f8375T.m41373v() : m10701m0(enumC2121g);
        int m41370s = this.f8375T.m41370s();
        int m41369r = this.f8375T.m41369r();
        if (C1871l.m9971t(i10, i11) && !this.f8375T.m41341L()) {
            m41370s = abstractC12586a.m41370s();
            m41369r = abstractC12586a.m41369r();
        }
        C12597l c12597l2 = new C12597l(obj, interfaceC12591f);
        InterfaceC12590e m10707x0 = m10707x0(obj, interfaceC12798d, interfaceC12593h, abstractC12586a, c12597l2, abstractC2126l, enumC2121g, i10, i11, executor);
        this.f8380Y = true;
        C2124j<TranscodeType> c2124j2 = this.f8375T;
        InterfaceC12590e m10699j0 = c2124j2.m10699j0(obj, interfaceC12798d, interfaceC12593h, c12597l2, abstractC2126l2, m41373v, m41370s, m41369r, c2124j2, executor);
        this.f8380Y = false;
        c12597l2.m41431n(m10707x0, m10699j0);
        return c12597l2;
    }

    /* renamed from: m0 */
    private EnumC2121g m10701m0(EnumC2121g enumC2121g) {
        int i10 = a.f8382b[enumC2121g.ordinal()];
        if (i10 == 1) {
            return EnumC2121g.NORMAL;
        }
        if (i10 == 2) {
            return EnumC2121g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC2121g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m41373v());
    }

    /* renamed from: n0 */
    private void m10702n0(List<InterfaceC12593h<Object>> list) {
        Iterator<InterfaceC12593h<Object>> it = list.iterator();
        while (it.hasNext()) {
            m10710f0((InterfaceC12593h) it.next());
        }
    }

    /* renamed from: q0 */
    private <Y extends InterfaceC12798d<TranscodeType>> Y m10703q0(Y y10, InterfaceC12593h<TranscodeType> interfaceC12593h, AbstractC12586a<?> abstractC12586a, Executor executor) {
        C1870k.m9950d(y10);
        if (!this.f8379X) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC12590e m10698i0 = m10698i0(y10, interfaceC12593h, abstractC12586a, executor);
        InterfaceC12590e mo41397f = y10.mo41397f();
        if (m10698i0.mo41388h(mo41397f) && !m10704r0(abstractC12586a, mo41397f)) {
            if (!((InterfaceC12590e) C1870k.m9950d(mo41397f)).isRunning()) {
                mo41397f.mo41390j();
            }
            return y10;
        }
        this.f8368M.m10724m(y10);
        y10.mo41398h(m10698i0);
        this.f8368M.m10734w(y10, m10698i0);
        return y10;
    }

    /* renamed from: r0 */
    private boolean m10704r0(AbstractC12586a<?> abstractC12586a, InterfaceC12590e interfaceC12590e) {
        return !abstractC12586a.m41337F() && interfaceC12590e.mo41387g();
    }

    /* renamed from: v0 */
    private C2124j<TranscodeType> m10705v0(Object obj) {
        if (m41336E()) {
            return mo10709c().m10705v0(obj);
        }
        this.f8373R = obj;
        this.f8379X = true;
        return m41347T();
    }

    /* renamed from: w0 */
    private C2124j<TranscodeType> m10706w0(Uri uri, C2124j<TranscodeType> c2124j) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? c2124j : m10697h0(c2124j);
    }

    /* renamed from: x0 */
    private InterfaceC12590e m10707x0(Object obj, InterfaceC12798d<TranscodeType> interfaceC12798d, InterfaceC12593h<TranscodeType> interfaceC12593h, AbstractC12586a<?> abstractC12586a, InterfaceC12591f interfaceC12591f, AbstractC2126l<?, ? super TranscodeType> abstractC2126l, EnumC2121g enumC2121g, int i10, int i11, Executor executor) {
        Context context = this.f8367L;
        C2118d c2118d = this.f8371P;
        return C12596k.m41425y(context, c2118d, obj, this.f8373R, this.f8369N, abstractC12586a, i10, i11, enumC2121g, interfaceC12798d, interfaceC12593h, this.f8374S, interfaceC12591f, c2118d.m10667e(), abstractC2126l.m10738b(), executor);
    }

    @Override // p456y3.AbstractC12586a
    public boolean equals(Object obj) {
        if (!(obj instanceof C2124j)) {
            return false;
        }
        C2124j c2124j = (C2124j) obj;
        return super.equals(c2124j) && Objects.equals(this.f8369N, c2124j.f8369N) && this.f8372Q.equals(c2124j.f8372Q) && Objects.equals(this.f8373R, c2124j.f8373R) && Objects.equals(this.f8374S, c2124j.f8374S) && Objects.equals(this.f8375T, c2124j.f8375T) && Objects.equals(this.f8376U, c2124j.f8376U) && Objects.equals(this.f8377V, c2124j.f8377V) && this.f8378W == c2124j.f8378W && this.f8379X == c2124j.f8379X;
    }

    /* renamed from: f0 */
    public C2124j<TranscodeType> m10710f0(InterfaceC12593h<TranscodeType> interfaceC12593h) {
        if (m41336E()) {
            return mo10709c().m10710f0(interfaceC12593h);
        }
        if (interfaceC12593h != null) {
            if (this.f8374S == null) {
                this.f8374S = new ArrayList();
            }
            this.f8374S.add(interfaceC12593h);
        }
        return m41347T();
    }

    @Override // p456y3.AbstractC12586a
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C2124j<TranscodeType> mo10708a(AbstractC12586a<?> abstractC12586a) {
        C1870k.m9950d(abstractC12586a);
        return (C2124j) super.mo10708a(abstractC12586a);
    }

    @Override // p456y3.AbstractC12586a
    public int hashCode() {
        return C1871l.m9967p(this.f8379X, C1871l.m9967p(this.f8378W, C1871l.m9966o(this.f8377V, C1871l.m9966o(this.f8376U, C1871l.m9966o(this.f8375T, C1871l.m9966o(this.f8374S, C1871l.m9966o(this.f8373R, C1871l.m9966o(this.f8372Q, C1871l.m9966o(this.f8369N, super.hashCode())))))))));
    }

    @Override // p456y3.AbstractC12586a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2124j<TranscodeType> clone() {
        C2124j<TranscodeType> c2124j = (C2124j) super.clone();
        c2124j.f8372Q = (AbstractC2126l<?, ? super TranscodeType>) c2124j.f8372Q.clone();
        if (c2124j.f8374S != null) {
            c2124j.f8374S = new ArrayList(c2124j.f8374S);
        }
        C2124j<TranscodeType> c2124j2 = c2124j.f8375T;
        if (c2124j2 != null) {
            c2124j.f8375T = c2124j2.mo10709c();
        }
        C2124j<TranscodeType> c2124j3 = c2124j.f8376U;
        if (c2124j3 != null) {
            c2124j.f8376U = c2124j3.mo10709c();
        }
        return c2124j;
    }

    /* renamed from: o0 */
    public <Y extends InterfaceC12798d<TranscodeType>> Y m10713o0(Y y10) {
        return (Y) m10714p0(y10, null, C1864e.m9931b());
    }

    /* renamed from: p0 */
    <Y extends InterfaceC12798d<TranscodeType>> Y m10714p0(Y y10, InterfaceC12593h<TranscodeType> interfaceC12593h, Executor executor) {
        return (Y) m10703q0(y10, interfaceC12593h, this, executor);
    }

    /* renamed from: s0 */
    public C2124j<TranscodeType> m10715s0(Uri uri) {
        return m10706w0(uri, m10705v0(uri));
    }

    /* renamed from: t0 */
    public C2124j<TranscodeType> m10716t0(Object obj) {
        return m10705v0(obj);
    }

    /* renamed from: u0 */
    public C2124j<TranscodeType> m10717u0(String str) {
        return m10705v0(str);
    }

    /* renamed from: y0 */
    public InterfaceFutureC12589d<TranscodeType> m10718y0(int i10, int i11) {
        C12592g c12592g = new C12592g(i10, i11);
        return (InterfaceFutureC12589d) m10714p0(c12592g, c12592g, C1864e.m9930a());
    }
}
