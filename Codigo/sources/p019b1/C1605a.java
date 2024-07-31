package p019b1;

import java.nio.ByteBuffer;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C1605a extends C1607c {
    /* renamed from: f */
    public C1605a m8929f(int i10, ByteBuffer byteBuffer) {
        m8930g(i10, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m8930g(int i10, ByteBuffer byteBuffer) {
        m8947c(i10, byteBuffer);
    }

    /* renamed from: h */
    public int m8931h(int i10) {
        int m8946b = m8946b(16);
        if (m8946b != 0) {
            return this.f6868b.getInt(m8948d(m8946b) + (i10 * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m8932i() {
        int m8946b = m8946b(16);
        if (m8946b != 0) {
            return m8949e(m8946b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m8933j() {
        int m8946b = m8946b(6);
        return (m8946b == 0 || this.f6868b.get(m8946b + this.f6867a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m8934k() {
        int m8946b = m8946b(14);
        if (m8946b != 0) {
            return this.f6868b.getShort(m8946b + this.f6867a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m8935l() {
        int m8946b = m8946b(4);
        if (m8946b != 0) {
            return this.f6868b.getInt(m8946b + this.f6867a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m8936m() {
        int m8946b = m8946b(8);
        if (m8946b != 0) {
            return this.f6868b.getShort(m8946b + this.f6867a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m8937n() {
        int m8946b = m8946b(12);
        if (m8946b != 0) {
            return this.f6868b.getShort(m8946b + this.f6867a);
        }
        return (short) 0;
    }
}
