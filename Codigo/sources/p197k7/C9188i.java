package p197k7;

import java.nio.ByteBuffer;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11173s;
import p396v6.C11668s0;
import p414w6.C12082g;

/* renamed from: k7.i */
/* loaded from: classes.dex */
final class C9188i {

    /* renamed from: a */
    private long f22223a;

    /* renamed from: b */
    private long f22224b;

    /* renamed from: c */
    private boolean f22225c;

    /* renamed from: a */
    private long m27249a(long j10) {
        return this.f22223a + Math.max(0L, ((this.f22224b - 529) * 1000000) / j10);
    }

    /* renamed from: b */
    public long m27250b(C11108u1 c11108u1) {
        return m27249a(c11108u1.f28777K);
    }

    /* renamed from: c */
    public void m27251c() {
        this.f22223a = 0L;
        this.f22224b = 0L;
        this.f22225c = false;
    }

    /* renamed from: d */
    public long m27252d(C11108u1 c11108u1, C12082g c12082g) {
        if (this.f22224b == 0) {
            this.f22223a = c12082g.f32144e;
        }
        if (this.f22225c) {
            return c12082g.f32144e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C11137a.m34603e(c12082g.f32142c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m36681m = C11668s0.m36681m(i10);
        if (m36681m != -1) {
            long m27249a = m27249a(c11108u1.f28777K);
            this.f22224b += m36681m;
            return m27249a;
        }
        this.f22225c = true;
        this.f22224b = 0L;
        this.f22223a = c12082g.f32144e;
        C11173s.m34970i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return c12082g.f32144e;
    }
}
