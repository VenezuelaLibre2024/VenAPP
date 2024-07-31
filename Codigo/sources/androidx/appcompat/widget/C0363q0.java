package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.os.C0942a;
import androidx.core.view.C1074n2;
import androidx.core.widget.C1138h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p111g.C7377a;
import p147i.C7758a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public class C0363q0 extends ListView {

    /* renamed from: a */
    private final Rect f1868a;

    /* renamed from: b */
    private int f1869b;

    /* renamed from: c */
    private int f1870c;

    /* renamed from: d */
    private int f1871d;

    /* renamed from: e */
    private int f1872e;

    /* renamed from: f */
    private int f1873f;

    /* renamed from: r */
    private d f1874r;

    /* renamed from: s */
    private boolean f1875s;

    /* renamed from: t */
    private boolean f1876t;

    /* renamed from: u */
    private boolean f1877u;

    /* renamed from: v */
    private C1074n2 f1878v;

    /* renamed from: w */
    private C1138h f1879w;

    /* renamed from: x */
    f f1880x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.q0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m1936a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$b */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a */
        private static Method f1881a;

        /* renamed from: b */
        private static Method f1882b;

        /* renamed from: c */
        private static Method f1883c;

        /* renamed from: d */
        private static boolean f1884d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1881a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1882b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1883c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1884d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: a */
        static boolean m1937a() {
            return f1884d;
        }

        /* renamed from: b */
        static void m1938b(C0363q0 c0363q0, int i10, View view) {
            try {
                f1881a.invoke(c0363q0, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f1882b.invoke(c0363q0, Integer.valueOf(i10));
                f1883c.invoke(c0363q0, Integer.valueOf(i10));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.q0$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static boolean m1939a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        static void m1940b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.q0$d */
    /* loaded from: classes.dex */
    public static class d extends C7758a {

        /* renamed from: b */
        private boolean f1885b;

        d(Drawable drawable) {
            super(drawable);
            this.f1885b = true;
        }

        /* renamed from: b */
        void m1941b(boolean z10) {
            this.f1885b = z10;
        }

        @Override // p147i.C7758a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1885b) {
                super.draw(canvas);
            }
        }

        @Override // p147i.C7758a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1885b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p147i.C7758a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1885b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p147i.C7758a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1885b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p147i.C7758a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1885b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.q0$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private static final Field f1886a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1886a = field;
        }

        /* renamed from: a */
        static boolean m1942a(AbsListView absListView) {
            Field field = f1886a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        static void m1943b(AbsListView absListView, boolean z10) {
            Field field = f1886a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.q0$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        /* renamed from: a */
        public void m1944a() {
            C0363q0 c0363q0 = C0363q0.this;
            c0363q0.f1880x = null;
            c0363q0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1945b() {
            C0363q0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0363q0 c0363q0 = C0363q0.this;
            c0363q0.f1880x = null;
            c0363q0.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0363q0(Context context, boolean z10) {
        super(context, null, C7377a.f16684A);
        this.f1868a = new Rect();
        this.f1869b = 0;
        this.f1870c = 0;
        this.f1871d = 0;
        this.f1872e = 0;
        this.f1876t = z10;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    private void m1923a() {
        this.f1877u = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1873f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1074n2 c1074n2 = this.f1878v;
        if (c1074n2 != null) {
            c1074n2.m5069c();
            this.f1878v = null;
        }
    }

    /* renamed from: b */
    private void m1924b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    /* renamed from: c */
    private void m1925c(Canvas canvas) {
        Drawable selector;
        if (this.f1868a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1868a);
        selector.draw(canvas);
    }

    /* renamed from: f */
    private void m1926f(int i10, View view) {
        Rect rect = this.f1868a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1869b;
        rect.top -= this.f1870c;
        rect.right += this.f1871d;
        rect.bottom += this.f1872e;
        boolean m1930j = m1930j();
        if (view.isEnabled() != m1930j) {
            m1931k(!m1930j);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    private void m1927g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        m1926f(i10, view);
        if (z10) {
            Rect rect = this.f1868a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0888a.m4539c(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1928h(int i10, View view, float f10, float f11) {
        m1927g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        C0888a.m4539c(selector, f10, f11);
    }

    /* renamed from: i */
    private void m1929i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1877u = true;
        a.m1936a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f1873f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1873f = i10;
        a.m1936a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1928h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1930j() {
        return C0942a.m4700d() ? c.m1939a(this) : e.m1942a(this);
    }

    /* renamed from: k */
    private void m1931k(boolean z10) {
        if (C0942a.m4700d()) {
            c.m1940b(this, z10);
        } else {
            e.m1943b(this, z10);
        }
    }

    /* renamed from: l */
    private boolean m1932l() {
        return this.f1877u;
    }

    /* renamed from: m */
    private void m1933m() {
        Drawable selector = getSelector();
        if (selector != null && m1932l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f1874r;
        if (dVar != null) {
            dVar.m1941b(z10);
        }
    }

    /* renamed from: d */
    public int mo1934d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i15 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i15;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i10, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m1925c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1880x != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1933m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1935e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1929i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m1924b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m1923a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.f1879w
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1879w = r9
        L5a:
            androidx.core.widget.h r9 = r7.f1879w
            r9.m5513m(r1)
            androidx.core.widget.h r9 = r7.f1879w
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.h r8 = r7.f1879w
            if (r8 == 0) goto L6c
            r8.m5513m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0363q0.mo1935e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1876t || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1876t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1876t || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1876t && this.f1875s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1880x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1880x == null) {
            f fVar = new f();
            this.f1880x = fVar;
            fVar.m1945b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.m1937a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.m1938b(this, pointToPosition, childAt);
                    }
                }
                m1933m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1873f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1880x;
        if (fVar != null) {
            fVar.m1944a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z10) {
        this.f1875s = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1874r = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1869b = rect.left;
        this.f1870c = rect.top;
        this.f1871d = rect.right;
        this.f1872e = rect.bottom;
    }
}
