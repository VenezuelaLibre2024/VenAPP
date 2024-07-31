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
import androidx.collection.C0738h;
import androidx.core.view.C0987a;
import androidx.core.view.C1094r2;
import androidx.core.view.C1116x0;
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
import p299q0.C10221e;

/* renamed from: androidx.core.view.x0 */
/* loaded from: classes.dex */
public class C1116x0 {

    /* renamed from: c */
    private static Field f4703c;

    /* renamed from: a */
    private static final AtomicInteger f4701a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, C1074n2> f4702b = null;

    /* renamed from: d */
    private static boolean f4704d = false;

    /* renamed from: e */
    private static final int[] f4705e = {C10221e.f25285b, C10221e.f25286c, C10221e.f25297n, C10221e.f25308y, C10221e.f25266B, C10221e.f25267C, C10221e.f25268D, C10221e.f25269E, C10221e.f25270F, C10221e.f25271G, C10221e.f25287d, C10221e.f25288e, C10221e.f25289f, C10221e.f25290g, C10221e.f25291h, C10221e.f25292i, C10221e.f25293j, C10221e.f25294k, C10221e.f25295l, C10221e.f25296m, C10221e.f25298o, C10221e.f25299p, C10221e.f25300q, C10221e.f25301r, C10221e.f25302s, C10221e.f25303t, C10221e.f25304u, C10221e.f25305v, C10221e.f25306w, C10221e.f25307x, C10221e.f25309z, C10221e.f25265A};

    /* renamed from: f */
    private static final InterfaceC1104u0 f4706f = new InterfaceC1104u0() { // from class: androidx.core.view.w0
        @Override // androidx.core.view.InterfaceC1104u0
        /* renamed from: a */
        public final C1016c mo1832a(C1016c c1016c) {
            C1016c m5246K;
            m5246K = C1116x0.m5246K(c1016c);
            return m5246K;
        }
    };

