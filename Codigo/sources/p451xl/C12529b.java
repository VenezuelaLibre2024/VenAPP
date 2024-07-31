package p451xl;

import com.google.android.gms.common.api.C5101a;
import dm.C7056b;
import dm.C7064h;
import dm.C7081y;
import dm.InterfaceC7058c;
import dm.InterfaceC7060d;
import dm.InterfaceC7078v;
import dm.InterfaceC7080x;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10545t;
import p319ql.C10546u;
import p319ql.C10550y;
import p341rl.C10727d;
import p406vl.C11979f;
import p428wl.C12242e;
import p428wl.C12246i;
import p428wl.C12248k;
import p428wl.InterfaceC12241d;
import p450xk.C12524p;

/* renamed from: xl.b */
/* loaded from: classes3.dex */
public final class C12529b implements InterfaceC12241d {

    /* renamed from: h */
    public static final d f33946h = new d(null);

    /* renamed from: a */
    private final C10550y f33947a;

    /* renamed from: b */
    private final C11979f f33948b;

    /* renamed from: c */
    private final InterfaceC7060d f33949c;

    /* renamed from: d */
    private final InterfaceC7058c f33950d;

    /* renamed from: e */
    private int f33951e;

    /* renamed from: f */
    private final C12528a f33952f;

    /* renamed from: g */
    private C10545t f33953g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$a */
    /* loaded from: classes3.dex */
    public abstract class a implements InterfaceC7080x {

        /* renamed from: a */
        private final C7064h f33954a;

        /* renamed from: b */
        private boolean f33955b;

        /* renamed from: c */
        final /* synthetic */ C12529b f33956c;

        public a(C12529b this$0) {
            C9322n.m27781e(this$0, "this$0");
            this.f33956c = this$0;
            this.f33954a = new C7064h(this$0.f33949c.mo20685m());
        }

        /* renamed from: a */
        protected final boolean m41131a() {
            return this.f33955b;
        }

