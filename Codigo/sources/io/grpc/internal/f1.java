package io.grpc.internal;

import io.grpc.internal.i1;
import io.grpc.internal.j;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.m;
import io.grpc.internal.p;
import io.grpc.internal.x0;
import io.grpc.internal.y1;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import vi.d0;
import vi.e0;
import vi.f;
import vi.g;
import vi.k;
import vi.k1;
import vi.p0;
import vi.y0;

/* loaded from: classes3.dex */
public final class f1 extends vi.s0 implements vi.h0<Object> {

    /* renamed from: n0 */
    static final Logger f18722n0 = Logger.getLogger(f1.class.getName());

    /* renamed from: o0 */
    static final Pattern f18723o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0 */
    static final vi.g1 f18724p0;

    /* renamed from: q0 */
    static final vi.g1 f18725q0;

    /* renamed from: r0 */
    static final vi.g1 f18726r0;

    /* renamed from: s0 */
    private static final i1 f18727s0;

    /* renamed from: t0 */
    private static final vi.e0 f18728t0;

    /* renamed from: u0 */
    private static final vi.g<Object, Object> f18729u0;
    private final vi.d A;
    private final String B;
    private vi.y0 C;
    private boolean D;
    private n E;
    private volatile p0.i F;
    private boolean G;
    private final Set<x0> H;
    private Collection<p.e<?, ?>> I;
    private final Object J;
    private final Set<p1> K;
    private final a0 L;
    private final t M;
    private final AtomicBoolean N;
    private boolean O;
    private boolean P;
    private volatile boolean Q;
    private final CountDownLatch R;
    private final m.b S;
    private final io.grpc.internal.m T;
    private final io.grpc.internal.o U;
    private final vi.f V;
    private final vi.c0 W;
    private final p X;
    private q Y;
    private i1 Z;

    /* renamed from: a */
    private final vi.i0 f18730a;

    /* renamed from: a0 */
    private final i1 f18731a0;

    /* renamed from: b */
    private final String f18732b;

    /* renamed from: b0 */
    private boolean f18733b0;

    /* renamed from: c */
    private final String f18734c;

    /* renamed from: c0 */
    private final boolean f18735c0;

    /* renamed from: d */
    private final vi.a1 f18736d;

    /* renamed from: d0 */
    private final y1.t f18737d0;

    /* renamed from: e */
    private final y0.d f18738e;

    /* renamed from: e0 */
    private final long f18739e0;

    /* renamed from: f */
    private final y0.b f18740f;

    /* renamed from: f0 */
    private final long f18741f0;

    /* renamed from: g */
    private final io.grpc.internal.j f18742g;

    /* renamed from: g0 */
    private final boolean f18743g0;

    /* renamed from: h */
    private final io.grpc.internal.t f18744h;

    /* renamed from: h0 */
    private final j1.a f18745h0;

    /* renamed from: i */
    private final io.grpc.internal.t f18746i;

    /* renamed from: i0 */
    final v0<Object> f18747i0;

    /* renamed from: j */
    private final io.grpc.internal.t f18748j;

    /* renamed from: j0 */
    private k1.d f18749j0;

    /* renamed from: k */
    private final r f18750k;

    /* renamed from: k0 */
    private io.grpc.internal.k f18751k0;

    /* renamed from: l */
    private final Executor f18752l;

    /* renamed from: l0 */
    private final p.e f18753l0;

    /* renamed from: m */
    private final o1<? extends Executor> f18754m;

    /* renamed from: m0 */
    private final x1 f18755m0;

    /* renamed from: n */
    private final o1<? extends Executor> f18756n;

    /* renamed from: o */
    private final k f18757o;

    /* renamed from: p */
    private final k f18758p;

    /* renamed from: q */
    private final k2 f18759q;

    /* renamed from: r */
    private final int f18760r;

    /* renamed from: s */
    final vi.k1 f18761s;

    /* renamed from: t */
    private boolean f18762t;

    /* renamed from: u */
    private final vi.v f18763u;

    /* renamed from: v */
    private final vi.o f18764v;

    /* renamed from: w */
    private final eb.v<eb.t> f18765w;

    /* renamed from: x */
    private final long f18766x;

    /* renamed from: y */
    private final w f18767y;

    /* renamed from: z */
    private final k.a f18768z;

    /* loaded from: classes3.dex */
    public class a extends vi.e0 {
        a() {
        }

