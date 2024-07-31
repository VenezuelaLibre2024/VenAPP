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
import androidx.appcompat.view.menu.C0254a;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1074n2;
import androidx.core.view.C1084p2;
import androidx.core.view.C1116x0;
import p111g.C7377a;
import p111g.C7381e;
import p111g.C7382f;
import p111g.C7384h;
import p111g.C7386j;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.p1 */
/* loaded from: classes.dex */
public class C0361p1 implements InterfaceC0357o0 {

    /* renamed from: a */
    Toolbar f1842a;

    /* renamed from: b */
    private int f1843b;

    /* renamed from: c */
    private View f1844c;

    /* renamed from: d */
    private View f1845d;

    /* renamed from: e */
    private Drawable f1846e;

    /* renamed from: f */
    private Drawable f1847f;

    /* renamed from: g */
    private Drawable f1848g;

    /* renamed from: h */
    private boolean f1849h;

    /* renamed from: i */
    CharSequence f1850i;

    /* renamed from: j */
    private CharSequence f1851j;

    /* renamed from: k */
    private CharSequence f1852k;

    /* renamed from: l */
    Window.Callback f1853l;

    /* renamed from: m */
    boolean f1854m;

    /* renamed from: n */
    private C0320c f1855n;

    /* renamed from: o */
    private int f1856o;

    /* renamed from: p */
    private int f1857p;

    /* renamed from: q */
    private Drawable f1858q;

    /* renamed from: androidx.appcompat.widget.p1$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a */
        final C0254a f1859a;

        a() {
            this.f1859a = new C0254a(C0361p1.this.f1842a.getContext(), 0, R.id.home, 0, 0, C0361p1.this.f1850i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0361p1 c0361p1 = C0361p1.this;
            Window.Callback callback = c0361p1.f1853l;
            if (callback == null || !c0361p1.f1854m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1859a);
        }
    }

    /* renamed from: androidx.appcompat.widget.p1$b */
    /* loaded from: classes.dex */
    class b extends C1084p2 {

        /* renamed from: a */
        private boolean f1861a = false;

        /* renamed from: b */
        final /* synthetic */ int f1862b;

        b(int i10) {
            this.f1862b = i10;
        }

        @Override // androidx.core.view.C1084p2, androidx.core.view.InterfaceC1079o2
        /* renamed from: a */
        public void mo1574a(View view) {
            this.f1861a = true;
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: b */
        public void mo1032b(View view) {
            if (this.f1861a) {
                return;
            }
            C0361p1.this.f1842a.setVisibility(this.f1862b);
        }

        @Override // androidx.core.view.C1084p2, androidx.core.view.InterfaceC1079o2
        /* renamed from: c */
        public void mo1033c(View view) {
            C0361p1.this.f1842a.setVisibility(0);
        }
    }

