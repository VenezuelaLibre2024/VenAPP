package vi;

import eb.i;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f29262a;

        a(f fVar) {
            this.f29262a = fVar;
        }

        @Override // vi.y0.e, vi.y0.f
        public void b(g1 g1Var) {
            this.f29262a.b(g1Var);
        }

        @Override // vi.y0.e
        public void c(g gVar) {
            this.f29262a.a(gVar.a(), gVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f29264a;

        /* renamed from: b, reason: collision with root package name */
        private final d1 f29265b;

        /* renamed from: c, reason: collision with root package name */
        private final k1 f29266c;

        /* renamed from: d, reason: collision with root package name */
        private final h f29267d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f29268e;

        /* renamed from: f, reason: collision with root package name */
        private final vi.f f29269f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f29270g;

        /* renamed from: h, reason: collision with root package name */
        private final String f29271h;

        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Integer f29272a;

            /* renamed from: b, reason: collision with root package name */
            private d1 f29273b;

            /* renamed from: c, reason: collision with root package name */
            private k1 f29274c;

            /* renamed from: d, reason: collision with root package name */
            private h f29275d;

            /* renamed from: e, reason: collision with root package name */
            private ScheduledExecutorService f29276e;

            /* renamed from: f, reason: collision with root package name */
            private vi.f f29277f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f29278g;

            /* renamed from: h, reason: collision with root package name */
            private String f29279h;

            a() {
            }

            public b a() {
                return new b(this.f29272a, this.f29273b, this.f29274c, this.f29275d, this.f29276e, this.f29277f, this.f29278g, this.f29279h, null);
            }

            public a b(vi.f fVar) {
                this.f29277f = (vi.f) eb.o.o(fVar);
                return this;
            }

            public a c(int i10) {
                this.f29272a = Integer.valueOf(i10);
                return this;
            }

            public a d(Executor executor) {
                this.f29278g = executor;
                return this;
            }

            public a e(String str) {
                this.f29279h = str;
                return this;
            }

            public a f(d1 d1Var) {
                this.f29273b = (d1) eb.o.o(d1Var);
                return this;
            }

            public a g(ScheduledExecutorService scheduledExecutorService) {
                this.f29276e = (ScheduledExecutorService) eb.o.o(scheduledExecutorService);
                return this;
            }

            public a h(h hVar) {
                this.f29275d = (h) eb.o.o(hVar);
                return this;
            }

            public a i(k1 k1Var) {
                this.f29274c = (k1) eb.o.o(k1Var);
                return this;
            }
        }

        private b(Integer num, d1 d1Var, k1 k1Var, h hVar, ScheduledExecutorService scheduledExecutorService, vi.f fVar, Executor executor, String str) {
            this.f29264a = ((Integer) eb.o.p(num, "defaultPort not set")).intValue();
            this.f29265b = (d1) eb.o.p(d1Var, "proxyDetector not set");
            this.f29266c = (k1) eb.o.p(k1Var, "syncContext not set");
            this.f29267d = (h) eb.o.p(hVar, "serviceConfigParser not set");
            this.f29268e = scheduledExecutorService;
            this.f29269f = fVar;
            this.f29270g = executor;
            this.f29271h = str;
        }

        /* synthetic */ b(Integer num, d1 d1Var, k1 k1Var, h hVar, ScheduledExecutorService scheduledExecutorService, vi.f fVar, Executor executor, String str, a aVar) {
            this(num, d1Var, k1Var, hVar, scheduledExecutorService, fVar, executor, str);
        }

        public static a f() {
            return new a();
        }

        public int a() {
            return this.f29264a;
        }

        public Executor b() {
            return this.f29270g;
        }

        public d1 c() {
            return this.f29265b;
        }

        public h d() {
            return this.f29267d;
        }

        public k1 e() {
            return this.f29266c;
        }

        public String toString() {
            return eb.i.c(this).b("defaultPort", this.f29264a).d("proxyDetector", this.f29265b).d("syncContext", this.f29266c).d("serviceConfigParser", this.f29267d).d("scheduledExecutorService", this.f29268e).d("channelLogger", this.f29269f).d("executor", this.f29270g).d("overrideAuthority", this.f29271h).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final g1 f29280a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f29281b;

        private c(Object obj) {
            this.f29281b = eb.o.p(obj, "config");
            this.f29280a = null;
        }

        private c(g1 g1Var) {
            this.f29281b = null;
            this.f29280a = (g1) eb.o.p(g1Var, "status");
            eb.o.k(!g1Var.p(), "cannot use OK status: %s", g1Var);
        }

        public static c a(Object obj) {
            return new c(obj);
        }

        public static c b(g1 g1Var) {
            return new c(g1Var);
        }

        public Object c() {
            return this.f29281b;
        }

        public g1 d() {
            return this.f29280a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return eb.k.a(this.f29280a, cVar.f29280a) && eb.k.a(this.f29281b, cVar.f29281b);
        }

        public int hashCode() {
            return eb.k.b(this.f29280a, this.f29281b);
        }

        public String toString() {
            i.b c10;
            String str;
            Object obj;
            if (this.f29281b != null) {
                c10 = eb.i.c(this);
                str = "config";
                obj = this.f29281b;
            } else {
                c10 = eb.i.c(this);
                str = "error";
                obj = this.f29280a;
            }
            return c10.d(str, obj).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class d {
        public abstract String a();

        public abstract y0 b(URI uri, b bVar);
    }

    /* loaded from: classes3.dex */
    public static abstract class e implements f {
        @Override // vi.y0.f
        @Deprecated
        public final void a(List<x> list, vi.a aVar) {
            c(g.d().b(list).c(aVar).a());
        }

        @Override // vi.y0.f
        public abstract void b(g1 g1Var);

        public abstract void c(g gVar);
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(List<x> list, vi.a aVar);

        void b(g1 g1Var);
    }

    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final List<x> f29282a;

        /* renamed from: b, reason: collision with root package name */
        private final vi.a f29283b;

        /* renamed from: c, reason: collision with root package name */
        private final c f29284c;

        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List<x> f29285a = Collections.emptyList();

            /* renamed from: b, reason: collision with root package name */
            private vi.a f29286b = vi.a.f29024c;

            /* renamed from: c, reason: collision with root package name */
            private c f29287c;

            a() {
            }

            public g a() {
                return new g(this.f29285a, this.f29286b, this.f29287c);
            }

            public a b(List<x> list) {
                this.f29285a = list;
                return this;
            }

            public a c(vi.a aVar) {
                this.f29286b = aVar;
                return this;
            }

            public a d(c cVar) {
                this.f29287c = cVar;
                return this;
            }
        }

        g(List<x> list, vi.a aVar, c cVar) {
            this.f29282a = Collections.unmodifiableList(new ArrayList(list));
            this.f29283b = (vi.a) eb.o.p(aVar, "attributes");
            this.f29284c = cVar;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f29282a;
        }

        public vi.a b() {
            return this.f29283b;
        }

        public c c() {
            return this.f29284c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return eb.k.a(this.f29282a, gVar.f29282a) && eb.k.a(this.f29283b, gVar.f29283b) && eb.k.a(this.f29284c, gVar.f29284c);
        }

        public int hashCode() {
            return eb.k.b(this.f29282a, this.f29283b, this.f29284c);
        }

        public String toString() {
            return eb.i.c(this).d("addresses", this.f29282a).d("attributes", this.f29283b).d("serviceConfig", this.f29284c).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class h {
        public abstract c a(Map<String, ?> map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(e eVar) {
        e(eVar);
    }

    public void e(f fVar) {
        if (fVar instanceof e) {
            d((e) fVar);
        } else {
            d(new a(fVar));
        }
    }
}
