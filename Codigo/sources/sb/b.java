package sb;

import java.security.GeneralSecurityException;
import ob.b;
import rb.g;

/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0370b f25454b = b.EnumC0370b.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final rb.a f25455a;

    public b(rb.a aVar) {
        if (!f25454b.b()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f25455a = aVar;
    }
}
