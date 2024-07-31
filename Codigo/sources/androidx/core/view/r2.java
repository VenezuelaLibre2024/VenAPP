package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class r2 {

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f3958b;

    /* renamed from: a, reason: collision with root package name */
    private final l f3959a;

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f3960a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f3961b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f3962c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f3963d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3960a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3961b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3962c = declaredField3;
                declaredField3.setAccessible(true);
                f3963d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static r2 a(View view) {
            if (f3963d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3960a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3961b.get(obj);
                        Rect rect2 = (Rect) f3962c.get(obj);
                        if (rect != null && rect2 != null) {
                            r2 a10 = new b().b(androidx.core.graphics.g.c(rect)).c(androidx.core.graphics.g.c(rect2)).a();
                            a10.r(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f3964a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f3964a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(r2 r2Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f3964a = i10 >= 30 ? new e(r2Var) : i10 >= 29 ? new d(r2Var) : new c(r2Var);
        }

        public r2 a() {
            return this.f3964a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.g gVar) {
            this.f3964a.d(gVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.g gVar) {
            this.f3964a.f(gVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f3965e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f3966f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f3967g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f3968h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f3969c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.g f3970d;

        c() {
            this.f3969c = h();
        }

        c(r2 r2Var) {
            super(r2Var);
            this.f3969c = r2Var.t();
        }

        private static WindowInsets h() {
            if (!f3966f) {
                try {
                    f3965e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3966f = true;
            }
            Field field = f3965e;
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
            if (!f3968h) {
                try {
                    f3967g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f3968h = true;
            }
            Constructor<WindowInsets> constructor = f3967g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.r2.f
        r2 b() {
            a();
            r2 u10 = r2.u(this.f3969c);
            u10.p(this.f3973b);
            u10.s(this.f3970d);
            return u10;
        }

        @Override // androidx.core.view.r2.f
        void d(androidx.core.graphics.g gVar) {
            this.f3970d = gVar;
        }

        @Override // androidx.core.view.r2.f
        void f(androidx.core.graphics.g gVar) {
            WindowInsets windowInsets = this.f3969c;
            if (windowInsets != null) {
                this.f3969c = windowInsets.replaceSystemWindowInsets(gVar.f3718a, gVar.f3719b, gVar.f3720c, gVar.f3721d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f3971c;

        d() {
            this.f3971c = new WindowInsets.Builder();
        }

        d(r2 r2Var) {
            super(r2Var);
            WindowInsets t10 = r2Var.t();
            this.f3971c = t10 != null ? new WindowInsets.Builder(t10) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.r2.f
        r2 b() {
            WindowInsets build;
            a();
            build = this.f3971c.build();
            r2 u10 = r2.u(build);
            u10.p(this.f3973b);
            return u10;
        }

        @Override // androidx.core.view.r2.f
        void c(androidx.core.graphics.g gVar) {
            this.f3971c.setMandatorySystemGestureInsets(gVar.e());
        }

        @Override // androidx.core.view.r2.f
        void d(androidx.core.graphics.g gVar) {
            this.f3971c.setStableInsets(gVar.e());
        }

        @Override // androidx.core.view.r2.f
        void e(androidx.core.graphics.g gVar) {
            this.f3971c.setSystemGestureInsets(gVar.e());
        }

        @Override // androidx.core.view.r2.f
        void f(androidx.core.graphics.g gVar) {
            this.f3971c.setSystemWindowInsets(gVar.e());
        }

        @Override // androidx.core.view.r2.f
        void g(androidx.core.graphics.g gVar) {
            this.f3971c.setTappableElementInsets(gVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(r2 r2Var) {
            super(r2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final r2 f3972a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.g[] f3973b;

        f() {
            this(new r2((r2) null));
        }

        f(r2 r2Var) {
            this.f3972a = r2Var;
        }

        protected final void a() {
            androidx.core.graphics.g[] gVarArr = this.f3973b;
            if (gVarArr != null) {
                androidx.core.graphics.g gVar = gVarArr[m.a(1)];
                androidx.core.graphics.g gVar2 = this.f3973b[m.a(2)];
                if (gVar2 == null) {
                    gVar2 = this.f3972a.f(2);
                }
                if (gVar == null) {
                    gVar = this.f3972a.f(1);
                }
                f(androidx.core.graphics.g.a(gVar, gVar2));
                androidx.core.graphics.g gVar3 = this.f3973b[m.a(16)];
                if (gVar3 != null) {
                    e(gVar3);
                }
                androidx.core.graphics.g gVar4 = this.f3973b[m.a(32)];
                if (gVar4 != null) {
                    c(gVar4);
                }
                androidx.core.graphics.g gVar5 = this.f3973b[m.a(64)];
                if (gVar5 != null) {
                    g(gVar5);
                }
            }
        }

        r2 b() {
            throw null;
        }

        void c(androidx.core.graphics.g gVar) {
        }

        void d(androidx.core.graphics.g gVar) {
            throw null;
        }

        void e(androidx.core.graphics.g gVar) {
        }

        void f(androidx.core.graphics.g gVar) {
            throw null;
        }

        void g(androidx.core.graphics.g gVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f3974h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f3975i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f3976j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f3977k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f3978l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f3979c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.g[] f3980d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.g f3981e;

        /* renamed from: f, reason: collision with root package name */
        private r2 f3982f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.g f3983g;

        g(r2 r2Var, WindowInsets windowInsets) {
            super(r2Var);
            this.f3981e = null;
            this.f3979c = windowInsets;
        }

        g(r2 r2Var, g gVar) {
            this(r2Var, new WindowInsets(gVar.f3979c));
        }

        private androidx.core.graphics.g t(int i10, boolean z10) {
            androidx.core.graphics.g gVar = androidx.core.graphics.g.f3717e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    gVar = androidx.core.graphics.g.a(gVar, u(i11, z10));
                }
            }
            return gVar;
        }

        private androidx.core.graphics.g v() {
            r2 r2Var = this.f3982f;
            return r2Var != null ? r2Var.g() : androidx.core.graphics.g.f3717e;
        }

        private androidx.core.graphics.g w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3974h) {
                x();
            }
            Method method = f3975i;
            if (method != null && f3976j != null && f3977k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3977k.get(f3978l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.g.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        private static void x() {
            try {
                f3975i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3976j = cls;
                f3977k = cls.getDeclaredField("mVisibleInsets");
                f3978l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3977k.setAccessible(true);
                f3978l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f3974h = true;
        }

        @Override // androidx.core.view.r2.l
        void d(View view) {
            androidx.core.graphics.g w10 = w(view);
            if (w10 == null) {
                w10 = androidx.core.graphics.g.f3717e;
            }
            q(w10);
        }

        @Override // androidx.core.view.r2.l
        void e(r2 r2Var) {
            r2Var.r(this.f3982f);
            r2Var.q(this.f3983g);
        }

        @Override // androidx.core.view.r2.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3983g, ((g) obj).f3983g);
            }
            return false;
        }

        @Override // androidx.core.view.r2.l
        public androidx.core.graphics.g g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.r2.l
        final androidx.core.graphics.g k() {
            if (this.f3981e == null) {
                this.f3981e = androidx.core.graphics.g.b(this.f3979c.getSystemWindowInsetLeft(), this.f3979c.getSystemWindowInsetTop(), this.f3979c.getSystemWindowInsetRight(), this.f3979c.getSystemWindowInsetBottom());
            }
            return this.f3981e;
        }

        @Override // androidx.core.view.r2.l
        r2 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(r2.u(this.f3979c));
            bVar.c(r2.m(k(), i10, i11, i12, i13));
            bVar.b(r2.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.r2.l
        boolean o() {
            return this.f3979c.isRound();
        }

        @Override // androidx.core.view.r2.l
        public void p(androidx.core.graphics.g[] gVarArr) {
            this.f3980d = gVarArr;
        }

        @Override // androidx.core.view.r2.l
        void q(androidx.core.graphics.g gVar) {
            this.f3983g = gVar;
        }

        @Override // androidx.core.view.r2.l
        void r(r2 r2Var) {
            this.f3982f = r2Var;
        }

        protected androidx.core.graphics.g u(int i10, boolean z10) {
            androidx.core.graphics.g g10;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.g.b(0, Math.max(v().f3719b, k().f3719b), 0, 0) : androidx.core.graphics.g.b(0, k().f3719b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.g v10 = v();
                    androidx.core.graphics.g i12 = i();
                    return androidx.core.graphics.g.b(Math.max(v10.f3718a, i12.f3718a), 0, Math.max(v10.f3720c, i12.f3720c), Math.max(v10.f3721d, i12.f3721d));
                }
                androidx.core.graphics.g k10 = k();
                r2 r2Var = this.f3982f;
                g10 = r2Var != null ? r2Var.g() : null;
                int i13 = k10.f3721d;
                if (g10 != null) {
                    i13 = Math.min(i13, g10.f3721d);
                }
                return androidx.core.graphics.g.b(k10.f3718a, 0, k10.f3720c, i13);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.g.f3717e;
                }
                r2 r2Var2 = this.f3982f;
                q e10 = r2Var2 != null ? r2Var2.e() : f();
                return e10 != null ? androidx.core.graphics.g.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.g.f3717e;
            }
            androidx.core.graphics.g[] gVarArr = this.f3980d;
            g10 = gVarArr != null ? gVarArr[m.a(8)] : null;
            if (g10 != null) {
                return g10;
            }
            androidx.core.graphics.g k11 = k();
            androidx.core.graphics.g v11 = v();
            int i14 = k11.f3721d;
            if (i14 > v11.f3721d) {
                return androidx.core.graphics.g.b(0, 0, 0, i14);
            }
            androidx.core.graphics.g gVar = this.f3983g;
            return (gVar == null || gVar.equals(androidx.core.graphics.g.f3717e) || (i11 = this.f3983g.f3721d) <= v11.f3721d) ? androidx.core.graphics.g.f3717e : androidx.core.graphics.g.b(0, 0, 0, i11);
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.g f3984m;

        h(r2 r2Var, WindowInsets windowInsets) {
            super(r2Var, windowInsets);
            this.f3984m = null;
        }

        h(r2 r2Var, h hVar) {
            super(r2Var, hVar);
            this.f3984m = null;
            this.f3984m = hVar.f3984m;
        }

        @Override // androidx.core.view.r2.l
        r2 b() {
            return r2.u(this.f3979c.consumeStableInsets());
        }

        @Override // androidx.core.view.r2.l
        r2 c() {
            return r2.u(this.f3979c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.r2.l
        final androidx.core.graphics.g i() {
            if (this.f3984m == null) {
                this.f3984m = androidx.core.graphics.g.b(this.f3979c.getStableInsetLeft(), this.f3979c.getStableInsetTop(), this.f3979c.getStableInsetRight(), this.f3979c.getStableInsetBottom());
            }
            return this.f3984m;
        }

        @Override // androidx.core.view.r2.l
        boolean n() {
            return this.f3979c.isConsumed();
        }

        @Override // androidx.core.view.r2.l
        public void s(androidx.core.graphics.g gVar) {
            this.f3984m = gVar;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(r2 r2Var, WindowInsets windowInsets) {
            super(r2Var, windowInsets);
        }

        i(r2 r2Var, i iVar) {
            super(r2Var, iVar);
        }

        @Override // androidx.core.view.r2.l
        r2 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f3979c.consumeDisplayCutout();
            return r2.u(consumeDisplayCutout);
        }

        @Override // androidx.core.view.r2.g, androidx.core.view.r2.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f3979c, iVar.f3979c) && Objects.equals(this.f3983g, iVar.f3983g);
        }

        @Override // androidx.core.view.r2.l
        q f() {
            DisplayCutout displayCutout;
            displayCutout = this.f3979c.getDisplayCutout();
            return q.e(displayCutout);
        }

        @Override // androidx.core.view.r2.l
        public int hashCode() {
            return this.f3979c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.g f3985n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.g f3986o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.g f3987p;

        j(r2 r2Var, WindowInsets windowInsets) {
            super(r2Var, windowInsets);
            this.f3985n = null;
            this.f3986o = null;
            this.f3987p = null;
        }

        j(r2 r2Var, j jVar) {
            super(r2Var, jVar);
            this.f3985n = null;
            this.f3986o = null;
            this.f3987p = null;
        }

        @Override // androidx.core.view.r2.l
        androidx.core.graphics.g h() {
            Insets mandatorySystemGestureInsets;
            if (this.f3986o == null) {
                mandatorySystemGestureInsets = this.f3979c.getMandatorySystemGestureInsets();
                this.f3986o = androidx.core.graphics.g.d(mandatorySystemGestureInsets);
            }
            return this.f3986o;
        }

        @Override // androidx.core.view.r2.l
        androidx.core.graphics.g j() {
            Insets systemGestureInsets;
            if (this.f3985n == null) {
                systemGestureInsets = this.f3979c.getSystemGestureInsets();
                this.f3985n = androidx.core.graphics.g.d(systemGestureInsets);
            }
            return this.f3985n;
        }

        @Override // androidx.core.view.r2.l
        androidx.core.graphics.g l() {
            Insets tappableElementInsets;
            if (this.f3987p == null) {
                tappableElementInsets = this.f3979c.getTappableElementInsets();
                this.f3987p = androidx.core.graphics.g.d(tappableElementInsets);
            }
            return this.f3987p;
        }

        @Override // androidx.core.view.r2.g, androidx.core.view.r2.l
        r2 m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f3979c.inset(i10, i11, i12, i13);
            return r2.u(inset);
        }

        @Override // androidx.core.view.r2.h, androidx.core.view.r2.l
        public void s(androidx.core.graphics.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        static final r2 f3988q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f3988q = r2.u(windowInsets);
        }

        k(r2 r2Var, WindowInsets windowInsets) {
            super(r2Var, windowInsets);
        }

        k(r2 r2Var, k kVar) {
            super(r2Var, kVar);
        }

        @Override // androidx.core.view.r2.g, androidx.core.view.r2.l
        final void d(View view) {
        }

        @Override // androidx.core.view.r2.g, androidx.core.view.r2.l
        public androidx.core.graphics.g g(int i10) {
            Insets insets;
            insets = this.f3979c.getInsets(n.a(i10));
            return androidx.core.graphics.g.d(insets);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        static final r2 f3989b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final r2 f3990a;

        l(r2 r2Var) {
            this.f3990a = r2Var;
        }

        r2 a() {
            return this.f3990a;
        }

        r2 b() {
            return this.f3990a;
        }

        r2 c() {
            return this.f3990a;
        }

        void d(View view) {
        }

        void e(r2 r2Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        q f() {
            return null;
        }

        androidx.core.graphics.g g(int i10) {
            return androidx.core.graphics.g.f3717e;
        }

        androidx.core.graphics.g h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.g i() {
            return androidx.core.graphics.g.f3717e;
        }

        androidx.core.graphics.g j() {
            return k();
        }

        androidx.core.graphics.g k() {
            return androidx.core.graphics.g.f3717e;
        }

        androidx.core.graphics.g l() {
            return k();
        }

        r2 m(int i10, int i11, int i12, int i13) {
            return f3989b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.g[] gVarArr) {
        }

        void q(androidx.core.graphics.g gVar) {
        }

        void r(r2 r2Var) {
        }

        public void s(androidx.core.graphics.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i10) {
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

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i10) {
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
        f3958b = Build.VERSION.SDK_INT >= 30 ? k.f3988q : l.f3989b;
    }

    private r2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f3959a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public r2(r2 r2Var) {
        if (r2Var == null) {
            this.f3959a = new l(this);
            return;
        }
        l lVar = r2Var.f3959a;
        int i10 = Build.VERSION.SDK_INT;
        this.f3959a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.g m(androidx.core.graphics.g gVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, gVar.f3718a - i10);
        int max2 = Math.max(0, gVar.f3719b - i11);
        int max3 = Math.max(0, gVar.f3720c - i12);
        int max4 = Math.max(0, gVar.f3721d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? gVar : androidx.core.graphics.g.b(max, max2, max3, max4);
    }

    public static r2 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static r2 v(WindowInsets windowInsets, View view) {
        r2 r2Var = new r2((WindowInsets) androidx.core.util.h.k(windowInsets));
        if (view != null && x0.G(view)) {
            r2Var.r(x0.y(view));
            r2Var.d(view.getRootView());
        }
        return r2Var;
    }

    @Deprecated
    public r2 a() {
        return this.f3959a.a();
    }

    @Deprecated
    public r2 b() {
        return this.f3959a.b();
    }

    @Deprecated
    public r2 c() {
        return this.f3959a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f3959a.d(view);
    }

    public q e() {
        return this.f3959a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r2) {
            return androidx.core.util.c.a(this.f3959a, ((r2) obj).f3959a);
        }
        return false;
    }

    public androidx.core.graphics.g f(int i10) {
        return this.f3959a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.g g() {
        return this.f3959a.i();
    }

    @Deprecated
    public int h() {
        return this.f3959a.k().f3721d;
    }

    public int hashCode() {
        l lVar = this.f3959a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f3959a.k().f3718a;
    }

    @Deprecated
    public int j() {
        return this.f3959a.k().f3720c;
    }

    @Deprecated
    public int k() {
        return this.f3959a.k().f3719b;
    }

    public r2 l(int i10, int i11, int i12, int i13) {
        return this.f3959a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f3959a.n();
    }

    @Deprecated
    public r2 o(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.g.b(i10, i11, i12, i13)).a();
    }

    void p(androidx.core.graphics.g[] gVarArr) {
        this.f3959a.p(gVarArr);
    }

    void q(androidx.core.graphics.g gVar) {
        this.f3959a.q(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(r2 r2Var) {
        this.f3959a.r(r2Var);
    }

    void s(androidx.core.graphics.g gVar) {
        this.f3959a.s(gVar);
    }

    public WindowInsets t() {
        l lVar = this.f3959a;
        if (lVar instanceof g) {
            return ((g) lVar).f3979c;
        }
        return null;
    }
}
