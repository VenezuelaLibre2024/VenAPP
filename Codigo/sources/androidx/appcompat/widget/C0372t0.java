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
import androidx.core.view.C1116x0;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0372t0 extends ViewGroup {

    /* renamed from: a */
    private boolean f1909a;

    /* renamed from: b */
    private int f1910b;

    /* renamed from: c */
    private int f1911c;

    /* renamed from: d */
    private int f1912d;

    /* renamed from: e */
    private int f1913e;

    /* renamed from: f */
    private int f1914f;

    /* renamed from: r */
    private float f1915r;

    /* renamed from: s */
    private boolean f1916s;

    /* renamed from: t */
    private int[] f1917t;

    /* renamed from: u */
    private int[] f1918u;

    /* renamed from: v */
    private Drawable f1919v;

    /* renamed from: w */
    private int f1920w;

    /* renamed from: x */
    private int f1921x;

    /* renamed from: y */
    private int f1922y;

    /* renamed from: z */
    private int f1923z;

    /* renamed from: androidx.appcompat.widget.t0$a */
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

    public C0372t0(Context context) {
        this(context, null);
    }

    public C0372t0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0372t0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1909a = true;
        this.f1910b = -1;
        this.f1911c = 0;
        this.f1913e = 8388659;
        int[] iArr = C7386j.f16981a1;
        C0349l1 m1845u = C0349l1.m1845u(context, attributeSet, iArr, i10, 0);
        C1116x0.m5256U(this, context, iArr, attributeSet, m1845u.m1862q(), i10, 0);
        int m1855j = m1845u.m1855j(C7386j.f16991c1, -1);
        if (m1855j >= 0) {
            setOrientation(m1855j);
        }
        int m1855j2 = m1845u.m1855j(C7386j.f16986b1, -1);
        if (m1855j2 >= 0) {
            setGravity(m1855j2);
        }
        boolean m1846a = m1845u.m1846a(C7386j.f16996d1, true);
        if (!m1846a) {
            setBaselineAligned(m1846a);
        }
        this.f1915r = m1845u.m1853h(C7386j.f17006f1, -1.0f);
        this.f1910b = m1845u.m1855j(C7386j.f17001e1, -1);
        this.f1916s = m1845u.m1846a(C7386j.f17021i1, false);
        setDividerDrawable(m1845u.m1851f(C7386j.f17011g1));
        this.f1922y = m1845u.m1855j(C7386j.f17026j1, 0);
        this.f1923z = m1845u.m1850e(C7386j.f17016h1, 0);
        m1845u.m1864v();
    }

    /* renamed from: g */
    private void m1965g(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1975o = m1975o(i12);
            if (m1975o.getVisibility() != 8) {
                a aVar = (a) m1975o.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = m1975o.getMeasuredWidth();
                    measureChildWithMargins(m1975o, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    /* renamed from: h */
    private void m1966h(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1975o = m1975o(i12);
            if (m1975o.getVisibility() != 8) {
                a aVar = (a) m1975o.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = m1975o.getMeasuredHeight();
                    measureChildWithMargins(m1975o, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    /* renamed from: w */
    private void m1967w(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    /* renamed from: c */
    void m1968c(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean m2047b = C0385x1.m2047b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View m1975o = m1975o(i11);
            if (m1975o != null && m1975o.getVisibility() != 8 && m1976p(i11)) {
                a aVar = (a) m1975o.getLayoutParams();
                m1971f(canvas, m2047b ? m1975o.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (m1975o.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1920w);
            }
        }
        if (m1976p(virtualChildCount)) {
            View m1975o2 = m1975o(virtualChildCount - 1);
            if (m1975o2 != null) {
                a aVar2 = (a) m1975o2.getLayoutParams();
                if (m2047b) {
                    left = m1975o2.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f1920w;
                } else {
                    right = m1975o2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (m2047b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i10 = getPaddingRight();
                right = (left - i10) - this.f1920w;
            }
            m1971f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: d */
    void m1969d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View m1975o = m1975o(i10);
            if (m1975o != null && m1975o.getVisibility() != 8 && m1976p(i10)) {
                m1970e(canvas, (m1975o.getTop() - ((LinearLayout.LayoutParams) ((a) m1975o.getLayoutParams())).topMargin) - this.f1921x);
            }
        }
        if (m1976p(virtualChildCount)) {
            View m1975o2 = m1975o(virtualChildCount - 1);
            m1970e(canvas, m1975o2 == null ? (getHeight() - getPaddingBottom()) - this.f1921x : m1975o2.getBottom() + ((LinearLayout.LayoutParams) ((a) m1975o2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: e */
    void m1970e(Canvas canvas, int i10) {
        this.f1919v.setBounds(getPaddingLeft() + this.f1923z, i10, (getWidth() - getPaddingRight()) - this.f1923z, this.f1921x + i10);
        this.f1919v.draw(canvas);
    }

    /* renamed from: f */
    void m1971f(Canvas canvas, int i10) {
        this.f1919v.setBounds(i10, getPaddingTop() + this.f1923z, this.f1920w + i10, (getHeight() - getPaddingBottom()) - this.f1923z);
        this.f1919v.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1910b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1910b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1910b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f1911c;
        if (this.f1912d == 1 && (i10 = this.f1913e & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1914f) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1914f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1910b;
    }

    public Drawable getDividerDrawable() {
        return this.f1919v;
    }

    public int getDividerPadding() {
        return this.f1923z;
    }

    public int getDividerWidth() {
        return this.f1920w;
    }

    public int getGravity() {
        return this.f1913e;
    }

    public int getOrientation() {
        return this.f1912d;
    }

    public int getShowDividers() {
        return this.f1922y;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1915r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1912d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* renamed from: l */
    int m1972l(View view, int i10) {
        return 0;
    }

    /* renamed from: m */
    int m1973m(View view) {
        return 0;
    }

    /* renamed from: n */
    int m1974n(View view) {
        return 0;
    }

    /* renamed from: o */
    View m1975o(int i10) {
        return getChildAt(i10);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1919v == null) {
            return;
        }
        if (this.f1912d == 1) {
            m1969d(canvas);
        } else {
            m1968c(canvas);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1912d == 1) {
            m1978r(i10, i11, i12, i13);
        } else {
            m1977q(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1912d == 1) {
            m1982v(i10, i11);
        } else {
            m1980t(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean m1976p(int i10) {
        if (i10 == 0) {
            return (this.f1922y & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1922y & 4) != 0;
        }
        if ((this.f1922y & 2) == 0) {
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
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1977q(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0372t0.m1977q(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1978r(int r18, int r19, int r20, int r21) {
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
            int r0 = r6.f1913e
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
            int r1 = r6.f1914f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1914f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.m1975o(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m1981u(r12)
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
            androidx.appcompat.widget.t0$a r5 = (androidx.appcompat.widget.C0372t0.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.C1116x0.m5296u(r17)
            int r1 = androidx.core.view.C1091r.m5127a(r1, r2)
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
            boolean r1 = r6.m1976p(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1921x
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m1973m(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1967w(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m1974n(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m1972l(r13, r12)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0372t0.m1978r(int, int, int, int):void");
    }

    /* renamed from: s */
    void m1979s(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1909a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1910b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1919v) {
            return;
        }
        this.f1919v = drawable;
        if (drawable != null) {
            this.f1920w = drawable.getIntrinsicWidth();
            this.f1921x = drawable.getIntrinsicHeight();
        } else {
            this.f1920w = 0;
            this.f1921x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1923z = i10;
    }

    public void setGravity(int i10) {
        if (this.f1913e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1913e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1913e;
        if ((8388615 & i12) != i11) {
            this.f1913e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1916s = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1912d != i10) {
            this.f1912d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1922y) {
            requestLayout();
        }
        this.f1922y = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1913e;
        if ((i12 & 112) != i11) {
            this.f1913e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1915r = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a4, code lost:
    
        if (r8 > 0) goto L170;
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
    
        if (r8 < 0) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1980t(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0372t0.m1980t(int, int):void");
    }

    /* renamed from: u */
    int m1981u(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        if (r15 > 0) goto L137;
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
    
        if (r15 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1982v(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0372t0.m1982v(int, int):void");
    }
}
