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
import androidx.appcompat.app.AbstractC0218a;
import androidx.appcompat.view.AbstractC0243b;
import androidx.appcompat.view.C0242a;
import androidx.appcompat.view.C0248g;
import androidx.appcompat.view.C0249h;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0325d1;
import androidx.appcompat.widget.InterfaceC0357o0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1074n2;
import androidx.core.view.C1084p2;
import androidx.core.view.C1116x0;
import androidx.core.view.InterfaceC1079o2;
import androidx.core.view.InterfaceC1089q2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p111g.C7377a;
import p111g.C7382f;
import p111g.C7386j;

/* renamed from: androidx.appcompat.app.x */
/* loaded from: classes.dex */
public class C0241x extends AbstractC0218a implements ActionBarOverlayLayout.InterfaceC0278d {

    /* renamed from: E */
    private static final Interpolator f1030E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f1031F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f1032A;

    /* renamed from: a */
    Context f1036a;

    /* renamed from: b */
    private Context f1037b;

    /* renamed from: c */
    private Activity f1038c;

    /* renamed from: d */
    ActionBarOverlayLayout f1039d;

    /* renamed from: e */
    ActionBarContainer f1040e;

    /* renamed from: f */
    InterfaceC0357o0 f1041f;

    /* renamed from: g */
    ActionBarContextView f1042g;

    /* renamed from: h */
    View f1043h;

    /* renamed from: i */
    C0325d1 f1044i;

    /* renamed from: l */
    private boolean f1047l;

    /* renamed from: m */
    d f1048m;

    /* renamed from: n */
    AbstractC0243b f1049n;

    /* renamed from: o */
    AbstractC0243b.a f1050o;

    /* renamed from: p */
    private boolean f1051p;

    /* renamed from: r */
    private boolean f1053r;

    /* renamed from: u */
    boolean f1056u;

    /* renamed from: v */
    boolean f1057v;

    /* renamed from: w */
    private boolean f1058w;

    /* renamed from: y */
    C0249h f1060y;

    /* renamed from: z */
    private boolean f1061z;

    /* renamed from: j */
    private ArrayList<Object> f1045j = new ArrayList<>();

    /* renamed from: k */
    private int f1046k = -1;

    /* renamed from: q */
    private ArrayList<AbstractC0218a.b> f1052q = new ArrayList<>();

    /* renamed from: s */
    private int f1054s = 0;

    /* renamed from: t */
    boolean f1055t = true;

    /* renamed from: x */
    private boolean f1059x = true;

    /* renamed from: B */
    final InterfaceC1079o2 f1033B = new a();

    /* renamed from: C */
    final InterfaceC1079o2 f1034C = new b();

    /* renamed from: D */
    final InterfaceC1089q2 f1035D = new c();

