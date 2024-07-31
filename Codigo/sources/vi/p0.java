package vi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import vi.a;
import vi.k;

/* loaded from: classes3.dex */
public abstract class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a.c<Map<String, ?>> f29174b = a.c.a("internal:health-checking-config");

    /* renamed from: a, reason: collision with root package name */
    private int f29175a;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<x> f29176a;

        /* renamed from: b, reason: collision with root package name */
        private final vi.a f29177b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[][] f29178c;

        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List<x> f29179a;

            /* renamed from: b, reason: collision with root package name */
            private vi.a f29180b = vi.a.f29024c;

            /* renamed from: c, reason: collision with root package name */
            private Object[][] f29181c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public <T> a c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f29181c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public b b() {
                return new b(this.f29179a, this.f29180b, this.f29181c);
            }

            public a d(List<x> list) {
                eb.o.e(!list.isEmpty(), "addrs is empty");
                this.f29179a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a e(x xVar) {
                this.f29179a = Collections.singletonList(xVar);
                return this;
            }

            public a f(vi.a aVar) {
                this.f29180b = (vi.a) eb.o.p(aVar, "attrs");
                return this;
            }
        }

        private b(List<x> list, vi.a aVar, Object[][] objArr) {
            this.f29176a = (List) eb.o.p(list, "addresses are not set");
            this.f29177b = (vi.a) eb.o.p(aVar, "attrs");
            this.f29178c = (Object[][]) eb.o.p(objArr, "customOptions");
        }

        public static a c() {
            return new a();
        }

        public List<x> a() {
            return this.f29176a;
        }

        public vi.a b() {
            return this.f29177b;
        }

        public a d() {
            return c().d(this.f29176a).f(this.f29177b).c(this.f29178c);
        }

        public String toString() {
            return eb.i.c(this).d("addrs", this.f29176a).d("attrs", this.f29177b).d("customOptions", Arrays.deepToString(this.f29178c)).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        public abstract p0 a(d dVar);
    }

    /* loaded from: classes3.dex */
    public static abstract class d {
        public h a(b bVar) {
            throw new UnsupportedOperationException();
        }

        public vi.f b() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService c() {
            throw new UnsupportedOperationException();
        }

        public k1 d() {
            throw new UnsupportedOperationException();
        }

        public void e() {
            throw new UnsupportedOperationException();
        }

        public abstract void f(p pVar, i iVar);
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        private static final e f29182e = new e(null, null, g1.f29100f, false);

        /* renamed from: a, reason: collision with root package name */
        private final h f29183a;

        /* renamed from: b, reason: collision with root package name */
        private final k.a f29184b;

        /* renamed from: c, reason: collision with root package name */
        private final g1 f29185c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f29186d;

        private e(h hVar, k.a aVar, g1 g1Var, boolean z10) {
            this.f29183a = hVar;
            this.f29184b = aVar;
            this.f29185c = (g1) eb.o.p(g1Var, "status");
            this.f29186d = z10;
        }

        public static e e(g1 g1Var) {
            eb.o.e(!g1Var.p(), "drop status shouldn't be OK");
            return new e(null, null, g1Var, true);
        }

        public static e f(g1 g1Var) {
            eb.o.e(!g1Var.p(), "error status shouldn't be OK");
            return new e(null, null, g1Var, false);
        }

        public static e g() {
            return f29182e;
        }

        public static e h(h hVar) {
            return i(hVar, null);
        }

        public static e i(h hVar, k.a aVar) {
            return new e((h) eb.o.p(hVar, "subchannel"), aVar, g1.f29100f, false);
        }

        public g1 a() {
            return this.f29185c;
        }

        public k.a b() {
            return this.f29184b;
        }

        public h c() {
            return this.f29183a;
        }

        public boolean d() {
            return this.f29186d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eb.k.a(this.f29183a, eVar.f29183a) && eb.k.a(this.f29185c, eVar.f29185c) && eb.k.a(this.f29184b, eVar.f29184b) && this.f29186d == eVar.f29186d;
        }

        public int hashCode() {
            return eb.k.b(this.f29183a, this.f29185c, this.f29184b, Boolean.valueOf(this.f29186d));
        }

        public String toString() {
            return eb.i.c(this).d("subchannel", this.f29183a).d("streamTracerFactory", this.f29184b).d("status", this.f29185c).e("drop", this.f29186d).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {
        public abstract vi.c a();

        public abstract w0 b();

        public abstract x0<?, ?> c();
    }

    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final List<x> f29187a;

        /* renamed from: b, reason: collision with root package name */
        private final vi.a f29188b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f29189c;

        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List<x> f29190a;

            /* renamed from: b, reason: collision with root package name */
            private vi.a f29191b = vi.a.f29024c;

            /* renamed from: c, reason: collision with root package name */
            private Object f29192c;

            a() {
            }

            public g a() {
                return new g(this.f29190a, this.f29191b, this.f29192c);
            }

            public a b(List<x> list) {
                this.f29190a = list;
                return this;
            }

            public a c(vi.a aVar) {
                this.f29191b = aVar;
                return this;
            }

            public a d(Object obj) {
                this.f29192c = obj;
                return this;
            }
        }

        private g(List<x> list, vi.a aVar, Object obj) {
            this.f29187a = Collections.unmodifiableList(new ArrayList((Collection) eb.o.p(list, "addresses")));
            this.f29188b = (vi.a) eb.o.p(aVar, "attributes");
            this.f29189c = obj;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f29187a;
        }

        public vi.a b() {
            return this.f29188b;
        }

        public Object c() {
            return this.f29189c;
        }

        public a e() {
            return d().b(this.f29187a).c(this.f29188b).d(this.f29189c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return eb.k.a(this.f29187a, gVar.f29187a) && eb.k.a(this.f29188b, gVar.f29188b) && eb.k.a(this.f29189c, gVar.f29189c);
        }

        public int hashCode() {
            return eb.k.b(this.f29187a, this.f29188b, this.f29189c);
        }

        public String toString() {
            return eb.i.c(this).d("addresses", this.f29187a).d("attributes", this.f29188b).d("loadBalancingPolicyConfig", this.f29189c).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class h {
        public final x a() {
            List<x> b10 = b();
            eb.o.y(b10.size() == 1, "%s does not have exactly one group", b10);
            return b10.get(0);
        }

        public List<x> b() {
            throw new UnsupportedOperationException();
        }

        public abstract vi.a c();

        public Object d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e();

        public abstract void f();

        public void g(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void h(List<x> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class i {
        public abstract e a(f fVar);
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a(q qVar);
    }

    public boolean a(g gVar) {
        if (!gVar.a().isEmpty() || b()) {
            int i10 = this.f29175a;
            this.f29175a = i10 + 1;
            if (i10 == 0) {
                d(gVar);
            }
            this.f29175a = 0;
            return true;
        }
        c(g1.f29115u.r("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(g1 g1Var);

    public void d(g gVar) {
        int i10 = this.f29175a;
        this.f29175a = i10 + 1;
        if (i10 == 0) {
            a(gVar);
        }
        this.f29175a = 0;
    }

    public abstract void e();
}
