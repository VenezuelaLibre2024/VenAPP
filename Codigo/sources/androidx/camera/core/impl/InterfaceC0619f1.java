package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.ArrayList;
import java.util.List;
import p126h0.C7608c;
import p407w.C11989a;

/* renamed from: androidx.camera.core.impl.f1 */
/* loaded from: classes.dex */
public interface InterfaceC0619f1 extends InterfaceC0671u1 {

    /* renamed from: h */
    public static final InterfaceC0649n0.a<Integer> f2800h = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.targetAspectRatio", C11989a.class);

    /* renamed from: i */
    public static final InterfaceC0649n0.a<Integer> f2801i;

    /* renamed from: j */
    public static final InterfaceC0649n0.a<Integer> f2802j;

    /* renamed from: k */
    public static final InterfaceC0649n0.a<Integer> f2803k;

    /* renamed from: l */
    public static final InterfaceC0649n0.a<Size> f2804l;

    /* renamed from: m */
    public static final InterfaceC0649n0.a<Size> f2805m;

    /* renamed from: n */
    public static final InterfaceC0649n0.a<Size> f2806n;

    /* renamed from: o */
    public static final InterfaceC0649n0.a<List<Pair<Integer, Size[]>>> f2807o;

    /* renamed from: p */
    public static final InterfaceC0649n0.a<C7608c> f2808p;

    /* renamed from: q */
    public static final InterfaceC0649n0.a<List<Size>> f2809q;

    static {
        Class cls = Integer.TYPE;
        f2801i = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.targetRotation", cls);
        f2802j = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.appTargetRotation", cls);
        f2803k = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.mirrorMode", cls);
        f2804l = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.targetResolution", Size.class);
        f2805m = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.defaultResolution", Size.class);
        f2806n = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.maxResolution", Size.class);
        f2807o = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.supportedResolutions", List.class);
        f2808p = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.resolutionSelector", C7608c.class);
        f2809q = InterfaceC0649n0.a.m3199a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    /* renamed from: w */
    static void m3055w(InterfaceC0619f1 interfaceC0619f1) {
        boolean m3067y = interfaceC0619f1.m3067y();
        boolean z10 = interfaceC0619f1.m3061M(null) != null;
        if (m3067y && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC0619f1.m3058E(null) != null) {
            if (m3067y || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* renamed from: B */
    default int m3056B() {
        return ((Integer) mo3191a(f2800h)).intValue();
    }

    /* renamed from: C */
    default int m3057C(int i10) {
        return ((Integer) mo3197g(f2801i, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: E */
    default C7608c m3058E(C7608c c7608c) {
        return (C7608c) mo3197g(f2808p, c7608c);
    }

    /* renamed from: H */
    default List<Size> m3059H(List<Size> list) {
        List list2 = (List) mo3197g(f2809q, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    /* renamed from: J */
    default Size m3060J(Size size) {
        return (Size) mo3197g(f2805m, size);
    }

    /* renamed from: M */
    default Size m3061M(Size size) {
        return (Size) mo3197g(f2804l, size);
    }

    /* renamed from: U */
    default int m3062U(int i10) {
        return ((Integer) mo3197g(f2803k, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: i */
    default Size m3063i(Size size) {
        return (Size) mo3197g(f2806n, size);
    }

    /* renamed from: k */
    default List<Pair<Integer, Size[]>> m3064k(List<Pair<Integer, Size[]>> list) {
        return (List) mo3197g(f2807o, list);
    }

    /* renamed from: l */
    default C7608c m3065l() {
        return (C7608c) mo3191a(f2808p);
    }

    /* renamed from: t */
    default int m3066t(int i10) {
        return ((Integer) mo3197g(f2802j, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: y */
    default boolean m3067y() {
        return mo3192b(f2800h);
    }
}
