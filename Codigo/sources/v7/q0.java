package v7;

import android.os.Looper;
import s8.j;
import t6.c2;
import t6.d4;
import u6.m3;
import v7.a0;
import v7.k0;
import v7.p0;
import v7.q0;

/* loaded from: classes.dex */
public final class q0 extends v7.a implements p0.b {
    private long A;
    private boolean B;
    private boolean C;
    private s8.m0 D;

    /* renamed from: s */
    private final c2 f28435s;

    /* renamed from: t */
    private final c2.h f28436t;

    /* renamed from: u */
    private final j.a f28437u;

    /* renamed from: v */
    private final k0.a f28438v;

    /* renamed from: w */
    private final x6.v f28439w;

    /* renamed from: x */
    private final s8.d0 f28440x;

    /* renamed from: y */
    private final int f28441y;

    /* renamed from: z */
    private boolean f28442z;

    /* loaded from: classes.dex */
    public class a extends s {
        a(q0 q0Var, d4 d4Var) {
            super(d4Var);
        }

        @Override // v7.s, t6.d4
        public d4.b l(int i10, d4.b bVar, boolean z10) {
            super.l(i10, bVar, z10);
            bVar.f26060f = true;
            return bVar;
        }

        @Override // v7.s, t6.d4
        public d4.d t(int i10, d4.d dVar, long j10) {
            super.t(i10, dVar, j10);
            dVar.f26077w = true;
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a0.a {

        /* renamed from: a */
        private final j.a f28443a;

        /* renamed from: b */
        private k0.a f28444b;

        /* renamed from: c */
        private x6.x f28445c;

        /* renamed from: d */
        private s8.d0 f28446d;

        /* renamed from: e */
        private int f28447e;

        /* renamed from: f */
        private String f28448f;

        /* renamed from: g */
        private Object f28449g;

        public b(j.a aVar) {
            this(aVar, new y6.h());
        }

        public b(j.a aVar, k0.a aVar2) {
            this(aVar, aVar2, new x6.l(), new s8.v(), 1048576);
        }

        public b(j.a aVar, k0.a aVar2, x6.x xVar, s8.d0 d0Var, int i10) {
            this.f28443a = aVar;
            this.f28444b = aVar2;
            this.f28445c = xVar;
            this.f28446d = d0Var;
            this.f28447e = i10;
        }

        public b(j.a aVar, y6.p pVar) {
            this(aVar, new k0.a() { // from class: v7.r0
                public /* synthetic */ r0() {
                }

                @Override // v7.k0.a
                public final k0 a(m3 m3Var) {
                    k0 f10;
                    f10 = q0.b.f(y6.p.this, m3Var);
                    return f10;
                }
            });
        }

        public static /* synthetic */ k0 f(y6.p pVar, m3 m3Var) {
            return new c(pVar);
        }

        @Override // v7.a0.a
        /* renamed from: e */
        public q0 a(c2 c2Var) {
            c2.c c10;
            c2.c f10;
            t8.a.e(c2Var.f25880b);
            c2.h hVar = c2Var.f25880b;
            boolean z10 = hVar.f25960h == null && this.f28449g != null;
            boolean z11 = hVar.f25957e == null && this.f28448f != null;
            if (!z10 || !z11) {
                if (z10) {
                    f10 = c2Var.c().f(this.f28449g);
                    c2Var = f10.a();
                    c2 c2Var2 = c2Var;
                    return new q0(c2Var2, this.f28443a, this.f28444b, this.f28445c.a(c2Var2), this.f28446d, this.f28447e, null);
                }
                if (z11) {
                    c10 = c2Var.c();
                }
                c2 c2Var22 = c2Var;
                return new q0(c2Var22, this.f28443a, this.f28444b, this.f28445c.a(c2Var22), this.f28446d, this.f28447e, null);
            }
            c10 = c2Var.c().f(this.f28449g);
            f10 = c10.b(this.f28448f);
            c2Var = f10.a();
            c2 c2Var222 = c2Var;
            return new q0(c2Var222, this.f28443a, this.f28444b, this.f28445c.a(c2Var222), this.f28446d, this.f28447e, null);
        }

        @Override // v7.a0.a
        /* renamed from: g */
        public b b(x6.x xVar) {
            this.f28445c = (x6.x) t8.a.f(xVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // v7.a0.a
        /* renamed from: h */
        public b c(s8.d0 d0Var) {
            this.f28446d = (s8.d0) t8.a.f(d0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    private q0(c2 c2Var, j.a aVar, k0.a aVar2, x6.v vVar, s8.d0 d0Var, int i10) {
        this.f28436t = (c2.h) t8.a.e(c2Var.f25880b);
        this.f28435s = c2Var;
        this.f28437u = aVar;
        this.f28438v = aVar2;
        this.f28439w = vVar;
        this.f28440x = d0Var;
        this.f28441y = i10;
        this.f28442z = true;
        this.A = -9223372036854775807L;
    }

    /* synthetic */ q0(c2 c2Var, j.a aVar, k0.a aVar2, x6.v vVar, s8.d0 d0Var, int i10, a aVar3) {
        this(c2Var, aVar, aVar2, vVar, d0Var, i10);
    }

    private void F() {
        d4 y0Var = new y0(this.A, this.B, false, this.C, null, this.f28435s);
        if (this.f28442z) {
            y0Var = new a(this, y0Var);
        }
        D(y0Var);
    }

    @Override // v7.a
    protected void C(s8.m0 m0Var) {
        this.D = m0Var;
        this.f28439w.b((Looper) t8.a.e(Looper.myLooper()), A());
        this.f28439w.a();
        F();
    }

    @Override // v7.a
    protected void E() {
        this.f28439w.release();
    }

    @Override // v7.a0
    public c2 d() {
        return this.f28435s;
    }

    @Override // v7.a0
    public y e(a0.b bVar, s8.b bVar2, long j10) {
        s8.j a10 = this.f28437u.a();
        s8.m0 m0Var = this.D;
        if (m0Var != null) {
            a10.l(m0Var);
        }
        return new p0(this.f28436t.f25953a, a10, this.f28438v.a(A()), this.f28439w, u(bVar), this.f28440x, w(bVar), this, bVar2, this.f28436t.f25957e, this.f28441y);
    }

    @Override // v7.p0.b
    public void k(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A;
        }
        if (!this.f28442z && this.A == j10 && this.B == z10 && this.C == z11) {
            return;
        }
        this.A = j10;
        this.B = z10;
        this.C = z11;
        this.f28442z = false;
        F();
    }

    @Override // v7.a0
    public void l(y yVar) {
        ((p0) yVar).e0();
    }

    @Override // v7.a0
    public void n() {
    }
}
