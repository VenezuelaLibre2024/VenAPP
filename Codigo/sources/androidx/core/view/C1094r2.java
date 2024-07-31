package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C0900g;
import androidx.core.util.C0979c;
import androidx.core.util.C0984h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.r2 */
/* loaded from: classes.dex */
public class C1094r2 {

    /* renamed from: b */
    public static final C1094r2 f4650b;

    /* renamed from: a */
    private final l f4651a;

    /* renamed from: androidx.core.view.r2$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static Field f4652a;

        /* renamed from: b */
        private static Field f4653b;

        /* renamed from: c */
        private static Field f4654c;

        /* renamed from: d */
        private static boolean f4655d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4652a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4653b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4654c = declaredField3;
                declaredField3.setAccessible(true);
                f4655d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        /* renamed from: a */
        public static C1094r2 m5156a(View view) {
            if (f4655d && view.isAttachedToWindow()) {
                try {
                    Object obj = f4652a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f4653b.get(obj);
                        Rect rect2 = (Rect) f4654c.get(obj);
                        if (rect != null && rect2 != null) {
                            C1094r2 m5157a = new b().m5158b(C0900g.m4581c(rect)).m5159c(C0900g.m4581c(rect2)).m5157a();
                            m5157a.m5153r(m5157a);
                            m5157a.m5140d(view.getRootView());
                            return m5157a;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.r2$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final f f4656a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f4656a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(C1094r2 c1094r2) {
            int i10 = Build.VERSION.SDK_INT;
            this.f4656a = i10 >= 30 ? new e(c1094r2) : i10 >= 29 ? new d(c1094r2) : new c(c1094r2);
        }

        /* renamed from: a */
        public C1094r2 m5157a() {
            return this.f4656a.mo5161b();
        }

        @Deprecated
        /* renamed from: b */
        public b m5158b(C0900g c0900g) {
            this.f4656a.mo5162d(c0900g);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public b m5159c(C0900g c0900g) {
            this.f4656a.mo5163f(c0900g);
            return this;
        }
    }

    /* renamed from: androidx.core.view.r2$c */
    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e */
        private static Field f4657e = null;

        /* renamed from: f */
        private static boolean f4658f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f4659g = null;

        /* renamed from: h */
        private static boolean f4660h = false;

        /* renamed from: c */
        private WindowInsets f4661c;

        /* renamed from: d */
        private C0900g f4662d;

        c() {
            this.f4661c = m5160h();
        }

        c(C1094r2 c1094r2) {
            super(c1094r2);
            this.f4661c = c1094r2.m5155t();
        }

        /* renamed from: h */
        private static WindowInsets m5160h() {
            if (!f4658f) {
                try {
                    f4657e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f4658f = true;
            }
            Field field = f4657e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f4660h) {
                try {
                    f4659g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f4660h = true;
            }
            Constructor<WindowInsets> constructor = f4659g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: b */
        C1094r2 mo5161b() {
            m5167a();
            C1094r2 m5135u = C1094r2.m5135u(this.f4661c);
            m5135u.m5151p(this.f4665b);
            m5135u.m5154s(this.f4662d);
            return m5135u;
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: d */
        void mo5162d(C0900g c0900g) {
            this.f4662d = c0900g;
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: f */
        void mo5163f(C0900g c0900g) {
            WindowInsets windowInsets = this.f4661c;
            if (windowInsets != null) {
                this.f4661c = windowInsets.replaceSystemWindowInsets(c0900g.f4390a, c0900g.f4391b, c0900g.f4392c, c0900g.f4393d);
            }
        }
    }

    /* renamed from: androidx.core.view.r2$d */
    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f4663c;

        d() {
            this.f4663c = new WindowInsets.Builder();
        }

        d(C1094r2 c1094r2) {
            super(c1094r2);
            WindowInsets m5155t = c1094r2.m5155t();
            this.f4663c = m5155t != null ? new WindowInsets.Builder(m5155t) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: b */
        C1094r2 mo5161b() {
            WindowInsets build;
            m5167a();
            build = this.f4663c.build();
            C1094r2 m5135u = C1094r2.m5135u(build);
            m5135u.m5151p(this.f4665b);
            return m5135u;
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: c */
        void mo5164c(C0900g c0900g) {
            this.f4663c.setMandatorySystemGestureInsets(c0900g.m4583e());
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: d */
        void mo5162d(C0900g c0900g) {
            this.f4663c.setStableInsets(c0900g.m4583e());
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: e */
        void mo5165e(C0900g c0900g) {
            this.f4663c.setSystemGestureInsets(c0900g.m4583e());
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: f */
        void mo5163f(C0900g c0900g) {
            this.f4663c.setSystemWindowInsets(c0900g.m4583e());
        }

        @Override // androidx.core.view.C1094r2.f
        /* renamed from: g */
        void mo5166g(C0900g c0900g) {
            this.f4663c.setTappableElementInsets(c0900g.m4583e());
        }
    }

    /* renamed from: androidx.core.view.r2$e */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(C1094r2 c1094r2) {
            super(c1094r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.r2$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final C1094r2 f4664a;

        /* renamed from: b */
        C0900g[] f4665b;

        f() {
            this(new C1094r2((C1094r2) null));
        }

        f(C1094r2 c1094r2) {
            this.f4664a = c1094r2;
        }

        /* renamed from: a */
        protected final void m5167a() {
            C0900g[] c0900gArr = this.f4665b;
            if (c0900gArr != null) {
                C0900g c0900g = c0900gArr[m.m5192a(1)];
                C0900g c0900g2 = this.f4665b[m.m5192a(2)];
                if (c0900g2 == null) {
                    c0900g2 = this.f4664a.m5142f(2);
                }
                if (c0900g == null) {
                    c0900g = this.f4664a.m5142f(1);
                }
                mo5163f(C0900g.m4579a(c0900g, c0900g2));
                C0900g c0900g3 = this.f4665b[m.m5192a(16)];
                if (c0900g3 != null) {
                    mo5165e(c0900g3);
                }
                C0900g c0900g4 = this.f4665b[m.m5192a(32)];
                if (c0900g4 != null) {
                    mo5164c(c0900g4);
                }
                C0900g c0900g5 = this.f4665b[m.m5192a(64)];
                if (c0900g5 != null) {
                    mo5166g(c0900g5);
                }
            }
        }

        /* renamed from: b */
        C1094r2 mo5161b() {
            throw null;
        }

        /* renamed from: c */
        void mo5164c(C0900g c0900g) {
        }

        /* renamed from: d */
        void mo5162d(C0900g c0900g) {
            throw null;
        }

        /* renamed from: e */
        void mo5165e(C0900g c0900g) {
        }

        /* renamed from: f */
        void mo5163f(C0900g c0900g) {
            throw null;
        }

        /* renamed from: g */
        void mo5166g(C0900g c0900g) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.r2$g */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h */
        private static boolean f4666h = false;

        /* renamed from: i */
        private static Method f4667i;

        /* renamed from: j */
        private static Class<?> f4668j;

        /* renamed from: k */
        private static Field f4669k;

        /* renamed from: l */
        private static Field f4670l;

        /* renamed from: c */
        final WindowInsets f4671c;

        /* renamed from: d */
        private C0900g[] f4672d;

        /* renamed from: e */
        private C0900g f4673e;

        /* renamed from: f */
        private C1094r2 f4674f;

        /* renamed from: g */
        C0900g f4675g;

        g(C1094r2 c1094r2, WindowInsets windowInsets) {
            super(c1094r2);
            this.f4673e = null;
            this.f4671c = windowInsets;
        }

        g(C1094r2 c1094r2, g gVar) {
            this(c1094r2, new WindowInsets(gVar.f4671c));
        }

        /* renamed from: t */
        private C0900g m5168t(int i10, boolean z10) {
            C0900g c0900g = C0900g.f4389e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c0900g = C0900g.m4579a(c0900g, m5181u(i11, z10));
                }
            }
            return c0900g;
        }

        /* renamed from: v */
        private C0900g m5169v() {
            C1094r2 c1094r2 = this.f4674f;
            return c1094r2 != null ? c1094r2.m5143g() : C0900g.f4389e;
        }

        /* renamed from: w */
        private C0900g m5170w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f4666h) {
                m5171x();
            }
            Method method = f4667i;
            if (method != null && f4668j != null && f4669k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f4669k.get(f4670l.get(invoke));
                    if (rect != null) {
                        return C0900g.m4581c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        /* renamed from: x */
        private static void m5171x() {
            try {
                f4667i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4668j = cls;
                f4669k = cls.getDeclaredField("mVisibleInsets");
                f4670l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f4669k.setAccessible(true);
                f4670l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f4666h = true;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: d */
        void mo5172d(View view) {
            C0900g m5170w = m5170w(view);
            if (m5170w == null) {
                m5170w = C0900g.f4389e;
            }
            mo5179q(m5170w);
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: e */
        void mo5173e(C1094r2 c1094r2) {
            c1094r2.m5153r(this.f4674f);
            c1094r2.m5152q(this.f4675g);
        }

        @Override // androidx.core.view.C1094r2.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f4675g, ((g) obj).f4675g);
            }
            return false;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: g */
        public C0900g mo5174g(int i10) {
            return m5168t(i10, false);
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: k */
        final C0900g mo5175k() {
            if (this.f4673e == null) {
                this.f4673e = C0900g.m4580b(this.f4671c.getSystemWindowInsetLeft(), this.f4671c.getSystemWindowInsetTop(), this.f4671c.getSystemWindowInsetRight(), this.f4671c.getSystemWindowInsetBottom());
            }
            return this.f4673e;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: m */
        C1094r2 mo5176m(int i10, int i11, int i12, int i13) {
            b bVar = new b(C1094r2.m5135u(this.f4671c));
            bVar.m5159c(C1094r2.m5134m(mo5175k(), i10, i11, i12, i13));
            bVar.m5158b(C1094r2.m5134m(mo5184i(), i10, i11, i12, i13));
            return bVar.m5157a();
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: o */
        boolean mo5177o() {
            return this.f4671c.isRound();
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: p */
        public void mo5178p(C0900g[] c0900gArr) {
            this.f4672d = c0900gArr;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: q */
        void mo5179q(C0900g c0900g) {
            this.f4675g = c0900g;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: r */
        void mo5180r(C1094r2 c1094r2) {
            this.f4674f = c1094r2;
        }

        /* renamed from: u */
        protected C0900g m5181u(int i10, boolean z10) {
            C0900g m5143g;
            int i11;
            if (i10 == 1) {
                return z10 ? C0900g.m4580b(0, Math.max(m5169v().f4391b, mo5175k().f4391b), 0, 0) : C0900g.m4580b(0, mo5175k().f4391b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C0900g m5169v = m5169v();
                    C0900g mo5184i = mo5184i();
                    return C0900g.m4580b(Math.max(m5169v.f4390a, mo5184i.f4390a), 0, Math.max(m5169v.f4392c, mo5184i.f4392c), Math.max(m5169v.f4393d, mo5184i.f4393d));
                }
                C0900g mo5175k = mo5175k();
                C1094r2 c1094r2 = this.f4674f;
                m5143g = c1094r2 != null ? c1094r2.m5143g() : null;
                int i12 = mo5175k.f4393d;
                if (m5143g != null) {
                    i12 = Math.min(i12, m5143g.f4393d);
                }
                return C0900g.m4580b(mo5175k.f4390a, 0, mo5175k.f4392c, i12);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return mo5190j();
                }
                if (i10 == 32) {
                    return mo5189h();
                }
                if (i10 == 64) {
                    return mo5191l();
                }
                if (i10 != 128) {
                    return C0900g.f4389e;
                }
                C1094r2 c1094r22 = this.f4674f;
                C1086q m5141e = c1094r22 != null ? c1094r22.m5141e() : mo5188f();
                return m5141e != null ? C0900g.m4580b(m5141e.m5116b(), m5141e.m5118d(), m5141e.m5117c(), m5141e.m5115a()) : C0900g.f4389e;
            }
            C0900g[] c0900gArr = this.f4672d;
            m5143g = c0900gArr != null ? c0900gArr[m.m5192a(8)] : null;
            if (m5143g != null) {
                return m5143g;
            }
            C0900g mo5175k2 = mo5175k();
            C0900g m5169v2 = m5169v();
            int i13 = mo5175k2.f4393d;
            if (i13 > m5169v2.f4393d) {
                return C0900g.m4580b(0, 0, 0, i13);
            }
            C0900g c0900g = this.f4675g;
            return (c0900g == null || c0900g.equals(C0900g.f4389e) || (i11 = this.f4675g.f4393d) <= m5169v2.f4393d) ? C0900g.f4389e : C0900g.m4580b(0, 0, 0, i11);
        }
    }

    /* renamed from: androidx.core.view.r2$h */
    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m */
        private C0900g f4676m;

        h(C1094r2 c1094r2, WindowInsets windowInsets) {
            super(c1094r2, windowInsets);
            this.f4676m = null;
        }

        h(C1094r2 c1094r2, h hVar) {
            super(c1094r2, hVar);
            this.f4676m = null;
            this.f4676m = hVar.f4676m;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: b */
        C1094r2 mo5182b() {
            return C1094r2.m5135u(this.f4671c.consumeStableInsets());
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: c */
        C1094r2 mo5183c() {
            return C1094r2.m5135u(this.f4671c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: i */
        final C0900g mo5184i() {
            if (this.f4676m == null) {
                this.f4676m = C0900g.m4580b(this.f4671c.getStableInsetLeft(), this.f4671c.getStableInsetTop(), this.f4671c.getStableInsetRight(), this.f4671c.getStableInsetBottom());
            }
            return this.f4676m;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: n */
        boolean mo5185n() {
            return this.f4671c.isConsumed();
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: s */
        public void mo5186s(C0900g c0900g) {
            this.f4676m = c0900g;
        }
    }

    /* renamed from: androidx.core.view.r2$i */
    /* loaded from: classes.dex */
    private static class i extends h {
        i(C1094r2 c1094r2, WindowInsets windowInsets) {
            super(c1094r2, windowInsets);
        }

        i(C1094r2 c1094r2, i iVar) {
            super(c1094r2, iVar);
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: a */
        C1094r2 mo5187a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f4671c.consumeDisplayCutout();
            return C1094r2.m5135u(consumeDisplayCutout);
        }

        @Override // androidx.core.view.C1094r2.g, androidx.core.view.C1094r2.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f4671c, iVar.f4671c) && Objects.equals(this.f4675g, iVar.f4675g);
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: f */
        C1086q mo5188f() {
            DisplayCutout displayCutout;
            displayCutout = this.f4671c.getDisplayCutout();
            return C1086q.m5114e(displayCutout);
        }

        @Override // androidx.core.view.C1094r2.l
        public int hashCode() {
            return this.f4671c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.r2$j */
    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n */
        private C0900g f4677n;

        /* renamed from: o */
        private C0900g f4678o;

        /* renamed from: p */
        private C0900g f4679p;

        j(C1094r2 c1094r2, WindowInsets windowInsets) {
            super(c1094r2, windowInsets);
            this.f4677n = null;
            this.f4678o = null;
            this.f4679p = null;
        }

        j(C1094r2 c1094r2, j jVar) {
            super(c1094r2, jVar);
            this.f4677n = null;
            this.f4678o = null;
            this.f4679p = null;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: h */
        C0900g mo5189h() {
            Insets mandatorySystemGestureInsets;
            if (this.f4678o == null) {
                mandatorySystemGestureInsets = this.f4671c.getMandatorySystemGestureInsets();
                this.f4678o = C0900g.m4582d(mandatorySystemGestureInsets);
            }
            return this.f4678o;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: j */
        C0900g mo5190j() {
            Insets systemGestureInsets;
            if (this.f4677n == null) {
                systemGestureInsets = this.f4671c.getSystemGestureInsets();
                this.f4677n = C0900g.m4582d(systemGestureInsets);
            }
            return this.f4677n;
        }

        @Override // androidx.core.view.C1094r2.l
        /* renamed from: l */
        C0900g mo5191l() {
            Insets tappableElementInsets;
            if (this.f4679p == null) {
                tappableElementInsets = this.f4671c.getTappableElementInsets();
                this.f4679p = C0900g.m4582d(tappableElementInsets);
            }
            return this.f4679p;
        }

        @Override // androidx.core.view.C1094r2.g, androidx.core.view.C1094r2.l
        /* renamed from: m */
        C1094r2 mo5176m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f4671c.inset(i10, i11, i12, i13);
            return C1094r2.m5135u(inset);
        }

        @Override // androidx.core.view.C1094r2.h, androidx.core.view.C1094r2.l
        /* renamed from: s */
        public void mo5186s(C0900g c0900g) {
        }
    }

    /* renamed from: androidx.core.view.r2$k */
    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q */
        static final C1094r2 f4680q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f4680q = C1094r2.m5135u(windowInsets);
        }

        k(C1094r2 c1094r2, WindowInsets windowInsets) {
            super(c1094r2, windowInsets);
        }

        k(C1094r2 c1094r2, k kVar) {
            super(c1094r2, kVar);
        }

        @Override // androidx.core.view.C1094r2.g, androidx.core.view.C1094r2.l
        /* renamed from: d */
        final void mo5172d(View view) {
        }

        @Override // androidx.core.view.C1094r2.g, androidx.core.view.C1094r2.l
        /* renamed from: g */
        public C0900g mo5174g(int i10) {
            Insets insets;
            insets = this.f4671c.getInsets(n.m5193a(i10));
            return C0900g.m4582d(insets);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.r2$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b */
        static final C1094r2 f4681b = new b().m5157a().m5137a().m5138b().m5139c();

        /* renamed from: a */
        final C1094r2 f4682a;

        l(C1094r2 c1094r2) {
            this.f4682a = c1094r2;
        }

        /* renamed from: a */
        C1094r2 mo5187a() {
            return this.f4682a;
        }

        /* renamed from: b */
        C1094r2 mo5182b() {
            return this.f4682a;
        }

        /* renamed from: c */
        C1094r2 mo5183c() {
            return this.f4682a;
        }

        /* renamed from: d */
        void mo5172d(View view) {
        }

        /* renamed from: e */
        void mo5173e(C1094r2 c1094r2) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo5177o() == lVar.mo5177o() && mo5185n() == lVar.mo5185n() && C0979c.m4812a(mo5175k(), lVar.mo5175k()) && C0979c.m4812a(mo5184i(), lVar.mo5184i()) && C0979c.m4812a(mo5188f(), lVar.mo5188f());
        }

        /* renamed from: f */
        C1086q mo5188f() {
            return null;
        }

        /* renamed from: g */
        C0900g mo5174g(int i10) {
            return C0900g.f4389e;
        }

        /* renamed from: h */
        C0900g mo5189h() {
            return mo5175k();
        }

        public int hashCode() {
            return C0979c.m4813b(Boolean.valueOf(mo5177o()), Boolean.valueOf(mo5185n()), mo5175k(), mo5184i(), mo5188f());
        }

        /* renamed from: i */
        C0900g mo5184i() {
            return C0900g.f4389e;
        }

        /* renamed from: j */
        C0900g mo5190j() {
            return mo5175k();
        }

        /* renamed from: k */
        C0900g mo5175k() {
            return C0900g.f4389e;
        }

        /* renamed from: l */
        C0900g mo5191l() {
            return mo5175k();
        }

        /* renamed from: m */
        C1094r2 mo5176m(int i10, int i11, int i12, int i13) {
            return f4681b;
        }

        /* renamed from: n */
        boolean mo5185n() {
            return false;
        }

        /* renamed from: o */
        boolean mo5177o() {
            return false;
        }

        /* renamed from: p */
        public void mo5178p(C0900g[] c0900gArr) {
        }

        /* renamed from: q */
        void mo5179q(C0900g c0900g) {
        }

        /* renamed from: r */
        void mo5180r(C1094r2 c1094r2) {
        }

        /* renamed from: s */
        public void mo5186s(C0900g c0900g) {
        }
    }

    /* renamed from: androidx.core.view.r2$m */
    /* loaded from: classes.dex */
    public static final class m {
        /* renamed from: a */
        static int m5192a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    /* renamed from: androidx.core.view.r2$n */
    /* loaded from: classes.dex */
    private static final class n {
        /* renamed from: a */
        static int m5193a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        f4650b = Build.VERSION.SDK_INT >= 30 ? k.f4680q : l.f4681b;
    }

    private C1094r2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f4651a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public C1094r2(C1094r2 c1094r2) {
        if (c1094r2 == null) {
            this.f4651a = new l(this);
            return;
        }
        l lVar = c1094r2.f4651a;
        int i10 = Build.VERSION.SDK_INT;
        this.f4651a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.mo5173e(this);
    }

    /* renamed from: m */
    static C0900g m5134m(C0900g c0900g, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, c0900g.f4390a - i10);
        int max2 = Math.max(0, c0900g.f4391b - i11);
        int max3 = Math.max(0, c0900g.f4392c - i12);
        int max4 = Math.max(0, c0900g.f4393d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? c0900g : C0900g.m4580b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C1094r2 m5135u(WindowInsets windowInsets) {
        return m5136v(windowInsets, null);
    }

    /* renamed from: v */
    public static C1094r2 m5136v(WindowInsets windowInsets, View view) {
        C1094r2 c1094r2 = new C1094r2((WindowInsets) C0984h.m4833k(windowInsets));
        if (view != null && C1116x0.m5242G(view)) {
            c1094r2.m5153r(C1116x0.m5300y(view));
            c1094r2.m5140d(view.getRootView());
        }
        return c1094r2;
    }

    @Deprecated
    /* renamed from: a */
    public C1094r2 m5137a() {
        return this.f4651a.mo5187a();
    }

    @Deprecated
    /* renamed from: b */
    public C1094r2 m5138b() {
        return this.f4651a.mo5182b();
    }

    @Deprecated
    /* renamed from: c */
    public C1094r2 m5139c() {
        return this.f4651a.mo5183c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5140d(View view) {
        this.f4651a.mo5172d(view);
    }

    /* renamed from: e */
    public C1086q m5141e() {
        return this.f4651a.mo5188f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1094r2) {
            return C0979c.m4812a(this.f4651a, ((C1094r2) obj).f4651a);
        }
        return false;
    }

    /* renamed from: f */
    public C0900g m5142f(int i10) {
        return this.f4651a.mo5174g(i10);
    }

    @Deprecated
    /* renamed from: g */
    public C0900g m5143g() {
        return this.f4651a.mo5184i();
    }

    @Deprecated
    /* renamed from: h */
    public int m5144h() {
        return this.f4651a.mo5175k().f4393d;
    }

    public int hashCode() {
        l lVar = this.f4651a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m5145i() {
        return this.f4651a.mo5175k().f4390a;
    }

    @Deprecated
    /* renamed from: j */
    public int m5146j() {
        return this.f4651a.mo5175k().f4392c;
    }

    @Deprecated
    /* renamed from: k */
    public int m5147k() {
        return this.f4651a.mo5175k().f4391b;
    }

    /* renamed from: l */
    public C1094r2 m5148l(int i10, int i11, int i12, int i13) {
        return this.f4651a.mo5176m(i10, i11, i12, i13);
    }

    /* renamed from: n */
    public boolean m5149n() {
        return this.f4651a.mo5185n();
    }

    @Deprecated
    /* renamed from: o */
    public C1094r2 m5150o(int i10, int i11, int i12, int i13) {
        return new b(this).m5159c(C0900g.m4580b(i10, i11, i12, i13)).m5157a();
    }

    /* renamed from: p */
    void m5151p(C0900g[] c0900gArr) {
        this.f4651a.mo5178p(c0900gArr);
    }

    /* renamed from: q */
    void m5152q(C0900g c0900g) {
        this.f4651a.mo5179q(c0900g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m5153r(C1094r2 c1094r2) {
        this.f4651a.mo5180r(c1094r2);
    }

    /* renamed from: s */
    void m5154s(C0900g c0900g) {
        this.f4651a.mo5186s(c0900g);
    }

    /* renamed from: t */
    public WindowInsets m5155t() {
        l lVar = this.f4651a;
        if (lVar instanceof g) {
            return ((g) lVar).f4671c;
        }
        return null;
    }
}