        /* renamed from: b */
        public final void m41132b() {
            if (this.f33956c.f33951e == 6) {
                return;
            }
            if (this.f33956c.f33951e != 5) {
                throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(this.f33956c.f33951e)));
            }
            this.f33956c.m41121r(this.f33954a);
            this.f33956c.f33951e = 6;
        }

        /* renamed from: e */
        protected final void m41133e(boolean z10) {
            this.f33955b = z10;
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: m */
        public C7081y mo20685m() {
            return this.f33954a;
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            try {
                return this.f33956c.f33949c.mo20686s1(sink, j10);
            } catch (IOException e10) {
                this.f33956c.mo39396b().m38492y();
                m41132b();
                throw e10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$b */
    /* loaded from: classes3.dex */
    public final class b implements InterfaceC7078v {

        /* renamed from: a */
        private final C7064h f33957a;

        /* renamed from: b */
        private boolean f33958b;

        /* renamed from: c */
        final /* synthetic */ C12529b f33959c;

        public b(C12529b this$0) {
            C9322n.m27781e(this$0, "this$0");
            this.f33959c = this$0;
            this.f33957a = new C7064h(this$0.f33950d.mo20683m());
        }

        @Override // dm.InterfaceC7078v
        /* renamed from: K0 */
        public void mo19710K0(C7056b source, long j10) {
            C9322n.m27781e(source, "source");
            if (!(!this.f33958b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            this.f33959c.f33950d.mo20711Z0(j10);
            this.f33959c.f33950d.mo20705T("\r\n");
            this.f33959c.f33950d.mo19710K0(source, j10);
            this.f33959c.f33950d.mo20705T("\r\n");
        }

        @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f33958b) {
                return;
            }
            this.f33958b = true;
            this.f33959c.f33950d.mo20705T("0\r\n\r\n");
            this.f33959c.m41121r(this.f33957a);
            this.f33959c.f33951e = 3;
        }

        @Override // dm.InterfaceC7078v, java.io.Flushable
        public synchronized void flush() {
            if (this.f33958b) {
                return;
            }
            this.f33959c.f33950d.flush();
        }

        @Override // dm.InterfaceC7078v
        /* renamed from: m */
        public C7081y mo20683m() {
            return this.f33957a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$c */
    /* loaded from: classes3.dex */
    public final class c extends a {

        /* renamed from: d */
        private final C10546u f33960d;

        /* renamed from: e */
        private long f33961e;

        /* renamed from: f */
        private boolean f33962f;

        /* renamed from: r */
        final /* synthetic */ C12529b f33963r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12529b this$0, C10546u url) {
            super(this$0);
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(url, "url");
            this.f33963r = this$0;
            this.f33960d = url;
            this.f33961e = -1L;
            this.f33962f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        
            if (r1 != false) goto L14;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m41134f() {
            /*
                r7 = this;
                long r0 = r7.f33961e
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                xl.b r0 = r7.f33963r
                dm.d r0 = p451xl.C12529b.m41116m(r0)
                r0.mo20719d0()
            L11:
                xl.b r0 = r7.f33963r     // Catch: java.lang.NumberFormatException -> La2
                dm.d r0 = p451xl.C12529b.m41116m(r0)     // Catch: java.lang.NumberFormatException -> La2
                long r0 = r0.mo20737t1()     // Catch: java.lang.NumberFormatException -> La2
                r7.f33961e = r0     // Catch: java.lang.NumberFormatException -> La2
                xl.b r0 = r7.f33963r     // Catch: java.lang.NumberFormatException -> La2
                dm.d r0 = p451xl.C12529b.m41116m(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.mo20719d0()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.CharSequence r0 = p450xk.C12515g.m40985K0(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> La2
                long r1 = r7.f33961e     // Catch: java.lang.NumberFormatException -> La2
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> La2
                r2 = 0
                if (r1 <= 0) goto L40
                r1 = 1
                goto L41
            L40:
                r1 = r2
            L41:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = p450xk.C12515g.m40978E(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> La2
                if (r1 == 0) goto L81
            L4d:
                long r0 = r7.f33961e
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L80
                r7.f33962f = r2
                xl.b r0 = r7.f33963r
                xl.a r1 = p451xl.C12529b.m41114k(r0)
                ql.t r1 = r1.m41110a()
                p451xl.C12529b.m41120q(r0, r1)
                xl.b r0 = r7.f33963r
                ql.y r0 = p451xl.C12529b.m41113j(r0)
                kotlin.jvm.internal.C9322n.m27778b(r0)
                ql.n r0 = r0.m31981k()
                ql.u r1 = r7.f33960d
                xl.b r2 = r7.f33963r
                ql.t r2 = p451xl.C12529b.m41118o(r2)
                kotlin.jvm.internal.C9322n.m27778b(r2)
                p428wl.C12242e.m39408f(r0, r1, r2)
                r7.m41132b()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La2
                r2.<init>()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                long r3 = r7.f33961e     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La2
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> La2
                throw r1     // Catch: java.lang.NumberFormatException -> La2
            La2:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p451xl.C12529b.c.m41134f():void");
        }

        @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m41131a()) {
                return;
            }
            if (this.f33962f && !C10727d.m32659s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f33963r.mo39396b().m38492y();
                m41132b();
            }
            m41133e(true);
        }

        @Override // p451xl.C12529b.a, dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C9322n.m27787k("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!m41131a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f33962f) {
                return -1L;
            }
            long j11 = this.f33961e;
            if (j11 == 0 || j11 == -1) {
                m41134f();
                if (!this.f33962f) {
                    return -1L;
                }
            }
            long mo20686s1 = super.mo20686s1(sink, Math.min(j10, this.f33961e));
            if (mo20686s1 != -1) {
                this.f33961e -= mo20686s1;
                return mo20686s1;
            }
            this.f33963r.mo39396b().m38492y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m41132b();
            throw protocolException;
        }
    }

    /* renamed from: xl.b$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$e */
    /* loaded from: classes3.dex */
    public final class e extends a {

        /* renamed from: d */
        private long f33964d;

        /* renamed from: e */
        final /* synthetic */ C12529b f33965e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C12529b this$0, long j10) {
            super(this$0);
            C9322n.m27781e(this$0, "this$0");
            this.f33965e = this$0;
            this.f33964d = j10;
            if (j10 == 0) {
                m41132b();
            }
        }

        @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m41131a()) {
                return;
            }
            if (this.f33964d != 0 && !C10727d.m32659s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f33965e.mo39396b().m38492y();
                m41132b();
            }
            m41133e(true);
        }

        @Override // p451xl.C12529b.a, dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C9322n.m27787k("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!m41131a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f33964d;
            if (j11 == 0) {
                return -1L;
            }
            long mo20686s1 = super.mo20686s1(sink, Math.min(j11, j10));
            if (mo20686s1 == -1) {
                this.f33965e.mo39396b().m38492y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m41132b();
                throw protocolException;
            }
            long j12 = this.f33964d - mo20686s1;
            this.f33964d = j12;
            if (j12 == 0) {
                m41132b();
            }
            return mo20686s1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$f */
    /* loaded from: classes3.dex */
    public final class f implements InterfaceC7078v {

        /* renamed from: a */
        private final C7064h f33966a;

        /* renamed from: b */
        private boolean f33967b;

        /* renamed from: c */
        final /* synthetic */ C12529b f33968c;

        public f(C12529b this$0) {
            C9322n.m27781e(this$0, "this$0");
            this.f33968c = this$0;
            this.f33966a = new C7064h(this$0.f33950d.mo20683m());
        }

        @Override // dm.InterfaceC7078v
        /* renamed from: K0 */
        public void mo19710K0(C7056b source, long j10) {
            C9322n.m27781e(source, "source");
            if (!(!this.f33967b)) {
                throw new IllegalStateException("closed".toString());
            }
            C10727d.m32652l(source.size(), 0L, j10);
            this.f33968c.f33950d.mo19710K0(source, j10);
        }

        @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f33967b) {
                return;
            }
            this.f33967b = true;
            this.f33968c.m41121r(this.f33966a);
            this.f33968c.f33951e = 3;
        }

        @Override // dm.InterfaceC7078v, java.io.Flushable
        public void flush() {
            if (this.f33967b) {
                return;
            }
            this.f33968c.f33950d.flush();
        }

        @Override // dm.InterfaceC7078v
        /* renamed from: m */
        public C7081y mo20683m() {
            return this.f33966a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$g */
    /* loaded from: classes3.dex */
    public final class g extends a {

        /* renamed from: d */
        private boolean f33969d;

        /* renamed from: e */
        final /* synthetic */ C12529b f33970e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C12529b this$0) {
            super(this$0);
            C9322n.m27781e(this$0, "this$0");
            this.f33970e = this$0;
        }

        @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m41131a()) {
                return;
            }
            if (!this.f33969d) {
                m41132b();
            }
            m41133e(true);
        }

        @Override // p451xl.C12529b.a, dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C9322n.m27787k("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!m41131a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f33969d) {
                return -1L;
            }
            long mo20686s1 = super.mo20686s1(sink, j10);
            if (mo20686s1 != -1) {
                return mo20686s1;
            }
            this.f33969d = true;
            m41132b();
            return -1L;
        }
    }

    public C12529b(C10550y c10550y, C11979f connection, InterfaceC7060d source, InterfaceC7058c sink) {
        C9322n.m27781e(connection, "connection");
        C9322n.m27781e(source, "source");
        C9322n.m27781e(sink, "sink");
        this.f33947a = c10550y;
        this.f33948b = connection;
        this.f33949c = source;
        this.f33950d = sink;
        this.f33952f = new C12528a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m41121r(C7064h c7064h) {
        C7081y m20793i = c7064h.m20793i();
        c7064h.m20794j(C7081y.f15697e);
        m20793i.mo20786a();
        m20793i.mo20787b();
    }

    /* renamed from: s */
    private final boolean m41122s(C10521a0 c10521a0) {
        boolean m41037r;
        m41037r = C12524p.m41037r("chunked", c10521a0.m31603d("Transfer-Encoding"), true);
        return m41037r;
    }

    /* renamed from: t */
    private final boolean m41123t(C10525c0 c10525c0) {
        boolean m41037r;
        m41037r = C12524p.m41037r("chunked", C10525c0.m31634n(c10525c0, "Transfer-Encoding", null, 2, null), true);
        return m41037r;
    }

    /* renamed from: u */
    private final InterfaceC7078v m41124u() {
        int i10 = this.f33951e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f33951e = 2;
        return new b(this);
    }

    /* renamed from: v */
    private final InterfaceC7080x m41125v(C10546u c10546u) {
        int i10 = this.f33951e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f33951e = 5;
        return new c(this, c10546u);
    }

    /* renamed from: w */
    private final InterfaceC7080x m41126w(long j10) {
        int i10 = this.f33951e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f33951e = 5;
        return new e(this, j10);
    }

    /* renamed from: x */
    private final InterfaceC7078v m41127x() {
        int i10 = this.f33951e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f33951e = 2;
        return new f(this);
    }

    /* renamed from: y */
    private final InterfaceC7080x m41128y() {
        int i10 = this.f33951e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f33951e = 5;
        mo39396b().m38492y();
        return new g(this);
    }

    /* renamed from: A */
    public final void m41129A(C10545t headers, String requestLine) {
        C9322n.m27781e(headers, "headers");
        C9322n.m27781e(requestLine, "requestLine");
        int i10 = this.f33951e;
        if (!(i10 == 0)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f33950d.mo20705T(requestLine).mo20705T("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f33950d.mo20705T(headers.m31846d(i11)).mo20705T(": ").mo20705T(headers.m31849l(i11)).mo20705T("\r\n");
        }
        this.f33950d.mo20705T("\r\n");
        this.f33951e = 1;
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: a */
    public void mo39395a() {
        this.f33950d.flush();
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: b */
    public C11979f mo39396b() {
        return this.f33948b;
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: c */
    public long mo39397c(C10525c0 response) {
        C9322n.m27781e(response, "response");
        if (!C12242e.m39404b(response)) {
            return 0L;
        }
        if (m41123t(response)) {
            return -1L;
        }
        return C10727d.m32662v(response);
    }

    @Override // p428wl.InterfaceC12241d
    public void cancel() {
        mo39396b().m38478d();
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: d */
    public InterfaceC7078v mo39398d(C10521a0 request, long j10) {
        C9322n.m27781e(request, "request");
        if (request.m31600a() != null && request.m31600a().m31627d()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m41122s(request)) {
            return m41124u();
        }
        if (j10 != -1) {
            return m41127x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: e */
    public C10525c0.a mo39399e(boolean z10) {
        int i10 = this.f33951e;
        boolean z11 = false;
        if (!(i10 == 1 || i10 == 2 || i10 == 3)) {
            throw new IllegalStateException(C9322n.m27787k("state: ", Integer.valueOf(i10)).toString());
        }
        try {
            C12248k m39433a = C12248k.f32733d.m39433a(this.f33952f.m41111b());
            C10525c0.a m31670l = new C10525c0.a().m31675q(m39433a.f32734a).m31665g(m39433a.f32735b).m31672n(m39433a.f32736c).m31670l(this.f33952f.m41110a());
            if (z10 && m39433a.f32735b == 100) {
                return null;
            }
            int i11 = m39433a.f32735b;
            if (i11 != 100) {
                if (102 <= i11 && i11 < 200) {
                    z11 = true;
                }
                if (!z11) {
                    this.f33951e = 4;
                    return m31670l;
                }
            }
            this.f33951e = 3;
            return m31670l;
        } catch (EOFException e10) {
            throw new IOException(C9322n.m27787k("unexpected end of stream on ", mo39396b().m38493z().m31716a().m31599l().m31880o()), e10);
        }
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: f */
    public void mo39400f() {
        this.f33950d.flush();
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: g */
    public void mo39401g(C10521a0 request) {
        C9322n.m27781e(request, "request");
        C12246i c12246i = C12246i.f32730a;
        Proxy.Type type = mo39396b().m38493z().m31717b().type();
        C9322n.m27780d(type, "connection.route().proxy.type()");
        m41129A(request.m31604e(), c12246i.m39425a(request, type));
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: h */
    public InterfaceC7080x mo39402h(C10525c0 response) {
        long m32662v;
        C9322n.m27781e(response, "response");
        if (!C12242e.m39404b(response)) {
            m32662v = 0;
        } else {
            if (m41123t(response)) {
                return m41125v(response.m31639O().m31608i());
            }
            m32662v = C10727d.m32662v(response);
            if (m32662v == -1) {
                return m41128y();
            }
        }
        return m41126w(m32662v);
    }

    /* renamed from: z */
    public final void m41130z(C10525c0 response) {
        C9322n.m27781e(response, "response");
        long m32662v = C10727d.m32662v(response);
        if (m32662v == -1) {
            return;
        }
        InterfaceC7080x m41126w = m41126w(m32662v);
        C10727d.m32626L(m41126w, C5101a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        m41126w.close();
    }
}
