package com.bumptech.glide.manager;

import androidx.lifecycle.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements l, androidx.lifecycle.j {

    /* renamed from: a, reason: collision with root package name */
    private final Set<m> f7475a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.f f7476b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleLifecycle(androidx.lifecycle.f fVar) {
        this.f7476b = fVar;
        fVar.a(this);
    }

    @Override // com.bumptech.glide.manager.l
    public void a(m mVar) {
        this.f7475a.remove(mVar);
    }

    @Override // com.bumptech.glide.manager.l
    public void b(m mVar) {
        this.f7475a.add(mVar);
        if (this.f7476b.b() == f.b.DESTROYED) {
            mVar.onDestroy();
        } else if (this.f7476b.b().h(f.b.STARTED)) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @androidx.lifecycle.t(f.a.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.k kVar) {
        Iterator it = c4.l.j(this.f7475a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
        kVar.getLifecycle().c(this);
    }

    @androidx.lifecycle.t(f.a.ON_START)
    public void onStart(androidx.lifecycle.k kVar) {
        Iterator it = c4.l.j(this.f7475a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    @androidx.lifecycle.t(f.a.ON_STOP)
    public void onStop(androidx.lifecycle.k kVar) {
        Iterator it = c4.l.j(this.f7475a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}
