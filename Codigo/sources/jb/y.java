package jb;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final y f19881a = new y();

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y a() {
        return f19881a;
    }

    public static y b(y yVar) {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
