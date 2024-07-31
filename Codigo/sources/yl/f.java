package yl;

import ck.v;
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
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import yl.h;

/* loaded from: classes3.dex */
public final class f implements Closeable {
    public static final b N = new b(null);
    private static final m O;
    private long A;
    private long B;
    private long C;
    private final m D;
    private m E;
    private long F;
    private long G;
    private long H;
    private long I;
    private final Socket J;
    private final yl.j K;
    private final d L;
    private final Set<Integer> M;

    /* renamed from: a */
    private final boolean f32054a;

    /* renamed from: b */
    private final c f32055b;

    /* renamed from: c */
    private final Map<Integer, yl.i> f32056c;

    /* renamed from: d */
    private final String f32057d;

    /* renamed from: e */
    private int f32058e;

    /* renamed from: f */
    private int f32059f;

    /* renamed from: r */
    private boolean f32060r;

    /* renamed from: s */
    private final ul.e f32061s;

    /* renamed from: t */
    private final ul.d f32062t;

    /* renamed from: u */
    private final ul.d f32063u;

    /* renamed from: v */
    private final ul.d f32064v;

    /* renamed from: w */
    private final yl.l f32065w;

    /* renamed from: x */
    private long f32066x;

    /* renamed from: y */
    private long f32067y;

    /* renamed from: z */
    private long f32068z;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f32069a;

        /* renamed from: b */
        private final ul.e f32070b;

        /* renamed from: c */
        public Socket f32071c;

        /* renamed from: d */
        public String f32072d;

        /* renamed from: e */
        public dm.d f32073e;

        /* renamed from: f */
        public dm.c f32074f;

        /* renamed from: g */
        private c f32075g;

        /* renamed from: h */
        private yl.l f32076h;

        /* renamed from: i */
        private int f32077i;

        public a(boolean z10, ul.e taskRunner) {
            kotlin.jvm.internal.n.e(taskRunner, "taskRunner");
            this.f32069a = z10;
            this.f32070b = taskRunner;
            this.f32075g = c.f32079b;
            this.f32076h = yl.l.f32204b;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f32069a;
        }

        public final String c() {
            String str = this.f32072d;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.n.p("connectionName");
            return null;
        }

        public final c d() {
            return this.f32075g;
        }

        public final int e() {
            return this.f32077i;
        }

        public final yl.l f() {
            return this.f32076h;
        }

