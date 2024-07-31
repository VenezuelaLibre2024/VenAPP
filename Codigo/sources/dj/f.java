package dj;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Comparator;
import java.util.List;
import pj.v;
import pj.w;
import pj.x;
import pj.z;

/* loaded from: classes3.dex */
public abstract class f<T> implements im.a<T> {

    /* renamed from: a */
    static final int f14199a = Math.max(1, Integer.getInteger("rx2.buffer-size", RecognitionOptions.ITF).intValue());

    public static int b() {
        return f14199a;
    }

    public static <T> f<T> e(h<T> hVar, a aVar) {
        lj.b.d(hVar, "source is null");
        lj.b.d(aVar, "mode is null");
        return yj.a.k(new pj.c(hVar, aVar));
    }

    private f<T> f(jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar, jj.a aVar2) {
        lj.b.d(dVar, "onNext is null");
        lj.b.d(dVar2, "onError is null");
        lj.b.d(aVar, "onComplete is null");
        lj.b.d(aVar2, "onAfterTerminate is null");
        return yj.a.k(new pj.d(this, dVar, dVar2, aVar, aVar2));
    }

    public static <T> f<T> i() {
        return yj.a.k(pj.g.f23123b);
    }

    public static <T> f<T> r(T... tArr) {
        lj.b.d(tArr, "items is null");
        return tArr.length == 0 ? i() : tArr.length == 1 ? t(tArr[0]) : yj.a.k(new pj.l(tArr));
    }

    public static <T> f<T> s(Iterable<? extends T> iterable) {
        lj.b.d(iterable, "source is null");
        return yj.a.k(new pj.m(iterable));
    }

    public static <T> f<T> t(T t10) {
        lj.b.d(t10, "item is null");
        return yj.a.k(new pj.p(t10));
    }

    public static <T> f<T> v(im.a<? extends T> aVar, im.a<? extends T> aVar2, im.a<? extends T> aVar3) {
        lj.b.d(aVar, "source1 is null");
        lj.b.d(aVar2, "source2 is null");
        lj.b.d(aVar3, "source3 is null");
        return r(aVar, aVar2, aVar3).l(lj.a.d(), false, 3);
    }

    public final f<T> A() {
        return yj.a.k(new pj.t(this));
    }

    public final f<T> B() {
        return yj.a.k(new v(this));
    }

    public final ij.a<T> C() {
        return D(b());
    }

    public final ij.a<T> D(int i10) {
        lj.b.e(i10, "bufferSize");
        return w.M(this, i10);
    }

    public final f<T> E(Comparator<? super T> comparator) {
        lj.b.d(comparator, "sortFunction");
        return J().l().u(lj.a.f(comparator)).n(lj.a.d());
    }

    public final gj.b F(jj.d<? super T> dVar) {
        return G(dVar, lj.a.f21265f, lj.a.f21262c, pj.o.INSTANCE);
    }

    public final gj.b G(jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar, jj.d<? super im.c> dVar3) {
        lj.b.d(dVar, "onNext is null");
        lj.b.d(dVar2, "onError is null");
        lj.b.d(aVar, "onComplete is null");
        lj.b.d(dVar3, "onSubscribe is null");
        vj.c cVar = new vj.c(dVar, dVar2, aVar, dVar3);
        H(cVar);
        return cVar;
    }

    public final void H(i<? super T> iVar) {
        lj.b.d(iVar, "s is null");
        try {
            im.b<? super T> x10 = yj.a.x(this, iVar);
            lj.b.d(x10, "Plugin returned null Subscriber");
            I(x10);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            hj.b.b(th2);
            yj.a.q(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    protected abstract void I(im.b<? super T> bVar);

    public final s<List<T>> J() {
        return yj.a.n(new z(this));
    }

    @Override // im.a
    public final void a(im.b<? super T> bVar) {
        if (bVar instanceof i) {
            H((i) bVar);
        } else {
            lj.b.d(bVar, "s is null");
            H(new vj.d(bVar));
        }
    }

    public final <R> f<R> c(jj.e<? super T, ? extends im.a<? extends R>> eVar) {
        return d(eVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> f<R> d(jj.e<? super T, ? extends im.a<? extends R>> eVar, int i10) {
        lj.b.d(eVar, "mapper is null");
        lj.b.e(i10, "prefetch");
        if (!(this instanceof mj.h)) {
            return yj.a.k(new pj.b(this, eVar, i10, xj.f.IMMEDIATE));
        }
        Object call = ((mj.h) this).call();
        return call == null ? i() : x.a(call, eVar);
    }

    public final f<T> g(jj.d<? super T> dVar) {
        jj.d<? super Throwable> b10 = lj.a.b();
        jj.a aVar = lj.a.f21262c;
        return f(dVar, b10, aVar, aVar);
    }

    public final j<T> h(long j10) {
        if (j10 >= 0) {
            return yj.a.l(new pj.f(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final f<T> j(jj.g<? super T> gVar) {
        lj.b.d(gVar, "predicate is null");
        return yj.a.k(new pj.h(this, gVar));
    }

    public final j<T> k() {
        return h(0L);
    }

    public final <R> f<R> l(jj.e<? super T, ? extends im.a<? extends R>> eVar, boolean z10, int i10) {
        return m(eVar, z10, i10, b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> f<R> m(jj.e<? super T, ? extends im.a<? extends R>> eVar, boolean z10, int i10, int i11) {
        lj.b.d(eVar, "mapper is null");
        lj.b.e(i10, "maxConcurrency");
        lj.b.e(i11, "bufferSize");
        if (!(this instanceof mj.h)) {
            return yj.a.k(new pj.i(this, eVar, z10, i10, i11));
        }
        Object call = ((mj.h) this).call();
        return call == null ? i() : x.a(call, eVar);
    }

    public final <U> f<U> n(jj.e<? super T, ? extends Iterable<? extends U>> eVar) {
        return o(eVar, b());
    }

    public final <U> f<U> o(jj.e<? super T, ? extends Iterable<? extends U>> eVar, int i10) {
        lj.b.d(eVar, "mapper is null");
        lj.b.e(i10, "bufferSize");
        return yj.a.k(new pj.k(this, eVar, i10));
    }

    public final <R> f<R> p(jj.e<? super T, ? extends n<? extends R>> eVar) {
        return q(eVar, false, a.e.API_PRIORITY_OTHER);
    }

    public final <R> f<R> q(jj.e<? super T, ? extends n<? extends R>> eVar, boolean z10, int i10) {
        lj.b.d(eVar, "mapper is null");
        lj.b.e(i10, "maxConcurrency");
        return yj.a.k(new pj.j(this, eVar, z10, i10));
    }

    public final <R> f<R> u(jj.e<? super T, ? extends R> eVar) {
        lj.b.d(eVar, "mapper is null");
        return yj.a.k(new pj.q(this, eVar));
    }

    public final f<T> w(r rVar) {
        return x(rVar, false, b());
    }

    public final f<T> x(r rVar, boolean z10, int i10) {
        lj.b.d(rVar, "scheduler is null");
        lj.b.e(i10, "bufferSize");
        return yj.a.k(new pj.r(this, rVar, z10, i10));
    }

    public final f<T> y() {
        return z(b(), false, true);
    }

    public final f<T> z(int i10, boolean z10, boolean z11) {
        lj.b.e(i10, "bufferSize");
        return yj.a.k(new pj.s(this, i10, z11, z10, lj.a.f21262c));
    }
}
