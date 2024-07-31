package yj;

import dj.b;
import dj.c;
import dj.f;
import dj.j;
import dj.l;
import dj.o;
import dj.q;
import dj.r;
import dj.s;
import dj.t;
import java.util.concurrent.Callable;
import jj.d;
import jj.e;
import xj.g;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    static volatile d<? super Throwable> f31992a;

    /* renamed from: b */
    static volatile e<? super Runnable, ? extends Runnable> f31993b;

    /* renamed from: c */
    static volatile e<? super Callable<r>, ? extends r> f31994c;

    /* renamed from: d */
    static volatile e<? super Callable<r>, ? extends r> f31995d;

    /* renamed from: e */
    static volatile e<? super Callable<r>, ? extends r> f31996e;

    /* renamed from: f */
    static volatile e<? super Callable<r>, ? extends r> f31997f;

    /* renamed from: g */
    static volatile e<? super r, ? extends r> f31998g;

    /* renamed from: h */
    static volatile e<? super r, ? extends r> f31999h;

    /* renamed from: i */
    static volatile e<? super f, ? extends f> f32000i;

    /* renamed from: j */
    static volatile e<? super ij.a, ? extends ij.a> f32001j;

    /* renamed from: k */
    static volatile e<? super o, ? extends o> f32002k;

    /* renamed from: l */
    static volatile e<? super j, ? extends j> f32003l;

    /* renamed from: m */
    static volatile e<? super s, ? extends s> f32004m;

    /* renamed from: n */
    static volatile e<? super b, ? extends b> f32005n;

    /* renamed from: o */
    static volatile jj.b<? super f, ? super im.b, ? extends im.b> f32006o;

    /* renamed from: p */
    static volatile jj.b<? super j, ? super l, ? extends l> f32007p;

    /* renamed from: q */
    static volatile jj.b<? super o, ? super q, ? extends q> f32008q;

    /* renamed from: r */
    static volatile jj.b<? super s, ? super t, ? extends t> f32009r;

    /* renamed from: s */
    static volatile jj.b<? super b, ? super c, ? extends c> f32010s;

    static <T, U, R> R a(jj.b<T, U, R> bVar, T t10, U u10) {
        try {
            return bVar.apply(t10, u10);
        } catch (Throwable th2) {
            throw g.d(th2);
        }
    }

    static <T, R> R b(e<T, R> eVar, T t10) {
        try {
            return eVar.apply(t10);
        } catch (Throwable th2) {
            throw g.d(th2);
        }
    }

    static r c(e<? super Callable<r>, ? extends r> eVar, Callable<r> callable) {
        return (r) lj.b.d(b(eVar, callable), "Scheduler Callable result can't be null");
    }

    static r d(Callable<r> callable) {
        try {
            return (r) lj.b.d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw g.d(th2);
        }
    }

    public static r e(Callable<r> callable) {
        lj.b.d(callable, "Scheduler Callable can't be null");
        e<? super Callable<r>, ? extends r> eVar = f31994c;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    public static r f(Callable<r> callable) {
        lj.b.d(callable, "Scheduler Callable can't be null");
        e<? super Callable<r>, ? extends r> eVar = f31996e;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    public static r g(Callable<r> callable) {
        lj.b.d(callable, "Scheduler Callable can't be null");
        e<? super Callable<r>, ? extends r> eVar = f31997f;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    public static r h(Callable<r> callable) {
        lj.b.d(callable, "Scheduler Callable can't be null");
        e<? super Callable<r>, ? extends r> eVar = f31995d;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    static boolean i(Throwable th2) {
        return (th2 instanceof hj.d) || (th2 instanceof hj.c) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof hj.a);
    }

    public static b j(b bVar) {
        e<? super b, ? extends b> eVar = f32005n;
        return eVar != null ? (b) b(eVar, bVar) : bVar;
    }

    public static <T> f<T> k(f<T> fVar) {
        e<? super f, ? extends f> eVar = f32000i;
        return eVar != null ? (f) b(eVar, fVar) : fVar;
    }

    public static <T> j<T> l(j<T> jVar) {
        e<? super j, ? extends j> eVar = f32003l;
        return eVar != null ? (j) b(eVar, jVar) : jVar;
    }

    public static <T> o<T> m(o<T> oVar) {
        e<? super o, ? extends o> eVar = f32002k;
        return eVar != null ? (o) b(eVar, oVar) : oVar;
    }

    public static <T> s<T> n(s<T> sVar) {
        e<? super s, ? extends s> eVar = f32004m;
        return eVar != null ? (s) b(eVar, sVar) : sVar;
    }

    public static <T> ij.a<T> o(ij.a<T> aVar) {
        e<? super ij.a, ? extends ij.a> eVar = f32001j;
        return eVar != null ? (ij.a) b(eVar, aVar) : aVar;
    }

    public static r p(r rVar) {
        e<? super r, ? extends r> eVar = f31998g;
        return eVar == null ? rVar : (r) b(eVar, rVar);
    }

    public static void q(Throwable th2) {
        d<? super Throwable> dVar = f31992a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th2)) {
            th2 = new hj.f(th2);
        }
        if (dVar != null) {
            try {
                dVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                y(th3);
            }
        }
        th2.printStackTrace();
        y(th2);
    }

    public static r r(r rVar) {
        e<? super r, ? extends r> eVar = f31999h;
        return eVar == null ? rVar : (r) b(eVar, rVar);
    }

    public static Runnable s(Runnable runnable) {
        lj.b.d(runnable, "run is null");
        e<? super Runnable, ? extends Runnable> eVar = f31993b;
        return eVar == null ? runnable : (Runnable) b(eVar, runnable);
    }

    public static c t(b bVar, c cVar) {
        jj.b<? super b, ? super c, ? extends c> bVar2 = f32010s;
        return bVar2 != null ? (c) a(bVar2, bVar, cVar) : cVar;
    }

    public static <T> l<? super T> u(j<T> jVar, l<? super T> lVar) {
        jj.b<? super j, ? super l, ? extends l> bVar = f32007p;
        return bVar != null ? (l) a(bVar, jVar, lVar) : lVar;
    }

    public static <T> q<? super T> v(o<T> oVar, q<? super T> qVar) {
        jj.b<? super o, ? super q, ? extends q> bVar = f32008q;
        return bVar != null ? (q) a(bVar, oVar, qVar) : qVar;
    }

    public static <T> t<? super T> w(s<T> sVar, t<? super T> tVar) {
        jj.b<? super s, ? super t, ? extends t> bVar = f32009r;
        return bVar != null ? (t) a(bVar, sVar, tVar) : tVar;
    }

    public static <T> im.b<? super T> x(f<T> fVar, im.b<? super T> bVar) {
        jj.b<? super f, ? super im.b, ? extends im.b> bVar2 = f32006o;
        return bVar2 != null ? (im.b) a(bVar2, fVar, bVar) : bVar;
    }

    static void y(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
