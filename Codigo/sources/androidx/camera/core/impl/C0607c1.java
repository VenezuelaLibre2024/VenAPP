package androidx.camera.core.impl;

import androidx.camera.core.C0593f;
import androidx.camera.core.impl.InterfaceC0649n0;
import p018b0.InterfaceC1603k;
import p407w.InterfaceC12023l0;

/* renamed from: androidx.camera.core.impl.c1 */
/* loaded from: classes.dex */
public final class C0607c1 implements InterfaceC0640k2<C0593f>, InterfaceC0619f1, InterfaceC1603k {

    /* renamed from: H */
    public static final InterfaceC0649n0.a<Integer> f2769H = InterfaceC0649n0.a.m3199a("camerax.core.imageAnalysis.backpressureStrategy", C0593f.b.class);

    /* renamed from: I */
    public static final InterfaceC0649n0.a<Integer> f2770I = InterfaceC0649n0.a.m3199a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: J */
    public static final InterfaceC0649n0.a<InterfaceC12023l0> f2771J = InterfaceC0649n0.a.m3199a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC12023l0.class);

    /* renamed from: K */
    public static final InterfaceC0649n0.a<Integer> f2772K = InterfaceC0649n0.a.m3199a("camerax.core.imageAnalysis.outputImageFormat", C0593f.e.class);

    /* renamed from: L */
    public static final InterfaceC0649n0.a<Boolean> f2773L = InterfaceC0649n0.a.m3199a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* renamed from: M */
    public static final InterfaceC0649n0.a<Boolean> f2774M = InterfaceC0649n0.a.m3199a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* renamed from: G */
    private final C0656p1 f2775G;

    public C0607c1(C0656p1 c0656p1) {
        this.f2775G = c0656p1;
    }

    /* renamed from: W */
    public int m3004W(int i10) {
        return ((Integer) mo3197g(f2769H, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: X */
    public int m3005X(int i10) {
        return ((Integer) mo3197g(f2770I, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: Y */
    public InterfaceC12023l0 m3006Y() {
        return (InterfaceC12023l0) mo3197g(f2771J, null);
    }

    /* renamed from: Z */
    public Boolean m3007Z(Boolean bool) {
        return (Boolean) mo3197g(f2773L, bool);
    }

    /* renamed from: a0 */
    public int m3008a0(int i10) {
        return ((Integer) mo3197g(f2772K, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: b0 */
    public Boolean m3009b0(Boolean bool) {
        return (Boolean) mo3197g(f2774M, bool);
    }

    @Override // androidx.camera.core.impl.InterfaceC0671u1
    /* renamed from: m */
    public InterfaceC0649n0 mo2589m() {
        return this.f2775G;
    }

    @Override // androidx.camera.core.impl.InterfaceC0615e1
    /* renamed from: n */
    public int mo3010n() {
        return 35;
    }
}
