package bj;

import com.google.common.collect.AbstractC5897r;
import com.google.common.collect.AbstractC5907w;
import io.grpc.internal.C8840d2;
import io.grpc.internal.InterfaceC8868k2;
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
import p082eb.C7159o;
import vi.AbstractC11925k;
import vi.AbstractC11939p0;
import vi.C11895a;
import vi.C11915g1;
import vi.C11940q;
import vi.C11953w0;
import vi.C11954x;
import vi.EnumC11938p;
import vi.ExecutorC11927k1;

/* renamed from: bj.e */
/* loaded from: classes3.dex */
public final class C1802e extends AbstractC11939p0 {

    /* renamed from: k */
    private static final C11895a.c<b> f7585k = C11895a.c.m38054a("addressTrackerKey");

    /* renamed from: c */
    final c f7586c;

    /* renamed from: d */
    private final ExecutorC11927k1 f7587d;

    /* renamed from: e */
    private final AbstractC11939p0.d f7588e;

    /* renamed from: f */
    private final C1801d f7589f;

    /* renamed from: g */
    private InterfaceC8868k2 f7590g;

    /* renamed from: h */
    private final ScheduledExecutorService f7591h;

    /* renamed from: i */
    private ExecutorC11927k1.d f7592i;

    /* renamed from: j */
    private Long f7593j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.e$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private g f7594a;

        /* renamed from: b */
        private volatile a f7595b;

        /* renamed from: c */
        private a f7596c;

        /* renamed from: d */
        private Long f7597d;

        /* renamed from: e */
        private int f7598e;

        /* renamed from: f */
        private final Set<i> f7599f = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bj.e$b$a */
        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a */
            AtomicLong f7600a;

            /* renamed from: b */
            AtomicLong f7601b;

            private a() {
                this.f7600a = new AtomicLong();
                this.f7601b = new AtomicLong();
            }

