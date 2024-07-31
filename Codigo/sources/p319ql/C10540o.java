package p319ql;

import dm.C7061e;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.o */
/* loaded from: classes3.dex */
public final class C10540o {

    /* renamed from: a */
    public static final C10540o f26432a = new C10540o();

    private C10540o() {
    }

    /* renamed from: a */
    public static final String m31792a(String username, String password, Charset charset) {
        C9322n.m27781e(username, "username");
        C9322n.m27781e(password, "password");
        C9322n.m27781e(charset, "charset");
        return C9322n.m27787k("Basic ", C7061e.f15649d.m20780b(username + ':' + password, charset).mo20762b());
    }
}
