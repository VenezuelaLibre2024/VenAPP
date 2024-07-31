package jd;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19883a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f19884b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f19885a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f19886b = null;

        b(String str) {
            this.f19885a = str;
        }

        public c a() {
            return new c(this.f19885a, this.f19886b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f19886b)));
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f19886b == null) {
                this.f19886b = new HashMap();
            }
            this.f19886b.put(t10.annotationType(), t10);
            return this;
        }
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f19883a = str;
        this.f19884b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f19883a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f19884b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19883a.equals(cVar.f19883a) && this.f19884b.equals(cVar.f19884b);
    }

    public int hashCode() {
        return (this.f19883a.hashCode() * 31) + this.f19884b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f19883a + ", properties=" + this.f19884b.values() + "}";
    }
}