            /* renamed from: a */
            void m9603a() {
                this.f7600a.set(0L);
                this.f7601b.set(0L);
            }
        }

        b(g gVar) {
            this.f7595b = new a();
            this.f7596c = new a();
            this.f7594a = gVar;
        }

        /* renamed from: b */
        boolean m9588b(i iVar) {
            if (m9599m() && !iVar.m9641n()) {
                iVar.m9640m();
            } else if (!m9599m() && iVar.m9641n()) {
                iVar.m9643p();
            }
            iVar.m9642o(this);
            return this.f7599f.add(iVar);
        }

        /* renamed from: c */
        void m9589c() {
            int i10 = this.f7598e;
            this.f7598e = i10 == 0 ? 0 : i10 - 1;
        }

        /* renamed from: d */
        void m9590d(long j10) {
            this.f7597d = Long.valueOf(j10);
            this.f7598e++;
            Iterator<i> it = this.f7599f.iterator();
            while (it.hasNext()) {
                it.next().m9640m();
            }
        }

        /* renamed from: e */
        double m9591e() {
            return this.f7596c.f7601b.get() / m9592f();
        }

        /* renamed from: f */
        long m9592f() {
            return this.f7596c.f7600a.get() + this.f7596c.f7601b.get();
        }

        /* renamed from: g */
        void m9593g(boolean z10) {
            g gVar = this.f7594a;
            if (gVar.f7612e == null && gVar.f7613f == null) {
                return;
            }
            (z10 ? this.f7595b.f7600a : this.f7595b.f7601b).getAndIncrement();
        }

        /* renamed from: h */
        public boolean m9594h(long j10) {
            return j10 > this.f7597d.longValue() + Math.min(this.f7594a.f7609b.longValue() * ((long) this.f7598e), Math.max(this.f7594a.f7609b.longValue(), this.f7594a.f7610c.longValue()));
        }

        /* renamed from: i */
        boolean m9595i(i iVar) {
            iVar.m9639l();
            return this.f7599f.remove(iVar);
        }

        /* renamed from: j */
        void m9596j() {
            this.f7595b.m9603a();
            this.f7596c.m9603a();
        }

        /* renamed from: k */
        void m9597k() {
            this.f7598e = 0;
        }

        /* renamed from: l */
        void m9598l(g gVar) {
            this.f7594a = gVar;
        }

        /* renamed from: m */
        boolean m9599m() {
            return this.f7597d != null;
        }

        /* renamed from: n */
        double m9600n() {
            return this.f7596c.f7600a.get() / m9592f();
        }

        /* renamed from: o */
        void m9601o() {
            this.f7596c.m9603a();
            a aVar = this.f7595b;
            this.f7595b = this.f7596c;
            this.f7596c = aVar;
        }

        /* renamed from: p */
        void m9602p() {
            C7159o.m21319v(this.f7597d != null, "not currently ejected");
            this.f7597d = null;
            Iterator<i> it = this.f7599f.iterator();
            while (it.hasNext()) {
                it.next().m9643p();
            }
        }
    }

    /* renamed from: bj.e$c */
    /* loaded from: classes3.dex */
    static class c extends AbstractC5897r<SocketAddress, b> {

        /* renamed from: a */
        private final Map<SocketAddress, b> f7602a = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC5899s
        /* renamed from: b */
        public Map<SocketAddress, b> mo9604a() {
            return this.f7602a;
        }

        /* renamed from: f */
        void m9606f() {
            for (b bVar : this.f7602a.values()) {
                if (bVar.m9599m()) {
                    bVar.m9602p();
                }
                bVar.m9597k();
            }
        }

        /* renamed from: g */
        double m9607g() {
            if (this.f7602a.isEmpty()) {
                return 0.0d;
            }
            Iterator<b> it = this.f7602a.values().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                if (it.next().m9599m()) {
                    i10++;
                }
            }
            return (i10 / i11) * 100.0d;
        }

        /* renamed from: i */
        void m9608i(Long l10) {
            for (b bVar : this.f7602a.values()) {
                if (!bVar.m9599m()) {
                    bVar.m9589c();
                }
                if (bVar.m9599m() && bVar.m9594h(l10.longValue())) {
                    bVar.m9602p();
                }
            }
        }

        /* renamed from: j */
        void m9609j(g gVar, Collection<SocketAddress> collection) {
            for (SocketAddress socketAddress : collection) {
                if (!this.f7602a.containsKey(socketAddress)) {
                    this.f7602a.put(socketAddress, new b(gVar));
                }
            }
        }

        /* renamed from: k */
        void m9610k() {
            Iterator<b> it = this.f7602a.values().iterator();
            while (it.hasNext()) {
                it.next().m9596j();
            }
        }

        /* renamed from: l */
        void m9611l() {
            Iterator<b> it = this.f7602a.values().iterator();
            while (it.hasNext()) {
                it.next().m9601o();
            }
        }

        /* renamed from: m */
        void m9612m(g gVar) {
            Iterator<b> it = this.f7602a.values().iterator();
            while (it.hasNext()) {
                it.next().m9598l(gVar);
            }
        }
    }

    /* renamed from: bj.e$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC1799b {

        /* renamed from: a */
        private AbstractC11939p0.d f7603a;

        d(AbstractC11939p0.d dVar) {
            this.f7603a = dVar;
        }

        @Override // bj.AbstractC1799b, vi.AbstractC11939p0.d
        /* renamed from: a */
        public AbstractC11939p0.h mo9552a(AbstractC11939p0.b bVar) {
            i iVar = new i(this.f7603a.mo9552a(bVar));
            List<C11954x> m38209a = bVar.m38209a();
            if (C1802e.m9584l(m38209a) && C1802e.this.f7586c.containsKey(m38209a.get(0).m38335a().get(0))) {
                b bVar2 = C1802e.this.f7586c.get(m38209a.get(0).m38335a().get(0));
                bVar2.m9588b(iVar);
                if (bVar2.f7597d != null) {
                    iVar.m9640m();
                }
            }
            return iVar;
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: f */
        public void mo9577f(EnumC11938p enumC11938p, AbstractC11939p0.i iVar) {
            this.f7603a.mo9577f(enumC11938p, new h(iVar));
        }

        @Override // bj.AbstractC1799b
        /* renamed from: g */
        protected AbstractC11939p0.d mo9557g() {
            return this.f7603a;
        }
    }

    /* renamed from: bj.e$e */
    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: a */
        g f7605a;

        e(g gVar) {
            this.f7605a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1802e c1802e = C1802e.this;
            c1802e.f7593j = Long.valueOf(c1802e.f7590g.mo25639a());
            C1802e.this.f7586c.m9611l();
            for (j jVar : j.m9645a(this.f7605a)) {
                C1802e c1802e2 = C1802e.this;
                jVar.mo9613b(c1802e2.f7586c, c1802e2.f7593j.longValue());
            }
            C1802e c1802e3 = C1802e.this;
            c1802e3.f7586c.m9608i(c1802e3.f7593j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.e$f */
    /* loaded from: classes3.dex */
    public static class f implements j {

        /* renamed from: a */
        private final g f7607a;

        f(g gVar) {
            this.f7607a = gVar;
        }

        @Override // bj.C1802e.j
        /* renamed from: b */
        public void mo9613b(c cVar, long j10) {
            List<b> m9585m = C1802e.m9585m(cVar, this.f7607a.f7613f.f7625d.intValue());
            if (m9585m.size() < this.f7607a.f7613f.f7624c.intValue() || m9585m.size() == 0) {
                return;
            }
            for (b bVar : m9585m) {
                if (cVar.m9607g() >= this.f7607a.f7611d.intValue()) {
                    return;
                }
                if (bVar.m9592f() >= this.f7607a.f7613f.f7625d.intValue()) {
                    if (bVar.m9591e() > this.f7607a.f7613f.f7622a.intValue() / 100.0d && new Random().nextInt(100) < this.f7607a.f7613f.f7623b.intValue()) {
                        bVar.m9590d(j10);
                    }
                }
            }
        }
    }

    /* renamed from: bj.e$g */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a */
        public final Long f7608a;

        /* renamed from: b */
        public final Long f7609b;

        /* renamed from: c */
        public final Long f7610c;

        /* renamed from: d */
        public final Integer f7611d;

        /* renamed from: e */
        public final c f7612e;

        /* renamed from: f */
        public final b f7613f;

        /* renamed from: g */
        public final C8840d2.b f7614g;

        /* renamed from: bj.e$g$a */
        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a */
            Long f7615a = 10000000000L;

            /* renamed from: b */
            Long f7616b = 30000000000L;

            /* renamed from: c */
            Long f7617c = 30000000000L;

            /* renamed from: d */
            Integer f7618d = 10;

            /* renamed from: e */
            c f7619e;

            /* renamed from: f */
            b f7620f;

            /* renamed from: g */
            C8840d2.b f7621g;

            /* renamed from: a */
            public g m9615a() {
                C7159o.m21318u(this.f7621g != null);
                return new g(this.f7615a, this.f7616b, this.f7617c, this.f7618d, this.f7619e, this.f7620f, this.f7621g);
            }

            /* renamed from: b */
            public a m9616b(Long l10) {
                C7159o.m21301d(l10 != null);
                this.f7616b = l10;
                return this;
            }

            /* renamed from: c */
            public a m9617c(C8840d2.b bVar) {
                C7159o.m21318u(bVar != null);
                this.f7621g = bVar;
                return this;
            }

            /* renamed from: d */
            public a m9618d(b bVar) {
                this.f7620f = bVar;
                return this;
            }

            /* renamed from: e */
            public a m9619e(Long l10) {
                C7159o.m21301d(l10 != null);
                this.f7615a = l10;
                return this;
            }

            /* renamed from: f */
            public a m9620f(Integer num) {
                C7159o.m21301d(num != null);
                this.f7618d = num;
                return this;
            }

            /* renamed from: g */
            public a m9621g(Long l10) {
                C7159o.m21301d(l10 != null);
                this.f7617c = l10;
                return this;
            }

            /* renamed from: h */
            public a m9622h(c cVar) {
                this.f7619e = cVar;
                return this;
            }
        }

        /* renamed from: bj.e$g$b */
        /* loaded from: classes3.dex */
        public static class b {

            /* renamed from: a */
            public final Integer f7622a;

            /* renamed from: b */
            public final Integer f7623b;

            /* renamed from: c */
            public final Integer f7624c;

            /* renamed from: d */
            public final Integer f7625d;

            /* renamed from: bj.e$g$b$a */
            /* loaded from: classes3.dex */
            public static class a {

                /* renamed from: a */
                Integer f7626a = 85;

                /* renamed from: b */
                Integer f7627b = 100;

                /* renamed from: c */
                Integer f7628c = 5;

                /* renamed from: d */
                Integer f7629d = 50;

                /* renamed from: a */
                public b m9623a() {
                    return new b(this.f7626a, this.f7627b, this.f7628c, this.f7629d);
                }

                /* renamed from: b */
                public a m9624b(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0 && num.intValue() <= 100);
                    this.f7627b = num;
                    return this;
                }

                /* renamed from: c */
                public a m9625c(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0);
                    this.f7628c = num;
                    return this;
                }

                /* renamed from: d */
                public a m9626d(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0);
                    this.f7629d = num;
                    return this;
                }

                /* renamed from: e */
                public a m9627e(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0 && num.intValue() <= 100);
                    this.f7626a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f7622a = num;
                this.f7623b = num2;
                this.f7624c = num3;
                this.f7625d = num4;
            }
        }

        /* renamed from: bj.e$g$c */
        /* loaded from: classes3.dex */
        public static class c {

            /* renamed from: a */
            public final Integer f7630a;

            /* renamed from: b */
            public final Integer f7631b;

            /* renamed from: c */
            public final Integer f7632c;

            /* renamed from: d */
            public final Integer f7633d;

            /* renamed from: bj.e$g$c$a */
            /* loaded from: classes3.dex */
            public static final class a {

                /* renamed from: a */
                Integer f7634a = 1900;

                /* renamed from: b */
                Integer f7635b = 100;

                /* renamed from: c */
                Integer f7636c = 5;

                /* renamed from: d */
                Integer f7637d = 100;

                /* renamed from: a */
                public c m9628a() {
                    return new c(this.f7634a, this.f7635b, this.f7636c, this.f7637d);
                }

                /* renamed from: b */
                public a m9629b(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0 && num.intValue() <= 100);
                    this.f7635b = num;
                    return this;
                }

                /* renamed from: c */
                public a m9630c(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0);
                    this.f7636c = num;
                    return this;
                }

                /* renamed from: d */
                public a m9631d(Integer num) {
                    C7159o.m21301d(num != null);
                    C7159o.m21301d(num.intValue() >= 0);
                    this.f7637d = num;
                    return this;
                }

                /* renamed from: e */
                public a m9632e(Integer num) {
                    C7159o.m21301d(num != null);
                    this.f7634a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f7630a = num;
                this.f7631b = num2;
                this.f7632c = num3;
                this.f7633d = num4;
            }
        }

        private g(Long l10, Long l11, Long l12, Integer num, c cVar, b bVar, C8840d2.b bVar2) {
            this.f7608a = l10;
            this.f7609b = l11;
            this.f7610c = l12;
            this.f7611d = num;
            this.f7612e = cVar;
            this.f7613f = bVar;
            this.f7614g = bVar2;
        }

        /* renamed from: a */
        boolean m9614a() {
            return (this.f7612e == null && this.f7613f == null) ? false : true;
        }
    }

    /* renamed from: bj.e$h */
    /* loaded from: classes3.dex */
    class h extends AbstractC11939p0.i {

        /* renamed from: a */
        private final AbstractC11939p0.i f7638a;

        /* renamed from: bj.e$h$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC11925k {

            /* renamed from: a */
            b f7640a;

            public a(b bVar) {
                this.f7640a = bVar;
            }

            @Override // vi.AbstractC11924j1
            /* renamed from: i */
            public void mo9633i(C11915g1 c11915g1) {
                this.f7640a.m9593g(c11915g1.m38145p());
            }
        }

        /* renamed from: bj.e$h$b */
        /* loaded from: classes3.dex */
        class b extends AbstractC11925k.a {

            /* renamed from: a */
            private final b f7642a;

            b(b bVar) {
                this.f7642a = bVar;
            }

            @Override // vi.AbstractC11925k.a
            /* renamed from: a */
            public AbstractC11925k mo9634a(AbstractC11925k.b bVar, C11953w0 c11953w0) {
                return new a(this.f7642a);
            }
        }

        h(AbstractC11939p0.i iVar) {
            this.f7638a = iVar;
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            AbstractC11939p0.e mo9576a = this.f7638a.mo9576a(fVar);
            AbstractC11939p0.h m38225c = mo9576a.m38225c();
            return m38225c != null ? AbstractC11939p0.e.m38222i(m38225c, new b((b) m38225c.mo9637c().m38048b(C1802e.f7585k))) : mo9576a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.e$i */
    /* loaded from: classes3.dex */
    public class i extends AbstractC1800c {

        /* renamed from: a */
        private final AbstractC11939p0.h f7644a;

        /* renamed from: b */
        private b f7645b;

        /* renamed from: c */
        private boolean f7646c;

        /* renamed from: d */
        private C11940q f7647d;

        /* renamed from: e */
        private AbstractC11939p0.j f7648e;

        /* renamed from: bj.e$i$a */
        /* loaded from: classes3.dex */
        class a implements AbstractC11939p0.j {

            /* renamed from: a */
            private final AbstractC11939p0.j f7650a;

            a(AbstractC11939p0.j jVar) {
                this.f7650a = jVar;
            }

            @Override // vi.AbstractC11939p0.j
            /* renamed from: a */
            public void mo9644a(C11940q c11940q) {
                i.this.f7647d = c11940q;
                if (i.this.f7646c) {
                    return;
                }
                this.f7650a.mo9644a(c11940q);
            }
        }

        i(AbstractC11939p0.h hVar) {
            this.f7644a = hVar;
        }

        @Override // vi.AbstractC11939p0.h
        /* renamed from: c */
        public C11895a mo9637c() {
            return this.f7645b != null ? this.f7644a.mo9637c().m38049d().m38053d(C1802e.f7585k, this.f7645b).m38051a() : this.f7644a.mo9637c();
        }

        @Override // bj.AbstractC1800c, vi.AbstractC11939p0.h
        /* renamed from: g */
        public void mo9562g(AbstractC11939p0.j jVar) {
            this.f7648e = jVar;
            super.mo9562g(new a(jVar));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
        
            r3.f7649f.f7586c.get(r0).m9588b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
        
            if (r3.f7649f.f7586c.containsKey(r0) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        
            if (r3.f7649f.f7586c.containsKey(r0) != false) goto L25;
         */
        @Override // vi.AbstractC11939p0.h
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo9638h(java.util.List<vi.C11954x> r4) {
            /*
                r3 = this;
                java.util.List r0 = r3.mo9558b()
                boolean r0 = bj.C1802e.m9581i(r0)
                r1 = 0
                if (r0 == 0) goto L3d
                boolean r0 = bj.C1802e.m9581i(r4)
                if (r0 == 0) goto L3d
                bj.e r0 = bj.C1802e.this
                bj.e$c r0 = r0.f7586c
                bj.e$b r2 = r3.f7645b
                boolean r0 = r0.containsValue(r2)
                if (r0 == 0) goto L22
                bj.e$b r0 = r3.f7645b
                r0.m9595i(r3)
            L22:
                java.lang.Object r0 = r4.get(r1)
                vi.x r0 = (vi.C11954x) r0
                java.util.List r0 = r0.m38335a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                bj.e r1 = bj.C1802e.this
                bj.e$c r1 = r1.f7586c
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
                goto Laa
            L3d:
                java.util.List r0 = r3.mo9558b()
                boolean r0 = bj.C1802e.m9581i(r0)
                if (r0 == 0) goto L80
                boolean r0 = bj.C1802e.m9581i(r4)
                if (r0 != 0) goto L80
                bj.e r0 = bj.C1802e.this
                bj.e$c r0 = r0.f7586c
                vi.x r2 = r3.m38236a()
                java.util.List r2 = r2.m38335a()
                java.lang.Object r2 = r2.get(r1)
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lb7
                bj.e r0 = bj.C1802e.this
                bj.e$c r0 = r0.f7586c
                vi.x r2 = r3.m38236a()
                java.util.List r2 = r2.m38335a()
                java.lang.Object r1 = r2.get(r1)
                java.lang.Object r0 = r0.get(r1)
                bj.e$b r0 = (bj.C1802e.b) r0
                r0.m9595i(r3)
                r0.m9596j()
                goto Lb7
            L80:
                java.util.List r0 = r3.mo9558b()
                boolean r0 = bj.C1802e.m9581i(r0)
                if (r0 != 0) goto Lb7
                boolean r0 = bj.C1802e.m9581i(r4)
                if (r0 == 0) goto Lb7
                java.lang.Object r0 = r4.get(r1)
                vi.x r0 = (vi.C11954x) r0
                java.util.List r0 = r0.m38335a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                bj.e r1 = bj.C1802e.this
                bj.e$c r1 = r1.f7586c
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
            Laa:
                bj.e r1 = bj.C1802e.this
                bj.e$c r1 = r1.f7586c
                java.lang.Object r0 = r1.get(r0)
                bj.e$b r0 = (bj.C1802e.b) r0
                r0.m9588b(r3)
            Lb7:
                vi.p0$h r0 = r3.f7644a
                r0.mo9638h(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bj.C1802e.i.mo9638h(java.util.List):void");
        }

        @Override // bj.AbstractC1800c
        /* renamed from: i */
        protected AbstractC11939p0.h mo9563i() {
            return this.f7644a;
        }

        /* renamed from: l */
        void m9639l() {
            this.f7645b = null;
        }

        /* renamed from: m */
        void m9640m() {
            this.f7646c = true;
            this.f7648e.mo9644a(C11940q.m38238b(C11915g1.f31549u));
        }

        /* renamed from: n */
        boolean m9641n() {
            return this.f7646c;
        }

        /* renamed from: o */
        void m9642o(b bVar) {
            this.f7645b = bVar;
        }

        /* renamed from: p */
        void m9643p() {
            this.f7646c = false;
            C11940q c11940q = this.f7647d;
            if (c11940q != null) {
                this.f7648e.mo9644a(c11940q);
            }
        }
    }

    /* renamed from: bj.e$j */
    /* loaded from: classes3.dex */
    interface j {
        /* renamed from: a */
        static List<j> m9645a(g gVar) {
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            if (gVar.f7612e != null) {
                m15077p.mo14724a(new k(gVar));
            }
            if (gVar.f7613f != null) {
                m15077p.mo14724a(new f(gVar));
            }
            return m15077p.m15094k();
        }

        /* renamed from: b */
        void mo9613b(c cVar, long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.e$k */
    /* loaded from: classes3.dex */
    public static class k implements j {

        /* renamed from: a */
        private final g f7652a;

        k(g gVar) {
            C7159o.m21302e(gVar.f7612e != null, "success rate ejection config is null");
            this.f7652a = gVar;
        }

        /* renamed from: c */
        static double m9646c(Collection<Double> collection) {
            Iterator<Double> it = collection.iterator();
            double d10 = 0.0d;
            while (it.hasNext()) {
                d10 += it.next().doubleValue();
            }
            return d10 / collection.size();
        }

        /* renamed from: d */
        static double m9647d(Collection<Double> collection, double d10) {
            Iterator<Double> it = collection.iterator();
            double d11 = 0.0d;
            while (it.hasNext()) {
                double doubleValue = it.next().doubleValue() - d10;
                d11 += doubleValue * doubleValue;
            }
            return Math.sqrt(d11 / collection.size());
        }

        @Override // bj.C1802e.j
        /* renamed from: b */
        public void mo9613b(c cVar, long j10) {
            List<b> m9585m = C1802e.m9585m(cVar, this.f7652a.f7612e.f7633d.intValue());
            if (m9585m.size() < this.f7652a.f7612e.f7632c.intValue() || m9585m.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = m9585m.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((b) it.next()).m9600n()));
            }
            double m9646c = m9646c(arrayList);
            double m9647d = m9646c - (m9647d(arrayList, m9646c) * (this.f7652a.f7612e.f7630a.intValue() / 1000.0f));
            for (b bVar : m9585m) {
                if (cVar.m9607g() >= this.f7652a.f7611d.intValue()) {
                    return;
                }
                if (bVar.m9600n() < m9647d && new Random().nextInt(100) < this.f7652a.f7612e.f7631b.intValue()) {
                    bVar.m9590d(j10);
                }
            }
        }
    }

    public C1802e(AbstractC11939p0.d dVar, InterfaceC8868k2 interfaceC8868k2) {
        d dVar2 = new d((AbstractC11939p0.d) C7159o.m21313p(dVar, "helper"));
        this.f7588e = dVar2;
        this.f7589f = new C1801d(dVar2);
        this.f7586c = new c();
        this.f7587d = (ExecutorC11927k1) C7159o.m21313p(dVar.mo9555d(), "syncContext");
        this.f7591h = (ScheduledExecutorService) C7159o.m21313p(dVar.mo9554c(), "timeService");
        this.f7590g = interfaceC8868k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m9584l(List<C11954x> list) {
        Iterator<C11954x> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().m38335a().size();
            if (i10 > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static List<b> m9585m(c cVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.m9592f() >= i10) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: a */
    public boolean mo9586a(AbstractC11939p0.g gVar) {
        g gVar2 = (g) gVar.m38230c();
        ArrayList arrayList = new ArrayList();
        Iterator<C11954x> it = gVar.m38228a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().m38335a());
        }
        this.f7586c.keySet().retainAll(arrayList);
        this.f7586c.m9612m(gVar2);
        this.f7586c.m9609j(gVar2, arrayList);
        this.f7589f.m9575q(gVar2.f7614g.m25420b());
        if (gVar2.m9614a()) {
            Long valueOf = this.f7593j == null ? gVar2.f7608a : Long.valueOf(Math.max(0L, gVar2.f7608a.longValue() - (this.f7590g.mo25639a() - this.f7593j.longValue())));
            ExecutorC11927k1.d dVar = this.f7592i;
            if (dVar != null) {
                dVar.m38197a();
                this.f7586c.m9610k();
            }
            this.f7592i = this.f7587d.m38195d(new e(gVar2), valueOf.longValue(), gVar2.f7608a.longValue(), TimeUnit.NANOSECONDS, this.f7591h);
        } else {
            ExecutorC11927k1.d dVar2 = this.f7592i;
            if (dVar2 != null) {
                dVar2.m38197a();
                this.f7593j = null;
                this.f7586c.m9606f();
            }
        }
        this.f7589f.mo9550d(gVar.m38231e().m38235d(gVar2.f7614g.m25419a()).m38232a());
        return true;
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: c */
    public void mo9549c(C11915g1 c11915g1) {
        this.f7589f.mo9549c(c11915g1);
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: e */
    public void mo9574e() {
        this.f7589f.mo9574e();
    }
}
