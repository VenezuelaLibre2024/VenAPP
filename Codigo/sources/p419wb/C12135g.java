package p419wb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import lb.C9484e;
import p179jb.InterfaceC9009a;

/* renamed from: wb.g */
/* loaded from: classes2.dex */
public final class C12135g implements InterfaceC9009a {

    /* renamed from: a */
    private final C9484e f32260a;

    public C12135g(byte[] bArr) {
        this.f32260a = new C9484e(bArr);
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] m38907c = C12144p.m38907c(12);
        allocate.put(m38907c);
        this.f32260a.mo28207b(allocate, m38907c, bArr, bArr2);
        return allocate.array();
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f32260a.mo28206a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
