package zk;

import ck.n;
import gk.Continuation;

/* loaded from: classes3.dex */
public final class e0 {
    public static final <T> Object a(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof a0) {
            n.a aVar = ck.n.f7126b;
            obj = ck.o.a(((a0) obj).f32837a);
        }
        return ck.n.b(obj);
    }

    public static final <T> Object b(Object obj, ok.l<? super Throwable, ck.v> lVar) {
        Throwable d10 = ck.n.d(obj);
        return d10 == null ? lVar != null ? new b0(obj, lVar) : obj : new a0(d10, false, 2, null);
    }

    public static final <T> Object c(Object obj, m<?> mVar) {
        Throwable d10 = ck.n.d(obj);
        return d10 == null ? obj : new a0(d10, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, ok.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
