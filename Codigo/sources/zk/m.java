package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public interface m<T> extends Continuation<T> {

    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(m mVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return mVar.d(th2);
        }
    }

    void c(T t10, ok.l<? super Throwable, ck.v> lVar);

    boolean d(Throwable th2);

    void k(ok.l<? super Throwable, ck.v> lVar);

    Object l(T t10, Object obj, ok.l<? super Throwable, ck.v> lVar);

    void o(Object obj);
}
