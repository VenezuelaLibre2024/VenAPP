package io.grpc.internal;

import io.grpc.internal.AbstractC8915y1;
import io.grpc.internal.C8859i1;
import io.grpc.internal.C8861j;
import io.grpc.internal.C8873m;
import io.grpc.internal.C8885p;
import io.grpc.internal.C8911x0;
import io.grpc.internal.InterfaceC8863j1;
import io.grpc.internal.InterfaceC8865k;
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
import p082eb.C7153i;
import p082eb.C7159o;
import p082eb.C7164t;
import p082eb.InterfaceC7166v;
import vi.AbstractC11904d;
import vi.AbstractC11908e0;
import vi.AbstractC11910f;
import vi.AbstractC11913g;
import vi.AbstractC11925k;
import vi.AbstractC11939p0;
import vi.AbstractC11945s0;
import vi.AbstractC11956y;
import vi.AbstractC11957y0;
import vi.C11895a;
import vi.C11897a1;
import vi.C11901c;
import vi.C11902c0;
import vi.C11905d0;
import vi.C11915g1;
import vi.C11920i0;
import vi.C11922j;
import vi.C11936o;
import vi.C11940q;
import vi.C11942r;
import vi.C11950v;
import vi.C11953w0;
import vi.C11954x;
import vi.C11955x0;
import vi.EnumC11938p;
import vi.ExecutorC11927k1;
import vi.InterfaceC11906d1;
import vi.InterfaceC11916h;
import vi.InterfaceC11917h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.f1 */
/* loaded from: classes3.dex */
public final class C8847f1 extends AbstractC11945s0 implements InterfaceC11917h0<Object> {

    /* renamed from: n0 */
    static final Logger f20418n0 = Logger.getLogger(C8847f1.class.getName());

    /* renamed from: o0 */
    static final Pattern f20419o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0 */
    static final C11915g1 f20420p0;

    /* renamed from: q0 */
    static final C11915g1 f20421q0;

    /* renamed from: r0 */
    static final C11915g1 f20422r0;

    /* renamed from: s0 */
    private static final C8859i1 f20423s0;

    /* renamed from: t0 */
    private static final AbstractC11908e0 f20424t0;

    /* renamed from: u0 */
    private static final AbstractC11913g<Object, Object> f20425u0;

    /* renamed from: A */
    private final AbstractC11904d f20426A;

    /* renamed from: B */
    private final String f20427B;

    /* renamed from: C */
    private AbstractC11957y0 f20428C;

    /* renamed from: D */
    private boolean f20429D;

    /* renamed from: E */
    private n f20430E;

    /* renamed from: F */
    private volatile AbstractC11939p0.i f20431F;

    /* renamed from: G */
    private boolean f20432G;

    /* renamed from: H */
    private final Set<C8911x0> f20433H;

    /* renamed from: I */
    private Collection<p.e<?, ?>> f20434I;

    /* renamed from: J */
    private final Object f20435J;

    /* renamed from: K */
    private final Set<C8887p1> f20436K;

    /* renamed from: L */
    private final C8826a0 f20437L;

    /* renamed from: M */
    private final t f20438M;

    /* renamed from: N */
    private final AtomicBoolean f20439N;

    /* renamed from: O */
    private boolean f20440O;

    /* renamed from: P */
    private boolean f20441P;

    /* renamed from: Q */
    private volatile boolean f20442Q;

    /* renamed from: R */
    private final CountDownLatch f20443R;

    /* renamed from: S */
    private final C8873m.b f20444S;

    /* renamed from: T */
    private final C8873m f20445T;

    /* renamed from: U */
    private final C8881o f20446U;

    /* renamed from: V */
    private final AbstractC11910f f20447V;

    /* renamed from: W */
    private final C11902c0 f20448W;

    /* renamed from: X */
    private final p f20449X;

    /* renamed from: Y */
    private q f20450Y;

    /* renamed from: Z */
    private C8859i1 f20451Z;

    /* renamed from: a */
    private final C11920i0 f20452a;

    /* renamed from: a0 */
    private final C8859i1 f20453a0;

    /* renamed from: b */
    private final String f20454b;

    /* renamed from: b0 */
    private boolean f20455b0;

    /* renamed from: c */
    private final String f20456c;

    /* renamed from: c0 */
    private final boolean f20457c0;

    /* renamed from: d */
    private final C11897a1 f20458d;

    /* renamed from: d0 */
    private final AbstractC8915y1.t f20459d0;

    /* renamed from: e */
    private final AbstractC11957y0.d f20460e;

    /* renamed from: e0 */
    private final long f20461e0;

    /* renamed from: f */
    private final AbstractC11957y0.b f20462f;

    /* renamed from: f0 */
    private final long f20463f0;

    /* renamed from: g */
    private final C8861j f20464g;

    /* renamed from: g0 */
    private final boolean f20465g0;

    /* renamed from: h */
    private final InterfaceC8898t f20466h;

    /* renamed from: h0 */
    private final InterfaceC8863j1.a f20467h0;

    /* renamed from: i */
    private final InterfaceC8898t f20468i;

    /* renamed from: i0 */
    final AbstractC8905v0<Object> f20469i0;

    /* renamed from: j */
    private final InterfaceC8898t f20470j;

    /* renamed from: j0 */
    private ExecutorC11927k1.d f20471j0;

    /* renamed from: k */
    private final r f20472k;

    /* renamed from: k0 */
    private InterfaceC8865k f20473k0;

    /* renamed from: l */
    private final Executor f20474l;

    /* renamed from: l0 */
    private final C8885p.e f20475l0;

    /* renamed from: m */
    private final InterfaceC8883o1<? extends Executor> f20476m;

    /* renamed from: m0 */
    private final C8912x1 f20477m0;

    /* renamed from: n */
    private final InterfaceC8883o1<? extends Executor> f20478n;

    /* renamed from: o */
    private final k f20479o;

    /* renamed from: p */
    private final k f20480p;

    /* renamed from: q */
    private final InterfaceC8868k2 f20481q;

    /* renamed from: r */
    private final int f20482r;

    /* renamed from: s */
    final ExecutorC11927k1 f20483s;

    /* renamed from: t */
    private boolean f20484t;

    /* renamed from: u */
    private final C11950v f20485u;

    /* renamed from: v */
    private final C11936o f20486v;

    /* renamed from: w */
    private final InterfaceC7166v<C7164t> f20487w;

    /* renamed from: x */
    private final long f20488x;

    /* renamed from: y */
    private final C8907w f20489y;

