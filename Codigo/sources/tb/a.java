package tb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f26851b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f26852a;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f26853a = new HashMap<>();

        public a a() {
            if (this.f26853a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            a aVar = new a(Collections.unmodifiableMap(this.f26853a));
            this.f26853a = null;
            return aVar;
        }
    }

    private a(Map<String, String> map) {
        this.f26852a = map;
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f26852a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f26852a.equals(((a) obj).f26852a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26852a.hashCode();
    }

    public String toString() {
        return this.f26852a.toString();
    }
}
