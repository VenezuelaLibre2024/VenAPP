package androidx.camera.core.impl;

import androidx.camera.core.impl.n0;

/* loaded from: classes.dex */
public interface u extends u1 {

    /* renamed from: a */
    public static final n0.a<l2> f2585a = n0.a.a("camerax.core.camera.useCaseConfigFactory", l2.class);

    /* renamed from: b */
    public static final n0.a<b1> f2586b = n0.a.a("camerax.core.camera.compatibilityId", b1.class);

    /* renamed from: c */
    public static final n0.a<Integer> f2587c = n0.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: d */
    public static final n0.a<z1> f2588d = n0.a.a("camerax.core.camera.SessionProcessor", z1.class);

    /* renamed from: e */
    public static final n0.a<Boolean> f2589e = n0.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    b1 Q();

    default z1 V(z1 z1Var) {
        return (z1) g(f2588d, z1Var);
    }

    default l2 j() {
        return (l2) g(f2585a, l2.f2554a);
    }

    default int v() {
        return ((Integer) g(f2587c, 0)).intValue();
    }
}
