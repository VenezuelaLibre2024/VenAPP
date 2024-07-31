package androidx.camera.core.impl;

import androidx.camera.core.f;
import androidx.camera.core.impl.n0;

/* loaded from: classes.dex */
public final class c1 implements k2<androidx.camera.core.f>, f1, b0.k {
    public static final n0.a<Integer> H = n0.a.a("camerax.core.imageAnalysis.backpressureStrategy", f.b.class);
    public static final n0.a<Integer> I = n0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final n0.a<w.l0> J = n0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", w.l0.class);
    public static final n0.a<Integer> K = n0.a.a("camerax.core.imageAnalysis.outputImageFormat", f.e.class);
    public static final n0.a<Boolean> L = n0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final n0.a<Boolean> M = n0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);
    private final p1 G;

    public c1(p1 p1Var) {
        this.G = p1Var;
    }

    public int W(int i10) {
        return ((Integer) g(H, Integer.valueOf(i10))).intValue();
    }

    public int X(int i10) {
        return ((Integer) g(I, Integer.valueOf(i10))).intValue();
    }

    public w.l0 Y() {
        return (w.l0) g(J, null);
    }

    public Boolean Z(Boolean bool) {
        return (Boolean) g(L, bool);
    }

    public int a0(int i10) {
        return ((Integer) g(K, Integer.valueOf(i10))).intValue();
    }

    public Boolean b0(Boolean bool) {
        return (Boolean) g(M, bool);
    }

    @Override // androidx.camera.core.impl.u1
    public n0 m() {
        return this.G;
    }

    @Override // androidx.camera.core.impl.e1
    public int n() {
        return 35;
    }
}
