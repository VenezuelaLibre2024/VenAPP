package kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import kb.i0;

/* loaded from: classes2.dex */
public final class g0 extends b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f20562a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f20563b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f20564c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f20565d;

    private g0(i0 i0Var, xb.b bVar, xb.a aVar, Integer num) {
        this.f20562a = i0Var;
        this.f20563b = bVar;
        this.f20564c = aVar;
        this.f20565d = num;
    }

    public static g0 a(i0.a aVar, xb.b bVar, Integer num) {
        i0.a aVar2 = i0.a.f20583d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            i0 a10 = i0.a(aVar);
            return new g0(a10, bVar, b(a10, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static xb.a b(i0 i0Var, Integer num) {
        if (i0Var.b() == i0.a.f20583d) {
            return xb.a.a(new byte[0]);
        }
        if (i0Var.b() == i0.a.f20582c) {
            return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i0Var.b() == i0.a.f20581b) {
            return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i0Var.b());
    }
}
