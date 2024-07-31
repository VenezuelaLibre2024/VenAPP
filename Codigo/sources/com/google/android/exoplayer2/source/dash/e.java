package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import s8.h;
import t6.b3;
import t6.u1;
import t6.v1;
import t8.e0;
import t8.r0;
import v7.u0;
import x7.f;
import y6.b0;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final s8.b f8200a;

    /* renamed from: b, reason: collision with root package name */
    private final b f8201b;

    /* renamed from: f, reason: collision with root package name */
    private z7.c f8205f;

    /* renamed from: r, reason: collision with root package name */
    private long f8206r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8207s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8208t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8209u;

    /* renamed from: e, reason: collision with root package name */
    private final TreeMap<Long, Long> f8204e = new TreeMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f8203d = r0.x(this);

    /* renamed from: c, reason: collision with root package name */
    private final n7.b f8202c = new n7.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f8210a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8211b;

        public a(long j10, long j11) {
            this.f8210a = j10;
            this.f8211b = j11;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(long j10);

        void b();
    }

    /* loaded from: classes.dex */
    public final class c implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final u0 f8212a;

        /* renamed from: b, reason: collision with root package name */
        private final v1 f8213b = new v1();

        /* renamed from: c, reason: collision with root package name */
        private final l7.d f8214c = new l7.d();

        /* renamed from: d, reason: collision with root package name */
        private long f8215d = -9223372036854775807L;

        c(s8.b bVar) {
            this.f8212a = u0.l(bVar);
        }

        private l7.d g() {
            this.f8214c.n();
            if (this.f8212a.S(this.f8213b, this.f8214c, 0, false) != -4) {
                return null;
            }
            this.f8214c.z();
            return this.f8214c;
        }

        private void k(long j10, long j11) {
            e.this.f8203d.sendMessage(e.this.f8203d.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f8212a.K(false)) {
                l7.d g10 = g();
                if (g10 != null) {
                    long j10 = g10.f29681e;
                    l7.a a10 = e.this.f8202c.a(g10);
                    if (a10 != null) {
                        n7.a aVar = (n7.a) a10.d(0);
                        if (e.h(aVar.f21828a, aVar.f21829b)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f8212a.s();
        }

        private void m(long j10, n7.a aVar) {
            long f10 = e.f(aVar);
            if (f10 == -9223372036854775807L) {
                return;
            }
            k(j10, f10);
        }

        @Override // y6.b0
        public void b(long j10, int i10, int i11, int i12, b0.a aVar) {
            this.f8212a.b(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // y6.b0
        public void c(u1 u1Var) {
            this.f8212a.c(u1Var);
        }

        @Override // y6.b0
        public void d(e0 e0Var, int i10, int i11) {
            this.f8212a.a(e0Var, i10);
        }

        @Override // y6.b0
        public int e(h hVar, int i10, boolean z10, int i11) {
            return this.f8212a.f(hVar, i10, z10);
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f8215d;
            if (j10 == -9223372036854775807L || fVar.f30608h > j10) {
                this.f8215d = fVar.f30608h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f8215d;
            return e.this.n(j10 != -9223372036854775807L && j10 < fVar.f30607g);
        }

        public void n() {
            this.f8212a.T();
        }
    }

    public e(z7.c cVar, b bVar, s8.b bVar2) {
        this.f8205f = cVar;
        this.f8201b = bVar;
        this.f8200a = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f8204e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(n7.a aVar) {
        try {
            return r0.J0(r0.D(aVar.f21832e));
        } catch (b3 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f8204e.get(Long.valueOf(j11));
        if (l10 != null && l10.longValue() <= j10) {
            return;
        }
        this.f8204e.put(Long.valueOf(j11), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f8207s) {
            this.f8208t = true;
            this.f8207s = false;
            this.f8201b.b();
        }
    }

    private void l() {
        this.f8201b.a(this.f8206r);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f8204e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f8205f.f32366h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f8209u) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f8210a, aVar.f8211b);
        return true;
    }

    boolean j(long j10) {
        z7.c cVar = this.f8205f;
        boolean z10 = false;
        if (!cVar.f32362d) {
            return false;
        }
        if (this.f8208t) {
            return true;
        }
        Map.Entry<Long, Long> e10 = e(cVar.f32366h);
        if (e10 != null && e10.getValue().longValue() < j10) {
            this.f8206r = e10.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f8200a);
    }

    void m(f fVar) {
        this.f8207s = true;
    }

    boolean n(boolean z10) {
        if (!this.f8205f.f32362d) {
            return false;
        }
        if (this.f8208t) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f8209u = true;
        this.f8203d.removeCallbacksAndMessages(null);
    }

    public void q(z7.c cVar) {
        this.f8208t = false;
        this.f8206r = -9223372036854775807L;
        this.f8205f = cVar;
        p();
    }
}
