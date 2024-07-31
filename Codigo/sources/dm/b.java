package dm;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class b implements d, c, Cloneable, ByteChannel {

    /* renamed from: a */
    public s f14280a;

    /* renamed from: b */
    private long f14281b;

    /* loaded from: classes3.dex */
    public static final class a implements Closeable {

        /* renamed from: a */
        public b f14282a;

        /* renamed from: b */
        private s f14283b;

        /* renamed from: d */
        public byte[] f14285d;

        /* renamed from: c */
        public long f14284c = -1;

        /* renamed from: e */
        public int f14286e = -1;

        /* renamed from: f */
        public int f14287f = -1;

        public final void a(s sVar) {
            this.f14283b = sVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f14282a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f14282a = null;
            a(null);
            this.f14284c = -1L;
            this.f14285d = null;
            this.f14286e = -1;
            this.f14287f = -1;
        }
    }

    /* renamed from: dm.b$b */
    /* loaded from: classes3.dex */
    public static final class C0218b extends OutputStream {
        C0218b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return b.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            b.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            kotlin.jvm.internal.n.e(data, "data");
            b.this.write(data, i10, i11);
        }
    }

    public long B(e targetBytes, long j10) {
        int i10;
        kotlin.jvm.internal.n.e(targetBytes, "targetBytes");
        long j11 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        s sVar = this.f14280a;
        if (sVar == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j11 = size();
            while (j11 > j10) {
                sVar = sVar.f14329g;
                kotlin.jvm.internal.n.b(sVar);
                j11 -= sVar.f14325c - sVar.f14324b;
            }
            if (targetBytes.B() == 2) {
                byte m10 = targetBytes.m(0);
                byte m11 = targetBytes.m(1);
                while (j11 < size()) {
                    byte[] bArr = sVar.f14323a;
                    i10 = (int) ((sVar.f14324b + j10) - j11);
                    int i11 = sVar.f14325c;
                    while (i10 < i11) {
                        byte b10 = bArr[i10];
                        if (b10 != m10 && b10 != m11) {
                            i10++;
                        }
                    }
                    j11 += sVar.f14325c - sVar.f14324b;
                    sVar = sVar.f14328f;
                    kotlin.jvm.internal.n.b(sVar);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] s10 = targetBytes.s();
            while (j11 < size()) {
                byte[] bArr2 = sVar.f14323a;
                i10 = (int) ((sVar.f14324b + j10) - j11);
                int i12 = sVar.f14325c;
                while (i10 < i12) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : s10) {
                        if (b11 != b12) {
                        }
                    }
                    i10++;
                }
                j11 += sVar.f14325c - sVar.f14324b;
                sVar = sVar.f14328f;
                kotlin.jvm.internal.n.b(sVar);
                j10 = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = (sVar.f14325c - sVar.f14324b) + j11;
            if (j12 > j10) {
                break;
            }
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
            j11 = j12;
        }
        if (targetBytes.B() == 2) {
            byte m12 = targetBytes.m(0);
            byte m13 = targetBytes.m(1);
            while (j11 < size()) {
                byte[] bArr3 = sVar.f14323a;
                i10 = (int) ((sVar.f14324b + j10) - j11);
                int i13 = sVar.f14325c;
                while (i10 < i13) {
                    byte b13 = bArr3[i10];
                    if (b13 != m12 && b13 != m13) {
                        i10++;
                    }
                }
                j11 += sVar.f14325c - sVar.f14324b;
                sVar = sVar.f14328f;
                kotlin.jvm.internal.n.b(sVar);
                j10 = j11;
            }
            return -1L;
        }
        byte[] s11 = targetBytes.s();
        while (j11 < size()) {
            byte[] bArr4 = sVar.f14323a;
            i10 = (int) ((sVar.f14324b + j10) - j11);
            int i14 = sVar.f14325c;
            while (i10 < i14) {
                byte b14 = bArr4[i10];
                for (byte b15 : s11) {
                    if (b14 != b15) {
                    }
                }
                i10++;
            }
            j11 += sVar.f14325c - sVar.f14324b;
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
            j10 = j11;
        }
        return -1L;
        return (i10 - sVar.f14324b) + j11;
    }

    @Override // dm.c
    /* renamed from: B0 */
    public b b0(e byteString) {
        kotlin.jvm.internal.n.e(byteString, "byteString");
        byteString.G(this, 0, byteString.B());
        return this;
    }

    @Override // dm.c
    /* renamed from: D0 */
    public b write(byte[] source) {
        kotlin.jvm.internal.n.e(source, "source");
        return write(source, 0, source.length);
    }

    public OutputStream E() {
        return new C0218b();
    }

    @Override // dm.c
    public long E0(x source) {
        kotlin.jvm.internal.n.e(source, "source");
        long j10 = 0;
        while (true) {
            long s12 = source.s1(this, 8192L);
            if (s12 == -1) {
                return j10;
            }
            j10 += s12;
        }
    }

    @Override // dm.c
    /* renamed from: F0 */
    public b write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.n.e(source, "source");
        long j10 = i11;
        c0.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            s z02 = z0(1);
            int min = Math.min(i12 - i10, 8192 - z02.f14325c);
            int i13 = i10 + min;
            dk.l.d(source, z02.f14323a, z02.f14325c, i10, i13);
            z02.f14325c += min;
            i10 = i13;
        }
        j0(size() + j10);
        return this;
    }

    @Override // dm.d
    public boolean G0() {
        return this.f14281b == 0;
    }

    public byte[] H() {
        return g0(size());
    }

    public e I() {
        return w0(size());
    }

    @Override // dm.c
    /* renamed from: I0 */
    public b writeByte(int i10) {
        s z02 = z0(1);
        byte[] bArr = z02.f14323a;
        int i11 = z02.f14325c;
        z02.f14325c = i11 + 1;
        bArr[i11] = (byte) i10;
        j0(size() + 1);
        return this;
    }

    @Override // dm.c
    /* renamed from: J0 */
    public b s0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return T("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        s z02 = z0(i10);
        byte[] bArr = z02.f14323a;
        int i11 = z02.f14325c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = em.a.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = (byte) 45;
        }
        z02.f14325c += i10;
        j0(size() + i10);
        return this;
    }

    @Override // dm.v
    public void K0(b source, long j10) {
        s sVar;
        kotlin.jvm.internal.n.e(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        c0.b(source.size(), 0L, j10);
        while (j10 > 0) {
            s sVar2 = source.f14280a;
            kotlin.jvm.internal.n.b(sVar2);
            int i10 = sVar2.f14325c;
            kotlin.jvm.internal.n.b(source.f14280a);
            if (j10 < i10 - r2.f14324b) {
                s sVar3 = this.f14280a;
                if (sVar3 != null) {
                    kotlin.jvm.internal.n.b(sVar3);
                    sVar = sVar3.f14329g;
                } else {
                    sVar = null;
                }
                if (sVar != null && sVar.f14327e) {
                    if ((sVar.f14325c + j10) - (sVar.f14326d ? 0 : sVar.f14324b) <= 8192) {
                        s sVar4 = source.f14280a;
                        kotlin.jvm.internal.n.b(sVar4);
                        sVar4.f(sVar, (int) j10);
                        source.j0(source.size() - j10);
                        j0(size() + j10);
                        return;
                    }
                }
                s sVar5 = source.f14280a;
                kotlin.jvm.internal.n.b(sVar5);
                source.f14280a = sVar5.e((int) j10);
            }
            s sVar6 = source.f14280a;
            kotlin.jvm.internal.n.b(sVar6);
            long j11 = sVar6.f14325c - sVar6.f14324b;
            source.f14280a = sVar6.b();
            s sVar7 = this.f14280a;
            if (sVar7 == null) {
                this.f14280a = sVar6;
                sVar6.f14329g = sVar6;
                sVar6.f14328f = sVar6;
            } else {
                kotlin.jvm.internal.n.b(sVar7);
                s sVar8 = sVar7.f14329g;
                kotlin.jvm.internal.n.b(sVar8);
                sVar8.c(sVar6).a();
            }
            source.j0(source.size() - j11);
            j0(size() + j11);
            j10 -= j11;
        }
    }

    @Override // dm.d
    public String L(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        byte b10 = (byte) 10;
        long q10 = q(b10, 0L, j11);
        if (q10 != -1) {
            return em.a.b(this, q10);
        }
        if (j11 < size() && l(j11 - 1) == ((byte) 13) && l(j11) == b10) {
            return em.a.b(this, j11);
        }
        b bVar = new b();
        j(bVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + bVar.I().r() + (char) 8230);
    }

    @Override // dm.c
    /* renamed from: L0 */
    public b Z0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        s z02 = z0(i10);
        byte[] bArr = z02.f14323a;
        int i11 = z02.f14325c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = em.a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        z02.f14325c += i10;
        j0(size() + i10);
        return this;
    }

    public void O(byte[] sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int read = read(sink, i10, sink.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    public int R() {
        return c0.f(readInt());
    }

    public short S() {
        return c0.g(readShort());
    }

    @Override // dm.c
    /* renamed from: T0 */
    public b writeInt(int i10) {
        s z02 = z0(4);
        byte[] bArr = z02.f14323a;
        int i11 = z02.f14325c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        z02.f14325c = i14 + 1;
        j0(size() + 4);
        return this;
    }

    public String U(long j10, Charset charset) {
        kotlin.jvm.internal.n.e(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f14281b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        s sVar = this.f14280a;
        kotlin.jvm.internal.n.b(sVar);
        int i10 = sVar.f14324b;
        if (i10 + j10 > sVar.f14325c) {
            return new String(g0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(sVar.f14323a, i10, i11, charset);
        int i12 = sVar.f14324b + i11;
        sVar.f14324b = i12;
        this.f14281b -= j10;
        if (i12 == sVar.f14325c) {
            this.f14280a = sVar.b();
            t.b(sVar);
        }
        return str;
    }

    @Override // dm.d
    public String U0(Charset charset) {
        kotlin.jvm.internal.n.e(charset, "charset");
        return U(this.f14281b, charset);
    }

    @Override // dm.c
    /* renamed from: W0 */
    public b writeShort(int i10) {
        s z02 = z0(2);
        byte[] bArr = z02.f14323a;
        int i11 = z02.f14325c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        z02.f14325c = i12 + 1;
        j0(size() + 2);
        return this;
    }

    @Override // dm.d
    public long Y(v sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.K0(this, size);
        }
        return size;
    }

    public b a() {
        return this;
    }

    public b a1(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.n.e(string, "string");
        kotlin.jvm.internal.n.e(charset, "charset");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.n.a(charset, xk.d.f31393b)) {
            return j1(string, i10, i11);
        }
        String substring = string.substring(i10, i11);
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.n.d(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    public final void b() {
        skip(size());
    }

    public final b b1(OutputStream out, long j10) {
        kotlin.jvm.internal.n.e(out, "out");
        c0.b(this.f14281b, 0L, j10);
        s sVar = this.f14280a;
        while (j10 > 0) {
            kotlin.jvm.internal.n.b(sVar);
            int min = (int) Math.min(j10, sVar.f14325c - sVar.f14324b);
            out.write(sVar.f14323a, sVar.f14324b, min);
            int i10 = sVar.f14324b + min;
            sVar.f14324b = i10;
            long j11 = min;
            this.f14281b -= j11;
            j10 -= j11;
            if (i10 == sVar.f14325c) {
                s b10 = sVar.b();
                this.f14280a = b10;
                t.b(sVar);
                sVar = b10;
            }
        }
        return this;
    }

    @Override // dm.d, dm.c
    public b c() {
        return this;
    }

    @Override // dm.c
    /* renamed from: c1 */
    public b T(String string) {
        kotlin.jvm.internal.n.e(string, "string");
        return j1(string, 0, string.length());
    }

    @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // dm.d
    public String d0() {
        return L(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public b clone() {
        return i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() == bVar.size()) {
                if (size() == 0) {
                    return true;
                }
                s sVar = this.f14280a;
                kotlin.jvm.internal.n.b(sVar);
                s sVar2 = bVar.f14280a;
                kotlin.jvm.internal.n.b(sVar2);
                int i10 = sVar.f14324b;
                int i11 = sVar2.f14324b;
                long j10 = 0;
                while (j10 < size()) {
                    long min = Math.min(sVar.f14325c - i10, sVar2.f14325c - i11);
                    long j11 = 0;
                    while (j11 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (sVar.f14323a[i10] == sVar2.f14323a[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == sVar.f14325c) {
                        sVar = sVar.f14328f;
                        kotlin.jvm.internal.n.b(sVar);
                        i10 = sVar.f14324b;
                    }
                    if (i11 == sVar2.f14325c) {
                        sVar2 = sVar2.f14328f;
                        kotlin.jvm.internal.n.b(sVar2);
                        i11 = sVar2.f14324b;
                    }
                    j10 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // dm.c, dm.v, java.io.Flushable
    public void flush() {
    }

    public final long g() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        s sVar = this.f14280a;
        kotlin.jvm.internal.n.b(sVar);
        s sVar2 = sVar.f14329g;
        kotlin.jvm.internal.n.b(sVar2);
        if (sVar2.f14325c < 8192 && sVar2.f14327e) {
            size -= r3 - sVar2.f14324b;
        }
        return size;
    }

    @Override // dm.d
    public byte[] g0(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        O(bArr);
        return bArr;
    }

    public String h0() {
        return U(this.f14281b, xk.d.f31393b);
    }

    public int hashCode() {
        s sVar = this.f14280a;
        if (sVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = sVar.f14325c;
            for (int i12 = sVar.f14324b; i12 < i11; i12++) {
                i10 = (i10 * 31) + sVar.f14323a[i12];
            }
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
        } while (sVar != this.f14280a);
        return i10;
    }

    public final b i() {
        b bVar = new b();
        if (size() != 0) {
            s sVar = this.f14280a;
            kotlin.jvm.internal.n.b(sVar);
            s d10 = sVar.d();
            bVar.f14280a = d10;
            d10.f14329g = d10;
            d10.f14328f = d10;
            for (s sVar2 = sVar.f14328f; sVar2 != sVar; sVar2 = sVar2.f14328f) {
                s sVar3 = d10.f14329g;
                kotlin.jvm.internal.n.b(sVar3);
                kotlin.jvm.internal.n.b(sVar2);
                sVar3.c(sVar2.d());
            }
            bVar.j0(size());
        }
        return bVar;
    }

    public String i0(long j10) {
        return U(j10, xk.d.f31393b);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final b j(b out, long j10, long j11) {
        kotlin.jvm.internal.n.e(out, "out");
        c0.b(size(), j10, j11);
        if (j11 != 0) {
            out.j0(out.size() + j11);
            s sVar = this.f14280a;
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
                kotlin.jvm.internal.n.b(sVar);
                s d10 = sVar.d();
                int i12 = d10.f14324b + ((int) j10);
                d10.f14324b = i12;
                d10.f14325c = Math.min(i12 + ((int) j11), d10.f14325c);
                s sVar2 = out.f14280a;
                if (sVar2 == null) {
                    d10.f14329g = d10;
                    d10.f14328f = d10;
                    out.f14280a = d10;
                } else {
                    kotlin.jvm.internal.n.b(sVar2);
                    s sVar3 = sVar2.f14329g;
                    kotlin.jvm.internal.n.b(sVar3);
                    sVar3.c(d10);
                }
                j11 -= d10.f14325c - d10.f14324b;
                sVar = sVar.f14328f;
                j10 = 0;
            }
        }
        return this;
    }

    public final void j0(long j10) {
        this.f14281b = j10;
    }

    public b j1(String string, int i10, int i11) {
        char charAt;
        long size;
        long j10;
        kotlin.jvm.internal.n.e(string, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char charAt2 = string.charAt(i10);
            if (charAt2 < 128) {
                s z02 = z0(1);
                byte[] bArr = z02.f14323a;
                int i12 = z02.f14325c - i10;
                int min = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) charAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                }
                int i14 = z02.f14325c;
                int i15 = (i12 + i10) - i14;
                z02.f14325c = i14 + i15;
                j0(size() + i15);
            } else {
                if (charAt2 < 2048) {
                    s z03 = z0(2);
                    byte[] bArr2 = z03.f14323a;
                    int i16 = z03.f14325c;
                    bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                    z03.f14325c = i16 + 2;
                    size = size();
                    j10 = 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    s z04 = z0(3);
                    byte[] bArr3 = z04.f14323a;
                    int i17 = z04.f14325c;
                    bArr3[i17] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | RecognitionOptions.ITF);
                    bArr3[i17 + 2] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                    z04.f14325c = i17 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    int i18 = i10 + 1;
                    char charAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (charAt2 <= 56319) {
                        if (56320 <= charAt3 && charAt3 < 57344) {
                            int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            s z05 = z0(4);
                            byte[] bArr4 = z05.f14323a;
                            int i20 = z05.f14325c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | RecognitionOptions.ITF);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | RecognitionOptions.ITF);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | RecognitionOptions.ITF);
                            z05.f14325c = i20 + 4;
                            j0(size() + 4);
                            i10 += 2;
                        }
                    }
                    writeByte(63);
                    i10 = i18;
                }
                j0(size + j10);
                i10++;
            }
        }
        return this;
    }

    public final byte l(long j10) {
        c0.b(size(), j10, 1L);
        s sVar = this.f14280a;
        if (sVar == null) {
            kotlin.jvm.internal.n.b(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                sVar = sVar.f14329g;
                kotlin.jvm.internal.n.b(sVar);
                size -= sVar.f14325c - sVar.f14324b;
            }
            kotlin.jvm.internal.n.b(sVar);
            return sVar.f14323a[(int) ((sVar.f14324b + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (sVar.f14325c - sVar.f14324b) + j11;
            if (j12 > j10) {
                kotlin.jvm.internal.n.b(sVar);
                return sVar.f14323a[(int) ((sVar.f14324b + j10) - j11)];
            }
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
            j11 = j12;
        }
    }

    @Override // dm.x
    public y m() {
        return y.f14339e;
    }

    public final e m0() {
        if (size() <= 2147483647L) {
            return v0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // dm.d
    public int n1(o options) {
        kotlin.jvm.internal.n.e(options, "options");
        int d10 = em.a.d(this, options, false, 2, null);
        if (d10 == -1) {
            return -1;
        }
        skip(options.k()[d10].B());
        return d10;
    }

    public long q(byte b10, long j10, long j11) {
        s sVar;
        int i10;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (sVar = this.f14280a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j12 = size();
            while (j12 > j10) {
                sVar = sVar.f14329g;
                kotlin.jvm.internal.n.b(sVar);
                j12 -= sVar.f14325c - sVar.f14324b;
            }
            while (j12 < j11) {
                byte[] bArr = sVar.f14323a;
                int min = (int) Math.min(sVar.f14325c, (sVar.f14324b + j11) - j12);
                i10 = (int) ((sVar.f14324b + j10) - j12);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j12 += sVar.f14325c - sVar.f14324b;
                sVar = sVar.f14328f;
                kotlin.jvm.internal.n.b(sVar);
                j10 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (sVar.f14325c - sVar.f14324b) + j12;
            if (j13 > j10) {
                break;
            }
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
            j12 = j13;
        }
        while (j12 < j11) {
            byte[] bArr2 = sVar.f14323a;
            int min2 = (int) Math.min(sVar.f14325c, (sVar.f14324b + j11) - j12);
            i10 = (int) ((sVar.f14324b + j10) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            j12 += sVar.f14325c - sVar.f14324b;
            sVar = sVar.f14328f;
            kotlin.jvm.internal.n.b(sVar);
            j10 = j12;
        }
        return -1L;
        return (i10 - sVar.f14324b) + j12;
    }

    @Override // dm.d
    public void q0(long j10) {
        if (this.f14281b < j10) {
            throw new EOFException();
        }
    }

    public b q1(int i10) {
        long size;
        long j10;
        if (i10 < 128) {
            writeByte(i10);
        } else {
            if (i10 < 2048) {
                s z02 = z0(2);
                byte[] bArr = z02.f14323a;
                int i11 = z02.f14325c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | RecognitionOptions.ITF);
                z02.f14325c = i11 + 2;
                size = size();
                j10 = 2;
            } else {
                boolean z10 = false;
                if (55296 <= i10 && i10 < 57344) {
                    z10 = true;
                }
                if (z10) {
                    writeByte(63);
                } else if (i10 < 65536) {
                    s z03 = z0(3);
                    byte[] bArr2 = z03.f14323a;
                    int i12 = z03.f14325c;
                    bArr2[i12] = (byte) ((i10 >> 12) | 224);
                    bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | RecognitionOptions.ITF);
                    bArr2[i12 + 2] = (byte) ((i10 & 63) | RecognitionOptions.ITF);
                    z03.f14325c = i12 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    if (i10 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: 0x" + c0.i(i10));
                    }
                    s z04 = z0(4);
                    byte[] bArr3 = z04.f14323a;
                    int i13 = z04.f14325c;
                    bArr3[i13] = (byte) ((i10 >> 18) | 240);
                    bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | RecognitionOptions.ITF);
                    bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | RecognitionOptions.ITF);
                    bArr3[i13 + 3] = (byte) ((i10 & 63) | RecognitionOptions.ITF);
                    z04.f14325c = i13 + 4;
                    size = size();
                    j10 = 4;
                }
            }
            j0(size + j10);
        }
        return this;
    }

    public long r(e targetBytes) {
        kotlin.jvm.internal.n.e(targetBytes, "targetBytes");
        return B(targetBytes, 0L);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        s sVar = this.f14280a;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), sVar.f14325c - sVar.f14324b);
        sink.put(sVar.f14323a, sVar.f14324b, min);
        int i10 = sVar.f14324b + min;
        sVar.f14324b = i10;
        this.f14281b -= min;
        if (i10 == sVar.f14325c) {
            this.f14280a = sVar.b();
            t.b(sVar);
        }
        return min;
    }

    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.n.e(sink, "sink");
        c0.b(sink.length, i10, i11);
        s sVar = this.f14280a;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i11, sVar.f14325c - sVar.f14324b);
        byte[] bArr = sVar.f14323a;
        int i12 = sVar.f14324b;
        dk.l.d(bArr, sink, i10, i12, i12 + min);
        sVar.f14324b += min;
        j0(size() - min);
        if (sVar.f14324b == sVar.f14325c) {
            this.f14280a = sVar.b();
            t.b(sVar);
        }
        return min;
    }

    @Override // dm.d
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        s sVar = this.f14280a;
        kotlin.jvm.internal.n.b(sVar);
        int i10 = sVar.f14324b;
        int i11 = sVar.f14325c;
        int i12 = i10 + 1;
        byte b10 = sVar.f14323a[i10];
        j0(size() - 1);
        if (i12 == i11) {
            this.f14280a = sVar.b();
            t.b(sVar);
        } else {
            sVar.f14324b = i12;
        }
        return b10;
    }

    @Override // dm.d
    public int readInt() {
        if (size() < 4) {
            throw new EOFException();
        }
        s sVar = this.f14280a;
        kotlin.jvm.internal.n.b(sVar);
        int i10 = sVar.f14324b;
        int i11 = sVar.f14325c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = sVar.f14323a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        j0(size() - 4);
        if (i17 == i11) {
            this.f14280a = sVar.b();
            t.b(sVar);
        } else {
            sVar.f14324b = i17;
        }
        return i18;
    }

    @Override // dm.d
    public short readShort() {
        if (size() < 2) {
            throw new EOFException();
        }
        s sVar = this.f14280a;
        kotlin.jvm.internal.n.b(sVar);
        int i10 = sVar.f14324b;
        int i11 = sVar.f14325c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = sVar.f14323a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        j0(size() - 2);
        if (i13 == i11) {
            this.f14280a = sVar.b();
            t.b(sVar);
        } else {
            sVar.f14324b = i13;
        }
        return (short) i14;
    }

    @Override // dm.x
    public long s1(b sink, long j10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.K0(this, j10);
        return j10;
    }

    public final long size() {
        return this.f14281b;
    }

    @Override // dm.d
    public void skip(long j10) {
        while (j10 > 0) {
            s sVar = this.f14280a;
            if (sVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, sVar.f14325c - sVar.f14324b);
            long j11 = min;
            j0(size() - j11);
            j10 -= j11;
            int i10 = sVar.f14324b + min;
            sVar.f14324b = i10;
            if (i10 == sVar.f14325c) {
                this.f14280a = sVar.b();
                t.b(sVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:36:0x00ae BREAK  A[LOOP:0: B:4:0x000d->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // dm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long t1() {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            dm.s r6 = r14.f14280a
            kotlin.jvm.internal.n.b(r6)
            byte[] r7 = r6.f14323a
            int r8 = r6.f14324b
            int r9 = r6.f14325c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            dm.b r0 = new dm.b
            r0.<init>()
            dm.b r0 = r0.Z0(r4)
            dm.b r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.h0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = dm.c0.h(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            dm.s r7 = r6.b()
            r14.f14280a = r7
            dm.t.b(r6)
            goto La8
        La6:
            r6.f14324b = r8
        La8:
            if (r1 != 0) goto Lae
            dm.s r6 = r14.f14280a
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.j0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.b.t1():long");
    }

    public String toString() {
        return m0().toString();
    }

    public final e v0(int i10) {
        if (i10 == 0) {
            return e.f14292e;
        }
        c0.b(size(), 0L, i10);
        s sVar = this.f14280a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.n.b(sVar);
            int i14 = sVar.f14325c;
            int i15 = sVar.f14324b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            sVar = sVar.f14328f;
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        s sVar2 = this.f14280a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.n.b(sVar2);
            bArr[i16] = sVar2.f14323a;
            i11 += sVar2.f14325c - sVar2.f14324b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = sVar2.f14324b;
            sVar2.f14326d = true;
            i16++;
            sVar2 = sVar2.f14328f;
        }
        return new u(bArr, iArr);
    }

    @Override // dm.d
    public e w0(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new e(g0(j10));
        }
        e v02 = v0((int) j10);
        skip(j10);
        return v02;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.n.e(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            s z02 = z0(1);
            int min = Math.min(i10, 8192 - z02.f14325c);
            source.get(z02.f14323a, z02.f14325c, min);
            i10 -= min;
            z02.f14325c += min;
        }
        this.f14281b += remaining;
        return remaining;
    }

    public final s z0(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        s sVar = this.f14280a;
        if (sVar != null) {
            kotlin.jvm.internal.n.b(sVar);
            s sVar2 = sVar.f14329g;
            kotlin.jvm.internal.n.b(sVar2);
            return (sVar2.f14325c + i10 > 8192 || !sVar2.f14327e) ? sVar2.c(t.c()) : sVar2;
        }
        s c10 = t.c();
        this.f14280a = c10;
        c10.f14329g = c10;
        c10.f14328f = c10;
        return c10;
    }
}
