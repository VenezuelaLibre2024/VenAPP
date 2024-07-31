package p294pc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pc.c */
/* loaded from: classes.dex */
public final class C10132c<T> {

    /* renamed from: a */
    private final String f24893a;

    /* renamed from: b */
    private final Set<C10137e0<? super T>> f24894b;

    /* renamed from: c */
    private final Set<C10150q> f24895c;

    /* renamed from: d */
    private final int f24896d;

    /* renamed from: e */
    private final int f24897e;

    /* renamed from: f */
    private final InterfaceC10140g<T> f24898f;

    /* renamed from: g */
    private final Set<Class<?>> f24899g;

    /* renamed from: pc.c$b */
    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a */
        private String f24900a;

        /* renamed from: b */
        private final Set<C10137e0<? super T>> f24901b;

        /* renamed from: c */
        private final Set<C10150q> f24902c;

        /* renamed from: d */
        private int f24903d;

        /* renamed from: e */
        private int f24904e;

        /* renamed from: f */
        private InterfaceC10140g<T> f24905f;

        /* renamed from: g */
        private final Set<Class<?>> f24906g;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f24900a = null;
            HashSet hashSet = new HashSet();
            this.f24901b = hashSet;
            this.f24902c = new HashSet();
            this.f24903d = 0;
            this.f24904e = 0;
            this.f24906g = new HashSet();
            C10135d0.m30304c(cls, "Null interface");
            hashSet.add(C10137e0.m30307b(cls));
            for (Class<? super T> cls2 : clsArr) {
                C10135d0.m30304c(cls2, "Null interface");
                this.f24901b.add(C10137e0.m30307b(cls2));
            }
        }

        @SafeVarargs
        private b(C10137e0<T> c10137e0, C10137e0<? super T>... c10137e0Arr) {
            this.f24900a = null;
            HashSet hashSet = new HashSet();
            this.f24901b = hashSet;
            this.f24902c = new HashSet();
            this.f24903d = 0;
            this.f24904e = 0;
            this.f24906g = new HashSet();
            C10135d0.m30304c(c10137e0, "Null interface");
            hashSet.add(c10137e0);
            for (C10137e0<? super T> c10137e02 : c10137e0Arr) {
                C10135d0.m30304c(c10137e02, "Null interface");
            }
            Collections.addAll(this.f24901b, c10137e0Arr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public b<T> m30276g() {
            this.f24904e = 1;
            return this;
        }

        /* renamed from: i */
        private b<T> m30277i(int i10) {
            C10135d0.m30305d(this.f24903d == 0, "Instantiation type has already been set.");
            this.f24903d = i10;
            return this;
        }

        /* renamed from: j */
        private void m30278j(C10137e0<?> c10137e0) {
            C10135d0.m30302a(!this.f24901b.contains(c10137e0), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public b<T> m30279b(C10150q c10150q) {
            C10135d0.m30304c(c10150q, "Null dependency");
            m30278j(c10150q.m30358c());
            this.f24902c.add(c10150q);
            return this;
        }

        /* renamed from: c */
        public b<T> m30280c() {
            return m30277i(1);
        }

        /* renamed from: d */
        public C10132c<T> m30281d() {
            C10135d0.m30305d(this.f24905f != null, "Missing required property: factory.");
            return new C10132c<>(this.f24900a, new HashSet(this.f24901b), new HashSet(this.f24902c), this.f24903d, this.f24904e, this.f24905f, this.f24906g);
        }

        /* renamed from: e */
        public b<T> m30282e() {
            return m30277i(2);
        }

        /* renamed from: f */
        public b<T> m30283f(InterfaceC10140g<T> interfaceC10140g) {
            this.f24905f = (InterfaceC10140g) C10135d0.m30304c(interfaceC10140g, "Null factory");
            return this;
        }

        /* renamed from: h */
        public b<T> m30284h(String str) {
            this.f24900a = str;
            return this;
        }
    }

    private C10132c(String str, Set<C10137e0<? super T>> set, Set<C10150q> set2, int i10, int i11, InterfaceC10140g<T> interfaceC10140g, Set<Class<?>> set3) {
        this.f24893a = str;
        this.f24894b = Collections.unmodifiableSet(set);
        this.f24895c = Collections.unmodifiableSet(set2);
        this.f24896d = i10;
        this.f24897e = i11;
        this.f24898f = interfaceC10140g;
        this.f24899g = Collections.unmodifiableSet(set3);
    }

    /* renamed from: c */
    public static <T> b<T> m30257c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> b<T> m30258d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* renamed from: e */
    public static <T> b<T> m30259e(C10137e0<T> c10137e0) {
        return new b<>(c10137e0, new C10137e0[0]);
    }

    @SafeVarargs
    /* renamed from: f */
    public static <T> b<T> m30260f(C10137e0<T> c10137e0, C10137e0<? super T>... c10137e0Arr) {
        return new b<>(c10137e0, c10137e0Arr);
    }

    /* renamed from: l */
    public static <T> C10132c<T> m30261l(final T t10, Class<T> cls) {
        return m30262m(cls).m30283f(new InterfaceC10140g() { // from class: pc.b
            @Override // p294pc.InterfaceC10140g
            /* renamed from: a */
            public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
                Object m30263q;
                m30263q = C10132c.m30263q(t10, interfaceC10134d);
                return m30263q;
            }
        }).m30281d();
    }

    /* renamed from: m */
    public static <T> b<T> m30262m(Class<T> cls) {
        return m30257c(cls).m30276g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Object m30263q(Object obj, InterfaceC10134d interfaceC10134d) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ Object m30264r(Object obj, InterfaceC10134d interfaceC10134d) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: s */
    public static <T> C10132c<T> m30265s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return m30258d(cls, clsArr).m30283f(new InterfaceC10140g() { // from class: pc.a
            @Override // p294pc.InterfaceC10140g
            /* renamed from: a */
            public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
                Object m30264r;
                m30264r = C10132c.m30264r(t10, interfaceC10134d);
                return m30264r;
            }
        }).m30281d();
    }

    /* renamed from: g */
    public Set<C10150q> m30266g() {
        return this.f24895c;
    }

    /* renamed from: h */
    public InterfaceC10140g<T> m30267h() {
        return this.f24898f;
    }

    /* renamed from: i */
    public String m30268i() {
        return this.f24893a;
    }

    /* renamed from: j */
    public Set<C10137e0<? super T>> m30269j() {
        return this.f24894b;
    }

    /* renamed from: k */
    public Set<Class<?>> m30270k() {
        return this.f24899g;
    }

    /* renamed from: n */
    public boolean m30271n() {
        return this.f24896d == 1;
    }

    /* renamed from: o */
    public boolean m30272o() {
        return this.f24896d == 2;
    }

    /* renamed from: p */
    public boolean m30273p() {
        return this.f24897e == 0;
    }

    /* renamed from: t */
    public C10132c<T> m30274t(InterfaceC10140g<T> interfaceC10140g) {
        return new C10132c<>(this.f24893a, this.f24894b, this.f24895c, this.f24896d, this.f24897e, interfaceC10140g, this.f24899g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f24894b.toArray()) + ">{" + this.f24896d + ", type=" + this.f24897e + ", deps=" + Arrays.toString(this.f24895c.toArray()) + "}";
    }
}
