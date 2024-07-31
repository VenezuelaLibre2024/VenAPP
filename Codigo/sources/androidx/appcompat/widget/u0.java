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
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class u0 implements androidx.appcompat.view.menu.p {
    private static Method R;
    private static Method S;
    private View A;
    private int B;
    private DataSetObserver C;
    private View D;
    private Drawable E;
    private AdapterView.OnItemClickListener F;
    private AdapterView.OnItemSelectedListener G;
    final i H;
    private final h I;
    private final g J;
    private final e K;
    private Runnable L;
    final Handler M;
    private final Rect N;
    private Rect O;
    private boolean P;
    PopupWindow Q;

    /* renamed from: a, reason: collision with root package name */
    private Context f1651a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f1652b;

    /* renamed from: c, reason: collision with root package name */
    q0 f1653c;

    /* renamed from: d, reason: collision with root package name */
    private int f1654d;

    /* renamed from: e, reason: collision with root package name */
    private int f1655e;

    /* renamed from: f, reason: collision with root package name */
    private int f1656f;

    /* renamed from: r, reason: collision with root package name */
    private int f1657r;

    /* renamed from: s, reason: collision with root package name */
    private int f1658s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1659t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1660u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1661v;

    /* renamed from: w, reason: collision with root package name */
    private int f1662w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1663x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1664y;

    /* renamed from: z, reason: collision with root package name */
    int f1665z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s10 = u0.this.s();
            if (s10 == null || s10.getWindowToken() == null) {
                return;
            }
            u0.this.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            q0 q0Var;
            if (i10 == -1 || (q0Var = u0.this.f1653c) == null) {
                return;
            }
            q0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.e();
        }
    }

    /* loaded from: classes.dex */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (u0.this.a()) {
                u0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            u0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || u0.this.v() || u0.this.Q.getContentView() == null) {
                return;
            }
            u0 u0Var = u0.this;
            u0Var.M.removeCallbacks(u0Var.H);
            u0.this.H.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
            if (action == 0 && (popupWindow = u0.this.Q) != null && popupWindow.isShowing() && x10 >= 0 && x10 < u0.this.Q.getWidth() && y10 >= 0 && y10 < u0.this.Q.getHeight()) {
                u0 u0Var = u0.this;
                u0Var.M.postDelayed(u0Var.H, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            u0 u0Var2 = u0.this;
            u0Var2.M.removeCallbacks(u0Var2.H);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0 q0Var = u0.this.f1653c;
            if (q0Var == null || !androidx.core.view.x0.G(q0Var) || u0.this.f1653c.getCount() <= u0.this.f1653c.getChildCount()) {
                return;
            }
            int childCount = u0.this.f1653c.getChildCount();
            u0 u0Var = u0.this;
            if (childCount <= u0Var.f1665z) {
                u0Var.Q.setInputMethodMode(2);
                u0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                R = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public u0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public u0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1654d = -2;
        this.f1655e = -2;
        this.f1658s = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f1662w = 0;
        this.f1663x = false;
        this.f1664y = false;
        this.f1665z = a.e.API_PRIORITY_OTHER;
        this.B = 0;
        this.H = new i();
        this.I = new h();
        this.J = new g();
        this.K = new e();
        this.N = new Rect();
        this.f1651a = context;
        this.M = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15458l1, i10, i11);
        this.f1656f = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15463m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15468n1, 0);
        this.f1657r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1659t = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i10, i11);
        this.Q = rVar;
        rVar.setInputMethodMode(1);
    }

    private void I(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.Q, z10);
            return;
        }
        Method method = R;
        if (method != null) {
            try {
                method.invoke(this.Q, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int d() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u0.d():int");
    }

    private int t(View view, int i10, boolean z10) {
        return c.a(this.Q, view, i10, z10);
    }

    private void x() {
        View view = this.A;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A);
            }
        }
    }

    public void A(int i10) {
        Drawable background = this.Q.getBackground();
        if (background == null) {
            L(i10);
            return;
        }
        background.getPadding(this.N);
        Rect rect = this.N;
        this.f1655e = rect.left + rect.right + i10;
    }

    public void B(int i10) {
        this.f1662w = i10;
    }

    public void C(Rect rect) {
        this.O = rect != null ? new Rect(rect) : null;
    }

    public void D(int i10) {
        this.Q.setInputMethodMode(i10);
    }

    public void E(boolean z10) {
        this.P = z10;
        this.Q.setFocusable(z10);
    }

    public void F(PopupWindow.OnDismissListener onDismissListener) {
        this.Q.setOnDismissListener(onDismissListener);
    }

    public void G(AdapterView.OnItemClickListener onItemClickListener) {
        this.F = onItemClickListener;
    }

    public void H(boolean z10) {
        this.f1661v = true;
        this.f1660u = z10;
    }

    public void J(int i10) {
        this.B = i10;
    }

    public void K(int i10) {
        q0 q0Var = this.f1653c;
        if (!a() || q0Var == null) {
            return;
        }
        q0Var.setListSelectionHidden(false);
        q0Var.setSelection(i10);
        if (q0Var.getChoiceMode() != 0) {
            q0Var.setItemChecked(i10, true);
        }
    }

    public void L(int i10) {
        this.f1655e = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.Q.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.Q.dismiss();
        x();
        this.Q.setContentView(null);
        this.f1653c = null;
        this.M.removeCallbacks(this.H);
    }

    public void e() {
        q0 q0Var = this.f1653c;
        if (q0Var != null) {
            q0Var.setListSelectionHidden(true);
            q0Var.requestLayout();
        }
    }

    q0 f(Context context, boolean z10) {
        return new q0(context, z10);
    }

    public void g(Drawable drawable) {
        this.Q.setBackgroundDrawable(drawable);
    }

    public int h() {
        return this.f1656f;
    }

    public void i(int i10) {
        this.f1656f = i10;
    }

    public Drawable k() {
        return this.Q.getBackground();
    }

    public void m(int i10) {
        this.f1657r = i10;
        this.f1659t = true;
    }

    public int p() {
        if (this.f1659t) {
            return this.f1657r;
        }
        return 0;
    }

    public void q(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.C;
        if (dataSetObserver == null) {
            this.C = new f();
        } else {
            ListAdapter listAdapter2 = this.f1652b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1652b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.C);
        }
        q0 q0Var = this.f1653c;
        if (q0Var != null) {
            q0Var.setAdapter(this.f1652b);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView r() {
        return this.f1653c;
    }

    public View s() {
        return this.D;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        int d10 = d();
        boolean v10 = v();
        androidx.core.widget.j.b(this.Q, this.f1658s);
        if (this.Q.isShowing()) {
            if (androidx.core.view.x0.G(s())) {
                int i10 = this.f1655e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = s().getWidth();
                }
                int i11 = this.f1654d;
                if (i11 == -1) {
                    if (!v10) {
                        d10 = -1;
                    }
                    if (v10) {
                        this.Q.setWidth(this.f1655e == -1 ? -1 : 0);
                        this.Q.setHeight(0);
                    } else {
                        this.Q.setWidth(this.f1655e == -1 ? -1 : 0);
                        this.Q.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    d10 = i11;
                }
                this.Q.setOutsideTouchable((this.f1664y || this.f1663x) ? false : true);
                this.Q.update(s(), this.f1656f, this.f1657r, i10 < 0 ? -1 : i10, d10 < 0 ? -1 : d10);
                return;
            }
            return;
        }
        int i12 = this.f1655e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = s().getWidth();
        }
        int i13 = this.f1654d;
        if (i13 == -1) {
            d10 = -1;
        } else if (i13 != -2) {
            d10 = i13;
        }
        this.Q.setWidth(i12);
        this.Q.setHeight(d10);
        I(true);
        this.Q.setOutsideTouchable((this.f1664y || this.f1663x) ? false : true);
        this.Q.setTouchInterceptor(this.I);
        if (this.f1661v) {
            androidx.core.widget.j.a(this.Q, this.f1660u);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S;
            if (method != null) {
                try {
                    method.invoke(this.Q, this.O);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.Q, this.O);
        }
        androidx.core.widget.j.c(this.Q, s(), this.f1656f, this.f1657r, this.f1662w);
        this.f1653c.setSelection(-1);
        if (!this.P || this.f1653c.isInTouchMode()) {
            e();
        }
        if (this.P) {
            return;
        }
        this.M.post(this.K);
    }

    public int u() {
        return this.f1655e;
    }

    public boolean v() {
        return this.Q.getInputMethodMode() == 2;
    }

    public boolean w() {
        return this.P;
    }

    public void y(View view) {
        this.D = view;
    }

    public void z(int i10) {
        this.Q.setAnimationStyle(i10);
    }
}
