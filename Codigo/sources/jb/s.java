package jb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<r> f19855a = new CopyOnWriteArrayList<>();

    public static r a(String str) {
        Iterator<r> it = f19855a.iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
