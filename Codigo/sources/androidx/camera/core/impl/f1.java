package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.n0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface f1 extends u1 {

    /* renamed from: h, reason: collision with root package name */
    public static final n0.a<Integer> f2462h = n0.a.a("camerax.core.imageOutput.targetAspectRatio", w.a.class);

    /* renamed from: i, reason: collision with root package name */
    public static final n0.a<Integer> f2463i;

    /* renamed from: j, reason: collision with root package name */
    public static final n0.a<Integer> f2464j;

    /* renamed from: k, reason: collision with root package name */
    public static final n0.a<Integer> f2465k;

    /* renamed from: l, reason: collision with root package name */
    public static final n0.a<Size> f2466l;

    /* renamed from: m, reason: collision with root package name */
    public static final n0.a<Size> f2467m;

    /* renamed from: n, reason: collision with root package name */
    public static final n0.a<Size> f2468n;

    /* renamed from: o, reason: collision with root package name */
    public static final n0.a<List<Pair<Integer, Size[]>>> f2469o;

    /* renamed from: p, reason: collision with root package name */
    public static final n0.a<h0.c> f2470p;

    /* renamed from: q, reason: collision with root package name */
    public static final n0.a<List<Size>> f2471q;

    static {
        Class cls = Integer.TYPE;
        f2463i = n0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f2464j = n0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f2465k = n0.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f2466l = n0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f2467m = n0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f2468n = n0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f2469o = n0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f2470p = n0.a.a("camerax.core.imageOutput.resolutionSelector", h0.c.class);
        f2471q = n0.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void w(f1 f1Var) {
        boolean y10 = f1Var.y();
        boolean z10 = f1Var.M(null) != null;
        if (y10 && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (f1Var.E(null) != null) {
            if (y10 || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int B() {
        return ((Integer) a(f2462h)).intValue();
    }

    default int C(int i10) {
        return ((Integer) g(f2463i, Integer.valueOf(i10))).intValue();
    }

    default h0.c E(h0.c cVar) {
        return (h0.c) g(f2470p, cVar);
    }

    default List<Size> H(List<Size> list) {
        List list2 = (List) g(f2471q, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size J(Size size) {
        return (Size) g(f2467m, size);
    }

    default Size M(Size size) {
        return (Size) g(f2466l, size);
    }

    default int U(int i10) {
        return ((Integer) g(f2465k, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) g(f2468n, size);
    }

    default List<Pair<Integer, Size[]>> k(List<Pair<Integer, Size[]>> list) {
        return (List) g(f2469o, list);
    }

    default h0.c l() {
        return (h0.c) a(f2470p);
    }

    default int t(int i10) {
        return ((Integer) g(f2464j, Integer.valueOf(i10))).intValue();
    }

    default boolean y() {
        return b(f2462h);
    }
}
