package p089el;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p427wk.C12234j;
import p427wk.C12236l;
import p427wk.InterfaceC12228d;
import p494zk.AbstractC13066h2;

/* renamed from: el.w */
/* loaded from: classes3.dex */
public final class C7247w {

    /* renamed from: a */
    public static final C7247w f16243a;

    /* renamed from: b */
    private static final boolean f16244b;

    /* renamed from: c */
    public static final AbstractC13066h2 f16245c;

    static {
        C7247w c7247w = new C7247w();
        f16243a = c7247w;
        f16244b = C7225i0.m21580f("kotlinx.coroutines.fast.service.loader", true);
        f16245c = c7247w.m21679a();
    }

    private C7247w() {
    }

    /* renamed from: a */
    private final AbstractC13066h2 m21679a() {
        InterfaceC12228d m39379c;
        List<InterfaceC7246v> m39387k;
        Object next;
        AbstractC13066h2 m21684e;
        try {
            if (f16244b) {
                m39387k = C7230l.f16204a.m21608c();
            } else {
                m39379c = C12234j.m39379c(ServiceLoader.load(InterfaceC7246v.class, InterfaceC7246v.class.getClassLoader()).iterator());
                m39387k = C12236l.m39387k(m39379c);
            }
            Iterator<T> it = m39387k.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int mo619c = ((InterfaceC7246v) next).mo619c();
                    do {
                        Object next2 = it.next();
                        int mo619c2 = ((InterfaceC7246v) next2).mo619c();
                        if (mo619c < mo619c2) {
                            next = next2;
                            mo619c = mo619c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC7246v interfaceC7246v = (InterfaceC7246v) next;
            return (interfaceC7246v == null || (m21684e = C7248x.m21684e(interfaceC7246v, m39387k)) == null) ? C7248x.m21681b(null, null, 3, null) : m21684e;
        } catch (Throwable th2) {
            return C7248x.m21681b(th2, null, 2, null);
        }
    }
}
