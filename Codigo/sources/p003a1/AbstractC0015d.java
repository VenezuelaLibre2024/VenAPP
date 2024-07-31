package p003a1;

import dk.C7018k0;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: a1.d */
/* loaded from: classes.dex */
public abstract class AbstractC0015d {

    /* renamed from: a1.d$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        private final String f45a;

        public a(String name) {
            C9322n.m27781e(name, "name");
            this.f45a = name;
        }

        /* renamed from: a */
        public final String m53a() {
            return this.f45a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return C9322n.m27777a(this.f45a, ((a) obj).f45a);
            }
            return false;
        }

        public int hashCode() {
            return this.f45a.hashCode();
        }

        public String toString() {
            return this.f45a;
        }
    }

    /* renamed from: a1.d$b */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        private final a<T> f46a;

        /* renamed from: b */
        private final T f47b;

        /* renamed from: a */
        public final a<T> m54a() {
            return this.f46a;
        }

        /* renamed from: b */
        public final T m55b() {
            return this.f47b;
        }
    }

    /* renamed from: a */
    public abstract Map<a<?>, Object> mo38a();

    /* renamed from: b */
    public abstract <T> T mo39b(a<T> aVar);

    /* renamed from: c */
    public final C0012a m51c() {
        Map m20434u;
        m20434u = C7018k0.m20434u(mo38a());
        return new C0012a(m20434u, false);
    }

    /* renamed from: d */
    public final AbstractC0015d m52d() {
        Map m20434u;
        m20434u = C7018k0.m20434u(mo38a());
        return new C0012a(m20434u, true);
    }
}
