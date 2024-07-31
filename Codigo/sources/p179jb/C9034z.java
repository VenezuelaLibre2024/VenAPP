package p179jb;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import p400vb.C11790c0;
import p400vb.C11792d0;
import p400vb.C11821y;
import p400vb.EnumC11802i0;
import p400vb.EnumC11822z;

/* renamed from: jb.z */
/* loaded from: classes2.dex */
final class C9034z {

    /* renamed from: a */
    public static final Charset f21661a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static C11792d0.c m26541a(C11790c0.c cVar) {
        return C11792d0.c.m37389b0().m37398D(cVar.m37350a0().m37657b0()).m37397C(cVar.m37353d0()).m37396B(cVar.m37352c0()).m37395A(cVar.m37351b0()).build();
    }

    /* renamed from: b */
    public static C11792d0 m26542b(C11790c0 c11790c0) {
        C11792d0.b m37383B = C11792d0.m37379b0().m37383B(c11790c0.m37334d0());
        Iterator<C11790c0.c> it = c11790c0.m37333c0().iterator();
        while (it.hasNext()) {
            m37383B.m37382A(m26541a(it.next()));
        }
        return m37383B.build();
    }

    /* renamed from: c */
    public static void m26543c(C11790c0.c cVar) {
        if (!cVar.m37354e0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.m37351b0())));
        }
        if (cVar.m37352c0() == EnumC11802i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.m37351b0())));
        }
        if (cVar.m37353d0() == EnumC11822z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.m37351b0())));
        }
    }

    /* renamed from: d */
    public static void m26544d(C11790c0 c11790c0) {
        int m37334d0 = c11790c0.m37334d0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C11790c0.c cVar : c11790c0.m37333c0()) {
            if (cVar.m37353d0() == EnumC11822z.ENABLED) {
                m26543c(cVar);
                if (cVar.m37351b0() == m37334d0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.m37350a0().m37656a0() != C11821y.c.ASYMMETRIC_PUBLIC) {
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
