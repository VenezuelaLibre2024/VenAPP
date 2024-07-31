package dm;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k implements x {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f14308a;

    /* renamed from: b, reason: collision with root package name */
    private final y f14309b;

    public k(InputStream input, y timeout) {
        kotlin.jvm.internal.n.e(input, "input");
        kotlin.jvm.internal.n.e(timeout, "timeout");
        this.f14308a = input;
        this.f14309b = timeout;
    }

    @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14308a.close();
    }

    @Override // dm.x
    public y m() {
        return this.f14309b;
    }

    @Override // dm.x
    public long s1(b sink, long j10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f14309b.f();
            s z02 = sink.z0(1);
            int read = this.f14308a.read(z02.f14323a, z02.f14325c, (int) Math.min(j10, 8192 - z02.f14325c));
            if (read != -1) {
                z02.f14325c += read;
                long j11 = read;
                sink.j0(sink.size() + j11);
                return j11;
            }
            if (z02.f14324b != z02.f14325c) {
                return -1L;
            }
            sink.f14280a = z02.b();
            t.b(z02);
            return -1L;
        } catch (AssertionError e10) {
            if (l.c(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public String toString() {
        return "source(" + this.f14308a + ')';
    }
}