    public C0361p1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C7384h.f16855a, C7381e.f16780n);
    }

    public C0361p1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1856o = 0;
        this.f1857p = 0;
        this.f1842a = toolbar;
        this.f1850i = toolbar.getTitle();
        this.f1851j = toolbar.getSubtitle();
        this.f1849h = this.f1850i != null;
        this.f1848g = toolbar.getNavigationIcon();
        C0349l1 m1845u = C0349l1.m1845u(toolbar.getContext(), null, C7386j.f16979a, C7377a.f16699c, 0);
        this.f1858q = m1845u.m1851f(C7386j.f17034l);
        if (z10) {
            CharSequence m1860o = m1845u.m1860o(C7386j.f17064r);
            if (!TextUtils.isEmpty(m1860o)) {
                setTitle(m1860o);
            }
            CharSequence m1860o2 = m1845u.m1860o(C7386j.f17054p);
            if (!TextUtils.isEmpty(m1860o2)) {
                m1920F(m1860o2);
            }
            Drawable m1851f = m1845u.m1851f(C7386j.f17044n);
            if (m1851f != null) {
                m1916B(m1851f);
            }
            Drawable m1851f2 = m1845u.m1851f(C7386j.f17039m);
            if (m1851f2 != null) {
                setIcon(m1851f2);
            }
            if (this.f1848g == null && (drawable = this.f1858q) != null) {
                m1919E(drawable);
            }
            mo1879j(m1845u.m1855j(C7386j.f17014h, 0));
            int m1858m = m1845u.m1858m(C7386j.f17009g, 0);
            if (m1858m != 0) {
                m1921z(LayoutInflater.from(this.f1842a.getContext()).inflate(m1858m, (ViewGroup) this.f1842a, false));
                mo1879j(this.f1843b | 16);
            }
            int m1857l = m1845u.m1857l(C7386j.f17024j, 0);
            if (m1857l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1842a.getLayoutParams();
                layoutParams.height = m1857l;
                this.f1842a.setLayoutParams(layoutParams);
            }
            int m1849d = m1845u.m1849d(C7386j.f17004f, -1);
            int m1849d2 = m1845u.m1849d(C7386j.f16999e, -1);
            if (m1849d >= 0 || m1849d2 >= 0) {
                this.f1842a.m1541J(Math.max(m1849d, 0), Math.max(m1849d2, 0));
            }
            int m1858m2 = m1845u.m1858m(C7386j.f17069s, 0);
            if (m1858m2 != 0) {
                Toolbar toolbar2 = this.f1842a;
                toolbar2.m1545N(toolbar2.getContext(), m1858m2);
            }
            int m1858m3 = m1845u.m1858m(C7386j.f17059q, 0);
            if (m1858m3 != 0) {
                Toolbar toolbar3 = this.f1842a;
                toolbar3.m1544M(toolbar3.getContext(), m1858m3);
            }
            int m1858m4 = m1845u.m1858m(C7386j.f17049o, 0);
            if (m1858m4 != 0) {
                this.f1842a.setPopupTheme(m1858m4);
            }
        } else {
            this.f1843b = m1914y();
        }
        m1845u.m1864v();
        m1915A(i10);
        this.f1852k = this.f1842a.getNavigationContentDescription();
        this.f1842a.setNavigationOnClickListener(new a());
    }

    /* renamed from: G */
    private void m1910G(CharSequence charSequence) {
        this.f1850i = charSequence;
        if ((this.f1843b & 8) != 0) {
            this.f1842a.setTitle(charSequence);
            if (this.f1849h) {
                C1116x0.m5260Y(this.f1842a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: H */
    private void m1911H() {
        if ((this.f1843b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1852k)) {
                this.f1842a.setNavigationContentDescription(this.f1857p);
            } else {
                this.f1842a.setNavigationContentDescription(this.f1852k);
            }
        }
    }

    /* renamed from: I */
    private void m1912I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1843b & 4) != 0) {
            toolbar = this.f1842a;
            drawable = this.f1848g;
            if (drawable == null) {
                drawable = this.f1858q;
            }
        } else {
            toolbar = this.f1842a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: J */
    private void m1913J() {
        Drawable drawable;
        int i10 = this.f1843b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1847f) == null) {
            drawable = this.f1846e;
        }
        this.f1842a.setLogo(drawable);
    }

    /* renamed from: y */
    private int m1914y() {
        if (this.f1842a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1858q = this.f1842a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void m1915A(int i10) {
        if (i10 == this.f1857p) {
            return;
        }
        this.f1857p = i10;
        if (TextUtils.isEmpty(this.f1842a.getNavigationContentDescription())) {
            m1917C(this.f1857p);
        }
    }

    /* renamed from: B */
    public void m1916B(Drawable drawable) {
        this.f1847f = drawable;
        m1913J();
    }

    /* renamed from: C */
    public void m1917C(int i10) {
        m1918D(i10 == 0 ? null : getContext().getString(i10));
    }

    /* renamed from: D */
    public void m1918D(CharSequence charSequence) {
        this.f1852k = charSequence;
        m1911H();
    }

    /* renamed from: E */
    public void m1919E(Drawable drawable) {
        this.f1848g = drawable;
        m1912I();
    }

    /* renamed from: F */
    public void m1920F(CharSequence charSequence) {
        this.f1851j = charSequence;
        if ((this.f1843b & 8) != 0) {
            this.f1842a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: a */
    public boolean mo1870a() {
        return this.f1842a.m1549d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: b */
    public boolean mo1871b() {
        return this.f1842a.m1557w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: c */
    public boolean mo1872c() {
        return this.f1842a.m1546Q();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public void collapseActionView() {
        this.f1842a.m1550e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: d */
    public void mo1873d(Menu menu, InterfaceC0266m.a aVar) {
        if (this.f1855n == null) {
            C0320c c0320c = new C0320c(this.f1842a.getContext());
            this.f1855n = c0320c;
            c0320c.m1255p(C7382f.f16815g);
        }
        this.f1855n.mo1244d(aVar);
        this.f1842a.m1542K((C0260g) menu, this.f1855n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: e */
    public boolean mo1874e() {
        return this.f1842a.m1539B();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: f */
    public void mo1875f() {
        this.f1854m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: g */
    public void mo1876g(Drawable drawable) {
        C1116x0.m5261Z(this.f1842a, drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public Context getContext() {
        return this.f1842a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public CharSequence getTitle() {
        return this.f1842a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public int getVisibility() {
        return this.f1842a.getVisibility();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: h */
    public boolean mo1877h() {
        return this.f1842a.m1538A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: i */
    public boolean mo1878i() {
        return this.f1842a.m1556v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: j */
    public void mo1879j(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1843b ^ i10;
        this.f1843b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m1911H();
                }
                m1912I();
            }
            if ((i11 & 3) != 0) {
                m1913J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1842a.setTitle(this.f1850i);
                    toolbar = this.f1842a;
                    charSequence = this.f1851j;
                } else {
                    charSequence = null;
                    this.f1842a.setTitle((CharSequence) null);
                    toolbar = this.f1842a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1845d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1842a.addView(view);
            } else {
                this.f1842a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: k */
    public Menu mo1880k() {
        return this.f1842a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: l */
    public int mo1881l() {
        return this.f1856o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: m */
    public C1074n2 mo1882m(int i10, long j10) {
        return C1116x0.m5266c(this.f1842a).m5068b(i10 == 0 ? 1.0f : 0.0f).m5071f(j10).m5073h(new b(i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: n */
    public ViewGroup mo1883n() {
        return this.f1842a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: o */
    public void mo1884o(boolean z10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: p */
    public void mo1885p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: q */
    public void mo1886q(boolean z10) {
        this.f1842a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: r */
    public void mo1887r() {
        this.f1842a.m1551f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: s */
    public void mo1888s(C0325d1 c0325d1) {
        View view = this.f1844c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1842a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1844c);
            }
        }
        this.f1844c = c0325d1;
        if (c0325d1 == null || this.f1856o != 2) {
            return;
        }
        this.f1842a.addView(c0325d1, 0);
        Toolbar.C0310g c0310g = (Toolbar.C0310g) this.f1844c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0310g).width = -2;
        ((ViewGroup.MarginLayoutParams) c0310g).height = -2;
        c0310g.f857a = 8388691;
        c0325d1.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C7605a.m23112b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public void setIcon(Drawable drawable) {
        this.f1846e = drawable;
        m1913J();
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public void setTitle(CharSequence charSequence) {
        this.f1849h = true;
        m1910G(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public void setWindowCallback(Window.Callback callback) {
        this.f1853l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1849h) {
            return;
        }
        m1910G(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: t */
    public void mo1889t(int i10) {
        m1916B(i10 != 0 ? C7605a.m23112b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: u */
    public void mo1890u(InterfaceC0266m.a aVar, C0260g.a aVar2) {
        this.f1842a.m1543L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: v */
    public void mo1891v(int i10) {
        this.f1842a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: w */
    public int mo1892w() {
        return this.f1843b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0357o0
    /* renamed from: x */
    public void mo1893x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: z */
    public void m1921z(View view) {
        View view2 = this.f1845d;
        if (view2 != null && (this.f1843b & 16) != 0) {
            this.f1842a.removeView(view2);
        }
        this.f1845d = view;
        if (view == null || (this.f1843b & 16) == 0) {
            return;
        }
        this.f1842a.addView(view);
    }
}
