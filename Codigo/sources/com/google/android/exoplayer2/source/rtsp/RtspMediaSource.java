package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.source.rtsp.n;
import java.io.IOException;
import javax.net.SocketFactory;
import s8.m0;
import t6.c2;
import t6.d4;
import t6.r1;
import t8.r0;
import v7.a0;
import v7.y0;

/* loaded from: classes.dex */
public final class RtspMediaSource extends v7.a {
    private boolean A;

    /* renamed from: s */
    private final c2 f8239s;

    /* renamed from: t */
    private final b.a f8240t;

    /* renamed from: u */
    private final String f8241u;

    /* renamed from: v */
    private final Uri f8242v;

    /* renamed from: w */
    private final SocketFactory f8243w;

    /* renamed from: x */
    private final boolean f8244x;

    /* renamed from: z */
    private boolean f8246z;

    /* renamed from: y */
    private long f8245y = -9223372036854775807L;
    private boolean B = true;

    /* loaded from: classes.dex */
    public static final class Factory implements a0.a {

        /* renamed from: a */
        private long f8247a = 8000;

        /* renamed from: b */
        private String f8248b = "ExoPlayerLib/2.17.1";

        /* renamed from: c */
        private SocketFactory f8249c = SocketFactory.getDefault();

        /* renamed from: d */
        private boolean f8250d;

        /* renamed from: e */
        private boolean f8251e;

        @Override // v7.a0.a
        /* renamed from: d */
        public RtspMediaSource a(c2 c2Var) {
            t8.a.e(c2Var.f25880b);
            return new RtspMediaSource(c2Var, this.f8250d ? new f0(this.f8247a) : new h0(this.f8247a), this.f8248b, this.f8249c, this.f8251e);
        }

        @Override // v7.a0.a
        /* renamed from: e */
        public Factory b(x6.x xVar) {
            return this;
        }

        @Override // v7.a0.a
        /* renamed from: f */
        public Factory c(s8.d0 d0Var) {
            return this;
        }
    }

    /* loaded from: classes.dex */
    class a implements n.c {
        a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.c
        public void a() {
            RtspMediaSource.this.f8246z = false;
            RtspMediaSource.this.K();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.n.c
        public void b(z zVar) {
            RtspMediaSource.this.f8245y = r0.C0(zVar.a());
            RtspMediaSource.this.f8246z = !zVar.c();
            RtspMediaSource.this.A = zVar.c();
            RtspMediaSource.this.B = false;
            RtspMediaSource.this.K();
        }
    }

    /* loaded from: classes.dex */
    public class b extends v7.s {
        b(RtspMediaSource rtspMediaSource, d4 d4Var) {
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
    public static final class c extends IOException {
        public c(String str) {
            super(str);
        }

        public c(String str, Throwable th2) {
            super(str, th2);
        }

        public c(Throwable th2) {
            super(th2);
        }
    }

    static {
        r1.a("goog.exo.rtsp");
    }

    RtspMediaSource(c2 c2Var, b.a aVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f8239s = c2Var;
        this.f8240t = aVar;
        this.f8241u = str;
        this.f8242v = ((c2.h) t8.a.e(c2Var.f25880b)).f25953a;
        this.f8243w = socketFactory;
        this.f8244x = z10;
    }

    public void K() {
        d4 y0Var = new y0(this.f8245y, this.f8246z, false, this.A, null, this.f8239s);
        if (this.B) {
            y0Var = new b(this, y0Var);
        }
        D(y0Var);
    }

    @Override // v7.a
    protected void C(m0 m0Var) {
        K();
    }

    @Override // v7.a
    protected void E() {
    }

    @Override // v7.a0
    public c2 d() {
        return this.f8239s;
    }

    @Override // v7.a0
    public v7.y e(a0.b bVar, s8.b bVar2, long j10) {
        return new n(bVar2, this.f8240t, this.f8242v, new a(), this.f8241u, this.f8243w, this.f8244x);
    }

    @Override // v7.a0
    public void l(v7.y yVar) {
        ((n) yVar).V();
    }

    @Override // v7.a0
    public void n() {
    }
}
