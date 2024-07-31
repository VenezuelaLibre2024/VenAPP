package ck;

import java.io.Serializable;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ck.n */
/* loaded from: classes3.dex */
public final class C2029n<T> implements Serializable {

    /* renamed from: b */
    public static final a f8078b = new a(null);

    /* renamed from: a */
    private final Object f8079a;

    /* renamed from: ck.n$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: ck.n$b */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {

        /* renamed from: a */
        public final Throwable f8080a;

        public b(Throwable exception) {
            C9322n.m27781e(exception, "exception");
            this.f8080a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && C9322n.m27777a(this.f8080a, ((b) obj).f8080a);
        }

        public int hashCode() {
            return this.f8080a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f8080a + ')';
        }
    }

    private /* synthetic */ C2029n(Object obj) {
        this.f8079a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2029n m10339a(Object obj) {
        return new C2029n(obj);
    }

    /* renamed from: b */
    public static <T> Object m10340b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m10341c(Object obj, Object obj2) {
        return (obj2 instanceof C2029n) && C9322n.m27777a(obj, ((C2029n) obj2).m10347i());
    }

    /* renamed from: d */
    public static final Throwable m10342d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f8080a;
        }
        return null;
    }

    /* renamed from: e */
    public static int m10343e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: f */
    public static final boolean m10344f(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: g */
    public static final boolean m10345g(Object obj) {
        return !(obj instanceof b);
    }

    /* renamed from: h */
    public static String m10346h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m10341c(this.f8079a, obj);
    }

    public int hashCode() {
        return m10343e(this.f8079a);
    }

    /* renamed from: i */
    public final /* synthetic */ Object m10347i() {
        return this.f8079a;
    }

    public String toString() {
        return m10346h(this.f8079a);
    }
}