        @Override // vi.e0
        public e0.b a(p0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b implements m.b {

        /* renamed from: a */
        final /* synthetic */ k2 f18769a;

        b(k2 k2Var) {
            this.f18769a = k2Var;
        }

        @Override // io.grpc.internal.m.b
        public io.grpc.internal.m a() {
            return new io.grpc.internal.m(this.f18769a);
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends p0.i {

        /* renamed from: a */
        private final p0.e f18771a;

        /* renamed from: b */
        final /* synthetic */ Throwable f18772b;

        c(Throwable th2) {
            this.f18772b = th2;
            this.f18771a = p0.e.e(vi.g1.f29114t.r("Panic! This is a bug!").q(th2));
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return this.f18771a;
        }

        public String toString() {
            return eb.i.b(c.class).d("panicPickResult", this.f18771a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Thread.UncaughtExceptionHandler {
        d() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            f1.f18722n0.log(Level.SEVERE, "[" + f1.this.e() + "] Uncaught exception in the SynchronizationContext. Panic!", th2);
            f1.this.A0(th2);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends m0 {

        /* renamed from: b */
        final /* synthetic */ String f18775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(vi.y0 y0Var, String str) {
            super(y0Var);
            this.f18775b = str;
        }

        @Override // vi.y0
        public String a() {
            return this.f18775b;
        }
    }

    /* loaded from: classes3.dex */
    class f extends vi.g<Object, Object> {
        f() {
        }

        @Override // vi.g
        public void a(String str, Throwable th2) {
        }

        @Override // vi.g
        public void b() {
        }

        @Override // vi.g
        public void c(int i10) {
        }

        @Override // vi.g
        public void d(Object obj) {
        }

        @Override // vi.g
        public void e(g.a<Object> aVar, vi.w0 w0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class g implements p.e {

        /* loaded from: classes3.dex */
        public final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.u0();
            }
        }

        /* loaded from: classes3.dex */
        final class b<ReqT> extends y1<ReqT> {
            final /* synthetic */ vi.x0 E;
            final /* synthetic */ vi.w0 F;
            final /* synthetic */ vi.c G;
            final /* synthetic */ z1 H;
            final /* synthetic */ s0 I;
            final /* synthetic */ y1.c0 J;
            final /* synthetic */ vi.r K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(vi.x0 x0Var, vi.w0 w0Var, vi.c cVar, z1 z1Var, s0 s0Var, y1.c0 c0Var, vi.r rVar) {
                super(x0Var, w0Var, f1.this.f18737d0, f1.this.f18739e0, f1.this.f18741f0, f1.this.v0(cVar), f1.this.f18746i.l0(), z1Var, s0Var, c0Var);
                this.E = x0Var;
                this.F = w0Var;
                this.G = cVar;
                this.H = z1Var;
                this.I = s0Var;
                this.J = c0Var;
                this.K = rVar;
            }

            @Override // io.grpc.internal.y1
            io.grpc.internal.q i0(vi.w0 w0Var, k.a aVar, int i10, boolean z10) {
                vi.c r10 = this.G.r(aVar);
                vi.k[] f10 = q0.f(r10, w0Var, i10, z10);
                io.grpc.internal.s c10 = g.this.c(new s1(this.E, w0Var, r10));
                vi.r b10 = this.K.b();
                try {
                    return c10.c(this.E, w0Var, r10, f10);
                } finally {
                    this.K.f(b10);
                }
            }

            @Override // io.grpc.internal.y1
            void j0() {
                f1.this.M.c(this);
            }

            @Override // io.grpc.internal.y1
            vi.g1 k0() {
                return f1.this.M.a(this);
            }
        }

        private g() {
        }

        /* synthetic */ g(f1 f1Var, a aVar) {
            this();
        }

        public io.grpc.internal.s c(p0.f fVar) {
            p0.i iVar = f1.this.F;
            if (!f1.this.N.get()) {
                if (iVar == null) {
                    f1.this.f18761s.execute(new a());
                } else {
                    io.grpc.internal.s j10 = q0.j(iVar.a(fVar), fVar.a().j());
                    if (j10 != null) {
                        return j10;
                    }
                }
            }
            return f1.this.L;
        }

        @Override // io.grpc.internal.p.e
        public io.grpc.internal.q a(vi.x0<?, ?> x0Var, vi.c cVar, vi.w0 w0Var, vi.r rVar) {
            if (f1.this.f18743g0) {
                y1.c0 g10 = f1.this.Z.g();
                i1.b bVar = (i1.b) cVar.h(i1.b.f18908g);
                return new b(x0Var, w0Var, cVar, bVar == null ? null : bVar.f18913e, bVar == null ? null : bVar.f18914f, g10, rVar);
            }
            io.grpc.internal.s c10 = c(new s1(x0Var, w0Var, cVar));
            vi.r b10 = rVar.b();
            try {
                return c10.c(x0Var, w0Var, cVar, q0.f(cVar, w0Var, 0, false));
            } finally {
                rVar.f(b10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h<ReqT, RespT> extends vi.y<ReqT, RespT> {

        /* renamed from: a */
        private final vi.e0 f18778a;

        /* renamed from: b */
        private final vi.d f18779b;

        /* renamed from: c */
        private final Executor f18780c;

        /* renamed from: d */
        private final vi.x0<ReqT, RespT> f18781d;

        /* renamed from: e */
        private final vi.r f18782e;

        /* renamed from: f */
        private vi.c f18783f;

        /* renamed from: g */
        private vi.g<ReqT, RespT> f18784g;

        /* loaded from: classes3.dex */
        public class a extends x {

            /* renamed from: b */
            final /* synthetic */ g.a f18785b;

            /* renamed from: c */
            final /* synthetic */ vi.g1 f18786c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g.a aVar, vi.g1 g1Var) {
                super(h.this.f18782e);
                this.f18785b = aVar;
                this.f18786c = g1Var;
            }

            @Override // io.grpc.internal.x
            public void a() {
                this.f18785b.a(this.f18786c, new vi.w0());
            }
        }

        h(vi.e0 e0Var, vi.d dVar, Executor executor, vi.x0<ReqT, RespT> x0Var, vi.c cVar) {
            this.f18778a = e0Var;
            this.f18779b = dVar;
            this.f18781d = x0Var;
            executor = cVar.e() != null ? cVar.e() : executor;
            this.f18780c = executor;
            this.f18783f = cVar.n(executor);
            this.f18782e = vi.r.e();
        }

        private void h(g.a<RespT> aVar, vi.g1 g1Var) {
            this.f18780c.execute(new a(aVar, g1Var));
        }

        @Override // vi.y, vi.b1, vi.g
        public void a(String str, Throwable th2) {
            vi.g<ReqT, RespT> gVar = this.f18784g;
            if (gVar != null) {
                gVar.a(str, th2);
            }
        }

        @Override // vi.y, vi.g
        public void e(g.a<RespT> aVar, vi.w0 w0Var) {
            e0.b a10 = this.f18778a.a(new s1(this.f18781d, w0Var, this.f18783f));
            vi.g1 c10 = a10.c();
            if (!c10.p()) {
                h(aVar, q0.n(c10));
                this.f18784g = f1.f18729u0;
                return;
            }
            vi.h b10 = a10.b();
            i1.b f10 = ((i1) a10.a()).f(this.f18781d);
            if (f10 != null) {
                this.f18783f = this.f18783f.q(i1.b.f18908g, f10);
            }
            this.f18784g = b10 != null ? b10.a(this.f18781d, this.f18783f, this.f18779b) : this.f18779b.h(this.f18781d, this.f18783f);
            this.f18784g.e(aVar, w0Var);
        }

        @Override // vi.y, vi.b1
        protected vi.g<ReqT, RespT> f() {
            return this.f18784g;
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.f18749j0 = null;
            f1.this.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class j implements j1.a {
        private j() {
        }

        /* synthetic */ j(f1 f1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.j1.a
        public void a() {
        }

        @Override // io.grpc.internal.j1.a
        public void b(boolean z10) {
            f1 f1Var = f1.this;
            f1Var.f18747i0.e(f1Var.L, z10);
        }

        @Override // io.grpc.internal.j1.a
        public void c() {
            eb.o.v(f1.this.N.get(), "Channel must have been shut down");
            f1.this.P = true;
            f1.this.E0(false);
            f1.this.y0();
            f1.this.z0();
        }

        @Override // io.grpc.internal.j1.a
        public void d(vi.g1 g1Var) {
            eb.o.v(f1.this.N.get(), "Channel must have been shut down");
        }
    }

    /* loaded from: classes3.dex */
    public static final class k implements Executor {

        /* renamed from: a */
        private final o1<? extends Executor> f18790a;

        /* renamed from: b */
        private Executor f18791b;

        k(o1<? extends Executor> o1Var) {
            this.f18790a = (o1) eb.o.p(o1Var, "executorPool");
        }

        synchronized Executor a() {
            if (this.f18791b == null) {
                this.f18791b = (Executor) eb.o.q(this.f18790a.a(), "%s.getObject()", this.f18791b);
            }
            return this.f18791b;
        }

        synchronized void b() {
            Executor executor = this.f18791b;
            if (executor != null) {
                this.f18791b = this.f18790a.b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class l extends v0<Object> {
        private l() {
        }

        /* synthetic */ l(f1 f1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            f1.this.u0();
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            if (f1.this.N.get()) {
                return;
            }
            f1.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private m() {
        }

        /* synthetic */ m(f1 f1Var, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f1.this.E == null) {
                return;
            }
            f1.this.t0();
        }
    }

    /* loaded from: classes3.dex */
    public final class n extends p0.d {

        /* renamed from: a */
        j.b f18794a;

        /* loaded from: classes3.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.B0();
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ p0.i f18797a;

            /* renamed from: b */
            final /* synthetic */ vi.p f18798b;

            b(p0.i iVar, vi.p pVar) {
                this.f18797a = iVar;
                this.f18798b = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                n nVar = n.this;
                if (nVar != f1.this.E) {
                    return;
                }
                f1.this.F0(this.f18797a);
                if (this.f18798b != vi.p.SHUTDOWN) {
                    f1.this.V.b(f.a.INFO, "Entering {0} state with picker: {1}", this.f18798b, this.f18797a);
                    f1.this.f18767y.a(this.f18798b);
                }
            }
        }

        private n() {
        }

        /* synthetic */ n(f1 f1Var, a aVar) {
            this();
        }

        @Override // vi.p0.d
        public vi.f b() {
            return f1.this.V;
        }

        @Override // vi.p0.d
        public ScheduledExecutorService c() {
            return f1.this.f18750k;
        }

        @Override // vi.p0.d
        public vi.k1 d() {
            return f1.this.f18761s;
        }

        @Override // vi.p0.d
        public void e() {
            f1.this.f18761s.e();
            f1.this.f18761s.execute(new a());
        }

        @Override // vi.p0.d
        public void f(vi.p pVar, p0.i iVar) {
            f1.this.f18761s.e();
            eb.o.p(pVar, "newState");
            eb.o.p(iVar, "newPicker");
            f1.this.f18761s.execute(new b(iVar, pVar));
        }

        @Override // vi.p0.d
        /* renamed from: g */
        public io.grpc.internal.e a(p0.b bVar) {
            f1.this.f18761s.e();
            eb.o.v(!f1.this.P, "Channel is being terminated");
            return new s(bVar, this);
        }
    }

    /* loaded from: classes3.dex */
    public final class o extends y0.e {

        /* renamed from: a */
        final n f18800a;

        /* renamed from: b */
        final vi.y0 f18801b;

        /* loaded from: classes3.dex */
        public final class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ vi.g1 f18803a;

            a(vi.g1 g1Var) {
                this.f18803a = g1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f(this.f18803a);
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ y0.g f18805a;

            b(y0.g gVar) {
                this.f18805a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 562
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.f1.o.b.run():void");
            }
        }

        o(n nVar, vi.y0 y0Var) {
            this.f18800a = (n) eb.o.p(nVar, "helperImpl");
            this.f18801b = (vi.y0) eb.o.p(y0Var, "resolver");
        }

        public void f(vi.g1 g1Var) {
            f1.f18722n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{f1.this.e(), g1Var});
            f1.this.X.m();
            q qVar = f1.this.Y;
            q qVar2 = q.ERROR;
            if (qVar != qVar2) {
                f1.this.V.b(f.a.WARNING, "Failed to resolve name: {0}", g1Var);
                f1.this.Y = qVar2;
            }
            if (this.f18800a != f1.this.E) {
                return;
            }
            this.f18800a.f18794a.b(g1Var);
            g();
        }

        public void g() {
            if (f1.this.f18749j0 == null || !f1.this.f18749j0.b()) {
                if (f1.this.f18751k0 == null) {
                    f1 f1Var = f1.this;
                    f1Var.f18751k0 = f1Var.f18768z.get();
                }
                long a10 = f1.this.f18751k0.a();
                f1.this.V.b(f.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a10));
                f1 f1Var2 = f1.this;
                f1Var2.f18749j0 = f1Var2.f18761s.c(new i(), a10, TimeUnit.NANOSECONDS, f1.this.f18746i.l0());
            }
        }

        @Override // vi.y0.e, vi.y0.f
        public void b(vi.g1 g1Var) {
            eb.o.e(!g1Var.p(), "the error status must not be OK");
            f1.this.f18761s.execute(new a(g1Var));
        }

        @Override // vi.y0.e
        public void c(y0.g gVar) {
            f1.this.f18761s.execute(new b(gVar));
        }
    }

    /* loaded from: classes3.dex */
    public class p extends vi.d {

        /* renamed from: a */
        private final AtomicReference<vi.e0> f18807a;

        /* renamed from: b */
        private final String f18808b;

        /* renamed from: c */
        private final vi.d f18809c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends vi.d {
            a() {
            }

            @Override // vi.d
            public String a() {
                return p.this.f18808b;
            }

            @Override // vi.d
            public <RequestT, ResponseT> vi.g<RequestT, ResponseT> h(vi.x0<RequestT, ResponseT> x0Var, vi.c cVar) {
                return new io.grpc.internal.p(x0Var, f1.this.v0(cVar), cVar, f1.this.f18753l0, f1.this.Q ? null : f1.this.f18746i.l0(), f1.this.T, null).C(f1.this.f18762t).B(f1.this.f18763u).A(f1.this.f18764v);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.u0();
            }
        }

        /* loaded from: classes3.dex */
        class c<ReqT, RespT> extends vi.g<ReqT, RespT> {
            c() {
            }

            @Override // vi.g
            public void a(String str, Throwable th2) {
            }

            @Override // vi.g
            public void b() {
            }

            @Override // vi.g
            public void c(int i10) {
            }

            @Override // vi.g
            public void d(ReqT reqt) {
            }

            @Override // vi.g
            public void e(g.a<RespT> aVar, vi.w0 w0Var) {
                aVar.a(f1.f18725q0, new vi.w0());
            }
        }

        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ e f18814a;

            d(e eVar) {
                this.f18814a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (p.this.f18807a.get() != f1.f18728t0) {
                    this.f18814a.r();
                    return;
                }
                if (f1.this.I == null) {
                    f1.this.I = new LinkedHashSet();
                    f1 f1Var = f1.this;
                    f1Var.f18747i0.e(f1Var.J, true);
                }
                f1.this.I.add(this.f18814a);
            }
        }

        /* loaded from: classes3.dex */
        public final class e<ReqT, RespT> extends z<ReqT, RespT> {

            /* renamed from: l */
            final vi.r f18816l;

            /* renamed from: m */
            final vi.x0<ReqT, RespT> f18817m;

            /* renamed from: n */
            final vi.c f18818n;

            /* loaded from: classes3.dex */
            public class a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Runnable f18820a;

                a(Runnable runnable) {
                    this.f18820a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f18820a.run();
                    e eVar = e.this;
                    f1.this.f18761s.execute(new b());
                }
            }

            /* loaded from: classes3.dex */
            public final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (f1.this.I != null) {
                        f1.this.I.remove(e.this);
                        if (f1.this.I.isEmpty()) {
                            f1 f1Var = f1.this;
                            f1Var.f18747i0.e(f1Var.J, false);
                            f1.this.I = null;
                            if (f1.this.N.get()) {
                                f1.this.M.b(f1.f18725q0);
                            }
                        }
                    }
                }
            }

            e(vi.r rVar, vi.x0<ReqT, RespT> x0Var, vi.c cVar) {
                super(f1.this.v0(cVar), f1.this.f18750k, cVar.d());
                this.f18816l = rVar;
                this.f18817m = x0Var;
                this.f18818n = cVar;
            }

            @Override // io.grpc.internal.z
            public void j() {
                super.j();
                f1.this.f18761s.execute(new b());
            }

            void r() {
                vi.r b10 = this.f18816l.b();
                try {
                    vi.g<ReqT, RespT> l10 = p.this.l(this.f18817m, this.f18818n);
                    this.f18816l.f(b10);
                    Runnable p10 = p(l10);
                    if (p10 == null) {
                        f1.this.f18761s.execute(new b());
                    } else {
                        f1.this.v0(this.f18818n).execute(new a(p10));
                    }
                } catch (Throwable th2) {
                    this.f18816l.f(b10);
                    throw th2;
                }
            }
        }

        private p(String str) {
            this.f18807a = new AtomicReference<>(f1.f18728t0);
            this.f18809c = new a();
            this.f18808b = (String) eb.o.p(str, "authority");
        }

        /* synthetic */ p(f1 f1Var, String str, a aVar) {
            this(str);
        }

        public <ReqT, RespT> vi.g<ReqT, RespT> l(vi.x0<ReqT, RespT> x0Var, vi.c cVar) {
            vi.e0 e0Var = this.f18807a.get();
            if (e0Var != null) {
                if (!(e0Var instanceof i1.c)) {
                    return new h(e0Var, this.f18809c, f1.this.f18752l, x0Var, cVar);
                }
                i1.b f10 = ((i1.c) e0Var).f18915b.f(x0Var);
                if (f10 != null) {
                    cVar = cVar.q(i1.b.f18908g, f10);
                }
            }
            return this.f18809c.h(x0Var, cVar);
        }

        @Override // vi.d
        public String a() {
            return this.f18808b;
        }

        @Override // vi.d
        public <ReqT, RespT> vi.g<ReqT, RespT> h(vi.x0<ReqT, RespT> x0Var, vi.c cVar) {
            if (this.f18807a.get() != f1.f18728t0) {
                return l(x0Var, cVar);
            }
            f1.this.f18761s.execute(new b());
            if (this.f18807a.get() != f1.f18728t0) {
                return l(x0Var, cVar);
            }
            if (f1.this.N.get()) {
                return new c();
            }
            e eVar = new e(vi.r.e(), x0Var, cVar);
            f1.this.f18761s.execute(new d(eVar));
            return eVar;
        }

        void m() {
            if (this.f18807a.get() == f1.f18728t0) {
                n(null);
            }
        }

        void n(vi.e0 e0Var) {
            vi.e0 e0Var2 = this.f18807a.get();
            this.f18807a.set(e0Var);
            if (e0Var2 != f1.f18728t0 || f1.this.I == null) {
                return;
            }
            Iterator it = f1.this.I.iterator();
            while (it.hasNext()) {
                ((e) it.next()).r();
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum q {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class r implements ScheduledExecutorService {

        /* renamed from: a */
        final ScheduledExecutorService f18823a;

        private r(ScheduledExecutorService scheduledExecutorService) {
            this.f18823a = (ScheduledExecutorService) eb.o.p(scheduledExecutorService, "delegate");
        }

        /* synthetic */ r(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f18823a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f18823a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f18823a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return this.f18823a.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f18823a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return (T) this.f18823a.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f18823a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f18823a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f18823a.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f18823a.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f18823a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f18823a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f18823a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t10) {
            return this.f18823a.submit(runnable, t10);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f18823a.submit(callable);
        }
    }

    /* loaded from: classes3.dex */
    public final class s extends io.grpc.internal.e {

        /* renamed from: a */
        final p0.b f18824a;

        /* renamed from: b */
        final n f18825b;

        /* renamed from: c */
        final vi.i0 f18826c;

        /* renamed from: d */
        final io.grpc.internal.n f18827d;

        /* renamed from: e */
        final io.grpc.internal.o f18828e;

        /* renamed from: f */
        List<vi.x> f18829f;

        /* renamed from: g */
        x0 f18830g;

        /* renamed from: h */
        boolean f18831h;

        /* renamed from: i */
        boolean f18832i;

        /* renamed from: j */
        k1.d f18833j;

        /* loaded from: classes3.dex */
        final class a extends x0.j {

            /* renamed from: a */
            final /* synthetic */ p0.j f18835a;

            a(p0.j jVar) {
                this.f18835a = jVar;
            }

            @Override // io.grpc.internal.x0.j
            void a(x0 x0Var) {
                f1.this.f18747i0.e(x0Var, true);
            }

            @Override // io.grpc.internal.x0.j
            void b(x0 x0Var) {
                f1.this.f18747i0.e(x0Var, false);
            }

            @Override // io.grpc.internal.x0.j
            void c(x0 x0Var, vi.q qVar) {
                eb.o.v(this.f18835a != null, "listener is null");
                this.f18835a.a(qVar);
            }

            @Override // io.grpc.internal.x0.j
            void d(x0 x0Var) {
                f1.this.H.remove(x0Var);
                f1.this.W.k(x0Var);
                f1.this.z0();
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                s.this.f18830g.d(f1.f18726r0);
            }
        }

        s(p0.b bVar, n nVar) {
            eb.o.p(bVar, "args");
            this.f18829f = bVar.a();
            if (f1.this.f18734c != null) {
                bVar = bVar.d().d(i(bVar.a())).b();
            }
            this.f18824a = bVar;
            this.f18825b = (n) eb.o.p(nVar, "helper");
            vi.i0 b10 = vi.i0.b("Subchannel", f1.this.a());
            this.f18826c = b10;
            io.grpc.internal.o oVar = new io.grpc.internal.o(b10, f1.this.f18760r, f1.this.f18759q.a(), "Subchannel for " + bVar.a());
            this.f18828e = oVar;
            this.f18827d = new io.grpc.internal.n(oVar, f1.this.f18759q);
        }

        private List<vi.x> i(List<vi.x> list) {
            ArrayList arrayList = new ArrayList();
            for (vi.x xVar : list) {
                arrayList.add(new vi.x(xVar.a(), xVar.b().d().c(vi.x.f29239d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // vi.p0.h
        public List<vi.x> b() {
            f1.this.f18761s.e();
            eb.o.v(this.f18831h, "not started");
            return this.f18829f;
        }

        @Override // vi.p0.h
        public vi.a c() {
            return this.f18824a.b();
        }

        @Override // vi.p0.h
        public Object d() {
            eb.o.v(this.f18831h, "Subchannel is not started");
            return this.f18830g;
        }

        @Override // vi.p0.h
        public void e() {
            f1.this.f18761s.e();
            eb.o.v(this.f18831h, "not started");
            this.f18830g.a();
        }

        @Override // vi.p0.h
        public void f() {
            k1.d dVar;
            f1.this.f18761s.e();
            if (this.f18830g == null) {
                this.f18832i = true;
                return;
            }
            if (!this.f18832i) {
                this.f18832i = true;
            } else {
                if (!f1.this.P || (dVar = this.f18833j) == null) {
                    return;
                }
                dVar.a();
                this.f18833j = null;
            }
            if (f1.this.P) {
                this.f18830g.d(f1.f18725q0);
            } else {
                this.f18833j = f1.this.f18761s.c(new c1(new b()), 5L, TimeUnit.SECONDS, f1.this.f18746i.l0());
            }
        }

        @Override // vi.p0.h
        public void g(p0.j jVar) {
            f1.this.f18761s.e();
            eb.o.v(!this.f18831h, "already started");
            eb.o.v(!this.f18832i, "already shutdown");
            eb.o.v(!f1.this.P, "Channel is being terminated");
            this.f18831h = true;
            x0 x0Var = new x0(this.f18824a.a(), f1.this.a(), f1.this.B, f1.this.f18768z, f1.this.f18746i, f1.this.f18746i.l0(), f1.this.f18765w, f1.this.f18761s, new a(jVar), f1.this.W, f1.this.S.a(), this.f18828e, this.f18826c, this.f18827d);
            f1.this.U.e(new d0.a().b("Child Subchannel started").c(d0.b.CT_INFO).e(f1.this.f18759q.a()).d(x0Var).a());
            this.f18830g = x0Var;
            f1.this.W.e(x0Var);
            f1.this.H.add(x0Var);
        }

        @Override // vi.p0.h
        public void h(List<vi.x> list) {
            f1.this.f18761s.e();
            this.f18829f = list;
            if (f1.this.f18734c != null) {
                list = i(list);
            }
            this.f18830g.T(list);
        }

        public String toString() {
            return this.f18826c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class t {

        /* renamed from: a */
        final Object f18838a;

        /* renamed from: b */
        Collection<io.grpc.internal.q> f18839b;

        /* renamed from: c */
        vi.g1 f18840c;

        private t() {
            this.f18838a = new Object();
            this.f18839b = new HashSet();
        }

        /* synthetic */ t(f1 f1Var, a aVar) {
            this();
        }

        vi.g1 a(y1<?> y1Var) {
            synchronized (this.f18838a) {
                vi.g1 g1Var = this.f18840c;
                if (g1Var != null) {
                    return g1Var;
                }
                this.f18839b.add(y1Var);
                return null;
            }
        }

        void b(vi.g1 g1Var) {
            synchronized (this.f18838a) {
                if (this.f18840c != null) {
                    return;
                }
                this.f18840c = g1Var;
                boolean isEmpty = this.f18839b.isEmpty();
                if (isEmpty) {
                    f1.this.L.d(g1Var);
                }
            }
        }

        void c(y1<?> y1Var) {
            vi.g1 g1Var;
            synchronized (this.f18838a) {
                this.f18839b.remove(y1Var);
                if (this.f18839b.isEmpty()) {
                    g1Var = this.f18840c;
                    this.f18839b = new HashSet();
                } else {
                    g1Var = null;
                }
            }
            if (g1Var != null) {
                f1.this.L.d(g1Var);
            }
        }
    }

    static {
        vi.g1 g1Var = vi.g1.f29115u;
        f18724p0 = g1Var.r("Channel shutdownNow invoked");
        f18725q0 = g1Var.r("Channel shutdown invoked");
        f18726r0 = g1Var.r("Subchannel shutdown invoked");
        f18727s0 = i1.a();
        f18728t0 = new a();
        f18729u0 = new f();
    }

    public f1(g1 g1Var, io.grpc.internal.t tVar, k.a aVar, o1<? extends Executor> o1Var, eb.v<eb.t> vVar, List<vi.h> list, k2 k2Var) {
        a aVar2;
        vi.k1 k1Var = new vi.k1(new d());
        this.f18761s = k1Var;
        this.f18767y = new w();
        this.H = new HashSet(16, 0.75f);
        this.J = new Object();
        this.K = new HashSet(1, 0.75f);
        this.M = new t(this, null);
        this.N = new AtomicBoolean(false);
        this.R = new CountDownLatch(1);
        this.Y = q.NO_RESOLUTION;
        this.Z = f18727s0;
        this.f18733b0 = false;
        this.f18737d0 = new y1.t();
        j jVar = new j(this, null);
        this.f18745h0 = jVar;
        this.f18747i0 = new l(this, null);
        this.f18753l0 = new g(this, null);
        String str = (String) eb.o.p(g1Var.f18859f, "target");
        this.f18732b = str;
        vi.i0 b10 = vi.i0.b("Channel", str);
        this.f18730a = b10;
        this.f18759q = (k2) eb.o.p(k2Var, "timeProvider");
        o1<? extends Executor> o1Var2 = (o1) eb.o.p(g1Var.f18854a, "executorPool");
        this.f18754m = o1Var2;
        Executor executor = (Executor) eb.o.p(o1Var2.a(), "executor");
        this.f18752l = executor;
        this.f18744h = tVar;
        k kVar = new k((o1) eb.o.p(g1Var.f18855b, "offloadExecutorPool"));
        this.f18758p = kVar;
        io.grpc.internal.l lVar = new io.grpc.internal.l(tVar, g1Var.f18860g, kVar);
        this.f18746i = lVar;
        this.f18748j = new io.grpc.internal.l(tVar, null, kVar);
        r rVar = new r(lVar.l0(), null);
        this.f18750k = rVar;
        this.f18760r = g1Var.f18875v;
        io.grpc.internal.o oVar = new io.grpc.internal.o(b10, g1Var.f18875v, k2Var.a(), "Channel for '" + str + "'");
        this.U = oVar;
        io.grpc.internal.n nVar = new io.grpc.internal.n(oVar, k2Var);
        this.V = nVar;
        vi.d1 d1Var = g1Var.f18878y;
        d1Var = d1Var == null ? q0.f19097q : d1Var;
        boolean z10 = g1Var.f18873t;
        this.f18743g0 = z10;
        io.grpc.internal.j jVar2 = new io.grpc.internal.j(g1Var.f18864k);
        this.f18742g = jVar2;
        this.f18736d = g1Var.f18857d;
        a2 a2Var = new a2(z10, g1Var.f18869p, g1Var.f18870q, jVar2);
        String str2 = g1Var.f18863j;
        this.f18734c = str2;
        y0.b a10 = y0.b.f().c(g1Var.c()).f(d1Var).i(k1Var).g(rVar).h(a2Var).b(nVar).d(kVar).e(str2).a();
        this.f18740f = a10;
        y0.d dVar = g1Var.f18858e;
        this.f18738e = dVar;
        this.C = w0(str, str2, dVar, a10);
        this.f18756n = (o1) eb.o.p(o1Var, "balancerRpcExecutorPool");
        this.f18757o = new k(o1Var);
        a0 a0Var = new a0(executor, k1Var);
        this.L = a0Var;
        a0Var.g(jVar);
        this.f18768z = aVar;
        Map<String, ?> map = g1Var.f18876w;
        if (map != null) {
            y0.c a11 = a2Var.a(map);
            eb.o.y(a11.d() == null, "Default config is invalid: %s", a11.d());
            i1 i1Var = (i1) a11.c();
            this.f18731a0 = i1Var;
            this.Z = i1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f18731a0 = null;
        }
        boolean z11 = g1Var.f18877x;
        this.f18735c0 = z11;
        p pVar = new p(this, this.C.a(), aVar2);
        this.X = pVar;
        this.A = vi.j.a(pVar, list);
        this.f18765w = (eb.v) eb.o.p(vVar, "stopwatchSupplier");
        long j10 = g1Var.f18868o;
        if (j10 != -1) {
            eb.o.j(j10 >= g1.J, "invalid idleTimeoutMillis %s", j10);
            j10 = g1Var.f18868o;
        }
        this.f18766x = j10;
        this.f18755m0 = new x1(new m(this, null), k1Var, lVar.l0(), vVar.get());
        this.f18762t = g1Var.f18865l;
        this.f18763u = (vi.v) eb.o.p(g1Var.f18866m, "decompressorRegistry");
        this.f18764v = (vi.o) eb.o.p(g1Var.f18867n, "compressorRegistry");
        this.B = g1Var.f18862i;
        this.f18741f0 = g1Var.f18871r;
        this.f18739e0 = g1Var.f18872s;
        b bVar = new b(k2Var);
        this.S = bVar;
        this.T = bVar.a();
        vi.c0 c0Var = (vi.c0) eb.o.o(g1Var.f18874u);
        this.W = c0Var;
        c0Var.d(this);
        if (z11) {
            return;
        }
        if (this.f18731a0 != null) {
            nVar.a(f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f18733b0 = true;
    }

    public void B0() {
        this.f18761s.e();
        s0();
        C0();
    }

    public void C0() {
        this.f18761s.e();
        if (this.D) {
            this.C.b();
        }
    }

    public void D0() {
        long j10 = this.f18766x;
        if (j10 == -1) {
            return;
        }
        this.f18755m0.k(j10, TimeUnit.MILLISECONDS);
    }

    public void E0(boolean z10) {
        this.f18761s.e();
        if (z10) {
            eb.o.v(this.D, "nameResolver is not started");
            eb.o.v(this.E != null, "lbHelper is null");
        }
        if (this.C != null) {
            s0();
            this.C.c();
            this.D = false;
            if (z10) {
                this.C = w0(this.f18732b, this.f18734c, this.f18738e, this.f18740f);
            } else {
                this.C = null;
            }
        }
        n nVar = this.E;
        if (nVar != null) {
            nVar.f18794a.c();
            this.E = null;
        }
        this.F = null;
    }

    public void F0(p0.i iVar) {
        this.F = iVar;
        this.L.r(iVar);
    }

    private void r0(boolean z10) {
        this.f18755m0.i(z10);
    }

    private void s0() {
        this.f18761s.e();
        k1.d dVar = this.f18749j0;
        if (dVar != null) {
            dVar.a();
            this.f18749j0 = null;
            this.f18751k0 = null;
        }
    }

    public void t0() {
        E0(true);
        this.L.r(null);
        this.V.a(f.a.INFO, "Entering IDLE state");
        this.f18767y.a(vi.p.IDLE);
        if (this.f18747i0.a(this.J, this.L)) {
            u0();
        }
    }

    public Executor v0(vi.c cVar) {
        Executor e10 = cVar.e();
        return e10 == null ? this.f18752l : e10;
    }

    static vi.y0 w0(String str, String str2, y0.d dVar, y0.b bVar) {
        vi.y0 x02 = x0(str, dVar, bVar);
        return str2 == null ? x02 : new e(x02, str2);
    }

    private static vi.y0 x0(String str, y0.d dVar, y0.b bVar) {
        URI uri;
        vi.y0 b10;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        if (uri != null && (b10 = dVar.b(uri, bVar)) != null) {
            return b10;
        }
        String str2 = "";
        if (!f18723o0.matcher(str).matches()) {
            try {
                vi.y0 b11 = dVar.b(new URI(dVar.a(), "", "/" + str, null), bVar);
                if (b11 != null) {
                    return b11;
                }
            } catch (URISyntaxException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb2.length() > 0) {
            str2 = " (" + ((Object) sb2) + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    public void y0() {
        if (this.O) {
            Iterator<x0> it = this.H.iterator();
            while (it.hasNext()) {
                it.next().b(f18724p0);
            }
            Iterator<p1> it2 = this.K.iterator();
            while (it2.hasNext()) {
                it2.next().i().b(f18724p0);
            }
        }
    }

    public void z0() {
        if (!this.Q && this.N.get() && this.H.isEmpty() && this.K.isEmpty()) {
            this.V.a(f.a.INFO, "Terminated");
            this.W.j(this);
            this.f18754m.b(this.f18752l);
            this.f18757o.b();
            this.f18758p.b();
            this.f18746i.close();
            this.Q = true;
            this.R.countDown();
        }
    }

    void A0(Throwable th2) {
        if (this.G) {
            return;
        }
        this.G = true;
        r0(true);
        E0(false);
        F0(new c(th2));
        this.X.n(null);
        this.V.a(f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f18767y.a(vi.p.TRANSIENT_FAILURE);
    }

    @Override // vi.d
    public String a() {
        return this.A.a();
    }

    @Override // vi.n0
    public vi.i0 e() {
        return this.f18730a;
    }

    @Override // vi.d
    public <ReqT, RespT> vi.g<ReqT, RespT> h(vi.x0<ReqT, RespT> x0Var, vi.c cVar) {
        return this.A.h(x0Var, cVar);
    }

    public String toString() {
        return eb.i.c(this).c("logId", this.f18730a.d()).d("target", this.f18732b).toString();
    }

    void u0() {
        this.f18761s.e();
        if (this.N.get() || this.G) {
            return;
        }
        if (this.f18747i0.d()) {
            r0(false);
        } else {
            D0();
        }
        if (this.E != null) {
            return;
        }
        this.V.a(f.a.INFO, "Exiting idle mode");
        n nVar = new n(this, null);
        nVar.f18794a = this.f18742g.e(nVar);
        this.E = nVar;
        this.C.d(new o(nVar, this.C));
        this.D = true;
    }
}
