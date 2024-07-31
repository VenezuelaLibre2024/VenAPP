package pb;

import java.security.GeneralSecurityException;
import vb.j0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22948a = new a().d();

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final j0 f22949b = j0.W();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final j0 f22950c = j0.W();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        c.e();
        if (nb.a.a()) {
            return;
        }
        a.m(true);
    }
}