    /* renamed from: g */
    private static final e f4707g = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$a */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo5302d(View view) {
            return Boolean.valueOf(p.m5419d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo5303e(View view, Boolean bool) {
            p.m5424i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo5304h(Boolean bool, Boolean bool2) {
            return !m5324a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$b */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo5302d(View view) {
            return p.m5417b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo5303e(View view, CharSequence charSequence) {
            p.m5423h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo5304h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$c */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo5302d(View view) {
            return r.m5429a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo5303e(View view, CharSequence charSequence) {
            r.m5430b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo5304h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$d */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo5302d(View view) {
            return Boolean.valueOf(p.m5418c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo5303e(View view, Boolean bool) {
            p.m5422g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C1116x0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo5304h(Boolean bool, Boolean bool2) {
            return !m5324a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.x0$e */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final WeakHashMap<View, Boolean> f4708a = new WeakHashMap<>();

        e() {
        }

        /* renamed from: b */
        private void m5317b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                C1116x0.m5247L(view, z11 ? 16 : 32);
                this.f4708a.put(view, Boolean.valueOf(z11));
            }
        }

        /* renamed from: c */
        private void m5318c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m5319e(View view) {
            h.m5342o(view.getViewTreeObserver(), this);
        }

        /* renamed from: a */
        void m5320a(View view) {
            this.f4708a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.m5362b(view)) {
                m5318c(view);
            }
        }

        /* renamed from: d */
        void m5321d(View view) {
            this.f4708a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m5319e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f4708a.entrySet()) {
                    m5317b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m5318c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a */
        private final int f4709a;

        /* renamed from: b */
        private final Class<T> f4710b;

        /* renamed from: c */
        private final int f4711c;

        /* renamed from: d */
        private final int f4712d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f4709a = i10;
            this.f4710b = cls;
            this.f4712d = i11;
            this.f4711c = i12;
        }

        /* renamed from: b */
        private boolean m5322b() {
            return true;
        }

        /* renamed from: c */
        private boolean m5323c() {
            return Build.VERSION.SDK_INT >= this.f4711c;
        }

        /* renamed from: a */
        boolean m5324a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo5302d(View view);

        /* renamed from: e */
        abstract void mo5303e(View view, T t10);

        /* renamed from: f */
        T m5325f(View view) {
            if (m5323c()) {
                return mo5302d(view);
            }
            if (!m5322b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f4709a);
            if (this.f4710b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        /* renamed from: g */
        void m5326g(View view, T t10) {
            if (m5323c()) {
                mo5303e(view, t10);
            } else if (m5322b() && mo5304h(m5325f(view), t10)) {
                C1116x0.m5276h(view);
                view.setTag(this.f4709a, t10);
                C1116x0.m5247L(view, this.f4712d);
            }
        }

        /* renamed from: h */
        abstract boolean mo5304h(T t10, T t11);
    }

    /* renamed from: androidx.core.view.x0$g */
    /* loaded from: classes.dex */
    static class g {
        /* renamed from: a */
        static boolean m5327a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        static AccessibilityNodeProvider m5328a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m5329b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m5330c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m5331d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m5332e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m5333f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m5334g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m5335h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m5336i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m5337j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        /* renamed from: k */
        static void m5338k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m5339l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        /* renamed from: m */
        static void m5340m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m5341n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        /* renamed from: o */
        static void m5342o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m5343p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m5344q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m5345r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        /* renamed from: s */
        static void m5346s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* renamed from: androidx.core.view.x0$i */
    /* loaded from: classes.dex */
    static class i {
        /* renamed from: a */
        static int m5347a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m5348b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m5349c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m5350d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m5351e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m5352f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m5353g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m5354h(View view, int i10) {
            view.setLabelFor(i10);
        }

        /* renamed from: i */
        static void m5355i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m5356j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        /* renamed from: k */
        static void m5357k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* renamed from: androidx.core.view.x0$j */
    /* loaded from: classes.dex */
    static class j {
        /* renamed from: a */
        static Rect m5358a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m5359b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m5360c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static int m5361a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m5362b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m5363c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m5364d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m5365e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        /* renamed from: f */
        static void m5366f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        /* renamed from: g */
        static void m5367g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        static WindowInsets m5368a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m5369b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m5370c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.x0$m */
    /* loaded from: classes.dex */
    private static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.view.x0$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C1094r2 f4713a = null;

            /* renamed from: b */
            final /* synthetic */ View f4714b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC1096s0 f4715c;

            a(View view, InterfaceC1096s0 interfaceC1096s0) {
                this.f4714b = view;
                this.f4715c = interfaceC1096s0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C1094r2 m5136v = C1094r2.m5136v(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.m5371a(windowInsets, this.f4714b);
                    if (m5136v.equals(this.f4713a)) {
                        return this.f4715c.mo1030a(view, m5136v).m5155t();
                    }
                }
                this.f4713a = m5136v;
                C1094r2 mo1030a = this.f4715c.mo1030a(view, m5136v);
                if (i10 >= 30) {
                    return mo1030a.m5155t();
                }
                C1116x0.m5255T(view);
                return mo1030a.m5155t();
            }
        }

        /* renamed from: a */
        static void m5371a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C10221e.f25283S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C1094r2 m5372b(View view, C1094r2 c1094r2, Rect rect) {
            WindowInsets m5155t = c1094r2.m5155t();
            if (m5155t != null) {
                return C1094r2.m5136v(view.computeSystemWindowInsets(m5155t, rect), view);
            }
            rect.setEmpty();
            return c1094r2;
        }

        /* renamed from: c */
        static boolean m5373c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        /* renamed from: d */
        static boolean m5374d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        /* renamed from: e */
        static boolean m5375e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m5376f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        /* renamed from: g */
        static ColorStateList m5377g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m5378h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m5379i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C1094r2 m5380j(View view) {
            return C1094r2.a.m5156a(view);
        }

        /* renamed from: k */
        static String m5381k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m5382l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m5383m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m5384n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m5385o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m5386p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m5387q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m5388r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m5389s(View view, float f10) {
            view.setElevation(f10);
        }

        /* renamed from: t */
        static void m5390t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        /* renamed from: u */
        static void m5391u(View view, InterfaceC1096s0 interfaceC1096s0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C10221e.f25276L, interfaceC1096s0);
            }
            if (interfaceC1096s0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C10221e.f25283S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC1096s0));
            }
        }

        /* renamed from: v */
        static void m5392v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m5393w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        /* renamed from: x */
        static void m5394x(View view, float f10) {
            view.setZ(f10);
        }

        /* renamed from: y */
        static boolean m5395y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        /* renamed from: z */
        static void m5396z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.x0$n */
    /* loaded from: classes.dex */
    private static class n {
        /* renamed from: a */
        public static C1094r2 m5397a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C1094r2 m5135u = C1094r2.m5135u(rootWindowInsets);
            m5135u.m5153r(m5135u);
            m5135u.m5140d(view.getRootView());
            return m5135u;
        }

        /* renamed from: b */
        static int m5398b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m5399c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        /* renamed from: d */
        static void m5400d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: androidx.core.view.x0$o */
    /* loaded from: classes.dex */
    static class o {
        /* renamed from: a */
        static void m5401a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        /* renamed from: b */
        static int m5402b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        /* renamed from: c */
        static int m5403c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        /* renamed from: d */
        static boolean m5404d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        /* renamed from: e */
        static boolean m5405e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        /* renamed from: f */
        static boolean m5406f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        /* renamed from: g */
        static boolean m5407g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        /* renamed from: h */
        static View m5408h(View view, View view2, int i10) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i10);
            return keyboardNavigationClusterSearch;
        }

        /* renamed from: i */
        static boolean m5409i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        /* renamed from: j */
        static void m5410j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m5411k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        /* renamed from: l */
        static void m5412l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        /* renamed from: m */
        static void m5413m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        /* renamed from: n */
        static void m5414n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        /* renamed from: o */
        static void m5415o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x0$p */
    /* loaded from: classes.dex */
    public static class p {
        /* renamed from: a */
        static void m5416a(View view, final u uVar) {
            int i10 = C10221e.f25282R;
            C0738h c0738h = (C0738h) view.getTag(i10);
            if (c0738h == null) {
                c0738h = new C0738h();
                view.setTag(i10, c0738h);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.v1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C1116x0.u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c0738h.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        static CharSequence m5417b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        /* renamed from: c */
        static boolean m5418c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        /* renamed from: d */
        static boolean m5419d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        /* renamed from: e */
        static void m5420e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C0738h c0738h = (C0738h) view.getTag(C10221e.f25282R);
            if (c0738h == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0738h.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        static <T> T m5421f(View view, int i10) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i10);
            return (T) requireViewById;
        }

        /* renamed from: g */
        static void m5422g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        /* renamed from: h */
        static void m5423h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m5424i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.x0$q */
    /* loaded from: classes.dex */
    public static class q {
        /* renamed from: a */
        static View.AccessibilityDelegate m5425a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        /* renamed from: b */
        static List<Rect> m5426b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        /* renamed from: c */
        static void m5427c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        /* renamed from: d */
        static void m5428d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.x0$r */
    /* loaded from: classes.dex */
    public static class r {
        /* renamed from: a */
        static CharSequence m5429a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        /* renamed from: b */
        static void m5430b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.x0$s */
    /* loaded from: classes.dex */
    private static final class s {
        /* renamed from: a */
        public static String[] m5431a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        /* renamed from: b */
        public static C1016c m5432b(View view, C1016c c1016c) {
            ContentInfo performReceiveContent;
            ContentInfo m4952f = c1016c.m4952f();
            performReceiveContent = view.performReceiveContent(m4952f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == m4952f ? c1016c : C1016c.m4948g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m5433c(View view, String[] strArr, InterfaceC1100t0 interfaceC1100t0) {
            if (interfaceC1100t0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(interfaceC1100t0));
            }
        }
    }

    /* renamed from: androidx.core.view.x0$t */
    /* loaded from: classes.dex */
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a */
        private final InterfaceC1100t0 f4716a;

        t(InterfaceC1100t0 interfaceC1100t0) {
            this.f4716a = interfaceC1100t0;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1016c m4948g = C1016c.m4948g(contentInfo);
            C1016c mo5203a = this.f4716a.mo5203a(view, m4948g);
            if (mo5203a == null) {
                return null;
            }
            return mo5203a == m4948g ? contentInfo : mo5203a.m4952f();
        }
    }

    /* renamed from: androidx.core.view.x0$u */
    /* loaded from: classes.dex */
    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.x0$v */
    /* loaded from: classes.dex */
    static class v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f4717d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f4718a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f4719b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f4720c = null;

        v() {
        }

        /* renamed from: a */
        static v m5434a(View view) {
            int i10 = C10221e.f25281Q;
            v vVar = (v) view.getTag(i10);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i10, vVar2);
            return vVar2;
        }

        /* renamed from: c */
        private View m5435c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4718a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m5435c = m5435c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m5435c != null) {
                            return m5435c;
                        }
                    }
                }
                if (m5437e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m5436d() {
            if (this.f4719b == null) {
                this.f4719b = new SparseArray<>();
            }
            return this.f4719b;
        }

        /* renamed from: e */
        private boolean m5437e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C10221e.f25282R);
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

        /* renamed from: g */
        private void m5438g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4718a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4717d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f4718a == null) {
                    this.f4718a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f4717d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f4718a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f4718a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m5439b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m5438g();
            }
            View m5435c = m5435c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m5435c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m5436d().put(keyCode, new WeakReference<>(m5435c));
                }
            }
            return m5435c != null;
        }

        /* renamed from: f */
        boolean m5440f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f4720c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f4720c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> m5436d = m5436d();
            if (keyEvent.getAction() != 1 || (indexOfKey = m5436d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = m5436d.valueAt(indexOfKey);
                m5436d.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = m5436d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && C1116x0.m5242G(view)) {
                m5437e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static String m5236A(View view) {
        return m.m5381k(view);
    }

    @Deprecated
    /* renamed from: B */
    public static int m5237B(View view) {
        return h.m5334g(view);
    }

    /* renamed from: C */
    public static boolean m5238C(View view) {
        return g.m5327a(view);
    }

    /* renamed from: D */
    public static boolean m5239D(View view) {
        return h.m5335h(view);
    }

    /* renamed from: E */
    public static boolean m5240E(View view) {
        return h.m5336i(view);
    }

    /* renamed from: F */
    public static boolean m5241F(View view) {
        Boolean m5325f = m5264b().m5325f(view);
        return m5325f != null && m5325f.booleanValue();
    }

    /* renamed from: G */
    public static boolean m5242G(View view) {
        return k.m5362b(view);
    }

    /* renamed from: H */
    public static boolean m5243H(View view) {
        return k.m5363c(view);
    }

    /* renamed from: I */
    public static boolean m5244I(View view) {
        return m.m5386p(view);
    }

    /* renamed from: J */
    public static boolean m5245J(View view) {
        Boolean m5325f = m5257V().m5325f(view);
        return m5325f != null && m5325f.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ C1016c m5246K(C1016c c1016c) {
        return c1016c;
    }

    /* renamed from: L */
    static void m5247L(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m5286m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (m5284l(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : RecognitionOptions.PDF417);
                k.m5367g(obtain, i10);
                if (z10) {
                    obtain.getText().add(m5286m(view));
                    m5285l0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.m5367g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m5286m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.m5365e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    /* renamed from: M */
    public static void m5248M(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    /* renamed from: N */
    public static C1094r2 m5249N(View view, C1094r2 c1094r2) {
        WindowInsets m5155t = c1094r2.m5155t();
        if (m5155t != null) {
            WindowInsets m5369b = l.m5369b(view, m5155t);
            if (!m5369b.equals(m5155t)) {
                return C1094r2.m5136v(m5369b, view);
            }
        }
        return c1094r2;
    }

    /* renamed from: O */
    private static f<CharSequence> m5250O() {
        return new b(C10221e.f25275K, CharSequence.class, 8, 28);
    }

    /* renamed from: P */
    public static C1016c m5251P(View view, C1016c c1016c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1016c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.m5432b(view, c1016c);
        }
        InterfaceC1100t0 interfaceC1100t0 = (InterfaceC1100t0) view.getTag(C10221e.f25277M);
        if (interfaceC1100t0 == null) {
            return m5293r(view).mo1832a(c1016c);
        }
        C1016c mo5203a = interfaceC1100t0.mo5203a(view, c1016c);
        if (mo5203a == null) {
            return null;
        }
        return m5293r(view).mo1832a(mo5203a);
    }

    /* renamed from: Q */
    public static void m5252Q(View view) {
        h.m5338k(view);
    }

    /* renamed from: R */
    public static void m5253R(View view, Runnable runnable) {
        h.m5340m(view, runnable);
    }

    /* renamed from: S */
    public static void m5254S(View view, Runnable runnable, long j10) {
        h.m5341n(view, runnable, j10);
    }

    /* renamed from: T */
    public static void m5255T(View view) {
        l.m5370c(view);
    }

    /* renamed from: U */
    public static void m5256U(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.m5427c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: V */
    private static f<Boolean> m5257V() {
        return new a(C10221e.f25279O, Boolean.class, 28);
    }

    /* renamed from: W */
    public static void m5258W(View view, C0987a c0987a) {
        if (c0987a == null && (m5280j(view) instanceof C0987a.a)) {
            c0987a = new C0987a();
        }
        view.setAccessibilityDelegate(c0987a == null ? null : c0987a.m4851d());
    }

    /* renamed from: X */
    public static void m5259X(View view, boolean z10) {
        m5264b().m5326g(view, Boolean.valueOf(z10));
    }

    /* renamed from: Y */
    public static void m5260Y(View view, CharSequence charSequence) {
        m5250O().m5326g(view, charSequence);
        if (charSequence != null) {
            f4707g.m5320a(view);
        } else {
            f4707g.m5321d(view);
        }
    }

    /* renamed from: Z */
    public static void m5261Z(View view, Drawable drawable) {
        h.m5344q(view, drawable);
    }

    /* renamed from: a0 */
    public static void m5263a0(View view, ColorStateList colorStateList) {
        m.m5387q(view, colorStateList);
    }

    /* renamed from: b */
    private static f<Boolean> m5264b() {
        return new d(C10221e.f25274J, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m5265b0(View view, PorterDuff.Mode mode) {
        m.m5388r(view, mode);
    }

    /* renamed from: c */
    public static C1074n2 m5266c(View view) {
        if (f4702b == null) {
            f4702b = new WeakHashMap<>();
        }
        C1074n2 c1074n2 = f4702b.get(view);
        if (c1074n2 != null) {
            return c1074n2;
        }
        C1074n2 c1074n22 = new C1074n2(view);
        f4702b.put(view, c1074n22);
        return c1074n22;
    }

    /* renamed from: c0 */
    public static void m5267c0(View view, Rect rect) {
        j.m5360c(view, rect);
    }

    /* renamed from: d */
    public static C1094r2 m5268d(View view, C1094r2 c1094r2, Rect rect) {
        return m.m5372b(view, c1094r2, rect);
    }

    /* renamed from: d0 */
    public static void m5269d0(View view, float f10) {
        m.m5389s(view, f10);
    }

    /* renamed from: e */
    public static C1094r2 m5270e(View view, C1094r2 c1094r2) {
        WindowInsets m5155t = c1094r2.m5155t();
        if (m5155t != null) {
            WindowInsets m5368a = l.m5368a(view, m5155t);
            if (!m5368a.equals(m5155t)) {
                return C1094r2.m5136v(m5368a, view);
            }
        }
        return c1094r2;
    }

    /* renamed from: e0 */
    public static void m5271e0(View view, boolean z10) {
        h.m5345r(view, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m5272f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.m5434a(view).m5439b(view, keyEvent);
    }

    /* renamed from: f0 */
    public static void m5273f0(View view, int i10) {
        h.m5346s(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m5274g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.m5434a(view).m5440f(keyEvent);
    }

    /* renamed from: g0 */
    public static void m5275g0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.m5412l(view, i10);
        }
    }

    /* renamed from: h */
    static void m5276h(View view) {
        C0987a m5278i = m5278i(view);
        if (m5278i == null) {
            m5278i = new C0987a();
        }
        m5258W(view, m5278i);
    }

    /* renamed from: h0 */
    public static void m5277h0(View view, InterfaceC1096s0 interfaceC1096s0) {
        m.m5391u(view, interfaceC1096s0);
    }

    /* renamed from: i */
    public static C0987a m5278i(View view) {
        View.AccessibilityDelegate m5280j = m5280j(view);
        if (m5280j == null) {
            return null;
        }
        return m5280j instanceof C0987a.a ? ((C0987a.a) m5280j).f4551a : new C0987a(m5280j);
    }

    /* renamed from: i0 */
    public static void m5279i0(View view, boolean z10) {
        m5257V().m5326g(view, Boolean.valueOf(z10));
    }

    /* renamed from: j */
    private static View.AccessibilityDelegate m5280j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.m5425a(view) : m5282k(view);
    }

    /* renamed from: j0 */
    public static void m5281j0(View view, int i10, int i11) {
        n.m5400d(view, i10, i11);
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m5282k(View view) {
        if (f4704d) {
            return null;
        }
        if (f4703c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4703c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4704d = true;
                return null;
            }
        }
        try {
            Object obj = f4703c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4704d = true;
            return null;
        }
    }

    /* renamed from: k0 */
    public static void m5283k0(View view, String str) {
        m.m5392v(view, str);
    }

    /* renamed from: l */
    public static int m5284l(View view) {
        return k.m5361a(view);
    }

    /* renamed from: l0 */
    private static void m5285l0(View view) {
        if (m5294s(view) == 0) {
            m5273f0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m5294s((View) parent) == 4) {
                m5273f0(view, 2);
                return;
            }
        }
    }

    /* renamed from: m */
    public static CharSequence m5286m(View view) {
        return m5250O().m5325f(view);
    }

    /* renamed from: m0 */
    private static f<CharSequence> m5287m0() {
        return new c(C10221e.f25280P, CharSequence.class, 64, 30);
    }

    /* renamed from: n */
    public static ColorStateList m5288n(View view) {
        return m.m5377g(view);
    }

    /* renamed from: n0 */
    public static void m5289n0(View view) {
        m.m5396z(view);
    }

    /* renamed from: o */
    public static PorterDuff.Mode m5290o(View view) {
        return m.m5378h(view);
    }

    /* renamed from: p */
    public static Rect m5291p(View view) {
        return j.m5358a(view);
    }

    /* renamed from: q */
    public static Display m5292q(View view) {
        return i.m5348b(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    private static InterfaceC1104u0 m5293r(View view) {
        return view instanceof InterfaceC1104u0 ? (InterfaceC1104u0) view : f4706f;
    }

    /* renamed from: s */
    public static int m5294s(View view) {
        return h.m5330c(view);
    }

    /* renamed from: t */
    public static int m5295t(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.m5402b(view);
        }
        return 0;
    }

    /* renamed from: u */
    public static int m5296u(View view) {
        return i.m5350d(view);
    }

    /* renamed from: v */
    public static int m5297v(View view) {
        return h.m5331d(view);
    }

    /* renamed from: w */
    public static int m5298w(View view) {
        return h.m5332e(view);
    }

    /* renamed from: x */
    public static String[] m5299x(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.m5431a(view) : (String[]) view.getTag(C10221e.f25278N);
    }

    /* renamed from: y */
    public static C1094r2 m5300y(View view) {
        return n.m5397a(view);
    }

    /* renamed from: z */
    public static CharSequence m5301z(View view) {
        return m5287m0().m5325f(view);
    }
}
