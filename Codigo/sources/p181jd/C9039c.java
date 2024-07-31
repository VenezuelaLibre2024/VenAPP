package p181jd;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jd.c */
/* loaded from: classes.dex */
public final class C9039c {

    /* renamed from: a */
    private final String f21662a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f21663b;

    /* renamed from: jd.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f21664a;

        /* renamed from: b */
        private Map<Class<?>, Object> f21665b = null;

        b(String str) {
            this.f21664a = str;
        }

        /* renamed from: a */
        public C9039c m26551a() {
            return new C9039c(this.f21664a, this.f21665b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f21665b)));
        }

        /* renamed from: b */
        public <T extends Annotation> b m26552b(T t10) {
            if (this.f21665b == null) {
                this.f21665b = new HashMap();
            }
            this.f21665b.put(t10.annotationType(), t10);
            return this;
        }
    }

    private C9039c(String str, Map<Class<?>, Object> map) {
        this.f21662a = str;
        this.f21663b = map;
    }

    /* renamed from: a */
    public static b m26547a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C9039c m26548d(String str) {
        return new C9039c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m26549b() {
        return this.f21662a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m26550c(Class<T> cls) {
        return (T) this.f21663b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9039c)) {
            return false;
        }
        C9039c c9039c = (C9039c) obj;
        return this.f21662a.equals(c9039c.f21662a) && this.f21663b.equals(c9039c.f21663b);
    }

    public int hashCode() {
        return (this.f21662a.hashCode() * 31) + this.f21663b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f21662a + ", properties=" + this.f21663b.values() + "}";
    }
}
