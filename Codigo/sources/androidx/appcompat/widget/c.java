package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private final SparseBooleanArray I;
    e J;
    a K;
    RunnableC0022c L;
    private b M;
    final f N;
    int O;

    /* renamed from: v */
    d f1383v;

    /* renamed from: w */
    private Drawable f1384w;

    /* renamed from: x */
    private boolean f1385x;

    /* renamed from: y */
    private boolean f1386y;

    /* renamed from: z */
    private boolean f1387z;

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, g.a.f15272l);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = c.this.f1383v;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f1061t : view2);
            }
            j(c.this.N);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void e() {
            c cVar = c.this;
            cVar.K = null;
            cVar.O = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = c.this.K;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0022c implements Runnable {

        /* renamed from: a */
        private e f1390a;

        public RunnableC0022c(e eVar) {
            this.f1390a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f1055c != null) {
                ((androidx.appcompat.view.menu.b) c.this).f1055c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f1061t;
            if (view != null && view.getWindowToken() != null && this.f1390a.m()) {
                c.this.J = this.f1390a;
            }
            c.this.L = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends s0 {

            /* renamed from: u */
            final /* synthetic */ c f1393u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1393u = cVar;
            }

            @Override // androidx.appcompat.widget.s0
            public androidx.appcompat.view.menu.p b() {
                e eVar = c.this.J;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.s0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.s0
            public boolean d() {
                c cVar = c.this;
                if (cVar.L != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, g.a.f15271k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            r1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.d(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, g.a.f15272l);
            h(8388613);
            j(c.this.N);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f1055c != null) {
                ((androidx.appcompat.view.menu.b) c.this).f1055c.close();
            }
            c.this.J = null;
            super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a m10 = c.this.m();
            if (m10 != null) {
                m10.b(gVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f1055c) {
                return false;
            }
            c.this.O = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a m10 = c.this.m();
            if (m10 != null) {
                return m10.c(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, g.g.f15366c, g.g.f15365b);
        this.I = new SparseBooleanArray();
        this.N = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1061t;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1383v;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1385x) {
            return this.f1384w;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0022c runnableC0022c = this.L;
        if (runnableC0022c != null && (obj = this.f1061t) != null) {
            ((View) obj).removeCallbacks(runnableC0022c);
            this.L = null;
            return true;
        }
        e eVar = this.J;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.K;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.L != null || E();
    }

    public boolean E() {
        e eVar = this.J;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.D) {
            this.C = androidx.appcompat.view.a.b(this.f1054b).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f1055c;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.G = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1061t = actionMenuView;
        actionMenuView.a(this.f1055c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1383v;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1385x = true;
            this.f1384w = drawable;
        }
    }

    public void J(boolean z10) {
        this.f1386y = z10;
        this.f1387z = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f1386y || E() || (gVar = this.f1055c) == null || this.f1061t == null || this.L != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0022c runnableC0022c = new RunnableC0022c(new e(this.f1054b, this.f1055c, this.f1383v, true));
        this.L = runnableC0022c;
        ((View) this.f1061t).post(runnableC0022c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        y();
        super.b(gVar, z10);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean e(androidx.appcompat.view.menu.r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.f0() != this.f1055c) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.f0();
        }
        View z11 = z(rVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.O = rVar.getItem().getItemId();
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f1054b, rVar, z11);
        this.K = aVar;
        aVar.g(z10);
        this.K.k();
        super.e(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f1061t).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f1055c;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> s10 = gVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b a10 = s10.get(i10).a();
                if (a10 != null) {
                    a10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f1055c;
        ArrayList<androidx.appcompat.view.menu.i> z12 = gVar2 != null ? gVar2.z() : null;
        if (this.f1386y && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1383v;
        if (z11) {
            if (dVar == null) {
                this.f1383v = new d(this.f1053a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1383v.getParent();
            if (viewGroup != this.f1061t) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1383v);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1061t;
                actionMenuView.addView(this.f1383v, actionMenuView.B());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f1061t;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1383v);
            }
        }
        ((ActionMenuView) this.f1061t).setOverflowReserved(this.f1386y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.i> arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f1055c;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = cVar.C;
        int i15 = cVar.B;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1061t;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            androidx.appcompat.view.menu.i iVar = arrayList.get(i18);
            if (iVar.o()) {
                i16++;
            } else if (iVar.n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (cVar.G && iVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (cVar.f1386y && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = cVar.I;
        sparseBooleanArray.clear();
        if (cVar.E) {
            int i20 = cVar.H;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            androidx.appcompat.view.menu.i iVar2 = arrayList.get(i21);
            if (iVar2.o()) {
                View n10 = cVar.n(iVar2, view, viewGroup);
                if (cVar.E) {
                    i12 -= ActionMenuView.H(n10, i11, i12, makeMeasureSpec, r32);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                z10 = r32;
                i13 = i10;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!cVar.E || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View n11 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.E) {
                        int H = ActionMenuView.H(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= H;
                        if (H == 0) {
                            z14 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!cVar.E ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        androidx.appcompat.view.menu.i iVar3 = arrayList.get(i23);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i19++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                iVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                iVar2.u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void i(Context context, androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f1387z) {
            this.f1386y = b10.h();
        }
        if (!this.F) {
            this.A = b10.c();
        }
        if (!this.D) {
            this.C = b10.d();
        }
        int i10 = this.A;
        if (this.f1386y) {
            if (this.f1383v == null) {
                d dVar = new d(this.f1053a);
                this.f1383v = dVar;
                if (this.f1385x) {
                    dVar.setImageDrawable(this.f1384w);
                    this.f1384w = null;
                    this.f1385x = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1383v.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1383v.getMeasuredWidth();
        } else {
            this.f1383v = null;
        }
        this.B = i10;
        this.H = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public void j(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.c(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1061t);
        if (this.M == null) {
            this.M = new b();
        }
        actionMenuItemView.setPopupCallback(this.M);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1383v) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f1061t;
        androidx.appcompat.view.menu.n o10 = super.o(viewGroup);
        if (nVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i10, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
