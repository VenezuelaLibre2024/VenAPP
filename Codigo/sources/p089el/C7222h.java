package p089el;

import ck.C2017b;
import java.util.Iterator;
import p124gk.InterfaceC7587f;
import p494zk.C13072j0;
import p494zk.InterfaceC13068i0;

/* renamed from: el.h */
/* loaded from: classes3.dex */
public final class C7222h {
    /* renamed from: a */
    public static final void m21574a(InterfaceC7587f interfaceC7587f, Throwable th2) {
        Iterator<InterfaceC13068i0> it = C7220g.m21571a().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo621e(interfaceC7587f, th2);
            } catch (Throwable th3) {
                C7220g.m21572b(C13072j0.m43221b(th2, th3));
            }
        }
        try {
            C2017b.m10328a(th2, new C7224i(interfaceC7587f));
        } catch (Throwable unused) {
        }
        C7220g.m21572b(th2);
    }
}
