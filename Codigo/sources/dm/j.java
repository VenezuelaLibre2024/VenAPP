package dm;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class j implements x {

    /* renamed from: a, reason: collision with root package name */
    private final d f14304a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f14305b;

    /* renamed from: c, reason: collision with root package name */
    private int f14306c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14307d;

    public j(d source, Inflater inflater) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(inflater, "inflater");
        this.f14304a = source;
        this.f14305b = inflater;
    }

    private final void e() {
        int i10 = this.f14306c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f14305b.getRemaining();
        this.f14306c -= remaining;
        this.f14304a.skip(remaining);
    }

    public final long a(b sink, long j10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f14307d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            s z02 = sink.z0(1);
            int min = (int) Math.min(j10, 8192 - z02.f14325c);
            b();
            int inflate = this.f14305b.inflate(z02.f14323a, z02.f14325c, min);
            e();
            if (inflate > 0) {
                z02.f14325c += inflate;
                long j11 = inflate;
                sink.j0(sink.size() + j11);
                return j11;
            }
            if (z02.f14324b == z02.f14325c) {
                sink.f14280a = z02.b();
                t.b(z02);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f14305b.needsInput()) {
            return false;
        }
        if (this.f14304a.G0()) {
            return true;
        }
        s sVar = this.f14304a.c().f14280a;
        kotlin.jvm.internal.n.b(sVar);
        int i10 = sVar.f14325c;
        int i11 = sVar.f14324b;
        int i12 = i10 - i11;
        this.f14306c = i12;
        this.f14305b.setInput(sVar.f14323a, i11, i12);
        return false;
    }

    @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14307d) {
            return;
        }
        this.f14305b.end();
        this.f14307d = true;
        this.f14304a.close();
    }

    @Override // dm.x
    public y m() {
        return this.f14304a.m();
    }

    @Override // dm.x
    public long s1(b sink, long j10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        do {
            long a10 = a(sink, j10);
            if (a10 > 0) {
                return a10;
            }
            if (this.f14305b.finished() || this.f14305b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f14304a.G0());
        throw new EOFException("source exhausted prematurely");
    }
}
