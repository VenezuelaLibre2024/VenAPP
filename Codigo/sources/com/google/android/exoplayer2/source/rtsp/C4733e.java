package com.google.android.exoplayer2.source.rtsp;

import android.os.SystemClock;
import p040c8.C1885a;
import p059d8.C6854a;
import p059d8.InterfaceC6858e;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* renamed from: com.google.android.exoplayer2.source.rtsp.e */
/* loaded from: classes.dex */
final class C4733e implements InterfaceC12621k {

    /* renamed from: a */
    private final InterfaceC6858e f9366a;

    /* renamed from: d */
    private final int f9369d;

    /* renamed from: g */
    private InterfaceC12623m f9372g;

    /* renamed from: h */
    private boolean f9373h;

    /* renamed from: k */
    private boolean f9376k;

    /* renamed from: b */
    private final C11146e0 f9367b = new C11146e0(65507);

    /* renamed from: c */
    private final C11146e0 f9368c = new C11146e0();

    /* renamed from: e */
    private final Object f9370e = new Object();

    /* renamed from: f */
    private final C4737g f9371f = new C4737g();

    /* renamed from: i */
    private volatile long f9374i = -9223372036854775807L;

    /* renamed from: j */
    private volatile int f9375j = -1;

    /* renamed from: l */
    private long f9377l = -9223372036854775807L;

    /* renamed from: m */
    private long f9378m = -9223372036854775807L;

    public C4733e(C4739h c4739h, int i10) {
        this.f9369d = i10;
        this.f9366a = (InterfaceC6858e) C11137a.m34603e(new C6854a().m19815a(c4739h));
    }

    /* renamed from: c */
    private static long m12039c(long j10) {
        return j10 - 30;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        synchronized (this.f9370e) {
            this.f9377l = j10;
            this.f9378m = j11;
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f9366a.mo19820c(interfaceC12623m, this.f9369d);
        interfaceC12623m.mo324q();
        interfaceC12623m.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
        this.f9372g = interfaceC12623m;
    }

    /* renamed from: d */
    public boolean m12040d() {
        return this.f9373h;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        C11137a.m34603e(this.f9372g);
        int read = interfaceC12622l.read(this.f9367b.m34682e(), 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f9367b.m34677U(0);
        this.f9367b.m34676T(read);
        C1885a m10012d = C1885a.m10012d(this.f9367b);
        if (m10012d == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long m12039c = m12039c(elapsedRealtime);
        this.f9371f.m12049e(m10012d, elapsedRealtime);
        C1885a m12050f = this.f9371f.m12050f(m12039c);
        if (m12050f == null) {
            return 0;
        }
        if (!this.f9373h) {
            if (this.f9374i == -9223372036854775807L) {
                this.f9374i = m12050f.f7859h;
            }
            if (this.f9375j == -1) {
                this.f9375j = m12050f.f7858g;
            }
            this.f9366a.mo19821d(this.f9374i, this.f9375j);
            this.f9373h = true;
        }
        synchronized (this.f9370e) {
            if (this.f9376k) {
                if (this.f9377l != -9223372036854775807L && this.f9378m != -9223372036854775807L) {
                    this.f9371f.m12051g();
                    this.f9366a.mo19818a(this.f9377l, this.f9378m);
                    this.f9376k = false;
                    this.f9377l = -9223372036854775807L;
                    this.f9378m = -9223372036854775807L;
                }
            }
            do {
                this.f9368c.m34674R(m12050f.f7862k);
                this.f9366a.mo19819b(this.f9368c, m12050f.f7859h, m12050f.f7858g, m12050f.f7856e);
                m12050f = this.f9371f.m12050f(m12039c);
            } while (m12050f != null);
        }
        return 0;
    }

    /* renamed from: g */
    public void m12041g() {
        synchronized (this.f9370e) {
            this.f9376k = true;
        }
    }

    /* renamed from: h */
    public void m12042h(int i10) {
        this.f9375j = i10;
    }

    /* renamed from: i */
    public void m12043i(long j10) {
        this.f9374i = j10;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
