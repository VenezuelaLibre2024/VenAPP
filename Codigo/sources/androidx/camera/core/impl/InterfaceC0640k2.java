package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import p018b0.InterfaceC1602j;
import p018b0.InterfaceC1604l;
import p407w.C12030p;
import p407w.InterfaceC12050z;

/* renamed from: androidx.camera.core.impl.k2 */
/* loaded from: classes.dex */
public interface InterfaceC0640k2<T extends AbstractC0718w> extends InterfaceC1602j<T>, InterfaceC1604l, InterfaceC0615e1 {

    /* renamed from: A */
    public static final InterfaceC0649n0.a<InterfaceC0644l2.b> f2864A;

    /* renamed from: r */
    public static final InterfaceC0649n0.a<C0701y1> f2865r = InterfaceC0649n0.a.m3199a("camerax.core.useCase.defaultSessionConfig", C0701y1.class);

    /* renamed from: s */
    public static final InterfaceC0649n0.a<C0642l0> f2866s = InterfaceC0649n0.a.m3199a("camerax.core.useCase.defaultCaptureConfig", C0642l0.class);

    /* renamed from: t */
    public static final InterfaceC0649n0.a<C0701y1.d> f2867t = InterfaceC0649n0.a.m3199a("camerax.core.useCase.sessionConfigUnpacker", C0701y1.d.class);

    /* renamed from: u */
    public static final InterfaceC0649n0.a<C0642l0.b> f2868u = InterfaceC0649n0.a.m3199a("camerax.core.useCase.captureConfigUnpacker", C0642l0.b.class);

    /* renamed from: v */
    public static final InterfaceC0649n0.a<Integer> f2869v = InterfaceC0649n0.a.m3199a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: w */
    public static final InterfaceC0649n0.a<C12030p> f2870w = InterfaceC0649n0.a.m3199a("camerax.core.useCase.cameraSelector", C12030p.class);

    /* renamed from: x */
    public static final InterfaceC0649n0.a<Range<Integer>> f2871x = InterfaceC0649n0.a.m3199a("camerax.core.useCase.targetFrameRate", Range.class);

    /* renamed from: y */
    public static final InterfaceC0649n0.a<Boolean> f2872y;

    /* renamed from: z */
    public static final InterfaceC0649n0.a<Boolean> f2873z;

    /* renamed from: androidx.camera.core.impl.k2$a */
    /* loaded from: classes.dex */
    public interface a<T extends AbstractC0718w, C extends InterfaceC0640k2<T>, B> extends InterfaceC12050z<T> {
        /* renamed from: b */
        C mo2933b();
    }

    static {
        Class cls = Boolean.TYPE;
        f2872y = InterfaceC0649n0.a.m3199a("camerax.core.useCase.zslDisabled", cls);
        f2873z = InterfaceC0649n0.a.m3199a("camerax.core.useCase.highResolutionDisabled", cls);
        f2864A = InterfaceC0649n0.a.m3199a("camerax.core.useCase.captureType", InterfaceC0644l2.b.class);
    }

    /* renamed from: A */
    default int m3138A(int i10) {
        return ((Integer) mo3197g(f2869v, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: F */
    default C12030p m3139F(C12030p c12030p) {
        return (C12030p) mo3197g(f2870w, c12030p);
    }

    /* renamed from: I */
    default boolean m3140I(boolean z10) {
        return ((Boolean) mo3197g(f2873z, Boolean.valueOf(z10))).booleanValue();
    }

    /* renamed from: K */
    default boolean m3141K(boolean z10) {
        return ((Boolean) mo3197g(f2872y, Boolean.valueOf(z10))).booleanValue();
    }

    /* renamed from: L */
    default int m3142L() {
        return ((Integer) mo3191a(f2869v)).intValue();
    }

    /* renamed from: N */
    default InterfaceC0644l2.b mo2588N() {
        return (InterfaceC0644l2.b) mo3191a(f2864A);
    }

    /* renamed from: T */
    default C0701y1.d m3143T(C0701y1.d dVar) {
        return (C0701y1.d) mo3197g(f2867t, dVar);
    }

    /* renamed from: o */
    default C0701y1 m3144o(C0701y1 c0701y1) {
        return (C0701y1) mo3197g(f2865r, c0701y1);
    }

    /* renamed from: q */
    default C0642l0.b m3145q(C0642l0.b bVar) {
        return (C0642l0.b) mo3197g(f2868u, bVar);
    }

    /* renamed from: s */
    default C0642l0 m3146s(C0642l0 c0642l0) {
        return (C0642l0) mo3197g(f2866s, c0642l0);
    }

    /* renamed from: x */
    default Range<Integer> m3147x(Range<Integer> range) {
        return (Range) mo3197g(f2871x, range);
    }
}
