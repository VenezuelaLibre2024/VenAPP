package androidx.lifecycle;

import androidx.lifecycle.f;
import zk.b2;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final f f4880a;

    /* renamed from: b, reason: collision with root package name */
    private final gk.f f4881b;

    public f a() {
        return this.f4880a;
    }

    @Override // zk.k0
    public gk.f h() {
        return this.f4881b;
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(event, "event");
        if (a().b().compareTo(f.b.DESTROYED) <= 0) {
            a().c(this);
            b2.d(h(), null, 1, null);
        }
    }
}
