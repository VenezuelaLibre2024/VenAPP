package b2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static l f6101a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<l>>>> f6102b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f6103c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        l f6104a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f6105b;

        /* renamed from: b2.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0104a extends m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f6106a;

            C0104a(androidx.collection.a aVar) {
                this.f6106a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // b2.l.f
            public void e(l lVar) {
                ((ArrayList) this.f6106a.get(a.this.f6105b)).remove(lVar);
                lVar.T(this);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f6104a = lVar;
            this.f6105b = viewGroup;
        }

        private void a() {
            this.f6105b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6105b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!n.f6103c.remove(this.f6105b)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<l>> b10 = n.b();
            ArrayList<l> arrayList = b10.get(this.f6105b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b10.put(this.f6105b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6104a);
            this.f6104a.a(new C0104a(b10));
            this.f6104a.k(this.f6105b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).V(this.f6105b);
                }
            }
            this.f6104a.S(this.f6105b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            n.f6103c.remove(this.f6105b);
            ArrayList<l> arrayList = n.b().get(this.f6105b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().V(this.f6105b);
                }
            }
            this.f6104a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (f6103c.contains(viewGroup) || !x0.H(viewGroup)) {
            return;
        }
        f6103c.add(viewGroup);
        if (lVar == null) {
            lVar = f6101a;
        }
        l clone = lVar.clone();
        d(viewGroup, clone);
        k.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static androidx.collection.a<ViewGroup, ArrayList<l>> b() {
        androidx.collection.a<ViewGroup, ArrayList<l>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<l>>> weakReference = f6102b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<l>> aVar2 = new androidx.collection.a<>();
        f6102b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(lVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList<l> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().R(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.k(viewGroup, true);
        }
        k b10 = k.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
