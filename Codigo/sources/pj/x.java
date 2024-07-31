package pj;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends dj.f<R> {

        /* renamed from: b, reason: collision with root package name */
        final T f23270b;

        /* renamed from: c, reason: collision with root package name */
        final jj.e<? super T, ? extends im.a<? extends R>> f23271c;

        a(T t10, jj.e<? super T, ? extends im.a<? extends R>> eVar) {
            this.f23270b = t10;
            this.f23271c = eVar;
        }

        @Override // dj.f
        public void I(im.b<? super R> bVar) {
            try {
                im.a aVar = (im.a) lj.b.d(this.f23271c.apply(this.f23270b), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    aVar.a(bVar);
                    return;
                }
                try {
                    Object call = ((Callable) aVar).call();
                    if (call == null) {
                        wj.d.b(bVar);
                    } else {
                        bVar.d(new wj.e(bVar, call));
                    }
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    wj.d.h(th2, bVar);
                }
            } catch (Throwable th3) {
                wj.d.h(th3, bVar);
            }
        }
    }

    public static <T, U> dj.f<U> a(T t10, jj.e<? super T, ? extends im.a<? extends U>> eVar) {
        return yj.a.k(new a(t10, eVar));
    }

    public static <T, R> boolean b(im.a<T> aVar, im.b<? super R> bVar, jj.e<? super T, ? extends im.a<? extends R>> eVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            defpackage.a aVar2 = (Object) ((Callable) aVar).call();
            if (aVar2 == null) {
                wj.d.b(bVar);
                return true;
            }
            im.a aVar3 = (im.a) lj.b.d(eVar.apply(aVar2), "The mapper returned a null Publisher");
            if (aVar3 instanceof Callable) {
                Object call = ((Callable) aVar3).call();
                if (call == null) {
                    wj.d.b(bVar);
                    return true;
                }
                bVar.d(new wj.e(bVar, call));
            } else {
                aVar3.a(bVar);
            }
            return true;
        } catch (Throwable th2) {
            hj.b.b(th2);
            wj.d.h(th2, bVar);
            return true;
        }
    }
}
