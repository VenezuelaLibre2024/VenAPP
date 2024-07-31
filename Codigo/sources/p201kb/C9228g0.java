package p201kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p201kb.C9232i0;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: kb.g0 */
/* loaded from: classes2.dex */
public final class C9228g0 extends AbstractC9217b {

    /* renamed from: a */
    private final C9232i0 f22384a;

    /* renamed from: b */
    private final C12414b f22385b;

    /* renamed from: c */
    private final C12413a f22386c;

    /* renamed from: d */
    private final Integer f22387d;

    private C9228g0(C9232i0 c9232i0, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f22384a = c9232i0;
        this.f22385b = c12414b;
        this.f22386c = c12413a;
        this.f22387d = num;
    }

    /* renamed from: a */
    public static C9228g0 m27458a(C9232i0.a aVar, C12414b c12414b, Integer num) {
        C9232i0.a aVar2 = C9232i0.a.f22405d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c12414b.m40071b() == 32) {
            C9232i0 m27489a = C9232i0.m27489a(aVar);
            return new C9228g0(m27489a, c12414b, m27459b(m27489a, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c12414b.m40071b());
    }

    /* renamed from: b */
    private static C12413a m27459b(C9232i0 c9232i0, Integer num) {
        if (c9232i0.m27490b() == C9232i0.a.f22405d) {
            return C12413a.m40067a(new byte[0]);
        }
        if (c9232i0.m27490b() == C9232i0.a.f22404c) {
            return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (c9232i0.m27490b() == C9232i0.a.f22403b) {
            return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + c9232i0.m27490b());
    }
}
