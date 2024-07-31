package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f4678a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final n f4679b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final n.l f4680a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f4681b;

        a(n.l lVar, boolean z10) {
            this.f4680a = lVar;
            this.f4681b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(n nVar) {
        this.f4679b = nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.a(this.f4679b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z10) {
        Context f10 = this.f4679b.s0().f();
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().b(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.b(this.f4679b, fragment, f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.c(this.f4679b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().d(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.d(this.f4679b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().e(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.e(this.f4679b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().f(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.f(this.f4679b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z10) {
        Context f10 = this.f4679b.s0().f();
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().g(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.g(this.f4679b, fragment, f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.h(this.f4679b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().i(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.i(this.f4679b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.j(this.f4679b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().k(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.k(this.f4679b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().l(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.l(this.f4679b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.m(this.f4679b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z10) {
        Fragment v02 = this.f4679b.v0();
        if (v02 != null) {
            v02.getParentFragmentManager().u0().n(fragment, true);
        }
        Iterator<a> it = this.f4678a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4681b) {
                next.f4680a.n(this.f4679b, fragment);
            }
        }
    }

    public void o(n.l lVar, boolean z10) {
        this.f4678a.add(new a(lVar, z10));
    }

    public void p(n.l lVar) {
        synchronized (this.f4678a) {
            int size = this.f4678a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (this.f4678a.get(i10).f4680a == lVar) {
                    this.f4678a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }
}
