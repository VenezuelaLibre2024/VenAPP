package vi;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;

/* renamed from: vi.y0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11957y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vi.y0$a */
    /* loaded from: classes3.dex */
    public class a extends e {

        /* renamed from: a */
        final /* synthetic */ f f31697a;

        a(f fVar) {
            this.f31697a = fVar;
        }

        @Override // vi.AbstractC11957y0.e, vi.AbstractC11957y0.f
        /* renamed from: b */
        public void mo25549b(C11915g1 c11915g1) {
            this.f31697a.mo25549b(c11915g1);
        }

        @Override // vi.AbstractC11957y0.e
        /* renamed from: c */
        public void mo25550c(g gVar) {
            this.f31697a.mo38375a(gVar.m38377a(), gVar.m38378b());
        }
    }

    /* renamed from: vi.y0$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final int f31699a;

        /* renamed from: b */
        private final InterfaceC11906d1 f31700b;

        /* renamed from: c */
        private final ExecutorC11927k1 f31701c;

        /* renamed from: d */
        private final h f31702d;

        /* renamed from: e */
        private final ScheduledExecutorService f31703e;

        /* renamed from: f */
        private final AbstractC11910f f31704f;

        /* renamed from: g */
        private final Executor f31705g;

        /* renamed from: h */
        private final String f31706h;

        /* renamed from: vi.y0$b$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private Integer f31707a;

            /* renamed from: b */
            private InterfaceC11906d1 f31708b;

            /* renamed from: c */
            private ExecutorC11927k1 f31709c;

            /* renamed from: d */
            private h f31710d;

            /* renamed from: e */
            private ScheduledExecutorService f31711e;

            /* renamed from: f */
            private AbstractC11910f f31712f;

            /* renamed from: g */
            private Executor f31713g;

            /* renamed from: h */
            private String f31714h;

            a() {
            }

            /* renamed from: a */
            public b m38362a() {
                return new b(this.f31707a, this.f31708b, this.f31709c, this.f31710d, this.f31711e, this.f31712f, this.f31713g, this.f31714h, null);
            }

            /* renamed from: b */
            public a m38363b(AbstractC11910f abstractC11910f) {
                this.f31712f = (AbstractC11910f) C7159o.m21312o(abstractC11910f);
                return this;
            }

            /* renamed from: c */
            public a m38364c(int i10) {
                this.f31707a = Integer.valueOf(i10);
                return this;
            }

            /* renamed from: d */
            public a m38365d(Executor executor) {
                this.f31713g = executor;
                return this;
            }

            /* renamed from: e */
            public a m38366e(String str) {
                this.f31714h = str;
                return this;
            }

            /* renamed from: f */
            public a m38367f(InterfaceC11906d1 interfaceC11906d1) {
                this.f31708b = (InterfaceC11906d1) C7159o.m21312o(interfaceC11906d1);
                return this;
            }

            /* renamed from: g */
            public a m38368g(ScheduledExecutorService scheduledExecutorService) {
                this.f31711e = (ScheduledExecutorService) C7159o.m21312o(scheduledExecutorService);
                return this;
            }

            /* renamed from: h */
            public a m38369h(h hVar) {
                this.f31710d = (h) C7159o.m21312o(hVar);
                return this;
            }

            /* renamed from: i */
            public a m38370i(ExecutorC11927k1 executorC11927k1) {
                this.f31709c = (ExecutorC11927k1) C7159o.m21312o(executorC11927k1);
                return this;
            }
        }

        private b(Integer num, InterfaceC11906d1 interfaceC11906d1, ExecutorC11927k1 executorC11927k1, h hVar, ScheduledExecutorService scheduledExecutorService, AbstractC11910f abstractC11910f, Executor executor, String str) {
            this.f31699a = ((Integer) C7159o.m21313p(num, "defaultPort not set")).intValue();
            this.f31700b = (InterfaceC11906d1) C7159o.m21313p(interfaceC11906d1, "proxyDetector not set");
            this.f31701c = (ExecutorC11927k1) C7159o.m21313p(executorC11927k1, "syncContext not set");
            this.f31702d = (h) C7159o.m21313p(hVar, "serviceConfigParser not set");
            this.f31703e = scheduledExecutorService;
            this.f31704f = abstractC11910f;
            this.f31705g = executor;
            this.f31706h = str;
        }

        /* synthetic */ b(Integer num, InterfaceC11906d1 interfaceC11906d1, ExecutorC11927k1 executorC11927k1, h hVar, ScheduledExecutorService scheduledExecutorService, AbstractC11910f abstractC11910f, Executor executor, String str, a aVar) {
            this(num, interfaceC11906d1, executorC11927k1, hVar, scheduledExecutorService, abstractC11910f, executor, str);
        }

        /* renamed from: f */
        public static a m38356f() {
            return new a();
        }

        /* renamed from: a */
        public int m38357a() {
            return this.f31699a;
        }

        /* renamed from: b */
        public Executor m38358b() {
            return this.f31705g;
        }

        /* renamed from: c */
        public InterfaceC11906d1 m38359c() {
            return this.f31700b;
        }

        /* renamed from: d */
        public h m38360d() {
            return this.f31702d;
        }

        /* renamed from: e */
        public ExecutorC11927k1 m38361e() {
            return this.f31701c;
        }

        public String toString() {
            return C7153i.m21274c(this).m21282b("defaultPort", this.f31699a).m21284d("proxyDetector", this.f31700b).m21284d("syncContext", this.f31701c).m21284d("serviceConfigParser", this.f31702d).m21284d("scheduledExecutorService", this.f31703e).m21284d("channelLogger", this.f31704f).m21284d("executor", this.f31705g).m21284d("overrideAuthority", this.f31706h).toString();
        }
    }

    /* renamed from: vi.y0$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final C11915g1 f31715a;

        /* renamed from: b */
        private final Object f31716b;

        private c(Object obj) {
            this.f31716b = C7159o.m21313p(obj, "config");
            this.f31715a = null;
        }

        private c(C11915g1 c11915g1) {
            this.f31716b = null;
            this.f31715a = (C11915g1) C7159o.m21313p(c11915g1, "status");
            C7159o.m21308k(!c11915g1.m38145p(), "cannot use OK status: %s", c11915g1);
        }

        /* renamed from: a */
        public static c m38371a(Object obj) {
            return new c(obj);
        }

        /* renamed from: b */
        public static c m38372b(C11915g1 c11915g1) {
            return new c(c11915g1);
        }

        /* renamed from: c */
        public Object m38373c() {
            return this.f31716b;
        }

        /* renamed from: d */
        public C11915g1 m38374d() {
            return this.f31715a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return C7155k.m21289a(this.f31715a, cVar.f31715a) && C7155k.m21289a(this.f31716b, cVar.f31716b);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f31715a, this.f31716b);
        }

        public String toString() {
            C7153i.b m21274c;
            String str;
            Object obj;
            if (this.f31716b != null) {
                m21274c = C7153i.m21274c(this);
                str = "config";
                obj = this.f31716b;
            } else {
                m21274c = C7153i.m21274c(this);
                str = "error";
                obj = this.f31715a;
            }
            return m21274c.m21284d(str, obj).toString();
        }
    }

    /* renamed from: vi.y0$d */
    /* loaded from: classes3.dex */
    public static abstract class d {
        /* renamed from: a */
        public abstract String mo25385a();

        /* renamed from: b */
        public abstract AbstractC11957y0 mo25386b(URI uri, b bVar);
    }

    /* renamed from: vi.y0$e */
    /* loaded from: classes3.dex */
    public static abstract class e implements f {
        @Override // vi.AbstractC11957y0.f
        @Deprecated
        /* renamed from: a */
        public final void mo38375a(List<C11954x> list, C11895a c11895a) {
            mo25550c(g.m38376d().m38381b(list).m38382c(c11895a).m38380a());
        }

        @Override // vi.AbstractC11957y0.f
        /* renamed from: b */
        public abstract void mo25549b(C11915g1 c11915g1);

        /* renamed from: c */
        public abstract void mo25550c(g gVar);
    }

    /* renamed from: vi.y0$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: a */
        void mo38375a(List<C11954x> list, C11895a c11895a);

        /* renamed from: b */
        void mo25549b(C11915g1 c11915g1);
    }

    /* renamed from: vi.y0$g */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a */
        private final List<C11954x> f31717a;

        /* renamed from: b */
        private final C11895a f31718b;

        /* renamed from: c */
        private final c f31719c;

        /* renamed from: vi.y0$g$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private List<C11954x> f31720a = Collections.emptyList();

            /* renamed from: b */
            private C11895a f31721b = C11895a.f31458c;

            /* renamed from: c */
            private c f31722c;

            a() {
            }

            /* renamed from: a */
            public g m38380a() {
                return new g(this.f31720a, this.f31721b, this.f31722c);
            }

            /* renamed from: b */
            public a m38381b(List<C11954x> list) {
                this.f31720a = list;
                return this;
            }

            /* renamed from: c */
            public a m38382c(C11895a c11895a) {
                this.f31721b = c11895a;
                return this;
            }

            /* renamed from: d */
            public a m38383d(c cVar) {
                this.f31722c = cVar;
                return this;
            }
        }

        g(List<C11954x> list, C11895a c11895a, c cVar) {
            this.f31717a = Collections.unmodifiableList(new ArrayList(list));
            this.f31718b = (C11895a) C7159o.m21313p(c11895a, "attributes");
            this.f31719c = cVar;
        }

        /* renamed from: d */
        public static a m38376d() {
            return new a();
        }

        /* renamed from: a */
        public List<C11954x> m38377a() {
            return this.f31717a;
        }

        /* renamed from: b */
        public C11895a m38378b() {
            return this.f31718b;
        }

        /* renamed from: c */
        public c m38379c() {
            return this.f31719c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C7155k.m21289a(this.f31717a, gVar.f31717a) && C7155k.m21289a(this.f31718b, gVar.f31718b) && C7155k.m21289a(this.f31719c, gVar.f31719c);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f31717a, this.f31718b, this.f31719c);
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("addresses", this.f31717a).m21284d("attributes", this.f31718b).m21284d("serviceConfig", this.f31719c).toString();
        }
    }

    /* renamed from: vi.y0$h */
    /* loaded from: classes3.dex */
    public static abstract class h {
        /* renamed from: a */
        public abstract c mo25273a(Map<String, ?> map);
    }

    /* renamed from: a */
    public abstract String mo25342a();

    /* renamed from: b */
    public void mo25343b() {
    }

    /* renamed from: c */
    public abstract void mo25344c();

    /* renamed from: d */
    public void mo25345d(e eVar) {
        mo25671e(eVar);
    }

    /* renamed from: e */
    public void mo25671e(f fVar) {
        if (fVar instanceof e) {
            mo25345d((e) fVar);
        } else {
            mo25345d(new a(fVar));
        }
    }
}
