package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.widget.C0387y0;
import androidx.core.view.C1116x0;
import p111g.C7380d;
import p111g.C7383g;

/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC0270q extends AbstractC0264k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: G */
    private static final int f1351G = C7383g.f16847m;

    /* renamed from: A */
    ViewTreeObserver f1352A;

    /* renamed from: B */
    private boolean f1353B;

    /* renamed from: C */
    private boolean f1354C;

    /* renamed from: D */
    private int f1355D;

    /* renamed from: F */
    private boolean f1357F;

    /* renamed from: b */
    private final Context f1358b;

    /* renamed from: c */
    private final C0260g f1359c;

    /* renamed from: d */
    private final C0259f f1360d;

    /* renamed from: e */
    private final boolean f1361e;

    /* renamed from: f */
    private final int f1362f;

    /* renamed from: r */
    private final int f1363r;

    /* renamed from: s */
    private final int f1364s;

    /* renamed from: t */
    final C0387y0 f1365t;

    /* renamed from: w */
    private PopupWindow.OnDismissListener f1368w;

    /* renamed from: x */
    private View f1369x;

    /* renamed from: y */
    View f1370y;

    /* renamed from: z */
    private InterfaceC0266m.a f1371z;

    /* renamed from: u */
    final ViewTreeObserver.OnGlobalLayoutListener f1366u = new a();

    /* renamed from: v */
    private final View.OnAttachStateChangeListener f1367v = new b();

    /* renamed from: E */
    private int f1356E = 0;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0270q.this.mo1269a() || ViewOnKeyListenerC0270q.this.f1365t.m2010w()) {
                return;
            }
            View view = ViewOnKeyListenerC0270q.this.f1370y;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0270q.this.dismiss();
            } else {
                ViewOnKeyListenerC0270q.this.f1365t.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0270q.this.f1352A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0270q.this.f1352A = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0270q viewOnKeyListenerC0270q = ViewOnKeyListenerC0270q.this;
                viewOnKeyListenerC0270q.f1352A.removeGlobalOnLayoutListener(viewOnKeyListenerC0270q.f1366u);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0270q(Context context, C0260g c0260g, View view, int i10, int i11, boolean z10) {
        this.f1358b = context;
        this.f1359c = c0260g;
        this.f1361e = z10;
        this.f1360d = new C0259f(c0260g, LayoutInflater.from(context), z10, f1351G);
        this.f1363r = i10;
        this.f1364s = i11;
        Resources resources = context.getResources();
        this.f1362f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7380d.f16736d));
        this.f1369x = view;
        this.f1365t = new C0387y0(context, null, i10, i11);
        c0260g.m1327c(this, context);
    }

    /* renamed from: y */
    private boolean m1407y() {
        View view;
        if (mo1269a()) {
            return true;
        }
        if (this.f1353B || (view = this.f1369x) == null) {
            return false;
        }
        this.f1370y = view;
        this.f1365t.m1992F(this);
        this.f1365t.m1993G(this);
        this.f1365t.m1991E(true);
        View view2 = this.f1370y;
        boolean z10 = this.f1352A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1352A = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1366u);
        }
        view2.addOnAttachStateChangeListener(this.f1367v);
        this.f1365t.m2011y(view2);
        this.f1365t.m1988B(this.f1356E);
        if (!this.f1354C) {
            this.f1355D = AbstractC0264k.m1387m(this.f1360d, null, this.f1358b, this.f1362f);
            this.f1354C = true;
        }
        this.f1365t.m1987A(this.f1355D);
        this.f1365t.m1990D(2);
        this.f1365t.m1989C(m1390l());
        this.f1365t.show();
        ListView mo1276r = this.f1365t.mo1276r();
        mo1276r.setOnKeyListener(this);
        if (this.f1357F && this.f1359c.m1346x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1358b).inflate(C7383g.f16846l, (ViewGroup) mo1276r, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1359c.m1346x());
            }
            frameLayout.setEnabled(false);
            mo1276r.addHeaderView(frameLayout, null, false);
        }
        this.f1365t.mo2006q(this.f1360d);
        this.f1365t.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    /* renamed from: a */
    public boolean mo1269a() {
        return !this.f1353B && this.f1365t.mo1269a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: b */
    public void mo1242b(C0260g c0260g, boolean z10) {
        if (c0260g != this.f1359c) {
            return;
        }
        dismiss();
        InterfaceC0266m.a aVar = this.f1371z;
        if (aVar != null) {
            aVar.mo1035b(c0260g, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: d */
    public void mo1244d(InterfaceC0266m.a aVar) {
        this.f1371z = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    public void dismiss() {
        if (mo1269a()) {
            this.f1365t.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: e */
    public boolean mo1245e(SubMenuC0271r subMenuC0271r) {
        if (subMenuC0271r.hasVisibleItems()) {
            C0265l c0265l = new C0265l(this.f1358b, subMenuC0271r, this.f1370y, this.f1361e, this.f1363r, this.f1364s);
            c0265l.m1402j(this.f1371z);
            c0265l.m1399g(AbstractC0264k.m1388w(subMenuC0271r));
            c0265l.m1401i(this.f1368w);
            this.f1368w = null;
            this.f1359c.m1330e(false);
            int m2001h = this.f1365t.m2001h();
            int m2005p = this.f1365t.m2005p();
            if ((Gravity.getAbsoluteGravity(this.f1356E, C1116x0.m5296u(this.f1369x)) & 7) == 5) {
                m2001h += this.f1369x.getWidth();
            }
            if (c0265l.m1405n(m2001h, m2005p)) {
                InterfaceC0266m.a aVar = this.f1371z;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1036c(subMenuC0271r);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: f */
    public void mo1246f(boolean z10) {
        this.f1354C = false;
        C0259f c0259f = this.f1360d;
        if (c0259f != null) {
            c0259f.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: g */
    public boolean mo1270g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: j */
    public void mo1271j(C0260g c0260g) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: n */
    public void mo1273n(View view) {
        this.f1369x = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1353B = true;
        this.f1359c.close();
        ViewTreeObserver viewTreeObserver = this.f1352A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1352A = this.f1370y.getViewTreeObserver();
            }
            this.f1352A.removeGlobalOnLayoutListener(this.f1366u);
            this.f1352A = null;
        }
        this.f1370y.removeOnAttachStateChangeListener(this.f1367v);
        PopupWindow.OnDismissListener onDismissListener = this.f1368w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: p */
    public void mo1274p(boolean z10) {
        this.f1360d.m1291d(z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: q */
    public void mo1275q(int i10) {
        this.f1356E = i10;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    /* renamed from: r */
    public ListView mo1276r() {
        return this.f1365t.mo1276r();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: s */
    public void mo1277s(int i10) {
        this.f1365t.m2002i(i10);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0269p
    public void show() {
        if (!m1407y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: t */
    public void mo1278t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1368w = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: u */
    public void mo1279u(boolean z10) {
        this.f1357F = z10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0264k
    /* renamed from: v */
    public void mo1280v(int i10) {
        this.f1365t.m2004m(i10);
    }
}