        public final dm.c g() {
            dm.c cVar = this.f32074f;
            if (cVar != null) {
                return cVar;
            }
            kotlin.jvm.internal.n.p("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f32071c;
            if (socket != null) {
                return socket;
            }
            kotlin.jvm.internal.n.p("socket");
            return null;
        }

        public final dm.d i() {
            dm.d dVar = this.f32073e;
            if (dVar != null) {
                return dVar;
            }
            kotlin.jvm.internal.n.p("source");
            return null;
        }

        public final ul.e j() {
            return this.f32070b;
        }

        public final a k(c listener) {
            kotlin.jvm.internal.n.e(listener, "listener");
            n(listener);
            return this;
        }

        public final a l(int i10) {
            o(i10);
            return this;
        }

        public final void m(String str) {
            kotlin.jvm.internal.n.e(str, "<set-?>");
            this.f32072d = str;
        }

        public final void n(c cVar) {
            kotlin.jvm.internal.n.e(cVar, "<set-?>");
            this.f32075g = cVar;
        }

        public final void o(int i10) {
            this.f32077i = i10;
        }

        public final void p(dm.c cVar) {
            kotlin.jvm.internal.n.e(cVar, "<set-?>");
            this.f32074f = cVar;
        }

        public final void q(Socket socket) {
            kotlin.jvm.internal.n.e(socket, "<set-?>");
            this.f32071c = socket;
        }

        public final void r(dm.d dVar) {
            kotlin.jvm.internal.n.e(dVar, "<set-?>");
            this.f32073e = dVar;
        }

        public final a s(Socket socket, String peerName, dm.d source, dm.c sink) {
            String k10;
            kotlin.jvm.internal.n.e(socket, "socket");
            kotlin.jvm.internal.n.e(peerName, "peerName");
            kotlin.jvm.internal.n.e(source, "source");
            kotlin.jvm.internal.n.e(sink, "sink");
            q(socket);
            if (b()) {
                k10 = rl.d.f25047i + ' ' + peerName;
            } else {
                k10 = kotlin.jvm.internal.n.k("MockWebServer ", peerName);
            }
            m(k10);
            r(source);
            p(sink);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final m a() {
            return f.O;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c {

        /* renamed from: a */
        public static final b f32078a = new b(null);

        /* renamed from: b */
        public static final c f32079b = new a();

        /* loaded from: classes3.dex */
        public static final class a extends c {
            a() {
            }

            @Override // yl.f.c
            public void b(yl.i stream) {
                kotlin.jvm.internal.n.e(stream, "stream");
                stream.d(yl.b.REFUSED_STREAM, null);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public void a(f connection, m settings) {
            kotlin.jvm.internal.n.e(connection, "connection");
            kotlin.jvm.internal.n.e(settings, "settings");
        }

        public abstract void b(yl.i iVar);
    }

    /* loaded from: classes3.dex */
    public final class d implements h.c, ok.a<v> {

        /* renamed from: a */
        private final yl.h f32080a;

        /* renamed from: b */
        final /* synthetic */ f f32081b;

        /* loaded from: classes3.dex */
        public static final class a extends ul.a {

            /* renamed from: e */
            final /* synthetic */ String f32082e;

            /* renamed from: f */
            final /* synthetic */ boolean f32083f;

            /* renamed from: g */
            final /* synthetic */ f f32084g;

            /* renamed from: h */
            final /* synthetic */ x f32085h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, f fVar, x xVar) {
                super(str, z10);
                this.f32082e = str;
                this.f32083f = z10;
                this.f32084g = fVar;
                this.f32085h = xVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ul.a
            public long f() {
                this.f32084g.c0().a(this.f32084g, (m) this.f32085h.f20759a);
                return -1L;
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends ul.a {

            /* renamed from: e */
            final /* synthetic */ String f32086e;

            /* renamed from: f */
            final /* synthetic */ boolean f32087f;

            /* renamed from: g */
            final /* synthetic */ f f32088g;

            /* renamed from: h */
            final /* synthetic */ yl.i f32089h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, f fVar, yl.i iVar) {
                super(str, z10);
                this.f32086e = str;
                this.f32087f = z10;
                this.f32088g = fVar;
                this.f32089h = iVar;
            }

            @Override // ul.a
            public long f() {
                try {
                    this.f32088g.c0().b(this.f32089h);
                    return -1L;
                } catch (IOException e10) {
                    zl.j.f32984a.g().j(kotlin.jvm.internal.n.k("Http2Connection.Listener failure for ", this.f32088g.U()), 4, e10);
                    try {
                        this.f32089h.d(yl.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class c extends ul.a {

            /* renamed from: e */
            final /* synthetic */ String f32090e;

            /* renamed from: f */
            final /* synthetic */ boolean f32091f;

            /* renamed from: g */
            final /* synthetic */ f f32092g;

            /* renamed from: h */
            final /* synthetic */ int f32093h;

            /* renamed from: i */
            final /* synthetic */ int f32094i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, f fVar, int i10, int i11) {
                super(str, z10);
                this.f32090e = str;
                this.f32091f = z10;
                this.f32092g = fVar;
                this.f32093h = i10;
                this.f32094i = i11;
            }

            @Override // ul.a
            public long f() {
                this.f32092g.A1(true, this.f32093h, this.f32094i);
                return -1L;
            }
        }

        /* renamed from: yl.f$d$d */
        /* loaded from: classes3.dex */
        public static final class C0536d extends ul.a {

            /* renamed from: e */
            final /* synthetic */ String f32095e;

            /* renamed from: f */
            final /* synthetic */ boolean f32096f;

            /* renamed from: g */
            final /* synthetic */ d f32097g;

            /* renamed from: h */
            final /* synthetic */ boolean f32098h;

            /* renamed from: i */
            final /* synthetic */ m f32099i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0536d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f32095e = str;
                this.f32096f = z10;
                this.f32097g = dVar;
                this.f32098h = z11;
                this.f32099i = mVar;
            }

            @Override // ul.a
            public long f() {
                this.f32097g.o(this.f32098h, this.f32099i);
                return -1L;
            }
        }

        public d(f this$0, yl.h reader) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            kotlin.jvm.internal.n.e(reader, "reader");
            this.f32081b = this$0;
            this.f32080a = reader;
        }

        @Override // yl.h.c
        public void a(boolean z10, int i10, int i11, List<yl.c> headerBlock) {
            kotlin.jvm.internal.n.e(headerBlock, "headerBlock");
            if (this.f32081b.Y0(i10)) {
                this.f32081b.R0(i10, headerBlock, z10);
                return;
            }
            f fVar = this.f32081b;
            synchronized (fVar) {
                yl.i v02 = fVar.v0(i10);
                if (v02 != null) {
                    v vVar = v.f7137a;
                    v02.x(rl.d.P(headerBlock), z10);
                    return;
                }
                if (fVar.f32060r) {
                    return;
                }
                if (i10 <= fVar.a0()) {
                    return;
                }
                if (i10 % 2 == fVar.h0() % 2) {
                    return;
                }
                yl.i iVar = new yl.i(i10, fVar, false, z10, rl.d.P(headerBlock));
                fVar.c1(i10);
                fVar.z0().put(Integer.valueOf(i10), iVar);
                fVar.f32061s.i().i(new b(fVar.U() + '[' + i10 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // yl.h.c
        public void c(int i10, yl.b errorCode) {
            kotlin.jvm.internal.n.e(errorCode, "errorCode");
            if (this.f32081b.Y0(i10)) {
                this.f32081b.W0(i10, errorCode);
                return;
            }
            yl.i a12 = this.f32081b.a1(i10);
            if (a12 == null) {
                return;
            }
            a12.y(errorCode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yl.h.c
        public void d(int i10, long j10) {
            yl.i iVar;
            if (i10 == 0) {
                f fVar = this.f32081b;
                synchronized (fVar) {
                    fVar.I = fVar.B0() + j10;
                    fVar.notifyAll();
                    v vVar = v.f7137a;
                    iVar = fVar;
                }
            } else {
                yl.i v02 = this.f32081b.v0(i10);
                if (v02 == null) {
                    return;
                }
                synchronized (v02) {
                    v02.a(j10);
                    v vVar2 = v.f7137a;
                    iVar = v02;
                }
            }
        }

        @Override // yl.h.c
        public void f(boolean z10, m settings) {
            kotlin.jvm.internal.n.e(settings, "settings");
            this.f32081b.f32062t.i(new C0536d(kotlin.jvm.internal.n.k(this.f32081b.U(), " applyAndAckSettings"), true, this, z10, settings), 0L);
        }

        @Override // yl.h.c
        public void g(int i10, yl.b errorCode, dm.e debugData) {
            int i11;
            Object[] array;
            kotlin.jvm.internal.n.e(errorCode, "errorCode");
            kotlin.jvm.internal.n.e(debugData, "debugData");
            debugData.B();
            f fVar = this.f32081b;
            synchronized (fVar) {
                i11 = 0;
                array = fVar.z0().values().toArray(new yl.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                fVar.f32060r = true;
                v vVar = v.f7137a;
            }
            yl.i[] iVarArr = (yl.i[]) array;
            int length = iVarArr.length;
            while (i11 < length) {
                yl.i iVar = iVarArr[i11];
                i11++;
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(yl.b.REFUSED_STREAM);
                    this.f32081b.a1(iVar.j());
                }
            }
        }

        @Override // yl.h.c
        public void h(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f32081b.f32062t.i(new c(kotlin.jvm.internal.n.k(this.f32081b.U(), " ping"), true, this.f32081b, i10, i11), 0L);
                return;
            }
            f fVar = this.f32081b;
            synchronized (fVar) {
                if (i10 == 1) {
                    fVar.f32067y++;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        fVar.B++;
                        fVar.notifyAll();
                    }
                    v vVar = v.f7137a;
                } else {
                    fVar.A++;
                }
            }
        }

        @Override // yl.h.c
        public void i(boolean z10, int i10, dm.d source, int i11) {
            kotlin.jvm.internal.n.e(source, "source");
            if (this.f32081b.Y0(i10)) {
                this.f32081b.L0(i10, source, i11, z10);
                return;
            }
            yl.i v02 = this.f32081b.v0(i10);
            if (v02 == null) {
                this.f32081b.C1(i10, yl.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f32081b.x1(j10);
                source.skip(j10);
                return;
            }
            v02.w(source, i11);
            if (z10) {
                v02.x(rl.d.f25040b, true);
            }
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            p();
            return v.f7137a;
        }

        @Override // yl.h.c
        public void j(int i10, int i11, List<yl.c> requestHeaders) {
            kotlin.jvm.internal.n.e(requestHeaders, "requestHeaders");
            this.f32081b.T0(i11, requestHeaders);
        }

        @Override // yl.h.c
        public void k() {
        }

        @Override // yl.h.c
        public void l(int i10, int i11, int i12, boolean z10) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, yl.m] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void o(boolean z10, m settings) {
            ?? r13;
            long c10;
            int i10;
            yl.i[] iVarArr;
            kotlin.jvm.internal.n.e(settings, "settings");
            x xVar = new x();
            yl.j F0 = this.f32081b.F0();
            f fVar = this.f32081b;
            synchronized (F0) {
                synchronized (fVar) {
                    m j02 = fVar.j0();
                    if (z10) {
                        r13 = settings;
                    } else {
                        m mVar = new m();
                        mVar.g(j02);
                        mVar.g(settings);
                        r13 = mVar;
                    }
                    xVar.f20759a = r13;
                    c10 = r13.c() - j02.c();
                    i10 = 0;
                    if (c10 != 0 && !fVar.z0().isEmpty()) {
                        Object[] array = fVar.z0().values().toArray(new yl.i[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (yl.i[]) array;
                        fVar.q1((m) xVar.f20759a);
                        fVar.f32064v.i(new a(kotlin.jvm.internal.n.k(fVar.U(), " onSettings"), true, fVar, xVar), 0L);
                        v vVar = v.f7137a;
                    }
                    iVarArr = null;
                    fVar.q1((m) xVar.f20759a);
                    fVar.f32064v.i(new a(kotlin.jvm.internal.n.k(fVar.U(), " onSettings"), true, fVar, xVar), 0L);
                    v vVar2 = v.f7137a;
                }
                try {
                    fVar.F0().a((m) xVar.f20759a);
                } catch (IOException e10) {
                    fVar.R(e10);
                }
                v vVar3 = v.f7137a;
            }
            if (iVarArr != null) {
                int length = iVarArr.length;
                while (i10 < length) {
                    yl.i iVar = iVarArr[i10];
                    i10++;
                    synchronized (iVar) {
                        iVar.a(c10);
                        v vVar4 = v.f7137a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [yl.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [yl.h, java.io.Closeable] */
        public void p() {
            yl.b bVar;
            yl.b bVar2;
            yl.b bVar3 = yl.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f32080a.e(this);
                    do {
                    } while (this.f32080a.b(false, this));
                    bVar2 = yl.b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar3;
                    this.f32081b.Q(bVar, bVar3, e10);
                    rl.d.m(this.f32080a);
                    throw th;
                }
                try {
                    this.f32081b.Q(bVar2, yl.b.CANCEL, null);
                    bVar = bVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    yl.b bVar4 = yl.b.PROTOCOL_ERROR;
                    f fVar = this.f32081b;
                    fVar.Q(bVar4, bVar4, e10);
                    bVar = fVar;
                    bVar3 = this.f32080a;
                    rl.d.m(bVar3);
                }
                bVar3 = this.f32080a;
                rl.d.m(bVar3);
            } catch (Throwable th3) {
                th = th3;
                this.f32081b.Q(bVar, bVar3, e10);
                rl.d.m(this.f32080a);
                throw th;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32100e;

        /* renamed from: f */
        final /* synthetic */ boolean f32101f;

        /* renamed from: g */
        final /* synthetic */ f f32102g;

        /* renamed from: h */
        final /* synthetic */ int f32103h;

        /* renamed from: i */
        final /* synthetic */ dm.b f32104i;

        /* renamed from: j */
        final /* synthetic */ int f32105j;

        /* renamed from: k */
        final /* synthetic */ boolean f32106k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, f fVar, int i10, dm.b bVar, int i11, boolean z11) {
            super(str, z10);
            this.f32100e = str;
            this.f32101f = z10;
            this.f32102g = fVar;
            this.f32103h = i10;
            this.f32104i = bVar;
            this.f32105j = i11;
            this.f32106k = z11;
        }

        @Override // ul.a
        public long f() {
            try {
                boolean a10 = this.f32102g.f32065w.a(this.f32103h, this.f32104i, this.f32105j, this.f32106k);
                if (a10) {
                    this.f32102g.F0().j(this.f32103h, yl.b.CANCEL);
                }
                if (!a10 && !this.f32106k) {
                    return -1L;
                }
                synchronized (this.f32102g) {
                    this.f32102g.M.remove(Integer.valueOf(this.f32103h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: yl.f$f */
    /* loaded from: classes3.dex */
    public static final class C0537f extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32107e;

        /* renamed from: f */
        final /* synthetic */ boolean f32108f;

        /* renamed from: g */
        final /* synthetic */ f f32109g;

        /* renamed from: h */
        final /* synthetic */ int f32110h;

        /* renamed from: i */
        final /* synthetic */ List f32111i;

        /* renamed from: j */
        final /* synthetic */ boolean f32112j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0537f(String str, boolean z10, f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f32107e = str;
            this.f32108f = z10;
            this.f32109g = fVar;
            this.f32110h = i10;
            this.f32111i = list;
            this.f32112j = z11;
        }

        @Override // ul.a
        public long f() {
            boolean d10 = this.f32109g.f32065w.d(this.f32110h, this.f32111i, this.f32112j);
            if (d10) {
                try {
                    this.f32109g.F0().j(this.f32110h, yl.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!d10 && !this.f32112j) {
                return -1L;
            }
            synchronized (this.f32109g) {
                this.f32109g.M.remove(Integer.valueOf(this.f32110h));
            }
            return -1L;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32113e;

        /* renamed from: f */
        final /* synthetic */ boolean f32114f;

        /* renamed from: g */
        final /* synthetic */ f f32115g;

        /* renamed from: h */
        final /* synthetic */ int f32116h;

        /* renamed from: i */
        final /* synthetic */ List f32117i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, f fVar, int i10, List list) {
            super(str, z10);
            this.f32113e = str;
            this.f32114f = z10;
            this.f32115g = fVar;
            this.f32116h = i10;
            this.f32117i = list;
        }

        @Override // ul.a
        public long f() {
            if (!this.f32115g.f32065w.c(this.f32116h, this.f32117i)) {
                return -1L;
            }
            try {
                this.f32115g.F0().j(this.f32116h, yl.b.CANCEL);
                synchronized (this.f32115g) {
                    this.f32115g.M.remove(Integer.valueOf(this.f32116h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32118e;

        /* renamed from: f */
        final /* synthetic */ boolean f32119f;

        /* renamed from: g */
        final /* synthetic */ f f32120g;

        /* renamed from: h */
        final /* synthetic */ int f32121h;

        /* renamed from: i */
        final /* synthetic */ yl.b f32122i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, f fVar, int i10, yl.b bVar) {
            super(str, z10);
            this.f32118e = str;
            this.f32119f = z10;
            this.f32120g = fVar;
            this.f32121h = i10;
            this.f32122i = bVar;
        }

        @Override // ul.a
        public long f() {
            this.f32120g.f32065w.b(this.f32121h, this.f32122i);
            synchronized (this.f32120g) {
                this.f32120g.M.remove(Integer.valueOf(this.f32121h));
                v vVar = v.f7137a;
            }
            return -1L;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32123e;

        /* renamed from: f */
        final /* synthetic */ boolean f32124f;

        /* renamed from: g */
        final /* synthetic */ f f32125g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, f fVar) {
            super(str, z10);
            this.f32123e = str;
            this.f32124f = z10;
            this.f32125g = fVar;
        }

        @Override // ul.a
        public long f() {
            this.f32125g.A1(false, 2, 0);
            return -1L;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32126e;

        /* renamed from: f */
        final /* synthetic */ f f32127f;

        /* renamed from: g */
        final /* synthetic */ long f32128g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j10) {
            super(str, false, 2, null);
            this.f32126e = str;
            this.f32127f = fVar;
            this.f32128g = j10;
        }

        @Override // ul.a
        public long f() {
            boolean z10;
            synchronized (this.f32127f) {
                if (this.f32127f.f32067y < this.f32127f.f32066x) {
                    z10 = true;
                } else {
                    this.f32127f.f32066x++;
                    z10 = false;
                }
            }
            f fVar = this.f32127f;
            if (z10) {
                fVar.R(null);
                return -1L;
            }
            fVar.A1(false, 1, 0);
            return this.f32128g;
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32129e;

        /* renamed from: f */
        final /* synthetic */ boolean f32130f;

        /* renamed from: g */
        final /* synthetic */ f f32131g;

        /* renamed from: h */
        final /* synthetic */ int f32132h;

        /* renamed from: i */
        final /* synthetic */ yl.b f32133i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, f fVar, int i10, yl.b bVar) {
            super(str, z10);
            this.f32129e = str;
            this.f32130f = z10;
            this.f32131g = fVar;
            this.f32132h = i10;
            this.f32133i = bVar;
        }

        @Override // ul.a
        public long f() {
            try {
                this.f32131g.B1(this.f32132h, this.f32133i);
                return -1L;
            } catch (IOException e10) {
                this.f32131g.R(e10);
                return -1L;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class l extends ul.a {

        /* renamed from: e */
        final /* synthetic */ String f32134e;

        /* renamed from: f */
        final /* synthetic */ boolean f32135f;

        /* renamed from: g */
        final /* synthetic */ f f32136g;

        /* renamed from: h */
        final /* synthetic */ int f32137h;

        /* renamed from: i */
        final /* synthetic */ long f32138i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, f fVar, int i10, long j10) {
            super(str, z10);
            this.f32134e = str;
            this.f32135f = z10;
            this.f32136g = fVar;
            this.f32137h = i10;
            this.f32138i = j10;
        }

        @Override // ul.a
        public long f() {
            try {
                this.f32136g.F0().d(this.f32137h, this.f32138i);
                return -1L;
            } catch (IOException e10) {
                this.f32136g.R(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        O = mVar;
    }

    public f(a builder) {
        kotlin.jvm.internal.n.e(builder, "builder");
        boolean b10 = builder.b();
        this.f32054a = b10;
        this.f32055b = builder.d();
        this.f32056c = new LinkedHashMap();
        String c10 = builder.c();
        this.f32057d = c10;
        this.f32059f = builder.b() ? 3 : 2;
        ul.e j10 = builder.j();
        this.f32061s = j10;
        ul.d i10 = j10.i();
        this.f32062t = i10;
        this.f32063u = j10.i();
        this.f32064v = j10.i();
        this.f32065w = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.h(7, 16777216);
        }
        this.D = mVar;
        this.E = O;
        this.I = r2.c();
        this.J = builder.h();
        this.K = new yl.j(builder.g(), b10);
        this.L = new d(this, new yl.h(builder.i(), b10));
        this.M = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            i10.i(new j(kotlin.jvm.internal.n.k(c10, " ping"), this, nanos), nanos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x0010, B:9:0x0015, B:11:0x0019, B:13:0x0033, B:15:0x003f, B:19:0x004f, B:21:0x0055, B:22:0x0060, B:37:0x0090, B:38:0x0095), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final yl.i I0(int r11, java.util.List<yl.c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            yl.j r7 = r10.K
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L99
            int r0 = r10.h0()     // Catch: java.lang.Throwable -> L96
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            yl.b r0 = yl.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L96
            r10.u1(r0)     // Catch: java.lang.Throwable -> L96
        L15:
            boolean r0 = r10.f32060r     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L90
            int r8 = r10.h0()     // Catch: java.lang.Throwable -> L96
            int r0 = r10.h0()     // Catch: java.lang.Throwable -> L96
            int r0 = r0 + 2
            r10.j1(r0)     // Catch: java.lang.Throwable -> L96
            yl.i r9 = new yl.i     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L96
            r0 = 1
            if (r13 == 0) goto L4e
            long r1 = r10.D0()     // Catch: java.lang.Throwable -> L96
            long r3 = r10.B0()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L4e
            long r1 = r9.r()     // Catch: java.lang.Throwable -> L96
            long r3 = r9.q()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L4c
            goto L4e
        L4c:
            r13 = 0
            goto L4f
        L4e:
            r13 = r0
        L4f:
            boolean r1 = r9.u()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L60
            java.util.Map r1 = r10.z0()     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L96
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L96
        L60:
            ck.v r1 = ck.v.f7137a     // Catch: java.lang.Throwable -> L96
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            if (r11 != 0) goto L6d
            yl.j r11 = r10.F0()     // Catch: java.lang.Throwable -> L99
            r11.g(r6, r8, r12)     // Catch: java.lang.Throwable -> L99
            goto L7b
        L6d:
            boolean r1 = r10.S()     // Catch: java.lang.Throwable -> L99
            r0 = r0 ^ r1
            if (r0 == 0) goto L84
            yl.j r0 = r10.F0()     // Catch: java.lang.Throwable -> L99
            r0.i(r11, r8, r12)     // Catch: java.lang.Throwable -> L99
        L7b:
            monitor-exit(r7)
            if (r13 == 0) goto L83
            yl.j r11 = r10.K
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
        throw new UnsupportedOperationException("Method not decompiled: yl.f.I0(int, java.util.List, boolean):yl.i");
    }

    public final void R(IOException iOException) {
        yl.b bVar = yl.b.PROTOCOL_ERROR;
        Q(bVar, bVar, iOException);
    }

    public static /* synthetic */ void w1(f fVar, boolean z10, ul.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = ul.e.f27821i;
        }
        fVar.v1(z10, eVar);
    }

    public final void A1(boolean z10, int i10, int i11) {
        try {
            this.K.h(z10, i10, i11);
        } catch (IOException e10) {
            R(e10);
        }
    }

    public final long B0() {
        return this.I;
    }

    public final void B1(int i10, yl.b statusCode) {
        kotlin.jvm.internal.n.e(statusCode, "statusCode");
        this.K.j(i10, statusCode);
    }

    public final void C1(int i10, yl.b errorCode) {
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        this.f32062t.i(new k(this.f32057d + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    public final long D0() {
        return this.H;
    }

    public final void D1(int i10, long j10) {
        this.f32062t.i(new l(this.f32057d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final yl.j F0() {
        return this.K;
    }

    public final synchronized boolean H0(long j10) {
        if (this.f32060r) {
            return false;
        }
        if (this.A < this.f32068z) {
            if (j10 >= this.C) {
                return false;
            }
        }
        return true;
    }

    public final yl.i J0(List<yl.c> requestHeaders, boolean z10) {
        kotlin.jvm.internal.n.e(requestHeaders, "requestHeaders");
        return I0(0, requestHeaders, z10);
    }

    public final void L0(int i10, dm.d source, int i11, boolean z10) {
        kotlin.jvm.internal.n.e(source, "source");
        dm.b bVar = new dm.b();
        long j10 = i11;
        source.q0(j10);
        source.s1(bVar, j10);
        this.f32063u.i(new e(this.f32057d + '[' + i10 + "] onData", true, this, i10, bVar, i11, z10), 0L);
    }

    public final void Q(yl.b connectionCode, yl.b streamCode, IOException iOException) {
        int i10;
        Object[] objArr;
        kotlin.jvm.internal.n.e(connectionCode, "connectionCode");
        kotlin.jvm.internal.n.e(streamCode, "streamCode");
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            u1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!z0().isEmpty()) {
                objArr = z0().values().toArray(new yl.i[0]);
                if (objArr == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                z0().clear();
            } else {
                objArr = null;
            }
            v vVar = v.f7137a;
        }
        yl.i[] iVarArr = (yl.i[]) objArr;
        if (iVarArr != null) {
            for (yl.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            F0().close();
        } catch (IOException unused3) {
        }
        try {
            m0().close();
        } catch (IOException unused4) {
        }
        this.f32062t.o();
        this.f32063u.o();
        this.f32064v.o();
    }

    public final void R0(int i10, List<yl.c> requestHeaders, boolean z10) {
        kotlin.jvm.internal.n.e(requestHeaders, "requestHeaders");
        this.f32063u.i(new C0537f(this.f32057d + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    public final boolean S() {
        return this.f32054a;
    }

    public final void T0(int i10, List<yl.c> requestHeaders) {
        kotlin.jvm.internal.n.e(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.M.contains(Integer.valueOf(i10))) {
                C1(i10, yl.b.PROTOCOL_ERROR);
                return;
            }
            this.M.add(Integer.valueOf(i10));
            this.f32063u.i(new g(this.f32057d + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
        }
    }

    public final String U() {
        return this.f32057d;
    }

    public final void W0(int i10, yl.b errorCode) {
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        this.f32063u.i(new h(this.f32057d + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    public final boolean Y0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final int a0() {
        return this.f32058e;
    }

    public final synchronized yl.i a1(int i10) {
        yl.i remove;
        remove = this.f32056c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void b1() {
        synchronized (this) {
            long j10 = this.A;
            long j11 = this.f32068z;
            if (j10 < j11) {
                return;
            }
            this.f32068z = j11 + 1;
            this.C = System.nanoTime() + 1000000000;
            v vVar = v.f7137a;
            this.f32062t.i(new i(kotlin.jvm.internal.n.k(this.f32057d, " ping"), true, this), 0L);
        }
    }

    public final c c0() {
        return this.f32055b;
    }

    public final void c1(int i10) {
        this.f32058e = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Q(yl.b.NO_ERROR, yl.b.CANCEL, null);
    }

    public final void flush() {
        this.K.flush();
    }

    public final int h0() {
        return this.f32059f;
    }

    public final m i0() {
        return this.D;
    }

    public final m j0() {
        return this.E;
    }

    public final void j1(int i10) {
        this.f32059f = i10;
    }

    public final Socket m0() {
        return this.J;
    }

    public final void q1(m mVar) {
        kotlin.jvm.internal.n.e(mVar, "<set-?>");
        this.E = mVar;
    }

    public final void u1(yl.b statusCode) {
        kotlin.jvm.internal.n.e(statusCode, "statusCode");
        synchronized (this.K) {
            w wVar = new w();
            synchronized (this) {
                if (this.f32060r) {
                    return;
                }
                this.f32060r = true;
                wVar.f20758a = a0();
                v vVar = v.f7137a;
                F0().f(wVar.f20758a, statusCode, rl.d.f25039a);
            }
        }
    }

    public final synchronized yl.i v0(int i10) {
        return this.f32056c.get(Integer.valueOf(i10));
    }

    public final void v1(boolean z10, ul.e taskRunner) {
        kotlin.jvm.internal.n.e(taskRunner, "taskRunner");
        if (z10) {
            this.K.G();
            this.K.l(this.D);
            if (this.D.c() != 65535) {
                this.K.d(0, r5 - 65535);
            }
        }
        taskRunner.i().i(new ul.c(this.f32057d, true, this.L), 0L);
    }

    public final synchronized void x1(long j10) {
        long j11 = this.F + j10;
        this.F = j11;
        long j12 = j11 - this.G;
        if (j12 >= this.D.c() / 2) {
            D1(0, j12);
            this.G += j12;
        }
    }

    public final void y1(int i10, boolean z10, dm.b bVar, long j10) {
        int min;
        long j11;
        if (j10 == 0) {
            this.K.X0(z10, i10, bVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (D0() >= B0()) {
                    try {
                        if (!z0().containsKey(Integer.valueOf(i10))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j10, B0() - D0()), F0().p0());
                j11 = min;
                this.H = D0() + j11;
                v vVar = v.f7137a;
            }
            j10 -= j11;
            this.K.X0(z10 && j10 == 0, i10, bVar, min);
        }
    }

    public final Map<Integer, yl.i> z0() {
        return this.f32056c;
    }

    public final void z1(int i10, boolean z10, List<yl.c> alternating) {
        kotlin.jvm.internal.n.e(alternating, "alternating");
        this.K.g(z10, i10, alternating);
    }
}
