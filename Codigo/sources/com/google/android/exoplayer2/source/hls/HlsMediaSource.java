package com.google.android.exoplayer2.source.hls;

import a8.g;
import a8.h;
import android.os.Looper;
import b8.c;
import b8.e;
import b8.g;
import b8.k;
import b8.l;
import java.util.List;
import s8.b;
import s8.d0;
import s8.j;
import s8.m0;
import t6.c2;
import t6.r1;
import t8.r0;
import v7.a0;
import v7.h0;
import v7.i;
import v7.j;
import v7.y;
import v7.y0;
import x6.v;
import x6.x;

/* loaded from: classes.dex */
public final class HlsMediaSource extends v7.a implements l.e {
    private final boolean A;
    private final l B;
    private final long C;
    private final c2 D;
    private c2.g E;
    private m0 F;

    /* renamed from: s */
    private final h f8217s;

    /* renamed from: t */
    private final c2.h f8218t;

    /* renamed from: u */
    private final g f8219u;

    /* renamed from: v */
    private final i f8220v;

    /* renamed from: w */
    private final v f8221w;

    /* renamed from: x */
    private final d0 f8222x;

    /* renamed from: y */
    private final boolean f8223y;

    /* renamed from: z */
    private final int f8224z;

    /* loaded from: classes.dex */
    public static final class Factory implements a0.a {

        /* renamed from: a */
        private final g f8225a;

        /* renamed from: b */
        private h f8226b;

        /* renamed from: c */
        private k f8227c;

        /* renamed from: d */
        private l.a f8228d;

        /* renamed from: e */
        private i f8229e;

        /* renamed from: f */
        private x f8230f;

        /* renamed from: g */
        private d0 f8231g;

        /* renamed from: h */
        private boolean f8232h;

        /* renamed from: i */
        private int f8233i;

        /* renamed from: j */
        private boolean f8234j;

        /* renamed from: k */
        private long f8235k;

        public Factory(g gVar) {
            this.f8225a = (g) t8.a.e(gVar);
            this.f8230f = new x6.l();
            this.f8227c = new b8.a();
            this.f8228d = c.A;
            this.f8226b = h.f159a;
            this.f8231g = new s8.v();
            this.f8229e = new j();
            this.f8233i = 1;
            this.f8235k = -9223372036854775807L;
            this.f8232h = true;
        }

        public Factory(j.a aVar) {
            this(new a8.c(aVar));
        }

        @Override // v7.a0.a
        /* renamed from: d */
        public HlsMediaSource a(c2 c2Var) {
            t8.a.e(c2Var.f25880b);
            k kVar = this.f8227c;
            List<u7.c> list = c2Var.f25880b.f25956d;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f8225a;
            h hVar = this.f8226b;
            i iVar = this.f8229e;
            v a10 = this.f8230f.a(c2Var);
            d0 d0Var = this.f8231g;
            return new HlsMediaSource(c2Var, gVar, hVar, iVar, a10, d0Var, this.f8228d.a(this.f8225a, d0Var, kVar), this.f8235k, this.f8232h, this.f8233i, this.f8234j);
        }

