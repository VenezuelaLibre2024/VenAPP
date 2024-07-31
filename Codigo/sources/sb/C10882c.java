package sb;

import java.security.GeneralSecurityException;
import p271ob.C9830b;
import p332rb.C10676i;
import p332rb.InterfaceC10674g;

/* renamed from: sb.c */
/* loaded from: classes2.dex */
public final class C10882c implements InterfaceC10674g {

    /* renamed from: b */
    private static final C9830b.b f27575b = C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a */
    private final C10676i f27576a;

    public C10882c(C10676i c10676i) {
        if (!f27575b.mo29502b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f27576a = c10676i;
    }
}
