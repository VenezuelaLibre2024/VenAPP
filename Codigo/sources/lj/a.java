package lj;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    static final jj.e<Object, Object> f21260a = new i();

    /* renamed from: b */
    public static final Runnable f21261b = new e();

    /* renamed from: c */
    public static final jj.a f21262c = new b();

    /* renamed from: d */
    static final jj.d<Object> f21263d = new c();

    /* renamed from: e */
    public static final jj.d<Throwable> f21264e = new g();

    /* renamed from: f */
    public static final jj.d<Throwable> f21265f = new o();

    /* renamed from: g */
    public static final jj.f f21266g = new d();

    /* renamed from: h */
    static final jj.g<Object> f21267h = new p();

    /* renamed from: i */
    static final jj.g<Object> f21268i = new h();

    /* renamed from: j */
    static final Callable<Object> f21269j = new n();

    /* renamed from: k */
    static final Comparator<Object> f21270k = new m();

    /* renamed from: l */
    public static final jj.d<im.c> f21271l = new l();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lj.a$a */
    /* loaded from: classes3.dex */
    public static final class C0335a<T1, T2, R> implements jj.e<Object[], R> {

        /* renamed from: a */
        final jj.b<? super T1, ? super T2, ? extends R> f21272a;

        C0335a(jj.b<? super T1, ? super T2, ? extends R> bVar) {
            this.f21272a = bVar;
        }

        @Override // jj.e
        /* renamed from: a */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f21272a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements jj.a {
        b() {
        }

        @Override // jj.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* loaded from: classes3.dex */
    static final class c implements jj.d<Object> {
        c() {
        }

        @Override // jj.d
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* loaded from: classes3.dex */
    static final class d implements jj.f {
        d() {
        }
    }

    /* loaded from: classes3.dex */
    static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f<T> implements jj.g<T> {

        /* renamed from: a */
        final T f21273a;

        f(T t10) {
            this.f21273a = t10;
        }

        @Override // jj.g
        public boolean test(T t10) {
            return lj.b.c(t10, this.f21273a);
        }
    }

    /* loaded from: classes3.dex */
    static final class g implements jj.d<Throwable> {
        g() {
        }

        @Override // jj.d
        /* renamed from: a */
        public void accept(Throwable th2) {
            yj.a.q(th2);
        }
    }

    /* loaded from: classes3.dex */
    static final class h implements jj.g<Object> {
        h() {
        }

        @Override // jj.g
        public boolean test(Object obj) {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class i implements jj.e<Object, Object> {
        i() {
        }

        @Override // jj.e
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class j<T, U> implements Callable<U>, jj.e<T, U> {

        /* renamed from: a */
        final U f21274a;

        j(U u10) {
            this.f21274a = u10;
        }

        @Override // jj.e
        public U apply(T t10) {
            return this.f21274a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f21274a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class k<T> implements jj.e<List<T>, List<T>> {

        /* renamed from: a */
        final Comparator<? super T> f21275a;

        k(Comparator<? super T> comparator) {
            this.f21275a = comparator;
        }

        @Override // jj.e
        /* renamed from: a */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f21275a);
            return list;
        }
    }

    /* loaded from: classes3.dex */
    static final class l implements jj.d<im.c> {
        l() {
        }

        @Override // jj.d
        /* renamed from: a */
        public void accept(im.c cVar) {
            cVar.i(Long.MAX_VALUE);
        }
    }

    /* loaded from: classes3.dex */
    static final class m implements Comparator<Object> {
        m() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* loaded from: classes3.dex */
    static final class n implements Callable<Object> {
        n() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class o implements jj.d<Throwable> {
        o() {
        }

        @Override // jj.d
        /* renamed from: a */
        public void accept(Throwable th2) {
            yj.a.q(new hj.d(th2));
        }
    }

    /* loaded from: classes3.dex */
    static final class p implements jj.g<Object> {
        p() {
        }

        @Override // jj.g
        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T> jj.g<T> a() {
        return (jj.g<T>) f21267h;
    }

    public static <T> jj.d<T> b() {
        return (jj.d<T>) f21263d;
    }

    public static <T> jj.g<T> c(T t10) {
        return new f(t10);
    }

    public static <T> jj.e<T, T> d() {
        return (jj.e<T, T>) f21260a;
    }

    public static <T, U> jj.e<T, U> e(U u10) {
        return new j(u10);
    }

    public static <T> jj.e<List<T>, List<T>> f(Comparator<? super T> comparator) {
        return new k(comparator);
    }

    public static <T1, T2, R> jj.e<Object[], R> g(jj.b<? super T1, ? super T2, ? extends R> bVar) {
        lj.b.d(bVar, "f is null");
        return new C0335a(bVar);
    }
}
