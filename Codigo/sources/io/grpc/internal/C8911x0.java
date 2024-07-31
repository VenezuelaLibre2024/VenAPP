package io.grpc.internal;

import io.grpc.internal.InterfaceC8863j1;
import io.grpc.internal.InterfaceC8865k;
import io.grpc.internal.InterfaceC8892r;
import io.grpc.internal.InterfaceC8898t;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p082eb.C7153i;
import p082eb.C7159o;
import p082eb.C7164t;
import p082eb.InterfaceC7166v;
import vi.AbstractC11910f;
import vi.AbstractC11925k;
import vi.C11895a;
import vi.C11899b0;
import vi.C11901c;
import vi.C11902c0;
import vi.C11915g1;
import vi.C11920i0;
import vi.C11940q;
import vi.C11953w0;
import vi.C11954x;
import vi.C11955x0;
import vi.EnumC11938p;
import vi.ExecutorC11927k1;
import vi.InterfaceC11917h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.x0 */
/* loaded from: classes3.dex */
public final class C8911x0 implements InterfaceC11917h0<Object>, InterfaceC8876m2 {

    /* renamed from: a */
    private final C11920i0 f20943a;

    /* renamed from: b */
    private final String f20944b;

    /* renamed from: c */
    private final String f20945c;

    /* renamed from: d */
    private final InterfaceC8865k.a f20946d;

    /* renamed from: e */
    private final j f20947e;

    /* renamed from: f */
    private final InterfaceC8898t f20948f;

    /* renamed from: g */
    private final ScheduledExecutorService f20949g;

    /* renamed from: h */
    private final C11902c0 f20950h;

    /* renamed from: i */
    private final C8873m f20951i;

    /* renamed from: j */
    private final C8881o f20952j;

    /* renamed from: k */
    private final AbstractC11910f f20953k;

    /* renamed from: l */
    private final ExecutorC11927k1 f20954l;

    /* renamed from: m */
    private final k f20955m;

    /* renamed from: n */
    private volatile List<C11954x> f20956n;

    /* renamed from: o */
    private InterfaceC8865k f20957o;

    /* renamed from: p */
    private final C7164t f20958p;

    /* renamed from: q */
    private ExecutorC11927k1.d f20959q;

    /* renamed from: r */
    private ExecutorC11927k1.d f20960r;

    /* renamed from: s */
    private InterfaceC8863j1 f20961s;

    /* renamed from: v */
    private InterfaceC8904v f20964v;

    /* renamed from: w */
    private volatile InterfaceC8863j1 f20965w;

    /* renamed from: y */
    private C11915g1 f20967y;

    /* renamed from: t */
    private final Collection<InterfaceC8904v> f20962t = new ArrayList();

    /* renamed from: u */
    private final AbstractC8905v0<InterfaceC8904v> f20963u = new a();

