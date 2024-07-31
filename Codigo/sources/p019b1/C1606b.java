package p019b1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: b1.b */
/* loaded from: classes.dex */
public final class C1606b extends C1607c {
    /* renamed from: h */
    public static C1606b m8938h(ByteBuffer byteBuffer) {
        return m8939i(byteBuffer, new C1606b());
    }

    /* renamed from: i */
    public static C1606b m8939i(ByteBuffer byteBuffer, C1606b c1606b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c1606b.m8940f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C1606b m8940f(int i10, ByteBuffer byteBuffer) {
        m8941g(i10, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m8941g(int i10, ByteBuffer byteBuffer) {
        m8947c(i10, byteBuffer);
    }

    /* renamed from: j */
    public C1605a m8942j(C1605a c1605a, int i10) {
        int m8946b = m8946b(6);
        if (m8946b != 0) {
            return c1605a.m8929f(m8945a(m8948d(m8946b) + (i10 * 4)), this.f6868b);
        }
        return null;
    }

    /* renamed from: k */
    public int m8943k() {
        int m8946b = m8946b(6);
        if (m8946b != 0) {
            return m8949e(m8946b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m8944l() {
        int m8946b = m8946b(4);
        if (m8946b != 0) {
            return this.f6868b.getInt(m8946b + this.f6867a);
        }
        return 0;
    }
}
