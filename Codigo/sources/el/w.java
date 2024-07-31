package el;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import zk.h2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f14820a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f14821b;

    /* renamed from: c, reason: collision with root package name */
    public static final h2 f14822c;

    static {
        w wVar = new w();
        f14820a = wVar;
        f14821b = i0.f("kotlinx.coroutines.fast.service.loader", true);
        f14822c = wVar.a();
    }

    private w() {
    }

    private final h2 a() {
        wk.d c10;
        List<v> k10;
        Object next;
        h2 e10;
        try {
            if (f14821b) {
                k10 = l.f14781a.c();
            } else {
                c10 = wk.j.c(ServiceLoader.load(v.class, v.class.getClassLoader()).iterator());
                k10 = wk.l.k(c10);
            }
            Iterator<T> it = k10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c11 = ((v) next).c();
                    do {
                        Object next2 = it.next();
                        int c12 = ((v) next2).c();
                        if (c11 < c12) {
                            next = next2;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            v vVar = (v) next;
            return (vVar == null || (e10 = x.e(vVar, k10)) == null) ? x.b(null, null, 3, null) : e10;
        } catch (Throwable th2) {
            return x.b(th2, null, 2, null);
        }
    }
}
