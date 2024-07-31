package p201kb;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p400vb.C11786a0;

/* renamed from: kb.e0 */
/* loaded from: classes2.dex */
public final class C9224e0 implements InterfaceC9009a {

    /* renamed from: c */
    private static final byte[] f22372c = new byte[0];

    /* renamed from: a */
    private final C11786a0 f22373a;

    /* renamed from: b */
    private final InterfaceC9009a f22374b;

    public C9224e0(C11786a0 c11786a0, InterfaceC9009a interfaceC9009a) {
        this.f22373a = c11786a0;
        this.f22374b = interfaceC9009a;
    }

    /* renamed from: c */
    private byte[] m27434c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        byte[] mo15293h = C9032x.m26533j(this.f22373a).mo15293h();
        return m27434c(this.f22374b.mo26424a(mo15293h, f22372c), ((InterfaceC9009a) C9032x.m26529f(this.f22373a.m37298b0(), mo15293h, InterfaceC9009a.class)).mo26424a(bArr, bArr2));
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((InterfaceC9009a) C9032x.m26529f(this.f22373a.m37298b0(), this.f22374b.mo26425b(bArr3, f22372c), InterfaceC9009a.class)).mo26425b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
