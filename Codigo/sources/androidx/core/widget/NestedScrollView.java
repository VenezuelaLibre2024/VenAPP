package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.p;
import androidx.core.view.accessibility.r;
import androidx.core.view.n0;
import androidx.core.view.o0;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.x0;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements q0 {
    private static final float M = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a N = new a();
    private static final int[] O = {R.attr.fillViewport};
    private int A;
    private int B;
    private int C;
    private final int[] D;
    private final int[] E;
    private int F;
    private int G;
    private d H;
    private final r0 I;
    private final o0 J;
    private float K;
    private c L;

    /* renamed from: a */
    private final float f4029a;

    /* renamed from: b */
    private long f4030b;

    /* renamed from: c */
    private final Rect f4031c;

    /* renamed from: d */
    private OverScroller f4032d;

    /* renamed from: e */
    public EdgeEffect f4033e;

    /* renamed from: f */
    public EdgeEffect f4034f;

    /* renamed from: r */
    private int f4035r;

    /* renamed from: s */
    private boolean f4036s;

    /* renamed from: t */
    private boolean f4037t;

    /* renamed from: u */
    private View f4038u;

    /* renamed from: v */
    private boolean f4039v;

    /* renamed from: w */
    private VelocityTracker f4040w;

    /* renamed from: x */
    private boolean f4041x;

    /* renamed from: y */
    private boolean f4042y;

    /* renamed from: z */
    private int f4043z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            r.a(accessibilityEvent, nestedScrollView.getScrollX());
            r.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, p pVar) {
            int scrollRange;
            super.g(view, pVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            pVar.J(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            pVar.P(true);
            if (nestedScrollView.getScrollY() > 0) {
                pVar.b(p.a.f3900q);
                pVar.b(p.a.B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                pVar.b(p.a.f3899p);
                pVar.b(p.a.D);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.P(0, max, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.P(0, min, true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a */
        public int f4044a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f4044a = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4044a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4044a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q0.a.f23310c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4031c = new Rect();
        this.f4036s = true;
        this.f4037t = false;
        this.f4038u = null;
        this.f4039v = false;
        this.f4042y = true;
        this.C = -1;
        this.D = new int[2];
        this.E = new int[2];
        this.f4033e = androidx.core.widget.d.a(context, attributeSet);
        this.f4034f = androidx.core.widget.d.a(context, attributeSet);
        this.f4029a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.I = new r0(this);
        this.J = new o0(this);
        setNestedScrollingEnabled(true);
        x0.W(this, N);
    }

    private void A(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.J.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f4035r = (int) motionEvent.getY(i10);
            this.C = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f4040w;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void E() {
        VelocityTracker velocityTracker = this.f4040w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4040w = null;
        }
    }

    private int F(int i10, float f10) {
        float d10;
        EdgeEffect edgeEffect;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (androidx.core.widget.d.b(this.f4033e) != 0.0f) {
            d10 = -androidx.core.widget.d.d(this.f4033e, -height, width);
            if (androidx.core.widget.d.b(this.f4033e) == 0.0f) {
                edgeEffect = this.f4033e;
                edgeEffect.onRelease();
            }
            f11 = d10;
        } else if (androidx.core.widget.d.b(this.f4034f) != 0.0f) {
            d10 = androidx.core.widget.d.d(this.f4034f, height, 1.0f - width);
            if (androidx.core.widget.d.b(this.f4034f) == 0.0f) {
                edgeEffect = this.f4034f;
                edgeEffect.onRelease();
            }
            f11 = d10;
        }
        int round = Math.round(f11 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    private void G(boolean z10) {
        if (z10) {
            Q(2, 1);
        } else {
            S(1);
        }
        this.G = getScrollY();
        x0.Q(this);
    }

    private boolean H(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View n10 = n(z11, i11, i12);
        if (n10 == null) {
            n10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            I(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (n10 != findFocus()) {
            n10.requestFocus(i10);
        }
        return z10;
    }

    private int I(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        EdgeEffect edgeEffect;
        if (i12 == 1) {
            Q(2, i12);
        }
        boolean z11 = false;
        if (h(0, i10, this.E, this.D, i12)) {
            i13 = i10 - this.E[1];
            i14 = this.D[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = c() && !z10;
        boolean z13 = C(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !r(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.E;
        iArr[1] = 0;
        i(0, scrollY2, 0, i13 - scrollY2, this.D, i12, iArr);
        int i15 = i14 + this.D[1];
        int i16 = i13 - this.E[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                androidx.core.widget.d.d(this.f4033e, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f4034f.isFinished()) {
                    edgeEffect = this.f4034f;
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            androidx.core.widget.d.d(this.f4034f, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f4033e.isFinished()) {
                edgeEffect = this.f4033e;
                edgeEffect.onRelease();
            }
        }
        if (this.f4033e.isFinished() && this.f4034f.isFinished()) {
            z11 = z13;
        } else {
            x0.Q(this);
        }
        if (z11 && i12 == 0) {
            this.f4040w.clear();
        }
        if (i12 == 1) {
            S(i12);
            this.f4033e.onRelease();
            this.f4034f.onRelease();
        }
        return i15;
    }

    private void J(View view) {
        view.getDrawingRect(this.f4031c);
        offsetDescendantRectToMyCoords(view, this.f4031c);
        int f10 = f(this.f4031c);
        if (f10 != 0) {
            scrollBy(0, f10);
        }
    }

    private boolean K(Rect rect, boolean z10) {
        int f10 = f(rect);
        boolean z11 = f10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f10);
            } else {
                M(0, f10);
            }
        }
        return z11;
    }

    private boolean L(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return q(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void N(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4030b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4032d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            G(z10);
        } else {
            if (!this.f4032d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f4030b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean R(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.d.b(this.f4033e) != 0.0f) {
            androidx.core.widget.d.d(this.f4033e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.d.b(this.f4034f) == 0.0f) {
            return z10;
        }
        androidx.core.widget.d.d(this.f4034f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f4032d.abortAnimation();
        S(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.K == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.K = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.K;
    }

    private void j(int i10) {
        if (i10 != 0) {
            if (this.f4042y) {
                M(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean k(int i10) {
        EdgeEffect edgeEffect;
        if (androidx.core.widget.d.b(this.f4033e) != 0.0f) {
            if (L(this.f4033e, i10)) {
                edgeEffect = this.f4033e;
                edgeEffect.onAbsorb(i10);
            } else {
                i10 = -i10;
                o(i10);
            }
        } else {
            if (androidx.core.widget.d.b(this.f4034f) == 0.0f) {
                return false;
            }
            i10 = -i10;
            if (L(this.f4034f, i10)) {
                edgeEffect = this.f4034f;
                edgeEffect.onAbsorb(i10);
            }
            o(i10);
        }
        return true;
    }

    private void l() {
        this.C = -1;
        this.f4039v = false;
        E();
        S(0);
        this.f4033e.onRelease();
        this.f4034f.onRelease();
    }

    private View n(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float q(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f4029a * 0.015f));
        float f10 = M;
        return (float) (this.f4029a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private boolean s(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    private void t() {
        VelocityTracker velocityTracker = this.f4040w;
        if (velocityTracker == null) {
            this.f4040w = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void u() {
        this.f4032d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4043z = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.B = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void v() {
        if (this.f4040w == null) {
            this.f4040w = VelocityTracker.obtain();
        }
    }

    private void w(int i10, int i11) {
        this.f4035r = i10;
        this.C = i11;
        Q(2, 0);
    }

    private boolean x(View view) {
        return !z(view, 0, getHeight());
    }

    private static boolean y(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && y((View) parent, view2);
    }

    private boolean z(View view, int i10, int i11) {
        view.getDrawingRect(this.f4031c);
        offsetDescendantRectToMyCoords(view, this.f4031c);
        return this.f4031c.bottom + i10 >= getScrollY() && this.f4031c.top - i10 <= getScrollY() + i11;
    }

    boolean C(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !r(1)) {
            this.f4032d.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean D(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f4031c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4031c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4031c.top = getScrollY() - height;
            Rect rect2 = this.f4031c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4031c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return H(i10, i11, i12);
    }

    public final void M(int i10, int i11) {
        N(i10, i11, 250, false);
    }

    void O(int i10, int i11, int i12, boolean z10) {
        N(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void P(int i10, int i11, boolean z10) {
        O(i10, i11, 250, z10);
    }

    public boolean Q(int i10, int i11) {
        return this.J.q(i10, i11);
    }

    public void S(int i10) {
        this.J.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !z(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            I(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f4031c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f4031c);
            I(f(this.f4031c), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && x(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f4032d.isFinished()) {
            return;
        }
        this.f4032d.computeScrollOffset();
        int currY = this.f4032d.getCurrY();
        int g10 = g(currY - this.G);
        this.G = currY;
        int[] iArr = this.E;
        boolean z10 = false;
        iArr[1] = 0;
        h(0, g10, iArr, null, 1);
        int i10 = g10 - this.E[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            C(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.E;
            iArr2[1] = 0;
            i(0, scrollY2, 0, i11, this.D, 1, iArr2);
            i10 = i11 - this.E[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f4033e.isFinished()) {
                        edgeEffect = this.f4033e;
                        edgeEffect.onAbsorb((int) this.f4032d.getCurrVelocity());
                    }
                } else if (this.f4034f.isFinished()) {
                    edgeEffect = this.f4034f;
                    edgeEffect.onAbsorb((int) this.f4032d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f4032d.isFinished()) {
            S(1);
        } else {
            x0.Q(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.J.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.J.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return h(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.J.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f4033e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f4033e.setSize(width, height);
            if (this.f4033e.draw(canvas)) {
                x0.Q(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f4034f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i11 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f4034f.setSize(width2, height2);
        if (this.f4034f.draw(canvas)) {
            x0.Q(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.d.b(this.f4033e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f4033e, ((-i10) * 4.0f) / height, 0.5f));
            if (round != i10) {
                this.f4033e.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || androidx.core.widget.d.b(this.f4034f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int round2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(this.f4034f, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            this.f4034f.finish();
        }
        return i10 - round2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.I.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.J.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return r(0);
    }

    public void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.J.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.J.m();
    }

    public boolean m(KeyEvent keyEvent) {
        this.f4031c.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : p(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : p(130);
        }
        if (keyCode != 62) {
            return false;
        }
        D(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void o(int i10) {
        if (getChildCount() > 0) {
            this.f4032d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, 0, 0);
            G(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4037t = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (motionEvent.getAction() != 8 || this.f4039v) {
            return false;
        }
        if (n0.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (n0.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            i10 = 0;
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return false;
        }
        I(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, n0.a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f4039v) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.C;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f4035r) > this.f4043z && (2 & getNestedScrollAxes()) == 0) {
                                this.f4039v = true;
                                this.f4035r = y10;
                                v();
                                this.f4040w.addMovement(motionEvent);
                                this.F = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        B(motionEvent);
                    }
                }
            }
            this.f4039v = false;
            this.C = -1;
            E();
            if (this.f4032d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                x0.Q(this);
            }
            S(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (s((int) motionEvent.getX(), y11)) {
                this.f4035r = y11;
                this.C = motionEvent.getPointerId(0);
                t();
                this.f4040w.addMovement(motionEvent);
                this.f4032d.computeScrollOffset();
                if (!R(motionEvent) && this.f4032d.isFinished()) {
                    z10 = false;
                }
                this.f4039v = z10;
                Q(2, 0);
            } else {
                if (!R(motionEvent) && this.f4032d.isFinished()) {
                    z10 = false;
                }
                this.f4039v = z10;
                E();
            }
        }
        return this.f4039v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f4036s = false;
        View view = this.f4038u;
        if (view != null && y(view, this)) {
            J(this.f4038u);
        }
        this.f4038u = null;
        if (!this.f4037t) {
            if (this.H != null) {
                scrollTo(getScrollX(), this.H.f4044a);
                this.H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e10 = e(scrollY, paddingTop, i14);
            if (e10 != scrollY) {
                scrollTo(getScrollX(), e10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4037t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4041x && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        o((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.p0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        h(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        A(i13, 0, null);
    }

    @Override // androidx.core.view.p0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        A(i13, i14, null);
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        A(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // androidx.core.view.p0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.I.c(view, view2, i10, i11);
        Q(2, i11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus == null || x(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.H = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f4044a = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.L;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !z(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f4031c);
        offsetDescendantRectToMyCoords(findFocus, this.f4031c);
        j(f(this.f4031c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // androidx.core.view.p0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.p0
    public void onStopNestedScroll(View view, int i10) {
        this.I.e(view, i10);
        S(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r12.f4032d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        androidx.core.view.x0.Q(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r12.f4032d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L96;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f4031c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f4031c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f4031c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f4031c;
        return H(i10, rect3.top, rect3.bottom);
    }

    public boolean r(int i10) {
        return this.J.l(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f4036s) {
            this.f4038u = view2;
        } else {
            J(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return K(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            E();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f4036s = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int e10 = e(i10, width, width2);
            int e11 = e(i11, height, height2);
            if (e10 == getScrollX() && e11 == getScrollY()) {
                return;
            }
            super.scrollTo(e10, e11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f4041x) {
            this.f4041x = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.J.n(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.L = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f4042y = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return Q(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        S(0);
    }
}
