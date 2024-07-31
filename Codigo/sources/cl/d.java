package cl;

import ck.v;
import gk.Continuation;

/* loaded from: classes3.dex */
public final class d {
    public static final <T> b<T> a(b<? extends T> bVar, ok.q<? super c<? super T>, ? super Throwable, ? super Continuation<? super v>, ? extends Object> qVar) {
        return h.a(bVar, qVar);
    }

    public static final <T> Object b(b<? extends T> bVar, c<? super T> cVar, Continuation<? super Throwable> continuation) {
        return h.b(bVar, cVar, continuation);
    }

    public static final <T> b<T> c(b<? extends T> bVar, ok.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return i.a(bVar, pVar);
    }

    public static final <T> Object d(c<? super T> cVar, b<? extends T> bVar, Continuation<? super v> continuation) {
        return f.a(cVar, bVar, continuation);
    }

    public static final void e(c<?> cVar) {
        g.a(cVar);
    }

    public static final <T> Object f(b<? extends T> bVar, Continuation<? super T> continuation) {
        return j.a(bVar, continuation);
    }

    public static final <T> b<T> g(ok.p<? super c<? super T>, ? super Continuation<? super v>, ? extends Object> pVar) {
        return e.a(pVar);
    }
}
