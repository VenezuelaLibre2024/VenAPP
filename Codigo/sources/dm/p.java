package dm;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p implements v {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f14314a;

    /* renamed from: b, reason: collision with root package name */
    private final y f14315b;

    public p(OutputStream out, y timeout) {
        kotlin.jvm.internal.n.e(out, "out");
        kotlin.jvm.internal.n.e(timeout, "timeout");
        this.f14314a = out;
        this.f14315b = timeout;
    }

    @Override // dm.v
    public void K0(b source, long j10) {
        kotlin.jvm.internal.n.e(source, "source");
        c0.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f14315b.f();
            s sVar = source.f14280a;
            kotlin.jvm.internal.n.b(sVar);
            int min = (int) Math.min(j10, sVar.f14325c - sVar.f14324b);
            this.f14314a.write(sVar.f14323a, sVar.f14324b, min);
            sVar.f14324b += min;
            long j11 = min;
            j10 -= j11;
            source.j0(source.size() - j11);
            if (sVar.f14324b == sVar.f14325c) {
                source.f14280a = sVar.b();
                t.b(sVar);
            }
        }
    }

    @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14314a.close();
    }

    @Override // dm.v, java.io.Flushable
    public void flush() {
        this.f14314a.flush();
    }

    @Override // dm.v
    public y m() {
        return this.f14315b;
    }

    public String toString() {
        return "sink(" + this.f14314a + ')';
    }
}
