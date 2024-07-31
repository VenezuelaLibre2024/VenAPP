package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f4004a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<m0> f4005b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<m0, a> f4006c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.f f4007a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.i f4008b;

        a(androidx.lifecycle.f fVar, androidx.lifecycle.i iVar) {
            this.f4007a = fVar;
            this.f4008b = iVar;
            fVar.a(iVar);
        }

        void a() {
            this.f4007a.c(this.f4008b);
            this.f4008b = null;
        }
    }

    public x(Runnable runnable) {
        this.f4004a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(m0 m0Var, androidx.lifecycle.k kVar, f.a aVar) {
        if (aVar == f.a.ON_DESTROY) {
            l(m0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(f.b bVar, m0 m0Var, androidx.lifecycle.k kVar, f.a aVar) {
        if (aVar == f.a.l(bVar)) {
            c(m0Var);
            return;
        }
        if (aVar == f.a.ON_DESTROY) {
            l(m0Var);
        } else if (aVar == f.a.h(bVar)) {
            this.f4005b.remove(m0Var);
            this.f4004a.run();
        }
    }

    public void c(m0 m0Var) {
        this.f4005b.add(m0Var);
        this.f4004a.run();
    }

    public void d(final m0 m0Var, androidx.lifecycle.k kVar) {
        c(m0Var);
        androidx.lifecycle.f lifecycle = kVar.getLifecycle();
        a remove = this.f4006c.remove(m0Var);
        if (remove != null) {
            remove.a();
        }
        this.f4006c.put(m0Var, new a(lifecycle, new androidx.lifecycle.i() { // from class: androidx.core.view.v
            @Override // androidx.lifecycle.i
            public final void onStateChanged(androidx.lifecycle.k kVar2, f.a aVar) {
                x.this.f(m0Var, kVar2, aVar);
            }
        }));
    }

    public void e(final m0 m0Var, androidx.lifecycle.k kVar, final f.b bVar) {
        androidx.lifecycle.f lifecycle = kVar.getLifecycle();
        a remove = this.f4006c.remove(m0Var);
        if (remove != null) {
            remove.a();
        }
        this.f4006c.put(m0Var, new a(lifecycle, new androidx.lifecycle.i() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.i
            public final void onStateChanged(androidx.lifecycle.k kVar2, f.a aVar) {
                x.this.g(bVar, m0Var, kVar2, aVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<m0> it = this.f4005b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<m0> it = this.f4005b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<m0> it = this.f4005b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<m0> it = this.f4005b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void l(m0 m0Var) {
        this.f4005b.remove(m0Var);
        a remove = this.f4006c.remove(m0Var);
        if (remove != null) {
            remove.a();
        }
        this.f4004a.run();
    }
}
