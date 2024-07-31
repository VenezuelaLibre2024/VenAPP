package bj;

import com.google.common.collect.r;
import com.google.common.collect.w;
import eb.o;
import io.grpc.internal.d2;
import io.grpc.internal.k2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import vi.a;
import vi.g1;
import vi.k;
import vi.k1;
import vi.p;
import vi.p0;
import vi.q;
import vi.w0;
import vi.x;

/* loaded from: classes3.dex */
public final class e extends p0 {

    /* renamed from: k, reason: collision with root package name */
    private static final a.c<b> f6636k = a.c.a("addressTrackerKey");

    /* renamed from: c, reason: collision with root package name */
    final c f6637c;

    /* renamed from: d, reason: collision with root package name */
    private final k1 f6638d;

    /* renamed from: e, reason: collision with root package name */
    private final p0.d f6639e;

    /* renamed from: f, reason: collision with root package name */
    private final bj.d f6640f;

    /* renamed from: g, reason: collision with root package name */
    private k2 f6641g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f6642h;

    /* renamed from: i, reason: collision with root package name */
    private k1.d f6643i;

    /* renamed from: j, reason: collision with root package name */
    private Long f6644j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private g f6645a;

        /* renamed from: b, reason: collision with root package name */
        private volatile a f6646b;

        /* renamed from: c, reason: collision with root package name */
        private a f6647c;

        /* renamed from: d, reason: collision with root package name */
        private Long f6648d;

        /* renamed from: e, reason: collision with root package name */
        private int f6649e;

        /* renamed from: f, reason: collision with root package name */
        private final Set<i> f6650f = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            AtomicLong f6651a;

            /* renamed from: b, reason: collision with root package name */
            AtomicLong f6652b;

            private a() {
                this.f6651a = new AtomicLong();
                this.f6652b = new AtomicLong();
            }

