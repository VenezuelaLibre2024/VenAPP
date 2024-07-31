package dj;

/* loaded from: classes3.dex */
public abstract class s<T> implements u<T> {
    public static <T> s<T> h(T t10) {
        lj.b.d(t10, "value is null");
        return yj.a.n(new sj.c(t10));
    }

    @Override // dj.u
    public final void c(t<? super T> tVar) {
        lj.b.d(tVar, "subscriber is null");
        t<? super T> w10 = yj.a.w(this, tVar);
        lj.b.d(w10, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            k(w10);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            hj.b.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final s<T> e(jj.d<? super Throwable> dVar) {
        lj.b.d(dVar, "onError is null");
        return yj.a.n(new sj.a(this, dVar));
    }

    public final s<T> f(jj.d<? super T> dVar) {
        lj.b.d(dVar, "onSuccess is null");
        return yj.a.n(new sj.b(this, dVar));
    }

    public final j<T> g(jj.g<? super T> gVar) {
        lj.b.d(gVar, "predicate is null");
        return yj.a.l(new qj.f(this, gVar));
    }

    public final s<T> i(s<? extends T> sVar) {
        lj.b.d(sVar, "resumeSingleInCaseOfError is null");
        return j(lj.a.e(sVar));
    }

    public final s<T> j(jj.e<? super Throwable, ? extends u<? extends T>> eVar) {
        lj.b.d(eVar, "resumeFunctionInCaseOfError is null");
        return yj.a.n(new sj.d(this, eVar));
    }

    protected abstract void k(t<? super T> tVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final f<T> l() {
        return this instanceof mj.b ? ((mj.b) this).d() : yj.a.k(new sj.e(this));
    }
}
