package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0242a;
import androidx.appcompat.view.menu.AbstractC0255b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.view.menu.C0262i;
import androidx.appcompat.view.menu.C0265l;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.view.menu.InterfaceC0267n;
import androidx.appcompat.view.menu.InterfaceC0269p;
import androidx.appcompat.view.menu.SubMenuC0271r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0888a;
import androidx.core.view.AbstractC1011b;
import java.util.ArrayList;
import p111g.C7377a;
import p111g.C7383g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0320c extends AbstractC0255b implements AbstractC1011b.a {

    /* renamed from: A */
    private int f1633A;

    /* renamed from: B */
    private int f1634B;

    /* renamed from: C */
    private int f1635C;

    /* renamed from: D */
    private boolean f1636D;

    /* renamed from: E */
    private boolean f1637E;

    /* renamed from: F */
    private boolean f1638F;

    /* renamed from: G */
    private boolean f1639G;

    /* renamed from: H */
    private int f1640H;

    /* renamed from: I */
    private final SparseBooleanArray f1641I;

    /* renamed from: J */
    e f1642J;

    /* renamed from: K */
    a f1643K;

    /* renamed from: L */
    c f1644L;

    /* renamed from: M */
    private b f1645M;

    /* renamed from: N */
    final f f1646N;

    /* renamed from: O */
    int f1647O;

    /* renamed from: v */
    d f1648v;

    /* renamed from: w */
    private Drawable f1649w;

    /* renamed from: x */
    private boolean f1650x;

    /* renamed from: y */
    private boolean f1651y;

    /* renamed from: z */
    private boolean f1652z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class a extends C0265l {
        public a(Context context, SubMenuC0271r subMenuC0271r, View view) {
            super(context, subMenuC0271r, view, false, C7377a.f16708l);
            if (!((C0262i) subMenuC0271r.getItem()).m1362l()) {
                View view2 = C0320c.this.f1648v;
                m1398f(view2 == null ? (View) ((AbstractC0255b) C0320c.this).f1203t : view2);
            }
            m1402j(C0320c.this.f1646N);
        }

        @Override // androidx.appcompat.view.menu.C0265l
        /* renamed from: e */
        protected void mo1397e() {
            C0320c c0320c = C0320c.this;
            c0320c.f1643K = null;
            c0320c.f1647O = 0;
            super.mo1397e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.AbstractC0253b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0253b
        /* renamed from: a */
        public InterfaceC0269p mo1226a() {
            a aVar = C0320c.this.f1643K;
            if (aVar != null) {
                return aVar.m1395c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        private e f1655a;

        public c(e eVar) {
            this.f1655a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0255b) C0320c.this).f1197c != null) {
                ((AbstractC0255b) C0320c.this).f1197c.m1328d();
            }
            View view = (View) ((AbstractC0255b) C0320c.this).f1203t;
            if (view != null && view.getWindowToken() != null && this.f1655a.m1404m()) {
                C0320c.this.f1642J = this.f1655a;
            }
            C0320c.this.f1644L = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.InterfaceC0280a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        class a extends AbstractViewOnTouchListenerC0369s0 {

            /* renamed from: u */
            final /* synthetic */ C0320c f1658u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0320c c0320c) {
                super(view);
                this.f1658u = c0320c;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0369s0
            /* renamed from: b */
            public InterfaceC0269p mo1224b() {
                e eVar = C0320c.this.f1642J;
                if (eVar == null) {
                    return null;
                }
                return eVar.m1395c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0369s0
            /* renamed from: c */
            public boolean mo1225c() {
                C0320c.this.m1632K();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0369s0
            /* renamed from: d */
            public boolean mo1634d() {
                C0320c c0320c = C0320c.this;
                if (c0320c.f1644L != null) {
                    return false;
                }
                c0320c.m1623B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C7377a.f16707k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0367r1.m1950a(this, getContentDescription());
            setOnTouchListener(new a(this, C0320c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0280a
        /* renamed from: a */
        public boolean mo1219a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0280a
        /* renamed from: b */
        public boolean mo1220b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0320c.this.m1632K();
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
                C0888a.m4540d(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    public class e extends C0265l {
        public e(Context context, C0260g c0260g, View view, boolean z10) {
            super(context, c0260g, view, z10, C7377a.f16708l);
            m1400h(8388613);
            m1402j(C0320c.this.f1646N);
        }

        @Override // androidx.appcompat.view.menu.C0265l
        /* renamed from: e */
        protected void mo1397e() {
            if (((AbstractC0255b) C0320c.this).f1197c != null) {
                ((AbstractC0255b) C0320c.this).f1197c.close();
            }
            C0320c.this.f1642J = null;
            super.mo1397e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    private class f implements InterfaceC0266m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: b */
        public void mo1035b(C0260g c0260g, boolean z10) {
            if (c0260g instanceof SubMenuC0271r) {
                c0260g.mo1302D().m1330e(false);
            }
            InterfaceC0266m.a m1252m = C0320c.this.m1252m();
            if (m1252m != null) {
                m1252m.mo1035b(c0260g, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: c */
        public boolean mo1036c(C0260g c0260g) {
            if (c0260g == ((AbstractC0255b) C0320c.this).f1197c) {
                return false;
            }
            C0320c.this.f1647O = ((SubMenuC0271r) c0260g).getItem().getItemId();
            InterfaceC0266m.a m1252m = C0320c.this.m1252m();
            if (m1252m != null) {
                return m1252m.mo1036c(c0260g);
            }
            return false;
        }
    }

    public C0320c(Context context) {
        super(context, C7383g.f16837c, C7383g.f16836b);
        this.f1641I = new SparseBooleanArray();
        this.f1646N = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private View m1621z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1203t;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0267n.a) && ((InterfaceC0267n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable m1622A() {
        d dVar = this.f1648v;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1650x) {
            return this.f1649w;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m1623B() {
        Object obj;
        c cVar = this.f1644L;
        if (cVar != null && (obj = this.f1203t) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1644L = null;
            return true;
        }
        e eVar = this.f1642J;
        if (eVar == null) {
            return false;
        }
        eVar.m1394b();
        return true;
    }

    /* renamed from: C */
    public boolean m1624C() {
        a aVar = this.f1643K;
        if (aVar == null) {
            return false;
        }
        aVar.m1394b();
        return true;
    }

    /* renamed from: D */
    public boolean m1625D() {
        return this.f1644L != null || m1626E();
    }

    /* renamed from: E */
    public boolean m1626E() {
        e eVar = this.f1642J;
        return eVar != null && eVar.m1396d();
    }

    /* renamed from: F */
    public void m1627F(Configuration configuration) {
        if (!this.f1636D) {
            this.f1635C = C0242a.m1170b(this.f1196b).m1173d();
        }
        C0260g c0260g = this.f1197c;
        if (c0260g != null) {
            c0260g.m1309K(true);
        }
    }

    /* renamed from: G */
    public void m1628G(boolean z10) {
        this.f1639G = z10;
    }

    /* renamed from: H */
    public void m1629H(ActionMenuView actionMenuView) {
        this.f1203t = actionMenuView;
        actionMenuView.mo1227a(this.f1197c);
    }

    /* renamed from: I */
    public void m1630I(Drawable drawable) {
        d dVar = this.f1648v;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1650x = true;
            this.f1649w = drawable;
        }
    }

    /* renamed from: J */
    public void m1631J(boolean z10) {
        this.f1651y = z10;
        this.f1652z = true;
    }

    /* renamed from: K */
    public boolean m1632K() {
        C0260g c0260g;
        if (!this.f1651y || m1626E() || (c0260g = this.f1197c) == null || this.f1203t == null || this.f1644L != null || c0260g.m1348z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1196b, this.f1197c, this.f1648v, true));
        this.f1644L = cVar;
        ((View) this.f1203t).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b, androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: b */
    public void mo1242b(C0260g c0260g, boolean z10) {
        m1633y();
        super.mo1242b(c0260g, z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b, androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: e */
    public boolean mo1245e(SubMenuC0271r subMenuC0271r) {
        boolean z10 = false;
        if (!subMenuC0271r.hasVisibleItems()) {
            return false;
        }
        SubMenuC0271r subMenuC0271r2 = subMenuC0271r;
        while (subMenuC0271r2.m1408f0() != this.f1197c) {
            subMenuC0271r2 = (SubMenuC0271r) subMenuC0271r2.m1408f0();
        }
        View m1621z = m1621z(subMenuC0271r2.getItem());
        if (m1621z == null) {
            return false;
        }
        this.f1647O = subMenuC0271r.getItem().getItemId();
        int size = subMenuC0271r.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = subMenuC0271r.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f1196b, subMenuC0271r, m1621z);
        this.f1643K = aVar;
        aVar.m1399g(z10);
        this.f1643K.m1403k();
        super.mo1245e(subMenuC0271r);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b, androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: f */
    public void mo1246f(boolean z10) {
        super.mo1246f(z10);
        ((View) this.f1203t).requestLayout();
        C0260g c0260g = this.f1197c;
        boolean z11 = false;
        if (c0260g != null) {
            ArrayList<C0262i> m1341s = c0260g.m1341s();
            int size = m1341s.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1011b mo1236a = m1341s.get(i10).mo1236a();
                if (mo1236a != null) {
                    mo1236a.m4941i(this);
                }
            }
        }
        C0260g c0260g2 = this.f1197c;
        ArrayList<C0262i> m1348z = c0260g2 != null ? c0260g2.m1348z() : null;
        if (this.f1651y && m1348z != null) {
            int size2 = m1348z.size();
            if (size2 == 1) {
                z11 = !m1348z.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1648v;
        if (z11) {
            if (dVar == null) {
                this.f1648v = new d(this.f1195a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1648v.getParent();
            if (viewGroup != this.f1203t) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1648v);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1203t;
                actionMenuView.addView(this.f1648v, actionMenuView.m1444B());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f1203t;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1648v);
            }
        }
        ((ActionMenuView) this.f1203t).setOverflowReserved(this.f1651y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: g */
    public boolean mo1270g() {
        ArrayList<C0262i> arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        C0320c c0320c = this;
        C0260g c0260g = c0320c.f1197c;
        View view = null;
        ?? r32 = 0;
        if (c0260g != null) {
            arrayList = c0260g.m1303E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = c0320c.f1635C;
        int i15 = c0320c.f1634B;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0320c.f1203t;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            C0262i c0262i = arrayList.get(i18);
            if (c0262i.m1365o()) {
                i16++;
            } else if (c0262i.m1364n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (c0320c.f1639G && c0262i.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (c0320c.f1651y && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = c0320c.f1641I;
        sparseBooleanArray.clear();
        if (c0320c.f1637E) {
            int i20 = c0320c.f1640H;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            C0262i c0262i2 = arrayList.get(i21);
            if (c0262i2.m1365o()) {
                View mo1253n = c0320c.mo1253n(c0262i2, view, viewGroup);
                if (c0320c.f1637E) {
                    i12 -= ActionMenuView.m1441H(mo1253n, i11, i12, makeMeasureSpec, r32);
                } else {
                    mo1253n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo1253n.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = c0262i2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0262i2.m1371u(true);
                z10 = r32;
                i13 = i10;
            } else if (c0262i2.m1364n()) {
                int groupId2 = c0262i2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!c0320c.f1637E || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View mo1253n2 = c0320c.mo1253n(c0262i2, null, viewGroup);
                    if (c0320c.f1637E) {
                        int m1441H = ActionMenuView.m1441H(mo1253n2, i11, i12, makeMeasureSpec, 0);
                        i12 -= m1441H;
                        if (m1441H == 0) {
                            z14 = false;
                        }
                    } else {
                        mo1253n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = mo1253n2.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!c0320c.f1637E ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        C0262i c0262i3 = arrayList.get(i23);
                        if (c0262i3.getGroupId() == groupId2) {
                            if (c0262i3.m1362l()) {
                                i19++;
                            }
                            c0262i3.m1371u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                c0262i2.m1371u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                c0262i2.m1371u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            c0320c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b, androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: i */
    public void mo1248i(Context context, C0260g c0260g) {
        super.mo1248i(context, c0260g);
        Resources resources = context.getResources();
        C0242a m1170b = C0242a.m1170b(context);
        if (!this.f1652z) {
            this.f1651y = m1170b.m1177h();
        }
        if (!this.f1638F) {
            this.f1633A = m1170b.m1172c();
        }
        if (!this.f1636D) {
            this.f1635C = m1170b.m1173d();
        }
        int i10 = this.f1633A;
        if (this.f1651y) {
            if (this.f1648v == null) {
                d dVar = new d(this.f1195a);
                this.f1648v = dVar;
                if (this.f1650x) {
                    dVar.setImageDrawable(this.f1649w);
                    this.f1649w = null;
                    this.f1650x = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1648v.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1648v.getMeasuredWidth();
        } else {
            this.f1648v = null;
        }
        this.f1634B = i10;
        this.f1640H = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b
    /* renamed from: j */
    public void mo1249j(C0262i c0262i, InterfaceC0267n.a aVar) {
        aVar.mo1221c(c0262i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1203t);
        if (this.f1645M == null) {
            this.f1645M = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1645M);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b
    /* renamed from: l */
    public boolean mo1251l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1648v) {
            return false;
        }
        return super.mo1251l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b
    /* renamed from: n */
    public View mo1253n(C0262i c0262i, View view, ViewGroup viewGroup) {
        View actionView = c0262i.getActionView();
        if (actionView == null || c0262i.m1360j()) {
            actionView = super.mo1253n(c0262i, view, viewGroup);
        }
        actionView.setVisibility(c0262i.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b
    /* renamed from: o */
    public InterfaceC0267n mo1254o(ViewGroup viewGroup) {
        InterfaceC0267n interfaceC0267n = this.f1203t;
        InterfaceC0267n mo1254o = super.mo1254o(viewGroup);
        if (interfaceC0267n != mo1254o) {
            ((ActionMenuView) mo1254o).setPresenter(this);
        }
        return mo1254o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0255b
    /* renamed from: q */
    public boolean mo1256q(int i10, C0262i c0262i) {
        return c0262i.m1362l();
    }

    /* renamed from: y */
    public boolean m1633y() {
        return m1623B() | m1624C();
    }
}
