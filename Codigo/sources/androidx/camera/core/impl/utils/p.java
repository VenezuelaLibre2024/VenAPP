package androidx.camera.core.impl.utils;

import h0.c;

/* loaded from: classes.dex */
public class p {
    public static h0.c a(h0.c cVar, h0.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        c.a b10 = c.a.b(cVar);
        if (cVar2.b() != null) {
            b10.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            b10.e(cVar2.d());
        }
        cVar2.c();
        if (cVar2.a() != 0) {
            b10.c(cVar2.a());
        }
        return b10.a();
    }
}
