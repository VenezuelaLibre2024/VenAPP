package rb;

import java.security.GeneralSecurityException;
import vb.j0;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    public static final String f24915a = new k().d();

    /* renamed from: b */
    @Deprecated
    public static final j0 f24916b;

    /* renamed from: c */
    @Deprecated
    public static final j0 f24917c;

    /* renamed from: d */
    @Deprecated
    public static final j0 f24918d;

    static {
        j0 W = j0.W();
        f24916b = W;
        f24917c = W;
        f24918d = W;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (nb.a.a()) {
            return;
        }
        c.o(true);
    }
}
