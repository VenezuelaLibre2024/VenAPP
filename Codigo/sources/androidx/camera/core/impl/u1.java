package androidx.camera.core.impl;

import androidx.camera.core.impl.n0;
import java.util.Set;

/* loaded from: classes.dex */
public interface u1 extends n0 {
    @Override // androidx.camera.core.impl.n0
    default <ValueT> ValueT a(n0.a<ValueT> aVar) {
        return (ValueT) m().a(aVar);
    }

    @Override // androidx.camera.core.impl.n0
    default boolean b(n0.a<?> aVar) {
        return m().b(aVar);
    }

    @Override // androidx.camera.core.impl.n0
    default void c(String str, n0.b bVar) {
        m().c(str, bVar);
    }

    @Override // androidx.camera.core.impl.n0
    default <ValueT> ValueT d(n0.a<ValueT> aVar, n0.c cVar) {
        return (ValueT) m().d(aVar, cVar);
    }

    @Override // androidx.camera.core.impl.n0
    default Set<n0.a<?>> e() {
        return m().e();
    }

    @Override // androidx.camera.core.impl.n0
    default Set<n0.c> f(n0.a<?> aVar) {
        return m().f(aVar);
    }

    @Override // androidx.camera.core.impl.n0
    default <ValueT> ValueT g(n0.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) m().g(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.n0
    default n0.c h(n0.a<?> aVar) {
        return m().h(aVar);
    }

    n0 m();
}
