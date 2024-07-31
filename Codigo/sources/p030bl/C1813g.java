package p030bl;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: bl.g */
/* loaded from: classes3.dex */
public final class C1813g<T> {

    /* renamed from: b */
    public static final b f7712b = new b(null);

    /* renamed from: c */
    private static final c f7713c = new c();

    /* renamed from: a */
    private final Object f7714a;

    /* renamed from: bl.g$a */
    /* loaded from: classes3.dex */
    public static final class a extends c {

        /* renamed from: a */
        public final Throwable f7715a;

        public a(Throwable th2) {
            this.f7715a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C9322n.m27777a(this.f7715a, ((a) obj).f7715a);
        }

        public int hashCode() {
            Throwable th2 = this.f7715a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // p030bl.C1813g.c
        public String toString() {
            return "Closed(" + this.f7715a + ')';
        }
    }

    /* renamed from: bl.g$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final <E> Object m9802a(Throwable th2) {
            return C1813g.m9793c(new a(th2));
        }

        /* renamed from: b */
        public final <E> Object m9803b() {
            return C1813g.m9793c(C1813g.f7713c);
        }

        /* renamed from: c */
        public final <E> Object m9804c(E e10) {
            return C1813g.m9793c(e10);
        }
    }

    /* renamed from: bl.g$c */
    /* loaded from: classes3.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C1813g(Object obj) {
        this.f7714a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C1813g m9792b(Object obj) {
        return new C1813g(obj);
    }

    /* renamed from: c */
    public static <T> Object m9793c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m9794d(Object obj, Object obj2) {
        return (obj2 instanceof C1813g) && C9322n.m27777a(obj, ((C1813g) obj2).m9801k());
    }

    /* renamed from: e */
    public static final Throwable m9795e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f7715a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final T m9796f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m9797g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m9798h(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: i */
    public static final boolean m9799i(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: j */
    public static String m9800j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m9794d(this.f7714a, obj);
    }

    public int hashCode() {
        return m9797g(this.f7714a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m9801k() {
        return this.f7714a;
    }

    public String toString() {
        return m9800j(this.f7714a);
    }
}
