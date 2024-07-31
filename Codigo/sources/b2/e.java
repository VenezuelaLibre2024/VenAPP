package b2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.c;
import androidx.fragment.app.Fragment;
import b2.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e extends androidx.fragment.app.y {

    /* loaded from: classes.dex */
    class a extends l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f6049a;

        a(Rect rect) {
            this.f6049a = rect;
        }
    }

    /* loaded from: classes.dex */
    class b implements l.f {

        /* renamed from: a */
        final /* synthetic */ View f6051a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6052b;

        b(View view, ArrayList arrayList) {
            this.f6051a = view;
            this.f6052b = arrayList;
        }

        @Override // b2.l.f
        public void a(l lVar) {
        }

        @Override // b2.l.f
        public void b(l lVar) {
        }

        @Override // b2.l.f
        public void c(l lVar) {
            lVar.T(this);
            lVar.a(this);
        }

        @Override // b2.l.f
        public void d(l lVar) {
        }

        @Override // b2.l.f
        public void e(l lVar) {
            lVar.T(this);
            this.f6051a.setVisibility(8);
            int size = this.f6052b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f6052b.get(i10)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends m {

        /* renamed from: a */
        final /* synthetic */ Object f6054a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6055b;

        /* renamed from: c */
        final /* synthetic */ Object f6056c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f6057d;

        /* renamed from: e */
        final /* synthetic */ Object f6058e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f6059f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6054a = obj;
            this.f6055b = arrayList;
            this.f6056c = obj2;
            this.f6057d = arrayList2;
            this.f6058e = obj3;
            this.f6059f = arrayList3;
        }

        @Override // b2.m, b2.l.f
        public void c(l lVar) {
            Object obj = this.f6054a;
            if (obj != null) {
                e.this.q(obj, this.f6055b, null);
            }
            Object obj2 = this.f6056c;
            if (obj2 != null) {
                e.this.q(obj2, this.f6057d, null);
            }
            Object obj3 = this.f6058e;
            if (obj3 != null) {
                e.this.q(obj3, this.f6059f, null);
            }
        }

        @Override // b2.l.f
        public void e(l lVar) {
            lVar.T(this);
        }
    }

    /* loaded from: classes.dex */
    class d implements c.b {

        /* renamed from: a */
        final /* synthetic */ l f6061a;

        d(l lVar) {
            this.f6061a = lVar;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f6061a.cancel();
        }
    }

    /* renamed from: b2.e$e */
    /* loaded from: classes.dex */
    class C0103e implements l.f {

        /* renamed from: a */
        final /* synthetic */ Runnable f6063a;

        C0103e(Runnable runnable) {
            this.f6063a = runnable;
        }

        @Override // b2.l.f
        public void a(l lVar) {
        }

        @Override // b2.l.f
        public void b(l lVar) {
        }

        @Override // b2.l.f
        public void c(l lVar) {
        }

        @Override // b2.l.f
        public void d(l lVar) {
        }

        @Override // b2.l.f
        public void e(l lVar) {
            this.f6063a.run();
        }
    }

    /* loaded from: classes.dex */
    class f extends l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f6065a;

        f(Rect rect) {
            this.f6065a = rect;
        }
    }

    private static boolean C(l lVar) {
        return (androidx.fragment.app.y.l(lVar.C()) && androidx.fragment.app.y.l(lVar.D()) && androidx.fragment.app.y.l(lVar.E())) ? false : true;
    }

    @Override // androidx.fragment.app.y
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.F().clear();
            pVar.F().addAll(arrayList2);
            q(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.y
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.k0((l) obj);
        return pVar;
    }

    @Override // androidx.fragment.app.y
    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.y
    public void b(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int n02 = pVar.n0();
            while (i10 < n02) {
                b(pVar.m0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (C(lVar) || !androidx.fragment.app.y.l(lVar.F())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            lVar.b(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.y
    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.y
    public boolean e(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.y
    public Object g(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.y
    public Object m(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().k0(lVar).k0(lVar2).s0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar = new p();
        if (lVar != null) {
            pVar.k0(lVar);
        }
        pVar.k0(lVar3);
        return pVar;
    }

    @Override // androidx.fragment.app.y
    public Object n(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.k0((l) obj);
        }
        if (obj2 != null) {
            pVar.k0((l) obj2);
        }
        if (obj3 != null) {
            pVar.k0((l) obj3);
        }
        return pVar;
    }

    @Override // androidx.fragment.app.y
    public void p(Object obj, View view) {
        if (obj != null) {
            ((l) obj).U(view);
        }
    }

    @Override // androidx.fragment.app.y
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int n02 = pVar.n0();
            while (i10 < n02) {
                q(pVar.m0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (C(lVar)) {
            return;
        }
        List<View> F = lVar.F();
        if (F.size() == arrayList.size() && F.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                lVar.b(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.U(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.y
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.y
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.y
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).Z(new f(rect));
        }
    }

    @Override // androidx.fragment.app.y
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((l) obj).Z(new a(rect));
        }
    }

    @Override // androidx.fragment.app.y
    public void w(Fragment fragment, Object obj, androidx.core.os.c cVar, Runnable runnable) {
        l lVar = (l) obj;
        cVar.c(new d(lVar));
        lVar.a(new C0103e(runnable));
    }

    @Override // androidx.fragment.app.y
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> F = pVar.F();
        F.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.y.d(F, arrayList.get(i10));
        }
        F.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }
}
