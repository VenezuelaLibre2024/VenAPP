package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.o0;
import androidx.core.view.n2;
import androidx.core.view.o2;
import androidx.core.view.p2;
import androidx.core.view.q2;
import androidx.core.view.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class x extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* renamed from: a, reason: collision with root package name */
    Context f905a;

    /* renamed from: b, reason: collision with root package name */
    private Context f906b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f907c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f908d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f909e;

    /* renamed from: f, reason: collision with root package name */
    o0 f910f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f911g;

    /* renamed from: h, reason: collision with root package name */
    View f912h;

    /* renamed from: i, reason: collision with root package name */
    d1 f913i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f916l;

    /* renamed from: m, reason: collision with root package name */
    d f917m;

    /* renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f918n;

    /* renamed from: o, reason: collision with root package name */
    b.a f919o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f920p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f922r;

    /* renamed from: u, reason: collision with root package name */
    boolean f925u;

    /* renamed from: v, reason: collision with root package name */
    boolean f926v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f927w;

    /* renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f929y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f930z;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f914j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f915k = -1;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f921q = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private int f923s = 0;

    /* renamed from: t, reason: collision with root package name */
    boolean f924t = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f928x = true;
    final o2 B = new a();
    final o2 C = new b();
    final q2 D = new c();

    /* loaded from: classes.dex */
    class a extends p2 {
        a() {
        }

        @Override // androidx.core.view.o2
        public void b(View view) {
            View view2;
            x xVar = x.this;
            if (xVar.f924t && (view2 = xVar.f912h) != null) {
                view2.setTranslationY(0.0f);
                x.this.f909e.setTranslationY(0.0f);
            }
            x.this.f909e.setVisibility(8);
            x.this.f909e.setTransitioning(false);
            x xVar2 = x.this;
            xVar2.f929y = null;
            xVar2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = x.this.f908d;
            if (actionBarOverlayLayout != null) {
                x0.T(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends p2 {
        b() {
        }

        @Override // androidx.core.view.o2
        public void b(View view) {
            x xVar = x.this;
            xVar.f929y = null;
            xVar.f909e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements q2 {
        c() {
        }

        @Override // androidx.core.view.q2
        public void a(View view) {
            ((View) x.this.f909e.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f934c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f935d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f936e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<View> f937f;

        public d(Context context, b.a aVar) {
            this.f934c = context;
            this.f936e = aVar;
            androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(context).S(1);
            this.f935d = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f936e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f936e == null) {
                return;
            }
            k();
            x.this.f911g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            x xVar = x.this;
            if (xVar.f917m != this) {
                return;
            }
            if (x.B(xVar.f925u, xVar.f926v, false)) {
                this.f936e.a(this);
            } else {
                x xVar2 = x.this;
                xVar2.f918n = this;
                xVar2.f919o = this.f936e;
            }
            this.f936e = null;
            x.this.A(false);
            x.this.f911g.g();
            x xVar3 = x.this;
            xVar3.f908d.setHideOnContentScrollEnabled(xVar3.A);
            x.this.f917m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f937f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f935d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f934c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return x.this.f911g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return x.this.f911g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (x.this.f917m != this) {
                return;
            }
            this.f935d.e0();
            try {
                this.f936e.d(this, this.f935d);
            } finally {
                this.f935d.d0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return x.this.f911g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            x.this.f911g.setCustomView(view);
            this.f937f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(x.this.f905a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            x.this.f911g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(x.this.f905a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            x.this.f911g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            x.this.f911g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f935d.e0();
            try {
                return this.f936e.b(this, this.f935d);
            } finally {
                this.f935d.d0();
            }
        }
    }

    public x(Activity activity, boolean z10) {
        this.f907c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (z10) {
            return;
        }
        this.f912h = decorView.findViewById(R.id.content);
    }

    public x(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }

    static boolean B(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o0 F(View view) {
        if (view instanceof o0) {
            return (o0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void J() {
        if (this.f927w) {
            this.f927w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f908d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(g.f.f15353p);
        this.f908d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f910f = F(view.findViewById(g.f.f15338a));
        this.f911g = (ActionBarContextView) view.findViewById(g.f.f15343f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(g.f.f15340c);
        this.f909e = actionBarContainer;
        o0 o0Var = this.f910f;
        if (o0Var == null || this.f911g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f905a = o0Var.getContext();
        boolean z10 = (this.f910f.w() & 4) != 0;
        if (z10) {
            this.f916l = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f905a);
        Q(b10.a() || z10);
        O(b10.g());
        TypedArray obtainStyledAttributes = this.f905a.obtainStyledAttributes(null, g.j.f15401a, g.a.f15263c, 0);
        if (obtainStyledAttributes.getBoolean(g.j.f15451k, false)) {
            P(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g.j.f15441i, 0);
        if (dimensionPixelSize != 0) {
            N(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void O(boolean z10) {
        this.f922r = z10;
        if (z10) {
            this.f909e.setTabContainer(null);
            this.f910f.s(this.f913i);
        } else {
            this.f910f.s(null);
            this.f909e.setTabContainer(this.f913i);
        }
        boolean z11 = I() == 2;
        d1 d1Var = this.f913i;
        if (d1Var != null) {
            if (z11) {
                d1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f908d;
                if (actionBarOverlayLayout != null) {
                    x0.T(actionBarOverlayLayout);
                }
            } else {
                d1Var.setVisibility(8);
            }
        }
        this.f910f.q(!this.f922r && z11);
        this.f908d.setHasNonEmbeddedTabs(!this.f922r && z11);
    }

    private boolean R() {
        return x0.H(this.f909e);
    }

    private void S() {
        if (this.f927w) {
            return;
        }
        this.f927w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f908d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T(false);
    }

    private void T(boolean z10) {
        if (B(this.f925u, this.f926v, this.f927w)) {
            if (this.f928x) {
                return;
            }
            this.f928x = true;
            E(z10);
            return;
        }
        if (this.f928x) {
            this.f928x = false;
            D(z10);
        }
    }

    public void A(boolean z10) {
        n2 m10;
        n2 f10;
        if (z10) {
            S();
        } else {
            J();
        }
        if (!R()) {
            if (z10) {
                this.f910f.v(4);
                this.f911g.setVisibility(0);
                return;
            } else {
                this.f910f.v(0);
                this.f911g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            f10 = this.f910f.m(4, 100L);
            m10 = this.f911g.f(0, 200L);
        } else {
            m10 = this.f910f.m(0, 200L);
            f10 = this.f911g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f10, m10);
        hVar.h();
    }

    void C() {
        b.a aVar = this.f919o;
        if (aVar != null) {
            aVar.a(this.f918n);
            this.f918n = null;
            this.f919o = null;
        }
    }

    public void D(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f929y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f923s != 0 || (!this.f930z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f909e.setAlpha(1.0f);
        this.f909e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f909e.getHeight();
        if (z10) {
            this.f909e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        n2 m10 = x0.c(this.f909e).m(f10);
        m10.k(this.D);
        hVar2.c(m10);
        if (this.f924t && (view = this.f912h) != null) {
            hVar2.c(x0.c(view).m(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f929y = hVar2;
        hVar2.h();
    }

    public void E(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f929y;
        if (hVar != null) {
            hVar.a();
        }
        this.f909e.setVisibility(0);
        if (this.f923s == 0 && (this.f930z || z10)) {
            this.f909e.setTranslationY(0.0f);
            float f10 = -this.f909e.getHeight();
            if (z10) {
                this.f909e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f909e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            n2 m10 = x0.c(this.f909e).m(0.0f);
            m10.k(this.D);
            hVar2.c(m10);
            if (this.f924t && (view2 = this.f912h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(x0.c(this.f912h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f929y = hVar2;
            hVar2.h();
        } else {
            this.f909e.setAlpha(1.0f);
            this.f909e.setTranslationY(0.0f);
            if (this.f924t && (view = this.f912h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f908d;
        if (actionBarOverlayLayout != null) {
            x0.T(actionBarOverlayLayout);
        }
    }

    public int G() {
        return this.f909e.getHeight();
    }

    public int H() {
        return this.f908d.getActionBarHideOffset();
    }

    public int I() {
        return this.f910f.l();
    }

    public void L(boolean z10) {
        M(z10 ? 4 : 0, 4);
    }

    public void M(int i10, int i11) {
        int w10 = this.f910f.w();
        if ((i11 & 4) != 0) {
            this.f916l = true;
        }
        this.f910f.j((i10 & i11) | ((~i11) & w10));
    }

    public void N(float f10) {
        x0.d0(this.f909e, f10);
    }

    public void P(boolean z10) {
        if (z10 && !this.f908d.q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f908d.setHideOnContentScrollEnabled(z10);
    }

    public void Q(boolean z10) {
        this.f910f.o(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f926v) {
            this.f926v = false;
            T(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f924t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f926v) {
            return;
        }
        this.f926v = true;
        T(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f929y;
        if (hVar != null) {
            hVar.a();
            this.f929y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        o0 o0Var = this.f910f;
        if (o0Var == null || !o0Var.i()) {
            return false;
        }
        this.f910f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f920p) {
            return;
        }
        this.f920p = z10;
        int size = this.f921q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f921q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f910f.w();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f906b == null) {
            TypedValue typedValue = new TypedValue();
            this.f905a.getTheme().resolveAttribute(g.a.f15267g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f906b = new ContextThemeWrapper(this.f905a, i10);
            } else {
                this.f906b = this.f905a;
            }
        }
        return this.f906b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f925u) {
            return;
        }
        this.f925u = true;
        T(false);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        int G = G();
        return this.f928x && (G == 0 || H() < G);
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        O(androidx.appcompat.view.a.b(this.f905a).g());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f923s = i10;
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f917m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f909e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        if (this.f916l) {
            return;
        }
        L(z10);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        M(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f930z = z10;
        if (z10 || (hVar = this.f929y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f910f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f910f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y() {
        if (this.f925u) {
            this.f925u = false;
            T(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b z(b.a aVar) {
        d dVar = this.f917m;
        if (dVar != null) {
            dVar.c();
        }
        this.f908d.setHideOnContentScrollEnabled(false);
        this.f911g.k();
        d dVar2 = new d(this.f911g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f917m = dVar2;
        dVar2.k();
        this.f911g.h(dVar2);
        A(true);
        return dVar2;
    }
}
