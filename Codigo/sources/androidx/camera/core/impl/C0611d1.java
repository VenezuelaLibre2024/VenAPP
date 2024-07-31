package androidx.camera.core.impl;

import androidx.camera.core.C0709n;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.concurrent.Executor;
import p018b0.InterfaceC1599g;
import p407w.InterfaceC12023l0;

/* renamed from: androidx.camera.core.impl.d1 */
/* loaded from: classes.dex */
public final class C0611d1 implements InterfaceC0640k2<C0709n>, InterfaceC0619f1, InterfaceC1599g {

    /* renamed from: H */
    public static final InterfaceC0649n0.a<Integer> f2780H;

    /* renamed from: I */
    public static final InterfaceC0649n0.a<Integer> f2781I;

    /* renamed from: J */
    public static final InterfaceC0649n0.a<InterfaceC0638k0> f2782J;

    /* renamed from: K */
    public static final InterfaceC0649n0.a<Integer> f2783K;

    /* renamed from: L */
    public static final InterfaceC0649n0.a<Integer> f2784L;

    /* renamed from: M */
    public static final InterfaceC0649n0.a<InterfaceC12023l0> f2785M;

    /* renamed from: N */
    public static final InterfaceC0649n0.a<Boolean> f2786N;

    /* renamed from: O */
    public static final InterfaceC0649n0.a<Integer> f2787O;

    /* renamed from: P */
    public static final InterfaceC0649n0.a<Integer> f2788P;

    /* renamed from: G */
    private final C0656p1 f2789G;

    static {
        Class cls = Integer.TYPE;
        f2780H = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.captureMode", cls);
        f2781I = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.flashMode", cls);
        f2782J = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.captureBundle", InterfaceC0638k0.class);
        f2783K = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f2784L = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f2785M = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC12023l0.class);
        f2786N = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f2787O = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.flashType", cls);
        f2788P = InterfaceC0649n0.a.m3199a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C0611d1(C0656p1 c0656p1) {
        this.f2789G = c0656p1;
    }

    /* renamed from: W */
    public InterfaceC0638k0 m3019W(InterfaceC0638k0 interfaceC0638k0) {
        return (InterfaceC0638k0) mo3197g(f2782J, interfaceC0638k0);
    }

    /* renamed from: X */
    public int m3020X() {
        return ((Integer) mo3191a(f2780H)).intValue();
    }

    /* renamed from: Y */
    public int m3021Y(int i10) {
        return ((Integer) mo3197g(f2781I, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: Z */
    public int m3022Z(int i10) {
        return ((Integer) mo3197g(f2787O, Integer.valueOf(i10))).intValue();
    }

    /* renamed from: a0 */
    public InterfaceC12023l0 m3023a0() {
        return (InterfaceC12023l0) mo3197g(f2785M, null);
    }

    /* renamed from: b0 */
    public Executor m3024b0(Executor executor) {
        return (Executor) mo3197g(InterfaceC1599g.f6852B, executor);
    }

    /* renamed from: c0 */
    public boolean m3025c0() {
        return mo3192b(f2780H);
    }

    @Override // androidx.camera.core.impl.InterfaceC0671u1
    /* renamed from: m */
    public InterfaceC0649n0 mo2589m() {
        return this.f2789G;
    }

    @Override // androidx.camera.core.impl.InterfaceC0615e1
    /* renamed from: n */
    public int mo3010n() {
        return ((Integer) mo3191a(InterfaceC0615e1.f2794f)).intValue();
    }
}
