package p406vl;

import dm.AbstractC7062f;
import dm.AbstractC7063g;
import dm.C7056b;
import dm.C7068l;
import dm.InterfaceC7078v;
import dm.InterfaceC7080x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10523b0;
import p319ql.AbstractC10527d0;
import p319ql.AbstractC10543r;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p428wl.C12245h;
import p428wl.InterfaceC12241d;

/* renamed from: vl.c */
/* loaded from: classes3.dex */
public final class C11976c {

    /* renamed from: a */
    private final C11978e f31750a;

    /* renamed from: b */
    private final AbstractC10543r f31751b;

    /* renamed from: c */
    private final C11977d f31752c;

    /* renamed from: d */
    private final InterfaceC12241d f31753d;

    /* renamed from: e */
    private boolean f31754e;

    /* renamed from: f */
    private boolean f31755f;

    /* renamed from: g */
    private final C11979f f31756g;

    /* renamed from: vl.c$a */
    /* loaded from: classes3.dex */
    private final class a extends AbstractC7062f {

        /* renamed from: b */
        private final long f31757b;

        /* renamed from: c */
        private boolean f31758c;

        /* renamed from: d */
        private long f31759d;

        /* renamed from: e */
        private boolean f31760e;

        /* renamed from: f */
        final /* synthetic */ C11976c f31761f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11976c this$0, InterfaceC7078v delegate, long j10) {
            super(delegate);
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(delegate, "delegate");
            this.f31761f = this$0;
            this.f31757b = j10;
        }

        /* renamed from: a */
        private final <E extends IOException> E m38419a(E e10) {
            if (this.f31758c) {
                return e10;
            }
            this.f31758c = true;
            return (E) this.f31761f.m38399a(this.f31759d, false, true, e10);
        }

