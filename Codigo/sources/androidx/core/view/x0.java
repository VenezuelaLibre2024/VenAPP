package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.r2;
import androidx.core.view.x0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: c */
    private static Field f4011c;

    /* renamed from: a */
    private static final AtomicInteger f4009a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, n2> f4010b = null;

    /* renamed from: d */
    private static boolean f4012d = false;

    /* renamed from: e */
    private static final int[] f4013e = {q0.e.f23319b, q0.e.f23320c, q0.e.f23331n, q0.e.f23342y, q0.e.B, q0.e.C, q0.e.D, q0.e.E, q0.e.F, q0.e.G, q0.e.f23321d, q0.e.f23322e, q0.e.f23323f, q0.e.f23324g, q0.e.f23325h, q0.e.f23326i, q0.e.f23327j, q0.e.f23328k, q0.e.f23329l, q0.e.f23330m, q0.e.f23332o, q0.e.f23333p, q0.e.f23334q, q0.e.f23335r, q0.e.f23336s, q0.e.f23337t, q0.e.f23338u, q0.e.f23339v, q0.e.f23340w, q0.e.f23341x, q0.e.f23343z, q0.e.A};

    /* renamed from: f */
    private static final u0 f4014f = new u0() { // from class: androidx.core.view.w0
        @Override // androidx.core.view.u0
        public final c a(c cVar) {
            c K;
            K = x0.K(cVar);
            return K;
        }
    };

    /* renamed from: g */
    private static final e f4015g = new e();

    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.a(view);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.x0.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final WeakHashMap<View, Boolean> f4016a = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                x0.L(view, z11 ? 16 : 32);
                this.f4016a.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f4016a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f4016a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f4016a.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a */
        private final int f4017a;

        /* renamed from: b */
        private final Class<T> f4018b;

        /* renamed from: c */
        private final int f4019c;

        /* renamed from: d */
        private final int f4020d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f4017a = i10;
            this.f4018b = cls;
            this.f4020d = i11;
            this.f4019c = i12;
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f4019c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t10);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f4017a);
            if (this.f4018b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                x0.h(view);
                view.setTag(this.f4017a, t10);
                x0.L(view, this.f4020d);
            }
        }

        abstract boolean h(T t10, T t11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            r2 f4021a = null;

            /* renamed from: b */
            final /* synthetic */ View f4022b;

            /* renamed from: c */
            final /* synthetic */ s0 f4023c;

            a(View view, s0 s0Var) {
                this.f4022b = view;
                this.f4023c = s0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                r2 v10 = r2.v(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f4022b);
                    if (v10.equals(this.f4021a)) {
                        return this.f4023c.a(view, v10).t();
                    }
                }
                this.f4021a = v10;
                r2 a10 = this.f4023c.a(view, v10);
                if (i10 >= 30) {
                    return a10.t();
                }
                x0.T(view);
                return a10.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(q0.e.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static r2 b(View view, r2 r2Var, Rect rect) {
            WindowInsets t10 = r2Var.t();
            if (t10 != null) {
                return r2.v(view.computeSystemWindowInsets(t10, rect), view);
            }
            rect.setEmpty();
            return r2Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static r2 j(View view) {
            return r2.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, s0 s0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(q0.e.L, s0Var);
            }
            if (s0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(q0.e.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, s0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {
        public static r2 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            r2 u10 = r2.u(rootWindowInsets);
            u10.r(u10);
            u10.d(view.getRootView());
            return u10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        static int b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        static int c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        static boolean d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        static boolean e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        static boolean f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        static boolean g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        static View h(View view, View view2, int i10) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i10);
            return keyboardNavigationClusterSearch;
        }

        static boolean i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        static void a(View view, u uVar) {
            int i10 = q0.e.R;
            androidx.collection.h hVar = (androidx.collection.h) view.getTag(i10);
            if (hVar == null) {
                hVar = new androidx.collection.h();
                view.setTag(i10, hVar);
            }
            Objects.requireNonNull(uVar);
            v1 v1Var = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.v1
                public /* synthetic */ v1() {
                }

                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return x0.u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(uVar, v1Var);
            view.addOnUnhandledKeyEventListener(v1Var);
        }

        static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.h hVar = (androidx.collection.h) view.getTag(q0.e.R);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i10);
            return (T) requireViewById;
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class q {
        static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class r {
        static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class s {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static androidx.core.view.c b(View view, androidx.core.view.c cVar) {
            ContentInfo performReceiveContent;
            ContentInfo f10 = cVar.f();
            performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? cVar : androidx.core.view.c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, t0 t0Var) {
            if (t0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(t0Var));
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a */
        private final t0 f4024a;

        t(t0 t0Var) {
            this.f4024a = t0Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.c g10 = androidx.core.view.c.g(contentInfo);
            androidx.core.view.c a10 = this.f4024a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f4025d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f4026a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f4027b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f4028c = null;

        v() {
        }

        static v a(View view) {
            int i10 = q0.e.Q;
            v vVar = (v) view.getTag(i10);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i10, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4026a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f4027b == null) {
                this.f4027b = new SparseArray<>();
            }
            return this.f4027b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(q0.e.R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4026a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4025d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f4026a == null) {
                    this.f4026a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f4025d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f4026a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f4026a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f4028c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f4028c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && x0.G(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static String A(View view) {
        return m.k(view);
    }

    @Deprecated
    public static int B(View view) {
        return h.g(view);
    }

    public static boolean C(View view) {
        return g.a(view);
    }

    public static boolean D(View view) {
        return h.h(view);
    }

    public static boolean E(View view) {
        return h.i(view);
    }

    public static boolean F(View view) {
        Boolean f10 = b().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static boolean G(View view) {
        return k.b(view);
    }

    public static boolean H(View view) {
        return k.c(view);
    }

    public static boolean I(View view) {
        return m.p(view);
    }

    public static boolean J(View view) {
        Boolean f10 = V().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static /* synthetic */ androidx.core.view.c K(androidx.core.view.c cVar) {
        return cVar;
    }

    static void L(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (l(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : RecognitionOptions.PDF417);
                k.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(m(view));
                    l0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void M(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static r2 N(View view, r2 r2Var) {
        WindowInsets t10 = r2Var.t();
        if (t10 != null) {
            WindowInsets b10 = l.b(view, t10);
            if (!b10.equals(t10)) {
                return r2.v(b10, view);
            }
        }
        return r2Var;
    }

    private static f<CharSequence> O() {
        return new b(q0.e.K, CharSequence.class, 8, 28);
    }

    public static androidx.core.view.c P(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, cVar);
        }
        t0 t0Var = (t0) view.getTag(q0.e.M);
        if (t0Var == null) {
            return r(view).a(cVar);
        }
        androidx.core.view.c a10 = t0Var.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return r(view).a(a10);
    }

    public static void Q(View view) {
        h.k(view);
    }

    public static void R(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static void S(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    public static void T(View view) {
        l.c(view);
    }

    public static void U(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static f<Boolean> V() {
        return new a(q0.e.O, Boolean.class, 28);
    }

    public static void W(View view, androidx.core.view.a aVar) {
        if (aVar == null && (j(view) instanceof a.C0052a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void X(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static void Y(View view, CharSequence charSequence) {
        O().g(view, charSequence);
        if (charSequence != null) {
            f4015g.a(view);
        } else {
            f4015g.d(view);
        }
    }

    public static void Z(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static void a0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    private static f<Boolean> b() {
        return new d(q0.e.J, Boolean.class, 28);
    }

    public static void b0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    public static n2 c(View view) {
        if (f4010b == null) {
            f4010b = new WeakHashMap<>();
        }
        n2 n2Var = f4010b.get(view);
        if (n2Var != null) {
            return n2Var;
        }
        n2 n2Var2 = new n2(view);
        f4010b.put(view, n2Var2);
        return n2Var2;
    }

    public static void c0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static r2 d(View view, r2 r2Var, Rect rect) {
        return m.b(view, r2Var, rect);
    }

    public static void d0(View view, float f10) {
        m.s(view, f10);
    }

    public static r2 e(View view, r2 r2Var) {
        WindowInsets t10 = r2Var.t();
        if (t10 != null) {
            WindowInsets a10 = l.a(view, t10);
            if (!a10.equals(t10)) {
                return r2.v(a10, view);
            }
        }
        return r2Var;
    }

    public static void e0(View view, boolean z10) {
        h.r(view, z10);
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void f0(View view, int i10) {
        h.s(view, i10);
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void g0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i10);
        }
    }

    static void h(View view) {
        androidx.core.view.a i10 = i(view);
        if (i10 == null) {
            i10 = new androidx.core.view.a();
        }
        W(view, i10);
    }

    public static void h0(View view, s0 s0Var) {
        m.u(view, s0Var);
    }

    public static androidx.core.view.a i(View view) {
        View.AccessibilityDelegate j10 = j(view);
        if (j10 == null) {
            return null;
        }
        return j10 instanceof a.C0052a ? ((a.C0052a) j10).f3879a : new androidx.core.view.a(j10);
    }

    public static void i0(View view, boolean z10) {
        V().g(view, Boolean.valueOf(z10));
    }

    private static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : k(view);
    }

    public static void j0(View view, int i10, int i11) {
        n.d(view, i10, i11);
    }

    private static View.AccessibilityDelegate k(View view) {
        if (f4012d) {
            return null;
        }
        if (f4011c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4011c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4012d = true;
                return null;
            }
        }
        try {
            Object obj = f4011c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4012d = true;
            return null;
        }
    }

    public static void k0(View view, String str) {
        m.v(view, str);
    }

    public static int l(View view) {
        return k.a(view);
    }

    private static void l0(View view) {
        if (s(view) == 0) {
            f0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (s((View) parent) == 4) {
                f0(view, 2);
                return;
            }
        }
    }

    public static CharSequence m(View view) {
        return O().f(view);
    }

    private static f<CharSequence> m0() {
        return new c(q0.e.P, CharSequence.class, 64, 30);
    }

    public static ColorStateList n(View view) {
        return m.g(view);
    }

    public static void n0(View view) {
        m.z(view);
    }

    public static PorterDuff.Mode o(View view) {
        return m.h(view);
    }

    public static Rect p(View view) {
        return j.a(view);
    }

    public static Display q(View view) {
        return i.b(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static u0 r(View view) {
        return view instanceof u0 ? (u0) view : f4014f;
    }

    public static int s(View view) {
        return h.c(view);
    }

    public static int t(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    public static int u(View view) {
        return i.d(view);
    }

    public static int v(View view) {
        return h.d(view);
    }

    public static int w(View view) {
        return h.e(view);
    }

    public static String[] x(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(q0.e.N);
    }

    public static r2 y(View view) {
        return n.a(view);
    }

    public static CharSequence z(View view) {
        return m0().f(view);
    }
}
