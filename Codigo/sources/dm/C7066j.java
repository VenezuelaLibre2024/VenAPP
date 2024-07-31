package dm;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.j */
/* loaded from: classes3.dex */
public final class C7066j implements InterfaceC7080x {

    /* renamed from: a */
    private final InterfaceC7060d f15662a;

    /* renamed from: b */
    private final Inflater f15663b;

    /* renamed from: c */
    private int f15664c;

    /* renamed from: d */
    private boolean f15665d;

    public C7066j(InterfaceC7060d source, Inflater inflater) {
        C9322n.m27781e(source, "source");
        C9322n.m27781e(inflater, "inflater");
        this.f15662a = source;
        this.f15663b = inflater;
    }

    /* renamed from: e */
    private final void m20799e() {
        int i10 = this.f15664c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f15663b.getRemaining();
        this.f15664c -= remaining;
        this.f15662a.skip(remaining);
    }

    /* renamed from: a */
    public final long m20800a(C7056b sink, long j10) {
        C9322n.m27781e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f15665d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            C7075s m20740z0 = sink.m20740z0(1);
            int min = (int) Math.min(j10, 8192 - m20740z0.f15683c);
            m20801b();
            int inflate = this.f15663b.inflate(m20740z0.f15681a, m20740z0.f15683c, min);
            m20799e();
            if (inflate > 0) {
                m20740z0.f15683c += inflate;
                long j11 = inflate;
                sink.m20727j0(sink.size() + j11);
                return j11;
            }
            if (m20740z0.f15682b == m20740z0.f15683c) {
                sink.f15638a = m20740z0.m20836b();
                C7076t.m20842b(m20740z0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: b */
    public final boolean m20801b() {
        if (!this.f15663b.needsInput()) {
            return false;
        }
        if (this.f15662a.mo20695G0()) {
            return true;
        }
        C7075s c7075s = this.f15662a.mo20717c().f15638a;
        C9322n.m27778b(c7075s);
        int i10 = c7075s.f15683c;
        int i11 = c7075s.f15682b;
        int i12 = i10 - i11;
        this.f15664c = i12;
        this.f15663b.setInput(c7075s.f15681a, i11, i12);
        return false;
    }

    @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15665d) {
            return;
        }
        this.f15663b.end();
        this.f15665d = true;
        this.f15662a.close();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: m */
    public C7081y mo20685m() {
        return this.f15662a.mo20685m();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: s1 */
    public long mo20686s1(C7056b sink, long j10) {
        C9322n.m27781e(sink, "sink");
        do {
            long m20800a = m20800a(sink, j10);
            if (m20800a > 0) {
                return m20800a;
            }
            if (this.f15663b.finished() || this.f15663b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f15662a.mo20695G0());
        throw new EOFException("source exhausted prematurely");
    }
}
