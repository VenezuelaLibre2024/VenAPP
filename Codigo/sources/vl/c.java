package vl;

import dm.l;
import dm.v;
import dm.x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.b0;
import ql.c0;
import ql.d0;
import ql.r;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private final e f29315a;

    /* renamed from: b */
    private final r f29316b;

    /* renamed from: c */
    private final d f29317c;

    /* renamed from: d */
    private final wl.d f29318d;

    /* renamed from: e */
    private boolean f29319e;

    /* renamed from: f */
    private boolean f29320f;

    /* renamed from: g */
    private final f f29321g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class a extends dm.f {

        /* renamed from: b */
        private final long f29322b;

        /* renamed from: c */
        private boolean f29323c;

        /* renamed from: d */
        private long f29324d;

        /* renamed from: e */
        private boolean f29325e;

        /* renamed from: f */
        final /* synthetic */ c f29326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c this$0, v delegate, long j10) {
            super(delegate);
            n.e(this$0, "this$0");
            n.e(delegate, "delegate");
            this.f29326f = this$0;
            this.f29322b = j10;
        }

        private final <E extends IOException> E a(E e10) {
            if (this.f29323c) {
                return e10;
            }
            this.f29323c = true;
            return (E) this.f29326f.a(this.f29324d, false, true, e10);
        }

        @Override // dm.f, dm.v
        public void K0(dm.b source, long j10) {
            n.e(source, "source");
            if (!(!this.f29325e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f29322b;
            if (j11 == -1 || this.f29324d + j10 <= j11) {
                try {
                    super.K0(source, j10);
                    this.f29324d += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f29322b + " bytes but received " + (this.f29324d + j10));
        }

        @Override // dm.f, dm.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f29325e) {
                return;
            }
            this.f29325e = true;
            long j10 = this.f29322b;
            if (j10 != -1 && this.f29324d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // dm.f, dm.v, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends dm.g {

        /* renamed from: b */
        private final long f29327b;

        /* renamed from: c */
        private long f29328c;

        /* renamed from: d */
        private boolean f29329d;

        /* renamed from: e */
        private boolean f29330e;

        /* renamed from: f */
        private boolean f29331f;

        /* renamed from: r */
        final /* synthetic */ c f29332r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c this$0, x delegate, long j10) {
            super(delegate);
            n.e(this$0, "this$0");
            n.e(delegate, "delegate");
            this.f29332r = this$0;
            this.f29327b = j10;
            this.f29329d = true;
            if (j10 == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e10) {
            if (this.f29330e) {
                return e10;
            }
            this.f29330e = true;
            if (e10 == null && this.f29329d) {
                this.f29329d = false;
                this.f29332r.i().v(this.f29332r.g());
            }
            return (E) this.f29332r.a(this.f29328c, true, false, e10);
        }

        @Override // dm.g, dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f29331f) {
                return;
            }
            this.f29331f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // dm.x
        public long s1(dm.b sink, long j10) {
            n.e(sink, "sink");
            if (!(!this.f29331f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long s12 = a().s1(sink, j10);
                if (this.f29329d) {
                    this.f29329d = false;
                    this.f29332r.i().v(this.f29332r.g());
                }
                if (s12 == -1) {
                    b(null);
                    return -1L;
                }
                long j11 = this.f29328c + s12;
                long j12 = this.f29327b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f29327b + " bytes but received " + j11);
                }
                this.f29328c = j11;
                if (j11 == j12) {
                    b(null);
                }
                return s12;
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, wl.d codec) {
        n.e(call, "call");
        n.e(eventListener, "eventListener");
        n.e(finder, "finder");
        n.e(codec, "codec");
        this.f29315a = call;
        this.f29316b = eventListener;
        this.f29317c = finder;
        this.f29318d = codec;
        this.f29321g = codec.b();
    }

    private final void t(IOException iOException) {
        this.f29320f = true;
        this.f29317c.h(iOException);
        this.f29318d.b().G(this.f29315a, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            t(e10);
        }
        if (z11) {
            r rVar = this.f29316b;
            e eVar = this.f29315a;
            if (e10 != null) {
                rVar.r(eVar, e10);
            } else {
                rVar.p(eVar, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f29316b.w(this.f29315a, e10);
            } else {
                this.f29316b.u(this.f29315a, j10);
            }
        }
        return (E) this.f29315a.u(this, z11, z10, e10);
    }

    public final void b() {
        this.f29318d.cancel();
    }

    public final v c(a0 request, boolean z10) {
        n.e(request, "request");
        this.f29319e = z10;
        b0 a10 = request.a();
        n.b(a10);
        long a11 = a10.a();
        this.f29316b.q(this.f29315a);
        return new a(this, this.f29318d.d(request, a11), a11);
    }

    public final void d() {
        this.f29318d.cancel();
        this.f29315a.u(this, true, true, null);
    }

    public final void e() {
        try {
            this.f29318d.a();
        } catch (IOException e10) {
            this.f29316b.r(this.f29315a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f29318d.f();
        } catch (IOException e10) {
            this.f29316b.r(this.f29315a, e10);
            t(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f29315a;
    }

    public final f h() {
        return this.f29321g;
    }

    public final r i() {
        return this.f29316b;
    }

    public final d j() {
        return this.f29317c;
    }

    public final boolean k() {
        return this.f29320f;
    }

    public final boolean l() {
        return !n.a(this.f29317c.d().l().h(), this.f29321g.z().a().l().h());
    }

    public final boolean m() {
        return this.f29319e;
    }

    public final void n() {
        this.f29318d.b().y();
    }

    public final void o() {
        this.f29315a.u(this, true, false, null);
    }

    public final d0 p(c0 response) {
        n.e(response, "response");
        try {
            String n10 = c0.n(response, "Content-Type", null, 2, null);
            long c10 = this.f29318d.c(response);
            return new wl.h(n10, c10, l.b(new b(this, this.f29318d.h(response), c10)));
        } catch (IOException e10) {
            this.f29316b.w(this.f29315a, e10);
            t(e10);
            throw e10;
        }
    }

    public final c0.a q(boolean z10) {
        try {
            c0.a e10 = this.f29318d.e(z10);
            if (e10 != null) {
                e10.m(this);
            }
            return e10;
        } catch (IOException e11) {
            this.f29316b.w(this.f29315a, e11);
            t(e11);
            throw e11;
        }
    }

    public final void r(c0 response) {
        n.e(response, "response");
        this.f29316b.x(this.f29315a, response);
    }

    public final void s() {
        this.f29316b.y(this.f29315a);
    }

    public final void u(a0 request) {
        n.e(request, "request");
        try {
            this.f29316b.t(this.f29315a);
            this.f29318d.g(request);
            this.f29316b.s(this.f29315a, request);
        } catch (IOException e10) {
            this.f29316b.r(this.f29315a, e10);
            t(e10);
            throw e10;
        }
    }
}
