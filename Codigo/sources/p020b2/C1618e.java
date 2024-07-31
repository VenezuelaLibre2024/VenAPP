package p020b2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0944c;
import androidx.fragment.app.AbstractC1283y;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p020b2.AbstractC1632l;

/* renamed from: b2.e */
/* loaded from: classes.dex */
public class C1618e extends AbstractC1283y {

    /* renamed from: b2.e$a */
    /* loaded from: classes.dex */
    class a extends AbstractC1632l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f6918a;

        a(Rect rect) {
            this.f6918a = rect;
        }
    }

    /* renamed from: b2.e$b */
    /* loaded from: classes.dex */
    class b implements AbstractC1632l.f {

        /* renamed from: a */
        final /* synthetic */ View f6920a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6921b;

        b(View view, ArrayList arrayList) {
            this.f6920a = view;
            this.f6921b = arrayList;
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: a */
        public void mo8988a(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: b */
        public void mo8989b(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: c */
        public void mo9005c(AbstractC1632l abstractC1632l) {
            abstractC1632l.mo9042T(this);
            abstractC1632l.mo9048a(this);
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: d */
        public void mo8990d(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            abstractC1632l.mo9042T(this);
            this.f6920a.setVisibility(8);
            int size = this.f6921b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f6921b.get(i10)).setVisibility(0);
            }
        }
    }

    /* renamed from: b2.e$c */
    /* loaded from: classes.dex */
    class c extends C1634m {

        /* renamed from: a */
        final /* synthetic */ Object f6923a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6924b;

        /* renamed from: c */
        final /* synthetic */ Object f6925c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f6926d;

        /* renamed from: e */
        final /* synthetic */ Object f6927e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f6928f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6923a = obj;
            this.f6924b = arrayList;
            this.f6925c = obj2;
            this.f6926d = arrayList2;
            this.f6927e = obj3;
            this.f6928f = arrayList3;
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: c */
        public void mo9005c(AbstractC1632l abstractC1632l) {
            Object obj = this.f6923a;
            if (obj != null) {
                C1618e.this.mo7249q(obj, this.f6924b, null);
            }
            Object obj2 = this.f6925c;
            if (obj2 != null) {
                C1618e.this.mo7249q(obj2, this.f6926d, null);
            }
            Object obj3 = this.f6927e;
            if (obj3 != null) {
                C1618e.this.mo7249q(obj3, this.f6928f, null);
            }
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            abstractC1632l.mo9042T(this);
        }
    }

    /* renamed from: b2.e$d */
    /* loaded from: classes.dex */
    class d implements C0944c.b {

        /* renamed from: a */
        final /* synthetic */ AbstractC1632l f6930a;

        d(AbstractC1632l abstractC1632l) {
            this.f6930a = abstractC1632l;
        }

        @Override // androidx.core.os.C0944c.b
        public void onCancel() {
            this.f6930a.cancel();
        }
    }

    /* renamed from: b2.e$e */
    /* loaded from: classes.dex */
    class e implements AbstractC1632l.f {

        /* renamed from: a */
        final /* synthetic */ Runnable f6932a;

        e(Runnable runnable) {
            this.f6932a = runnable;
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: a */
        public void mo8988a(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: b */
        public void mo8989b(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: c */
        public void mo9005c(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: d */
        public void mo8990d(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            this.f6932a.run();
        }
    }

    /* renamed from: b2.e$f */
    /* loaded from: classes.dex */
    class f extends AbstractC1632l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f6934a;

        f(Rect rect) {
            this.f6934a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m9004C(AbstractC1632l abstractC1632l) {
        return (AbstractC1283y.m7259l(abstractC1632l.m9033C()) && AbstractC1283y.m7259l(abstractC1632l.m9034D()) && AbstractC1283y.m7259l(abstractC1632l.m9035E())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: A */
    public void mo7239A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1640p c1640p = (C1640p) obj;
        if (c1640p != null) {
            c1640p.m9036F().clear();
            c1640p.m9036F().addAll(arrayList2);
            mo7249q(c1640p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: B */
    public Object mo7240B(Object obj) {
        if (obj == null) {
            return null;
        }
        C1640p c1640p = new C1640p();
        c1640p.m9086k0((AbstractC1632l) obj);
        return c1640p;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: a */
    public void mo7241a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1632l) obj).mo9049b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: b */
    public void mo7242b(Object obj, ArrayList<View> arrayList) {
        AbstractC1632l abstractC1632l = (AbstractC1632l) obj;
        if (abstractC1632l == null) {
            return;
        }
        int i10 = 0;
        if (abstractC1632l instanceof C1640p) {
            C1640p c1640p = (C1640p) abstractC1632l;
            int m9088n0 = c1640p.m9088n0();
            while (i10 < m9088n0) {
                mo7242b(c1640p.m9087m0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m9004C(abstractC1632l) || !AbstractC1283y.m7259l(abstractC1632l.m9036F())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC1632l.mo9049b(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: c */
    public void mo7243c(ViewGroup viewGroup, Object obj) {
        C1636n.m9070a(viewGroup, (AbstractC1632l) obj);
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: e */
    public boolean mo7244e(Object obj) {
        return obj instanceof AbstractC1632l;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: g */
    public Object mo7245g(Object obj) {
        if (obj != null) {
            return ((AbstractC1632l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: m */
    public Object mo7246m(Object obj, Object obj2, Object obj3) {
        AbstractC1632l abstractC1632l = (AbstractC1632l) obj;
        AbstractC1632l abstractC1632l2 = (AbstractC1632l) obj2;
        AbstractC1632l abstractC1632l3 = (AbstractC1632l) obj3;
        if (abstractC1632l != null && abstractC1632l2 != null) {
            abstractC1632l = new C1640p().m9086k0(abstractC1632l).m9086k0(abstractC1632l2).m9093s0(1);
        } else if (abstractC1632l == null) {
            abstractC1632l = abstractC1632l2 != null ? abstractC1632l2 : null;
        }
        if (abstractC1632l3 == null) {
            return abstractC1632l;
        }
        C1640p c1640p = new C1640p();
        if (abstractC1632l != null) {
            c1640p.m9086k0(abstractC1632l);
        }
        c1640p.m9086k0(abstractC1632l3);
        return c1640p;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: n */
    public Object mo7247n(Object obj, Object obj2, Object obj3) {
        C1640p c1640p = new C1640p();
        if (obj != null) {
            c1640p.m9086k0((AbstractC1632l) obj);
        }
        if (obj2 != null) {
            c1640p.m9086k0((AbstractC1632l) obj2);
        }
        if (obj3 != null) {
            c1640p.m9086k0((AbstractC1632l) obj3);
        }
        return c1640p;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: p */
    public void mo7248p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1632l) obj).mo9043U(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: q */
    public void mo7249q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1632l abstractC1632l = (AbstractC1632l) obj;
        int i10 = 0;
        if (abstractC1632l instanceof C1640p) {
            C1640p c1640p = (C1640p) abstractC1632l;
            int m9088n0 = c1640p.m9088n0();
            while (i10 < m9088n0) {
                mo7249q(c1640p.m9087m0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m9004C(abstractC1632l)) {
            return;
        }
        List<View> m9036F = abstractC1632l.m9036F();
        if (m9036F.size() == arrayList.size() && m9036F.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC1632l.mo9049b(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1632l.mo9043U(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: r */
    public void mo7250r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC1632l) obj).mo9048a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: t */
    public void mo7251t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC1632l) obj).mo9048a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: u */
    public void mo7252u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1632l) obj).mo9047Z(new f(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: v */
    public void mo7253v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m7262k(view, rect);
            ((AbstractC1632l) obj).mo9047Z(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: w */
    public void mo7254w(Fragment fragment, Object obj, C0944c c0944c, Runnable runnable) {
        AbstractC1632l abstractC1632l = (AbstractC1632l) obj;
        c0944c.m4705c(new d(abstractC1632l));
        abstractC1632l.mo9048a(new e(runnable));
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: z */
    public void mo7255z(Object obj, View view, ArrayList<View> arrayList) {
        C1640p c1640p = (C1640p) obj;
        List<View> m9036F = c1640p.m9036F();
        m9036F.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1283y.m7256d(m9036F, arrayList.get(i10));
        }
        m9036F.add(view);
        arrayList.add(view);
        mo7242b(c1640p, arrayList);
    }
}
