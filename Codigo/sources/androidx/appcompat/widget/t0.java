package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class t0 extends ViewGroup {

    /* renamed from: a */
    private boolean f1634a;

    /* renamed from: b */
    private int f1635b;

    /* renamed from: c */
    private int f1636c;

    /* renamed from: d */
    private int f1637d;

    /* renamed from: e */
    private int f1638e;

    /* renamed from: f */
    private int f1639f;

    /* renamed from: r */
    private float f1640r;

    /* renamed from: s */
    private boolean f1641s;

    /* renamed from: t */
    private int[] f1642t;

    /* renamed from: u */
    private int[] f1643u;

    /* renamed from: v */
    private Drawable f1644v;

    /* renamed from: w */
    private int f1645w;

    /* renamed from: x */
    private int f1646x;

    /* renamed from: y */
    private int f1647y;

    /* renamed from: z */
    private int f1648z;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public t0(Context context) {
        this(context, null);
    }

    public t0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public t0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1634a = true;
        this.f1635b = -1;
        this.f1636c = 0;
        this.f1638e = 8388659;
        int[] iArr = g.j.f15403a1;
        l1 u10 = l1.u(context, attributeSet, iArr, i10, 0);
        androidx.core.view.x0.U(this, context, iArr, attributeSet, u10.q(), i10, 0);
        int j10 = u10.j(g.j.f15413c1, -1);
        if (j10 >= 0) {
            setOrientation(j10);
        }
        int j11 = u10.j(g.j.f15408b1, -1);
        if (j11 >= 0) {
            setGravity(j11);
        }
        boolean a10 = u10.a(g.j.f15418d1, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f1640r = u10.h(g.j.f15428f1, -1.0f);
        this.f1635b = u10.j(g.j.f15423e1, -1);
        this.f1641s = u10.a(g.j.f15443i1, false);
        setDividerDrawable(u10.f(g.j.f15433g1));
        this.f1647y = u10.j(g.j.f15448j1, 0);
        this.f1648z = u10.e(g.j.f15438h1, 0);
        u10.v();
    }

    private void g(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View o10 = o(i12);
            if (o10.getVisibility() != 8) {
                a aVar = (a) o10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = o10.getMeasuredWidth();
                    measureChildWithMargins(o10, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void h(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View o10 = o(i12);
            if (o10.getVisibility() != 8) {
                a aVar = (a) o10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = o10.getMeasuredHeight();
                    measureChildWithMargins(o10, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    private void w(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = x1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View o10 = o(i11);
            if (o10 != null && o10.getVisibility() != 8 && p(i11)) {
                a aVar = (a) o10.getLayoutParams();
                f(canvas, b10 ? o10.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (o10.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1645w);
            }
        }
        if (p(virtualChildCount)) {
            View o11 = o(virtualChildCount - 1);
            if (o11 != null) {
                a aVar2 = (a) o11.getLayoutParams();
                if (b10) {
                    left = o11.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f1645w;
                } else {
                    right = o11.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b10) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i10 = getPaddingRight();
                right = (left - i10) - this.f1645w;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View o10 = o(i10);
            if (o10 != null && o10.getVisibility() != 8 && p(i10)) {
                e(canvas, (o10.getTop() - ((LinearLayout.LayoutParams) ((a) o10.getLayoutParams())).topMargin) - this.f1646x);
            }
        }
        if (p(virtualChildCount)) {
            View o11 = o(virtualChildCount - 1);
            e(canvas, o11 == null ? (getHeight() - getPaddingBottom()) - this.f1646x : o11.getBottom() + ((LinearLayout.LayoutParams) ((a) o11.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i10) {
        this.f1644v.setBounds(getPaddingLeft() + this.f1648z, i10, (getWidth() - getPaddingRight()) - this.f1648z, this.f1646x + i10);
        this.f1644v.draw(canvas);
    }

    void f(Canvas canvas, int i10) {
        this.f1644v.setBounds(i10, getPaddingTop() + this.f1648z, this.f1645w + i10, (getHeight() - getPaddingBottom()) - this.f1648z);
        this.f1644v.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1635b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1635b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1635b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f1636c;
        if (this.f1637d == 1 && (i10 = this.f1638e & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1639f) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1639f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1635b;
    }

    public Drawable getDividerDrawable() {
        return this.f1644v;
    }

    public int getDividerPadding() {
        return this.f1648z;
    }

    public int getDividerWidth() {
        return this.f1645w;
    }

    public int getGravity() {
        return this.f1638e;
    }

    public int getOrientation() {
        return this.f1637d;
    }

    public int getShowDividers() {
        return this.f1647y;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1640r;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1637d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i10) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i10) {
        return getChildAt(i10);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1644v == null) {
            return;
        }
        if (this.f1637d == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1637d == 1) {
            r(i10, i11, i12, i13);
        } else {
            q(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1637d == 1) {
            v(i10, i11);
        } else {
            t(i10, i11);
        }
    }

    public boolean p(int i10) {
        if (i10 == 0) {
            return (this.f1647y & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1647y & 4) != 0;
        }
        if ((this.f1647y & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void q(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.q(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void r(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1638e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1639f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1639f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.o(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.u(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.t0$a r5 = (androidx.appcompat.widget.t0.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.x0.u(r17)
            int r1 = androidx.core.view.r.a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.p(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1646x
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.w(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.n(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.l(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc6
        Lc5:
            r1 = r14
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.r(int, int, int, int):void");
    }

    void s(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1634a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1635b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1644v) {
            return;
        }
        this.f1644v = drawable;
        if (drawable != null) {
            this.f1645w = drawable.getIntrinsicWidth();
            this.f1646x = drawable.getIntrinsicHeight();
        } else {
            this.f1645w = 0;
            this.f1646x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1648z = i10;
    }

    public void setGravity(int i10) {
        if (this.f1638e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1638e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1638e;
        if ((8388615 & i12) != i11) {
            this.f1638e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1641s = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1637d != i10) {
            this.f1637d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1647y) {
            requestLayout();
        }
        this.f1647y = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1638e;
        if ((i12 & 112) != i11) {
            this.f1638e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1640r = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a4, code lost:
    
        if (r8 > 0) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b1, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03b2, code lost:
    
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03af, code lost:
    
        if (r8 < 0) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void t(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.t(int, int):void");
    }

    int u(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        if (r15 > 0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02dc, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02dd, code lost:
    
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02da, code lost:
    
        if (r15 < 0) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.v(int, int):void");
    }
}
