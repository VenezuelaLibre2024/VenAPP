package dj;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class b implements d {
    public static b d() {
        return yj.a.j(oj.b.f22664a);
    }

    public static b e(d... dVarArr) {
        lj.b.d(dVarArr, "sources is null");
        return dVarArr.length == 0 ? d() : dVarArr.length == 1 ? s(dVarArr[0]) : yj.a.j(new oj.a(dVarArr));
    }

    private b i(jj.d<? super gj.b> dVar, jj.d<? super Throwable> dVar2, jj.a aVar, jj.a aVar2, jj.a aVar3, jj.a aVar4) {
        lj.b.d(dVar, "onSubscribe is null");
        lj.b.d(dVar2, "onError is null");
        lj.b.d(aVar, "onComplete is null");
        lj.b.d(aVar2, "onTerminate is null");
        lj.b.d(aVar3, "onAfterTerminate is null");
        lj.b.d(aVar4, "onDispose is null");
        return yj.a.j(new oj.g(this, dVar, dVar2, aVar, aVar2, aVar3, aVar4));
    }

    public static b j(jj.a aVar) {
        lj.b.d(aVar, "run is null");
        return yj.a.j(new oj.c(aVar));
    }

    public static b k(Callable<?> callable) {
        lj.b.d(callable, "callable is null");
        return yj.a.j(new oj.d(callable));
    }

    private static NullPointerException r(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static b s(d dVar) {
        lj.b.d(dVar, "source is null");
        return dVar instanceof b ? yj.a.j((b) dVar) : yj.a.j(new oj.e(dVar));
    }

    @Override // dj.d
    public final void a(c cVar) {
        lj.b.d(cVar, "s is null");
        try {
            p(yj.a.t(this, cVar));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            hj.b.b(th2);
            yj.a.q(th2);
            throw r(th2);
        }
    }

    public final b c(d dVar) {
        return f(dVar);
    }

    public final b f(d dVar) {
        lj.b.d(dVar, "other is null");
        return e(this, dVar);
    }

    public final b g(jj.a aVar) {
        jj.d<? super gj.b> b10 = lj.a.b();
        jj.d<? super Throwable> b11 = lj.a.b();
        jj.a aVar2 = lj.a.f21262c;
        return i(b10, b11, aVar, aVar2, aVar2, aVar2);
    }

    public final b h(jj.d<? super Throwable> dVar) {
        jj.d<? super gj.b> b10 = lj.a.b();
        jj.a aVar = lj.a.f21262c;
        return i(b10, dVar, aVar, aVar, aVar, aVar);
    }

    public final b l() {
        return m(lj.a.a());
    }

    public final b m(jj.g<? super Throwable> gVar) {
        lj.b.d(gVar, "predicate is null");
        return yj.a.j(new oj.f(this, gVar));
    }

    public final b n(jj.e<? super Throwable, ? extends d> eVar) {
        lj.b.d(eVar, "errorMapper is null");
        return yj.a.j(new oj.h(this, eVar));
    }

    public final gj.b o() {
        nj.e eVar = new nj.e();
        a(eVar);
        return eVar;
    }

    protected abstract void p(c cVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> j<T> q() {
        return this instanceof mj.c ? ((mj.c) this).a() : yj.a.l(new qj.j(this));
    }
}
