package p224lj;

import im.InterfaceC8016c;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p145hj.C7746d;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9074b;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9078f;
import p186jj.InterfaceC9079g;
import p471yj.C12727a;

/* renamed from: lj.a */
/* loaded from: classes3.dex */
public final class C9512a {

    /* renamed from: a */
    static final InterfaceC9077e<Object, Object> f23113a = new i();

    /* renamed from: b */
    public static final Runnable f23114b = new e();

    /* renamed from: c */
    public static final InterfaceC9073a f23115c = new b();

    /* renamed from: d */
    static final InterfaceC9076d<Object> f23116d = new c();

    /* renamed from: e */
    public static final InterfaceC9076d<Throwable> f23117e = new g();

    /* renamed from: f */
    public static final InterfaceC9076d<Throwable> f23118f = new o();

    /* renamed from: g */
    public static final InterfaceC9078f f23119g = new d();

    /* renamed from: h */
    static final InterfaceC9079g<Object> f23120h = new p();

    /* renamed from: i */
    static final InterfaceC9079g<Object> f23121i = new h();

    /* renamed from: j */
    static final Callable<Object> f23122j = new n();

    /* renamed from: k */
    static final Comparator<Object> f23123k = new m();

    /* renamed from: l */
    public static final InterfaceC9076d<InterfaceC8016c> f23124l = new l();

    /* renamed from: lj.a$a */
    /* loaded from: classes3.dex */
    static final class a<T1, T2, R> implements InterfaceC9077e<Object[], R> {

        /* renamed from: a */
        final InterfaceC9074b<? super T1, ? super T2, ? extends R> f23125a;

        a(InterfaceC9074b<? super T1, ? super T2, ? extends R> interfaceC9074b) {
            this.f23125a = interfaceC9074b;
        }

        @Override // p186jj.InterfaceC9077e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f23125a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: lj.a$b */
    /* loaded from: classes3.dex */
    static final class b implements InterfaceC9073a {
        b() {
        }

        @Override // p186jj.InterfaceC9073a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: lj.a$c */
    /* loaded from: classes3.dex */
    static final class c implements InterfaceC9076d<Object> {
        c() {
        }

        @Override // p186jj.InterfaceC9076d
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: lj.a$d */
    /* loaded from: classes3.dex */
    static final class d implements InterfaceC9078f {
        d() {
        }
    }

    /* renamed from: lj.a$e */
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

    /* renamed from: lj.a$f */
    /* loaded from: classes3.dex */
    static final class f<T> implements InterfaceC9079g<T> {

        /* renamed from: a */
        final T f23126a;

        f(T t10) {
            this.f23126a = t10;
        }

        @Override // p186jj.InterfaceC9079g
        public boolean test(T t10) {
            return C9513b.m28323c(t10, this.f23126a);
        }
    }

    /* renamed from: lj.a$g */
    /* loaded from: classes3.dex */
    static final class g implements InterfaceC9076d<Throwable> {
        g() {
        }

        @Override // p186jj.InterfaceC9076d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            C12727a.m41995q(th2);
        }
    }

    /* renamed from: lj.a$h */
    /* loaded from: classes3.dex */
    static final class h implements InterfaceC9079g<Object> {
        h() {
        }

        @Override // p186jj.InterfaceC9079g
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: lj.a$i */
    /* loaded from: classes3.dex */
    static final class i implements InterfaceC9077e<Object, Object> {
        i() {
        }

        @Override // p186jj.InterfaceC9077e
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: lj.a$j */
    /* loaded from: classes3.dex */
    static final class j<T, U> implements Callable<U>, InterfaceC9077e<T, U> {

        /* renamed from: a */
        final U f23127a;

        j(U u10) {
            this.f23127a = u10;
        }

        @Override // p186jj.InterfaceC9077e
        public U apply(T t10) {
            return this.f23127a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f23127a;
        }
    }

    /* renamed from: lj.a$k */
    /* loaded from: classes3.dex */
    static final class k<T> implements InterfaceC9077e<List<T>, List<T>> {

        /* renamed from: a */
        final Comparator<? super T> f23128a;

        k(Comparator<? super T> comparator) {
            this.f23128a = comparator;
        }

        @Override // p186jj.InterfaceC9077e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f23128a);
            return list;
        }
    }

    /* renamed from: lj.a$l */
    /* loaded from: classes3.dex */
    static final class l implements InterfaceC9076d<InterfaceC8016c> {
        l() {
        }

        @Override // p186jj.InterfaceC9076d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(InterfaceC8016c interfaceC8016c) {
            interfaceC8016c.mo24634i(Long.MAX_VALUE);
        }
    }

    /* renamed from: lj.a$m */
    /* loaded from: classes3.dex */
    static final class m implements Comparator<Object> {
        m() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: lj.a$n */
    /* loaded from: classes3.dex */
    static final class n implements Callable<Object> {
        n() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: lj.a$o */
    /* loaded from: classes3.dex */
    static final class o implements InterfaceC9076d<Throwable> {
        o() {
        }

        @Override // p186jj.InterfaceC9076d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            C12727a.m41995q(new C7746d(th2));
        }
    }

    /* renamed from: lj.a$p */
    /* loaded from: classes3.dex */
    static final class p implements InterfaceC9079g<Object> {
        p() {
        }

        @Override // p186jj.InterfaceC9079g
        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC9079g<T> m28309a() {
        return (InterfaceC9079g<T>) f23120h;
    }

    /* renamed from: b */
    public static <T> InterfaceC9076d<T> m28310b() {
        return (InterfaceC9076d<T>) f23116d;
    }

    /* renamed from: c */
    public static <T> InterfaceC9079g<T> m28311c(T t10) {
        return new f(t10);
    }

    /* renamed from: d */
    public static <T> InterfaceC9077e<T, T> m28312d() {
        return (InterfaceC9077e<T, T>) f23113a;
    }

    /* renamed from: e */
    public static <T, U> InterfaceC9077e<T, U> m28313e(U u10) {
        return new j(u10);
    }

    /* renamed from: f */
    public static <T> InterfaceC9077e<List<T>, List<T>> m28314f(Comparator<? super T> comparator) {
        return new k(comparator);
    }

    /* renamed from: g */
    public static <T1, T2, R> InterfaceC9077e<Object[], R> m28315g(InterfaceC9074b<? super T1, ? super T2, ? extends R> interfaceC9074b) {
        C9513b.m28324d(interfaceC9074b, "f is null");
        return new a(interfaceC9074b);
    }
}