    /* renamed from: androidx.appcompat.app.x$a */
    /* loaded from: classes.dex */
    class a extends C1084p2 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: b */
        public void mo1032b(View view) {
            View view2;
            C0241x c0241x = C0241x.this;
            if (c0241x.f1055t && (view2 = c0241x.f1043h) != null) {
                view2.setTranslationY(0.0f);
                C0241x.this.f1040e.setTranslationY(0.0f);
            }
            C0241x.this.f1040e.setVisibility(8);
            C0241x.this.f1040e.setTransitioning(false);
            C0241x c0241x2 = C0241x.this;
            c0241x2.f1060y = null;
            c0241x2.m1138C();
            ActionBarOverlayLayout actionBarOverlayLayout = C0241x.this.f1039d;
            if (actionBarOverlayLayout != null) {
                C1116x0.m5255T(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.x$b */
    /* loaded from: classes.dex */
    class b extends C1084p2 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: b */
        public void mo1032b(View view) {
            C0241x c0241x = C0241x.this;
            c0241x.f1060y = null;
            c0241x.f1040e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.x$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC1089q2 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1089q2
        /* renamed from: a */
        public void mo1154a(View view) {
            ((View) C0241x.this.f1040e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.x$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC0243b implements C0260g.a {

        /* renamed from: c */
        private final Context f1065c;

        /* renamed from: d */
        private final C0260g f1066d;

        /* renamed from: e */
        private AbstractC0243b.a f1067e;

        /* renamed from: f */
        private WeakReference<View> f1068f;

        public d(Context context, AbstractC0243b.a aVar) {
            this.f1065c = context;
            this.f1067e = aVar;
            C0260g m1316S = new C0260g(context).m1316S(1);
            this.f1066d = m1316S;
            m1316S.mo1315R(this);
        }

        @Override // androidx.appcompat.view.menu.C0260g.a
        /* renamed from: a */
        public boolean mo1012a(C0260g c0260g, MenuItem menuItem) {
            AbstractC0243b.a aVar = this.f1067e;
            if (aVar != null) {
                return aVar.mo1039c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0260g.a
        /* renamed from: b */
        public void mo1014b(C0260g c0260g) {
            if (this.f1067e == null) {
                return;
            }
            mo1161k();
            C0241x.this.f1042g.m1418l();
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: c */
        public void mo1155c() {
            C0241x c0241x = C0241x.this;
            if (c0241x.f1048m != this) {
                return;
            }
            if (C0241x.m1129B(c0241x.f1056u, c0241x.f1057v, false)) {
                this.f1067e.mo1037a(this);
            } else {
                C0241x c0241x2 = C0241x.this;
                c0241x2.f1049n = this;
                c0241x2.f1050o = this.f1067e;
            }
            this.f1067e = null;
            C0241x.this.m1137A(false);
            C0241x.this.f1042g.m1414g();
            C0241x c0241x3 = C0241x.this;
            c0241x3.f1039d.setHideOnContentScrollEnabled(c0241x3.f1032A);
            C0241x.this.f1048m = null;
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: d */
        public View mo1156d() {
            WeakReference<View> weakReference = this.f1068f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: e */
        public Menu mo1157e() {
            return this.f1066d;
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: f */
        public MenuInflater mo1158f() {
            return new C0248g(this.f1065c);
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: g */
        public CharSequence mo1159g() {
            return C0241x.this.f1042g.getSubtitle();
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: i */
        public CharSequence mo1160i() {
            return C0241x.this.f1042g.getTitle();
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: k */
        public void mo1161k() {
            if (C0241x.this.f1048m != this) {
                return;
            }
            this.f1066d.m1331e0();
            try {
                this.f1067e.mo1040d(this, this.f1066d);
            } finally {
                this.f1066d.m1329d0();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: l */
        public boolean mo1162l() {
            return C0241x.this.f1042g.m1416j();
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: m */
        public void mo1163m(View view) {
            C0241x.this.f1042g.setCustomView(view);
            this.f1068f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: n */
        public void mo1164n(int i10) {
            mo1165o(C0241x.this.f1036a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: o */
        public void mo1165o(CharSequence charSequence) {
            C0241x.this.f1042g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: q */
        public void mo1166q(int i10) {
            mo1167r(C0241x.this.f1036a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: r */
        public void mo1167r(CharSequence charSequence) {
            C0241x.this.f1042g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0243b
        /* renamed from: s */
        public void mo1168s(boolean z10) {
            super.mo1168s(z10);
            C0241x.this.f1042g.setTitleOptional(z10);
        }

        /* renamed from: t */
        public boolean m1169t() {
            this.f1066d.m1331e0();
            try {
                return this.f1067e.mo1038b(this, this.f1066d);
            } finally {
                this.f1066d.m1329d0();
            }
        }
    }

    public C0241x(Activity activity, boolean z10) {
        this.f1038c = activity;
        View decorView = activity.getWindow().getDecorView();
        m1132K(decorView);
        if (z10) {
            return;
        }
        this.f1043h = decorView.findViewById(R.id.content);
    }

    public C0241x(Dialog dialog) {
        m1132K(dialog.getWindow().getDecorView());
    }

    /* renamed from: B */
    static boolean m1129B(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    private InterfaceC0357o0 m1130F(View view) {
        if (view instanceof InterfaceC0357o0) {
            return (InterfaceC0357o0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: J */
    private void m1131J() {
        if (this.f1058w) {
            this.f1058w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1039d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1136T(false);
        }
    }

    /* renamed from: K */
    private void m1132K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C7382f.f16824p);
        this.f1039d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1041f = m1130F(view.findViewById(C7382f.f16809a));
        this.f1042g = (ActionBarContextView) view.findViewById(C7382f.f16814f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C7382f.f16811c);
        this.f1040e = actionBarContainer;
        InterfaceC0357o0 interfaceC0357o0 = this.f1041f;
        if (interfaceC0357o0 == null || this.f1042g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1036a = interfaceC0357o0.getContext();
        boolean z10 = (this.f1041f.mo1892w() & 4) != 0;
        if (z10) {
            this.f1047l = true;
        }
        C0242a m1170b = C0242a.m1170b(this.f1036a);
        m1148Q(m1170b.m1171a() || z10);
        m1133O(m1170b.m1176g());
        TypedArray obtainStyledAttributes = this.f1036a.obtainStyledAttributes(null, C7386j.f16979a, C7377a.f16699c, 0);
        if (obtainStyledAttributes.getBoolean(C7386j.f17029k, false)) {
            m1147P(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7386j.f17019i, 0);
        if (dimensionPixelSize != 0) {
            m1146N(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private void m1133O(boolean z10) {
        this.f1053r = z10;
        if (z10) {
            this.f1040e.setTabContainer(null);
            this.f1041f.mo1888s(this.f1044i);
        } else {
            this.f1041f.mo1888s(null);
            this.f1040e.setTabContainer(this.f1044i);
        }
        boolean z11 = m1143I() == 2;
        C0325d1 c0325d1 = this.f1044i;
        if (c0325d1 != null) {
            if (z11) {
                c0325d1.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1039d;
                if (actionBarOverlayLayout != null) {
                    C1116x0.m5255T(actionBarOverlayLayout);
                }
            } else {
                c0325d1.setVisibility(8);
            }
        }
        this.f1041f.mo1886q(!this.f1053r && z11);
        this.f1039d.setHasNonEmbeddedTabs(!this.f1053r && z11);
    }

    /* renamed from: R */
    private boolean m1134R() {
        return C1116x0.m5243H(this.f1040e);
    }

    /* renamed from: S */
    private void m1135S() {
        if (this.f1058w) {
            return;
        }
        this.f1058w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1039d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m1136T(false);
    }

    /* renamed from: T */
    private void m1136T(boolean z10) {
        if (m1129B(this.f1056u, this.f1057v, this.f1058w)) {
            if (this.f1059x) {
                return;
            }
            this.f1059x = true;
            m1140E(z10);
            return;
        }
        if (this.f1059x) {
            this.f1059x = false;
            m1139D(z10);
        }
    }

    /* renamed from: A */
    public void m1137A(boolean z10) {
        C1074n2 mo1882m;
        C1074n2 mo1413f;
        if (z10) {
            m1135S();
        } else {
            m1131J();
        }
        if (!m1134R()) {
            if (z10) {
                this.f1041f.mo1891v(4);
                this.f1042g.setVisibility(0);
                return;
            } else {
                this.f1041f.mo1891v(0);
                this.f1042g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            mo1413f = this.f1041f.mo1882m(4, 100L);
            mo1882m = this.f1042g.mo1413f(0, 200L);
        } else {
            mo1882m = this.f1041f.mo1882m(0, 200L);
            mo1413f = this.f1042g.mo1413f(8, 100L);
        }
        C0249h c0249h = new C0249h();
        c0249h.m1205d(mo1413f, mo1882m);
        c0249h.m1209h();
    }

    /* renamed from: C */
    void m1138C() {
        AbstractC0243b.a aVar = this.f1050o;
        if (aVar != null) {
            aVar.mo1037a(this.f1049n);
            this.f1049n = null;
            this.f1050o = null;
        }
    }

    /* renamed from: D */
    public void m1139D(boolean z10) {
        View view;
        C0249h c0249h = this.f1060y;
        if (c0249h != null) {
            c0249h.m1202a();
        }
        if (this.f1054s != 0 || (!this.f1061z && !z10)) {
            this.f1033B.mo1032b(null);
            return;
        }
        this.f1040e.setAlpha(1.0f);
        this.f1040e.setTransitioning(true);
        C0249h c0249h2 = new C0249h();
        float f10 = -this.f1040e.getHeight();
        if (z10) {
            this.f1040e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C1074n2 m5077m = C1116x0.m5266c(this.f1040e).m5077m(f10);
        m5077m.m5075k(this.f1035D);
        c0249h2.m1204c(m5077m);
        if (this.f1055t && (view = this.f1043h) != null) {
            c0249h2.m1204c(C1116x0.m5266c(view).m5077m(f10));
        }
        c0249h2.m1207f(f1030E);
        c0249h2.m1206e(250L);
        c0249h2.m1208g(this.f1033B);
        this.f1060y = c0249h2;
        c0249h2.m1209h();
    }

    /* renamed from: E */
    public void m1140E(boolean z10) {
        View view;
        View view2;
        C0249h c0249h = this.f1060y;
        if (c0249h != null) {
            c0249h.m1202a();
        }
        this.f1040e.setVisibility(0);
        if (this.f1054s == 0 && (this.f1061z || z10)) {
            this.f1040e.setTranslationY(0.0f);
            float f10 = -this.f1040e.getHeight();
            if (z10) {
                this.f1040e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f1040e.setTranslationY(f10);
            C0249h c0249h2 = new C0249h();
            C1074n2 m5077m = C1116x0.m5266c(this.f1040e).m5077m(0.0f);
            m5077m.m5075k(this.f1035D);
            c0249h2.m1204c(m5077m);
            if (this.f1055t && (view2 = this.f1043h) != null) {
                view2.setTranslationY(f10);
                c0249h2.m1204c(C1116x0.m5266c(this.f1043h).m5077m(0.0f));
            }
            c0249h2.m1207f(f1031F);
            c0249h2.m1206e(250L);
            c0249h2.m1208g(this.f1034C);
            this.f1060y = c0249h2;
            c0249h2.m1209h();
        } else {
            this.f1040e.setAlpha(1.0f);
            this.f1040e.setTranslationY(0.0f);
            if (this.f1055t && (view = this.f1043h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1034C.mo1032b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1039d;
        if (actionBarOverlayLayout != null) {
            C1116x0.m5255T(actionBarOverlayLayout);
        }
    }

    /* renamed from: G */
    public int m1141G() {
        return this.f1040e.getHeight();
    }

    /* renamed from: H */
    public int m1142H() {
        return this.f1039d.getActionBarHideOffset();
    }

    /* renamed from: I */
    public int m1143I() {
        return this.f1041f.mo1881l();
    }

    /* renamed from: L */
    public void m1144L(boolean z10) {
        m1145M(z10 ? 4 : 0, 4);
    }

    /* renamed from: M */
    public void m1145M(int i10, int i11) {
        int mo1892w = this.f1041f.mo1892w();
        if ((i11 & 4) != 0) {
            this.f1047l = true;
        }
        this.f1041f.mo1879j((i10 & i11) | ((~i11) & mo1892w));
    }

    /* renamed from: N */
    public void m1146N(float f10) {
        C1116x0.m5269d0(this.f1040e, f10);
    }

    /* renamed from: P */
    public void m1147P(boolean z10) {
        if (z10 && !this.f1039d.m1439q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f1032A = z10;
        this.f1039d.setHideOnContentScrollEnabled(z10);
    }

    /* renamed from: Q */
    public void m1148Q(boolean z10) {
        this.f1041f.mo1884o(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0278d
    /* renamed from: a */
    public void mo1149a() {
        if (this.f1057v) {
            this.f1057v = false;
            m1136T(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0278d
    /* renamed from: b */
    public void mo1150b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0278d
    /* renamed from: c */
    public void mo1151c(boolean z10) {
        this.f1055t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0278d
    /* renamed from: d */
    public void mo1152d() {
        if (this.f1057v) {
            return;
        }
        this.f1057v = true;
        m1136T(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0278d
    /* renamed from: e */
    public void mo1153e() {
        C0249h c0249h = this.f1060y;
        if (c0249h != null) {
            c0249h.m1202a();
            this.f1060y = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: g */
    public boolean mo879g() {
        InterfaceC0357o0 interfaceC0357o0 = this.f1041f;
        if (interfaceC0357o0 == null || !interfaceC0357o0.mo1878i()) {
            return false;
        }
        this.f1041f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: h */
    public void mo880h(boolean z10) {
        if (z10 == this.f1051p) {
            return;
        }
        this.f1051p = z10;
        int size = this.f1052q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1052q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: i */
    public int mo881i() {
        return this.f1041f.mo1892w();
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: j */
    public Context mo882j() {
        if (this.f1037b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1036a.getTheme().resolveAttribute(C7377a.f16703g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f1037b = new ContextThemeWrapper(this.f1036a, i10);
            } else {
                this.f1037b = this.f1036a;
            }
        }
        return this.f1037b;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: k */
    public void mo883k() {
        if (this.f1056u) {
            return;
        }
        this.f1056u = true;
        m1136T(false);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: m */
    public boolean mo885m() {
        int m1141G = m1141G();
        return this.f1059x && (m1141G == 0 || m1142H() < m1141G);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: n */
    public void mo886n(Configuration configuration) {
        m1133O(C0242a.m1170b(this.f1036a).m1176g());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0278d
    public void onWindowVisibilityChanged(int i10) {
        this.f1054s = i10;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: p */
    public boolean mo888p(int i10, KeyEvent keyEvent) {
        Menu mo1157e;
        d dVar = this.f1048m;
        if (dVar == null || (mo1157e = dVar.mo1157e()) == null) {
            return false;
        }
        mo1157e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo1157e.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: s */
    public void mo891s(Drawable drawable) {
        this.f1040e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: t */
    public void mo892t(boolean z10) {
        if (this.f1047l) {
            return;
        }
        m1144L(z10);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: u */
    public void mo893u(boolean z10) {
        m1145M(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: v */
    public void mo894v(boolean z10) {
        C0249h c0249h;
        this.f1061z = z10;
        if (z10 || (c0249h = this.f1060y) == null) {
            return;
        }
        c0249h.m1202a();
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: w */
    public void mo895w(CharSequence charSequence) {
        this.f1041f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: x */
    public void mo896x(CharSequence charSequence) {
        this.f1041f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: y */
    public void mo897y() {
        if (this.f1056u) {
            this.f1056u = false;
            m1136T(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: z */
    public AbstractC0243b mo898z(AbstractC0243b.a aVar) {
        d dVar = this.f1048m;
        if (dVar != null) {
            dVar.mo1155c();
        }
        this.f1039d.setHideOnContentScrollEnabled(false);
        this.f1042g.m1417k();
        d dVar2 = new d(this.f1042g.getContext(), aVar);
        if (!dVar2.m1169t()) {
            return null;
        }
        this.f1048m = dVar2;
        dVar2.mo1161k();
        this.f1042g.m1415h(dVar2);
        m1137A(true);
        return dVar2;
    }
}
