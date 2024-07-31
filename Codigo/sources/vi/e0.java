package vi;

import vi.a;
import vi.p0;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c<e0> f29091a = a.c.a("internal:io.grpc.config-selector");

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final g1 f29092a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f29093b;

        /* renamed from: c, reason: collision with root package name */
        public h f29094c;

        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Object f29095a;

            /* renamed from: b, reason: collision with root package name */
            private h f29096b;

            private a() {
            }

            public b a() {
                eb.o.v(this.f29095a != null, "config is not set");
                return new b(g1.f29100f, this.f29095a, this.f29096b);
            }

            public a b(Object obj) {
                this.f29095a = eb.o.p(obj, "config");
                return this;
            }
        }

        private b(g1 g1Var, Object obj, h hVar) {
            this.f29092a = (g1) eb.o.p(g1Var, "status");
            this.f29093b = obj;
            this.f29094c = hVar;
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f29093b;
        }

        public h b() {
            return this.f29094c;
        }

        public g1 c() {
            return this.f29092a;
        }
    }

    public abstract b a(p0.f fVar);
}
