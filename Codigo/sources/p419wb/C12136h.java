package p419wb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p179jb.InterfaceC9009a;
import p179jb.InterfaceC9028t;

/* renamed from: wb.h */
/* loaded from: classes2.dex */
public final class C12136h implements InterfaceC9009a {

    /* renamed from: a */
    private final InterfaceC12140l f32261a;

    /* renamed from: b */
    private final InterfaceC9028t f32262b;

    /* renamed from: c */
    private final int f32263c;

    public C12136h(InterfaceC12140l interfaceC12140l, InterfaceC9028t interfaceC9028t, int i10) {
        this.f32261a = interfaceC12140l;
        this.f32262b = interfaceC9028t;
        this.f32263c = i10;
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        byte[] mo38862a = this.f32261a.mo38862a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return C12134f.m38881a(mo38862a, this.f32262b.mo26496b(C12134f.m38881a(bArr2, mo38862a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f32263c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f32263c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f32262b.mo26495a(copyOfRange2, C12134f.m38881a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f32261a.mo38863b(copyOfRange);
    }
}
