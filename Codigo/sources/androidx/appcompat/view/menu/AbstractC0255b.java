package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.view.menu.InterfaceC0267n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0255b implements InterfaceC0266m {

    /* renamed from: a */
    protected Context f1195a;

    /* renamed from: b */
    protected Context f1196b;

    /* renamed from: c */
    protected C0260g f1197c;

    /* renamed from: d */
    protected LayoutInflater f1198d;

    /* renamed from: e */
    protected LayoutInflater f1199e;

    /* renamed from: f */
    private InterfaceC0266m.a f1200f;

    /* renamed from: r */
    private int f1201r;

    /* renamed from: s */
    private int f1202s;

    /* renamed from: t */
    protected InterfaceC0267n f1203t;

    /* renamed from: u */
    private int f1204u;

    public AbstractC0255b(Context context, int i10, int i11) {
        this.f1195a = context;
        this.f1198d = LayoutInflater.from(context);
        this.f1201r = i10;
        this.f1202s = i11;
    }

    /* renamed from: a */
    protected void m1241a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1203t).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: b */
    public void mo1242b(C0260g c0260g, boolean z10) {
        InterfaceC0266m.a aVar = this.f1200f;
        if (aVar != null) {
            aVar.mo1035b(c0260g, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: c */
    public boolean mo1243c(C0260g c0260g, C0262i c0262i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: d */
    public void mo1244d(InterfaceC0266m.a aVar) {
        this.f1200f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: e */
    public boolean mo1245e(SubMenuC0271r subMenuC0271r) {
        InterfaceC0266m.a aVar = this.f1200f;
        SubMenuC0271r subMenuC0271r2 = subMenuC0271r;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0271r == null) {
            subMenuC0271r2 = this.f1197c;
        }
        return aVar.mo1036c(subMenuC0271r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: f */
    public void mo1246f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1203t;
        if (viewGroup == null) {
            return;
        }
        C0260g c0260g = this.f1197c;
        int i10 = 0;
        if (c0260g != null) {
            c0260g.m1340r();
            ArrayList<C0262i> m1303E = this.f1197c.m1303E();
            int size = m1303E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                C0262i c0262i = m1303E.get(i12);
                if (mo1256q(i11, c0262i)) {
                    View childAt = viewGroup.getChildAt(i11);
                    C0262i itemData = childAt instanceof InterfaceC0267n.a ? ((InterfaceC0267n.a) childAt).getItemData() : null;
                    View mo1253n = mo1253n(c0262i, childAt, viewGroup);
                    if (c0262i != itemData) {
                        mo1253n.setPressed(false);
                        mo1253n.jumpDrawablesToCurrentState();
                    }
                    if (mo1253n != childAt) {
                        m1241a(mo1253n, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!mo1251l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: h */
    public boolean mo1247h(C0260g c0260g, C0262i c0262i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: i */
    public void mo1248i(Context context, C0260g c0260g) {
        this.f1196b = context;
        this.f1199e = LayoutInflater.from(context);
        this.f1197c = c0260g;
    }

    /* renamed from: j */
    public abstract void mo1249j(C0262i c0262i, InterfaceC0267n.a aVar);

    /* renamed from: k */
    public InterfaceC0267n.a m1250k(ViewGroup viewGroup) {
        return (InterfaceC0267n.a) this.f1198d.inflate(this.f1202s, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1251l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0266m.a m1252m() {
        return this.f1200f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public View mo1253n(C0262i c0262i, View view, ViewGroup viewGroup) {
        InterfaceC0267n.a m1250k = view instanceof InterfaceC0267n.a ? (InterfaceC0267n.a) view : m1250k(viewGroup);
        mo1249j(c0262i, m1250k);
        return (View) m1250k;
    }

    /* renamed from: o */
    public InterfaceC0267n mo1254o(ViewGroup viewGroup) {
        if (this.f1203t == null) {
            InterfaceC0267n interfaceC0267n = (InterfaceC0267n) this.f1198d.inflate(this.f1201r, viewGroup, false);
            this.f1203t = interfaceC0267n;
            interfaceC0267n.mo1227a(this.f1197c);
            mo1246f(true);
        }
        return this.f1203t;
    }

    /* renamed from: p */
    public void m1255p(int i10) {
        this.f1204u = i10;
    }

    /* renamed from: q */
    public abstract boolean mo1256q(int i10, C0262i c0262i);
}