    /* renamed from: x */
    private volatile C11940q f20966x = C11940q.m38237a(EnumC11938p.IDLE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8905v0<InterfaceC8904v> {
        a() {
        }

        @Override // io.grpc.internal.AbstractC8905v0
        /* renamed from: b */
        protected void mo25542b() {
            C8911x0.this.f20947e.mo25560a(C8911x0.this);
        }

        @Override // io.grpc.internal.AbstractC8905v0
        /* renamed from: c */
        protected void mo25543c() {
            C8911x0.this.f20947e.mo25561b(C8911x0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8911x0.this.f20959q = null;
            C8911x0.this.f20953k.mo25682a(AbstractC11910f.a.INFO, "CONNECTING after backoff");
            C8911x0.this.m25890M(EnumC11938p.CONNECTING);
            C8911x0.this.m25896S();
        }
    }

    /* renamed from: io.grpc.internal.x0$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C8911x0.this.f20966x.m38239c() == EnumC11938p.IDLE) {
                C8911x0.this.f20953k.mo25682a(AbstractC11910f.a.INFO, "CONNECTING as requested");
                C8911x0.this.m25890M(EnumC11938p.CONNECTING);
                C8911x0.this.m25896S();
            }
        }
    }

    /* renamed from: io.grpc.internal.x0$d */
    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f20971a;

        /* renamed from: io.grpc.internal.x0$d$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC8863j1 interfaceC8863j1 = C8911x0.this.f20961s;
                C8911x0.this.f20960r = null;
                C8911x0.this.f20961s = null;
                interfaceC8863j1.mo25246d(C11915g1.f31549u.m38147r("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f20971a = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0094  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.C8911x0.m25886I(r0)
                java.net.SocketAddress r0 = r0.m25920a()
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.C8911x0.m25886I(r1)
                java.util.List r2 = r7.f20971a
                r1.m25927h(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                java.util.List r2 = r7.f20971a
                io.grpc.internal.C8911x0.m25887J(r1, r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                vi.q r1 = io.grpc.internal.C8911x0.m25898i(r1)
                vi.p r1 = r1.m38239c()
                vi.p r2 = vi.EnumC11938p.READY
                r3 = 0
                if (r1 == r2) goto L39
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                vi.q r1 = io.grpc.internal.C8911x0.m25898i(r1)
                vi.p r1 = r1.m38239c()
                vi.p r4 = vi.EnumC11938p.CONNECTING
                if (r1 != r4) goto L91
            L39:
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.C8911x0.m25886I(r1)
                boolean r0 = r1.m25926g(r0)
                if (r0 != 0) goto L91
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                vi.q r0 = io.grpc.internal.C8911x0.m25898i(r0)
                vi.p r0 = r0.m38239c()
                if (r0 != r2) goto L6d
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                io.grpc.internal.j1 r0 = io.grpc.internal.C8911x0.m25899j(r0)
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.C8911x0.m25900k(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.C8911x0.m25886I(r1)
                r1.m25925f()
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                vi.p r2 = vi.EnumC11938p.IDLE
                io.grpc.internal.C8911x0.m25882E(r1, r2)
                goto L92
            L6d:
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                io.grpc.internal.v r0 = io.grpc.internal.C8911x0.m25901l(r0)
                vi.g1 r1 = vi.C11915g1.f31549u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                vi.g1 r1 = r1.m38147r(r2)
                r0.mo25246d(r1)
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                io.grpc.internal.C8911x0.m25902m(r0, r3)
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.C8911x0.m25886I(r0)
                r0.m25925f()
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                io.grpc.internal.C8911x0.m25883F(r0)
            L91:
                r0 = r3
            L92:
                if (r0 == 0) goto Le1
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                vi.k1$d r1 = io.grpc.internal.C8911x0.m25903n(r1)
                if (r1 == 0) goto Lc0
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.j1 r1 = io.grpc.internal.C8911x0.m25905p(r1)
                vi.g1 r2 = vi.C11915g1.f31549u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                vi.g1 r2 = r2.m38147r(r4)
                r1.mo25246d(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                vi.k1$d r1 = io.grpc.internal.C8911x0.m25903n(r1)
                r1.m38197a()
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.C8911x0.m25904o(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.C8911x0.m25906q(r1, r3)
            Lc0:
                io.grpc.internal.x0 r1 = io.grpc.internal.C8911x0.this
                io.grpc.internal.C8911x0.m25906q(r1, r0)
                io.grpc.internal.x0 r0 = io.grpc.internal.C8911x0.this
                vi.k1 r1 = io.grpc.internal.C8911x0.m25908s(r0)
                io.grpc.internal.x0$d$a r2 = new io.grpc.internal.x0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.x0 r6 = io.grpc.internal.C8911x0.this
                java.util.concurrent.ScheduledExecutorService r6 = io.grpc.internal.C8911x0.m25907r(r6)
                vi.k1$d r1 = r1.m38194c(r2, r3, r5, r6)
                io.grpc.internal.C8911x0.m25904o(r0, r1)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C8911x0.d.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$e */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11915g1 f20974a;

        e(C11915g1 c11915g1) {
            this.f20974a = c11915g1;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC11938p m38239c = C8911x0.this.f20966x.m38239c();
            EnumC11938p enumC11938p = EnumC11938p.SHUTDOWN;
            if (m38239c == enumC11938p) {
                return;
            }
            C8911x0.this.f20967y = this.f20974a;
            InterfaceC8863j1 interfaceC8863j1 = C8911x0.this.f20965w;
            InterfaceC8904v interfaceC8904v = C8911x0.this.f20964v;
            C8911x0.this.f20965w = null;
            C8911x0.this.f20964v = null;
            C8911x0.this.m25890M(enumC11938p);
            C8911x0.this.f20955m.m25925f();
            if (C8911x0.this.f20962t.isEmpty()) {
                C8911x0.this.m25892O();
            }
            C8911x0.this.m25888K();
            if (C8911x0.this.f20960r != null) {
                C8911x0.this.f20960r.m38197a();
                C8911x0.this.f20961s.mo25246d(this.f20974a);
                C8911x0.this.f20960r = null;
                C8911x0.this.f20961s = null;
            }
            if (interfaceC8863j1 != null) {
                interfaceC8863j1.mo25246d(this.f20974a);
            }
            if (interfaceC8904v != null) {
                interfaceC8904v.mo25246d(this.f20974a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$f */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8911x0.this.f20953k.mo25682a(AbstractC11910f.a.INFO, "Terminated");
            C8911x0.this.f20947e.mo25563d(C8911x0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$g */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8904v f20977a;

        /* renamed from: b */
        final /* synthetic */ boolean f20978b;

        g(InterfaceC8904v interfaceC8904v, boolean z10) {
            this.f20977a = interfaceC8904v;
            this.f20978b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8911x0.this.f20963u.m25865e(this.f20977a, this.f20978b);
        }
    }

    /* renamed from: io.grpc.internal.x0$h */
    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11915g1 f20980a;

        h(C11915g1 c11915g1) {
            this.f20980a = c11915g1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C8911x0.this.f20962t).iterator();
            while (it.hasNext()) {
                ((InterfaceC8863j1) it.next()).mo25244b(this.f20980a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC8862j0 {

        /* renamed from: a */
        private final InterfaceC8904v f20982a;

        /* renamed from: b */
        private final C8873m f20983b;

        /* renamed from: io.grpc.internal.x0$i$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC8854h0 {

            /* renamed from: a */
            final /* synthetic */ InterfaceC8889q f20984a;

            /* renamed from: io.grpc.internal.x0$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class C13217a extends AbstractC8858i0 {

                /* renamed from: a */
                final /* synthetic */ InterfaceC8892r f20986a;

                C13217a(InterfaceC8892r interfaceC8892r) {
                    this.f20986a = interfaceC8892r;
                }

                @Override // io.grpc.internal.AbstractC8858i0, io.grpc.internal.InterfaceC8892r
                /* renamed from: d */
                public void mo25293d(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
                    i.this.f20983b.m25669a(c11915g1.m38145p());
                    super.mo25293d(c11915g1, aVar, c11953w0);
                }

                @Override // io.grpc.internal.AbstractC8858i0
                /* renamed from: e */
                protected InterfaceC8892r mo25604e() {
                    return this.f20986a;
                }
            }

            a(InterfaceC8889q interfaceC8889q) {
                this.f20984a = interfaceC8889q;
            }

            @Override // io.grpc.internal.AbstractC8854h0, io.grpc.internal.InterfaceC8889q
            /* renamed from: o */
            public void mo25203o(InterfaceC8892r interfaceC8892r) {
                i.this.f20983b.m25670b();
                super.mo25203o(new C13217a(interfaceC8892r));
            }

            @Override // io.grpc.internal.AbstractC8854h0
            /* renamed from: p */
            protected InterfaceC8889q mo25586p() {
                return this.f20984a;
            }
        }

        private i(InterfaceC8904v interfaceC8904v, C8873m c8873m) {
            this.f20982a = interfaceC8904v;
            this.f20983b = c8873m;
        }

        /* synthetic */ i(InterfaceC8904v interfaceC8904v, C8873m c8873m, a aVar) {
            this(interfaceC8904v, c8873m);
        }

        @Override // io.grpc.internal.AbstractC8862j0
        /* renamed from: a */
        protected InterfaceC8904v mo25624a() {
            return this.f20982a;
        }

        @Override // io.grpc.internal.AbstractC8862j0, io.grpc.internal.InterfaceC8895s
        /* renamed from: c */
        public InterfaceC8889q mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
            return new a(super.mo25245c(c11955x0, c11953w0, c11901c, abstractC11925kArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$j */
    /* loaded from: classes3.dex */
    public static abstract class j {
        /* renamed from: a */
        abstract void mo25560a(C8911x0 c8911x0);

        /* renamed from: b */
        abstract void mo25561b(C8911x0 c8911x0);

        /* renamed from: c */
        abstract void mo25562c(C8911x0 c8911x0, C11940q c11940q);

        /* renamed from: d */
        abstract void mo25563d(C8911x0 c8911x0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$k */
    /* loaded from: classes3.dex */
    public static final class k {

        /* renamed from: a */
        private List<C11954x> f20988a;

        /* renamed from: b */
        private int f20989b;

        /* renamed from: c */
        private int f20990c;

        public k(List<C11954x> list) {
            this.f20988a = list;
        }

        /* renamed from: a */
        public SocketAddress m25920a() {
            return this.f20988a.get(this.f20989b).m38335a().get(this.f20990c);
        }

        /* renamed from: b */
        public C11895a m25921b() {
            return this.f20988a.get(this.f20989b).m38336b();
        }

        /* renamed from: c */
        public void m25922c() {
            C11954x c11954x = this.f20988a.get(this.f20989b);
            int i10 = this.f20990c + 1;
            this.f20990c = i10;
            if (i10 >= c11954x.m38335a().size()) {
                this.f20989b++;
                this.f20990c = 0;
            }
        }

        /* renamed from: d */
        public boolean m25923d() {
            return this.f20989b == 0 && this.f20990c == 0;
        }

        /* renamed from: e */
        public boolean m25924e() {
            return this.f20989b < this.f20988a.size();
        }

        /* renamed from: f */
        public void m25925f() {
            this.f20989b = 0;
            this.f20990c = 0;
        }

        /* renamed from: g */
        public boolean m25926g(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f20988a.size(); i10++) {
                int indexOf = this.f20988a.get(i10).m38335a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f20989b = i10;
                    this.f20990c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void m25927h(List<C11954x> list) {
            this.f20988a = list;
            m25925f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.x0$l */
    /* loaded from: classes3.dex */
    public class l implements InterfaceC8863j1.a {

        /* renamed from: a */
        final InterfaceC8904v f20991a;

        /* renamed from: b */
        final SocketAddress f20992b;

        /* renamed from: c */
        boolean f20993c = false;

        /* renamed from: io.grpc.internal.x0$l$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8911x0.this.f20957o = null;
                if (C8911x0.this.f20967y != null) {
                    C7159o.m21319v(C8911x0.this.f20965w == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f20991a.mo25246d(C8911x0.this.f20967y);
                    return;
                }
                InterfaceC8904v interfaceC8904v = C8911x0.this.f20964v;
                l lVar2 = l.this;
                InterfaceC8904v interfaceC8904v2 = lVar2.f20991a;
                if (interfaceC8904v == interfaceC8904v2) {
                    C8911x0.this.f20965w = interfaceC8904v2;
                    C8911x0.this.f20964v = null;
                    C8911x0.this.m25890M(EnumC11938p.READY);
                }
            }
        }

        /* renamed from: io.grpc.internal.x0$l$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11915g1 f20996a;

            b(C11915g1 c11915g1) {
                this.f20996a = c11915g1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C8911x0.this.f20966x.m38239c() == EnumC11938p.SHUTDOWN) {
                    return;
                }
                InterfaceC8863j1 interfaceC8863j1 = C8911x0.this.f20965w;
                l lVar = l.this;
                if (interfaceC8863j1 == lVar.f20991a) {
                    C8911x0.this.f20965w = null;
                    C8911x0.this.f20955m.m25925f();
                    C8911x0.this.m25890M(EnumC11938p.IDLE);
                    return;
                }
                InterfaceC8904v interfaceC8904v = C8911x0.this.f20964v;
                l lVar2 = l.this;
                if (interfaceC8904v == lVar2.f20991a) {
                    C7159o.m21322y(C8911x0.this.f20966x.m38239c() == EnumC11938p.CONNECTING, "Expected state is CONNECTING, actual state is %s", C8911x0.this.f20966x.m38239c());
                    C8911x0.this.f20955m.m25922c();
                    if (C8911x0.this.f20955m.m25924e()) {
                        C8911x0.this.m25896S();
                        return;
                    }
                    C8911x0.this.f20964v = null;
                    C8911x0.this.f20955m.m25925f();
                    C8911x0.this.m25895R(this.f20996a);
                }
            }
        }

        /* renamed from: io.grpc.internal.x0$l$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8911x0.this.f20962t.remove(l.this.f20991a);
                if (C8911x0.this.f20966x.m38239c() == EnumC11938p.SHUTDOWN && C8911x0.this.f20962t.isEmpty()) {
                    C8911x0.this.m25892O();
                }
            }
        }

        l(InterfaceC8904v interfaceC8904v, SocketAddress socketAddress) {
            this.f20991a = interfaceC8904v;
            this.f20992b = socketAddress;
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: a */
        public void mo25536a() {
            C8911x0.this.f20953k.mo25682a(AbstractC11910f.a.INFO, "READY");
            C8911x0.this.f20954l.execute(new a());
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: b */
        public void mo25537b(boolean z10) {
            C8911x0.this.m25893P(this.f20991a, z10);
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: c */
        public void mo25538c() {
            C7159o.m21319v(this.f20993c, "transportShutdown() must be called before transportTerminated().");
            C8911x0.this.f20953k.mo25683b(AbstractC11910f.a.INFO, "{0} Terminated", this.f20991a.mo25247e());
            C8911x0.this.f20950h.m38109i(this.f20991a);
            C8911x0.this.m25893P(this.f20991a, false);
            C8911x0.this.f20954l.execute(new c());
        }

        @Override // io.grpc.internal.InterfaceC8863j1.a
        /* renamed from: d */
        public void mo25539d(C11915g1 c11915g1) {
            C8911x0.this.f20953k.mo25683b(AbstractC11910f.a.INFO, "{0} SHUTDOWN with {1}", this.f20991a.mo25247e(), C8911x0.this.m25894Q(c11915g1));
            this.f20993c = true;
            C8911x0.this.f20954l.execute(new b(c11915g1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.x0$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC11910f {

        /* renamed from: a */
        C11920i0 f20999a;

        m() {
        }

        @Override // vi.AbstractC11910f
        /* renamed from: a */
        public void mo25682a(AbstractC11910f.a aVar, String str) {
            C8877n.m25677d(this.f20999a, aVar, str);
        }

        @Override // vi.AbstractC11910f
        /* renamed from: b */
        public void mo25683b(AbstractC11910f.a aVar, String str, Object... objArr) {
            C8877n.m25678e(this.f20999a, aVar, str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8911x0(List<C11954x> list, String str, String str2, InterfaceC8865k.a aVar, InterfaceC8898t interfaceC8898t, ScheduledExecutorService scheduledExecutorService, InterfaceC7166v<C7164t> interfaceC7166v, ExecutorC11927k1 executorC11927k1, j jVar, C11902c0 c11902c0, C8873m c8873m, C8881o c8881o, C11920i0 c11920i0, AbstractC11910f abstractC11910f) {
        C7159o.m21313p(list, "addressGroups");
        C7159o.m21302e(!list.isEmpty(), "addressGroups is empty");
        m25889L(list, "addressGroups contains null entry");
        List<C11954x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f20956n = unmodifiableList;
        this.f20955m = new k(unmodifiableList);
        this.f20944b = str;
        this.f20945c = str2;
        this.f20946d = aVar;
        this.f20948f = interfaceC8898t;
        this.f20949g = scheduledExecutorService;
        this.f20958p = interfaceC7166v.get();
        this.f20954l = executorC11927k1;
        this.f20947e = jVar;
        this.f20950h = c11902c0;
        this.f20951i = c8873m;
        this.f20952j = (C8881o) C7159o.m21313p(c8881o, "channelTracer");
        this.f20943a = (C11920i0) C7159o.m21313p(c11920i0, "logId");
        this.f20953k = (AbstractC11910f) C7159o.m21313p(abstractC11910f, "channelLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m25888K() {
        this.f20954l.m38196e();
        ExecutorC11927k1.d dVar = this.f20959q;
        if (dVar != null) {
            dVar.m38197a();
            this.f20959q = null;
            this.f20957o = null;
        }
    }

    /* renamed from: L */
    private static void m25889L(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            C7159o.m21313p(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m25890M(EnumC11938p enumC11938p) {
        this.f20954l.m38196e();
        m25891N(C11940q.m38237a(enumC11938p));
    }

    /* renamed from: N */
    private void m25891N(C11940q c11940q) {
        this.f20954l.m38196e();
        if (this.f20966x.m38239c() != c11940q.m38239c()) {
            C7159o.m21319v(this.f20966x.m38239c() != EnumC11938p.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + c11940q);
            this.f20966x = c11940q;
            this.f20947e.mo25562c(this, c11940q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public void m25892O() {
        this.f20954l.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m25893P(InterfaceC8904v interfaceC8904v, boolean z10) {
        this.f20954l.execute(new g(interfaceC8904v, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public String m25894Q(C11915g1 c11915g1) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c11915g1.m38143n());
        if (c11915g1.m38144o() != null) {
            sb2.append("(");
            sb2.append(c11915g1.m38144o());
            sb2.append(")");
        }
        if (c11915g1.m38142m() != null) {
            sb2.append("[");
            sb2.append(c11915g1.m38142m());
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m25895R(C11915g1 c11915g1) {
        this.f20954l.m38196e();
        m25891N(C11940q.m38238b(c11915g1));
        if (this.f20957o == null) {
            this.f20957o = this.f20946d.get();
        }
        long mo25422a = this.f20957o.mo25422a();
        C7164t c7164t = this.f20958p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long m21345d = mo25422a - c7164t.m21345d(timeUnit);
        this.f20953k.mo25683b(AbstractC11910f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m25894Q(c11915g1), Long.valueOf(m21345d));
        C7159o.m21319v(this.f20959q == null, "previous reconnectTask is not done");
        this.f20959q = this.f20954l.m38194c(new b(), m21345d, timeUnit, this.f20949g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m25896S() {
        SocketAddress socketAddress;
        C11899b0 c11899b0;
        this.f20954l.m38196e();
        C7159o.m21319v(this.f20959q == null, "Should have no reconnectTask scheduled");
        if (this.f20955m.m25923d()) {
            this.f20958p.m21346f().m21347g();
        }
        SocketAddress m25920a = this.f20955m.m25920a();
        a aVar = null;
        if (m25920a instanceof C11899b0) {
            c11899b0 = (C11899b0) m25920a;
            socketAddress = c11899b0.m38070c();
        } else {
            socketAddress = m25920a;
            c11899b0 = null;
        }
        C11895a m25921b = this.f20955m.m25921b();
        String str = (String) m25921b.m38048b(C11954x.f31674d);
        InterfaceC8898t.a aVar2 = new InterfaceC8898t.a();
        if (str == null) {
            str = this.f20944b;
        }
        InterfaceC8898t.a m25826g = aVar2.m25824e(str).m25825f(m25921b).m25827h(this.f20945c).m25826g(c11899b0);
        m mVar = new m();
        mVar.f20999a = mo25247e();
        i iVar = new i(this.f20948f.mo25642h1(socketAddress, m25826g, mVar), this.f20951i, aVar);
        mVar.f20999a = iVar.mo25247e();
        this.f20950h.m38106c(iVar);
        this.f20964v = iVar;
        this.f20962t.add(iVar);
        Runnable mo25248g = iVar.mo25248g(new l(iVar, socketAddress));
        if (mo25248g != null) {
            this.f20954l.m38193b(mo25248g);
        }
        this.f20953k.mo25683b(AbstractC11910f.a.INFO, "Started transport {0}", mVar.f20999a);
    }

    /* renamed from: T */
    public void m25916T(List<C11954x> list) {
        C7159o.m21313p(list, "newAddressGroups");
        m25889L(list, "newAddressGroups contains null entry");
        C7159o.m21302e(!list.isEmpty(), "newAddressGroups is empty");
        this.f20954l.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.InterfaceC8876m2
    /* renamed from: a */
    public InterfaceC8895s mo25675a() {
        InterfaceC8863j1 interfaceC8863j1 = this.f20965w;
        if (interfaceC8863j1 != null) {
            return interfaceC8863j1;
        }
        this.f20954l.execute(new c());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m25917b(C11915g1 c11915g1) {
        m25918d(c11915g1);
        this.f20954l.execute(new h(c11915g1));
    }

    /* renamed from: d */
    public void m25918d(C11915g1 c11915g1) {
        this.f20954l.execute(new e(c11915g1));
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        return this.f20943a;
    }

    public String toString() {
        return C7153i.m21274c(this).m21283c("logId", this.f20943a.m38165d()).m21284d("addressGroups", this.f20956n).toString();
    }
}
