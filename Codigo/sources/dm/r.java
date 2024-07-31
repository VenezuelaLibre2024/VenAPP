package dm;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class r implements d {

    /* renamed from: a, reason: collision with root package name */
    public final x f14319a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14320b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14321c;

    public r(x source) {
        kotlin.jvm.internal.n.e(source, "source");
        this.f14319a = source;
        this.f14320b = new b();
    }

    @Override // dm.d
    public boolean G0() {
        if (!this.f14321c) {
            return this.f14320b.G0() && this.f14319a.s1(this.f14320b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // dm.d
    public String L(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        byte b10 = (byte) 10;
        long b11 = b(b10, 0L, j11);
        if (b11 != -1) {
            return em.a.b(this.f14320b, b11);
        }
        if (j11 < Long.MAX_VALUE && g(j11) && this.f14320b.l(j11 - 1) == ((byte) 13) && g(1 + j11) && this.f14320b.l(j11) == b10) {
            return em.a.b(this.f14320b, j11);
        }
        b bVar = new b();
        b bVar2 = this.f14320b;
        bVar2.j(bVar, 0L, Math.min(32, bVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f14320b.size(), j10) + " content=" + bVar.I().r() + (char) 8230);
    }

    @Override // dm.d
    public String U0(Charset charset) {
        kotlin.jvm.internal.n.e(charset, "charset");
        this.f14320b.E0(this.f14319a);
        return this.f14320b.U0(charset);
    }

    @Override // dm.d
    public long Y(v sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        long j10 = 0;
        while (this.f14319a.s1(this.f14320b, 8192L) != -1) {
            long g10 = this.f14320b.g();
            if (g10 > 0) {
                j10 += g10;
                sink.K0(this.f14320b, g10);
            }
        }
        if (this.f14320b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f14320b.size();
        b bVar = this.f14320b;
        sink.K0(bVar, bVar.size());
        return size;
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long j10, long j11) {
        if (!(!this.f14321c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j10 <= j11)) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long q10 = this.f14320b.q(b10, j10, j11);
            if (q10 != -1) {
                return q10;
            }
            long size = this.f14320b.size();
            if (size >= j11 || this.f14319a.s1(this.f14320b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    @Override // dm.d, dm.c
    public b c() {
        return this.f14320b;
    }

    @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14321c) {
            return;
        }
        this.f14321c = true;
        this.f14319a.close();
        this.f14320b.b();
    }

    @Override // dm.d
    public String d0() {
        return L(Long.MAX_VALUE);
    }

    public int e() {
        q0(4L);
        return this.f14320b.R();
    }

    public short f() {
        q0(2L);
        return this.f14320b.S();
    }

    public boolean g(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f14321c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f14320b.size() < j10) {
            if (this.f14319a.s1(this.f14320b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // dm.d
    public byte[] g0(long j10) {
        q0(j10);
        return this.f14320b.g0(j10);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f14321c;
    }

    @Override // dm.x
    public y m() {
        return this.f14319a.m();
    }

    @Override // dm.d
    public int n1(o options) {
        kotlin.jvm.internal.n.e(options, "options");
        if (!(!this.f14321c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int c10 = em.a.c(this.f14320b, options, true);
            if (c10 != -2) {
                if (c10 != -1) {
                    this.f14320b.skip(options.k()[c10].B());
                    return c10;
                }
            } else if (this.f14319a.s1(this.f14320b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // dm.d
    public void q0(long j10) {
        if (!g(j10)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (this.f14320b.size() == 0 && this.f14319a.s1(this.f14320b, 8192L) == -1) {
            return -1;
        }
        return this.f14320b.read(sink);
    }

    @Override // dm.d
    public byte readByte() {
        q0(1L);
        return this.f14320b.readByte();
    }

    @Override // dm.d
    public int readInt() {
        q0(4L);
        return this.f14320b.readInt();
    }

    @Override // dm.d
    public short readShort() {
        q0(2L);
        return this.f14320b.readShort();
    }

    @Override // dm.x
    public long s1(b sink, long j10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f14321c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f14320b.size() == 0 && this.f14319a.s1(this.f14320b, 8192L) == -1) {
            return -1L;
        }
        return this.f14320b.s1(sink, Math.min(j10, this.f14320b.size()));
    }

    @Override // dm.d
    public void skip(long j10) {
        if (!(!this.f14321c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.f14320b.size() == 0 && this.f14319a.s1(this.f14320b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f14320b.size());
            this.f14320b.skip(min);
            j10 -= min;
        }
    }

    @Override // dm.d
    public long t1() {
        byte l10;
        int a10;
        int a11;
        q0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!g(i11)) {
                break;
            }
            l10 = this.f14320b.l(i10);
            if ((l10 < ((byte) 48) || l10 > ((byte) 57)) && ((l10 < ((byte) 97) || l10 > ((byte) 102)) && (l10 < ((byte) 65) || l10 > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            a10 = xk.b.a(16);
            a11 = xk.b.a(a10);
            String num = Integer.toString(l10, a11);
            kotlin.jvm.internal.n.d(num, "toString(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f14320b.t1();
    }

    public String toString() {
        return "buffer(" + this.f14319a + ')';
    }

    @Override // dm.d
    public e w0(long j10) {
        q0(j10);
        return this.f14320b.w0(j10);
    }
}
