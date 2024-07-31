package il;

import ck.v;
import gk.Continuation;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: il.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0289a {
        public static /* synthetic */ void a(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.b(obj);
        }
    }

    boolean a();

    void b(Object obj);

    Object c(Object obj, Continuation<? super v> continuation);
}
