package v7;

/* loaded from: classes.dex */
public class h implements w0 {

    /* renamed from: a, reason: collision with root package name */
    protected final w0[] f28332a;

    public h(w0[] w0VarArr) {
        this.f28332a = w0VarArr;
    }

    @Override // v7.w0
    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (w0 w0Var : this.f28332a) {
            long b10 = w0Var.b();
            if (b10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // v7.w0
    public boolean e(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long b10 = b();
            if (b10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (w0 w0Var : this.f28332a) {
                long b11 = w0Var.b();
                boolean z12 = b11 != Long.MIN_VALUE && b11 <= j10;
                if (b11 == b10 || z12) {
                    z10 |= w0Var.e(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // v7.w0
    public final long f() {
        long j10 = Long.MAX_VALUE;
        for (w0 w0Var : this.f28332a) {
            long f10 = w0Var.f();
            if (f10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, f10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // v7.w0
    public final void g(long j10) {
        for (w0 w0Var : this.f28332a) {
            w0Var.g(j10);
        }
    }

    @Override // v7.w0
    public boolean isLoading() {
        for (w0 w0Var : this.f28332a) {
            if (w0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
