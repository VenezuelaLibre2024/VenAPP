package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Set<z3.d<?>> f7530a = Collections.newSetFromMap(new WeakHashMap());

    public void c() {
        this.f7530a.clear();
    }

    public List<z3.d<?>> d() {
        return c4.l.j(this.f7530a);
    }

    public void k(z3.d<?> dVar) {
        this.f7530a.add(dVar);
    }

    public void l(z3.d<?> dVar) {
        this.f7530a.remove(dVar);
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
        Iterator it = c4.l.j(this.f7530a).iterator();
        while (it.hasNext()) {
            ((z3.d) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
        Iterator it = c4.l.j(this.f7530a).iterator();
        while (it.hasNext()) {
            ((z3.d) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
        Iterator it = c4.l.j(this.f7530a).iterator();
        while (it.hasNext()) {
            ((z3.d) it.next()).onStop();
        }
    }
}
