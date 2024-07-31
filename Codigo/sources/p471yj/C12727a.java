package p471yj;

import dj.AbstractC6977b;
import dj.AbstractC6981f;
import dj.AbstractC6985j;
import dj.AbstractC6990o;
import dj.AbstractC6993r;
import dj.AbstractC6994s;
import dj.InterfaceC6978c;
import dj.InterfaceC6987l;
import dj.InterfaceC6992q;
import dj.InterfaceC6995t;
import im.InterfaceC8015b;
import java.util.concurrent.Callable;
import p145hj.C7743a;
import p145hj.C7745c;
import p145hj.C7746d;
import p145hj.C7748f;
import p165ij.AbstractC8003a;
import p186jj.InterfaceC9074b;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p449xj.C12504g;

/* renamed from: yj.a */
/* loaded from: classes3.dex */
public final class C12727a {

    /* renamed from: a */
    static volatile InterfaceC9076d<? super Throwable> f34528a;

    /* renamed from: b */
    static volatile InterfaceC9077e<? super Runnable, ? extends Runnable> f34529b;

    /* renamed from: c */
    static volatile InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> f34530c;

    /* renamed from: d */
    static volatile InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> f34531d;

    /* renamed from: e */
    static volatile InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> f34532e;

    /* renamed from: f */
    static volatile InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> f34533f;

    /* renamed from: g */
    static volatile InterfaceC9077e<? super AbstractC6993r, ? extends AbstractC6993r> f34534g;

    /* renamed from: h */
    static volatile InterfaceC9077e<? super AbstractC6993r, ? extends AbstractC6993r> f34535h;

    /* renamed from: i */
    static volatile InterfaceC9077e<? super AbstractC6981f, ? extends AbstractC6981f> f34536i;

    /* renamed from: j */
    static volatile InterfaceC9077e<? super AbstractC8003a, ? extends AbstractC8003a> f34537j;

    /* renamed from: k */
    static volatile InterfaceC9077e<? super AbstractC6990o, ? extends AbstractC6990o> f34538k;

    /* renamed from: l */
    static volatile InterfaceC9077e<? super AbstractC6985j, ? extends AbstractC6985j> f34539l;

    /* renamed from: m */
    static volatile InterfaceC9077e<? super AbstractC6994s, ? extends AbstractC6994s> f34540m;

    /* renamed from: n */
    static volatile InterfaceC9077e<? super AbstractC6977b, ? extends AbstractC6977b> f34541n;

    /* renamed from: o */
    static volatile InterfaceC9074b<? super AbstractC6981f, ? super InterfaceC8015b, ? extends InterfaceC8015b> f34542o;

    /* renamed from: p */
    static volatile InterfaceC9074b<? super AbstractC6985j, ? super InterfaceC6987l, ? extends InterfaceC6987l> f34543p;

    /* renamed from: q */
    static volatile InterfaceC9074b<? super AbstractC6990o, ? super InterfaceC6992q, ? extends InterfaceC6992q> f34544q;

    /* renamed from: r */
    static volatile InterfaceC9074b<? super AbstractC6994s, ? super InterfaceC6995t, ? extends InterfaceC6995t> f34545r;

    /* renamed from: s */
    static volatile InterfaceC9074b<? super AbstractC6977b, ? super InterfaceC6978c, ? extends InterfaceC6978c> f34546s;

    /* renamed from: a */
    static <T, U, R> R m41979a(InterfaceC9074b<T, U, R> interfaceC9074b, T t10, U u10) {
        try {
            return interfaceC9074b.apply(t10, u10);
        } catch (Throwable th2) {
            throw C12504g.m40936d(th2);
        }
    }

    /* renamed from: b */
    static <T, R> R m41980b(InterfaceC9077e<T, R> interfaceC9077e, T t10) {
        try {
            return interfaceC9077e.apply(t10);
        } catch (Throwable th2) {
            throw C12504g.m40936d(th2);
        }
    }

