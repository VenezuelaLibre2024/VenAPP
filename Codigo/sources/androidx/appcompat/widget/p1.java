package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.n2;
import androidx.core.view.p2;

/* loaded from: classes.dex */
public class p1 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f1567a;

    /* renamed from: b, reason: collision with root package name */
    private int f1568b;

    /* renamed from: c, reason: collision with root package name */
    private View f1569c;

    /* renamed from: d, reason: collision with root package name */
    private View f1570d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1571e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1572f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1573g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1574h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f1575i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f1576j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1577k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f1578l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1579m;

    /* renamed from: n, reason: collision with root package name */
    private c f1580n;

    /* renamed from: o, reason: collision with root package name */
    private int f1581o;

    /* renamed from: p, reason: collision with root package name */
    private int f1582p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f1583q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1584a;

        a() {
            this.f1584a = new androidx.appcompat.view.menu.a(p1.this.f1567a.getContext(), 0, R.id.home, 0, 0, p1.this.f1575i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p1 p1Var = p1.this;
            Window.Callback callback = p1Var.f1578l;
            if (callback == null || !p1Var.f1579m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1584a);
        }
    }

    /* loaded from: classes.dex */
    class b extends p2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1586a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1587b;

        b(int i10) {
            this.f1587b = i10;
        }

        @Override // androidx.core.view.p2, androidx.core.view.o2
        public void a(View view) {
            this.f1586a = true;
        }

        @Override // androidx.core.view.o2
        public void b(View view) {
            if (this.f1586a) {
                return;
            }
            p1.this.f1567a.setVisibility(this.f1587b);
        }

        @Override // androidx.core.view.p2, androidx.core.view.o2
        public void c(View view) {
            p1.this.f1567a.setVisibility(0);
        }
    }

    public p1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, g.h.f15384a, g.e.f15325n);
    }

    public p1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1581o = 0;
        this.f1582p = 0;
        this.f1567a = toolbar;
        this.f1575i = toolbar.getTitle();
        this.f1576j = toolbar.getSubtitle();
        this.f1574h = this.f1575i != null;
        this.f1573g = toolbar.getNavigationIcon();
        l1 u10 = l1.u(toolbar.getContext(), null, g.j.f15401a, g.a.f15263c, 0);
        this.f1583q = u10.f(g.j.f15456l);
        if (z10) {
            CharSequence o10 = u10.o(g.j.f15486r);
            if (!TextUtils.isEmpty(o10)) {
                setTitle(o10);
            }
            CharSequence o11 = u10.o(g.j.f15476p);
            if (!TextUtils.isEmpty(o11)) {
                F(o11);
            }
            Drawable f10 = u10.f(g.j.f15466n);
            if (f10 != null) {
                B(f10);
            }
            Drawable f11 = u10.f(g.j.f15461m);
            if (f11 != null) {
                setIcon(f11);
            }
            if (this.f1573g == null && (drawable = this.f1583q) != null) {
                E(drawable);
            }
            j(u10.j(g.j.f15436h, 0));
            int m10 = u10.m(g.j.f15431g, 0);
            if (m10 != 0) {
                z(LayoutInflater.from(this.f1567a.getContext()).inflate(m10, (ViewGroup) this.f1567a, false));
                j(this.f1568b | 16);
            }
            int l10 = u10.l(g.j.f15446j, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1567a.getLayoutParams();
                layoutParams.height = l10;
                this.f1567a.setLayoutParams(layoutParams);
            }
            int d10 = u10.d(g.j.f15426f, -1);
            int d11 = u10.d(g.j.f15421e, -1);
            if (d10 >= 0 || d11 >= 0) {
                this.f1567a.J(Math.max(d10, 0), Math.max(d11, 0));
            }
            int m11 = u10.m(g.j.f15491s, 0);
            if (m11 != 0) {
                Toolbar toolbar2 = this.f1567a;
                toolbar2.N(toolbar2.getContext(), m11);
            }
            int m12 = u10.m(g.j.f15481q, 0);
            if (m12 != 0) {
                Toolbar toolbar3 = this.f1567a;
                toolbar3.M(toolbar3.getContext(), m12);
            }
            int m13 = u10.m(g.j.f15471o, 0);
            if (m13 != 0) {
                this.f1567a.setPopupTheme(m13);
            }
        } else {
            this.f1568b = y();
        }
        u10.v();
        A(i10);
        this.f1577k = this.f1567a.getNavigationContentDescription();
        this.f1567a.setNavigationOnClickListener(new a());
    }

    private void G(CharSequence charSequence) {
        this.f1575i = charSequence;
        if ((this.f1568b & 8) != 0) {
            this.f1567a.setTitle(charSequence);
            if (this.f1574h) {
                androidx.core.view.x0.Y(this.f1567a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f1568b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1577k)) {
                this.f1567a.setNavigationContentDescription(this.f1582p);
            } else {
                this.f1567a.setNavigationContentDescription(this.f1577k);
            }
        }
    }

    private void I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1568b & 4) != 0) {
            toolbar = this.f1567a;
            drawable = this.f1573g;
            if (drawable == null) {
                drawable = this.f1583q;
            }
        } else {
            toolbar = this.f1567a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f1568b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1572f) == null) {
            drawable = this.f1571e;
        }
        this.f1567a.setLogo(drawable);
    }

    private int y() {
        if (this.f1567a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1583q = this.f1567a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 == this.f1582p) {
            return;
        }
        this.f1582p = i10;
        if (TextUtils.isEmpty(this.f1567a.getNavigationContentDescription())) {
            C(this.f1582p);
        }
    }

    public void B(Drawable drawable) {
        this.f1572f = drawable;
        J();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f1577k = charSequence;
        H();
    }

    public void E(Drawable drawable) {
        this.f1573g = drawable;
        I();
    }

    public void F(CharSequence charSequence) {
        this.f1576j = charSequence;
        if ((this.f1568b & 8) != 0) {
            this.f1567a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.o0
    public boolean a() {
        return this.f1567a.d();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean b() {
        return this.f1567a.w();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean c() {
        return this.f1567a.Q();
    }

    @Override // androidx.appcompat.widget.o0
    public void collapseActionView() {
        this.f1567a.e();
    }

    @Override // androidx.appcompat.widget.o0
    public void d(Menu menu, m.a aVar) {
        if (this.f1580n == null) {
            c cVar = new c(this.f1567a.getContext());
            this.f1580n = cVar;
            cVar.p(g.f.f15344g);
        }
        this.f1580n.d(aVar);
        this.f1567a.K((androidx.appcompat.view.menu.g) menu, this.f1580n);
    }

    @Override // androidx.appcompat.widget.o0
    public boolean e() {
        return this.f1567a.B();
    }

    @Override // androidx.appcompat.widget.o0
    public void f() {
        this.f1579m = true;
    }

    @Override // androidx.appcompat.widget.o0
    public void g(Drawable drawable) {
        androidx.core.view.x0.Z(this.f1567a, drawable);
    }

    @Override // androidx.appcompat.widget.o0
    public Context getContext() {
        return this.f1567a.getContext();
    }

    @Override // androidx.appcompat.widget.o0
    public CharSequence getTitle() {
        return this.f1567a.getTitle();
    }

    @Override // androidx.appcompat.widget.o0
    public int getVisibility() {
        return this.f1567a.getVisibility();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean h() {
        return this.f1567a.A();
    }

    @Override // androidx.appcompat.widget.o0
    public boolean i() {
        return this.f1567a.v();
    }

    @Override // androidx.appcompat.widget.o0
    public void j(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1568b ^ i10;
        this.f1568b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1567a.setTitle(this.f1575i);
                    toolbar = this.f1567a;
                    charSequence = this.f1576j;
                } else {
                    charSequence = null;
                    this.f1567a.setTitle((CharSequence) null);
                    toolbar = this.f1567a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1570d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1567a.addView(view);
            } else {
                this.f1567a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public Menu k() {
        return this.f1567a.getMenu();
    }

    @Override // androidx.appcompat.widget.o0
    public int l() {
        return this.f1581o;
    }

    @Override // androidx.appcompat.widget.o0
    public n2 m(int i10, long j10) {
        return androidx.core.view.x0.c(this.f1567a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.o0
    public ViewGroup n() {
        return this.f1567a;
    }

    @Override // androidx.appcompat.widget.o0
    public void o(boolean z10) {
    }

    @Override // androidx.appcompat.widget.o0
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o0
    public void q(boolean z10) {
        this.f1567a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.o0
    public void r() {
        this.f1567a.f();
    }

    @Override // androidx.appcompat.widget.o0
    public void s(d1 d1Var) {
        View view = this.f1569c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1567a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1569c);
            }
        }
        this.f1569c = d1Var;
        if (d1Var == null || this.f1581o != 2) {
            return;
        }
        this.f1567a.addView(d1Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1569c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f758a = 8388691;
        d1Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.o0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? h.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.o0
    public void setIcon(Drawable drawable) {
        this.f1571e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.o0
    public void setTitle(CharSequence charSequence) {
        this.f1574h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.o0
    public void setWindowCallback(Window.Callback callback) {
        this.f1578l = callback;
    }

    @Override // androidx.appcompat.widget.o0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1574h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.o0
    public void t(int i10) {
        B(i10 != 0 ? h.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.o0
    public void u(m.a aVar, g.a aVar2) {
        this.f1567a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.o0
    public void v(int i10) {
        this.f1567a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.o0
    public int w() {
        return this.f1568b;
    }

    @Override // androidx.appcompat.widget.o0
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void z(View view) {
        View view2 = this.f1570d;
        if (view2 != null && (this.f1568b & 16) != 0) {
            this.f1567a.removeView(view2);
        }
        this.f1570d = view;
        if (view == null || (this.f1568b & 16) == 0) {
            return;
        }
        this.f1567a.addView(view);
    }
}
