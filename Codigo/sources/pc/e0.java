package pc;

import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class e0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f22979a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f22980b;

    /* loaded from: classes.dex */
    private @interface a {
    }

    public e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f22979a = cls;
        this.f22980b = cls2;
    }

    public static <T> e0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new e0<>(cls, cls2);
    }

    public static <T> e0<T> b(Class<T> cls) {
        return new e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f22980b.equals(e0Var.f22980b)) {
            return this.f22979a.equals(e0Var.f22979a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22980b.hashCode() * 31) + this.f22979a.hashCode();
    }

    public String toString() {
        if (this.f22979a == a.class) {
            return this.f22980b.getName();
        }
        return "@" + this.f22979a.getName() + " " + this.f22980b.getName();
    }
}
