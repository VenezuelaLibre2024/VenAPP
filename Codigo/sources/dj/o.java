package dj;

import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public abstract class o<T> implements p<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14200a;

        static {
            int[] iArr = new int[dj.a.values().length];
            f14200a = iArr;
            try {
                iArr[dj.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14200a[dj.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14200a[dj.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14200a[dj.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int f() {
        return f.b();
    }

    public static <T> o<T> h() {
        return yj.a.m(rj.d.f24969a);
    }

    public static <T> o<T> p(Iterable<? extends T> iterable) {
        lj.b.d(iterable, "source is null");
        return yj.a.m(new rj.i(iterable));
    }

    public static <T> o<T> q(T t10) {
        lj.b.d(t10, "The item is null");
        return yj.a.m(new rj.j(t10));
    }

    @Override // dj.p
    public final void d(q<? super T> qVar) {
        lj.b.d(qVar, "observer is null");
        try {
            q<? super T> v10 = yj.a.v(this, qVar);
            lj.b.d(v10, "Plugin returned null Observer");
            s(v10);
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

    public final s<Boolean> e(jj.g<? super T> gVar) {
        lj.b.d(gVar, "predicate is null");
        return yj.a.n(new rj.c(this, gVar));
    }

    public final s<Boolean> g(Object obj) {
        lj.b.d(obj, "element is null");
        return e(lj.a.c(obj));
    }

    public final o<T> i(jj.g<? super T> gVar) {
        lj.b.d(gVar, "predicate is null");
        return yj.a.m(new rj.e(this, gVar));
    }

    public final <R> o<R> j(jj.e<? super T, ? extends p<? extends R>> eVar) {
        return k(eVar, false);
    }

    public final <R> o<R> k(jj.e<? super T, ? extends p<? extends R>> eVar, boolean z10) {
        return l(eVar, z10, a.e.API_PRIORITY_OTHER);
    }

    public final <R> o<R> l(jj.e<? super T, ? extends p<? extends R>> eVar, boolean z10, int i10) {
        return m(eVar, z10, i10, f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> o<R> m(jj.e<? super T, ? extends p<? extends R>> eVar, boolean z10, int i10, int i11) {
        lj.b.d(eVar, "mapper is null");
        lj.b.e(i10, "maxConcurrency");
        lj.b.e(i11, "bufferSize");
        if (!(this instanceof mj.h)) {
            return yj.a.m(new rj.f(this, eVar, z10, i10, i11));
        }
        Object call = ((mj.h) this).call();
        return call == null ? h() : rj.l.a(call, eVar);
    }

    public final b n(jj.e<? super T, ? extends d> eVar) {
        return o(eVar, false);
    }

    public final b o(jj.e<? super T, ? extends d> eVar, boolean z10) {
        lj.b.d(eVar, "mapper is null");
        return yj.a.j(new rj.h(this, eVar, z10));
    }

    public final <R> o<R> r(jj.e<? super T, ? extends R> eVar) {
        lj.b.d(eVar, "mapper is null");
        return yj.a.m(new rj.k(this, eVar));
    }

    protected abstract void s(q<? super T> qVar);

    public final o<T> t(p<? extends T> pVar) {
        lj.b.d(pVar, "other is null");
        return yj.a.m(new rj.m(this, pVar));
    }

    public final f<T> u(dj.a aVar) {
        pj.n nVar = new pj.n(this);
        int i10 = a.f14200a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? nVar.y() : yj.a.k(new pj.u(nVar)) : nVar : nVar.B() : nVar.A();
    }
}
