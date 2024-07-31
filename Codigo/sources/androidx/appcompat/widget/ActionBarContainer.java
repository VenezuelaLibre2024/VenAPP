package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1207a;

    /* renamed from: b, reason: collision with root package name */
    private View f1208b;

    /* renamed from: c, reason: collision with root package name */
    private View f1209c;

    /* renamed from: d, reason: collision with root package name */
    private View f1210d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f1211e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f1212f;

    /* renamed from: r, reason: collision with root package name */
    Drawable f1213r;

    /* renamed from: s, reason: collision with root package name */
    boolean f1214s;

    /* renamed from: t, reason: collision with root package name */
    boolean f1215t;

    /* renamed from: u, reason: collision with root package name */
    private int f1216u;

    /* loaded from: classes.dex */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.x0.Z(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15401a);
        this.f1211e = obtainStyledAttributes.getDrawable(g.j.f15406b);
        this.f1212f = obtainStyledAttributes.getDrawable(g.j.f15416d);
        this.f1216u = obtainStyledAttributes.getDimensionPixelSize(g.j.f15446j, -1);
        boolean z10 = true;
        if (getId() == g.f.H) {
            this.f1214s = true;
            this.f1213r = obtainStyledAttributes.getDrawable(g.j.f15411c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1214s ? this.f1211e != null || this.f1212f != null : this.f1213r != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1211e;
        if (drawable != null && drawable.isStateful()) {
            this.f1211e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1212f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1212f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1213r;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1213r.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1208b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1211e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1212f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1213r;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1209c = findViewById(g.f.f15338a);
        this.f1210d = findViewById(g.f.f15343f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1207a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f1208b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view2.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f1214s) {
            Drawable drawable3 = this.f1213r;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f1211e != null) {
                if (this.f1209c.getVisibility() == 0) {
                    drawable2 = this.f1211e;
                    left = this.f1209c.getLeft();
                    top = this.f1209c.getTop();
                    right = this.f1209c.getRight();
                    view = this.f1209c;
                } else {
                    View view3 = this.f1210d;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1211e.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f1211e;
                        left = this.f1210d.getLeft();
                        top = this.f1210d.getTop();
                        right = this.f1210d.getRight();
                        view = this.f1210d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f1215t = z13;
            if (z13 && (drawable = this.f1212f) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1209c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f1216u
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1209c
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1208b
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f1209c
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f1209c
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f1210d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f1210d
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1208b
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1211e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1211e);
        }
        this.f1211e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1209c;
            if (view != null) {
                this.f1211e.setBounds(view.getLeft(), this.f1209c.getTop(), this.f1209c.getRight(), this.f1209c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1214s ? this.f1211e != null || this.f1212f != null : this.f1213r != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1213r;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1213r);
        }
        this.f1213r = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1214s && (drawable2 = this.f1213r) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1214s ? !(this.f1211e != null || this.f1212f != null) : this.f1213r == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1212f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1212f);
        }
        this.f1212f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1215t && (drawable2 = this.f1212f) != null) {
                drawable2.setBounds(this.f1208b.getLeft(), this.f1208b.getTop(), this.f1208b.getRight(), this.f1208b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1214s ? this.f1211e != null || this.f1212f != null : this.f1213r != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(d1 d1Var) {
        View view = this.f1208b;
        if (view != null) {
            removeView(view);
        }
        this.f1208b = d1Var;
        if (d1Var != null) {
            addView(d1Var);
            ViewGroup.LayoutParams layoutParams = d1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            d1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1207a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1211e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1212f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1213r;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1211e && !this.f1214s) || (drawable == this.f1212f && this.f1215t) || ((drawable == this.f1213r && this.f1214s) || super.verifyDrawable(drawable));
    }
}
