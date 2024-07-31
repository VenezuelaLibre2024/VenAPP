package vi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;
import vi.AbstractC11925k;
import vi.C11895a;

/* renamed from: vi.p0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11939p0 {

    /* renamed from: b */
    public static final C11895a.c<Map<String, ?>> f31609b = C11895a.c.m38054a("internal:health-checking-config");

    /* renamed from: a */
    private int f31610a;

    /* renamed from: vi.p0$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final List<C11954x> f31611a;

        /* renamed from: b */
        private final C11895a f31612b;

        /* renamed from: c */
        private final Object[][] f31613c;

        /* renamed from: vi.p0$b$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private List<C11954x> f31614a;

            /* renamed from: b */
            private C11895a f31615b = C11895a.f31458c;

            /* renamed from: c */
            private Object[][] f31616c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public <T> a m38213c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f31616c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            /* renamed from: b */
            public b m38214b() {
                return new b(this.f31614a, this.f31615b, this.f31616c);
            }

            /* renamed from: d */
            public a m38215d(List<C11954x> list) {
                C7159o.m21302e(!list.isEmpty(), "addrs is empty");
                this.f31614a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* renamed from: e */
            public a m38216e(C11954x c11954x) {
                this.f31614a = Collections.singletonList(c11954x);
                return this;
            }

            /* renamed from: f */
            public a m38217f(C11895a c11895a) {
                this.f31615b = (C11895a) C7159o.m21313p(c11895a, "attrs");
                return this;
            }
        }

        private b(List<C11954x> list, C11895a c11895a, Object[][] objArr) {
            this.f31611a = (List) C7159o.m21313p(list, "addresses are not set");
            this.f31612b = (C11895a) C7159o.m21313p(c11895a, "attrs");
            this.f31613c = (Object[][]) C7159o.m21313p(objArr, "customOptions");
        }

        /* renamed from: c */
        public static a m38208c() {
            return new a();
        }

        /* renamed from: a */
        public List<C11954x> m38209a() {
            return this.f31611a;
        }

        /* renamed from: b */
        public C11895a m38210b() {
            return this.f31612b;
        }

        /* renamed from: d */
        public a m38211d() {
            return m38208c().m38215d(this.f31611a).m38217f(this.f31612b).m38213c(this.f31613c);
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("addrs", this.f31611a).m21284d("attrs", this.f31612b).m21284d("customOptions", Arrays.deepToString(this.f31613c)).toString();
        }
    }

    /* renamed from: vi.p0$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract AbstractC11939p0 mo9648a(d dVar);
    }

    /* renamed from: vi.p0$d */
    /* loaded from: classes3.dex */
    public static abstract class d {
        /* renamed from: a */
        public h mo9552a(b bVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public AbstractC11910f mo9553b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public ScheduledExecutorService mo9554c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public ExecutorC11927k1 mo9555d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public void mo9556e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public abstract void mo9577f(EnumC11938p enumC11938p, i iVar);
    }

    /* renamed from: vi.p0$e */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: e */
        private static final e f31617e = new e(null, null, C11915g1.f31534f, false);

        /* renamed from: a */
        private final h f31618a;

        /* renamed from: b */
        private final AbstractC11925k.a f31619b;

        /* renamed from: c */
        private final C11915g1 f31620c;

        /* renamed from: d */
        private final boolean f31621d;

        private e(h hVar, AbstractC11925k.a aVar, C11915g1 c11915g1, boolean z10) {
            this.f31618a = hVar;
            this.f31619b = aVar;
            this.f31620c = (C11915g1) C7159o.m21313p(c11915g1, "status");
            this.f31621d = z10;
        }

        /* renamed from: e */
        public static e m38218e(C11915g1 c11915g1) {
            C7159o.m21302e(!c11915g1.m38145p(), "drop status shouldn't be OK");
            return new e(null, null, c11915g1, true);
        }

        /* renamed from: f */
        public static e m38219f(C11915g1 c11915g1) {
            C7159o.m21302e(!c11915g1.m38145p(), "error status shouldn't be OK");
            return new e(null, null, c11915g1, false);
        }

        /* renamed from: g */
        public static e m38220g() {
            return f31617e;
        }

        /* renamed from: h */
        public static e m38221h(h hVar) {
            return m38222i(hVar, null);
        }

        /* renamed from: i */
        public static e m38222i(h hVar, AbstractC11925k.a aVar) {
            return new e((h) C7159o.m21313p(hVar, "subchannel"), aVar, C11915g1.f31534f, false);
        }

        /* renamed from: a */
        public C11915g1 m38223a() {
            return this.f31620c;
        }

        /* renamed from: b */
        public AbstractC11925k.a m38224b() {
            return this.f31619b;
        }

        /* renamed from: c */
        public h m38225c() {
            return this.f31618a;
        }

        /* renamed from: d */
        public boolean m38226d() {
            return this.f31621d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C7155k.m21289a(this.f31618a, eVar.f31618a) && C7155k.m21289a(this.f31620c, eVar.f31620c) && C7155k.m21289a(this.f31619b, eVar.f31619b) && this.f31621d == eVar.f31621d;
        }

        public int hashCode() {
            return C7155k.m21290b(this.f31618a, this.f31620c, this.f31619b, Boolean.valueOf(this.f31621d));
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("subchannel", this.f31618a).m21284d("streamTracerFactory", this.f31619b).m21284d("status", this.f31620c).m21285e("drop", this.f31621d).toString();
        }
    }

    /* renamed from: vi.p0$f */
    /* loaded from: classes3.dex */
    public static abstract class f {
        /* renamed from: a */
        public abstract C11901c mo25817a();

        /* renamed from: b */
        public abstract C11953w0 mo25818b();

        /* renamed from: c */
        public abstract C11955x0<?, ?> mo25819c();
    }

    /* renamed from: vi.p0$g */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a */
        private final List<C11954x> f31622a;

        /* renamed from: b */
        private final C11895a f31623b;

        /* renamed from: c */
        private final Object f31624c;

        /* renamed from: vi.p0$g$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private List<C11954x> f31625a;

            /* renamed from: b */
            private C11895a f31626b = C11895a.f31458c;

            /* renamed from: c */
            private Object f31627c;

            a() {
            }

            /* renamed from: a */
            public g m38232a() {
                return new g(this.f31625a, this.f31626b, this.f31627c);
            }

            /* renamed from: b */
            public a m38233b(List<C11954x> list) {
                this.f31625a = list;
                return this;
            }

            /* renamed from: c */
            public a m38234c(C11895a c11895a) {
                this.f31626b = c11895a;
                return this;
            }

            /* renamed from: d */
            public a m38235d(Object obj) {
                this.f31627c = obj;
                return this;
            }
        }

        private g(List<C11954x> list, C11895a c11895a, Object obj) {
            this.f31622a = Collections.unmodifiableList(new ArrayList((Collection) C7159o.m21313p(list, "addresses")));
            this.f31623b = (C11895a) C7159o.m21313p(c11895a, "attributes");
            this.f31624c = obj;
        }

        /* renamed from: d */
        public static a m38227d() {
            return new a();
        }

        /* renamed from: a */
        public List<C11954x> m38228a() {
            return this.f31622a;
        }

        /* renamed from: b */
        public C11895a m38229b() {
            return this.f31623b;
        }

        /* renamed from: c */
        public Object m38230c() {
            return this.f31624c;
        }

        /* renamed from: e */
        public a m38231e() {
            return m38227d().m38233b(this.f31622a).m38234c(this.f31623b).m38235d(this.f31624c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C7155k.m21289a(this.f31622a, gVar.f31622a) && C7155k.m21289a(this.f31623b, gVar.f31623b) && C7155k.m21289a(this.f31624c, gVar.f31624c);
        }

        public int hashCode() {
            return C7155k.m21290b(this.f31622a, this.f31623b, this.f31624c);
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("addresses", this.f31622a).m21284d("attributes", this.f31623b).m21284d("loadBalancingPolicyConfig", this.f31624c).toString();
        }
    }

    /* renamed from: vi.p0$h */
    /* loaded from: classes3.dex */
    public static abstract class h {
        /* renamed from: a */
        public final C11954x m38236a() {
            List<C11954x> mo9558b = mo9558b();
            C7159o.m21322y(mo9558b.size() == 1, "%s does not have exactly one group", mo9558b);
            return mo9558b.get(0);
        }

        /* renamed from: b */
        public List<C11954x> mo9558b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract C11895a mo9637c();

        /* renamed from: d */
        public Object mo9559d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo9560e();

        /* renamed from: f */
        public abstract void mo9561f();

        /* renamed from: g */
        public void mo9562g(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: h */
        public void mo9638h(List<C11954x> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: vi.p0$i */
    /* loaded from: classes3.dex */
    public static abstract class i {
        /* renamed from: a */
        public abstract e mo9576a(f fVar);
    }

    /* renamed from: vi.p0$j */
    /* loaded from: classes3.dex */
    public interface j {
        /* renamed from: a */
        void mo9644a(C11940q c11940q);
    }

    /* renamed from: a */
    public boolean mo9586a(g gVar) {
        if (!gVar.m38228a().isEmpty() || mo9548b()) {
            int i10 = this.f31610a;
            this.f31610a = i10 + 1;
            if (i10 == 0) {
                mo9550d(gVar);
            }
            this.f31610a = 0;
            return true;
        }
        mo9549c(C11915g1.f31549u.m38147r("NameResolver returned no usable address. addrs=" + gVar.m38228a() + ", attrs=" + gVar.m38229b()));
        return false;
    }

    /* renamed from: b */
    public boolean mo9548b() {
        return false;
    }

    /* renamed from: c */
    public abstract void mo9549c(C11915g1 c11915g1);

    /* renamed from: d */
    public void mo9550d(g gVar) {
        int i10 = this.f31610a;
        this.f31610a = i10 + 1;
        if (i10 == 0) {
            mo9586a(gVar);
        }
        this.f31610a = 0;
    }

    /* renamed from: e */
    public abstract void mo9574e();
}
