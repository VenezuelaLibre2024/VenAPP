package androidx.camera.core.impl;

import androidx.camera.core.impl.n0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d1 implements k2<androidx.camera.core.n>, f1, b0.g {
    public static final n0.a<Integer> H;
    public static final n0.a<Integer> I;
    public static final n0.a<k0> J;
    public static final n0.a<Integer> K;
    public static final n0.a<Integer> L;
    public static final n0.a<w.l0> M;
    public static final n0.a<Boolean> N;
    public static final n0.a<Integer> O;
    public static final n0.a<Integer> P;
    private final p1 G;

    static {
        Class cls = Integer.TYPE;
        H = n0.a.a("camerax.core.imageCapture.captureMode", cls);
        I = n0.a.a("camerax.core.imageCapture.flashMode", cls);
        J = n0.a.a("camerax.core.imageCapture.captureBundle", k0.class);
        K = n0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        L = n0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        M = n0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", w.l0.class);
        N = n0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        O = n0.a.a("camerax.core.imageCapture.flashType", cls);
        P = n0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public d1(p1 p1Var) {
        this.G = p1Var;
    }

    public k0 W(k0 k0Var) {
        return (k0) g(J, k0Var);
    }

    public int X() {
        return ((Integer) a(H)).intValue();
    }

    public int Y(int i10) {
        return ((Integer) g(I, Integer.valueOf(i10))).intValue();
    }

    public int Z(int i10) {
        return ((Integer) g(O, Integer.valueOf(i10))).intValue();
    }

    public w.l0 a0() {
        return (w.l0) g(M, null);
    }

    public Executor b0(Executor executor) {
        return (Executor) g(b0.g.B, executor);
    }

    public boolean c0() {
        return b(H);
    }

    @Override // androidx.camera.core.impl.u1
    public n0 m() {
        return this.G;
    }

    @Override // androidx.camera.core.impl.e1
    public int n() {
        return ((Integer) a(e1.f2456f)).intValue();
    }
}
