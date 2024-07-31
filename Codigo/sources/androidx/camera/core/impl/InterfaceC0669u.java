package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC0649n0;

/* renamed from: androidx.camera.core.impl.u */
/* loaded from: classes.dex */
public interface InterfaceC0669u extends InterfaceC0671u1 {

    /* renamed from: a */
    public static final InterfaceC0649n0.a<InterfaceC0644l2> f2929a = InterfaceC0649n0.a.m3199a("camerax.core.camera.useCaseConfigFactory", InterfaceC0644l2.class);

    /* renamed from: b */
    public static final InterfaceC0649n0.a<AbstractC0603b1> f2930b = InterfaceC0649n0.a.m3199a("camerax.core.camera.compatibilityId", AbstractC0603b1.class);

    /* renamed from: c */
    public static final InterfaceC0649n0.a<Integer> f2931c = InterfaceC0649n0.a.m3199a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: d */
    public static final InterfaceC0649n0.a<InterfaceC0704z1> f2932d = InterfaceC0649n0.a.m3199a("camerax.core.camera.SessionProcessor", InterfaceC0704z1.class);

    /* renamed from: e */
    public static final InterfaceC0649n0.a<Boolean> f2933e = InterfaceC0649n0.a.m3199a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* renamed from: Q */
    AbstractC0603b1 mo3239Q();

    /* renamed from: V */
    default InterfaceC0704z1 m3240V(InterfaceC0704z1 interfaceC0704z1) {
        return (InterfaceC0704z1) mo3197g(f2932d, interfaceC0704z1);
    }

    /* renamed from: j */
    default InterfaceC0644l2 m3241j() {
        return (InterfaceC0644l2) mo3197g(f2929a, InterfaceC0644l2.f2893a);
    }

    /* renamed from: v */
    default int m3242v() {
        return ((Integer) mo3197g(f2931c, 0)).intValue();
    }
}
