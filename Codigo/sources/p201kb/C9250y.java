package p201kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p201kb.C9216a0;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: kb.y */
/* loaded from: classes2.dex */
public final class C9250y extends AbstractC9217b {

    /* renamed from: a */
    private final C9216a0 f22467a;

    /* renamed from: b */
    private final C12414b f22468b;

    /* renamed from: c */
    private final C12413a f22469c;

    /* renamed from: d */
    private final Integer f22470d;

    private C9250y(C9216a0 c9216a0, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f22467a = c9216a0;
        this.f22468b = c12414b;
        this.f22469c = c12413a;
        this.f22470d = num;
    }

    /* renamed from: a */
    public static C9250y m27562a(C9216a0.a aVar, C12414b c12414b, Integer num) {
        C9216a0.a aVar2 = C9216a0.a.f22357d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c12414b.m40071b() == 32) {
            C9216a0 m27405a = C9216a0.m27405a(aVar);
            return new C9250y(m27405a, c12414b, m27563b(m27405a, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c12414b.m40071b());
    }

    /* renamed from: b */
    private static C12413a m27563b(C9216a0 c9216a0, Integer num) {
        if (c9216a0.m27406b() == C9216a0.a.f22357d) {
            return C12413a.m40067a(new byte[0]);
        }
        if (c9216a0.m27406b() == C9216a0.a.f22356c) {
            return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (c9216a0.m27406b() == C9216a0.a.f22355b) {
            return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + c9216a0.m27406b());
    }
}
