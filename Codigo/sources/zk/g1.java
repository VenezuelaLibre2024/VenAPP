package zk;

/* loaded from: classes3.dex */
public abstract class g1 extends h0 {

    /* renamed from: c, reason: collision with root package name */
    private long f32889c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32890d;

    /* renamed from: e, reason: collision with root package name */
    private dk.h<x0<?>> f32891e;

    public static /* synthetic */ void J0(g1 g1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g1Var.I0(z10);
    }

    private final long L0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void Y0(g1 g1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g1Var.W0(z10);
    }

    public final void I0(boolean z10) {
        long L0 = this.f32889c - L0(z10);
        this.f32889c = L0;
        if (L0 <= 0 && this.f32890d) {
            shutdown();
        }
    }

    public final void R0(x0<?> x0Var) {
        dk.h<x0<?>> hVar = this.f32891e;
        if (hVar == null) {
            hVar = new dk.h<>();
            this.f32891e = hVar;
        }
        hVar.addLast(x0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long T0() {
        dk.h<x0<?>> hVar = this.f32891e;
        return (hVar == null || hVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void W0(boolean z10) {
        this.f32889c += L0(z10);
        if (z10) {
            return;
        }
        this.f32890d = true;
    }

    public final boolean a1() {
        return this.f32889c >= L0(true);
    }

    public final boolean b1() {
        dk.h<x0<?>> hVar = this.f32891e;
        if (hVar != null) {
            return hVar.isEmpty();
        }
        return true;
    }

    public long c1() {
        return !j1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean j1() {
        x0<?> q10;
        dk.h<x0<?>> hVar = this.f32891e;
        if (hVar == null || (q10 = hVar.q()) == null) {
            return false;
        }
        q10.run();
        return true;
    }

    public boolean q1() {
        return false;
    }

    public void shutdown() {
    }
}
