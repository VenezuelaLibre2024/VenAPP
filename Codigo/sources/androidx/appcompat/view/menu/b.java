package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: a, reason: collision with root package name */
    protected Context f1053a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f1054b;

    /* renamed from: c, reason: collision with root package name */
    protected g f1055c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f1056d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f1057e;

    /* renamed from: f, reason: collision with root package name */
    private m.a f1058f;

    /* renamed from: r, reason: collision with root package name */
    private int f1059r;

    /* renamed from: s, reason: collision with root package name */
    private int f1060s;

    /* renamed from: t, reason: collision with root package name */
    protected n f1061t;

    /* renamed from: u, reason: collision with root package name */
    private int f1062u;

    public b(Context context, int i10, int i11) {
        this.f1053a = context;
        this.f1056d = LayoutInflater.from(context);
        this.f1059r = i10;
        this.f1060s = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1061t).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z10) {
        m.a aVar = this.f1058f;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(m.a aVar) {
        this.f1058f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        m.a aVar = this.f1058f;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f1055c;
        }
        return aVar.c(rVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1061t;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f1055c;
        int i10 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> E = this.f1055c.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i iVar = E.get(i12);
                if (q(i11, iVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View n10 = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        a(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        this.f1054b = context;
        this.f1057e = LayoutInflater.from(context);
        this.f1055c = gVar;
    }

    public abstract void j(i iVar, n.a aVar);

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f1056d.inflate(this.f1060s, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a m() {
        return this.f1058f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a k10 = view instanceof n.a ? (n.a) view : k(viewGroup);
        j(iVar, k10);
        return (View) k10;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f1061t == null) {
            n nVar = (n) this.f1056d.inflate(this.f1059r, viewGroup, false);
            this.f1061t = nVar;
            nVar.a(this.f1055c);
            f(true);
        }
        return this.f1061t;
    }

    public void p(int i10) {
        this.f1062u = i10;
    }

    public abstract boolean q(int i10, i iVar);
}