        @Override // v7.a0.a
        /* renamed from: e */
        public Factory b(x xVar) {
            this.f8230f = (x) t8.a.f(xVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // v7.a0.a
        /* renamed from: f */
        public Factory c(d0 d0Var) {
            this.f8231g = (d0) t8.a.f(d0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    static {
        r1.a("goog.exo.hls");
    }

    private HlsMediaSource(c2 c2Var, g gVar, h hVar, i iVar, v vVar, d0 d0Var, l lVar, long j10, boolean z10, int i10, boolean z11) {
        this.f8218t = (c2.h) t8.a.e(c2Var.f25880b);
        this.D = c2Var;
        this.E = c2Var.f25882d;
        this.f8219u = gVar;
        this.f8217s = hVar;
        this.f8220v = iVar;
        this.f8221w = vVar;
        this.f8222x = d0Var;
        this.B = lVar;
        this.C = j10;
        this.f8223y = z10;
        this.f8224z = i10;
        this.A = z11;
    }

    /* synthetic */ HlsMediaSource(c2 c2Var, g gVar, h hVar, i iVar, v vVar, d0 d0Var, l lVar, long j10, boolean z10, int i10, boolean z11, a aVar) {
        this(c2Var, gVar, hVar, iVar, vVar, d0Var, lVar, j10, z10, i10, z11);
    }

    private y0 F(b8.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long c10 = gVar.f6220h - this.B.c();
        long j12 = gVar.f6227o ? c10 + gVar.f6233u : -9223372036854775807L;
        long J = J(gVar);
        long j13 = this.E.f25943a;
        M(gVar, r0.r(j13 != -9223372036854775807L ? r0.C0(j13) : L(gVar, J), J, gVar.f6233u + J));
        return new y0(j10, j11, -9223372036854775807L, j12, gVar.f6233u, c10, K(gVar, J), true, !gVar.f6227o, gVar.f6216d == 2 && gVar.f6218f, aVar, this.D, this.E);
    }

    private y0 G(b8.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long j12;
        if (gVar.f6217e == -9223372036854775807L || gVar.f6230r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar.f6219g) {
                long j13 = gVar.f6217e;
                if (j13 != gVar.f6233u) {
                    j12 = I(gVar.f6230r, j13).f6246e;
                }
            }
            j12 = gVar.f6217e;
        }
        long j14 = gVar.f6233u;
        return new y0(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, aVar, this.D, null);
    }

    private static g.b H(List<g.b> list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = list.get(i10);
            long j11 = bVar2.f6246e;
            if (j11 > j10 || !bVar2.f6235w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static g.d I(List<g.d> list, long j10) {
        return list.get(r0.f(list, Long.valueOf(j10), true, true));
    }

    private long J(b8.g gVar) {
        if (gVar.f6228p) {
            return r0.C0(r0.b0(this.C)) - gVar.e();
        }
        return 0L;
    }

    private long K(b8.g gVar, long j10) {
        long j11 = gVar.f6217e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f6233u + j10) - r0.C0(this.E.f25943a);
        }
        if (gVar.f6219g) {
            return j11;
        }
        g.b H = H(gVar.f6231s, j11);
        if (H != null) {
            return H.f6246e;
        }
        if (gVar.f6230r.isEmpty()) {
            return 0L;
        }
        g.d I = I(gVar.f6230r, j11);
        g.b H2 = H(I.f6241x, j11);
        return H2 != null ? H2.f6246e : I.f6246e;
    }

    private static long L(b8.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f6234v;
        long j12 = gVar.f6217e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f6233u - j12;
        } else {
            long j13 = fVar.f6256d;
            if (j13 == -9223372036854775807L || gVar.f6226n == -9223372036854775807L) {
                long j14 = fVar.f6255c;
                j11 = j14 != -9223372036854775807L ? j14 : gVar.f6225m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M(b8.g r5, long r6) {
        /*
            r4 = this;
            t6.c2 r0 = r4.D
            t6.c2$g r0 = r0.f25882d
            float r1 = r0.f25946d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f25947e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            b8.g$f r5 = r5.f6234v
            long r0 = r5.f6255c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.f6256d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            t6.c2$g$a r0 = new t6.c2$g$a
            r0.<init>()
            long r6 = t8.r0.a1(r6)
            t6.c2$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3c
            r0 = r7
            goto L40
        L3c:
            t6.c2$g r0 = r4.E
            float r0 = r0.f25946d
        L40:
            t6.c2$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L47
            goto L4b
        L47:
            t6.c2$g r5 = r4.E
            float r7 = r5.f25947e
        L4b:
            t6.c2$g$a r5 = r6.h(r7)
            t6.c2$g r5 = r5.f()
            r4.E = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.M(b8.g, long):void");
    }

    @Override // v7.a
    protected void C(m0 m0Var) {
        this.F = m0Var;
        this.f8221w.b((Looper) t8.a.e(Looper.myLooper()), A());
        this.f8221w.a();
        this.B.d(this.f8218t.f25953a, w(null), this);
    }

    @Override // v7.a
    protected void E() {
        this.B.stop();
        this.f8221w.release();
    }

    @Override // v7.a0
    public c2 d() {
        return this.D;
    }

    @Override // v7.a0
    public y e(a0.b bVar, b bVar2, long j10) {
        h0.a w10 = w(bVar);
        return new a8.k(this.f8217s, this.B, this.f8219u, this.F, this.f8221w, u(bVar), this.f8222x, w10, bVar2, this.f8220v, this.f8223y, this.f8224z, this.A, A());
    }

    @Override // v7.a0
    public void l(y yVar) {
        ((a8.k) yVar).A();
    }

    @Override // v7.a0
    public void n() {
        this.B.l();
    }

    @Override // b8.l.e
    public void r(b8.g gVar) {
        long a12 = gVar.f6228p ? r0.a1(gVar.f6220h) : -9223372036854775807L;
        int i10 = gVar.f6216d;
        long j10 = (i10 == 2 || i10 == 1) ? a12 : -9223372036854775807L;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((b8.h) t8.a.e(this.B.e()), gVar);
        D(this.B.j() ? F(gVar, j10, a12, aVar) : G(gVar, j10, a12, aVar));
    }
}
