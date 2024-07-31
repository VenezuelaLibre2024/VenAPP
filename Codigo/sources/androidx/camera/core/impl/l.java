package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: a, reason: collision with root package name */
    private final List<k> f2535a;

    @Override // androidx.camera.core.impl.k
    public void a() {
        Iterator<k> it = this.f2535a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // androidx.camera.core.impl.k
    public void b(s sVar) {
        Iterator<k> it = this.f2535a.iterator();
        while (it.hasNext()) {
            it.next().b(sVar);
        }
    }

    @Override // androidx.camera.core.impl.k
    public void c(m mVar) {
        Iterator<k> it = this.f2535a.iterator();
        while (it.hasNext()) {
            it.next().c(mVar);
        }
    }

    public List<k> d() {
        return this.f2535a;
    }
}
