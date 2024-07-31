package p179jb;

import java.security.GeneralSecurityException;

/* renamed from: jb.y */
/* loaded from: classes2.dex */
public final class C9033y {

    /* renamed from: a */
    private static final C9033y f21660a = new C9033y();

    private C9033y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9033y m26539a() {
        return f21660a;
    }

    /* renamed from: b */
    public static C9033y m26540b(C9033y c9033y) {
        if (c9033y != null) {
            return c9033y;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
