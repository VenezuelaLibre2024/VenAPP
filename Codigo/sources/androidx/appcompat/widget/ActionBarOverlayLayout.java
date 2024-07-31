package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.r2;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements n0, androidx.core.view.p0, androidx.core.view.q0 {
    static final int[] Q = {g.a.f15262b, R.attr.windowContentOverlay};
    private final Rect A;
    private final Rect B;
    private final Rect C;
    private final Rect D;
    private final Rect E;
    private r2 F;
    private r2 G;
    private r2 H;
    private r2 I;
    private d J;
    private OverScroller K;
    ViewPropertyAnimator L;
    final AnimatorListenerAdapter M;
    private final Runnable N;
    private final Runnable O;
    private final androidx.core.view.r0 P;

    /* renamed from: a, reason: collision with root package name */
    private int f1226a;

    /* renamed from: b, reason: collision with root package name */
    private int f1227b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f1228c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f1229d;

    /* renamed from: e, reason: collision with root package name */
    private o0 f1230e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1231f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1232r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1233s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1234t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1235u;

    /* renamed from: v, reason: collision with root package name */
    boolean f1236v;

    /* renamed from: w, reason: collision with root package name */
    private int f1237w;

    /* renamed from: x, reason: collision with root package name */
    private int f1238x;

    /* renamed from: y, reason: collision with root package name */
    private final Rect f1239y;

    /* renamed from: z, reason: collision with root package name */
    private final Rect f1240z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = null;
            actionBarOverlayLayout.f1236v = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = null;
            actionBarOverlayLayout.f1236v = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = actionBarOverlayLayout.f1229d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.M);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = actionBarOverlayLayout.f1229d.animate().translationY(-ActionBarOverlayLayout.this.f1229d.getHeight()).setListener(ActionBarOverlayLayout.this.M);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1227b = 0;
        this.f1239y = new Rect();
        this.f1240z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        r2 r2Var = r2.f3958b;
        this.F = r2Var;
        this.G = r2Var;
        this.H = r2Var;
        this.I = r2Var;
        this.M = new a();
        this.N = new b();
        this.O = new c();
        p(context);
        this.P = new androidx.core.view.r0(this);
    }

    private void g() {
        o();
        this.O.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o0 n(View view) {
        if (view instanceof o0) {
            return (o0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Q);
        this.f1226a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1231f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1232r = context.getApplicationInfo().targetSdkVersion < 19;
        this.K = new OverScroller(context);
    }

    private void r() {
        o();
        postDelayed(this.O, 600L);
    }

    private void s() {
        o();
        postDelayed(this.N, 600L);
    }

    private void u() {
        o();
        this.N.run();
    }

    private boolean v(float f10) {
        this.K.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        return this.K.getFinalY() > this.f1229d.getHeight();
    }

    @Override // androidx.appcompat.widget.n0
    public boolean a() {
        t();
        return this.f1230e.a();
    }

    @Override // androidx.appcompat.widget.n0
    public boolean b() {
        t();
        return this.f1230e.b();
    }

    @Override // androidx.appcompat.widget.n0
    public boolean c() {
        t();
        return this.f1230e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.n0
    public void d(Menu menu, m.a aVar) {
        t();
        this.f1230e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1231f == null || this.f1232r) {
            return;
        }
        int bottom = this.f1229d.getVisibility() == 0 ? (int) (this.f1229d.getBottom() + this.f1229d.getTranslationY() + 0.5f) : 0;
        this.f1231f.setBounds(0, bottom, getWidth(), this.f1231f.getIntrinsicHeight() + bottom);
        this.f1231f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.n0
    public boolean e() {
        t();
        return this.f1230e.e();
    }

    @Override // androidx.appcompat.widget.n0
    public void f() {
        t();
        this.f1230e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1229d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.P.a();
    }

    public CharSequence getTitle() {
        t();
        return this.f1230e.getTitle();
    }

    @Override // androidx.appcompat.widget.n0
    public boolean h() {
        t();
        return this.f1230e.h();
    }

    @Override // androidx.appcompat.widget.n0
    public void i(int i10) {
        t();
        if (i10 == 2) {
            this.f1230e.p();
        } else if (i10 == 5) {
            this.f1230e.x();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public void j() {
        t();
        this.f1230e.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void o() {
        removeCallbacks(this.N);
        removeCallbacks(this.O);
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        t();
        r2 v10 = r2.v(windowInsets, this);
        boolean k10 = k(this.f1229d, new Rect(v10.i(), v10.k(), v10.j(), v10.h()), true, true, false, true);
        androidx.core.view.x0.d(this, v10, this.f1239y);
        Rect rect = this.f1239y;
        r2 l10 = v10.l(rect.left, rect.top, rect.right, rect.bottom);
        this.F = l10;
        boolean z10 = true;
        if (!this.G.equals(l10)) {
            this.G = this.F;
            k10 = true;
        }
        if (this.f1240z.equals(this.f1239y)) {
            z10 = k10;
        } else {
            this.f1240z.set(this.f1239y);
        }
        if (z10) {
            requestLayout();
        }
        return v10.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        androidx.core.view.x0.T(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        r2 a10;
        t();
        measureChildWithMargins(this.f1229d, i10, 0, i11, 0);
        e eVar = (e) this.f1229d.getLayoutParams();
        int max = Math.max(0, this.f1229d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1229d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1229d.getMeasuredState());
        boolean z10 = (androidx.core.view.x0.B(this) & RecognitionOptions.QR_CODE) != 0;
        if (z10) {
            measuredHeight = this.f1226a;
            if (this.f1234t && this.f1229d.getTabContainer() != null) {
                measuredHeight += this.f1226a;
            }
        } else {
            measuredHeight = this.f1229d.getVisibility() != 8 ? this.f1229d.getMeasuredHeight() : 0;
        }
        this.A.set(this.f1239y);
        r2 r2Var = this.F;
        this.H = r2Var;
        if (this.f1233s || z10) {
            a10 = new r2.b(this.H).c(androidx.core.graphics.g.b(r2Var.i(), this.H.k() + measuredHeight, this.H.j(), this.H.h() + 0)).a();
        } else {
            Rect rect = this.A;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a10 = r2Var.l(0, measuredHeight, 0, 0);
        }
        this.H = a10;
        k(this.f1228c, this.A, true, true, true, true);
        if (!this.I.equals(this.H)) {
            r2 r2Var2 = this.H;
            this.I = r2Var2;
            androidx.core.view.x0.e(this.f1228c, r2Var2);
        }
        measureChildWithMargins(this.f1228c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1228c.getLayoutParams();
        int max3 = Math.max(max, this.f1228c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1228c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1228c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1235u || !z10) {
            return false;
        }
        if (v(f11)) {
            g();
        } else {
            u();
        }
        this.f1236v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.p0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1237w + i11;
        this.f1237w = i14;
        setActionBarHideOffset(i14);
    }

    @Override // androidx.core.view.p0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.P.b(view, view2, i10);
        this.f1237w = getActionBarHideOffset();
        o();
        d dVar = this.J;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // androidx.core.view.p0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1229d.getVisibility() != 0) {
            return false;
        }
        return this.f1235u;
    }

    @Override // androidx.core.view.p0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1235u && !this.f1236v) {
            if (this.f1237w <= this.f1229d.getHeight()) {
                s();
            } else {
                r();
            }
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // androidx.core.view.p0
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        t();
        int i11 = this.f1238x ^ i10;
        this.f1238x = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & RecognitionOptions.QR_CODE) != 0;
        d dVar = this.J;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.J.a();
            } else {
                this.J.d();
            }
        }
        if ((i11 & RecognitionOptions.QR_CODE) == 0 || this.J == null) {
            return;
        }
        androidx.core.view.x0.T(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1227b = i10;
        d dVar = this.J;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public boolean q() {
        return this.f1233s;
    }

    public void setActionBarHideOffset(int i10) {
        o();
        this.f1229d.setTranslationY(-Math.max(0, Math.min(i10, this.f1229d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.J = dVar;
        if (getWindowToken() != null) {
            this.J.onWindowVisibilityChanged(this.f1227b);
            int i10 = this.f1238x;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.x0.T(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1234t = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1235u) {
            this.f1235u = z10;
            if (z10) {
                return;
            }
            o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        t();
        this.f1230e.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        t();
        this.f1230e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        t();
        this.f1230e.t(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1233s = z10;
        this.f1232r = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.n0
    public void setWindowCallback(Window.Callback callback) {
        t();
        this.f1230e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.n0
    public void setWindowTitle(CharSequence charSequence) {
        t();
        this.f1230e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void t() {
        if (this.f1228c == null) {
            this.f1228c = (ContentFrameLayout) findViewById(g.f.f15339b);
            this.f1229d = (ActionBarContainer) findViewById(g.f.f15340c);
            this.f1230e = n(findViewById(g.f.f15338a));
        }
    }
}