        @Override // dm.AbstractC7062f, dm.InterfaceC7078v
        /* renamed from: K0 */
        public void mo19710K0(C7056b source, long j10) {
            C9322n.m27781e(source, "source");
            if (!(!this.f31760e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f31757b;
            if (j11 == -1 || this.f31759d + j10 <= j11) {
                try {
                    super.mo19710K0(source, j10);
                    this.f31759d += j10;
                    return;
                } catch (IOException e10) {
                    throw m38419a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f31757b + " bytes but received " + (this.f31759d + j10));
        }

        @Override // dm.AbstractC7062f, dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f31760e) {
                return;
            }
            this.f31760e = true;
            long j10 = this.f31757b;
            if (j10 != -1 && this.f31759d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m38419a(null);
            } catch (IOException e10) {
                throw m38419a(e10);
            }
        }

        @Override // dm.AbstractC7062f, dm.InterfaceC7078v, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m38419a(e10);
            }
        }
    }

    /* renamed from: vl.c$b */
    /* loaded from: classes3.dex */
    public final class b extends AbstractC7063g {

        /* renamed from: b */
        private final long f31762b;

        /* renamed from: c */
        private long f31763c;

        /* renamed from: d */
        private boolean f31764d;

        /* renamed from: e */
        private boolean f31765e;

        /* renamed from: f */
        private boolean f31766f;

        /* renamed from: r */
        final /* synthetic */ C11976c f31767r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11976c this$0, InterfaceC7080x delegate, long j10) {
            super(delegate);
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(delegate, "delegate");
            this.f31767r = this$0;
            this.f31762b = j10;
            this.f31764d = true;
            if (j10 == 0) {
                m38420b(null);
            }
        }

        /* renamed from: b */
        public final <E extends IOException> E m38420b(E e10) {
            if (this.f31765e) {
                return e10;
            }
            this.f31765e = true;
            if (e10 == null && this.f31764d) {
                this.f31764d = false;
                this.f31767r.m38407i().m31830v(this.f31767r.m38405g());
            }
            return (E) this.f31767r.m38399a(this.f31763c, true, false, e10);
        }

        @Override // dm.AbstractC7063g, dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f31766f) {
                return;
            }
            this.f31766f = true;
            try {
                super.close();
                m38420b(null);
            } catch (IOException e10) {
                throw m38420b(e10);
            }
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            if (!(!this.f31766f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long mo20686s1 = m20785a().mo20686s1(sink, j10);
                if (this.f31764d) {
                    this.f31764d = false;
                    this.f31767r.m38407i().m31830v(this.f31767r.m38405g());
                }
                if (mo20686s1 == -1) {
                    m38420b(null);
                    return -1L;
                }
                long j11 = this.f31763c + mo20686s1;
                long j12 = this.f31762b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f31762b + " bytes but received " + j11);
                }
                this.f31763c = j11;
                if (j11 == j12) {
                    m38420b(null);
                }
                return mo20686s1;
            } catch (IOException e10) {
                throw m38420b(e10);
            }
        }
    }

    public C11976c(C11978e call, AbstractC10543r eventListener, C11977d finder, InterfaceC12241d codec) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(eventListener, "eventListener");
        C9322n.m27781e(finder, "finder");
        C9322n.m27781e(codec, "codec");
        this.f31750a = call;
        this.f31751b = eventListener;
        this.f31752c = finder;
        this.f31753d = codec;
        this.f31756g = codec.mo39396b();
    }

    /* renamed from: t */
    private final void m38398t(IOException iOException) {
        this.f31755f = true;
        this.f31752c.m38428h(iOException);
        this.f31753d.mo39396b().m38475G(this.f31750a, iOException);
    }

    /* renamed from: a */
    public final <E extends IOException> E m38399a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            m38398t(e10);
        }
        if (z11) {
            AbstractC10543r abstractC10543r = this.f31751b;
            C11978e c11978e = this.f31750a;
            if (e10 != null) {
                abstractC10543r.m31826r(c11978e, e10);
            } else {
                abstractC10543r.m31824p(c11978e, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f31751b.m31831w(this.f31750a, e10);
            } else {
                this.f31751b.m31829u(this.f31750a, j10);
            }
        }
        return (E) this.f31750a.m38450u(this, z11, z10, e10);
    }

    /* renamed from: b */
    public final void m38400b() {
        this.f31753d.cancel();
    }

    /* renamed from: c */
    public final InterfaceC7078v m38401c(C10521a0 request, boolean z10) {
        C9322n.m27781e(request, "request");
        this.f31754e = z10;
        AbstractC10523b0 m31600a = request.m31600a();
        C9322n.m27778b(m31600a);
        long mo19705a = m31600a.mo19705a();
        this.f31751b.m31825q(this.f31750a);
        return new a(this, this.f31753d.mo39398d(request, mo19705a), mo19705a);
    }

    /* renamed from: d */
    public final void m38402d() {
        this.f31753d.cancel();
        this.f31750a.m38450u(this, true, true, null);
    }

    /* renamed from: e */
    public final void m38403e() {
        try {
            this.f31753d.mo39395a();
        } catch (IOException e10) {
            this.f31751b.m31826r(this.f31750a, e10);
            m38398t(e10);
            throw e10;
        }
    }

    /* renamed from: f */
    public final void m38404f() {
        try {
            this.f31753d.mo39400f();
        } catch (IOException e10) {
            this.f31751b.m31826r(this.f31750a, e10);
            m38398t(e10);
            throw e10;
        }
    }

    /* renamed from: g */
    public final C11978e m38405g() {
        return this.f31750a;
    }

    /* renamed from: h */
    public final C11979f m38406h() {
        return this.f31756g;
    }

    /* renamed from: i */
    public final AbstractC10543r m38407i() {
        return this.f31751b;
    }

    /* renamed from: j */
    public final C11977d m38408j() {
        return this.f31752c;
    }

    /* renamed from: k */
    public final boolean m38409k() {
        return this.f31755f;
    }

    /* renamed from: l */
    public final boolean m38410l() {
        return !C9322n.m27777a(this.f31752c.m38425d().m31599l().m31874h(), this.f31756g.m38493z().m31716a().m31599l().m31874h());
    }

    /* renamed from: m */
    public final boolean m38411m() {
        return this.f31754e;
    }

    /* renamed from: n */
    public final void m38412n() {
        this.f31753d.mo39396b().m38492y();
    }

    /* renamed from: o */
    public final void m38413o() {
        this.f31750a.m38450u(this, true, false, null);
    }

    /* renamed from: p */
    public final AbstractC10527d0 m38414p(C10525c0 response) {
        C9322n.m27781e(response, "response");
        try {
            String m31634n = C10525c0.m31634n(response, "Content-Type", null, 2, null);
            long mo39397c = this.f31753d.mo39397c(response);
            return new C12245h(m31634n, mo39397c, C7068l.m20803b(new b(this, this.f31753d.mo39402h(response), mo39397c)));
        } catch (IOException e10) {
            this.f31751b.m31831w(this.f31750a, e10);
            m38398t(e10);
            throw e10;
        }
    }

    /* renamed from: q */
    public final C10525c0.a m38415q(boolean z10) {
        try {
            C10525c0.a mo39399e = this.f31753d.mo39399e(z10);
            if (mo39399e != null) {
                mo39399e.m31671m(this);
            }
            return mo39399e;
        } catch (IOException e10) {
            this.f31751b.m31831w(this.f31750a, e10);
            m38398t(e10);
            throw e10;
        }
    }

    /* renamed from: r */
    public final void m38416r(C10525c0 response) {
        C9322n.m27781e(response, "response");
        this.f31751b.m31832x(this.f31750a, response);
    }

    /* renamed from: s */
    public final void m38417s() {
        this.f31751b.m31833y(this.f31750a);
    }

    /* renamed from: u */
    public final void m38418u(C10521a0 request) {
        C9322n.m27781e(request, "request");
        try {
            this.f31751b.m31828t(this.f31750a);
            this.f31753d.mo39401g(request);
            this.f31751b.m31827s(this.f31750a, request);
        } catch (IOException e10) {
            this.f31751b.m31826r(this.f31750a, e10);
            m38398t(e10);
            throw e10;
        }
    }
}
