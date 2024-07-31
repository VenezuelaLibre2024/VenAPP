package pc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a */
    private final String f22960a;

    /* renamed from: b */
    private final Set<e0<? super T>> f22961b;

    /* renamed from: c */
    private final Set<q> f22962c;

    /* renamed from: d */
    private final int f22963d;

    /* renamed from: e */
    private final int f22964e;

    /* renamed from: f */
    private final g<T> f22965f;

    /* renamed from: g */
    private final Set<Class<?>> f22966g;

    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a */
        private String f22967a;

        /* renamed from: b */
        private final Set<e0<? super T>> f22968b;

        /* renamed from: c */
        private final Set<q> f22969c;

        /* renamed from: d */
        private int f22970d;

        /* renamed from: e */
        private int f22971e;

        /* renamed from: f */
        private g<T> f22972f;

        /* renamed from: g */
        private final Set<Class<?>> f22973g;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f22967a = null;
            HashSet hashSet = new HashSet();
            this.f22968b = hashSet;
            this.f22969c = new HashSet();
            this.f22970d = 0;
            this.f22971e = 0;
            this.f22973g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.f22968b.add(e0.b(cls2));
            }
        }

        /* synthetic */ b(Class cls, Class[] clsArr, a aVar) {
            this(cls, clsArr);
        }

        @SafeVarargs
        private b(e0<T> e0Var, e0<? super T>... e0VarArr) {
            this.f22967a = null;
            HashSet hashSet = new HashSet();
            this.f22968b = hashSet;
            this.f22969c = new HashSet();
            this.f22970d = 0;
            this.f22971e = 0;
            this.f22973g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0<? super T> e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.f22968b, e0VarArr);
        }

        /* synthetic */ b(e0 e0Var, e0[] e0VarArr, a aVar) {
            this(e0Var, e0VarArr);
        }

        public b<T> g() {
            this.f22971e = 1;
            return this;
        }

        private b<T> i(int i10) {
            d0.d(this.f22970d == 0, "Instantiation type has already been set.");
            this.f22970d = i10;
            return this;
        }

        private void j(e0<?> e0Var) {
            d0.a(!this.f22968b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            d0.c(qVar, "Null dependency");
            j(qVar.c());
            this.f22969c.add(qVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            d0.d(this.f22972f != null, "Missing required property: factory.");
            return new c<>(this.f22967a, new HashSet(this.f22968b), new HashSet(this.f22969c), this.f22970d, this.f22971e, this.f22972f, this.f22973g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f22972f = (g) d0.c(gVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f22967a = str;
            return this;
        }
    }

    private c(String str, Set<e0<? super T>> set, Set<q> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f22960a = str;
        this.f22961b = Collections.unmodifiableSet(set);
        this.f22962c = Collections.unmodifiableSet(set2);
        this.f22963d = i10;
        this.f22964e = i11;
        this.f22965f = gVar;
        this.f22966g = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3, a aVar) {
        this(str, set, set2, i10, i11, gVar, set3);
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(e0<T> e0Var) {
        return new b<>(e0Var, new e0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(e0<T> e0Var, e0<? super T>... e0VarArr) {
        return new b<>(e0Var, e0VarArr);
    }

    public static <T> c<T> l(T t10, Class<T> cls) {
        return m(cls).f(new g() { // from class: pc.b

            /* renamed from: a */
            public final /* synthetic */ Object f22957a;

            public /* synthetic */ b(Object t102) {
                r1 = t102;
            }

            @Override // pc.g
            public final Object a(d dVar) {
                Object q10;
                q10 = c.q(r1, dVar);
                return q10;
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).g();
    }

    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new g() { // from class: pc.a

            /* renamed from: a */
            public final /* synthetic */ Object f22956a;

            public /* synthetic */ a(Object t102) {
                r1 = t102;
            }

            @Override // pc.g
            public final Object a(d dVar) {
                Object r10;
                r10 = c.r(r1, dVar);
                return r10;
            }
        }).d();
    }

    public Set<q> g() {
        return this.f22962c;
    }

    public g<T> h() {
        return this.f22965f;
    }

    public String i() {
        return this.f22960a;
    }

    public Set<e0<? super T>> j() {
        return this.f22961b;
    }

    public Set<Class<?>> k() {
        return this.f22966g;
    }

    public boolean n() {
        return this.f22963d == 1;
    }

    public boolean o() {
        return this.f22963d == 2;
    }

    public boolean p() {
        return this.f22964e == 0;
    }

    public c<T> t(g<T> gVar) {
        return new c<>(this.f22960a, this.f22961b, this.f22962c, this.f22963d, this.f22964e, gVar, this.f22966g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f22961b.toArray()) + ">{" + this.f22963d + ", type=" + this.f22964e + ", deps=" + Arrays.toString(this.f22962c.toArray()) + "}";
    }
}
