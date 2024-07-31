package p494zk;

import ck.C2017b;
import p089el.C7222h;
import p124gk.InterfaceC7587f;

/* renamed from: zk.j0 */
/* loaded from: classes3.dex */
public final class C13072j0 {
    /* renamed from: a */
    public static final void m43220a(InterfaceC7587f interfaceC7587f, Throwable th2) {
        try {
            InterfaceC13068i0 interfaceC13068i0 = (InterfaceC13068i0) interfaceC7587f.mo20647b(InterfaceC13068i0.f35453p);
            if (interfaceC13068i0 != null) {
                interfaceC13068i0.mo621e(interfaceC7587f, th2);
            } else {
                C7222h.m21574a(interfaceC7587f, th2);
            }
        } catch (Throwable th3) {
            C7222h.m21574a(interfaceC7587f, m43221b(th2, th3));
        }
    }

    /* renamed from: b */
    public static final Throwable m43221b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C2017b.m10328a(runtimeException, th2);
        return runtimeException;
    }
}
