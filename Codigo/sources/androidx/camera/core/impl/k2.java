package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.y1;
import androidx.camera.core.w;

/* loaded from: classes.dex */
public interface k2<T extends androidx.camera.core.w> extends b0.j<T>, b0.l, e1 {
    public static final n0.a<l2.b> A;

    /* renamed from: r */
    public static final n0.a<y1> f2526r = n0.a.a("camerax.core.useCase.defaultSessionConfig", y1.class);

    /* renamed from: s */
    public static final n0.a<l0> f2527s = n0.a.a("camerax.core.useCase.defaultCaptureConfig", l0.class);

    /* renamed from: t */
    public static final n0.a<y1.d> f2528t = n0.a.a("camerax.core.useCase.sessionConfigUnpacker", y1.d.class);

    /* renamed from: u */
    public static final n0.a<l0.b> f2529u = n0.a.a("camerax.core.useCase.captureConfigUnpacker", l0.b.class);

    /* renamed from: v */
    public static final n0.a<Integer> f2530v = n0.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: w */
    public static final n0.a<w.p> f2531w = n0.a.a("camerax.core.useCase.cameraSelector", w.p.class);

    /* renamed from: x */
    public static final n0.a<Range<Integer>> f2532x = n0.a.a("camerax.core.useCase.targetFrameRate", Range.class);

    /* renamed from: y */
    public static final n0.a<Boolean> f2533y;

    /* renamed from: z */
    public static final n0.a<Boolean> f2534z;

    /* loaded from: classes.dex */
    public interface a<T extends androidx.camera.core.w, C extends k2<T>, B> extends w.z<T> {
        C b();
    }

    static {
        Class cls = Boolean.TYPE;
        f2533y = n0.a.a("camerax.core.useCase.zslDisabled", cls);
        f2534z = n0.a.a("camerax.core.useCase.highResolutionDisabled", cls);
        A = n0.a.a("camerax.core.useCase.captureType", l2.b.class);
    }

    default int A(int i10) {
        return ((Integer) g(f2530v, Integer.valueOf(i10))).intValue();
    }

    default w.p F(w.p pVar) {
        return (w.p) g(f2531w, pVar);
    }

    default boolean I(boolean z10) {
        return ((Boolean) g(f2534z, Boolean.valueOf(z10))).booleanValue();
    }

    default boolean K(boolean z10) {
        return ((Boolean) g(f2533y, Boolean.valueOf(z10))).booleanValue();
    }

    default int L() {
        return ((Integer) a(f2530v)).intValue();
    }

    default l2.b N() {
        return (l2.b) a(A);
    }

    default y1.d T(y1.d dVar) {
        return (y1.d) g(f2528t, dVar);
    }

    default y1 o(y1 y1Var) {
        return (y1) g(f2526r, y1Var);
    }

    default l0.b q(l0.b bVar) {
        return (l0.b) g(f2529u, bVar);
    }

    default l0 s(l0 l0Var) {
        return (l0) g(f2527s, l0Var);
    }

    default Range<Integer> x(Range<Integer> range) {
        return (Range) g(f2532x, range);
    }
}
