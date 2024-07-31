package kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import kb.a0;

/* loaded from: classes2.dex */
public final class y extends b {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f20645a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f20646b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f20647c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f20648d;

    private y(a0 a0Var, xb.b bVar, xb.a aVar, Integer num) {
        this.f20645a = a0Var;
        this.f20646b = bVar;
        this.f20647c = aVar;
        this.f20648d = num;
    }

    public static y a(a0.a aVar, xb.b bVar, Integer num) {
        a0.a aVar2 = a0.a.f20535d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            a0 a10 = a0.a(aVar);
            return new y(a10, bVar, b(a10, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static xb.a b(a0 a0Var, Integer num) {
        if (a0Var.b() == a0.a.f20535d) {
            return xb.a.a(new byte[0]);
        }
        if (a0Var.b() == a0.a.f20534c) {
            return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (a0Var.b() == a0.a.f20533b) {
            return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + a0Var.b());
    }
}
