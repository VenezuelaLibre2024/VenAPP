package a1;

import dk.k0;
import java.util.Map;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f45a;

        public a(String name) {
            n.e(name, "name");
            this.f45a = name;
        }

        public final String a() {
            return this.f45a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return n.a(this.f45a, ((a) obj).f45a);
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

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final a<T> f46a;

        /* renamed from: b, reason: collision with root package name */
        private final T f47b;

        public final a<T> a() {
            return this.f46a;
        }

        public final T b() {
            return this.f47b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public final a1.a c() {
        Map u10;
        u10 = k0.u(a());
        return new a1.a(u10, false);
    }

    public final d d() {
        Map u10;
        u10 = k0.u(a());
        return new a1.a(u10, true);
    }
}
