package p419wb;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import lb.C9481b;
import p179jb.InterfaceC9009a;
import p271ob.C9830b;

/* renamed from: wb.c */
/* loaded from: classes2.dex */
public final class C12131c implements InterfaceC9009a {

    /* renamed from: b */
    public static final C9830b.b f32235b = C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a */
    private final C9481b f32236a;

    public C12131c(byte[] bArr) {
        if (!f32235b.mo29502b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f32236a = new C9481b(bArr, true);
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        return this.f32236a.m28198b(C12144p.m38907c(12), bArr, bArr2);
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        return this.f32236a.m28197a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