    /* renamed from: z */
    private final InterfaceC8865k.a f20490z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC11908e0 {
        a() {
        }

        @Override // vi.AbstractC11908e0
        /* renamed from: a */
        public AbstractC11908e0.b mo25520a(AbstractC11939p0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* renamed from: io.grpc.internal.f1$b */
    /* loaded from: classes3.dex */
    final class b implements C8873m.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8868k2 f20491a;

        b(InterfaceC8868k2 interfaceC8868k2) {
            this.f20491a = interfaceC8868k2;
        }

        @Override // io.grpc.internal.C8873m.b
        /* renamed from: a */
        public C8873m mo25521a() {
            return new C8873m(this.f20491a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$c */
    /* loaded from: classes3.dex */
    public final class c extends AbstractC11939p0.i {

        /* renamed from: a */
        private final AbstractC11939p0.e f20493a;

        /* renamed from: b */
        final /* synthetic */ Throwable f20494b;

        c(Throwable th2) {
            this.f20494b = th2;
            this.f20493a = AbstractC11939p0.e.m38218e(C11915g1.f31548t.m38147r("Panic! This is a bug!").m38146q(th2));
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return this.f20493a;
        }

        public String toString() {
            return C7153i.m21273b(c.class).m21284d("panicPickResult", this.f20493a).toString();
        }
    }

    /* renamed from: io.grpc.internal.f1$d */
    /* loaded from: classes3.dex */
    class d implements Thread.UncaughtExceptionHandler {
        d() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            C8847f1.f20418n0.log(Level.SEVERE, "[" + C8847f1.this.mo25247e() + "] Uncaught exception in the SynchronizationContext. Panic!", th2);
            C8847f1.this.m25516A0(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC8874m0 {

        /* renamed from: b */
        final /* synthetic */ String f20497b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC11957y0 abstractC11957y0, String str) {
            super(abstractC11957y0);
            this.f20497b = str;
        }

        @Override // vi.AbstractC11957y0
        /* renamed from: a */
        public String mo25342a() {
            return this.f20497b;
        }
    }

    /* renamed from: io.grpc.internal.f1$f */
    /* loaded from: classes3.dex */
    class f extends AbstractC11913g<Object, Object> {
        f() {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: a */
        public void mo25522a(String str, Throwable th2) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: b */
        public void mo25523b() {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: c */
        public void mo25524c(int i10) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: d */
        public void mo25525d(Object obj) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: e */
        public void mo603e(AbstractC11913g.a<Object> aVar, C11953w0 c11953w0) {
        }
    }

    /* renamed from: io.grpc.internal.f1$g */
    /* loaded from: classes3.dex */
    private final class g implements C8885p.e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.f1$g$a */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8847f1.this.m25519u0();
            }
        }

        /* renamed from: io.grpc.internal.f1$g$b */
        /* loaded from: classes3.dex */
        final class b<ReqT> extends AbstractC8915y1<ReqT> {

            /* renamed from: E */
            final /* synthetic */ C11955x0 f20500E;

            /* renamed from: F */
            final /* synthetic */ C11953w0 f20501F;

            /* renamed from: G */
            final /* synthetic */ C11901c f20502G;

            /* renamed from: H */
            final /* synthetic */ C8918z1 f20503H;

            /* renamed from: I */
            final /* synthetic */ C8896s0 f20504I;

            /* renamed from: J */
            final /* synthetic */ AbstractC8915y1.c0 f20505J;

            /* renamed from: K */
            final /* synthetic */ C11942r f20506K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C11955x0 c11955x0, C11953w0 c11953w0, C11901c c11901c, C8918z1 c8918z1, C8896s0 c8896s0, AbstractC8915y1.c0 c0Var, C11942r c11942r) {
                super(c11955x0, c11953w0, C8847f1.this.f20459d0, C8847f1.this.f20461e0, C8847f1.this.f20463f0, C8847f1.this.m25507v0(c11901c), C8847f1.this.f20468i.mo25643l0(), c8918z1, c8896s0, c0Var);
                this.f20500E = c11955x0;
                this.f20501F = c11953w0;
                this.f20502G = c11901c;
                this.f20503H = c8918z1;
                this.f20504I = c8896s0;
                this.f20505J = c0Var;
                this.f20506K = c11942r;
            }

            @Override // io.grpc.internal.AbstractC8915y1
            /* renamed from: i0 */
            InterfaceC8889q mo25529i0(C11953w0 c11953w0, AbstractC11925k.a aVar, int i10, boolean z10) {
                C11901c m38094r = this.f20502G.m38094r(aVar);
                AbstractC11925k[] m25749f = C8890q0.m25749f(m38094r, c11953w0, i10, z10);
                InterfaceC8895s m25527c = g.this.m25527c(new C8897s1(this.f20500E, c11953w0, m38094r));
                C11942r m38246b = this.f20506K.m38246b();
                try {
                    return m25527c.mo25245c(this.f20500E, c11953w0, m38094r, m25749f);
                } finally {
                    this.f20506K.m38248f(m38246b);
                }
            }

            @Override // io.grpc.internal.AbstractC8915y1
            /* renamed from: j0 */
            void mo25530j0() {
                C8847f1.this.f20438M.m25566c(this);
            }

            @Override // io.grpc.internal.AbstractC8915y1
            /* renamed from: k0 */
            C11915g1 mo25531k0() {
                return C8847f1.this.f20438M.m25564a(this);
            }
        }

        private g() {
        }

        /* synthetic */ g(C8847f1 c8847f1, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public InterfaceC8895s m25527c(AbstractC11939p0.f fVar) {
            AbstractC11939p0.i iVar = C8847f1.this.f20431F;
            if (!C8847f1.this.f20439N.get()) {
                if (iVar == null) {
                    C8847f1.this.f20483s.execute(new a());
                } else {
                    InterfaceC8895s m25753j = C8890q0.m25753j(iVar.mo9576a(fVar), fVar.mo25817a().m38087j());
                    if (m25753j != null) {
                        return m25753j;
                    }
                }
            }
            return C8847f1.this.f20437L;
        }

        @Override // io.grpc.internal.C8885p.e
        /* renamed from: a */
        public InterfaceC8889q mo25528a(C11955x0<?, ?> c11955x0, C11901c c11901c, C11953w0 c11953w0, C11942r c11942r) {
            if (C8847f1.this.f20465g0) {
                AbstractC8915y1.c0 m25611g = C8847f1.this.f20451Z.m25611g();
                C8859i1.b bVar = (C8859i1.b) c11901c.m38085h(C8859i1.b.f20651g);
                return new b(c11955x0, c11953w0, c11901c, bVar == null ? null : bVar.f20656e, bVar == null ? null : bVar.f20657f, m25611g, c11942r);
            }
            InterfaceC8895s m25527c = m25527c(new C8897s1(c11955x0, c11953w0, c11901c));
            C11942r m38246b = c11942r.m38246b();
            try {
                return m25527c.mo25245c(c11955x0, c11953w0, c11901c, C8890q0.m25749f(c11901c, c11953w0, 0, false));
            } finally {
                c11942r.m38248f(m38246b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$h */
    /* loaded from: classes3.dex */
    public static final class h<ReqT, RespT> extends AbstractC11956y<ReqT, RespT> {

        /* renamed from: a */
        private final AbstractC11908e0 f20508a;

        /* renamed from: b */
        private final AbstractC11904d f20509b;

        /* renamed from: c */
        private final Executor f20510c;

        /* renamed from: d */
        private final C11955x0<ReqT, RespT> f20511d;

        /* renamed from: e */
        private final C11942r f20512e;

        /* renamed from: f */
        private C11901c f20513f;

        /* renamed from: g */
        private AbstractC11913g<ReqT, RespT> f20514g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.f1$h$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractRunnableC8910x {

            /* renamed from: b */
            final /* synthetic */ AbstractC11913g.a f20515b;

            /* renamed from: c */
            final /* synthetic */ C11915g1 f20516c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC11913g.a aVar, C11915g1 c11915g1) {
                super(h.this.f20512e);
                this.f20515b = aVar;
                this.f20516c = c11915g1;
            }

            @Override // io.grpc.internal.AbstractRunnableC8910x
            /* renamed from: a */
            public void mo25535a() {
                this.f20515b.mo597a(this.f20516c, new C11953w0());
            }
        }

        h(AbstractC11908e0 abstractC11908e0, AbstractC11904d abstractC11904d, Executor executor, C11955x0<ReqT, RespT> c11955x0, C11901c c11901c) {
            this.f20508a = abstractC11908e0;
            this.f20509b = abstractC11904d;
            this.f20511d = c11955x0;
            executor = c11901c.m38082e() != null ? c11901c.m38082e() : executor;
            this.f20510c = executor;
            this.f20513f = c11901c.m38090n(executor);
            this.f20512e = C11942r.m38242e();
        }

        /* renamed from: h */
        private void m25533h(AbstractC11913g.a<RespT> aVar, C11915g1 c11915g1) {
            this.f20510c.execute(new a(aVar, c11915g1));
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1, vi.AbstractC11913g
        /* renamed from: a */
        public void mo25522a(String str, Throwable th2) {
            AbstractC11913g<ReqT, RespT> abstractC11913g = this.f20514g;
            if (abstractC11913g != null) {
                abstractC11913g.mo25522a(str, th2);
            }
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11913g
        /* renamed from: e */
        public void mo603e(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
            AbstractC11908e0.b mo25520a = this.f20508a.mo25520a(new C8897s1(this.f20511d, c11953w0, this.f20513f));
            C11915g1 m38120c = mo25520a.m38120c();
            if (!m38120c.m38145p()) {
                m25533h(aVar, C8890q0.m25757n(m38120c));
                this.f20514g = C8847f1.f20425u0;
                return;
            }
            InterfaceC11916h m38119b = mo25520a.m38119b();
            C8859i1.b m25610f = ((C8859i1) mo25520a.m38118a()).m25610f(this.f20511d);
            if (m25610f != null) {
                this.f20513f = this.f20513f.m38093q(C8859i1.b.f20651g, m25610f);
            }
            this.f20514g = m38119b != null ? m38119b.mo602a(this.f20511d, this.f20513f, this.f20509b) : this.f20509b.mo25518h(this.f20511d, this.f20513f);
            this.f20514g.mo603e(aVar, c11953w0);
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1
        /* renamed from: f */
        protected AbstractC11913g<ReqT, RespT> mo25534f() {
            return this.f20514g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$i */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8847f1.this.f20471j0 = null;
            C8847f1.this.m25446C0();
        }
    }

    /* renamed from: io.grpc.internal.f1$j */
    /* loaded from: classes3.dex */
    private final class j implements InterfaceC8863j1.a {
        private j() {
        }

        /* synthetic */ j(C8847f1 c8847f1, a aVar) {
            this();
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: a */
        public void mo25536a() {
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: b */
        public void mo25537b(boolean z10) {
            C8847f1 c8847f1 = C8847f1.this;
            c8847f1.f20469i0.m25865e(c8847f1.f20437L, z10);
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: c */
        public void mo25538c() {
            C7159o.m21319v(C8847f1.this.f20439N.get(), "Channel must have been shut down");
            C8847f1.this.f20441P = true;
            C8847f1.this.m25450E0(false);
            C8847f1.this.m25513y0();
            C8847f1.this.m25515z0();
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: d */
        public void mo25539d(C11915g1 c11915g1) {
            C7159o.m21319v(C8847f1.this.f20439N.get(), "Channel must have been shut down");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$k */
    /* loaded from: classes3.dex */
    public static final class k implements Executor {

        /* renamed from: a */
        private final InterfaceC8883o1<? extends Executor> f20520a;

        /* renamed from: b */
        private Executor f20521b;

        k(InterfaceC8883o1<? extends Executor> interfaceC8883o1) {
            this.f20520a = (InterfaceC8883o1) C7159o.m21313p(interfaceC8883o1, "executorPool");
        }

        /* renamed from: a */
        synchronized Executor m25540a() {
            if (this.f20521b == null) {
                this.f20521b = (Executor) C7159o.m21314q(this.f20520a.mo25568a(), "%s.getObject()", this.f20521b);
            }
            return this.f20521b;
        }

        /* renamed from: b */
        synchronized void m25541b() {
            Executor executor = this.f20521b;
            if (executor != null) {
                this.f20521b = this.f20520a.mo25569b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            m25540a().execute(runnable);
        }
    }

    /* renamed from: io.grpc.internal.f1$l */
    /* loaded from: classes3.dex */
    private final class l extends AbstractC8905v0<Object> {
        private l() {
        }

        /* synthetic */ l(C8847f1 c8847f1, a aVar) {
            this();
        }

        @Override // io.grpc.internal.AbstractC8905v0
        /* renamed from: b */
        protected void mo25542b() {
            C8847f1.this.m25519u0();
        }

        @Override // io.grpc.internal.AbstractC8905v0
        /* renamed from: c */
        protected void mo25543c() {
            if (C8847f1.this.f20439N.get()) {
                return;
            }
            C8847f1.this.m25448D0();
        }
    }

    /* renamed from: io.grpc.internal.f1$m */
    /* loaded from: classes3.dex */
    private class m implements Runnable {
        private m() {
        }

        /* synthetic */ m(C8847f1 c8847f1, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C8847f1.this.f20430E == null) {
                return;
            }
            C8847f1.this.m25504t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.f1$n */
    /* loaded from: classes3.dex */
    public final class n extends AbstractC11939p0.d {

        /* renamed from: a */
        C8861j.b f20524a;

        /* renamed from: io.grpc.internal.f1$n$a */
        /* loaded from: classes3.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8847f1.this.m25444B0();
            }
        }

        /* renamed from: io.grpc.internal.f1$n$b */
        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AbstractC11939p0.i f20527a;

            /* renamed from: b */
            final /* synthetic */ EnumC11938p f20528b;

            b(AbstractC11939p0.i iVar, EnumC11938p enumC11938p) {
                this.f20527a = iVar;
                this.f20528b = enumC11938p;
            }

            @Override // java.lang.Runnable
            public void run() {
                n nVar = n.this;
                if (nVar != C8847f1.this.f20430E) {
                    return;
                }
                C8847f1.this.m25452F0(this.f20527a);
                if (this.f20528b != EnumC11938p.SHUTDOWN) {
                    C8847f1.this.f20447V.mo25683b(AbstractC11910f.a.INFO, "Entering {0} state with picker: {1}", this.f20528b, this.f20527a);
                    C8847f1.this.f20489y.m25873a(this.f20528b);
                }
            }
        }

        private n() {
        }

        /* synthetic */ n(C8847f1 c8847f1, a aVar) {
            this();
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: b */
        public AbstractC11910f mo9553b() {
            return C8847f1.this.f20447V;
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: c */
        public ScheduledExecutorService mo9554c() {
            return C8847f1.this.f20472k;
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: d */
        public ExecutorC11927k1 mo9555d() {
            return C8847f1.this.f20483s;
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: e */
        public void mo9556e() {
            C8847f1.this.f20483s.m38196e();
            C8847f1.this.f20483s.execute(new a());
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: f */
        public void mo9577f(EnumC11938p enumC11938p, AbstractC11939p0.i iVar) {
            C8847f1.this.f20483s.m38196e();
            C7159o.m21313p(enumC11938p, "newState");
            C7159o.m21313p(iVar, "newPicker");
            C8847f1.this.f20483s.execute(new b(iVar, enumC11938p));
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC8841e mo9552a(AbstractC11939p0.b bVar) {
            C8847f1.this.f20483s.m38196e();
            C7159o.m21319v(!C8847f1.this.f20441P, "Channel is being terminated");
            return new s(bVar, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.f1$o */
    /* loaded from: classes3.dex */
    public final class o extends AbstractC11957y0.e {

        /* renamed from: a */
        final n f20530a;

        /* renamed from: b */
        final AbstractC11957y0 f20531b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.f1$o$a */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11915g1 f20533a;

            a(C11915g1 c11915g1) {
                this.f20533a = c11915g1;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.m25547f(this.f20533a);
            }
        }

        /* renamed from: io.grpc.internal.f1$o$b */
        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AbstractC11957y0.g f20535a;

            b(AbstractC11957y0.g gVar) {
                this.f20535a = gVar;
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
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C8847f1.o.b.run():void");
            }
        }

        o(n nVar, AbstractC11957y0 abstractC11957y0) {
            this.f20530a = (n) C7159o.m21313p(nVar, "helperImpl");
            this.f20531b = (AbstractC11957y0) C7159o.m21313p(abstractC11957y0, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m25547f(C11915g1 c11915g1) {
            C8847f1.f20418n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C8847f1.this.mo25247e(), c11915g1});
            C8847f1.this.f20449X.m25555m();
            q qVar = C8847f1.this.f20450Y;
            q qVar2 = q.ERROR;
            if (qVar != qVar2) {
                C8847f1.this.f20447V.mo25683b(AbstractC11910f.a.WARNING, "Failed to resolve name: {0}", c11915g1);
                C8847f1.this.f20450Y = qVar2;
            }
            if (this.f20530a != C8847f1.this.f20430E) {
                return;
            }
            this.f20530a.f20524a.m25621b(c11915g1);
            m25548g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m25548g() {
            if (C8847f1.this.f20471j0 == null || !C8847f1.this.f20471j0.m38198b()) {
                if (C8847f1.this.f20473k0 == null) {
                    C8847f1 c8847f1 = C8847f1.this;
                    c8847f1.f20473k0 = c8847f1.f20490z.get();
                }
                long mo25422a = C8847f1.this.f20473k0.mo25422a();
                C8847f1.this.f20447V.mo25683b(AbstractC11910f.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(mo25422a));
                C8847f1 c8847f12 = C8847f1.this;
                c8847f12.f20471j0 = c8847f12.f20483s.m38194c(new i(), mo25422a, TimeUnit.NANOSECONDS, C8847f1.this.f20468i.mo25643l0());
            }
        }

        @Override // vi.AbstractC11957y0.e, vi.AbstractC11957y0.f
        /* renamed from: b */
        public void mo25549b(C11915g1 c11915g1) {
            C7159o.m21302e(!c11915g1.m38145p(), "the error status must not be OK");
            C8847f1.this.f20483s.execute(new a(c11915g1));
        }

        @Override // vi.AbstractC11957y0.e
        /* renamed from: c */
        public void mo25550c(AbstractC11957y0.g gVar) {
            C8847f1.this.f20483s.execute(new b(gVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.f1$p */
    /* loaded from: classes3.dex */
    public class p extends AbstractC11904d {

        /* renamed from: a */
        private final AtomicReference<AbstractC11908e0> f20537a;

        /* renamed from: b */
        private final String f20538b;

        /* renamed from: c */
        private final AbstractC11904d f20539c;

        /* renamed from: io.grpc.internal.f1$p$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC11904d {
            a() {
            }

            @Override // vi.AbstractC11904d
            /* renamed from: a */
            public String mo25517a() {
                return p.this.f20538b;
            }

            @Override // vi.AbstractC11904d
            /* renamed from: h */
            public <RequestT, ResponseT> AbstractC11913g<RequestT, ResponseT> mo25518h(C11955x0<RequestT, ResponseT> c11955x0, C11901c c11901c) {
                return new C8885p(c11955x0, C8847f1.this.m25507v0(c11901c), c11901c, C8847f1.this.f20475l0, C8847f1.this.f20442Q ? null : C8847f1.this.f20468i.mo25643l0(), C8847f1.this.f20445T, null).m25732C(C8847f1.this.f20484t).m25731B(C8847f1.this.f20485u).m25730A(C8847f1.this.f20486v);
            }
        }

        /* renamed from: io.grpc.internal.f1$p$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8847f1.this.m25519u0();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* renamed from: io.grpc.internal.f1$p$c */
        /* loaded from: classes3.dex */
        class c<ReqT, RespT> extends AbstractC11913g<ReqT, RespT> {
            c() {
            }

            @Override // vi.AbstractC11913g
            /* renamed from: a */
            public void mo25522a(String str, Throwable th2) {
            }

            @Override // vi.AbstractC11913g
            /* renamed from: b */
            public void mo25523b() {
            }

            @Override // vi.AbstractC11913g
            /* renamed from: c */
            public void mo25524c(int i10) {
            }

            @Override // vi.AbstractC11913g
            /* renamed from: d */
            public void mo25525d(ReqT reqt) {
            }

            @Override // vi.AbstractC11913g
            /* renamed from: e */
            public void mo603e(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
                aVar.mo597a(C8847f1.f20421q0, new C11953w0());
            }
        }

        /* renamed from: io.grpc.internal.f1$p$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ e f20544a;

            d(e eVar) {
                this.f20544a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (p.this.f20537a.get() != C8847f1.f20424t0) {
                    this.f20544a.m25558r();
                    return;
                }
                if (C8847f1.this.f20434I == null) {
                    C8847f1.this.f20434I = new LinkedHashSet();
                    C8847f1 c8847f1 = C8847f1.this;
                    c8847f1.f20469i0.m25865e(c8847f1.f20435J, true);
                }
                C8847f1.this.f20434I.add(this.f20544a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: io.grpc.internal.f1$p$e */
        /* loaded from: classes3.dex */
        public final class e<ReqT, RespT> extends C8916z<ReqT, RespT> {

            /* renamed from: l */
            final C11942r f20546l;

            /* renamed from: m */
            final C11955x0<ReqT, RespT> f20547m;

            /* renamed from: n */
            final C11901c f20548n;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: io.grpc.internal.f1$p$e$a */
            /* loaded from: classes3.dex */
            public class a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Runnable f20550a;

                a(Runnable runnable) {
                    this.f20550a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f20550a.run();
                    e eVar = e.this;
                    C8847f1.this.f20483s.execute(new b());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: io.grpc.internal.f1$p$e$b */
            /* loaded from: classes3.dex */
            public final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C8847f1.this.f20434I != null) {
                        C8847f1.this.f20434I.remove(e.this);
                        if (C8847f1.this.f20434I.isEmpty()) {
                            C8847f1 c8847f1 = C8847f1.this;
                            c8847f1.f20469i0.m25865e(c8847f1.f20435J, false);
                            C8847f1.this.f20434I = null;
                            if (C8847f1.this.f20439N.get()) {
                                C8847f1.this.f20438M.m25565b(C8847f1.f20421q0);
                            }
                        }
                    }
                }
            }

            e(C11942r c11942r, C11955x0<ReqT, RespT> c11955x0, C11901c c11901c) {
                super(C8847f1.this.m25507v0(c11901c), C8847f1.this.f20472k, c11901c.m38081d());
                this.f20546l = c11942r;
                this.f20547m = c11955x0;
                this.f20548n = c11901c;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.grpc.internal.C8916z
            /* renamed from: j */
            public void mo25557j() {
                super.mo25557j();
                C8847f1.this.f20483s.execute(new b());
            }

            /* renamed from: r */
            void m25558r() {
                C11942r m38246b = this.f20546l.m38246b();
                try {
                    AbstractC11913g<ReqT, RespT> m25554l = p.this.m25554l(this.f20547m, this.f20548n);
                    this.f20546l.m38248f(m38246b);
                    Runnable m26025p = m26025p(m25554l);
                    if (m26025p == null) {
                        C8847f1.this.f20483s.execute(new b());
                    } else {
                        C8847f1.this.m25507v0(this.f20548n).execute(new a(m26025p));
                    }
                } catch (Throwable th2) {
                    this.f20546l.m38248f(m38246b);
                    throw th2;
                }
            }
        }

        private p(String str) {
            this.f20537a = new AtomicReference<>(C8847f1.f20424t0);
            this.f20539c = new a();
            this.f20538b = (String) C7159o.m21313p(str, "authority");
        }

        /* synthetic */ p(C8847f1 c8847f1, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public <ReqT, RespT> AbstractC11913g<ReqT, RespT> m25554l(C11955x0<ReqT, RespT> c11955x0, C11901c c11901c) {
            AbstractC11908e0 abstractC11908e0 = this.f20537a.get();
            if (abstractC11908e0 != null) {
                if (!(abstractC11908e0 instanceof C8859i1.c)) {
                    return new h(abstractC11908e0, this.f20539c, C8847f1.this.f20474l, c11955x0, c11901c);
                }
                C8859i1.b m25610f = ((C8859i1.c) abstractC11908e0).f20658b.m25610f(c11955x0);
                if (m25610f != null) {
                    c11901c = c11901c.m38093q(C8859i1.b.f20651g, m25610f);
                }
            }
            return this.f20539c.mo25518h(c11955x0, c11901c);
        }

        @Override // vi.AbstractC11904d
        /* renamed from: a */
        public String mo25517a() {
            return this.f20538b;
        }

        @Override // vi.AbstractC11904d
        /* renamed from: h */
        public <ReqT, RespT> AbstractC11913g<ReqT, RespT> mo25518h(C11955x0<ReqT, RespT> c11955x0, C11901c c11901c) {
            if (this.f20537a.get() != C8847f1.f20424t0) {
                return m25554l(c11955x0, c11901c);
            }
            C8847f1.this.f20483s.execute(new b());
            if (this.f20537a.get() != C8847f1.f20424t0) {
                return m25554l(c11955x0, c11901c);
            }
            if (C8847f1.this.f20439N.get()) {
                return new c();
            }
            e eVar = new e(C11942r.m38242e(), c11955x0, c11901c);
            C8847f1.this.f20483s.execute(new d(eVar));
            return eVar;
        }

        /* renamed from: m */
        void m25555m() {
            if (this.f20537a.get() == C8847f1.f20424t0) {
                m25556n(null);
            }
        }

        /* renamed from: n */
        void m25556n(AbstractC11908e0 abstractC11908e0) {
            AbstractC11908e0 abstractC11908e02 = this.f20537a.get();
            this.f20537a.set(abstractC11908e0);
            if (abstractC11908e02 != C8847f1.f20424t0 || C8847f1.this.f20434I == null) {
                return;
            }
            Iterator it = C8847f1.this.f20434I.iterator();
            while (it.hasNext()) {
                ((e) it.next()).m25558r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.f1$q */
    /* loaded from: classes3.dex */
    public enum q {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* renamed from: io.grpc.internal.f1$r */
    /* loaded from: classes3.dex */
    private static final class r implements ScheduledExecutorService {

        /* renamed from: a */
        final ScheduledExecutorService f20553a;

        private r(ScheduledExecutorService scheduledExecutorService) {
            this.f20553a = (ScheduledExecutorService) C7159o.m21313p(scheduledExecutorService, "delegate");
        }

        /* synthetic */ r(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f20553a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f20553a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f20553a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return this.f20553a.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f20553a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return (T) this.f20553a.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f20553a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f20553a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f20553a.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f20553a.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f20553a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f20553a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
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
            return this.f20553a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t10) {
            return this.f20553a.submit(runnable, t10);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f20553a.submit(callable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.f1$s */
    /* loaded from: classes3.dex */
    public final class s extends AbstractC8841e {

        /* renamed from: a */
        final AbstractC11939p0.b f20554a;

        /* renamed from: b */
        final n f20555b;

        /* renamed from: c */
        final C11920i0 f20556c;

        /* renamed from: d */
        final C8877n f20557d;

        /* renamed from: e */
        final C8881o f20558e;

        /* renamed from: f */
        List<C11954x> f20559f;

        /* renamed from: g */
        C8911x0 f20560g;

        /* renamed from: h */
        boolean f20561h;

        /* renamed from: i */
        boolean f20562i;

        /* renamed from: j */
        ExecutorC11927k1.d f20563j;

        /* renamed from: io.grpc.internal.f1$s$a */
        /* loaded from: classes3.dex */
        final class a extends C8911x0.j {

            /* renamed from: a */
            final /* synthetic */ AbstractC11939p0.j f20565a;

            a(AbstractC11939p0.j jVar) {
                this.f20565a = jVar;
            }

            @Override // io.grpc.internal.C8911x0.j
            /* renamed from: a */
            void mo25560a(C8911x0 c8911x0) {
                C8847f1.this.f20469i0.m25865e(c8911x0, true);
            }

            @Override // io.grpc.internal.C8911x0.j
            /* renamed from: b */
            void mo25561b(C8911x0 c8911x0) {
                C8847f1.this.f20469i0.m25865e(c8911x0, false);
            }

            @Override // io.grpc.internal.C8911x0.j
            /* renamed from: c */
            void mo25562c(C8911x0 c8911x0, C11940q c11940q) {
                C7159o.m21319v(this.f20565a != null, "listener is null");
                this.f20565a.mo9644a(c11940q);
            }

            @Override // io.grpc.internal.C8911x0.j
            /* renamed from: d */
            void mo25563d(C8911x0 c8911x0) {
                C8847f1.this.f20433H.remove(c8911x0);
                C8847f1.this.f20448W.m38111k(c8911x0);
                C8847f1.this.m25515z0();
            }
        }

        /* renamed from: io.grpc.internal.f1$s$b */
        /* loaded from: classes3.dex */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                s.this.f20560g.m25918d(C8847f1.f20422r0);
            }
        }

        s(AbstractC11939p0.b bVar, n nVar) {
            C7159o.m21313p(bVar, "args");
            this.f20559f = bVar.m38209a();
            if (C8847f1.this.f20456c != null) {
                bVar = bVar.m38211d().m38215d(m25559i(bVar.m38209a())).m38214b();
            }
            this.f20554a = bVar;
            this.f20555b = (n) C7159o.m21313p(nVar, "helper");
            C11920i0 m38162b = C11920i0.m38162b("Subchannel", C8847f1.this.mo25517a());
            this.f20556c = m38162b;
            C8881o c8881o = new C8881o(m38162b, C8847f1.this.f20482r, C8847f1.this.f20481q.mo25639a(), "Subchannel for " + bVar.m38209a());
            this.f20558e = c8881o;
            this.f20557d = new C8877n(c8881o, C8847f1.this.f20481q);
        }

        /* renamed from: i */
        private List<C11954x> m25559i(List<C11954x> list) {
            ArrayList arrayList = new ArrayList();
            for (C11954x c11954x : list) {
                arrayList.add(new C11954x(c11954x.m38335a(), c11954x.m38336b().m38049d().m38052c(C11954x.f31674d).m38051a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: b */
        public List<C11954x> mo9558b() {
            C8847f1.this.f20483s.m38196e();
            C7159o.m21319v(this.f20561h, "not started");
            return this.f20559f;
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: c */
        public C11895a mo9637c() {
            return this.f20554a.m38210b();
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: d */
        public Object mo9559d() {
            C7159o.m21319v(this.f20561h, "Subchannel is not started");
            return this.f20560g;
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: e */
        public void mo9560e() {
            C8847f1.this.f20483s.m38196e();
            C7159o.m21319v(this.f20561h, "not started");
            this.f20560g.mo25675a();
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: f */
        public void mo9561f() {
            ExecutorC11927k1.d dVar;
            C8847f1.this.f20483s.m38196e();
            if (this.f20560g == null) {
                this.f20562i = true;
                return;
            }
            if (!this.f20562i) {
                this.f20562i = true;
            } else {
                if (!C8847f1.this.f20441P || (dVar = this.f20563j) == null) {
                    return;
                }
                dVar.m38197a();
                this.f20563j = null;
            }
            if (C8847f1.this.f20441P) {
                this.f20560g.m25918d(C8847f1.f20421q0);
            } else {
                this.f20563j = C8847f1.this.f20483s.m38194c(new RunnableC8835c1(new b()), 5L, TimeUnit.SECONDS, C8847f1.this.f20468i.mo25643l0());
            }
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: g */
        public void mo9562g(AbstractC11939p0.j jVar) {
            C8847f1.this.f20483s.m38196e();
            C7159o.m21319v(!this.f20561h, "already started");
            C7159o.m21319v(!this.f20562i, "already shutdown");
            C7159o.m21319v(!C8847f1.this.f20441P, "Channel is being terminated");
            this.f20561h = true;
            C8911x0 c8911x0 = new C8911x0(this.f20554a.m38209a(), C8847f1.this.mo25517a(), C8847f1.this.f20427B, C8847f1.this.f20490z, C8847f1.this.f20468i, C8847f1.this.f20468i.mo25643l0(), C8847f1.this.f20487w, C8847f1.this.f20483s, new a(jVar), C8847f1.this.f20448W, C8847f1.this.f20444S.mo25521a(), this.f20558e, this.f20556c, this.f20557d);
            C8847f1.this.f20446U.m25701e(new C11905d0.a().m38113b("Child Subchannel started").m38114c(C11905d0.b.CT_INFO).m38116e(C8847f1.this.f20481q.mo25639a()).m38115d(c8911x0).m38112a());
            this.f20560g = c8911x0;
            C8847f1.this.f20448W.m38108e(c8911x0);
            C8847f1.this.f20433H.add(c8911x0);
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: h */
        public void mo9638h(List<C11954x> list) {
            C8847f1.this.f20483s.m38196e();
            this.f20559f = list;
            if (C8847f1.this.f20456c != null) {
                list = m25559i(list);
            }
            this.f20560g.m25916T(list);
        }

        public String toString() {
            return this.f20556c.toString();
        }
    }

    /* renamed from: io.grpc.internal.f1$t */
    /* loaded from: classes3.dex */
    private final class t {

        /* renamed from: a */
        final Object f20568a;

        /* renamed from: b */
        Collection<InterfaceC8889q> f20569b;

        /* renamed from: c */
        C11915g1 f20570c;

        private t() {
            this.f20568a = new Object();
            this.f20569b = new HashSet();
        }

        /* synthetic */ t(C8847f1 c8847f1, a aVar) {
            this();
        }

        /* renamed from: a */
        C11915g1 m25564a(AbstractC8915y1<?> abstractC8915y1) {
            synchronized (this.f20568a) {
                C11915g1 c11915g1 = this.f20570c;
                if (c11915g1 != null) {
                    return c11915g1;
                }
                this.f20569b.add(abstractC8915y1);
                return null;
            }
        }

        /* renamed from: b */
        void m25565b(C11915g1 c11915g1) {
            synchronized (this.f20568a) {
                if (this.f20570c != null) {
                    return;
                }
                this.f20570c = c11915g1;
                boolean isEmpty = this.f20569b.isEmpty();
                if (isEmpty) {
                    C8847f1.this.f20437L.mo25246d(c11915g1);
                }
            }
        }

        /* renamed from: c */
        void m25566c(AbstractC8915y1<?> abstractC8915y1) {
            C11915g1 c11915g1;
            synchronized (this.f20568a) {
                this.f20569b.remove(abstractC8915y1);
                if (this.f20569b.isEmpty()) {
                    c11915g1 = this.f20570c;
                    this.f20569b = new HashSet();
                } else {
                    c11915g1 = null;
                }
            }
            if (c11915g1 != null) {
                C8847f1.this.f20437L.mo25246d(c11915g1);
            }
        }
    }

    static {
        C11915g1 c11915g1 = C11915g1.f31549u;
        f20420p0 = c11915g1.m38147r("Channel shutdownNow invoked");
        f20421q0 = c11915g1.m38147r("Channel shutdown invoked");
        f20422r0 = c11915g1.m38147r("Subchannel shutdown invoked");
        f20423s0 = C8859i1.m25605a();
        f20424t0 = new a();
        f20425u0 = new f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8847f1(C8851g1 c8851g1, InterfaceC8898t interfaceC8898t, InterfaceC8865k.a aVar, InterfaceC8883o1<? extends Executor> interfaceC8883o1, InterfaceC7166v<C7164t> interfaceC7166v, List<InterfaceC11916h> list, InterfaceC8868k2 interfaceC8868k2) {
        a aVar2;
        ExecutorC11927k1 executorC11927k1 = new ExecutorC11927k1(new d());
        this.f20483s = executorC11927k1;
        this.f20489y = new C8907w();
        this.f20433H = new HashSet(16, 0.75f);
        this.f20435J = new Object();
        this.f20436K = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.f20438M = new t(this, aVar3);
        this.f20439N = new AtomicBoolean(false);
        this.f20443R = new CountDownLatch(1);
        this.f20450Y = q.NO_RESOLUTION;
        this.f20451Z = f20423s0;
        this.f20455b0 = false;
        this.f20459d0 = new AbstractC8915y1.t();
        j jVar = new j(this, aVar3);
        this.f20467h0 = jVar;
        this.f20469i0 = new l(this, aVar3);
        this.f20475l0 = new g(this, aVar3);
        String str = (String) C7159o.m21313p(c8851g1.f20602f, "target");
        this.f20454b = str;
        C11920i0 m38162b = C11920i0.m38162b("Channel", str);
        this.f20452a = m38162b;
        this.f20481q = (InterfaceC8868k2) C7159o.m21313p(interfaceC8868k2, "timeProvider");
        InterfaceC8883o1<? extends Executor> interfaceC8883o12 = (InterfaceC8883o1) C7159o.m21313p(c8851g1.f20597a, "executorPool");
        this.f20476m = interfaceC8883o12;
        Executor executor = (Executor) C7159o.m21313p(interfaceC8883o12.mo25568a(), "executor");
        this.f20474l = executor;
        this.f20466h = interfaceC8898t;
        k kVar = new k((InterfaceC8883o1) C7159o.m21313p(c8851g1.f20598b, "offloadExecutorPool"));
        this.f20480p = kVar;
        C8869l c8869l = new C8869l(interfaceC8898t, c8851g1.f20603g, kVar);
        this.f20468i = c8869l;
        this.f20470j = new C8869l(interfaceC8898t, null, kVar);
        r rVar = new r(c8869l.mo25643l0(), aVar3);
        this.f20472k = rVar;
        this.f20482r = c8851g1.f20618v;
        C8881o c8881o = new C8881o(m38162b, c8851g1.f20618v, interfaceC8868k2.mo25639a(), "Channel for '" + str + "'");
        this.f20446U = c8881o;
        C8877n c8877n = new C8877n(c8881o, interfaceC8868k2);
        this.f20447V = c8877n;
        InterfaceC11906d1 interfaceC11906d1 = c8851g1.f20621y;
        interfaceC11906d1 = interfaceC11906d1 == null ? C8890q0.f20844q : interfaceC11906d1;
        boolean z10 = c8851g1.f20616t;
        this.f20465g0 = z10;
        C8861j c8861j = new C8861j(c8851g1.f20607k);
        this.f20464g = c8861j;
        this.f20458d = c8851g1.f20600d;
        C8828a2 c8828a2 = new C8828a2(z10, c8851g1.f20612p, c8851g1.f20613q, c8861j);
        String str2 = c8851g1.f20606j;
        this.f20456c = str2;
        AbstractC11957y0.b m38362a = AbstractC11957y0.b.m38356f().m38364c(c8851g1.m25575c()).m38367f(interfaceC11906d1).m38370i(executorC11927k1).m38368g(rVar).m38369h(c8828a2).m38363b(c8877n).m38365d(kVar).m38366e(str2).m38362a();
        this.f20462f = m38362a;
        AbstractC11957y0.d dVar = c8851g1.f20601e;
        this.f20460e = dVar;
        this.f20428C = m25509w0(str, str2, dVar, m38362a);
        this.f20478n = (InterfaceC8883o1) C7159o.m21313p(interfaceC8883o1, "balancerRpcExecutorPool");
        this.f20479o = new k(interfaceC8883o1);
        C8826a0 c8826a0 = new C8826a0(executor, executorC11927k1);
        this.f20437L = c8826a0;
        c8826a0.mo25248g(jVar);
        this.f20490z = aVar;
        Map<String, ?> map = c8851g1.f20619w;
        if (map != null) {
            AbstractC11957y0.c mo25273a = c8828a2.mo25273a(map);
            C7159o.m21322y(mo25273a.m38374d() == null, "Default config is invalid: %s", mo25273a.m38374d());
            C8859i1 c8859i1 = (C8859i1) mo25273a.m38373c();
            this.f20453a0 = c8859i1;
            this.f20451Z = c8859i1;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f20453a0 = null;
        }
        boolean z11 = c8851g1.f20620x;
        this.f20457c0 = z11;
        p pVar = new p(this, this.f20428C.mo25342a(), aVar2);
        this.f20449X = pVar;
        this.f20426A = C11922j.m38169a(pVar, list);
        this.f20487w = (InterfaceC7166v) C7159o.m21313p(interfaceC7166v, "stopwatchSupplier");
        long j10 = c8851g1.f20611o;
        if (j10 != -1) {
            C7159o.m21307j(j10 >= C8851g1.f20586J, "invalid idleTimeoutMillis %s", j10);
            j10 = c8851g1.f20611o;
        }
        this.f20488x = j10;
        this.f20477m0 = new C8912x1(new m(this, null), executorC11927k1, c8869l.mo25643l0(), interfaceC7166v.get());
        this.f20484t = c8851g1.f20608l;
        this.f20485u = (C11950v) C7159o.m21313p(c8851g1.f20609m, "decompressorRegistry");
        this.f20486v = (C11936o) C7159o.m21313p(c8851g1.f20610n, "compressorRegistry");
        this.f20427B = c8851g1.f20605i;
        this.f20463f0 = c8851g1.f20614r;
        this.f20461e0 = c8851g1.f20615s;
        b bVar = new b(interfaceC8868k2);
        this.f20444S = bVar;
        this.f20445T = bVar.mo25521a();
        C11902c0 c11902c0 = (C11902c0) C7159o.m21312o(c8851g1.f20617u);
        this.f20448W = c11902c0;
        c11902c0.m38107d(this);
        if (z11) {
            return;
        }
        if (this.f20453a0 != null) {
            c8877n.mo25682a(AbstractC11910f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f20455b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public void m25444B0() {
        this.f20483s.m38196e();
        m25502s0();
        m25446C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public void m25446C0() {
        this.f20483s.m38196e();
        if (this.f20429D) {
            this.f20428C.mo25343b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public void m25448D0() {
        long j10 = this.f20488x;
        if (j10 == -1) {
            return;
        }
        this.f20477m0.m25938k(j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public void m25450E0(boolean z10) {
        this.f20483s.m38196e();
        if (z10) {
            C7159o.m21319v(this.f20429D, "nameResolver is not started");
            C7159o.m21319v(this.f20430E != null, "lbHelper is null");
        }
        if (this.f20428C != null) {
            m25502s0();
            this.f20428C.mo25344c();
            this.f20429D = false;
            if (z10) {
                this.f20428C = m25509w0(this.f20454b, this.f20456c, this.f20460e, this.f20462f);
            } else {
                this.f20428C = null;
            }
        }
        n nVar = this.f20430E;
        if (nVar != null) {
            nVar.f20524a.m25622c();
            this.f20430E = null;
        }
        this.f20431F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m25452F0(AbstractC11939p0.i iVar) {
        this.f20431F = iVar;
        this.f20437L.m25251r(iVar);
    }

    /* renamed from: r0 */
    private void m25500r0(boolean z10) {
        this.f20477m0.m25937i(z10);
    }

    /* renamed from: s0 */
    private void m25502s0() {
        this.f20483s.m38196e();
        ExecutorC11927k1.d dVar = this.f20471j0;
        if (dVar != null) {
            dVar.m38197a();
            this.f20471j0 = null;
            this.f20473k0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m25504t0() {
        m25450E0(true);
        this.f20437L.m25251r(null);
        this.f20447V.mo25682a(AbstractC11910f.a.INFO, "Entering IDLE state");
        this.f20489y.m25873a(EnumC11938p.IDLE);
        if (this.f20469i0.m25863a(this.f20435J, this.f20437L)) {
            m25519u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public Executor m25507v0(C11901c c11901c) {
        Executor m38082e = c11901c.m38082e();
        return m38082e == null ? this.f20474l : m38082e;
    }

    /* renamed from: w0 */
    static AbstractC11957y0 m25509w0(String str, String str2, AbstractC11957y0.d dVar, AbstractC11957y0.b bVar) {
        AbstractC11957y0 m25511x0 = m25511x0(str, dVar, bVar);
        return str2 == null ? m25511x0 : new e(m25511x0, str2);
    }

    /* renamed from: x0 */
    private static AbstractC11957y0 m25511x0(String str, AbstractC11957y0.d dVar, AbstractC11957y0.b bVar) {
        URI uri;
        AbstractC11957y0 mo25386b;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        if (uri != null && (mo25386b = dVar.mo25386b(uri, bVar)) != null) {
            return mo25386b;
        }
        String str2 = "";
        if (!f20419o0.matcher(str).matches()) {
            try {
                AbstractC11957y0 mo25386b2 = dVar.mo25386b(new URI(dVar.mo25385a(), "", "/" + str, null), bVar);
                if (mo25386b2 != null) {
                    return mo25386b2;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m25513y0() {
        if (this.f20440O) {
            Iterator<C8911x0> it = this.f20433H.iterator();
            while (it.hasNext()) {
                it.next().m25917b(f20420p0);
            }
            Iterator<C8887p1> it2 = this.f20436K.iterator();
            while (it2.hasNext()) {
                it2.next().m25742i().m25917b(f20420p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m25515z0() {
        if (!this.f20442Q && this.f20439N.get() && this.f20433H.isEmpty() && this.f20436K.isEmpty()) {
            this.f20447V.mo25682a(AbstractC11910f.a.INFO, "Terminated");
            this.f20448W.m38110j(this);
            this.f20476m.mo25569b(this.f20474l);
            this.f20479o.m25541b();
            this.f20480p.m25541b();
            this.f20468i.close();
            this.f20442Q = true;
            this.f20443R.countDown();
        }
    }

    /* renamed from: A0 */
    void m25516A0(Throwable th2) {
        if (this.f20432G) {
            return;
        }
        this.f20432G = true;
        m25500r0(true);
        m25450E0(false);
        m25452F0(new c(th2));
        this.f20449X.m25556n(null);
        this.f20447V.mo25682a(AbstractC11910f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f20489y.m25873a(EnumC11938p.TRANSIENT_FAILURE);
    }

    @Override // vi.AbstractC11904d
    /* renamed from: a */
    public String mo25517a() {
        return this.f20426A.mo25517a();
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        return this.f20452a;
    }

    @Override // vi.AbstractC11904d
    /* renamed from: h */
    public <ReqT, RespT> AbstractC11913g<ReqT, RespT> mo25518h(C11955x0<ReqT, RespT> c11955x0, C11901c c11901c) {
        return this.f20426A.mo25518h(c11955x0, c11901c);
    }

    public String toString() {
        return C7153i.m21274c(this).m21283c("logId", this.f20452a.m38165d()).m21284d("target", this.f20454b).toString();
    }

    /* renamed from: u0 */
    void m25519u0() {
        this.f20483s.m38196e();
        if (this.f20439N.get() || this.f20432G) {
            return;
        }
        if (this.f20469i0.m25864d()) {
            m25500r0(false);
        } else {
            m25448D0();
        }
        if (this.f20430E != null) {
            return;
        }
        this.f20447V.mo25682a(AbstractC11910f.a.INFO, "Exiting idle mode");
        n nVar = new n(this, null);
        nVar.f20524a = this.f20464g.m25618e(nVar);
        this.f20430E = nVar;
        this.f20428C.mo25345d(new o(nVar, this.f20428C));
        this.f20429D = true;
    }
}
