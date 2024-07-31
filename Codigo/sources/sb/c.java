package sb;

import java.security.GeneralSecurityException;
import ob.b;
import rb.g;
import rb.i;

/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0370b f25456b = b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final i f25457a;

    public c(i iVar) {
        if (!f25456b.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f25457a = iVar;
    }
}
