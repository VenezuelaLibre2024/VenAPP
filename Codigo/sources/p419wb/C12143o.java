package p419wb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p179jb.InterfaceC9028t;
import p380ub.InterfaceC11528a;

/* renamed from: wb.o */
/* loaded from: classes2.dex */
public class C12143o implements InterfaceC9028t {

    /* renamed from: a */
    private final InterfaceC11528a f32285a;

    /* renamed from: b */
    private final int f32286b;

    public C12143o(InterfaceC11528a interfaceC11528a, int i10) {
        this.f32285a = interfaceC11528a;
        this.f32286b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC11528a.mo36088a(new byte[0], i10);
    }

    @Override // p179jb.InterfaceC9028t
    /* renamed from: a */
    public void mo26495a(byte[] bArr, byte[] bArr2) {
        if (!C12134f.m38882b(mo26496b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // p179jb.InterfaceC9028t
    /* renamed from: b */
    public byte[] mo26496b(byte[] bArr) {
        return this.f32285a.mo36088a(bArr, this.f32286b);
    }
}
