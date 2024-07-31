package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import f8.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s8.d0;
import s8.e0;
import s8.f0;
import s8.g0;
import s8.j;
import s8.m0;
import t6.c2;
import t6.r1;
import t8.r0;
import v7.a0;
import v7.h0;
import v7.i;
import v7.u;
import v7.y;
import v7.y0;
import x6.l;
import x6.v;
import x6.x;

/* loaded from: classes.dex */
public final class SsMediaSource extends v7.a implements e0.b<g0<f8.a>> {
    private final d0 A;
    private final long B;
    private final h0.a C;
    private final g0.a<? extends f8.a> D;
    private final ArrayList<c> E;
    private j F;
    private e0 G;
    private f0 H;
    private m0 I;
    private long J;
    private f8.a K;
    private Handler L;

    /* renamed from: s */
    private final boolean f8471s;

    /* renamed from: t */
    private final Uri f8472t;

    /* renamed from: u */
    private final c2.h f8473u;

    /* renamed from: v */
    private final c2 f8474v;

    /* renamed from: w */
    private final j.a f8475w;

    /* renamed from: x */
    private final b.a f8476x;

    /* renamed from: y */
    private final i f8477y;

    /* renamed from: z */
    private final v f8478z;

    /* loaded from: classes.dex */
    public static final class Factory implements a0.a {

        /* renamed from: a */
        private final b.a f8479a;

        /* renamed from: b */
        private final j.a f8480b;

        /* renamed from: c */
        private i f8481c;

        /* renamed from: d */
        private x f8482d;

        /* renamed from: e */
        private d0 f8483e;

        /* renamed from: f */
        private long f8484f;

        /* renamed from: g */
        private g0.a<? extends f8.a> f8485g;

        public Factory(b.a aVar, j.a aVar2) {
            this.f8479a = (b.a) t8.a.e(aVar);
            this.f8480b = aVar2;
            this.f8482d = new l();
            this.f8483e = new s8.v();
            this.f8484f = 30000L;
            this.f8481c = new v7.j();
        }

        public Factory(j.a aVar) {
            this(new a.C0143a(aVar), aVar);
        }

        @Override // v7.a0.a
        /* renamed from: d */
        public SsMediaSource a(c2 c2Var) {
            t8.a.e(c2Var.f25880b);
            g0.a aVar = this.f8485g;
            if (aVar == null) {
                aVar = new f8.b();
            }
            List<u7.c> list = c2Var.f25880b.f25956d;
            return new SsMediaSource(c2Var, null, this.f8480b, !list.isEmpty() ? new u7.b(aVar, list) : aVar, this.f8479a, this.f8481c, this.f8482d.a(c2Var), this.f8483e, this.f8484f);
        }

