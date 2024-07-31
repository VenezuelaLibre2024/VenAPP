package androidx.camera.lifecycle;

import androidx.camera.core.impl.u;
import androidx.camera.core.w;
import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.t;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import w.i;
import w.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleCamera implements j, i {

    /* renamed from: b */
    private final k f2778b;

    /* renamed from: c */
    private final b0.e f2779c;

    /* renamed from: a */
    private final Object f2777a = new Object();

    /* renamed from: d */
    private volatile boolean f2780d = false;

    /* renamed from: e */
    private boolean f2781e = false;

    /* renamed from: f */
    private boolean f2782f = false;

    public LifecycleCamera(k kVar, b0.e eVar) {
        this.f2778b = kVar;
        this.f2779c = eVar;
        if (kVar.getLifecycle().b().h(f.b.STARTED)) {
            eVar.o();
        } else {
            eVar.w();
        }
        kVar.getLifecycle().a(this);
    }

    @Override // w.i
    public w.j a() {
        return this.f2779c.a();
    }

    @Override // w.i
    public o b() {
        return this.f2779c.b();
    }

    public void c(Collection<w> collection) {
        synchronized (this.f2777a) {
            this.f2779c.n(collection);
        }
    }

    public b0.e k() {
        return this.f2779c;
    }

    public void l(u uVar) {
        this.f2779c.l(uVar);
    }

    public k n() {
        k kVar;
        synchronized (this.f2777a) {
            kVar = this.f2778b;
        }
        return kVar;
    }

    public List<w> o() {
        List<w> unmodifiableList;
        synchronized (this.f2777a) {
            unmodifiableList = Collections.unmodifiableList(this.f2779c.E());
        }
        return unmodifiableList;
    }

    @t(f.a.ON_DESTROY)
    public void onDestroy(k kVar) {
        synchronized (this.f2777a) {
            b0.e eVar = this.f2779c;
            eVar.Q(eVar.E());
        }
    }

    @t(f.a.ON_PAUSE)
    public void onPause(k kVar) {
        this.f2779c.f(false);
    }

    @t(f.a.ON_RESUME)
    public void onResume(k kVar) {
        this.f2779c.f(true);
    }

    @t(f.a.ON_START)
    public void onStart(k kVar) {
        synchronized (this.f2777a) {
            if (!this.f2781e && !this.f2782f) {
                this.f2779c.o();
                this.f2780d = true;
            }
        }
    }

    @t(f.a.ON_STOP)
    public void onStop(k kVar) {
        synchronized (this.f2777a) {
            if (!this.f2781e && !this.f2782f) {
                this.f2779c.w();
                this.f2780d = false;
            }
        }
    }

    public boolean p(w wVar) {
        boolean contains;
        synchronized (this.f2777a) {
            contains = this.f2779c.E().contains(wVar);
        }
        return contains;
    }

    public void q() {
        synchronized (this.f2777a) {
            if (this.f2781e) {
                return;
            }
            onStop(this.f2778b);
            this.f2781e = true;
        }
    }

    public void r() {
        synchronized (this.f2777a) {
            b0.e eVar = this.f2779c;
            eVar.Q(eVar.E());
        }
    }

    public void s() {
        synchronized (this.f2777a) {
            if (this.f2781e) {
                this.f2781e = false;
                if (this.f2778b.getLifecycle().b().h(f.b.STARTED)) {
                    onStart(this.f2778b);
                }
            }
        }
    }
}
