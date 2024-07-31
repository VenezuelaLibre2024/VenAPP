package p179jb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: jb.s */
/* loaded from: classes2.dex */
public final class C9027s {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<InterfaceC9026r> f21634a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static InterfaceC9026r m26494a(String str) {
        Iterator<InterfaceC9026r> it = f21634a.iterator();
        while (it.hasNext()) {
            InterfaceC9026r next = it.next();
            if (next.mo26492a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
