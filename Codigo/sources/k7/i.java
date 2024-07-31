package k7;

import java.nio.ByteBuffer;
import t6.u1;
import v6.s0;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private long f20441a;

    /* renamed from: b, reason: collision with root package name */
    private long f20442b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20443c;

    private long a(long j10) {
        return this.f20441a + Math.max(0L, ((this.f20442b - 529) * 1000000) / j10);
    }

    public long b(u1 u1Var) {
        return a(u1Var.K);
    }

    public void c() {
        this.f20441a = 0L;
        this.f20442b = 0L;
        this.f20443c = false;
    }

    public long d(u1 u1Var, w6.g gVar) {
        if (this.f20442b == 0) {
            this.f20441a = gVar.f29681e;
        }
        if (this.f20443c) {
            return gVar.f29681e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) t8.a.e(gVar.f29679c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m10 = s0.m(i10);
        if (m10 != -1) {
            long a10 = a(u1Var.K);
            this.f20442b += m10;
            return a10;
        }
        this.f20443c = true;
        this.f20442b = 0L;
        this.f20441a = gVar.f29681e;
        t8.s.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f29681e;
    }
}
