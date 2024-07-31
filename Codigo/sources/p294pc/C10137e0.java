package p294pc;

import java.lang.annotation.Annotation;

/* renamed from: pc.e0 */
/* loaded from: classes.dex */
public final class C10137e0<T> {

    /* renamed from: a */
    private final Class<? extends Annotation> f24912a;

    /* renamed from: b */
    private final Class<T> f24913b;

    /* renamed from: pc.e0$a */
    /* loaded from: classes.dex */
    private @interface a {
    }

    public C10137e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f24912a = cls;
        this.f24913b = cls2;
    }

    /* renamed from: a */
    public static <T> C10137e0<T> m30306a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C10137e0<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> C10137e0<T> m30307b(Class<T> cls) {
        return new C10137e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10137e0.class != obj.getClass()) {
            return false;
        }
        C10137e0 c10137e0 = (C10137e0) obj;
        if (this.f24913b.equals(c10137e0.f24913b)) {
            return this.f24912a.equals(c10137e0.f24912a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f24913b.hashCode() * 31) + this.f24912a.hashCode();
    }

    public String toString() {
        if (this.f24912a == a.class) {
            return this.f24913b.getName();
        }
        return "@" + this.f24912a.getName() + " " + this.f24913b.getName();
    }
}
