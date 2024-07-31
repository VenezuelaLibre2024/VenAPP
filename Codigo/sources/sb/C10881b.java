package sb;

import java.security.GeneralSecurityException;
import p271ob.C9830b;
import p332rb.C10668a;
import p332rb.InterfaceC10674g;

/* renamed from: sb.b */
/* loaded from: classes2.dex */
public final class C10881b implements InterfaceC10674g {

    /* renamed from: b */
    private static final C9830b.b f27573b = C9830b.b.ALGORITHM_NOT_FIPS;

    /* renamed from: a */
    private final C10668a f27574a;

    public C10881b(C10668a c10668a) {
        if (!f27573b.mo29502b()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f27574a = c10668a;
    }
}
