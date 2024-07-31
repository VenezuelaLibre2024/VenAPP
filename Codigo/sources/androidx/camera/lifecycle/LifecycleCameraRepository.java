package androidx.camera.lifecycle;

import androidx.camera.core.w;
import androidx.core.util.h;
import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.t;
import b0.e;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.j1;

/* loaded from: classes.dex */
final class LifecycleCameraRepository {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2783a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<a, LifecycleCamera> f2784b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<LifecycleCameraRepositoryObserver, Set<a>> f2785c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<k> f2786d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    x.a f2787e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements j {

        /* renamed from: a, reason: collision with root package name */
        private final LifecycleCameraRepository f2788a;

        /* renamed from: b, reason: collision with root package name */
        private final k f2789b;

        LifecycleCameraRepositoryObserver(k kVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2789b = kVar;
            this.f2788a = lifecycleCameraRepository;
        }

        k a() {
            return this.f2789b;
        }

        @t(f.a.ON_DESTROY)
        public void onDestroy(k kVar) {
            this.f2788a.l(kVar);
        }

        @t(f.a.ON_START)
        public void onStart(k kVar) {
            this.f2788a.h(kVar);
        }

        @t(f.a.ON_STOP)
        public void onStop(k kVar) {
            this.f2788a.i(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        static a a(k kVar, e.b bVar) {
            return new androidx.camera.lifecycle.a(kVar, bVar);
        }

        public abstract e.b b();

        public abstract k c();
    }

    private LifecycleCameraRepositoryObserver d(k kVar) {
        synchronized (this.f2783a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2785c.keySet()) {
                if (kVar.equals(lifecycleCameraRepositoryObserver.a())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    private boolean f(k kVar) {
        synchronized (this.f2783a) {
            LifecycleCameraRepositoryObserver d10 = d(kVar);
            if (d10 == null) {
                return false;
            }
            Iterator<a> it = this.f2785c.get(d10).iterator();
            while (it.hasNext()) {
                if (!((LifecycleCamera) h.k(this.f2784b.get(it.next()))).o().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void g(LifecycleCamera lifecycleCamera) {
        synchronized (this.f2783a) {
            k n10 = lifecycleCamera.n();
            a a10 = a.a(n10, lifecycleCamera.k().y());
            LifecycleCameraRepositoryObserver d10 = d(n10);
            Set<a> hashSet = d10 != null ? this.f2785c.get(d10) : new HashSet<>();
            hashSet.add(a10);
            this.f2784b.put(a10, lifecycleCamera);
            if (d10 == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(n10, this);
                this.f2785c.put(lifecycleCameraRepositoryObserver, hashSet);
                n10.getLifecycle().a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    private void j(k kVar) {
        synchronized (this.f2783a) {
            LifecycleCameraRepositoryObserver d10 = d(kVar);
            if (d10 == null) {
                return;
            }
            Iterator<a> it = this.f2785c.get(d10).iterator();
            while (it.hasNext()) {
                ((LifecycleCamera) h.k(this.f2784b.get(it.next()))).q();
            }
        }
    }

    private void m(k kVar) {
        synchronized (this.f2783a) {
            Iterator<a> it = this.f2785c.get(d(kVar)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.f2784b.get(it.next());
                if (!((LifecycleCamera) h.k(lifecycleCamera)).o().isEmpty()) {
                    lifecycleCamera.s();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(LifecycleCamera lifecycleCamera, j1 j1Var, List<w.k> list, Collection<w> collection, x.a aVar) {
        synchronized (this.f2783a) {
            h.a(!collection.isEmpty());
            this.f2787e = aVar;
            k n10 = lifecycleCamera.n();
            Set<a> set = this.f2785c.get(d(n10));
            x.a aVar2 = this.f2787e;
            if (aVar2 == null || aVar2.b() != 2) {
                Iterator<a> it = set.iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera2 = (LifecycleCamera) h.k(this.f2784b.get(it.next()));
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.o().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.k().U(j1Var);
                lifecycleCamera.k().S(list);
                lifecycleCamera.c(collection);
                if (n10.getLifecycle().b().h(f.b.STARTED)) {
                    h(n10);
                }
            } catch (e.a e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera b(k kVar, b0.e eVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2783a) {
            h.b(this.f2784b.get(a.a(kVar, eVar.y())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (kVar.getLifecycle().b() == f.b.DESTROYED) {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
            lifecycleCamera = new LifecycleCamera(kVar, eVar);
            if (eVar.E().isEmpty()) {
                lifecycleCamera.q();
            }
            g(lifecycleCamera);
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera c(k kVar, e.b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2783a) {
            lifecycleCamera = this.f2784b.get(a.a(kVar, bVar));
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<LifecycleCamera> e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f2783a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f2784b.values());
        }
        return unmodifiableCollection;
    }

    void h(k kVar) {
        ArrayDeque<k> arrayDeque;
        synchronized (this.f2783a) {
            if (f(kVar)) {
                if (!this.f2786d.isEmpty()) {
                    x.a aVar = this.f2787e;
                    if (aVar == null || aVar.b() != 2) {
                        k peek = this.f2786d.peek();
                        if (!kVar.equals(peek)) {
                            j(peek);
                            this.f2786d.remove(kVar);
                            arrayDeque = this.f2786d;
                        }
                    }
                    m(kVar);
                }
                arrayDeque = this.f2786d;
                arrayDeque.push(kVar);
                m(kVar);
            }
        }
    }

    void i(k kVar) {
        synchronized (this.f2783a) {
            this.f2786d.remove(kVar);
            j(kVar);
            if (!this.f2786d.isEmpty()) {
                m(this.f2786d.peek());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        synchronized (this.f2783a) {
            Iterator<a> it = this.f2784b.keySet().iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.f2784b.get(it.next());
                lifecycleCamera.r();
                i(lifecycleCamera.n());
            }
        }
    }

    void l(k kVar) {
        synchronized (this.f2783a) {
            LifecycleCameraRepositoryObserver d10 = d(kVar);
            if (d10 == null) {
                return;
            }
            i(kVar);
            Iterator<a> it = this.f2785c.get(d10).iterator();
            while (it.hasNext()) {
                this.f2784b.remove(it.next());
            }
            this.f2785c.remove(d10);
            d10.a().getLifecycle().c(d10);
        }
    }
}
