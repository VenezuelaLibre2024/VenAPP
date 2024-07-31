package ck;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class n<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7126b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f7127a;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f7128a;

        public b(Throwable exception) {
            kotlin.jvm.internal.n.e(exception, "exception");
            this.f7128a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f7128a, ((b) obj).f7128a);
        }

        public int hashCode() {
            return this.f7128a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f7128a + ')';
        }
    }

    private /* synthetic */ n(Object obj) {
        this.f7127a = obj;
    }

    public static final /* synthetic */ n a(Object obj) {
        return new n(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof n) && kotlin.jvm.internal.n.a(obj, ((n) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f7128a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f7127a, obj);
    }

    public int hashCode() {
        return e(this.f7127a);
    }

    public final /* synthetic */ Object i() {
        return this.f7127a;
    }

    public String toString() {
        return h(this.f7127a);
    }
}
