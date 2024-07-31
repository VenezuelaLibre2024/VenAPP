package vi;

import p082eb.C7159o;
import vi.AbstractC11939p0;
import vi.C11895a;

/* renamed from: vi.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11908e0 {

    /* renamed from: a */
    public static final C11895a.c<AbstractC11908e0> f31525a = C11895a.c.m38054a("internal:io.grpc.config-selector");

    /* renamed from: vi.e0$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final C11915g1 f31526a;

        /* renamed from: b */
        private final Object f31527b;

        /* renamed from: c */
        public InterfaceC11916h f31528c;

        /* renamed from: vi.e0$b$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private Object f31529a;

            /* renamed from: b */
            private InterfaceC11916h f31530b;

            private a() {
            }

            /* renamed from: a */
            public b m38121a() {
                C7159o.m21319v(this.f31529a != null, "config is not set");
                return new b(C11915g1.f31534f, this.f31529a, this.f31530b);
            }

            /* renamed from: b */
            public a m38122b(Object obj) {
                this.f31529a = C7159o.m21313p(obj, "config");
                return this;
            }
        }

        private b(C11915g1 c11915g1, Object obj, InterfaceC11916h interfaceC11916h) {
            this.f31526a = (C11915g1) C7159o.m21313p(c11915g1, "status");
            this.f31527b = obj;
            this.f31528c = interfaceC11916h;
        }

        /* renamed from: d */
        public static a m38117d() {
            return new a();
        }

        /* renamed from: a */
        public Object m38118a() {
            return this.f31527b;
        }

        /* renamed from: b */
        public InterfaceC11916h m38119b() {
            return this.f31528c;
        }

        /* renamed from: c */
        public C11915g1 m38120c() {
            return this.f31526a;
        }
    }

    /* renamed from: a */
    public abstract b mo25520a(AbstractC11939p0.f fVar);
}
