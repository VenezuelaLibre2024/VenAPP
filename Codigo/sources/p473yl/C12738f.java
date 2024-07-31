package p473yl;

import ck.C2037v;
import dm.C7056b;
import dm.C7061e;
import dm.InterfaceC7058c;
import dm.InterfaceC7060d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9331w;
import kotlin.jvm.internal.C9332x;
import p280ok.InterfaceC9987a;
import p341rl.C10727d;
import p388ul.AbstractC11586a;
import p388ul.C11588c;
import p388ul.C11589d;
import p388ul.C11590e;
import p473yl.C12740h;
import p495zl.C13148j;

/* renamed from: yl.f */
/* loaded from: classes3.dex */
public final class C12738f implements Closeable {

    /* renamed from: N */
    public static final b f34590N = new b(null);

    /* renamed from: O */
    private static final C12745m f34591O;

    /* renamed from: A */
    private long f34592A;

    /* renamed from: B */
    private long f34593B;

    /* renamed from: C */
    private long f34594C;

    /* renamed from: D */
    private final C12745m f34595D;

    /* renamed from: E */
    private C12745m f34596E;

    /* renamed from: F */
    private long f34597F;

    /* renamed from: G */
    private long f34598G;

    /* renamed from: H */
    private long f34599H;

    /* renamed from: I */
    private long f34600I;

    /* renamed from: J */
    private final Socket f34601J;

    /* renamed from: K */
    private final C12742j f34602K;

    /* renamed from: L */
    private final d f34603L;

    /* renamed from: M */
    private final Set<Integer> f34604M;

    /* renamed from: a */
    private final boolean f34605a;

    /* renamed from: b */
    private final c f34606b;

    /* renamed from: c */
    private final Map<Integer, C12741i> f34607c;

    /* renamed from: d */
    private final String f34608d;

    /* renamed from: e */
    private int f34609e;

    /* renamed from: f */
    private int f34610f;

    /* renamed from: r */
    private boolean f34611r;

    /* renamed from: s */
    private final C11590e f34612s;

    /* renamed from: t */
    private final C11589d f34613t;

    /* renamed from: u */
    private final C11589d f34614u;

    /* renamed from: v */
    private final C11589d f34615v;

    /* renamed from: w */
    private final InterfaceC12744l f34616w;

    /* renamed from: x */
    private long f34617x;

    /* renamed from: y */
    private long f34618y;

    /* renamed from: z */
    private long f34619z;

    /* renamed from: yl.f$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f34620a;

        /* renamed from: b */
        private final C11590e f34621b;

        /* renamed from: c */
        public Socket f34622c;

        /* renamed from: d */
        public String f34623d;

        /* renamed from: e */
        public InterfaceC7060d f34624e;

        /* renamed from: f */
        public InterfaceC7058c f34625f;

        /* renamed from: g */
        private c f34626g;

        /* renamed from: h */
        private InterfaceC12744l f34627h;

        /* renamed from: i */
        private int f34628i;

        public a(boolean z10, C11590e taskRunner) {
            C9322n.m27781e(taskRunner, "taskRunner");
            this.f34620a = z10;
            this.f34621b = taskRunner;
            this.f34626g = c.f34630b;
            this.f34627h = InterfaceC12744l.f34755b;
        }

        /* renamed from: a */
        public final C12738f m42140a() {
            return new C12738f(this);
        }

        /* renamed from: b */
        public final boolean m42141b() {
            return this.f34620a;
        }

        /* renamed from: c */
        public final String m42142c() {
            String str = this.f34623d;
            if (str != null) {
                return str;
            }
            C9322n.m27792p("connectionName");
            return null;
        }

        /* renamed from: d */
        public final c m42143d() {
            return this.f34626g;
        }

        /* renamed from: e */
        public final int m42144e() {
            return this.f34628i;
        }

        /* renamed from: f */
        public final InterfaceC12744l m42145f() {
            return this.f34627h;
        }

        /* renamed from: g */
        public final InterfaceC7058c m42146g() {
            InterfaceC7058c interfaceC7058c = this.f34625f;
            if (interfaceC7058c != null) {
                return interfaceC7058c;
            }
            C9322n.m27792p("sink");
            return null;
        }

        /* renamed from: h */
        public final Socket m42147h() {
            Socket socket = this.f34622c;
            if (socket != null) {
                return socket;
            }
            C9322n.m27792p("socket");
            return null;
        }

        /* renamed from: i */
        public final InterfaceC7060d m42148i() {
            InterfaceC7060d interfaceC7060d = this.f34624e;
            if (interfaceC7060d != null) {
                return interfaceC7060d;
            }
            C9322n.m27792p("source");
            return null;
        }

        /* renamed from: j */
        public final C11590e m42149j() {
            return this.f34621b;
        }

        /* renamed from: k */
        public final a m42150k(c listener) {
            C9322n.m27781e(listener, "listener");
            m42153n(listener);
            return this;
        }

        /* renamed from: l */
        public final a m42151l(int i10) {
            m42154o(i10);
            return this;
        }

        /* renamed from: m */
        public final void m42152m(String str) {
            C9322n.m27781e(str, "<set-?>");
            this.f34623d = str;
        }

        /* renamed from: n */
        public final void m42153n(c cVar) {
            C9322n.m27781e(cVar, "<set-?>");
            this.f34626g = cVar;
        }

