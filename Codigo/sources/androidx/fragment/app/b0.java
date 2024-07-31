package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.c;
import androidx.core.view.x0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f4560a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<e> f4561b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<e> f4562c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f4563d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f4564e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f4565a;

        a(d dVar) {
            this.f4565a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b0.this.f4561b.contains(this.f4565a)) {
                this.f4565a.e().b(this.f4565a.f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f4567a;

        b(d dVar) {
            this.f4567a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f4561b.remove(this.f4567a);
            b0.this.f4562c.remove(this.f4567a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4569a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4570b;

        static {
            int[] iArr = new int[e.b.values().length];
            f4570b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4570b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4570b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f4569a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4569a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4569a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4569a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final t f4571h;

        d(e.c cVar, e.b bVar, t tVar, androidx.core.os.c cVar2) {
            super(cVar, bVar, tVar.k(), cVar2);
            this.f4571h = tVar;
        }

        @Override // androidx.fragment.app.b0.e
        public void c() {
            super.c();
            this.f4571h.m();
        }

        @Override // androidx.fragment.app.b0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f4571h.k();
                View findFocus = k10.mView.findFocus();
                if (findFocus != null) {
                    k10.setFocusedView(findFocus);
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f4571h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k10.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f4572a;

        /* renamed from: b, reason: collision with root package name */
        private b f4573b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f4574c;

        /* renamed from: d, reason: collision with root package name */
        private final List<Runnable> f4575d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet<androidx.core.os.c> f4576e = new HashSet<>();

        /* renamed from: f, reason: collision with root package name */
        private boolean f4577f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4578g = false;

        /* loaded from: classes.dex */
        class a implements c.b {
            a() {
            }

            @Override // androidx.core.os.c.b
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c h(int i10) {
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
            public static c i(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : h(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void b(View view) {
                int i10;
                int i11 = c.f4569a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.c cVar2) {
            this.f4572a = cVar;
            this.f4573b = bVar;
            this.f4574c = fragment;
            cVar2.c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f4575d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f4577f = true;
            if (this.f4576e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f4576e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.c) it.next()).a();
            }
        }

        public void c() {
            if (this.f4578g) {
                return;
            }
            if (n.E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4578g = true;
            Iterator<Runnable> it = this.f4575d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(androidx.core.os.c cVar) {
            if (this.f4576e.remove(cVar) && this.f4576e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f4572a;
        }

        public final Fragment f() {
            return this.f4574c;
        }

        b g() {
            return this.f4573b;
        }

        final boolean h() {
            return this.f4577f;
        }

        final boolean i() {
            return this.f4578g;
        }

        public final void j(androidx.core.os.c cVar) {
            l();
            this.f4576e.add(cVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f4570b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f4572a != c.REMOVED) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4574c + " mFinalState = " + this.f4572a + " -> " + cVar + ". ");
                        }
                        this.f4572a = cVar;
                        return;
                    }
                    return;
                }
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4574c + " mFinalState = " + this.f4572a + " -> REMOVED. mLifecycleImpact  = " + this.f4573b + " to REMOVING.");
                }
                this.f4572a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f4572a != c.REMOVED) {
                    return;
                }
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4574c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4573b + " to ADDING.");
                }
                this.f4572a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f4573b = bVar2;
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4572a + "} {mLifecycleImpact = " + this.f4573b + "} {mFragment = " + this.f4574c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(ViewGroup viewGroup) {
        this.f4560a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f4561b) {
            androidx.core.os.c cVar2 = new androidx.core.os.c();
            e h10 = h(tVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, tVar, cVar2);
            this.f4561b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f4561b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f4562c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.x0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 o(ViewGroup viewGroup, c0 c0Var) {
        int i10 = d1.b.f13693b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof b0) {
            return (b0) tag;
        }
        b0 a10 = c0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f4561b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.h(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, t tVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.k());
        }
        a(cVar, e.b.ADDING, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(t tVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.k());
        }
        a(e.c.GONE, e.b.NONE, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(t tVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(t tVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, tVar);
    }

    abstract void f(List<e> list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f4564e) {
            return;
        }
        if (!x0.G(this.f4560a)) {
            j();
            this.f4563d = false;
            return;
        }
        synchronized (this.f4561b) {
            if (!this.f4561b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4562c);
                this.f4562c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f4562c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f4561b);
                this.f4561b.clear();
                this.f4562c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f4563d);
                this.f4563d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean G = x0.G(this.f4560a);
        synchronized (this.f4561b) {
            q();
            Iterator<e> it = this.f4561b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f4562c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (G) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4560a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f4561b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.E0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (G) {
                        str = "";
                    } else {
                        str = "Container " + this.f4560a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f4564e) {
            this.f4564e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(t tVar) {
        e h10 = h(tVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(tVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f4560a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f4561b) {
            q();
            this.f4564e = false;
            int size = this.f4561b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f4561b.get(size);
                e.c i10 = e.c.i(eVar.f().mView);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && i10 != cVar) {
                    this.f4564e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f4563d = z10;
    }
}
