package com.google.android.exoplayer2.source.rtsp;

import android.os.SystemClock;
import y6.z;

/* loaded from: classes.dex */
final class e implements y6.k {

    /* renamed from: a, reason: collision with root package name */
    private final d8.e f8322a;

    /* renamed from: d, reason: collision with root package name */
    private final int f8325d;

    /* renamed from: g, reason: collision with root package name */
    private y6.m f8328g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8329h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8332k;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f8323b = new t8.e0(65507);

    /* renamed from: c, reason: collision with root package name */
    private final t8.e0 f8324c = new t8.e0();

    /* renamed from: e, reason: collision with root package name */
    private final Object f8326e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final g f8327f = new g();

    /* renamed from: i, reason: collision with root package name */
    private volatile long f8330i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private volatile int f8331j = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f8333l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f8334m = -9223372036854775807L;

    public e(h hVar, int i10) {
        this.f8325d = i10;
        this.f8322a = (d8.e) t8.a.e(new d8.a().a(hVar));
    }

    private static long c(long j10) {
        return j10 - 30;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        synchronized (this.f8326e) {
            this.f8333l = j10;
            this.f8334m = j11;
        }
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f8322a.c(mVar, this.f8325d);
        mVar.q();
        mVar.p(new z.b(-9223372036854775807L));
        this.f8328g = mVar;
    }

    public boolean d() {
        return this.f8329h;
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // y6.k
    public int f(y6.l lVar, y6.y yVar) {
        t8.a.e(this.f8328g);
        int read = lVar.read(this.f8323b.e(), 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f8323b.U(0);
        this.f8323b.T(read);
        c8.a d10 = c8.a.d(this.f8323b);
        if (d10 == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long c10 = c(elapsedRealtime);
        this.f8327f.e(d10, elapsedRealtime);
        c8.a f10 = this.f8327f.f(c10);
        if (f10 == null) {
            return 0;
        }
        if (!this.f8329h) {
            if (this.f8330i == -9223372036854775807L) {
                this.f8330i = f10.f6910h;
            }
            if (this.f8331j == -1) {
                this.f8331j = f10.f6909g;
            }
            this.f8322a.d(this.f8330i, this.f8331j);
            this.f8329h = true;
        }
        synchronized (this.f8326e) {
            if (this.f8332k) {
                if (this.f8333l != -9223372036854775807L && this.f8334m != -9223372036854775807L) {
                    this.f8327f.g();
                    this.f8322a.a(this.f8333l, this.f8334m);
                    this.f8332k = false;
                    this.f8333l = -9223372036854775807L;
                    this.f8334m = -9223372036854775807L;
                }
            }
            do {
                this.f8324c.R(f10.f6913k);
                this.f8322a.b(this.f8324c, f10.f6910h, f10.f6909g, f10.f6907e);
                f10 = this.f8327f.f(c10);
            } while (f10 != null);
        }
        return 0;
    }

    public void g() {
        synchronized (this.f8326e) {
            this.f8332k = true;
        }
    }

    public void h(int i10) {
        this.f8331j = i10;
    }

    public void i(long j10) {
        this.f8330i = j10;
    }

    @Override // y6.k
    public void release() {
    }
}
