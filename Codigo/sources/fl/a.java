package fl;

import ck.n;
import ck.o;
import ck.v;
import el.k;
import gk.Continuation;
import hk.c;
import ok.l;
import ok.p;

/* loaded from: classes3.dex */
public final class a {
    private static final void a(Continuation<?> continuation, Throwable th2) {
        n.a aVar = n.f7126b;
        continuation.resumeWith(n.b(o.a(th2)));
        throw th2;
    }

    public static final void b(Continuation<? super v> continuation, Continuation<?> continuation2) {
        Continuation b10;
        try {
            b10 = c.b(continuation);
            n.a aVar = n.f7126b;
            k.c(b10, n.b(v.f7137a), null, 2, null);
        } catch (Throwable th2) {
            a(continuation2, th2);
        }
    }

    public static final <R, T> void c(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation, l<? super Throwable, v> lVar) {
        Continuation a10;
        Continuation b10;
        try {
            a10 = c.a(pVar, r10, continuation);
            b10 = c.b(a10);
            n.a aVar = n.f7126b;
            k.b(b10, n.b(v.f7137a), lVar);
        } catch (Throwable th2) {
            a(continuation, th2);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, Continuation continuation, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, continuation, lVar);
    }
}
