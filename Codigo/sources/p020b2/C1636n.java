package p020b2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C0731a;
import androidx.core.view.C1116x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b2.n */
/* loaded from: classes.dex */
public class C1636n {

    /* renamed from: a */
    private static AbstractC1632l f6989a = new C1612b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0731a<ViewGroup, ArrayList<AbstractC1632l>>>> f6990b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f6991c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2.n$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        AbstractC1632l f6992a;

        /* renamed from: b */
        ViewGroup f6993b;

        /* renamed from: b2.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13174a extends C1634m {

            /* renamed from: a */
            final /* synthetic */ C0731a f6994a;

            C13174a(C0731a c0731a) {
                this.f6994a = c0731a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p020b2.AbstractC1632l.f
            /* renamed from: e */
            public void mo8991e(AbstractC1632l abstractC1632l) {
                ((ArrayList) this.f6994a.get(a.this.f6993b)).remove(abstractC1632l);
                abstractC1632l.mo9042T(this);
            }
        }

        a(AbstractC1632l abstractC1632l, ViewGroup viewGroup) {
            this.f6992a = abstractC1632l;
            this.f6993b = viewGroup;
        }

        /* renamed from: a */
        private void m9074a() {
            this.f6993b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6993b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m9074a();
            if (!C1636n.f6991c.remove(this.f6993b)) {
                return true;
            }
            C0731a<ViewGroup, ArrayList<AbstractC1632l>> m9071b = C1636n.m9071b();
            ArrayList<AbstractC1632l> arrayList = m9071b.get(this.f6993b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m9071b.put(this.f6993b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6992a);
            this.f6992a.mo9048a(new C13174a(m9071b));
            this.f6992a.m9058k(this.f6993b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1632l) it.next()).mo9044V(this.f6993b);
                }
            }
            this.f6992a.m9041S(this.f6993b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m9074a();
            C1636n.f6991c.remove(this.f6993b);
            ArrayList<AbstractC1632l> arrayList = C1636n.m9071b().get(this.f6993b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC1632l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo9044V(this.f6993b);
                }
            }
            this.f6992a.m9059l(true);
        }
    }

    /* renamed from: a */
    public static void m9070a(ViewGroup viewGroup, AbstractC1632l abstractC1632l) {
        if (f6991c.contains(viewGroup) || !C1116x0.m5243H(viewGroup)) {
            return;
        }
        f6991c.add(viewGroup);
        if (abstractC1632l == null) {
            abstractC1632l = f6989a;
        }
        AbstractC1632l clone = abstractC1632l.clone();
        m9073d(viewGroup, clone);
        C1630k.m9018c(viewGroup, null);
        m9072c(viewGroup, clone);
    }

    /* renamed from: b */
    static C0731a<ViewGroup, ArrayList<AbstractC1632l>> m9071b() {
        C0731a<ViewGroup, ArrayList<AbstractC1632l>> c0731a;
        WeakReference<C0731a<ViewGroup, ArrayList<AbstractC1632l>>> weakReference = f6990b.get();
        if (weakReference != null && (c0731a = weakReference.get()) != null) {
            return c0731a;
        }
        C0731a<ViewGroup, ArrayList<AbstractC1632l>> c0731a2 = new C0731a<>();
        f6990b.set(new WeakReference<>(c0731a2));
        return c0731a2;
    }

    /* renamed from: c */
    private static void m9072c(ViewGroup viewGroup, AbstractC1632l abstractC1632l) {
        if (abstractC1632l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1632l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    private static void m9073d(ViewGroup viewGroup, AbstractC1632l abstractC1632l) {
        ArrayList<AbstractC1632l> arrayList = m9071b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1632l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo9040R(viewGroup);
            }
        }
        if (abstractC1632l != null) {
            abstractC1632l.m9058k(viewGroup, true);
        }
        C1630k m9017b = C1630k.m9017b(viewGroup);
        if (m9017b != null) {
            m9017b.m9019a();
        }
    }
}
