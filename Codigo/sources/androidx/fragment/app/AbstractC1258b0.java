package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0944c;
import androidx.core.view.C1116x0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p052d1.C6816b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC1258b0 {

    /* renamed from: a */
    private final ViewGroup f5297a;

    /* renamed from: b */
    final ArrayList<e> f5298b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<e> f5299c = new ArrayList<>();

    /* renamed from: d */
    boolean f5300d = false;

    /* renamed from: e */
    boolean f5301e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f5302a;

        a(d dVar) {
            this.f5302a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1258b0.this.f5298b.contains(this.f5302a)) {
                this.f5302a.m6886e().m6895b(this.f5302a.m6887f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f5304a;

        b(d dVar) {
            this.f5304a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1258b0.this.f5298b.remove(this.f5304a);
            AbstractC1258b0.this.f5299c.remove(this.f5304a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b0$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5306a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5307b;

        static {
            int[] iArr = new int[e.b.values().length];
            f5307b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5307b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5307b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f5306a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5306a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5306a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5306a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.b0$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h */
        private final C1278t f5308h;

        d(e.c cVar, e.b bVar, C1278t c1278t, C0944c c0944c) {
            super(cVar, bVar, c1278t.m7170k(), c0944c);
            this.f5308h = c1278t;
        }

        @Override // androidx.fragment.app.AbstractC1258b0.e
        /* renamed from: c */
        public void mo6881c() {
            super.mo6881c();
            this.f5308h.m7171m();
        }

        @Override // androidx.fragment.app.AbstractC1258b0.e
        /* renamed from: l */
        void mo6882l() {
            if (m6888g() == e.b.ADDING) {
                Fragment m7170k = this.f5308h.m7170k();
                View findFocus = m7170k.mView.findFocus();
                if (findFocus != null) {
                    m7170k.setFocusedView(findFocus);
                    if (AbstractC1272n.m6991E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m7170k);
                    }
                }
                View requireView = m6887f().requireView();
                if (requireView.getParent() == null) {
                    this.f5308h.m7161b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m7170k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.b0$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private c f5309a;

        /* renamed from: b */
        private b f5310b;

        /* renamed from: c */
        private final Fragment f5311c;

        /* renamed from: d */
        private final List<Runnable> f5312d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0944c> f5313e = new HashSet<>();

        /* renamed from: f */
        private boolean f5314f = false;

        /* renamed from: g */
        private boolean f5315g = false;

        /* renamed from: androidx.fragment.app.b0$e$a */
        /* loaded from: classes.dex */
        class a implements C0944c.b {
            a() {
            }

            @Override // androidx.core.os.C0944c.b
            public void onCancel() {
                e.this.m6884b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.b0$e$b */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.b0$e$c */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: h */
            public static c m6893h(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: i */
            public static c m6894i(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m6893h(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: b */
            public void m6895b(View view) {
                int i10;
                int i11 = c.f5306a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (AbstractC1272n.m6991E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (AbstractC1272n.m6991E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        if (AbstractC1272n.m6991E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (AbstractC1272n.m6991E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        e(c cVar, b bVar, Fragment fragment, C0944c c0944c) {
            this.f5309a = cVar;
            this.f5310b = bVar;
            this.f5311c = fragment;
            c0944c.m4705c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m6883a(Runnable runnable) {
            this.f5312d.add(runnable);
        }

        /* renamed from: b */
        final void m6884b() {
            if (m6889h()) {
                return;
            }
            this.f5314f = true;
            if (this.f5313e.isEmpty()) {
                mo6881c();
                return;
            }
            Iterator it = new ArrayList(this.f5313e).iterator();
            while (it.hasNext()) {
                ((C0944c) it.next()).m4703a();
            }
        }

        /* renamed from: c */
        public void mo6881c() {
            if (this.f5315g) {
                return;
            }
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f5315g = true;
            Iterator<Runnable> it = this.f5312d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: d */
        public final void m6885d(C0944c c0944c) {
            if (this.f5313e.remove(c0944c) && this.f5313e.isEmpty()) {
                mo6881c();
            }
        }

        /* renamed from: e */
        public c m6886e() {
            return this.f5309a;
        }

        /* renamed from: f */
        public final Fragment m6887f() {
            return this.f5311c;
        }

        /* renamed from: g */
        b m6888g() {
            return this.f5310b;
        }

        /* renamed from: h */
        final boolean m6889h() {
            return this.f5314f;
        }

        /* renamed from: i */
        final boolean m6890i() {
            return this.f5315g;
        }

        /* renamed from: j */
        public final void m6891j(C0944c c0944c) {
            mo6882l();
            this.f5313e.add(c0944c);
        }

        /* renamed from: k */
        final void m6892k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f5307b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f5309a != c.REMOVED) {
                        if (AbstractC1272n.m6991E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f5311c + " mFinalState = " + this.f5309a + " -> " + cVar + ". ");
                        }
                        this.f5309a = cVar;
                        return;
                    }
                    return;
                }
                if (AbstractC1272n.m6991E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f5311c + " mFinalState = " + this.f5309a + " -> REMOVED. mLifecycleImpact  = " + this.f5310b + " to REMOVING.");
                }
                this.f5309a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f5309a != c.REMOVED) {
                    return;
                }
                if (AbstractC1272n.m6991E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f5311c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f5310b + " to ADDING.");
                }
                this.f5309a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f5310b = bVar2;
        }

        /* renamed from: l */
        void mo6882l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f5309a + "} {mLifecycleImpact = " + this.f5310b + "} {mFragment = " + this.f5311c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1258b0(ViewGroup viewGroup) {
        this.f5297a = viewGroup;
    }

    /* renamed from: a */
    private void m6863a(e.c cVar, e.b bVar, C1278t c1278t) {
        synchronized (this.f5298b) {
            C0944c c0944c = new C0944c();
            e m6864h = m6864h(c1278t.m7170k());
            if (m6864h != null) {
                m6864h.m6892k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c1278t, c0944c);
            this.f5298b.add(dVar);
            dVar.m6883a(new a(dVar));
            dVar.m6883a(new b(dVar));
        }
    }

    /* renamed from: h */
    private e m6864h(Fragment fragment) {
        Iterator<e> it = this.f5298b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m6887f().equals(fragment) && !next.m6889h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private e m6865i(Fragment fragment) {
        Iterator<e> it = this.f5299c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m6887f().equals(fragment) && !next.m6889h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC1258b0 m6866n(ViewGroup viewGroup, AbstractC1272n abstractC1272n) {
        return m6867o(viewGroup, abstractC1272n.m7109x0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static AbstractC1258b0 m6867o(ViewGroup viewGroup, InterfaceC1260c0 interfaceC1260c0) {
        int i10 = C6816b.f15047b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof AbstractC1258b0) {
            return (AbstractC1258b0) tag;
        }
        AbstractC1258b0 mo6913a = interfaceC1260c0.mo6913a(viewGroup);
        viewGroup.setTag(i10, mo6913a);
        return mo6913a;
    }

    /* renamed from: q */
    private void m6868q() {
        Iterator<e> it = this.f5298b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m6888g() == e.b.ADDING) {
                next.m6892k(e.c.m6893h(next.m6887f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6869b(e.c cVar, C1278t c1278t) {
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c1278t.m7170k());
        }
        m6863a(cVar, e.b.ADDING, c1278t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6870c(C1278t c1278t) {
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c1278t.m7170k());
        }
        m6863a(e.c.GONE, e.b.NONE, c1278t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6871d(C1278t c1278t) {
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c1278t.m7170k());
        }
        m6863a(e.c.REMOVED, e.b.REMOVING, c1278t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6872e(C1278t c1278t) {
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c1278t.m7170k());
        }
        m6863a(e.c.VISIBLE, e.b.NONE, c1278t);
    }

    /* renamed from: f */
    abstract void mo6873f(List<e> list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6874g() {
        if (this.f5301e) {
            return;
        }
        if (!C1116x0.m5242G(this.f5297a)) {
            m6875j();
            this.f5300d = false;
            return;
        }
        synchronized (this.f5298b) {
            if (!this.f5298b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f5299c);
                this.f5299c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (AbstractC1272n.m6991E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m6884b();
                    if (!eVar.m6890i()) {
                        this.f5299c.add(eVar);
                    }
                }
                m6868q();
                ArrayList arrayList2 = new ArrayList(this.f5298b);
                this.f5298b.clear();
                this.f5299c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo6882l();
                }
                mo6873f(arrayList2, this.f5300d);
                this.f5300d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m6875j() {
        String str;
        String str2;
        boolean m5242G = C1116x0.m5242G(this.f5297a);
        synchronized (this.f5298b) {
            m6868q();
            Iterator<e> it = this.f5298b.iterator();
            while (it.hasNext()) {
                it.next().mo6882l();
            }
            Iterator it2 = new ArrayList(this.f5299c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (AbstractC1272n.m6991E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m5242G) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f5297a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.m6884b();
            }
            Iterator it3 = new ArrayList(this.f5298b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (AbstractC1272n.m6991E0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m5242G) {
                        str = "";
                    } else {
                        str = "Container " + this.f5297a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.m6884b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m6876k() {
        if (this.f5301e) {
            this.f5301e = false;
            m6874g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public e.b m6877l(C1278t c1278t) {
        e m6864h = m6864h(c1278t.m7170k());
        e.b m6888g = m6864h != null ? m6864h.m6888g() : null;
        e m6865i = m6865i(c1278t.m7170k());
        return (m6865i == null || !(m6888g == null || m6888g == e.b.NONE)) ? m6888g : m6865i.m6888g();
    }

    /* renamed from: m */
    public ViewGroup m6878m() {
        return this.f5297a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m6879p() {
        synchronized (this.f5298b) {
            m6868q();
            this.f5301e = false;
            int size = this.f5298b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f5298b.get(size);
                e.c m6894i = e.c.m6894i(eVar.m6887f().mView);
                e.c m6886e = eVar.m6886e();
                e.c cVar = e.c.VISIBLE;
                if (m6886e == cVar && m6894i != cVar) {
                    this.f5301e = eVar.m6887f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m6880r(boolean z10) {
        this.f5300d = z10;
    }
}
