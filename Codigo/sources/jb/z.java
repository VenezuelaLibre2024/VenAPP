package jb;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import vb.c0;
import vb.d0;
import vb.i0;
import vb.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a */
    public static final Charset f19882a = Charset.forName("UTF-8");

    public static d0.c a(c0.c cVar) {
        return d0.c.b0().D(cVar.a0().b0()).C(cVar.d0()).B(cVar.c0()).A(cVar.b0()).build();
    }

    public static d0 b(c0 c0Var) {
        d0.b B = d0.b0().B(c0Var.d0());
        Iterator<c0.c> it = c0Var.c0().iterator();
        while (it.hasNext()) {
            B.A(a(it.next()));
        }
        return B.build();
    }

    public static void c(c0.c cVar) {
        if (!cVar.e0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.b0())));
        }
        if (cVar.c0() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.b0())));
        }
        if (cVar.d0() == vb.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.b0())));
        }
    }

    public static void d(c0 c0Var) {
        int d02 = c0Var.d0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (c0.c cVar : c0Var.c0()) {
            if (cVar.d0() == vb.z.ENABLED) {
                c(cVar);
                if (cVar.b0() == d02) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.a0().a0() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
