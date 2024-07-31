package v7;

import java.io.IOException;
import java.util.ArrayList;
import t6.d4;
import v7.a0;

/* loaded from: classes.dex */
public final class e extends h1 {
    private final boolean A;
    private final boolean B;
    private final ArrayList<d> C;
    private final d4.d D;
    private a E;
    private b F;
    private long G;
    private long H;

    /* renamed from: x, reason: collision with root package name */
    private final long f28293x;

    /* renamed from: y, reason: collision with root package name */
    private final long f28294y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f28295z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends s {

        /* renamed from: r, reason: collision with root package name */
        private final long f28296r;

        /* renamed from: s, reason: collision with root package name */
        private final long f28297s;

        /* renamed from: t, reason: collision with root package name */
        private final long f28298t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f28299u;

        public a(d4 d4Var, long j10, long j11) {
            super(d4Var);
            boolean z10 = false;
            if (d4Var.n() != 1) {
                throw new b(0);
            }
            d4.d s10 = d4Var.s(0, new d4.d());
            long max = Math.max(0L, j10);
            if (!s10.f26077w && max != 0 && !s10.f26073s) {
                throw new b(1);
            }
            long max2 = j11 == Long.MIN_VALUE ? s10.f26079y : Math.max(0L, j11);
            long j12 = s10.f26079y;
            if (j12 != -9223372036854775807L) {
                max2 = max2 > j12 ? j12 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f28296r = max;
            this.f28297s = max2;
            this.f28298t = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (s10.f26074t && (max2 == -9223372036854775807L || (j12 != -9223372036854775807L && max2 == j12))) {
                z10 = true;
            }
            this.f28299u = z10;
        }

        @Override // v7.s, t6.d4
        public d4.b l(int i10, d4.b bVar, boolean z10) {
            this.f28451f.l(0, bVar, z10);
            long r10 = bVar.r() - this.f28296r;
            long j10 = this.f28298t;
            return bVar.v(bVar.f26055a, bVar.f26056b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - r10, r10);
        }

        @Override // v7.s, t6.d4
        public d4.d t(int i10, d4.d dVar, long j10) {
            this.f28451f.t(0, dVar, 0L);
            long j11 = dVar.B;
            long j12 = this.f28296r;
            dVar.B = j11 + j12;
            dVar.f26079y = this.f28298t;
            dVar.f26074t = this.f28299u;
            long j13 = dVar.f26078x;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                dVar.f26078x = max;
                long j14 = this.f28297s;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                dVar.f26078x = max - this.f28296r;
            }
            long a12 = t8.r0.a1(this.f28296r);
            long j15 = dVar.f26070e;
            if (j15 != -9223372036854775807L) {
                dVar.f26070e = j15 + a12;
            }
            long j16 = dVar.f26071f;
            if (j16 != -9223372036854775807L) {
                dVar.f26071f = j16 + a12;
            }
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f28300a;

        public b(int i10) {
            super("Illegal clipping: " + a(i10));
            this.f28300a = i10;
        }

        private static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public e(a0 a0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((a0) t8.a.e(a0Var));
        t8.a.a(j10 >= 0);
        this.f28293x = j10;
        this.f28294y = j11;
        this.f28295z = z10;
        this.A = z11;
        this.B = z12;
        this.C = new ArrayList<>();
        this.D = new d4.d();
    }

    private void W(d4 d4Var) {
        long j10;
        long j11;
        d4Var.s(0, this.D);
        long h10 = this.D.h();
        if (this.E == null || this.C.isEmpty() || this.A) {
            long j12 = this.f28293x;
            long j13 = this.f28294y;
            if (this.B) {
                long f10 = this.D.f();
                j12 += f10;
                j13 += f10;
            }
            this.G = h10 + j12;
            this.H = this.f28294y != Long.MIN_VALUE ? h10 + j13 : Long.MIN_VALUE;
            int size = this.C.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.C.get(i10).u(this.G, this.H);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.G - h10;
            j11 = this.f28294y != Long.MIN_VALUE ? this.H - h10 : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(d4Var, j10, j11);
            this.E = aVar;
            D(aVar);
        } catch (b e10) {
            this.F = e10;
            for (int i11 = 0; i11 < this.C.size(); i11++) {
                this.C.get(i11).p(this.F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g, v7.a
    public void E() {
        super.E();
        this.F = null;
        this.E = null;
    }

    @Override // v7.h1
    protected void T(d4 d4Var) {
        if (this.F != null) {
            return;
        }
        W(d4Var);
    }

    @Override // v7.a0
    public y e(a0.b bVar, s8.b bVar2, long j10) {
        d dVar = new d(this.f28340v.e(bVar, bVar2, j10), this.f28295z, this.G, this.H);
        this.C.add(dVar);
        return dVar;
    }

    @Override // v7.a0
    public void l(y yVar) {
        t8.a.g(this.C.remove(yVar));
        this.f28340v.l(((d) yVar).f28269a);
        if (!this.C.isEmpty() || this.A) {
            return;
        }
        W(((a) t8.a.e(this.E)).f28451f);
    }

    @Override // v7.g, v7.a0
    public void n() {
        b bVar = this.F;
        if (bVar != null) {
            throw bVar;
        }
        super.n();
    }
}
