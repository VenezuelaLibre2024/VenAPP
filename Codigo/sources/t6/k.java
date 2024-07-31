package t6;

import com.google.android.gms.common.api.a;
import java.util.List;
import t6.d4;

/* loaded from: classes.dex */
public abstract class k implements j3 {

    /* renamed from: a, reason: collision with root package name */
    protected final d4.d f26272a = new d4.d();

    private int R() {
        int J = J();
        if (J == 1) {
            return 0;
        }
        return J;
    }

    private void T(long j10, int i10) {
        S(G(), j10, i10, false);
    }

    private void U(int i10, int i11) {
        S(i10, -9223372036854775807L, i11, false);
    }

    @Override // t6.j3
    public final void A(float f10) {
        b(c().e(f10));
    }

    @Override // t6.j3
    public final boolean E() {
        d4 r10 = r();
        return !r10.v() && r10.s(G(), this.f26272a).f26073s;
    }

    @Override // t6.j3
    public final boolean M() {
        d4 r10 = r();
        return !r10.v() && r10.s(G(), this.f26272a).i();
    }

    public final void N(List<c2> list) {
        C(a.e.API_PRIORITY_OTHER, list);
    }

    public final long O() {
        d4 r10 = r();
        if (r10.v()) {
            return -9223372036854775807L;
        }
        return r10.s(G(), this.f26272a).g();
    }

    public final int P() {
        d4 r10 = r();
        if (r10.v()) {
            return -1;
        }
        return r10.j(G(), R(), K());
    }

    public final int Q() {
        d4 r10 = r();
        if (r10.v()) {
            return -1;
        }
        return r10.q(G(), R(), K());
    }

    public abstract void S(int i10, long j10, int i11, boolean z10);

    @Override // t6.j3
    public final void d() {
        k(true);
    }

    @Override // t6.j3
    public final void i() {
        U(G(), 4);
    }

    @Override // t6.j3
    public final boolean n() {
        return P() != -1;
    }

    @Override // t6.j3
    public final boolean p() {
        d4 r10 = r();
        return !r10.v() && r10.s(G(), this.f26272a).f26074t;
    }

    @Override // t6.j3
    public final void pause() {
        k(false);
    }

    @Override // t6.j3
    public final void v(c2 c2Var) {
        N(com.google.common.collect.w.w(c2Var));
    }

    @Override // t6.j3
    public final boolean x() {
        return Q() != -1;
    }

    @Override // t6.j3
    public final void z(long j10) {
        T(j10, 5);
    }
}
