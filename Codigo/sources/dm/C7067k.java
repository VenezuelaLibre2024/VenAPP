package dm;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dm.k */
/* loaded from: classes3.dex */
public class C7067k implements InterfaceC7080x {

    /* renamed from: a */
    private final InputStream f15666a;

    /* renamed from: b */
    private final C7081y f15667b;

    public C7067k(InputStream input, C7081y timeout) {
        C9322n.m27781e(input, "input");
        C9322n.m27781e(timeout, "timeout");
        this.f15666a = input;
        this.f15667b = timeout;
    }

    @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15666a.close();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: m */
    public C7081y mo20685m() {
        return this.f15667b;
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: s1 */
    public long mo20686s1(C7056b sink, long j10) {
        C9322n.m27781e(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f15667b.mo20791f();
            C7075s m20740z0 = sink.m20740z0(1);
            int read = this.f15666a.read(m20740z0.f15681a, m20740z0.f15683c, (int) Math.min(j10, 8192 - m20740z0.f15683c));
            if (read != -1) {
                m20740z0.f15683c += read;
                long j11 = read;
                sink.m20727j0(sink.size() + j11);
                return j11;
            }
            if (m20740z0.f15682b != m20740z0.f15683c) {
                return -1L;
            }
            sink.f15638a = m20740z0.m20836b();
            C7076t.m20842b(m20740z0);
            return -1L;
        } catch (AssertionError e10) {
            if (C7068l.m20804c(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public String toString() {
        return "source(" + this.f15666a + ')';
    }
}
