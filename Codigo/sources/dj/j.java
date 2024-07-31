package dj;

import java.util.concurrent.Callable;
import qj.v;

/* loaded from: classes3.dex */
public abstract class j<T> implements n<T> {
    public static <T1, T2, R> j<R> A(n<? extends T1> nVar, n<? extends T2> nVar2, jj.b<? super T1, ? super T2, ? extends R> bVar) {
        lj.b.d(nVar, "source1 is null");
        lj.b.d(nVar2, "source2 is null");
        return B(lj.a.g(bVar), nVar, nVar2);
    }

    public static <T, R> j<R> B(jj.e<? super Object[], ? extends R> eVar, n<? extends T>... nVarArr) {
        lj.b.d(nVarArr, "sources is null");
        if (nVarArr.length == 0) {
            return g();
        }
        lj.b.d(eVar, "zipper is null");
        return yj.a.l(new v(nVarArr, eVar));
    }

    public static <T> j<T> b(m<T> mVar) {
        lj.b.d(mVar, "onSubscribe is null");
        return yj.a.l(new qj.c(mVar));
    }

    public static <T> j<T> g() {
        return yj.a.l(qj.d.f24053a);
    }

    public static <T> j<T> l(Callable<? extends T> callable) {
        lj.b.d(callable, "callable is null");
        return yj.a.l(new qj.i(callable));
    }

    public static <T> j<T> n(T t10) {
        lj.b.d(t10, "item is null");
        return yj.a.l(new qj.m(t10));
    }

    @Override // dj.n
    public final void a(l<? super T> lVar) {
        lj.b.d(lVar, "observer is null");
        l<? super T> u10 = yj.a.u(this, lVar);
        lj.b.d(u10, "observer returned by the RxJavaPlugins hook is null");
        try {
            u(u10);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            hj.b.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final j<T> c(T t10) {
        lj.b.d(t10, "item is null");
        return x(n(t10));
    }

    public final j<T> e(jj.d<? super Throwable> dVar) {
        jj.d b10 = lj.a.b();
        jj.d b11 = lj.a.b();
        jj.d dVar2 = (jj.d) lj.b.d(dVar, "onError is null");
        jj.a aVar = lj.a.f21262c;
        return yj.a.l(new qj.q(this, b10, b11, dVar2, aVar, aVar, aVar));
    }

    public final j<T> f(jj.d<? super T> dVar) {
        jj.d b10 = lj.a.b();
        jj.d dVar2 = (jj.d) lj.b.d(dVar, "onSubscribe is null");
        jj.d b11 = lj.a.b();
        jj.a aVar = lj.a.f21262c;
        return yj.a.l(new qj.q(this, b10, dVar2, b11, aVar, aVar, aVar));
    }

    public final j<T> h(jj.g<? super T> gVar) {
        lj.b.d(gVar, "predicate is null");
        return yj.a.l(new qj.e(this, gVar));
    }

    public final <R> j<R> i(jj.e<? super T, ? extends n<? extends R>> eVar) {
        lj.b.d(eVar, "mapper is null");
        return yj.a.l(new qj.h(this, eVar));
    }

    public final b j(jj.e<? super T, ? extends d> eVar) {
        lj.b.d(eVar, "mapper is null");
        return yj.a.j(new qj.g(this, eVar));
    }

    public final <R> o<R> k(jj.e<? super T, ? extends p<? extends R>> eVar) {
        return z().j(eVar);
    }

    public final s<Boolean> m() {
        return yj.a.n(new qj.l(this));
    }

    public final <R> j<R> o(jj.e<? super T, ? extends R> eVar) {
        lj.b.d(eVar, "mapper is null");
        return yj.a.l(new qj.n(this, eVar));
    }

    public final j<T> p(r rVar) {
        lj.b.d(rVar, "scheduler is null");
        return yj.a.l(new qj.o(this, rVar));
    }

    public final j<T> q(n<? extends T> nVar) {
        lj.b.d(nVar, "next is null");
        return r(lj.a.e(nVar));
    }

    public final j<T> r(jj.e<? super Throwable, ? extends n<? extends T>> eVar) {
        lj.b.d(eVar, "resumeFunction is null");
        return yj.a.l(new qj.p(this, eVar, true));
    }

    public final gj.b s() {
        return t(lj.a.b(), lj.a.f21265f, lj.a.f21262c);
    }

    public final gj.b t(jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar) {
        lj.b.d(dVar, "onSuccess is null");
        lj.b.d(dVar2, "onError is null");
        lj.b.d(aVar, "onComplete is null");
        return (gj.b) w(new qj.b(dVar, dVar2, aVar));
    }

    protected abstract void u(l<? super T> lVar);

    public final j<T> v(r rVar) {
        lj.b.d(rVar, "scheduler is null");
        return yj.a.l(new qj.r(this, rVar));
    }

    public final <E extends l<? super T>> E w(E e10) {
        a(e10);
        return e10;
    }

    public final j<T> x(n<? extends T> nVar) {
        lj.b.d(nVar, "other is null");
        return yj.a.l(new qj.s(this, nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f<T> y() {
        return this instanceof mj.b ? ((mj.b) this).d() : yj.a.k(new qj.t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o<T> z() {
        return this instanceof mj.d ? ((mj.d) this).b() : yj.a.m(new qj.u(this));
    }
}
