package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private int D;
    private c1 E;
    private int F;
    private int G;
    private int H;
    private CharSequence I;
    private CharSequence J;
    private ColorStateList K;
    private ColorStateList L;
    private boolean M;
    private boolean N;
    private final ArrayList<View> O;
    private final ArrayList<View> P;
    private final int[] Q;
    final androidx.core.view.x R;
    private ArrayList<MenuItem> S;
    h T;
    private final ActionMenuView.e U;
    private p1 V;
    private androidx.appcompat.widget.c W;

    /* renamed from: a */
    ActionMenuView f1321a;

    /* renamed from: a0 */
    private f f1322a0;

    /* renamed from: b */
    private TextView f1323b;

    /* renamed from: b0 */
    private m.a f1324b0;

    /* renamed from: c */
    private TextView f1325c;

    /* renamed from: c0 */
    g.a f1326c0;

    /* renamed from: d */
    private ImageButton f1327d;

    /* renamed from: d0 */
    private boolean f1328d0;

    /* renamed from: e */
    private ImageView f1329e;

    /* renamed from: e0 */
    private OnBackInvokedCallback f1330e0;

    /* renamed from: f */
    private Drawable f1331f;

    /* renamed from: f0 */
    private OnBackInvokedDispatcher f1332f0;

    /* renamed from: g0 */
    private boolean f1333g0;

    /* renamed from: h0 */
    private final Runnable f1334h0;

    /* renamed from: r */
    private CharSequence f1335r;

    /* renamed from: s */
    ImageButton f1336s;

    /* renamed from: t */
    View f1337t;

    /* renamed from: u */
    private Context f1338u;

    /* renamed from: v */
    private int f1339v;

    /* renamed from: w */
    private int f1340w;

    /* renamed from: x */
    private int f1341x;

    /* renamed from: y */
    int f1342y;

    /* renamed from: z */
    private int f1343z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.R.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.T;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.f1326c0;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f1321a.F()) {
                Toolbar.this.R.k(gVar);
            }
            g.a aVar = Toolbar.this.f1326c0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.o1

                /* renamed from: a */
                public final /* synthetic */ Runnable f1558a;

                public /* synthetic */ o1(Runnable runnable2) {
                    r1 = runnable2;
                }

                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    r1.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.m {

        /* renamed from: a */
        androidx.appcompat.view.menu.g f1348a;

        /* renamed from: b */
        androidx.appcompat.view.menu.i f1349b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean c(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1336s.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1336s);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1336s);
            }
            Toolbar.this.f1337t = iVar.getActionView();
            this.f1349b = iVar;
            ViewParent parent2 = Toolbar.this.f1337t.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1337t);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f758a = (toolbar4.f1342y & 112) | 8388611;
                generateDefaultLayoutParams.f1351b = 2;
                toolbar4.f1337t.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1337t);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1337t;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void f(boolean z10) {
            if (this.f1349b != null) {
                androidx.appcompat.view.menu.g gVar = this.f1348a;
                boolean z11 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1348a.getItem(i10) == this.f1349b) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    return;
                }
                h(this.f1348a, this.f1349b);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean h(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f1337t;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1337t);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1336s);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1337t = null;
            toolbar3.a();
            this.f1349b = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1348a;
            if (gVar2 != null && (iVar = this.f1349b) != null) {
                gVar2.f(iVar);
            }
            this.f1348a = gVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0018a {

        /* renamed from: b */
        int f1351b;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1351b = 0;
            this.f758a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1351b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1351b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1351b = 0;
            a(marginLayoutParams);
        }

        public g(a.C0018a c0018a) {
            super(c0018a);
            this.f1351b = 0;
        }

        public g(g gVar) {
            super((a.C0018a) gVar);
            this.f1351b = 0;
            this.f1351b = gVar.f1351b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class i extends v0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c */
        int f1352c;

        /* renamed from: d */
        boolean f1353d;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1352c = parcel.readInt();
            this.f1353d = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1352c);
            parcel.writeInt(this.f1353d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.M);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.H = 8388627;
        this.O = new ArrayList<>();
        this.P = new ArrayList<>();
        this.Q = new int[2];
        this.R = new androidx.core.view.x(new Runnable() { // from class: androidx.appcompat.widget.m1
            public /* synthetic */ m1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.S = new ArrayList<>();
        this.U = new a();
        this.f1334h0 = new b();
        Context context2 = getContext();
        int[] iArr = g.j.O2;
        l1 u10 = l1.u(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.x0.U(this, context, iArr, attributeSet, u10.q(), i10, 0);
        this.f1340w = u10.m(g.j.f15485q3, 0);
        this.f1341x = u10.m(g.j.f15440h3, 0);
        this.H = u10.k(g.j.P2, this.H);
        this.f1342y = u10.k(g.j.Q2, 48);
        int d10 = u10.d(g.j.f15455k3, 0);
        int i11 = g.j.f15480p3;
        d10 = u10.r(i11) ? u10.d(i11, d10) : d10;
        this.D = d10;
        this.C = d10;
        this.B = d10;
        this.A = d10;
        int d11 = u10.d(g.j.f15470n3, -1);
        if (d11 >= 0) {
            this.A = d11;
        }
        int d12 = u10.d(g.j.f15465m3, -1);
        if (d12 >= 0) {
            this.B = d12;
        }
        int d13 = u10.d(g.j.f15475o3, -1);
        if (d13 >= 0) {
            this.C = d13;
        }
        int d14 = u10.d(g.j.f15460l3, -1);
        if (d14 >= 0) {
            this.D = d14;
        }
        this.f1343z = u10.e(g.j.f15410b3, -1);
        int d15 = u10.d(g.j.X2, Integer.MIN_VALUE);
        int d16 = u10.d(g.j.T2, Integer.MIN_VALUE);
        int e10 = u10.e(g.j.V2, 0);
        int e11 = u10.e(g.j.W2, 0);
        h();
        this.E.e(e10, e11);
        if (d15 != Integer.MIN_VALUE || d16 != Integer.MIN_VALUE) {
            this.E.g(d15, d16);
        }
        this.F = u10.d(g.j.Y2, Integer.MIN_VALUE);
        this.G = u10.d(g.j.U2, Integer.MIN_VALUE);
        this.f1331f = u10.f(g.j.S2);
        this.f1335r = u10.o(g.j.R2);
        CharSequence o10 = u10.o(g.j.f15450j3);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = u10.o(g.j.f15435g3);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f1338u = getContext();
        setPopupTheme(u10.m(g.j.f15430f3, 0));
        Drawable f10 = u10.f(g.j.f15425e3);
        if (f10 != null) {
            setNavigationIcon(f10);
        }
        CharSequence o12 = u10.o(g.j.f15420d3);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable f11 = u10.f(g.j.Z2);
        if (f11 != null) {
            setLogo(f11);
        }
        CharSequence o13 = u10.o(g.j.f15405a3);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        int i12 = g.j.f15490r3;
        if (u10.r(i12)) {
            setTitleTextColor(u10.c(i12));
        }
        int i13 = g.j.f15445i3;
        if (u10.r(i13)) {
            setSubtitleTextColor(u10.c(i13));
        }
        int i14 = g.j.f15415c3;
        if (u10.r(i14)) {
            x(u10.m(i14, 0));
        }
        u10.v();
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.R.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.S = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f1334h0);
        post(this.f1334h0);
    }

    private boolean O() {
        if (!this.f1328d0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.x0.u(this) == 1;
        int childCount = getChildCount();
        int a10 = androidx.core.view.r.a(i10, androidx.core.view.x0.u(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1351b == 0 && P(childAt) && p(gVar.f758a) == a10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1351b == 0 && P(childAt2) && p(gVar2.f758a) == a10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f1351b = 1;
        if (!z10 || this.f1337t == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.P.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.E == null) {
            this.E = new c1();
        }
    }

    private void i() {
        if (this.f1329e == null) {
            this.f1329e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1321a.J() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1321a.getMenu();
            if (this.f1322a0 == null) {
                this.f1322a0 = new f();
            }
            this.f1321a.setExpandedActionViewsExclusive(true);
            gVar.c(this.f1322a0, this.f1338u);
            R();
        }
    }

    private void k() {
        if (this.f1321a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1321a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1339v);
            this.f1321a.setOnMenuItemClickListener(this.U);
            this.f1321a.K(this.f1324b0, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f758a = (this.f1342y & 112) | 8388613;
            this.f1321a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1321a, false);
        }
    }

    private void l() {
        if (this.f1327d == null) {
            this.f1327d = new o(getContext(), null, g.a.L);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f758a = (this.f1342y & 112) | 8388611;
            this.f1327d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int u10 = androidx.core.view.x0.u(this);
        int a10 = androidx.core.view.r.a(i10, u10) & 7;
        return (a10 == 1 || a10 == 3 || a10 == 5) ? a10 : u10 == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(gVar.f758a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.H & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.u.b(marginLayoutParams) + androidx.core.view.u.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.P.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1321a;
        return actionMenuView != null && actionMenuView.E();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1321a;
        return actionMenuView != null && actionMenuView.F();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1351b != 2 && childAt != this.f1321a) {
                removeViewAt(childCount);
                this.P.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.E.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f1321a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g J = this.f1321a.J();
        if (J == gVar) {
            return;
        }
        if (J != null) {
            J.O(this.W);
            J.O(this.f1322a0);
        }
        if (this.f1322a0 == null) {
            this.f1322a0 = new f();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.f1338u);
            gVar.c(this.f1322a0, this.f1338u);
        } else {
            cVar.i(this.f1338u, null);
            this.f1322a0.i(this.f1338u, null);
            cVar.f(true);
            this.f1322a0.f(true);
        }
        this.f1321a.setPopupTheme(this.f1339v);
        this.f1321a.setPresenter(cVar);
        this.W = cVar;
        R();
    }

    public void L(m.a aVar, g.a aVar2) {
        this.f1324b0 = aVar;
        this.f1326c0 = aVar2;
        ActionMenuView actionMenuView = this.f1321a;
        if (actionMenuView != null) {
            actionMenuView.K(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1341x = i10;
        TextView textView = this.f1325c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1340w = i10;
        TextView textView = this.f1323b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1321a;
        return actionMenuView != null && actionMenuView.L();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && androidx.core.view.x0.G(this) && this.f1333g0;
            if (z10 && this.f1332f0 == null) {
                if (this.f1330e0 == null) {
                    this.f1330e0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.n1
                        public /* synthetic */ n1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a10, this.f1330e0);
            } else {
                if (z10 || (onBackInvokedDispatcher = this.f1332f0) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.f1330e0);
                a10 = null;
            }
            this.f1332f0 = a10;
        }
    }

    void a() {
        for (int size = this.P.size() - 1; size >= 0; size--) {
            addView(this.P.get(size));
        }
        this.P.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1321a) != null && actionMenuView.G();
    }

    public void e() {
        f fVar = this.f1322a0;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f1349b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1321a;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f1336s == null) {
            o oVar = new o(getContext(), null, g.a.L);
            this.f1336s = oVar;
            oVar.setImageDrawable(this.f1331f);
            this.f1336s.setContentDescription(this.f1335r);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f758a = (this.f1342y & 112) | 8388611;
            generateDefaultLayoutParams.f1351b = 2;
            this.f1336s.setLayoutParams(generateDefaultLayoutParams);
            this.f1336s.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1336s;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1336s;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        c1 c1Var = this.E;
        if (c1Var != null) {
            return c1Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.G;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        c1 c1Var = this.E;
        if (c1Var != null) {
            return c1Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        c1 c1Var = this.E;
        if (c1Var != null) {
            return c1Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        c1 c1Var = this.E;
        if (c1Var != null) {
            return c1Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.F;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g J;
        ActionMenuView actionMenuView = this.f1321a;
        return actionMenuView != null && (J = actionMenuView.J()) != null && J.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.G, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.x0.u(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.x0.u(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.F, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1329e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1329e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1321a.getMenu();
    }

    View getNavButtonView() {
        return this.f1327d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1327d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1327d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.W;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1321a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1338u;
    }

    public int getPopupTheme() {
        return this.f1339v;
    }

    public CharSequence getSubtitle() {
        return this.J;
    }

    final TextView getSubtitleTextView() {
        return this.f1325c;
    }

    public CharSequence getTitle() {
        return this.I;
    }

    public int getTitleMarginBottom() {
        return this.D;
    }

    public int getTitleMarginEnd() {
        return this.B;
    }

    public int getTitleMarginStart() {
        return this.A;
    }

    public int getTitleMarginTop() {
        return this.C;
    }

    final TextView getTitleTextView() {
        return this.f1323b;
    }

    public o0 getWrapper() {
        if (this.V == null) {
            this.V = new p1(this, true);
        }
        return this.V;
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0018a ? new g((a.C0018a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1334h0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.N = false;
        }
        if (!this.N) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.N = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295 A[LOOP:0: B:46:0x0293->B:47:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b7 A[LOOP:1: B:50:0x02b5->B:51:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f0 A[LOOP:2: B:59:0x02ee->B:60:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.Q;
        boolean b10 = x1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (P(this.f1327d)) {
            F(this.f1327d, i10, 0, i11, 0, this.f1343z);
            i12 = this.f1327d.getMeasuredWidth() + s(this.f1327d);
            i13 = Math.max(0, this.f1327d.getMeasuredHeight() + t(this.f1327d));
            i14 = View.combineMeasuredStates(0, this.f1327d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f1336s)) {
            F(this.f1336s, i10, 0, i11, 0, this.f1343z);
            i12 = this.f1336s.getMeasuredWidth() + s(this.f1336s);
            i13 = Math.max(i13, this.f1336s.getMeasuredHeight() + t(this.f1336s));
            i14 = View.combineMeasuredStates(i14, this.f1336s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f1321a)) {
            F(this.f1321a, i10, max, i11, 0, this.f1343z);
            i15 = this.f1321a.getMeasuredWidth() + s(this.f1321a);
            i13 = Math.max(i13, this.f1321a.getMeasuredHeight() + t(this.f1321a));
            i14 = View.combineMeasuredStates(i14, this.f1321a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f1337t)) {
            max2 += E(this.f1337t, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1337t.getMeasuredHeight() + t(this.f1337t));
            i14 = View.combineMeasuredStates(i14, this.f1337t.getMeasuredState());
        }
        if (P(this.f1329e)) {
            max2 += E(this.f1329e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1329e.getMeasuredHeight() + t(this.f1329e));
            i14 = View.combineMeasuredStates(i14, this.f1329e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f1351b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.C + this.D;
        int i22 = this.A + this.B;
        if (P(this.f1323b)) {
            E(this.f1323b, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1323b.getMeasuredWidth() + s(this.f1323b);
            i16 = this.f1323b.getMeasuredHeight() + t(this.f1323b);
            i17 = View.combineMeasuredStates(i14, this.f1323b.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (P(this.f1325c)) {
            i18 = Math.max(i18, E(this.f1325c, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f1325c.getMeasuredHeight() + t(this.f1325c);
            i17 = View.combineMeasuredStates(i17, this.f1325c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i16) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f1321a;
        androidx.appcompat.view.menu.g J = actionMenuView != null ? actionMenuView.J() : null;
        int i10 = iVar.f1352c;
        if (i10 != 0 && this.f1322a0 != null && J != null && (findItem = J.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f1353d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.E.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.f1322a0;
        if (fVar != null && (iVar = fVar.f1349b) != null) {
            iVar2.f1352c = iVar.getItemId();
        }
        iVar2.f1353d = B();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = false;
        }
        if (!this.M) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1333g0 != z10) {
            this.f1333g0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1336s;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(h.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1336s.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1336s;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1331f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1328d0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.G) {
            this.G = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.F) {
            this.F = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(h.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1329e)) {
                c(this.f1329e, true);
            }
        } else {
            ImageView imageView = this.f1329e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1329e);
                this.P.remove(this.f1329e);
            }
        }
        ImageView imageView2 = this.f1329e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1329e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1327d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            r1.a(this.f1327d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(h.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1327d)) {
                c(this.f1327d, true);
            }
        } else {
            ImageButton imageButton = this.f1327d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1327d);
                this.P.remove(this.f1327d);
            }
        }
        ImageButton imageButton2 = this.f1327d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1327d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.T = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1321a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1339v != i10) {
            this.f1339v = i10;
            if (i10 == 0) {
                this.f1338u = getContext();
            } else {
                this.f1338u = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1325c;
            if (textView != null && z(textView)) {
                removeView(this.f1325c);
                this.P.remove(this.f1325c);
            }
        } else {
            if (this.f1325c == null) {
                Context context = getContext();
                i0 i0Var = new i0(context);
                this.f1325c = i0Var;
                i0Var.setSingleLine();
                this.f1325c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1341x;
                if (i10 != 0) {
                    this.f1325c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.f1325c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1325c)) {
                c(this.f1325c, true);
            }
        }
        TextView textView2 = this.f1325c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        TextView textView = this.f1325c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1323b;
            if (textView != null && z(textView)) {
                removeView(this.f1323b);
                this.P.remove(this.f1323b);
            }
        } else {
            if (this.f1323b == null) {
                Context context = getContext();
                i0 i0Var = new i0(context);
                this.f1323b = i0Var;
                i0Var.setSingleLine();
                this.f1323b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1340w;
                if (i10 != 0) {
                    this.f1323b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.K;
                if (colorStateList != null) {
                    this.f1323b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1323b)) {
                c(this.f1323b, true);
            }
        }
        TextView textView2 = this.f1323b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.I = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.A = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        TextView textView = this.f1323b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        f fVar = this.f1322a0;
        return (fVar == null || fVar.f1349b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1321a;
        return actionMenuView != null && actionMenuView.D();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.S.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }
}
