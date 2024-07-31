package dm;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class i implements x {

    /* renamed from: a, reason: collision with root package name */
    private byte f14299a;

    /* renamed from: b, reason: collision with root package name */
    private final r f14300b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f14301c;

    /* renamed from: d, reason: collision with root package name */
    private final j f14302d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f14303e;

    public i(x source) {
        kotlin.jvm.internal.n.e(source, "source");
        r rVar = new r(source);
        this.f14300b = rVar;
        Inflater inflater = new Inflater(true);
        this.f14301c = inflater;
        this.f14302d = new j(rVar, inflater);
        this.f14303e = new CRC32();
    }

    private final void a(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        kotlin.jvm.internal.n.d(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() {
        this.f14300b.q0(10L);
        byte l10 = this.f14300b.f14320b.l(3L);
        boolean z10 = ((l10 >> 1) & 1) == 1;
        if (z10) {
            f(this.f14300b.f14320b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f14300b.readShort());
        this.f14300b.skip(8L);
        if (((l10 >> 2) & 1) == 1) {
            this.f14300b.q0(2L);
            if (z10) {
                f(this.f14300b.f14320b, 0L, 2L);
            }
            long S = this.f14300b.f14320b.S();
            this.f14300b.q0(S);
            if (z10) {
                f(this.f14300b.f14320b, 0L, S);
            }
            this.f14300b.skip(S);
        }
        if (((l10 >> 3) & 1) == 1) {
            long a10 = this.f14300b.a((byte) 0);
            if (a10 == -1) {
                throw new EOFException();
            }
            if (z10) {
                f(this.f14300b.f14320b, 0L, a10 + 1);
            }
            this.f14300b.skip(a10 + 1);
        }
        if (((l10 >> 4) & 1) == 1) {
            long a11 = this.f14300b.a((byte) 0);
            if (a11 == -1) {
                throw new EOFException();
            }
            if (z10) {
                f(this.f14300b.f14320b, 0L, a11 + 1);
            }
            this.f14300b.skip(a11 + 1);
        }
        if (z10) {
            a("FHCRC", this.f14300b.f(), (short) this.f14303e.getValue());
            this.f14303e.reset();
        }
    }

    private final void e() {
        a("CRC", this.f14300b.e(), (int) this.f14303e.getValue());
        a("ISIZE", this.f14300b.e(), (int) this.f14301c.getBytesWritten());
    }

    private final void f(b bVar, long j10, long j11) {
        s sVar = bVar.f14280a;
        while (true) {
            kotlin.jvm.internal.n.b(sVar);
            int i10 = sVar.f14325c;
            int i11 = sVar.f14324b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            sVar = sVar.f14328f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(sVar.f14325c - r6, j11);
            this.f14303e.update(sVar.f14323a, (int) (sVar.f14324b + j10), min);
            j11 -= min;
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
            j10 = 0;
        }
    }

    @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14302d.close();
    }

    @Override // dm.x
    public y m() {
        return this.f14300b.m();
    }

    @Override // dm.x
    public long s1(b sink, long j10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f14299a == 0) {
            b();
            this.f14299a = (byte) 1;
        }
        if (this.f14299a == 1) {
            long size = sink.size();
            long s12 = this.f14302d.s1(sink, j10);
            if (s12 != -1) {
                f(sink, size, s12);
                return s12;
            }
            this.f14299a = (byte) 2;
        }
        if (this.f14299a == 2) {
            e();
            this.f14299a = (byte) 3;
            if (!this.f14300b.G0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
