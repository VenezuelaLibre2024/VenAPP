package p366tb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tb.a */
/* loaded from: classes2.dex */
public final class C11234a {

    /* renamed from: b */
    public static final C11234a f29147b = m35110a().m35112a();

    /* renamed from: a */
    private final Map<String, String> f29148a;

    /* renamed from: tb.a$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private HashMap<String, String> f29149a = new HashMap<>();

        /* renamed from: a */
        public C11234a m35112a() {
            if (this.f29149a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C11234a c11234a = new C11234a(Collections.unmodifiableMap(this.f29149a));
            this.f29149a = null;
            return c11234a;
        }
    }

    private C11234a(Map<String, String> map) {
        this.f29148a = map;
    }

    /* renamed from: a */
    public static b m35110a() {
        return new b();
    }

    /* renamed from: b */
    public Map<String, String> m35111b() {
        return this.f29148a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11234a) {
            return this.f29148a.equals(((C11234a) obj).f29148a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29148a.hashCode();
    }

    public String toString() {
        return this.f29148a.toString();
    }
}