            void a() {
                this.f6651a.set(0L);
                this.f6652b.set(0L);
            }
        }

        b(g gVar) {
            this.f6646b = new a();
            this.f6647c = new a();
            this.f6645a = gVar;
        }

        boolean b(i iVar) {
            if (m() && !iVar.n()) {
                iVar.m();
            } else if (!m() && iVar.n()) {
                iVar.p();
            }
            iVar.o(this);
            return this.f6650f.add(iVar);
        }

        void c() {
            int i10 = this.f6649e;
            this.f6649e = i10 == 0 ? 0 : i10 - 1;
        }

        void d(long j10) {
            this.f6648d = Long.valueOf(j10);
            this.f6649e++;
            Iterator<i> it = this.f6650f.iterator();
            while (it.hasNext()) {
                it.next().m();
            }
        }

        double e() {
            return this.f6647c.f6652b.get() / f();
        }

        long f() {
            return this.f6647c.f6651a.get() + this.f6647c.f6652b.get();
        }

        void g(boolean z10) {
            g gVar = this.f6645a;
            if (gVar.f6663e == null && gVar.f6664f == null) {
                return;
            }
            (z10 ? this.f6646b.f6651a : this.f6646b.f6652b).getAndIncrement();
        }

        public boolean h(long j10) {
            return j10 > this.f6648d.longValue() + Math.min(this.f6645a.f6660b.longValue() * ((long) this.f6649e), Math.max(this.f6645a.f6660b.longValue(), this.f6645a.f6661c.longValue()));
        }

        boolean i(i iVar) {
            iVar.l();
            return this.f6650f.remove(iVar);
        }

        void j() {
            this.f6646b.a();
            this.f6647c.a();
        }

        void k() {
            this.f6649e = 0;
        }

        void l(g gVar) {
            this.f6645a = gVar;
        }

        boolean m() {
            return this.f6648d != null;
        }

        double n() {
            return this.f6647c.f6651a.get() / f();
        }

        void o() {
            this.f6647c.a();
            a aVar = this.f6646b;
            this.f6646b = this.f6647c;
            this.f6647c = aVar;
        }

        void p() {
            o.v(this.f6648d != null, "not currently ejected");
            this.f6648d = null;
            Iterator<i> it = this.f6650f.iterator();
            while (it.hasNext()) {
                it.next().p();
            }
        }
    }

    /* loaded from: classes3.dex */
    static class c extends r<SocketAddress, b> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<SocketAddress, b> f6653a = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.s
        /* renamed from: b */
        public Map<SocketAddress, b> a() {
            return this.f6653a;
        }

        void f() {
            for (b bVar : this.f6653a.values()) {
                if (bVar.m()) {
                    bVar.p();
                }
                bVar.k();
            }
        }

        double g() {
            if (this.f6653a.isEmpty()) {
                return 0.0d;
            }
            Iterator<b> it = this.f6653a.values().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                if (it.next().m()) {
                    i10++;
                }
            }
            return (i10 / i11) * 100.0d;
        }

        void i(Long l10) {
            for (b bVar : this.f6653a.values()) {
                if (!bVar.m()) {
                    bVar.c();
                }
                if (bVar.m() && bVar.h(l10.longValue())) {
                    bVar.p();
                }
            }
        }

        void j(g gVar, Collection<SocketAddress> collection) {
            for (SocketAddress socketAddress : collection) {
                if (!this.f6653a.containsKey(socketAddress)) {
                    this.f6653a.put(socketAddress, new b(gVar));
                }
            }
        }

        void k() {
            Iterator<b> it = this.f6653a.values().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        }

        void l() {
            Iterator<b> it = this.f6653a.values().iterator();
            while (it.hasNext()) {
                it.next().o();
            }
        }

        void m(g gVar) {
            Iterator<b> it = this.f6653a.values().iterator();
            while (it.hasNext()) {
                it.next().l(gVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends bj.b {

        /* renamed from: a, reason: collision with root package name */
        private p0.d f6654a;

        d(p0.d dVar) {
            this.f6654a = dVar;
        }

        @Override // bj.b, vi.p0.d
        public p0.h a(p0.b bVar) {
            i iVar = new i(this.f6654a.a(bVar));
            List<x> a10 = bVar.a();
            if (e.l(a10) && e.this.f6637c.containsKey(a10.get(0).a().get(0))) {
                b bVar2 = e.this.f6637c.get(a10.get(0).a().get(0));
                bVar2.b(iVar);
                if (bVar2.f6648d != null) {
                    iVar.m();
                }
            }
            return iVar;
        }

        @Override // vi.p0.d
        public void f(p pVar, p0.i iVar) {
            this.f6654a.f(pVar, new h(iVar));
        }

        @Override // bj.b
        protected p0.d g() {
            return this.f6654a;
        }
    }

    /* renamed from: bj.e$e, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0109e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        g f6656a;

        RunnableC0109e(g gVar) {
            this.f6656a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f6644j = Long.valueOf(eVar.f6641g.a());
            e.this.f6637c.l();
            for (j jVar : j.a(this.f6656a)) {
                e eVar2 = e.this;
                jVar.b(eVar2.f6637c, eVar2.f6644j.longValue());
            }
            e eVar3 = e.this;
            eVar3.f6637c.i(eVar3.f6644j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class f implements j {

        /* renamed from: a, reason: collision with root package name */
        private final g f6658a;

        f(g gVar) {
            this.f6658a = gVar;
        }

        @Override // bj.e.j
        public void b(c cVar, long j10) {
            List<b> m10 = e.m(cVar, this.f6658a.f6664f.f6676d.intValue());
            if (m10.size() < this.f6658a.f6664f.f6675c.intValue() || m10.size() == 0) {
                return;
            }
            for (b bVar : m10) {
                if (cVar.g() >= this.f6658a.f6662d.intValue()) {
                    return;
                }
                if (bVar.f() >= this.f6658a.f6664f.f6676d.intValue()) {
                    if (bVar.e() > this.f6658a.f6664f.f6673a.intValue() / 100.0d && new Random().nextInt(100) < this.f6658a.f6664f.f6674b.intValue()) {
                        bVar.d(j10);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Long f6659a;

        /* renamed from: b, reason: collision with root package name */
        public final Long f6660b;

        /* renamed from: c, reason: collision with root package name */
        public final Long f6661c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f6662d;

        /* renamed from: e, reason: collision with root package name */
        public final c f6663e;

        /* renamed from: f, reason: collision with root package name */
        public final b f6664f;

        /* renamed from: g, reason: collision with root package name */
        public final d2.b f6665g;

        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Long f6666a = 10000000000L;

            /* renamed from: b, reason: collision with root package name */
            Long f6667b = 30000000000L;

            /* renamed from: c, reason: collision with root package name */
            Long f6668c = 30000000000L;

            /* renamed from: d, reason: collision with root package name */
            Integer f6669d = 10;

            /* renamed from: e, reason: collision with root package name */
            c f6670e;

            /* renamed from: f, reason: collision with root package name */
            b f6671f;

            /* renamed from: g, reason: collision with root package name */
            d2.b f6672g;

            public g a() {
                o.u(this.f6672g != null);
                return new g(this.f6666a, this.f6667b, this.f6668c, this.f6669d, this.f6670e, this.f6671f, this.f6672g);
            }

            public a b(Long l10) {
                o.d(l10 != null);
                this.f6667b = l10;
                return this;
            }

            public a c(d2.b bVar) {
                o.u(bVar != null);
                this.f6672g = bVar;
                return this;
            }

            public a d(b bVar) {
                this.f6671f = bVar;
                return this;
            }

            public a e(Long l10) {
                o.d(l10 != null);
                this.f6666a = l10;
                return this;
            }

            public a f(Integer num) {
                o.d(num != null);
                this.f6669d = num;
                return this;
            }

            public a g(Long l10) {
                o.d(l10 != null);
                this.f6668c = l10;
                return this;
            }

            public a h(c cVar) {
                this.f6670e = cVar;
                return this;
            }
        }

        /* loaded from: classes3.dex */
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f6673a;

            /* renamed from: b, reason: collision with root package name */
            public final Integer f6674b;

            /* renamed from: c, reason: collision with root package name */
            public final Integer f6675c;

            /* renamed from: d, reason: collision with root package name */
            public final Integer f6676d;

            /* loaded from: classes3.dex */
            public static class a {

                /* renamed from: a, reason: collision with root package name */
                Integer f6677a = 85;

                /* renamed from: b, reason: collision with root package name */
                Integer f6678b = 100;

                /* renamed from: c, reason: collision with root package name */
                Integer f6679c = 5;

                /* renamed from: d, reason: collision with root package name */
                Integer f6680d = 50;

                public b a() {
                    return new b(this.f6677a, this.f6678b, this.f6679c, this.f6680d);
                }

                public a b(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0 && num.intValue() <= 100);
                    this.f6678b = num;
                    return this;
                }

                public a c(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0);
                    this.f6679c = num;
                    return this;
                }

                public a d(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0);
                    this.f6680d = num;
                    return this;
                }

                public a e(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0 && num.intValue() <= 100);
                    this.f6677a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f6673a = num;
                this.f6674b = num2;
                this.f6675c = num3;
                this.f6676d = num4;
            }
        }

        /* loaded from: classes3.dex */
        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f6681a;

            /* renamed from: b, reason: collision with root package name */
            public final Integer f6682b;

            /* renamed from: c, reason: collision with root package name */
            public final Integer f6683c;

            /* renamed from: d, reason: collision with root package name */
            public final Integer f6684d;

            /* loaded from: classes3.dex */
            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                Integer f6685a = 1900;

                /* renamed from: b, reason: collision with root package name */
                Integer f6686b = 100;

                /* renamed from: c, reason: collision with root package name */
                Integer f6687c = 5;

                /* renamed from: d, reason: collision with root package name */
                Integer f6688d = 100;

                public c a() {
                    return new c(this.f6685a, this.f6686b, this.f6687c, this.f6688d);
                }

                public a b(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0 && num.intValue() <= 100);
                    this.f6686b = num;
                    return this;
                }

                public a c(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0);
                    this.f6687c = num;
                    return this;
                }

                public a d(Integer num) {
                    o.d(num != null);
                    o.d(num.intValue() >= 0);
                    this.f6688d = num;
                    return this;
                }

                public a e(Integer num) {
                    o.d(num != null);
                    this.f6685a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f6681a = num;
                this.f6682b = num2;
                this.f6683c = num3;
                this.f6684d = num4;
            }
        }

        private g(Long l10, Long l11, Long l12, Integer num, c cVar, b bVar, d2.b bVar2) {
            this.f6659a = l10;
            this.f6660b = l11;
            this.f6661c = l12;
            this.f6662d = num;
            this.f6663e = cVar;
            this.f6664f = bVar;
            this.f6665g = bVar2;
        }

        boolean a() {
            return (this.f6663e == null && this.f6664f == null) ? false : true;
        }
    }

    /* loaded from: classes3.dex */
    class h extends p0.i {

        /* renamed from: a, reason: collision with root package name */
        private final p0.i f6689a;

        /* loaded from: classes3.dex */
        class a extends vi.k {

            /* renamed from: a, reason: collision with root package name */
            b f6691a;

            public a(b bVar) {
                this.f6691a = bVar;
            }

            @Override // vi.j1
            public void i(g1 g1Var) {
                this.f6691a.g(g1Var.p());
            }
        }

        /* loaded from: classes3.dex */
        class b extends k.a {

            /* renamed from: a, reason: collision with root package name */
            private final b f6693a;

            b(b bVar) {
                this.f6693a = bVar;
            }

            @Override // vi.k.a
            public vi.k a(k.b bVar, w0 w0Var) {
                return new a(this.f6693a);
            }
        }

        h(p0.i iVar) {
            this.f6689a = iVar;
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            p0.e a10 = this.f6689a.a(fVar);
            p0.h c10 = a10.c();
            return c10 != null ? p0.e.i(c10, new b((b) c10.c().b(e.f6636k))) : a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends bj.c {

        /* renamed from: a, reason: collision with root package name */
        private final p0.h f6695a;

        /* renamed from: b, reason: collision with root package name */
        private b f6696b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6697c;

        /* renamed from: d, reason: collision with root package name */
        private q f6698d;

        /* renamed from: e, reason: collision with root package name */
        private p0.j f6699e;

        /* loaded from: classes3.dex */
        class a implements p0.j {

            /* renamed from: a, reason: collision with root package name */
            private final p0.j f6701a;

            a(p0.j jVar) {
                this.f6701a = jVar;
            }

            @Override // vi.p0.j
            public void a(q qVar) {
                i.this.f6698d = qVar;
                if (i.this.f6697c) {
                    return;
                }
                this.f6701a.a(qVar);
            }
        }

        i(p0.h hVar) {
            this.f6695a = hVar;
        }

        @Override // vi.p0.h
        public vi.a c() {
            return this.f6696b != null ? this.f6695a.c().d().d(e.f6636k, this.f6696b).a() : this.f6695a.c();
        }

        @Override // bj.c, vi.p0.h
        public void g(p0.j jVar) {
            this.f6699e = jVar;
            super.g(new a(jVar));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
        
            r3.f6700f.f6637c.get(r0).b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
        
            if (r3.f6700f.f6637c.containsKey(r0) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        
            if (r3.f6700f.f6637c.containsKey(r0) != false) goto L25;
         */
        @Override // vi.p0.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(java.util.List<vi.x> r4) {
            /*
                r3 = this;
                java.util.List r0 = r3.b()
                boolean r0 = bj.e.i(r0)
                r1 = 0
                if (r0 == 0) goto L3d
                boolean r0 = bj.e.i(r4)
                if (r0 == 0) goto L3d
                bj.e r0 = bj.e.this
                bj.e$c r0 = r0.f6637c
                bj.e$b r2 = r3.f6696b
                boolean r0 = r0.containsValue(r2)
                if (r0 == 0) goto L22
                bj.e$b r0 = r3.f6696b
                r0.i(r3)
            L22:
                java.lang.Object r0 = r4.get(r1)
                vi.x r0 = (vi.x) r0
                java.util.List r0 = r0.a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                bj.e r1 = bj.e.this
                bj.e$c r1 = r1.f6637c
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
                goto Laa
            L3d:
                java.util.List r0 = r3.b()
                boolean r0 = bj.e.i(r0)
                if (r0 == 0) goto L80
                boolean r0 = bj.e.i(r4)
                if (r0 != 0) goto L80
                bj.e r0 = bj.e.this
                bj.e$c r0 = r0.f6637c
                vi.x r2 = r3.a()
                java.util.List r2 = r2.a()
                java.lang.Object r2 = r2.get(r1)
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lb7
                bj.e r0 = bj.e.this
                bj.e$c r0 = r0.f6637c
                vi.x r2 = r3.a()
                java.util.List r2 = r2.a()
                java.lang.Object r1 = r2.get(r1)
                java.lang.Object r0 = r0.get(r1)
                bj.e$b r0 = (bj.e.b) r0
                r0.i(r3)
                r0.j()
                goto Lb7
            L80:
                java.util.List r0 = r3.b()
                boolean r0 = bj.e.i(r0)
                if (r0 != 0) goto Lb7
                boolean r0 = bj.e.i(r4)
                if (r0 == 0) goto Lb7
                java.lang.Object r0 = r4.get(r1)
                vi.x r0 = (vi.x) r0
                java.util.List r0 = r0.a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                bj.e r1 = bj.e.this
                bj.e$c r1 = r1.f6637c
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
            Laa:
                bj.e r1 = bj.e.this
                bj.e$c r1 = r1.f6637c
                java.lang.Object r0 = r1.get(r0)
                bj.e$b r0 = (bj.e.b) r0
                r0.b(r3)
            Lb7:
                vi.p0$h r0 = r3.f6695a
                r0.h(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bj.e.i.h(java.util.List):void");
        }

        @Override // bj.c
        protected p0.h i() {
            return this.f6695a;
        }

        void l() {
            this.f6696b = null;
        }

        void m() {
            this.f6697c = true;
            this.f6699e.a(q.b(g1.f29115u));
        }

        boolean n() {
            return this.f6697c;
        }

        void o(b bVar) {
            this.f6696b = bVar;
        }

        void p() {
            this.f6697c = false;
            q qVar = this.f6698d;
            if (qVar != null) {
                this.f6699e.a(qVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    interface j {
        static List<j> a(g gVar) {
            w.a p10 = w.p();
            if (gVar.f6663e != null) {
                p10.a(new k(gVar));
            }
            if (gVar.f6664f != null) {
                p10.a(new f(gVar));
            }
            return p10.k();
        }

        void b(c cVar, long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class k implements j {

        /* renamed from: a, reason: collision with root package name */
        private final g f6703a;

        k(g gVar) {
            o.e(gVar.f6663e != null, "success rate ejection config is null");
            this.f6703a = gVar;
        }

        static double c(Collection<Double> collection) {
            Iterator<Double> it = collection.iterator();
            double d10 = 0.0d;
            while (it.hasNext()) {
                d10 += it.next().doubleValue();
            }
            return d10 / collection.size();
        }

        static double d(Collection<Double> collection, double d10) {
            Iterator<Double> it = collection.iterator();
            double d11 = 0.0d;
            while (it.hasNext()) {
                double doubleValue = it.next().doubleValue() - d10;
                d11 += doubleValue * doubleValue;
            }
            return Math.sqrt(d11 / collection.size());
        }

        @Override // bj.e.j
        public void b(c cVar, long j10) {
            List<b> m10 = e.m(cVar, this.f6703a.f6663e.f6684d.intValue());
            if (m10.size() < this.f6703a.f6663e.f6683c.intValue() || m10.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = m10.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((b) it.next()).n()));
            }
            double c10 = c(arrayList);
            double d10 = c10 - (d(arrayList, c10) * (this.f6703a.f6663e.f6681a.intValue() / 1000.0f));
            for (b bVar : m10) {
                if (cVar.g() >= this.f6703a.f6662d.intValue()) {
                    return;
                }
                if (bVar.n() < d10 && new Random().nextInt(100) < this.f6703a.f6663e.f6682b.intValue()) {
                    bVar.d(j10);
                }
            }
        }
    }

    public e(p0.d dVar, k2 k2Var) {
        d dVar2 = new d((p0.d) o.p(dVar, "helper"));
        this.f6639e = dVar2;
        this.f6640f = new bj.d(dVar2);
        this.f6637c = new c();
        this.f6638d = (k1) o.p(dVar.d(), "syncContext");
        this.f6642h = (ScheduledExecutorService) o.p(dVar.c(), "timeService");
        this.f6641g = k2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(List<x> list) {
        Iterator<x> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().a().size();
            if (i10 > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<b> m(c cVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.f() >= i10) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // vi.p0
    public boolean a(p0.g gVar) {
        g gVar2 = (g) gVar.c();
        ArrayList arrayList = new ArrayList();
        Iterator<x> it = gVar.a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().a());
        }
        this.f6637c.keySet().retainAll(arrayList);
        this.f6637c.m(gVar2);
        this.f6637c.j(gVar2, arrayList);
        this.f6640f.q(gVar2.f6665g.b());
        if (gVar2.a()) {
            Long valueOf = this.f6644j == null ? gVar2.f6659a : Long.valueOf(Math.max(0L, gVar2.f6659a.longValue() - (this.f6641g.a() - this.f6644j.longValue())));
            k1.d dVar = this.f6643i;
            if (dVar != null) {
                dVar.a();
                this.f6637c.k();
            }
            this.f6643i = this.f6638d.d(new RunnableC0109e(gVar2), valueOf.longValue(), gVar2.f6659a.longValue(), TimeUnit.NANOSECONDS, this.f6642h);
        } else {
            k1.d dVar2 = this.f6643i;
            if (dVar2 != null) {
                dVar2.a();
                this.f6644j = null;
                this.f6637c.f();
            }
        }
        this.f6640f.d(gVar.e().d(gVar2.f6665g.a()).a());
        return true;
    }

    @Override // vi.p0
    public void c(g1 g1Var) {
        this.f6640f.c(g1Var);
    }

    @Override // vi.p0
    public void e() {
        this.f6640f.e();
    }
}
