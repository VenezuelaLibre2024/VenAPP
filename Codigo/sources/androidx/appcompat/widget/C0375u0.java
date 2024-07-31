package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0269p;
import androidx.core.view.C1116x0;
import androidx.core.widget.C1140j;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.C5101a;
import java.lang.reflect.Method;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public class C0375u0 implements InterfaceC0269p {

    /* renamed from: R */
    private static Method f1926R;

    /* renamed from: S */
    private static Method f1927S;

    /* renamed from: A */
    private View f1928A;

    /* renamed from: B */
    private int f1929B;

    /* renamed from: C */
    private DataSetObserver f1930C;

    /* renamed from: D */
    private View f1931D;

    /* renamed from: E */
    private Drawable f1932E;

    /* renamed from: F */
    private AdapterView.OnItemClickListener f1933F;

    /* renamed from: G */
    private AdapterView.OnItemSelectedListener f1934G;

    /* renamed from: H */
    final i f1935H;

    /* renamed from: I */
    private final h f1936I;

    /* renamed from: J */
    private final g f1937J;

    /* renamed from: K */
    private final e f1938K;

    /* renamed from: L */
    private Runnable f1939L;

    /* renamed from: M */
    final Handler f1940M;

    /* renamed from: N */
    private final Rect f1941N;

    /* renamed from: O */
    private Rect f1942O;

    /* renamed from: P */
    private boolean f1943P;

    /* renamed from: Q */
    PopupWindow f1944Q;

    /* renamed from: a */
    private Context f1945a;

    /* renamed from: b */
    private ListAdapter f1946b;

    /* renamed from: c */
    C0363q0 f1947c;

    /* renamed from: d */
    private int f1948d;

    /* renamed from: e */
    private int f1949e;

    /* renamed from: f */
    private int f1950f;

    /* renamed from: r */
    private int f1951r;

    /* renamed from: s */
    private int f1952s;

    /* renamed from: t */
    private boolean f1953t;

    /* renamed from: u */
    private boolean f1954u;

    /* renamed from: v */
    private boolean f1955v;

    /* renamed from: w */
    private int f1956w;

    /* renamed from: x */
    private boolean f1957x;

    /* renamed from: y */
    private boolean f1958y;

    /* renamed from: z */
    int f1959z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m2007s = C0375u0.this.m2007s();
            if (m2007s == null || m2007s.getWindowToken() == null) {
                return;
            }
            C0375u0.this.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            C0363q0 c0363q0;
            if (i10 == -1 || (c0363q0 = C0375u0.this.f1947c) == null) {
                return;
            }
            c0363q0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u0$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m2013a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static void m2014a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        static void m2015b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0375u0.this.m1998e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$f */
    /* loaded from: classes.dex */
    public class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0375u0.this.mo1269a()) {
                C0375u0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0375u0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$g */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || C0375u0.this.m2009v() || C0375u0.this.f1944Q.getContentView() == null) {
                return;
            }
            C0375u0 c0375u0 = C0375u0.this;
            c0375u0.f1940M.removeCallbacks(c0375u0.f1935H);
            C0375u0.this.f1935H.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0375u0.this.f1944Q) != null && popupWindow.isShowing() && x10 >= 0 && x10 < C0375u0.this.f1944Q.getWidth() && y10 >= 0 && y10 < C0375u0.this.f1944Q.getHeight()) {
                C0375u0 c0375u0 = C0375u0.this;
                c0375u0.f1940M.postDelayed(c0375u0.f1935H, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0375u0 c0375u02 = C0375u0.this;
            c0375u02.f1940M.removeCallbacks(c0375u02.f1935H);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.u0$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0363q0 c0363q0 = C0375u0.this.f1947c;
            if (c0363q0 == null || !C1116x0.m5242G(c0363q0) || C0375u0.this.f1947c.getCount() <= C0375u0.this.f1947c.getChildCount()) {
                return;
            }
            int childCount = C0375u0.this.f1947c.getChildCount();
            C0375u0 c0375u0 = C0375u0.this;
            if (childCount <= c0375u0.f1959z) {
                c0375u0.f1944Q.setInputMethodMode(2);
                C0375u0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1926R = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1927S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0375u0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public C0375u0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1948d = -2;
        this.f1949e = -2;
        this.f1952s = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f1956w = 0;
        this.f1957x = false;
        this.f1958y = false;
        this.f1959z = C5101a.e.API_PRIORITY_OTHER;
        this.f1929B = 0;
        this.f1935H = new i();
        this.f1936I = new h();
        this.f1937J = new g();
        this.f1938K = new e();
        this.f1941N = new Rect();
        this.f1945a = context;
        this.f1940M = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7386j.f17036l1, i10, i11);
        this.f1950f = obtainStyledAttributes.getDimensionPixelOffset(C7386j.f17041m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C7386j.f17046n1, 0);
        this.f1951r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1953t = true;
        }
        obtainStyledAttributes.recycle();
        C0365r c0365r = new C0365r(context, attributeSet, i10, i11);
        this.f1944Q = c0365r;
        c0365r.setInputMethodMode(1);
    }

    /* renamed from: I */
    private void m1983I(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.m2015b(this.f1944Q, z10);
            return;
        }
        Method method = f1926R;
        if (method != null) {
            try {
                method.invoke(this.f1944Q, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m1984d() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0375u0.m1984d():int");
    }

    /* renamed from: t */
    private int m1985t(View view, int i10, boolean z10) {
        return c.m2013a(this.f1944Q, view, i10, z10);
    }

    /* renamed from: x */
    private void m1986x() {
        View view = this.f1928A;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1928A);
            }
        }
    }

    /* renamed from: A */
    public void m1987A(int i10) {
        Drawable background = this.f1944Q.getBackground();
        if (background == null) {
            m1997L(i10);
            return;
        }
        background.getPadding(this.f1941N);
        Rect rect = this.f1941N;
        this.f1949e = rect.left + rect.right + i10;
    }

    /* renamed from: B */
    public void m1988B(int i10) {
        this.f1956w = i10;
    }

    /* renamed from: C */
    public void m1989C(Rect rect) {
        this.f1942O = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: D */
    public void m1990D(int i10) {
        this.f1944Q.setInputMethodMode(i10);
    }

    /* renamed from: E */
    public void m1991E(boolean z10) {
        this.f1943P = z10;
        this.f1944Q.setFocusable(z10);
    }

    /* renamed from: F */
    public void m1992F(PopupWindow.OnDismissListener onDismissListener) {
        this.f1944Q.setOnDismissListener(onDismissListener);
    }

    /* renamed from: G */
    public void m1993G(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1933F = onItemClickListener;
    }

    /* renamed from: H */
    public void m1994H(boolean z10) {
        this.f1955v = true;
        this.f1954u = z10;
    }

    /* renamed from: J */
    public void m1995J(int i10) {
        this.f1929B = i10;
    }

    /* renamed from: K */
    public void m1996K(int i10) {
        C0363q0 c0363q0 = this.f1947c;
        if (!mo1269a() || c0363q0 == null) {
            return;
        }
        c0363q0.setListSelectionHidden(false);
        c0363q0.setSelection(i10);
        if (c0363q0.getChoiceMode() != 0) {
            c0363q0.setItemChecked(i10, true);
        }
    }

    /* renamed from: L */
    public void m1997L(int i10) {
        this.f1949e = i10;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    /* renamed from: a */
    public boolean mo1269a() {
        return this.f1944Q.isShowing();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    public void dismiss() {
        this.f1944Q.dismiss();
        m1986x();
        this.f1944Q.setContentView(null);
        this.f1947c = null;
        this.f1940M.removeCallbacks(this.f1935H);
    }

    /* renamed from: e */
    public void m1998e() {
        C0363q0 c0363q0 = this.f1947c;
        if (c0363q0 != null) {
            c0363q0.setListSelectionHidden(true);
            c0363q0.requestLayout();
        }
    }

    /* renamed from: f */
    C0363q0 mo1999f(Context context, boolean z10) {
        return new C0363q0(context, z10);
    }

    /* renamed from: g */
    public void m2000g(Drawable drawable) {
        this.f1944Q.setBackgroundDrawable(drawable);
    }

    /* renamed from: h */
    public int m2001h() {
        return this.f1950f;
    }

    /* renamed from: i */
    public void m2002i(int i10) {
        this.f1950f = i10;
    }

    /* renamed from: k */
    public Drawable m2003k() {
        return this.f1944Q.getBackground();
    }

    /* renamed from: m */
    public void m2004m(int i10) {
        this.f1951r = i10;
        this.f1953t = true;
    }

    /* renamed from: p */
    public int m2005p() {
        if (this.f1953t) {
            return this.f1951r;
        }
        return 0;
    }

    /* renamed from: q */
    public void mo2006q(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1930C;
        if (dataSetObserver == null) {
            this.f1930C = new f();
        } else {
            ListAdapter listAdapter2 = this.f1946b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1946b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1930C);
        }
        C0363q0 c0363q0 = this.f1947c;
        if (c0363q0 != null) {
            c0363q0.setAdapter(this.f1946b);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    /* renamed from: r */
    public ListView mo1276r() {
        return this.f1947c;
    }

    /* renamed from: s */
    public View m2007s() {
        return this.f1931D;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    public void show() {
        int m1984d = m1984d();
        boolean m2009v = m2009v();
        C1140j.m5572b(this.f1944Q, this.f1952s);
        if (this.f1944Q.isShowing()) {
            if (C1116x0.m5242G(m2007s())) {
                int i10 = this.f1949e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = m2007s().getWidth();
                }
                int i11 = this.f1948d;
                if (i11 == -1) {
                    if (!m2009v) {
                        m1984d = -1;
                    }
                    if (m2009v) {
                        this.f1944Q.setWidth(this.f1949e == -1 ? -1 : 0);
                        this.f1944Q.setHeight(0);
                    } else {
                        this.f1944Q.setWidth(this.f1949e == -1 ? -1 : 0);
                        this.f1944Q.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    m1984d = i11;
                }
                this.f1944Q.setOutsideTouchable((this.f1958y || this.f1957x) ? false : true);
                this.f1944Q.update(m2007s(), this.f1950f, this.f1951r, i10 < 0 ? -1 : i10, m1984d < 0 ? -1 : m1984d);
                return;
            }
            return;
        }
        int i12 = this.f1949e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = m2007s().getWidth();
        }
        int i13 = this.f1948d;
        if (i13 == -1) {
            m1984d = -1;
        } else if (i13 != -2) {
            m1984d = i13;
        }
        this.f1944Q.setWidth(i12);
        this.f1944Q.setHeight(m1984d);
        m1983I(true);
        this.f1944Q.setOutsideTouchable((this.f1958y || this.f1957x) ? false : true);
        this.f1944Q.setTouchInterceptor(this.f1936I);
        if (this.f1955v) {
            C1140j.m5571a(this.f1944Q, this.f1954u);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1927S;
            if (method != null) {
                try {
                    method.invoke(this.f1944Q, this.f1942O);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.m2014a(this.f1944Q, this.f1942O);
        }
        C1140j.m5573c(this.f1944Q, m2007s(), this.f1950f, this.f1951r, this.f1956w);
        this.f1947c.setSelection(-1);
        if (!this.f1943P || this.f1947c.isInTouchMode()) {
            m1998e();
        }
        if (this.f1943P) {
            return;
        }
        this.f1940M.post(this.f1938K);
    }

    /* renamed from: u */
    public int m2008u() {
        return this.f1949e;
    }

    /* renamed from: v */
    public boolean m2009v() {
        return this.f1944Q.getInputMethodMode() == 2;
    }

    /* renamed from: w */
    public boolean m2010w() {
        return this.f1943P;
    }

    /* renamed from: y */
    public void m2011y(View view) {
        this.f1931D = view;
    }

    /* renamed from: z */
    public void m2012z(int i10) {
        this.f1944Q.setAnimationStyle(i10);
    }
}
