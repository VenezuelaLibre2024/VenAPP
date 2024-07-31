package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.u1 */
/* loaded from: classes.dex */
public interface InterfaceC0671u1 extends InterfaceC0649n0 {
    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: a */
    default <ValueT> ValueT mo3191a(InterfaceC0649n0.a<ValueT> aVar) {
        return (ValueT) mo2589m().mo3191a(aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: b */
    default boolean mo3192b(InterfaceC0649n0.a<?> aVar) {
        return mo2589m().mo3192b(aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: c */
    default void mo3193c(String str, InterfaceC0649n0.b bVar) {
        mo2589m().mo3193c(str, bVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: d */
    default <ValueT> ValueT mo3194d(InterfaceC0649n0.a<ValueT> aVar, InterfaceC0649n0.c cVar) {
        return (ValueT) mo2589m().mo3194d(aVar, cVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: e */
    default Set<InterfaceC0649n0.a<?>> mo3195e() {
        return mo2589m().mo3195e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: f */
    default Set<InterfaceC0649n0.c> mo3196f(InterfaceC0649n0.a<?> aVar) {
        return mo2589m().mo3196f(aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: g */
    default <ValueT> ValueT mo3197g(InterfaceC0649n0.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) mo2589m().mo3197g(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: h */
    default InterfaceC0649n0.c mo3198h(InterfaceC0649n0.a<?> aVar) {
        return mo2589m().mo3198h(aVar);
    }

    /* renamed from: m */
    InterfaceC0649n0 mo2589m();
}
