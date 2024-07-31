package g8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.w;
import t6.r3;
import t6.u1;
import t6.v1;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
public final class q extends t6.l implements Handler.Callback {
    private final l A;
    private final v1 B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private u1 G;
    private j H;
    private n I;
    private o J;
    private o K;
    private int L;
    private long M;
    private long N;
    private long O;

    /* renamed from: y, reason: collision with root package name */
    private final Handler f16105y;

    /* renamed from: z, reason: collision with root package name */
    private final p f16106z;

    public q(p pVar, Looper looper) {
        this(pVar, looper, l.f16090a);
    }

    public q(p pVar, Looper looper, l lVar) {
        super(3);
        this.f16106z = (p) t8.a.e(pVar);
        this.f16105y = looper == null ? null : r0.v(looper, this);
        this.A = lVar;
        this.B = new v1();
        this.M = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.O = -9223372036854775807L;
    }

    private void Y() {
        j0(new f(w.v(), b0(this.O)));
    }

    private long Z(long j10) {
        int b10 = this.J.b(j10);
        if (b10 == 0 || this.J.l() == 0) {
            return this.J.f29687b;
        }
        if (b10 != -1) {
            return this.J.i(b10 - 1);
        }
        return this.J.i(r2.l() - 1);
    }

    private long a0() {
        if (this.L == -1) {
            return Long.MAX_VALUE;
        }
        t8.a.e(this.J);
        if (this.L >= this.J.l()) {
            return Long.MAX_VALUE;
        }
        return this.J.i(this.L);
    }

    private long b0(long j10) {
        t8.a.g(j10 != -9223372036854775807L);
        t8.a.g(this.N != -9223372036854775807L);
        return j10 - this.N;
    }

    private void c0(k kVar) {
        s.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.G, kVar);
        Y();
        h0();
    }

    private void d0() {
        this.E = true;
        this.H = this.A.b((u1) t8.a.e(this.G));
    }

    private void e0(f fVar) {
        this.f16106z.onCues(fVar.f16078a);
        this.f16106z.onCues(fVar);
    }

    private void f0() {
        this.I = null;
        this.L = -1;
        o oVar = this.J;
        if (oVar != null) {
            oVar.x();
            this.J = null;
        }
        o oVar2 = this.K;
        if (oVar2 != null) {
            oVar2.x();
            this.K = null;
        }
    }

    private void g0() {
        f0();
        ((j) t8.a.e(this.H)).release();
        this.H = null;
        this.F = 0;
    }

    private void h0() {
        g0();
        d0();
    }

    private void j0(f fVar) {
        Handler handler = this.f16105y;
        if (handler != null) {
            handler.obtainMessage(0, fVar).sendToTarget();
        } else {
            e0(fVar);
        }
    }

    @Override // t6.l
    protected void O() {
        this.G = null;
        this.M = -9223372036854775807L;
        Y();
        this.N = -9223372036854775807L;
        this.O = -9223372036854775807L;
        g0();
    }

    @Override // t6.l
    protected void Q(long j10, boolean z10) {
        this.O = j10;
        Y();
        this.C = false;
        this.D = false;
        this.M = -9223372036854775807L;
        if (this.F != 0) {
            h0();
        } else {
            f0();
            ((j) t8.a.e(this.H)).flush();
        }
    }

    @Override // t6.l
    protected void U(u1[] u1VarArr, long j10, long j11) {
        this.N = j11;
        this.G = u1VarArr[0];
        if (this.H != null) {
            this.F = 1;
        } else {
            d0();
        }
    }

    @Override // t6.r3
    public int a(u1 u1Var) {
        if (this.A.a(u1Var)) {
            return r3.o(u1Var.R == 0 ? 4 : 2);
        }
        return r3.o(t8.w.r(u1Var.f26517w) ? 1 : 0);
    }

    @Override // t6.q3
    public boolean d() {
        return true;
    }

    @Override // t6.q3
    public boolean e() {
        return this.D;
    }

    @Override // t6.q3, t6.r3
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        e0((f) message.obj);
        return true;
    }

    public void i0(long j10) {
        t8.a.g(r());
        this.M = j10;
    }

    @Override // t6.q3
    public void z(long j10, long j11) {
        boolean z10;
        this.O = j10;
        if (r()) {
            long j12 = this.M;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                f0();
                this.D = true;
            }
        }
        if (this.D) {
            return;
        }
        if (this.K == null) {
            ((j) t8.a.e(this.H)).a(j10);
            try {
                this.K = ((j) t8.a.e(this.H)).b();
            } catch (k e10) {
                c0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.J != null) {
            long a02 = a0();
            z10 = false;
            while (a02 <= j10) {
                this.L++;
                a02 = a0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        o oVar = this.K;
        if (oVar != null) {
            if (oVar.s()) {
                if (!z10 && a0() == Long.MAX_VALUE) {
                    if (this.F == 2) {
                        h0();
                    } else {
                        f0();
                        this.D = true;
                    }
                }
            } else if (oVar.f29687b <= j10) {
                o oVar2 = this.J;
                if (oVar2 != null) {
                    oVar2.x();
                }
                this.L = oVar.b(j10);
                this.J = oVar;
                this.K = null;
                z10 = true;
            }
        }
        if (z10) {
            t8.a.e(this.J);
            j0(new f(this.J.h(j10), b0(Z(j10))));
        }
        if (this.F == 2) {
            return;
        }
        while (!this.C) {
            try {
                n nVar = this.I;
                if (nVar == null) {
                    nVar = ((j) t8.a.e(this.H)).d();
                    if (nVar == null) {
                        return;
                    } else {
                        this.I = nVar;
                    }
                }
                if (this.F == 1) {
                    nVar.w(4);
                    ((j) t8.a.e(this.H)).c(nVar);
                    this.I = null;
                    this.F = 2;
                    return;
                }
                int V = V(this.B, nVar, 0);
                if (V == -4) {
                    if (nVar.s()) {
                        this.C = true;
                        this.E = false;
                    } else {
                        u1 u1Var = this.B.f26567b;
                        if (u1Var == null) {
                            return;
                        }
                        nVar.f16102t = u1Var.A;
                        nVar.z();
                        this.E &= !nVar.u();
                    }
                    if (!this.E) {
                        ((j) t8.a.e(this.H)).c(nVar);
                        this.I = null;
                    }
                } else if (V == -3) {
                    return;
                }
            } catch (k e11) {
                c0(e11);
                return;
            }
        }
    }
}
