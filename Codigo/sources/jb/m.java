package jb;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class m {
    public static l a(String str) {
        l lVar = x.i().get(str);
        if (lVar != null) {
            return lVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
