package il;

import ck.C2037v;
import p124gk.Continuation;

/* renamed from: il.a */
/* loaded from: classes3.dex */
public interface InterfaceC8008a {

    /* renamed from: il.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m24590a(InterfaceC8008a interfaceC8008a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC8008a.mo24588b(obj);
        }
    }

    /* renamed from: a */
    boolean mo24587a();

    /* renamed from: b */
    void mo24588b(Object obj);

    /* renamed from: c */
    Object mo24589c(Object obj, Continuation<? super C2037v> continuation);
}