    /* renamed from: c */
    static AbstractC6993r m41981c(InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> interfaceC9077e, Callable<AbstractC6993r> callable) {
        return (AbstractC6993r) C9513b.m28324d(m41980b(interfaceC9077e, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    static AbstractC6993r m41982d(Callable<AbstractC6993r> callable) {
        try {
            return (AbstractC6993r) C9513b.m28324d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw C12504g.m40936d(th2);
        }
    }

    /* renamed from: e */
    public static AbstractC6993r m41983e(Callable<AbstractC6993r> callable) {
        C9513b.m28324d(callable, "Scheduler Callable can't be null");
        InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> interfaceC9077e = f34530c;
        return interfaceC9077e == null ? m41982d(callable) : m41981c(interfaceC9077e, callable);
    }

    /* renamed from: f */
    public static AbstractC6993r m41984f(Callable<AbstractC6993r> callable) {
        C9513b.m28324d(callable, "Scheduler Callable can't be null");
        InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> interfaceC9077e = f34532e;
        return interfaceC9077e == null ? m41982d(callable) : m41981c(interfaceC9077e, callable);
    }

    /* renamed from: g */
    public static AbstractC6993r m41985g(Callable<AbstractC6993r> callable) {
        C9513b.m28324d(callable, "Scheduler Callable can't be null");
        InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> interfaceC9077e = f34533f;
        return interfaceC9077e == null ? m41982d(callable) : m41981c(interfaceC9077e, callable);
    }

    /* renamed from: h */
    public static AbstractC6993r m41986h(Callable<AbstractC6993r> callable) {
        C9513b.m28324d(callable, "Scheduler Callable can't be null");
        InterfaceC9077e<? super Callable<AbstractC6993r>, ? extends AbstractC6993r> interfaceC9077e = f34531d;
        return interfaceC9077e == null ? m41982d(callable) : m41981c(interfaceC9077e, callable);
    }

    /* renamed from: i */
    static boolean m41987i(Throwable th2) {
        return (th2 instanceof C7746d) || (th2 instanceof C7745c) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof C7743a);
    }

    /* renamed from: j */
    public static AbstractC6977b m41988j(AbstractC6977b abstractC6977b) {
        InterfaceC9077e<? super AbstractC6977b, ? extends AbstractC6977b> interfaceC9077e = f34541n;
        return interfaceC9077e != null ? (AbstractC6977b) m41980b(interfaceC9077e, abstractC6977b) : abstractC6977b;
    }

    /* renamed from: k */
    public static <T> AbstractC6981f<T> m41989k(AbstractC6981f<T> abstractC6981f) {
        InterfaceC9077e<? super AbstractC6981f, ? extends AbstractC6981f> interfaceC9077e = f34536i;
        return interfaceC9077e != null ? (AbstractC6981f) m41980b(interfaceC9077e, abstractC6981f) : abstractC6981f;
    }

    /* renamed from: l */
    public static <T> AbstractC6985j<T> m41990l(AbstractC6985j<T> abstractC6985j) {
        InterfaceC9077e<? super AbstractC6985j, ? extends AbstractC6985j> interfaceC9077e = f34539l;
        return interfaceC9077e != null ? (AbstractC6985j) m41980b(interfaceC9077e, abstractC6985j) : abstractC6985j;
    }

    /* renamed from: m */
    public static <T> AbstractC6990o<T> m41991m(AbstractC6990o<T> abstractC6990o) {
        InterfaceC9077e<? super AbstractC6990o, ? extends AbstractC6990o> interfaceC9077e = f34538k;
        return interfaceC9077e != null ? (AbstractC6990o) m41980b(interfaceC9077e, abstractC6990o) : abstractC6990o;
    }

    /* renamed from: n */
    public static <T> AbstractC6994s<T> m41992n(AbstractC6994s<T> abstractC6994s) {
        InterfaceC9077e<? super AbstractC6994s, ? extends AbstractC6994s> interfaceC9077e = f34540m;
        return interfaceC9077e != null ? (AbstractC6994s) m41980b(interfaceC9077e, abstractC6994s) : abstractC6994s;
    }

    /* renamed from: o */
    public static <T> AbstractC8003a<T> m41993o(AbstractC8003a<T> abstractC8003a) {
        InterfaceC9077e<? super AbstractC8003a, ? extends AbstractC8003a> interfaceC9077e = f34537j;
        return interfaceC9077e != null ? (AbstractC8003a) m41980b(interfaceC9077e, abstractC8003a) : abstractC8003a;
    }

    /* renamed from: p */
    public static AbstractC6993r m41994p(AbstractC6993r abstractC6993r) {
        InterfaceC9077e<? super AbstractC6993r, ? extends AbstractC6993r> interfaceC9077e = f34534g;
        return interfaceC9077e == null ? abstractC6993r : (AbstractC6993r) m41980b(interfaceC9077e, abstractC6993r);
    }

    /* renamed from: q */
    public static void m41995q(Throwable th2) {
        InterfaceC9076d<? super Throwable> interfaceC9076d = f34528a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m41987i(th2)) {
            th2 = new C7748f(th2);
        }
        if (interfaceC9076d != null) {
            try {
                interfaceC9076d.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                m42003y(th3);
            }
        }
        th2.printStackTrace();
        m42003y(th2);
    }

    /* renamed from: r */
    public static AbstractC6993r m41996r(AbstractC6993r abstractC6993r) {
        InterfaceC9077e<? super AbstractC6993r, ? extends AbstractC6993r> interfaceC9077e = f34535h;
        return interfaceC9077e == null ? abstractC6993r : (AbstractC6993r) m41980b(interfaceC9077e, abstractC6993r);
    }

    /* renamed from: s */
    public static Runnable m41997s(Runnable runnable) {
        C9513b.m28324d(runnable, "run is null");
        InterfaceC9077e<? super Runnable, ? extends Runnable> interfaceC9077e = f34529b;
        return interfaceC9077e == null ? runnable : (Runnable) m41980b(interfaceC9077e, runnable);
    }

    /* renamed from: t */
    public static InterfaceC6978c m41998t(AbstractC6977b abstractC6977b, InterfaceC6978c interfaceC6978c) {
        InterfaceC9074b<? super AbstractC6977b, ? super InterfaceC6978c, ? extends InterfaceC6978c> interfaceC9074b = f34546s;
        return interfaceC9074b != null ? (InterfaceC6978c) m41979a(interfaceC9074b, abstractC6977b, interfaceC6978c) : interfaceC6978c;
    }

    /* renamed from: u */
    public static <T> InterfaceC6987l<? super T> m41999u(AbstractC6985j<T> abstractC6985j, InterfaceC6987l<? super T> interfaceC6987l) {
        InterfaceC9074b<? super AbstractC6985j, ? super InterfaceC6987l, ? extends InterfaceC6987l> interfaceC9074b = f34543p;
        return interfaceC9074b != null ? (InterfaceC6987l) m41979a(interfaceC9074b, abstractC6985j, interfaceC6987l) : interfaceC6987l;
    }

    /* renamed from: v */
    public static <T> InterfaceC6992q<? super T> m42000v(AbstractC6990o<T> abstractC6990o, InterfaceC6992q<? super T> interfaceC6992q) {
        InterfaceC9074b<? super AbstractC6990o, ? super InterfaceC6992q, ? extends InterfaceC6992q> interfaceC9074b = f34544q;
        return interfaceC9074b != null ? (InterfaceC6992q) m41979a(interfaceC9074b, abstractC6990o, interfaceC6992q) : interfaceC6992q;
    }

    /* renamed from: w */
    public static <T> InterfaceC6995t<? super T> m42001w(AbstractC6994s<T> abstractC6994s, InterfaceC6995t<? super T> interfaceC6995t) {
        InterfaceC9074b<? super AbstractC6994s, ? super InterfaceC6995t, ? extends InterfaceC6995t> interfaceC9074b = f34545r;
        return interfaceC9074b != null ? (InterfaceC6995t) m41979a(interfaceC9074b, abstractC6994s, interfaceC6995t) : interfaceC6995t;
    }

    /* renamed from: x */
    public static <T> InterfaceC8015b<? super T> m42002x(AbstractC6981f<T> abstractC6981f, InterfaceC8015b<? super T> interfaceC8015b) {
        InterfaceC9074b<? super AbstractC6981f, ? super InterfaceC8015b, ? extends InterfaceC8015b> interfaceC9074b = f34542o;
        return interfaceC9074b != null ? (InterfaceC8015b) m41979a(interfaceC9074b, abstractC6981f, interfaceC8015b) : interfaceC8015b;
    }

    /* renamed from: y */
    static void m42003y(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
