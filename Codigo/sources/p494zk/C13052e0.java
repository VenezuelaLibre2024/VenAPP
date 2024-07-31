package p494zk;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import p124gk.Continuation;
import p280ok.InterfaceC9998l;

/* renamed from: zk.e0 */
/* loaded from: classes3.dex */
public final class C13052e0 {
    /* renamed from: a */
    public static final <T> Object m43147a(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof C13033a0) {
            C2029n.a aVar = C2029n.f8078b;
            obj = C2030o.m10348a(((C13033a0) obj).f35388a);
        }
        return C2029n.m10340b(obj);
    }

    /* renamed from: b */
    public static final <T> Object m43148b(Object obj, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        Throwable m10342d = C2029n.m10342d(obj);
        return m10342d == null ? interfaceC9998l != null ? new C13038b0(obj, interfaceC9998l) : obj : new C13033a0(m10342d, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m43149c(Object obj, InterfaceC13083m<?> interfaceC13083m) {
        Throwable m10342d = C2029n.m10342d(obj);
        return m10342d == null ? obj : new C13033a0(m10342d, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m43150d(Object obj, InterfaceC9998l interfaceC9998l, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            interfaceC9998l = null;
        }
        return m43148b(obj, interfaceC9998l);
    }
}