        /* renamed from: o */
        public final void m42154o(int i10) {
            this.f34628i = i10;
        }

        /* renamed from: p */
        public final void m42155p(InterfaceC7058c interfaceC7058c) {
            C9322n.m27781e(interfaceC7058c, "<set-?>");
            this.f34625f = interfaceC7058c;
        }

        /* renamed from: q */
        public final void m42156q(Socket socket) {
            C9322n.m27781e(socket, "<set-?>");
            this.f34622c = socket;
        }

        /* renamed from: r */
        public final void m42157r(InterfaceC7060d interfaceC7060d) {
            C9322n.m27781e(interfaceC7060d, "<set-?>");
            this.f34624e = interfaceC7060d;
        }

        /* renamed from: s */
        public final a m42158s(Socket socket, String peerName, InterfaceC7060d source, InterfaceC7058c sink) {
            String m27787k;
            C9322n.m27781e(socket, "socket");
            C9322n.m27781e(peerName, "peerName");
            C9322n.m27781e(source, "source");
            C9322n.m27781e(sink, "sink");
            m42156q(socket);
            if (m42141b()) {
                m27787k = C10727d.f27166i + ' ' + peerName;
            } else {
                m27787k = C9322n.m27787k("MockWebServer ", peerName);
            }
            m42152m(m27787k);
            m42157r(source);
            m42155p(sink);
            return this;
        }
    }

    /* renamed from: yl.f$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C12745m m42159a() {
            return C12738f.f34591O;
        }
    }

    /* renamed from: yl.f$c */
    /* loaded from: classes3.dex */
    public static abstract class c {

        /* renamed from: a */
        public static final b f34629a = new b(null);

        /* renamed from: b */
        public static final c f34630b = new a();

        /* renamed from: yl.f$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends c {
            a() {
            }

            @Override // p473yl.C12738f.c
            /* renamed from: b */
            public void mo38477b(C12741i stream) {
                C9322n.m27781e(stream, "stream");
                stream.m42210d(EnumC12734b.REFUSED_STREAM, null);
            }
        }

        /* renamed from: yl.f$c$b */
        /* loaded from: classes3.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(C9315g c9315g) {
                this();
            }
        }

        /* renamed from: a */
        public void mo38476a(C12738f connection, C12745m settings) {
            C9322n.m27781e(connection, "connection");
            C9322n.m27781e(settings, "settings");
        }

        /* renamed from: b */
        public abstract void mo38477b(C12741i c12741i);
    }

    /* renamed from: yl.f$d */
    /* loaded from: classes3.dex */
    public final class d implements C12740h.c, InterfaceC9987a<C2037v> {

        /* renamed from: a */
        private final C12740h f34631a;

        /* renamed from: b */
        final /* synthetic */ C12738f f34632b;

        /* renamed from: yl.f$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC11586a {

            /* renamed from: e */
            final /* synthetic */ String f34633e;

            /* renamed from: f */
            final /* synthetic */ boolean f34634f;

            /* renamed from: g */
            final /* synthetic */ C12738f f34635g;

            /* renamed from: h */
            final /* synthetic */ C9332x f34636h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, C12738f c12738f, C9332x c9332x) {
                super(str, z10);
                this.f34633e = str;
                this.f34634f = z10;
                this.f34635g = c12738f;
                this.f34636h = c9332x;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p388ul.AbstractC11586a
            /* renamed from: f */
            public long mo36308f() {
                this.f34635g.m42125c0().mo38476a(this.f34635g, (C12745m) this.f34636h.f22581a);
                return -1L;
            }
        }

        /* renamed from: yl.f$d$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC11586a {

            /* renamed from: e */
            final /* synthetic */ String f34637e;

            /* renamed from: f */
            final /* synthetic */ boolean f34638f;

            /* renamed from: g */
            final /* synthetic */ C12738f f34639g;

            /* renamed from: h */
            final /* synthetic */ C12741i f34640h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, C12738f c12738f, C12741i c12741i) {
                super(str, z10);
                this.f34637e = str;
                this.f34638f = z10;
                this.f34639g = c12738f;
                this.f34640h = c12741i;
            }

            @Override // p388ul.AbstractC11586a
            /* renamed from: f */
            public long mo36308f() {
                try {
                    this.f34639g.m42125c0().mo38477b(this.f34640h);
                    return -1L;
                } catch (IOException e10) {
                    C13148j.f35535a.m43385g().m43375j(C9322n.m27787k("Http2Connection.Listener failure for ", this.f34639g.m42119U()), 4, e10);
                    try {
                        this.f34640h.m42210d(EnumC12734b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: yl.f$d$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC11586a {

            /* renamed from: e */
            final /* synthetic */ String f34641e;

            /* renamed from: f */
            final /* synthetic */ boolean f34642f;

            /* renamed from: g */
            final /* synthetic */ C12738f f34643g;

            /* renamed from: h */
            final /* synthetic */ int f34644h;

            /* renamed from: i */
            final /* synthetic */ int f34645i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, C12738f c12738f, int i10, int i11) {
                super(str, z10);
                this.f34641e = str;
                this.f34642f = z10;
                this.f34643g = c12738f;
                this.f34644h = i10;
                this.f34645i = i11;
            }

            @Override // p388ul.AbstractC11586a
            /* renamed from: f */
            public long mo36308f() {
                this.f34643g.m42105A1(true, this.f34644h, this.f34645i);
                return -1L;
            }
        }

        /* renamed from: yl.f$d$d */
        /* loaded from: classes3.dex */
        public static final class C13290d extends AbstractC11586a {

            /* renamed from: e */
            final /* synthetic */ String f34646e;

            /* renamed from: f */
            final /* synthetic */ boolean f34647f;

            /* renamed from: g */
            final /* synthetic */ d f34648g;

            /* renamed from: h */
            final /* synthetic */ boolean f34649h;

            /* renamed from: i */
            final /* synthetic */ C12745m f34650i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13290d(String str, boolean z10, d dVar, boolean z11, C12745m c12745m) {
                super(str, z10);
                this.f34646e = str;
                this.f34647f = z10;
                this.f34648g = dVar;
                this.f34649h = z11;
                this.f34650i = c12745m;
            }

            @Override // p388ul.AbstractC11586a
            /* renamed from: f */
            public long mo36308f() {
                this.f34648g.m42170o(this.f34649h, this.f34650i);
                return -1L;
            }
        }

        public d(C12738f this$0, C12740h reader) {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(reader, "reader");
            this.f34632b = this$0;
            this.f34631a = reader;
        }

        @Override // p473yl.C12740h.c
        /* renamed from: a */
        public void mo42160a(boolean z10, int i10, int i11, List<C12735c> headerBlock) {
            C9322n.m27781e(headerBlock, "headerBlock");
            if (this.f34632b.m42121Y0(i10)) {
                this.f34632b.m42116R0(i10, headerBlock, z10);
                return;
            }
            C12738f c12738f = this.f34632b;
            synchronized (c12738f) {
                C12741i m42134v0 = c12738f.m42134v0(i10);
                if (m42134v0 != null) {
                    C2037v c2037v = C2037v.f8089a;
                    m42134v0.m42229x(C10727d.m32630P(headerBlock), z10);
                    return;
                }
                if (c12738f.f34611r) {
                    return;
                }
                if (i10 <= c12738f.m42122a0()) {
                    return;
                }
                if (i10 % 2 == c12738f.m42127h0() % 2) {
                    return;
                }
                C12741i c12741i = new C12741i(i10, c12738f, false, z10, C10727d.m32630P(headerBlock));
                c12738f.m42126c1(i10);
                c12738f.m42138z0().put(Integer.valueOf(i10), c12741i);
                c12738f.f34612s.m36337i().m36322i(new b(c12738f.m42119U() + '[' + i10 + "] onStream", true, c12738f, c12741i), 0L);
            }
        }

        @Override // p473yl.C12740h.c
        /* renamed from: c */
        public void mo42161c(int i10, EnumC12734b errorCode) {
            C9322n.m27781e(errorCode, "errorCode");
            if (this.f34632b.m42121Y0(i10)) {
                this.f34632b.m42120W0(i10, errorCode);
                return;
            }
            C12741i m42123a1 = this.f34632b.m42123a1(i10);
            if (m42123a1 == null) {
                return;
            }
            m42123a1.m42230y(errorCode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p473yl.C12740h.c
        /* renamed from: d */
        public void mo42162d(int i10, long j10) {
            C12741i c12741i;
            if (i10 == 0) {
                C12738f c12738f = this.f34632b;
                synchronized (c12738f) {
                    c12738f.f34600I = c12738f.m42106B0() + j10;
                    c12738f.notifyAll();
                    C2037v c2037v = C2037v.f8089a;
                    c12741i = c12738f;
                }
            } else {
                C12741i m42134v0 = this.f34632b.m42134v0(i10);
                if (m42134v0 == null) {
                    return;
                }
                synchronized (m42134v0) {
                    m42134v0.m42207a(j10);
                    C2037v c2037v2 = C2037v.f8089a;
                    c12741i = m42134v0;
                }
            }
        }

        @Override // p473yl.C12740h.c
        /* renamed from: f */
        public void mo42163f(boolean z10, C12745m settings) {
            C9322n.m27781e(settings, "settings");
            this.f34632b.f34613t.m36322i(new C13290d(C9322n.m27787k(this.f34632b.m42119U(), " applyAndAckSettings"), true, this, z10, settings), 0L);
        }

        @Override // p473yl.C12740h.c
        /* renamed from: g */
        public void mo42164g(int i10, EnumC12734b errorCode, C7061e debugData) {
            int i11;
            Object[] array;
            C9322n.m27781e(errorCode, "errorCode");
            C9322n.m27781e(debugData, "debugData");
            debugData.m20756B();
            C12738f c12738f = this.f34632b;
            synchronized (c12738f) {
                i11 = 0;
                array = c12738f.m42138z0().values().toArray(new C12741i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                c12738f.f34611r = true;
                C2037v c2037v = C2037v.f8089a;
            }
            C12741i[] c12741iArr = (C12741i[]) array;
            int length = c12741iArr.length;
            while (i11 < length) {
                C12741i c12741i = c12741iArr[i11];
                i11++;
                if (c12741i.m42215j() > i10 && c12741i.m42225t()) {
                    c12741i.m42230y(EnumC12734b.REFUSED_STREAM);
                    this.f34632b.m42123a1(c12741i.m42215j());
                }
            }
        }

        @Override // p473yl.C12740h.c
        /* renamed from: h */
        public void mo42165h(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f34632b.f34613t.m36322i(new c(C9322n.m27787k(this.f34632b.m42119U(), " ping"), true, this.f34632b, i10, i11), 0L);
                return;
            }
            C12738f c12738f = this.f34632b;
            synchronized (c12738f) {
                if (i10 == 1) {
                    c12738f.f34618y++;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        c12738f.f34593B++;
                        c12738f.notifyAll();
                    }
                    C2037v c2037v = C2037v.f8089a;
                } else {
                    c12738f.f34592A++;
                }
            }
        }

        @Override // p473yl.C12740h.c
        /* renamed from: i */
        public void mo42166i(boolean z10, int i10, InterfaceC7060d source, int i11) {
            C9322n.m27781e(source, "source");
            if (this.f34632b.m42121Y0(i10)) {
                this.f34632b.m42114L0(i10, source, i11, z10);
                return;
            }
            C12741i m42134v0 = this.f34632b.m42134v0(i10);
            if (m42134v0 == null) {
                this.f34632b.m42108C1(i10, EnumC12734b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f34632b.m42136x1(j10);
                source.skip(j10);
                return;
            }
            m42134v0.m42228w(source, i11);
            if (z10) {
                m42134v0.m42229x(C10727d.f27159b, true);
            }
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m42171p();
            return C2037v.f8089a;
        }

        @Override // p473yl.C12740h.c
        /* renamed from: j */
        public void mo42167j(int i10, int i11, List<C12735c> requestHeaders) {
            C9322n.m27781e(requestHeaders, "requestHeaders");
            this.f34632b.m42118T0(i11, requestHeaders);
        }

        @Override // p473yl.C12740h.c
        /* renamed from: k */
        public void mo42168k() {
        }

        @Override // p473yl.C12740h.c
        /* renamed from: l */
        public void mo42169l(int i10, int i11, int i12, boolean z10) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, yl.m] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* renamed from: o */
        public final void m42170o(boolean z10, C12745m settings) {
            ?? r13;
            long m42273c;
            int i10;
            C12741i[] c12741iArr;
            C9322n.m27781e(settings, "settings");
            C9332x c9332x = new C9332x();
            C12742j m42111F0 = this.f34632b.m42111F0();
            C12738f c12738f = this.f34632b;
            synchronized (m42111F0) {
                synchronized (c12738f) {
                    C12745m m42129j0 = c12738f.m42129j0();
                    if (z10) {
                        r13 = settings;
                    } else {
                        C12745m c12745m = new C12745m();
                        c12745m.m42277g(m42129j0);
                        c12745m.m42277g(settings);
                        r13 = c12745m;
                    }
                    c9332x.f22581a = r13;
                    m42273c = r13.m42273c() - m42129j0.m42273c();
                    i10 = 0;
                    if (m42273c != 0 && !c12738f.m42138z0().isEmpty()) {
                        Object[] array = c12738f.m42138z0().values().toArray(new C12741i[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        c12741iArr = (C12741i[]) array;
                        c12738f.m42132q1((C12745m) c9332x.f22581a);
                        c12738f.f34615v.m36322i(new a(C9322n.m27787k(c12738f.m42119U(), " onSettings"), true, c12738f, c9332x), 0L);
                        C2037v c2037v = C2037v.f8089a;
                    }
                    c12741iArr = null;
                    c12738f.m42132q1((C12745m) c9332x.f22581a);
                    c12738f.f34615v.m36322i(new a(C9322n.m27787k(c12738f.m42119U(), " onSettings"), true, c12738f, c9332x), 0L);
                    C2037v c2037v2 = C2037v.f8089a;
                }
                try {
                    c12738f.m42111F0().m42249a((C12745m) c9332x.f22581a);
                } catch (IOException e10) {
                    c12738f.m42090R(e10);
                }
                C2037v c2037v3 = C2037v.f8089a;
            }
            if (c12741iArr != null) {
                int length = c12741iArr.length;
                while (i10 < length) {
                    C12741i c12741i = c12741iArr[i10];
                    i10++;
                    synchronized (c12741i) {
                        c12741i.m42207a(m42273c);
                        C2037v c2037v4 = C2037v.f8089a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [yl.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [yl.h, java.io.Closeable] */
        /* renamed from: p */
        public void m42171p() {
            EnumC12734b enumC12734b;
            EnumC12734b enumC12734b2;
            EnumC12734b enumC12734b3 = EnumC12734b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f34631a.m42189e(this);
                    do {
                    } while (this.f34631a.m42188b(false, this));
                    enumC12734b2 = EnumC12734b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    enumC12734b = enumC12734b3;
                    this.f34632b.m42115Q(enumC12734b, enumC12734b3, e10);
                    C10727d.m32653m(this.f34631a);
                    throw th;
                }
                try {
                    this.f34632b.m42115Q(enumC12734b2, EnumC12734b.CANCEL, null);
                    enumC12734b = enumC12734b2;
                } catch (IOException e12) {
                    e10 = e12;
                    EnumC12734b enumC12734b4 = EnumC12734b.PROTOCOL_ERROR;
                    C12738f c12738f = this.f34632b;
                    c12738f.m42115Q(enumC12734b4, enumC12734b4, e10);
                    enumC12734b = c12738f;
                    enumC12734b3 = this.f34631a;
                    C10727d.m32653m(enumC12734b3);
                }
                enumC12734b3 = this.f34631a;
                C10727d.m32653m(enumC12734b3);
            } catch (Throwable th3) {
                th = th3;
                this.f34632b.m42115Q(enumC12734b, enumC12734b3, e10);
                C10727d.m32653m(this.f34631a);
                throw th;
            }
        }
    }

    /* renamed from: yl.f$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34651e;

        /* renamed from: f */
        final /* synthetic */ boolean f34652f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34653g;

        /* renamed from: h */
        final /* synthetic */ int f34654h;

        /* renamed from: i */
        final /* synthetic */ C7056b f34655i;

        /* renamed from: j */
        final /* synthetic */ int f34656j;

        /* renamed from: k */
        final /* synthetic */ boolean f34657k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, C12738f c12738f, int i10, C7056b c7056b, int i11, boolean z11) {
            super(str, z10);
            this.f34651e = str;
            this.f34652f = z10;
            this.f34653g = c12738f;
            this.f34654h = i10;
            this.f34655i = c7056b;
            this.f34656j = i11;
            this.f34657k = z11;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            try {
                boolean mo42267a = this.f34653g.f34616w.mo42267a(this.f34654h, this.f34655i, this.f34656j, this.f34657k);
                if (mo42267a) {
                    this.f34653g.m42111F0().m42257j(this.f34654h, EnumC12734b.CANCEL);
                }
                if (!mo42267a && !this.f34657k) {
                    return -1L;
                }
                synchronized (this.f34653g) {
                    this.f34653g.f34604M.remove(Integer.valueOf(this.f34654h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: yl.f$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34658e;

        /* renamed from: f */
        final /* synthetic */ boolean f34659f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34660g;

        /* renamed from: h */
        final /* synthetic */ int f34661h;

        /* renamed from: i */
        final /* synthetic */ List f34662i;

        /* renamed from: j */
        final /* synthetic */ boolean f34663j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, C12738f c12738f, int i10, List list, boolean z11) {
            super(str, z10);
            this.f34658e = str;
            this.f34659f = z10;
            this.f34660g = c12738f;
            this.f34661h = i10;
            this.f34662i = list;
            this.f34663j = z11;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            boolean mo42270d = this.f34660g.f34616w.mo42270d(this.f34661h, this.f34662i, this.f34663j);
            if (mo42270d) {
                try {
                    this.f34660g.m42111F0().m42257j(this.f34661h, EnumC12734b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!mo42270d && !this.f34663j) {
                return -1L;
            }
            synchronized (this.f34660g) {
                this.f34660g.f34604M.remove(Integer.valueOf(this.f34661h));
            }
            return -1L;
        }
    }

    /* renamed from: yl.f$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34664e;

        /* renamed from: f */
        final /* synthetic */ boolean f34665f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34666g;

        /* renamed from: h */
        final /* synthetic */ int f34667h;

        /* renamed from: i */
        final /* synthetic */ List f34668i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, C12738f c12738f, int i10, List list) {
            super(str, z10);
            this.f34664e = str;
            this.f34665f = z10;
            this.f34666g = c12738f;
            this.f34667h = i10;
            this.f34668i = list;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            if (!this.f34666g.f34616w.mo42269c(this.f34667h, this.f34668i)) {
                return -1L;
            }
            try {
                this.f34666g.m42111F0().m42257j(this.f34667h, EnumC12734b.CANCEL);
                synchronized (this.f34666g) {
                    this.f34666g.f34604M.remove(Integer.valueOf(this.f34667h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: yl.f$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34669e;

        /* renamed from: f */
        final /* synthetic */ boolean f34670f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34671g;

        /* renamed from: h */
        final /* synthetic */ int f34672h;

        /* renamed from: i */
        final /* synthetic */ EnumC12734b f34673i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, C12738f c12738f, int i10, EnumC12734b enumC12734b) {
            super(str, z10);
            this.f34669e = str;
            this.f34670f = z10;
            this.f34671g = c12738f;
            this.f34672h = i10;
            this.f34673i = enumC12734b;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            this.f34671g.f34616w.mo42268b(this.f34672h, this.f34673i);
            synchronized (this.f34671g) {
                this.f34671g.f34604M.remove(Integer.valueOf(this.f34672h));
                C2037v c2037v = C2037v.f8089a;
            }
            return -1L;
        }
    }

    /* renamed from: yl.f$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34674e;

        /* renamed from: f */
        final /* synthetic */ boolean f34675f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34676g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, C12738f c12738f) {
            super(str, z10);
            this.f34674e = str;
            this.f34675f = z10;
            this.f34676g = c12738f;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            this.f34676g.m42105A1(false, 2, 0);
            return -1L;
        }
    }

    /* renamed from: yl.f$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34677e;

        /* renamed from: f */
        final /* synthetic */ C12738f f34678f;

        /* renamed from: g */
        final /* synthetic */ long f34679g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C12738f c12738f, long j10) {
            super(str, false, 2, null);
            this.f34677e = str;
            this.f34678f = c12738f;
            this.f34679g = j10;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            boolean z10;
            synchronized (this.f34678f) {
                if (this.f34678f.f34618y < this.f34678f.f34617x) {
                    z10 = true;
                } else {
                    this.f34678f.f34617x++;
                    z10 = false;
                }
            }
            C12738f c12738f = this.f34678f;
            if (z10) {
                c12738f.m42090R(null);
                return -1L;
            }
            c12738f.m42105A1(false, 1, 0);
            return this.f34679g;
        }
    }

    /* renamed from: yl.f$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34680e;

        /* renamed from: f */
        final /* synthetic */ boolean f34681f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34682g;

        /* renamed from: h */
        final /* synthetic */ int f34683h;

        /* renamed from: i */
        final /* synthetic */ EnumC12734b f34684i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, C12738f c12738f, int i10, EnumC12734b enumC12734b) {
            super(str, z10);
            this.f34680e = str;
            this.f34681f = z10;
            this.f34682g = c12738f;
            this.f34683h = i10;
            this.f34684i = enumC12734b;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            try {
                this.f34682g.m42107B1(this.f34683h, this.f34684i);
                return -1L;
            } catch (IOException e10) {
                this.f34682g.m42090R(e10);
                return -1L;
            }
        }
    }

    /* renamed from: yl.f$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC11586a {

        /* renamed from: e */
        final /* synthetic */ String f34685e;

        /* renamed from: f */
        final /* synthetic */ boolean f34686f;

        /* renamed from: g */
        final /* synthetic */ C12738f f34687g;

        /* renamed from: h */
        final /* synthetic */ int f34688h;

        /* renamed from: i */
        final /* synthetic */ long f34689i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, C12738f c12738f, int i10, long j10) {
            super(str, z10);
            this.f34685e = str;
            this.f34686f = z10;
            this.f34687g = c12738f;
            this.f34688h = i10;
            this.f34689i = j10;
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            try {
                this.f34687g.m42111F0().m42251d(this.f34688h, this.f34689i);
                return -1L;
            } catch (IOException e10) {
                this.f34687g.m42090R(e10);
                return -1L;
            }
        }
    }

    static {
        C12745m c12745m = new C12745m();
        c12745m.m42278h(7, 65535);
        c12745m.m42278h(5, 16384);
        f34591O = c12745m;
    }

    public C12738f(a builder) {
        C9322n.m27781e(builder, "builder");
        boolean m42141b = builder.m42141b();
        this.f34605a = m42141b;
        this.f34606b = builder.m42143d();
        this.f34607c = new LinkedHashMap();
        String m42142c = builder.m42142c();
        this.f34608d = m42142c;
        this.f34610f = builder.m42141b() ? 3 : 2;
        C11590e m42149j = builder.m42149j();
        this.f34612s = m42149j;
        C11589d m36337i = m42149j.m36337i();
        this.f34613t = m36337i;
        this.f34614u = m42149j.m36337i();
        this.f34615v = m42149j.m36337i();
        this.f34616w = builder.m42145f();
        C12745m c12745m = new C12745m();
        if (builder.m42141b()) {
            c12745m.m42278h(7, 16777216);
        }
        this.f34595D = c12745m;
        this.f34596E = f34591O;
        this.f34600I = r2.m42273c();
        this.f34601J = builder.m42147h();
        this.f34602K = new C12742j(builder.m42146g(), m42141b);
        this.f34603L = new d(this, new C12740h(builder.m42148i(), m42141b));
        this.f34604M = new LinkedHashSet();
        if (builder.m42144e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m42144e());
            m36337i.m36322i(new j(C9322n.m27787k(m42142c, " ping"), this, nanos), nanos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x0010, B:9:0x0015, B:11:0x0019, B:13:0x0033, B:15:0x003f, B:19:0x004f, B:21:0x0055, B:22:0x0060, B:37:0x0090, B:38:0x0095), top: B:5:0x0007, outer: #1 }] */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p473yl.C12741i m42088I0(int r11, java.util.List<p473yl.C12735c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            yl.j r7 = r10.f34602K
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L99
            int r0 = r10.m42127h0()     // Catch: java.lang.Throwable -> L96
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            yl.b r0 = p473yl.EnumC12734b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L96
            r10.m42133u1(r0)     // Catch: java.lang.Throwable -> L96
        L15:
            boolean r0 = r10.f34611r     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L90
            int r8 = r10.m42127h0()     // Catch: java.lang.Throwable -> L96
            int r0 = r10.m42127h0()     // Catch: java.lang.Throwable -> L96
            int r0 = r0 + 2
            r10.m42130j1(r0)     // Catch: java.lang.Throwable -> L96
            yl.i r9 = new yl.i     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L96
            r0 = 1
            if (r13 == 0) goto L4e
            long r1 = r10.m42109D0()     // Catch: java.lang.Throwable -> L96
            long r3 = r10.m42106B0()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L4e
            long r1 = r9.m42223r()     // Catch: java.lang.Throwable -> L96
            long r3 = r9.m42222q()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L4c
            goto L4e
        L4c:
            r13 = 0
            goto L4f
        L4e:
            r13 = r0
        L4f:
            boolean r1 = r9.m42226u()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L60
            java.util.Map r1 = r10.m42138z0()     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L96
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L96
        L60:
            ck.v r1 = ck.C2037v.f8089a     // Catch: java.lang.Throwable -> L96
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            if (r11 != 0) goto L6d
            yl.j r11 = r10.m42111F0()     // Catch: java.lang.Throwable -> L99
            r11.m42254g(r6, r8, r12)     // Catch: java.lang.Throwable -> L99
            goto L7b
        L6d:
            boolean r1 = r10.m42117S()     // Catch: java.lang.Throwable -> L99
            r0 = r0 ^ r1
            if (r0 == 0) goto L84
            yl.j r0 = r10.m42111F0()     // Catch: java.lang.Throwable -> L99
            r0.m42256i(r11, r8, r12)     // Catch: java.lang.Throwable -> L99
        L7b:
            monitor-exit(r7)
            if (r13 == 0) goto L83
            yl.j r11 = r10.f34602K
            r11.flush()
        L83:
            return r9
        L84:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L99
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L99
            throw r12     // Catch: java.lang.Throwable -> L99
        L90:
            yl.a r11 = new yl.a     // Catch: java.lang.Throwable -> L96
            r11.<init>()     // Catch: java.lang.Throwable -> L96
            throw r11     // Catch: java.lang.Throwable -> L96
        L96:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            throw r11     // Catch: java.lang.Throwable -> L99
        L99:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p473yl.C12738f.m42088I0(int, java.util.List, boolean):yl.i");
    }

    /* renamed from: R */
    public final void m42090R(IOException iOException) {
        EnumC12734b enumC12734b = EnumC12734b.PROTOCOL_ERROR;
        m42115Q(enumC12734b, enumC12734b, iOException);
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m42103w1(C12738f c12738f, boolean z10, C11590e c11590e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            c11590e = C11590e.f30144i;
        }
        c12738f.m42135v1(z10, c11590e);
    }

    /* renamed from: A1 */
    public final void m42105A1(boolean z10, int i10, int i11) {
        try {
            this.f34602K.m42255h(z10, i10, i11);
        } catch (IOException e10) {
            m42090R(e10);
        }
    }

    /* renamed from: B0 */
    public final long m42106B0() {
        return this.f34600I;
    }

    /* renamed from: B1 */
    public final void m42107B1(int i10, EnumC12734b statusCode) {
        C9322n.m27781e(statusCode, "statusCode");
        this.f34602K.m42257j(i10, statusCode);
    }

    /* renamed from: C1 */
    public final void m42108C1(int i10, EnumC12734b errorCode) {
        C9322n.m27781e(errorCode, "errorCode");
        this.f34613t.m36322i(new k(this.f34608d + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    /* renamed from: D0 */
    public final long m42109D0() {
        return this.f34599H;
    }

    /* renamed from: D1 */
    public final void m42110D1(int i10, long j10) {
        this.f34613t.m36322i(new l(this.f34608d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    /* renamed from: F0 */
    public final C12742j m42111F0() {
        return this.f34602K;
    }

    /* renamed from: H0 */
    public final synchronized boolean m42112H0(long j10) {
        if (this.f34611r) {
            return false;
        }
        if (this.f34592A < this.f34619z) {
            if (j10 >= this.f34594C) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J0 */
    public final C12741i m42113J0(List<C12735c> requestHeaders, boolean z10) {
        C9322n.m27781e(requestHeaders, "requestHeaders");
        return m42088I0(0, requestHeaders, z10);
    }

    /* renamed from: L0 */
    public final void m42114L0(int i10, InterfaceC7060d source, int i11, boolean z10) {
        C9322n.m27781e(source, "source");
        C7056b c7056b = new C7056b();
        long j10 = i11;
        source.mo20733q0(j10);
        source.mo20686s1(c7056b, j10);
        this.f34614u.m36322i(new e(this.f34608d + '[' + i10 + "] onData", true, this, i10, c7056b, i11, z10), 0L);
    }

    /* renamed from: Q */
    public final void m42115Q(EnumC12734b connectionCode, EnumC12734b streamCode, IOException iOException) {
        int i10;
        Object[] objArr;
        C9322n.m27781e(connectionCode, "connectionCode");
        C9322n.m27781e(streamCode, "streamCode");
        if (C10727d.f27165h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            m42133u1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!m42138z0().isEmpty()) {
                objArr = m42138z0().values().toArray(new C12741i[0]);
                if (objArr == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                m42138z0().clear();
            } else {
                objArr = null;
            }
            C2037v c2037v = C2037v.f8089a;
        }
        C12741i[] c12741iArr = (C12741i[]) objArr;
        if (c12741iArr != null) {
            for (C12741i c12741i : c12741iArr) {
                try {
                    c12741i.m42210d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            m42111F0().close();
        } catch (IOException unused3) {
        }
        try {
            m42131m0().close();
        } catch (IOException unused4) {
        }
        this.f34613t.m36327o();
        this.f34614u.m36327o();
        this.f34615v.m36327o();
    }

    /* renamed from: R0 */
    public final void m42116R0(int i10, List<C12735c> requestHeaders, boolean z10) {
        C9322n.m27781e(requestHeaders, "requestHeaders");
        this.f34614u.m36322i(new f(this.f34608d + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    /* renamed from: S */
    public final boolean m42117S() {
        return this.f34605a;
    }

    /* renamed from: T0 */
    public final void m42118T0(int i10, List<C12735c> requestHeaders) {
        C9322n.m27781e(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f34604M.contains(Integer.valueOf(i10))) {
                m42108C1(i10, EnumC12734b.PROTOCOL_ERROR);
                return;
            }
            this.f34604M.add(Integer.valueOf(i10));
            this.f34614u.m36322i(new g(this.f34608d + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
        }
    }

    /* renamed from: U */
    public final String m42119U() {
        return this.f34608d;
    }

    /* renamed from: W0 */
    public final void m42120W0(int i10, EnumC12734b errorCode) {
        C9322n.m27781e(errorCode, "errorCode");
        this.f34614u.m36322i(new h(this.f34608d + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    /* renamed from: Y0 */
    public final boolean m42121Y0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* renamed from: a0 */
    public final int m42122a0() {
        return this.f34609e;
    }

    /* renamed from: a1 */
    public final synchronized C12741i m42123a1(int i10) {
        C12741i remove;
        remove = this.f34607c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    /* renamed from: b1 */
    public final void m42124b1() {
        synchronized (this) {
            long j10 = this.f34592A;
            long j11 = this.f34619z;
            if (j10 < j11) {
                return;
            }
            this.f34619z = j11 + 1;
            this.f34594C = System.nanoTime() + 1000000000;
            C2037v c2037v = C2037v.f8089a;
            this.f34613t.m36322i(new i(C9322n.m27787k(this.f34608d, " ping"), true, this), 0L);
        }
    }

    /* renamed from: c0 */
    public final c m42125c0() {
        return this.f34606b;
    }

    /* renamed from: c1 */
    public final void m42126c1(int i10) {
        this.f34609e = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m42115Q(EnumC12734b.NO_ERROR, EnumC12734b.CANCEL, null);
    }

    public final void flush() {
        this.f34602K.flush();
    }

    /* renamed from: h0 */
    public final int m42127h0() {
        return this.f34610f;
    }

    /* renamed from: i0 */
    public final C12745m m42128i0() {
        return this.f34595D;
    }

    /* renamed from: j0 */
    public final C12745m m42129j0() {
        return this.f34596E;
    }

    /* renamed from: j1 */
    public final void m42130j1(int i10) {
        this.f34610f = i10;
    }

    /* renamed from: m0 */
    public final Socket m42131m0() {
        return this.f34601J;
    }

    /* renamed from: q1 */
    public final void m42132q1(C12745m c12745m) {
        C9322n.m27781e(c12745m, "<set-?>");
        this.f34596E = c12745m;
    }

    /* renamed from: u1 */
    public final void m42133u1(EnumC12734b statusCode) {
        C9322n.m27781e(statusCode, "statusCode");
        synchronized (this.f34602K) {
            C9331w c9331w = new C9331w();
            synchronized (this) {
                if (this.f34611r) {
                    return;
                }
                this.f34611r = true;
                c9331w.f22580a = m42122a0();
                C2037v c2037v = C2037v.f8089a;
                m42111F0().m42253f(c9331w.f22580a, statusCode, C10727d.f27158a);
            }
        }
    }

    /* renamed from: v0 */
    public final synchronized C12741i m42134v0(int i10) {
        return this.f34607c.get(Integer.valueOf(i10));
    }

    /* renamed from: v1 */
    public final void m42135v1(boolean z10, C11590e taskRunner) {
        C9322n.m27781e(taskRunner, "taskRunner");
        if (z10) {
            this.f34602K.m42247G();
            this.f34602K.m42258l(this.f34595D);
            if (this.f34595D.m42273c() != 65535) {
                this.f34602K.m42251d(0, r5 - 65535);
            }
        }
        taskRunner.m36337i().m36322i(new C11588c(this.f34608d, true, this.f34603L), 0L);
    }

    /* renamed from: x1 */
    public final synchronized void m42136x1(long j10) {
        long j11 = this.f34597F + j10;
        this.f34597F = j11;
        long j12 = j11 - this.f34598G;
        if (j12 >= this.f34595D.m42273c() / 2) {
            m42110D1(0, j12);
            this.f34598G += j12;
        }
    }

    /* renamed from: y1 */
    public final void m42137y1(int i10, boolean z10, C7056b c7056b, long j10) {
        int min;
        long j11;
        if (j10 == 0) {
            this.f34602K.m42248X0(z10, i10, c7056b, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (m42109D0() >= m42106B0()) {
                    try {
                        if (!m42138z0().containsKey(Integer.valueOf(i10))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j10, m42106B0() - m42109D0()), m42111F0().m42259p0());
                j11 = min;
                this.f34599H = m42109D0() + j11;
                C2037v c2037v = C2037v.f8089a;
            }
            j10 -= j11;
            this.f34602K.m42248X0(z10 && j10 == 0, i10, c7056b, min);
        }
    }

    /* renamed from: z0 */
    public final Map<Integer, C12741i> m42138z0() {
        return this.f34607c;
    }

    /* renamed from: z1 */
    public final void m42139z1(int i10, boolean z10, List<C12735c> alternating) {
        C9322n.m27781e(alternating, "alternating");
        this.f34602K.m42254g(z10, i10, alternating);
    }
}
