package p419wb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import lb.C9487h;
import p179jb.InterfaceC9009a;

/* renamed from: wb.s */
/* loaded from: classes2.dex */
public final class C12147s implements InterfaceC9009a {

    /* renamed from: a */
    private final C9487h f32290a;

    public C12147s(byte[] bArr) {
        this.f32290a = new C9487h(bArr);
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] m38907c = C12144p.m38907c(24);
        allocate.put(m38907c);
        this.f32290a.mo28207b(allocate, m38907c, bArr, bArr2);
        return allocate.array();
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f32290a.mo28206a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