        @Override // v7.a0.a
        /* renamed from: e */
        public Factory b(x xVar) {
            this.f8482d = (x) t8.a.f(xVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // v7.a0.a
        /* renamed from: f */
        public Factory c(d0 d0Var) {
            this.f8483e = (d0) t8.a.f(d0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    static {
        r1.a("goog.exo.smoothstreaming");
    }

    private SsMediaSource(c2 c2Var, f8.a aVar, j.a aVar2, g0.a<? extends f8.a> aVar3, b.a aVar4, i iVar, v vVar, d0 d0Var, long j10) {
        t8.a.g(aVar == null || !aVar.f15000d);
        this.f8474v = c2Var;
        c2.h hVar = (c2.h) t8.a.e(c2Var.f25880b);
        this.f8473u = hVar;
        this.K = aVar;
        this.f8472t = hVar.f25953a.equals(Uri.EMPTY) ? null : r0.B(hVar.f25953a);
        this.f8475w = aVar2;
        this.D = aVar3;
        this.f8476x = aVar4;
        this.f8477y = iVar;
        this.f8478z = vVar;
        this.A = d0Var;
        this.B = j10;
        this.C = w(null);
        this.f8471s = aVar != null;
        this.E = new ArrayList<>();
    }

    /* synthetic */ SsMediaSource(c2 c2Var, f8.a aVar, j.a aVar2, g0.a aVar3, b.a aVar4, i iVar, v vVar, d0 d0Var, long j10, a aVar5) {
        this(c2Var, aVar, aVar2, aVar3, aVar4, iVar, vVar, d0Var, j10);
    }

    private void J() {
        y0 y0Var;
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            this.E.get(i10).u(this.K);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.K.f15002f) {
            if (bVar.f15018k > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f15018k - 1) + bVar.c(bVar.f15018k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.K.f15000d ? -9223372036854775807L : 0L;
            f8.a aVar = this.K;
            boolean z10 = aVar.f15000d;
            y0Var = new y0(j12, 0L, 0L, 0L, true, z10, z10, aVar, this.f8474v);
        } else {
            f8.a aVar2 = this.K;
            if (aVar2.f15000d) {
                long j13 = aVar2.f15004h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long C0 = j15 - r0.C0(this.B);
                if (C0 < 5000000) {
                    C0 = Math.min(5000000L, j15 / 2);
                }
                y0Var = new y0(-9223372036854775807L, j15, j14, C0, true, true, true, this.K, this.f8474v);
            } else {
                long j16 = aVar2.f15003g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                y0Var = new y0(j11 + j17, j17, j11, 0L, true, false, false, this.K, this.f8474v);
            }
        }
        D(y0Var);
    }

    private void K() {
        if (this.K.f15000d) {
            this.L.postDelayed(new Runnable() { // from class: e8.a
                public /* synthetic */ a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.L();
                }
            }, Math.max(0L, (this.J + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public void L() {
        if (this.G.i()) {
            return;
        }
        g0 g0Var = new g0(this.F, this.f8472t, 4, this.D);
        this.C.z(new u(g0Var.f25248a, g0Var.f25249b, this.G.n(g0Var, this, this.A.a(g0Var.f25250c))), g0Var.f25250c);
    }

    @Override // v7.a
    protected void C(m0 m0Var) {
        this.I = m0Var;
        this.f8478z.b(Looper.myLooper(), A());
        this.f8478z.a();
        if (this.f8471s) {
            this.H = new f0.a();
            J();
            return;
        }
        this.F = this.f8475w.a();
        e0 e0Var = new e0("SsMediaSource");
        this.G = e0Var;
        this.H = e0Var;
        this.L = r0.w();
        L();
    }

    @Override // v7.a
    protected void E() {
        this.K = this.f8471s ? this.K : null;
        this.F = null;
        this.J = 0L;
        e0 e0Var = this.G;
        if (e0Var != null) {
            e0Var.l();
            this.G = null;
        }
        Handler handler = this.L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.f8478z.release();
    }

    @Override // s8.e0.b
    /* renamed from: G */
    public void i(g0<f8.a> g0Var, long j10, long j11, boolean z10) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        this.A.c(g0Var.f25248a);
        this.C.q(uVar, g0Var.f25250c);
    }

    @Override // s8.e0.b
    /* renamed from: H */
    public void m(g0<f8.a> g0Var, long j10, long j11) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        this.A.c(g0Var.f25248a);
        this.C.t(uVar, g0Var.f25250c);
        this.K = g0Var.e();
        this.J = j10 - j11;
        J();
        K();
    }

    @Override // s8.e0.b
    /* renamed from: I */
    public e0.c h(g0<f8.a> g0Var, long j10, long j11, IOException iOException, int i10) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        long d10 = this.A.d(new d0.c(uVar, new v7.x(g0Var.f25250c), iOException, i10));
        e0.c h10 = d10 == -9223372036854775807L ? e0.f25221g : e0.h(false, d10);
        boolean z10 = !h10.c();
        this.C.x(uVar, g0Var.f25250c, iOException, z10);
        if (z10) {
            this.A.c(g0Var.f25248a);
        }
        return h10;
    }

    @Override // v7.a0
    public c2 d() {
        return this.f8474v;
    }

    @Override // v7.a0
    public y e(a0.b bVar, s8.b bVar2, long j10) {
        h0.a w10 = w(bVar);
        c cVar = new c(this.K, this.f8476x, this.I, this.f8477y, this.f8478z, u(bVar), this.A, w10, this.H, bVar2);
        this.E.add(cVar);
        return cVar;
    }

    @Override // v7.a0
    public void l(y yVar) {
        ((c) yVar).q();
        this.E.remove(yVar);
    }

    @Override // v7.a0
    public void n() {
        this.H.a();
    }
}
