package dm;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7019l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9322n;
import p090em.C7251a;
import p450xk.C12512d;

/* renamed from: dm.b */
/* loaded from: classes3.dex */
public final class C7056b implements InterfaceC7060d, InterfaceC7058c, Cloneable, ByteChannel {

    /* renamed from: a */
    public C7075s f15638a;

    /* renamed from: b */
    private long f15639b;

    /* renamed from: dm.b$a */
    /* loaded from: classes3.dex */
    public static final class a implements Closeable {

        /* renamed from: a */
        public C7056b f15640a;

        /* renamed from: b */
        private C7075s f15641b;

        /* renamed from: d */
        public byte[] f15643d;

        /* renamed from: c */
        public long f15642c = -1;

        /* renamed from: e */
        public int f15644e = -1;

        /* renamed from: f */
        public int f15645f = -1;

        /* renamed from: a */
        public final void m20741a(C7075s c7075s) {
            this.f15641b = c7075s;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f15640a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f15640a = null;
            m20741a(null);
            this.f15642c = -1L;
            this.f15643d = null;
            this.f15644e = -1;
            this.f15645f = -1;
        }
    }

    /* renamed from: dm.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C7056b.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C7056b.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            C9322n.m27781e(data, "data");
            C7056b.this.write(data, i10, i11);
        }
    }

    /* renamed from: B */
    public long m20689B(C7061e targetBytes, long j10) {
        int i10;
        C9322n.m27781e(targetBytes, "targetBytes");
        long j11 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        C7075s c7075s = this.f15638a;
        if (c7075s == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j11 = size();
            while (j11 > j10) {
                c7075s = c7075s.f15687g;
                C9322n.m27778b(c7075s);
                j11 -= c7075s.f15683c - c7075s.f15682b;
            }
            if (targetBytes.m20756B() == 2) {
                byte m20765m = targetBytes.m20765m(0);
                byte m20765m2 = targetBytes.m20765m(1);
                while (j11 < size()) {
                    byte[] bArr = c7075s.f15681a;
                    i10 = (int) ((c7075s.f15682b + j10) - j11);
                    int i11 = c7075s.f15683c;
                    while (i10 < i11) {
                        byte b10 = bArr[i10];
                        if (b10 != m20765m && b10 != m20765m2) {
                            i10++;
                        }
                    }
                    j11 += c7075s.f15683c - c7075s.f15682b;
                    c7075s = c7075s.f15686f;
                    C9322n.m27778b(c7075s);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] mo20771s = targetBytes.mo20771s();
            while (j11 < size()) {
                byte[] bArr2 = c7075s.f15681a;
                i10 = (int) ((c7075s.f15682b + j10) - j11);
                int i12 = c7075s.f15683c;
                while (i10 < i12) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : mo20771s) {
                        if (b11 != b12) {
                        }
                    }
                    i10++;
                }
                j11 += c7075s.f15683c - c7075s.f15682b;
                c7075s = c7075s.f15686f;
                C9322n.m27778b(c7075s);
                j10 = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = (c7075s.f15683c - c7075s.f15682b) + j11;
            if (j12 > j10) {
                break;
            }
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
            j11 = j12;
        }
        if (targetBytes.m20756B() == 2) {
            byte m20765m3 = targetBytes.m20765m(0);
            byte m20765m4 = targetBytes.m20765m(1);
            while (j11 < size()) {
                byte[] bArr3 = c7075s.f15681a;
                i10 = (int) ((c7075s.f15682b + j10) - j11);
                int i13 = c7075s.f15683c;
                while (i10 < i13) {
                    byte b13 = bArr3[i10];
                    if (b13 != m20765m3 && b13 != m20765m4) {
                        i10++;
                    }
                }
                j11 += c7075s.f15683c - c7075s.f15682b;
                c7075s = c7075s.f15686f;
                C9322n.m27778b(c7075s);
                j10 = j11;
            }
            return -1L;
        }
        byte[] mo20771s2 = targetBytes.mo20771s();
        while (j11 < size()) {
            byte[] bArr4 = c7075s.f15681a;
            i10 = (int) ((c7075s.f15682b + j10) - j11);
            int i14 = c7075s.f15683c;
            while (i10 < i14) {
                byte b14 = bArr4[i10];
                for (byte b15 : mo20771s2) {
                    if (b14 != b15) {
                    }
                }
                i10++;
            }
            j11 += c7075s.f15683c - c7075s.f15682b;
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
            j10 = j11;
        }
        return -1L;
        return (i10 - c7075s.f15682b) + j11;
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C7056b mo20715b0(C7061e byteString) {
        C9322n.m27781e(byteString, "byteString");
        byteString.mo20761G(this, 0, byteString.m20756B());
        return this;
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C7056b write(byte[] source) {
        C9322n.m27781e(source, "source");
        return write(source, 0, source.length);
    }

    /* renamed from: E */
    public OutputStream m20692E() {
        return new b();
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: E0 */
    public long mo20693E0(InterfaceC7080x source) {
        C9322n.m27781e(source, "source");
        long j10 = 0;
        while (true) {
            long mo20686s1 = source.mo20686s1(this, 8192L);
            if (mo20686s1 == -1) {
                return j10;
            }
            j10 += mo20686s1;
        }
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public C7056b write(byte[] source, int i10, int i11) {
        C9322n.m27781e(source, "source");
        long j10 = i11;
        C7059c0.m20745b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C7075s m20740z0 = m20740z0(1);
            int min = Math.min(i12 - i10, 8192 - m20740z0.f15683c);
            int i13 = i10 + min;
            C7019l.m20436d(source, m20740z0.f15681a, m20740z0.f15683c, i10, i13);
            m20740z0.f15683c += min;
            i10 = i13;
        }
        m20727j0(size() + j10);
        return this;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: G0 */
    public boolean mo20695G0() {
        return this.f15639b == 0;
    }

    /* renamed from: H */
    public byte[] m20696H() {
        return mo20722g0(size());
    }

    /* renamed from: I */
    public C7061e m20697I() {
        return mo20739w0(size());
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C7056b writeByte(int i10) {
        C7075s m20740z0 = m20740z0(1);
        byte[] bArr = m20740z0.f15681a;
        int i11 = m20740z0.f15683c;
        m20740z0.f15683c = i11 + 1;
        bArr[i11] = (byte) i10;
        m20727j0(size() + 1);
        return this;
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C7056b mo20736s0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return mo20705T("-9223372036854775808");
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
        C7075s m20740z0 = m20740z0(i10);
        byte[] bArr = m20740z0.f15681a;
        int i11 = m20740z0.f15683c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = C7251a.m21692a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = (byte) 45;
        }
        m20740z0.f15683c += i10;
        m20727j0(size() + i10);
        return this;
    }

    @Override // dm.InterfaceC7078v
    /* renamed from: K0 */
    public void mo19710K0(C7056b source, long j10) {
        C7075s c7075s;
        C9322n.m27781e(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C7059c0.m20745b(source.size(), 0L, j10);
        while (j10 > 0) {
            C7075s c7075s2 = source.f15638a;
            C9322n.m27778b(c7075s2);
            int i10 = c7075s2.f15683c;
            C9322n.m27778b(source.f15638a);
            if (j10 < i10 - r2.f15682b) {
                C7075s c7075s3 = this.f15638a;
                if (c7075s3 != null) {
                    C9322n.m27778b(c7075s3);
                    c7075s = c7075s3.f15687g;
                } else {
                    c7075s = null;
                }
                if (c7075s != null && c7075s.f15685e) {
                    if ((c7075s.f15683c + j10) - (c7075s.f15684d ? 0 : c7075s.f15682b) <= 8192) {
                        C7075s c7075s4 = source.f15638a;
                        C9322n.m27778b(c7075s4);
                        c7075s4.m20840f(c7075s, (int) j10);
                        source.m20727j0(source.size() - j10);
                        m20727j0(size() + j10);
                        return;
                    }
                }
                C7075s c7075s5 = source.f15638a;
                C9322n.m27778b(c7075s5);
                source.f15638a = c7075s5.m20839e((int) j10);
            }
            C7075s c7075s6 = source.f15638a;
            C9322n.m27778b(c7075s6);
            long j11 = c7075s6.f15683c - c7075s6.f15682b;
            source.f15638a = c7075s6.m20836b();
            C7075s c7075s7 = this.f15638a;
            if (c7075s7 == null) {
                this.f15638a = c7075s6;
                c7075s6.f15687g = c7075s6;
                c7075s6.f15686f = c7075s6;
            } else {
                C9322n.m27778b(c7075s7);
                C7075s c7075s8 = c7075s7.f15687g;
                C9322n.m27778b(c7075s8);
                c7075s8.m20837c(c7075s6).m20835a();
            }
            source.m20727j0(source.size() - j11);
            m20727j0(size() + j11);
            j10 -= j11;
        }
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: L */
    public String mo20700L(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        byte b10 = (byte) 10;
        long m20732q = m20732q(b10, 0L, j11);
        if (m20732q != -1) {
            return C7251a.m21693b(this, m20732q);
        }
        if (j11 < size() && m20729l(j11 - 1) == ((byte) 13) && m20729l(j11) == b10) {
            return C7251a.m21693b(this, j11);
        }
        C7056b c7056b = new C7056b();
        m20726j(c7056b, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c7056b.m20697I().mo20770r() + (char) 8230);
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C7056b mo20711Z0(long j10) {
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
        C7075s m20740z0 = m20740z0(i10);
        byte[] bArr = m20740z0.f15681a;
        int i11 = m20740z0.f15683c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = C7251a.m21692a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        m20740z0.f15683c += i10;
        m20727j0(size() + i10);
        return this;
    }

    /* renamed from: O */
    public void m20702O(byte[] sink) {
        C9322n.m27781e(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int read = read(sink, i10, sink.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    /* renamed from: R */
    public int m20703R() {
        return C7059c0.m20749f(readInt());
    }

    /* renamed from: S */
    public short m20704S() {
        return C7059c0.m20750g(readShort());
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C7056b writeInt(int i10) {
        C7075s m20740z0 = m20740z0(4);
        byte[] bArr = m20740z0.f15681a;
        int i11 = m20740z0.f15683c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        m20740z0.f15683c = i14 + 1;
        m20727j0(size() + 4);
        return this;
    }

    /* renamed from: U */
    public String m20707U(long j10, Charset charset) {
        C9322n.m27781e(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f15639b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        C7075s c7075s = this.f15638a;
        C9322n.m27778b(c7075s);
        int i10 = c7075s.f15682b;
        if (i10 + j10 > c7075s.f15683c) {
            return new String(mo20722g0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(c7075s.f15681a, i10, i11, charset);
        int i12 = c7075s.f15682b + i11;
        c7075s.f15682b = i12;
        this.f15639b -= j10;
        if (i12 == c7075s.f15683c) {
            this.f15638a = c7075s.m20836b();
            C7076t.m20842b(c7075s);
        }
        return str;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: U0 */
    public String mo20708U0(Charset charset) {
        C9322n.m27781e(charset, "charset");
        return m20707U(this.f15639b, charset);
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C7056b writeShort(int i10) {
        C7075s m20740z0 = m20740z0(2);
        byte[] bArr = m20740z0.f15681a;
        int i11 = m20740z0.f15683c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        m20740z0.f15683c = i12 + 1;
        m20727j0(size() + 2);
        return this;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: Y */
    public long mo20710Y(InterfaceC7078v sink) {
        C9322n.m27781e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.mo19710K0(this, size);
        }
        return size;
    }

    /* renamed from: a */
    public C7056b m20712a() {
        return this;
    }

    /* renamed from: a1 */
    public C7056b m20713a1(String string, int i10, int i11, Charset charset) {
        C9322n.m27781e(string, "string");
        C9322n.m27781e(charset, "charset");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (C9322n.m27777a(charset, C12512d.f33913b)) {
            return m20728j1(string, i10, i11);
        }
        String substring = string.substring(i10, i11);
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        C9322n.m27780d(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    /* renamed from: b */
    public final void m20714b() {
        skip(size());
    }

    /* renamed from: b1 */
    public final C7056b m20716b1(OutputStream out, long j10) {
        C9322n.m27781e(out, "out");
        C7059c0.m20745b(this.f15639b, 0L, j10);
        C7075s c7075s = this.f15638a;
        while (j10 > 0) {
            C9322n.m27778b(c7075s);
            int min = (int) Math.min(j10, c7075s.f15683c - c7075s.f15682b);
            out.write(c7075s.f15681a, c7075s.f15682b, min);
            int i10 = c7075s.f15682b + min;
            c7075s.f15682b = i10;
            long j11 = min;
            this.f15639b -= j11;
            j10 -= j11;
            if (i10 == c7075s.f15683c) {
                C7075s m20836b = c7075s.m20836b();
                this.f15638a = m20836b;
                C7076t.m20842b(c7075s);
                c7075s = m20836b;
            }
        }
        return this;
    }

    @Override // dm.InterfaceC7060d, dm.InterfaceC7058c
    /* renamed from: c */
    public C7056b mo20717c() {
        return this;
    }

    @Override // dm.InterfaceC7058c
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C7056b mo20705T(String string) {
        C9322n.m27781e(string, "string");
        return m20728j1(string, 0, string.length());
    }

    @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: d0 */
    public String mo20719d0() {
        return mo20700L(Long.MAX_VALUE);
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C7056b clone() {
        return m20724i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7056b) {
            C7056b c7056b = (C7056b) obj;
            if (size() == c7056b.size()) {
                if (size() == 0) {
                    return true;
                }
                C7075s c7075s = this.f15638a;
                C9322n.m27778b(c7075s);
                C7075s c7075s2 = c7056b.f15638a;
                C9322n.m27778b(c7075s2);
                int i10 = c7075s.f15682b;
                int i11 = c7075s2.f15682b;
                long j10 = 0;
                while (j10 < size()) {
                    long min = Math.min(c7075s.f15683c - i10, c7075s2.f15683c - i11);
                    long j11 = 0;
                    while (j11 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (c7075s.f15681a[i10] == c7075s2.f15681a[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == c7075s.f15683c) {
                        c7075s = c7075s.f15686f;
                        C9322n.m27778b(c7075s);
                        i10 = c7075s.f15682b;
                    }
                    if (i11 == c7075s2.f15683c) {
                        c7075s2 = c7075s2.f15686f;
                        C9322n.m27778b(c7075s2);
                        i11 = c7075s2.f15682b;
                    }
                    j10 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // dm.InterfaceC7058c, dm.InterfaceC7078v, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public final long m20721g() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C7075s c7075s = this.f15638a;
        C9322n.m27778b(c7075s);
        C7075s c7075s2 = c7075s.f15687g;
        C9322n.m27778b(c7075s2);
        if (c7075s2.f15683c < 8192 && c7075s2.f15685e) {
            size -= r3 - c7075s2.f15682b;
        }
        return size;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: g0 */
    public byte[] mo20722g0(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        m20702O(bArr);
        return bArr;
    }

    /* renamed from: h0 */
    public String m20723h0() {
        return m20707U(this.f15639b, C12512d.f33913b);
    }

    public int hashCode() {
        C7075s c7075s = this.f15638a;
        if (c7075s == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c7075s.f15683c;
            for (int i12 = c7075s.f15682b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c7075s.f15681a[i12];
            }
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
        } while (c7075s != this.f15638a);
        return i10;
    }

    /* renamed from: i */
    public final C7056b m20724i() {
        C7056b c7056b = new C7056b();
        if (size() != 0) {
            C7075s c7075s = this.f15638a;
            C9322n.m27778b(c7075s);
            C7075s m20838d = c7075s.m20838d();
            c7056b.f15638a = m20838d;
            m20838d.f15687g = m20838d;
            m20838d.f15686f = m20838d;
            for (C7075s c7075s2 = c7075s.f15686f; c7075s2 != c7075s; c7075s2 = c7075s2.f15686f) {
                C7075s c7075s3 = m20838d.f15687g;
                C9322n.m27778b(c7075s3);
                C9322n.m27778b(c7075s2);
                c7075s3.m20837c(c7075s2.m20838d());
            }
            c7056b.m20727j0(size());
        }
        return c7056b;
    }

    /* renamed from: i0 */
    public String m20725i0(long j10) {
        return m20707U(j10, C12512d.f33913b);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final C7056b m20726j(C7056b out, long j10, long j11) {
        C9322n.m27781e(out, "out");
        C7059c0.m20745b(size(), j10, j11);
        if (j11 != 0) {
            out.m20727j0(out.size() + j11);
            C7075s c7075s = this.f15638a;
            while (true) {
                C9322n.m27778b(c7075s);
                int i10 = c7075s.f15683c;
                int i11 = c7075s.f15682b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                c7075s = c7075s.f15686f;
            }
            while (j11 > 0) {
                C9322n.m27778b(c7075s);
                C7075s m20838d = c7075s.m20838d();
                int i12 = m20838d.f15682b + ((int) j10);
                m20838d.f15682b = i12;
                m20838d.f15683c = Math.min(i12 + ((int) j11), m20838d.f15683c);
                C7075s c7075s2 = out.f15638a;
                if (c7075s2 == null) {
                    m20838d.f15687g = m20838d;
                    m20838d.f15686f = m20838d;
                    out.f15638a = m20838d;
                } else {
                    C9322n.m27778b(c7075s2);
                    C7075s c7075s3 = c7075s2.f15687g;
                    C9322n.m27778b(c7075s3);
                    c7075s3.m20837c(m20838d);
                }
                j11 -= m20838d.f15683c - m20838d.f15682b;
                c7075s = c7075s.f15686f;
                j10 = 0;
            }
        }
        return this;
    }

    /* renamed from: j0 */
    public final void m20727j0(long j10) {
        this.f15639b = j10;
    }

    /* renamed from: j1 */
    public C7056b m20728j1(String string, int i10, int i11) {
        char charAt;
        long size;
        long j10;
        C9322n.m27781e(string, "string");
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
                C7075s m20740z0 = m20740z0(1);
                byte[] bArr = m20740z0.f15681a;
                int i12 = m20740z0.f15683c - i10;
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
                int i14 = m20740z0.f15683c;
                int i15 = (i12 + i10) - i14;
                m20740z0.f15683c = i14 + i15;
                m20727j0(size() + i15);
            } else {
                if (charAt2 < 2048) {
                    C7075s m20740z02 = m20740z0(2);
                    byte[] bArr2 = m20740z02.f15681a;
                    int i16 = m20740z02.f15683c;
                    bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                    m20740z02.f15683c = i16 + 2;
                    size = size();
                    j10 = 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C7075s m20740z03 = m20740z0(3);
                    byte[] bArr3 = m20740z03.f15681a;
                    int i17 = m20740z03.f15683c;
                    bArr3[i17] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | RecognitionOptions.ITF);
                    bArr3[i17 + 2] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                    m20740z03.f15683c = i17 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    int i18 = i10 + 1;
                    char charAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (charAt2 <= 56319) {
                        if (56320 <= charAt3 && charAt3 < 57344) {
                            int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            C7075s m20740z04 = m20740z0(4);
                            byte[] bArr4 = m20740z04.f15681a;
                            int i20 = m20740z04.f15683c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | RecognitionOptions.ITF);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | RecognitionOptions.ITF);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | RecognitionOptions.ITF);
                            m20740z04.f15683c = i20 + 4;
                            m20727j0(size() + 4);
                            i10 += 2;
                        }
                    }
                    writeByte(63);
                    i10 = i18;
                }
                m20727j0(size + j10);
                i10++;
            }
        }
        return this;
    }

    /* renamed from: l */
    public final byte m20729l(long j10) {
        C7059c0.m20745b(size(), j10, 1L);
        C7075s c7075s = this.f15638a;
        if (c7075s == null) {
            C9322n.m27778b(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                c7075s = c7075s.f15687g;
                C9322n.m27778b(c7075s);
                size -= c7075s.f15683c - c7075s.f15682b;
            }
            C9322n.m27778b(c7075s);
            return c7075s.f15681a[(int) ((c7075s.f15682b + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (c7075s.f15683c - c7075s.f15682b) + j11;
            if (j12 > j10) {
                C9322n.m27778b(c7075s);
                return c7075s.f15681a[(int) ((c7075s.f15682b + j10) - j11)];
            }
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
            j11 = j12;
        }
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: m */
    public C7081y mo20685m() {
        return C7081y.f15697e;
    }

    /* renamed from: m0 */
    public final C7061e m20730m0() {
        if (size() <= 2147483647L) {
            return m20738v0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: n1 */
    public int mo20731n1(C7071o options) {
        C9322n.m27781e(options, "options");
        int m21695d = C7251a.m21695d(this, options, false, 2, null);
        if (m21695d == -1) {
            return -1;
        }
        skip(options.m20821k()[m21695d].m20756B());
        return m21695d;
    }

    /* renamed from: q */
    public long m20732q(byte b10, long j10, long j11) {
        C7075s c7075s;
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
        if (j10 == j11 || (c7075s = this.f15638a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j12 = size();
            while (j12 > j10) {
                c7075s = c7075s.f15687g;
                C9322n.m27778b(c7075s);
                j12 -= c7075s.f15683c - c7075s.f15682b;
            }
            while (j12 < j11) {
                byte[] bArr = c7075s.f15681a;
                int min = (int) Math.min(c7075s.f15683c, (c7075s.f15682b + j11) - j12);
                i10 = (int) ((c7075s.f15682b + j10) - j12);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j12 += c7075s.f15683c - c7075s.f15682b;
                c7075s = c7075s.f15686f;
                C9322n.m27778b(c7075s);
                j10 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (c7075s.f15683c - c7075s.f15682b) + j12;
            if (j13 > j10) {
                break;
            }
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
            j12 = j13;
        }
        while (j12 < j11) {
            byte[] bArr2 = c7075s.f15681a;
            int min2 = (int) Math.min(c7075s.f15683c, (c7075s.f15682b + j11) - j12);
            i10 = (int) ((c7075s.f15682b + j10) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            j12 += c7075s.f15683c - c7075s.f15682b;
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
            j10 = j12;
        }
        return -1L;
        return (i10 - c7075s.f15682b) + j12;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: q0 */
    public void mo20733q0(long j10) {
        if (this.f15639b < j10) {
            throw new EOFException();
        }
    }

    /* renamed from: q1 */
    public C7056b m20734q1(int i10) {
        long size;
        long j10;
        if (i10 < 128) {
            writeByte(i10);
        } else {
            if (i10 < 2048) {
                C7075s m20740z0 = m20740z0(2);
                byte[] bArr = m20740z0.f15681a;
                int i11 = m20740z0.f15683c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | RecognitionOptions.ITF);
                m20740z0.f15683c = i11 + 2;
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
                    C7075s m20740z02 = m20740z0(3);
                    byte[] bArr2 = m20740z02.f15681a;
                    int i12 = m20740z02.f15683c;
                    bArr2[i12] = (byte) ((i10 >> 12) | 224);
                    bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | RecognitionOptions.ITF);
                    bArr2[i12 + 2] = (byte) ((i10 & 63) | RecognitionOptions.ITF);
                    m20740z02.f15683c = i12 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    if (i10 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: 0x" + C7059c0.m20752i(i10));
                    }
                    C7075s m20740z03 = m20740z0(4);
                    byte[] bArr3 = m20740z03.f15681a;
                    int i13 = m20740z03.f15683c;
                    bArr3[i13] = (byte) ((i10 >> 18) | 240);
                    bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | RecognitionOptions.ITF);
                    bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | RecognitionOptions.ITF);
                    bArr3[i13 + 3] = (byte) ((i10 & 63) | RecognitionOptions.ITF);
                    m20740z03.f15683c = i13 + 4;
                    size = size();
                    j10 = 4;
                }
            }
            m20727j0(size + j10);
        }
        return this;
    }

    /* renamed from: r */
    public long m20735r(C7061e targetBytes) {
        C9322n.m27781e(targetBytes, "targetBytes");
        return m20689B(targetBytes, 0L);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C9322n.m27781e(sink, "sink");
        C7075s c7075s = this.f15638a;
        if (c7075s == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c7075s.f15683c - c7075s.f15682b);
        sink.put(c7075s.f15681a, c7075s.f15682b, min);
        int i10 = c7075s.f15682b + min;
        c7075s.f15682b = i10;
        this.f15639b -= min;
        if (i10 == c7075s.f15683c) {
            this.f15638a = c7075s.m20836b();
            C7076t.m20842b(c7075s);
        }
        return min;
    }

    public int read(byte[] sink, int i10, int i11) {
        C9322n.m27781e(sink, "sink");
        C7059c0.m20745b(sink.length, i10, i11);
        C7075s c7075s = this.f15638a;
        if (c7075s == null) {
            return -1;
        }
        int min = Math.min(i11, c7075s.f15683c - c7075s.f15682b);
        byte[] bArr = c7075s.f15681a;
        int i12 = c7075s.f15682b;
        C7019l.m20436d(bArr, sink, i10, i12, i12 + min);
        c7075s.f15682b += min;
        m20727j0(size() - min);
        if (c7075s.f15682b == c7075s.f15683c) {
            this.f15638a = c7075s.m20836b();
            C7076t.m20842b(c7075s);
        }
        return min;
    }

    @Override // dm.InterfaceC7060d
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        C7075s c7075s = this.f15638a;
        C9322n.m27778b(c7075s);
        int i10 = c7075s.f15682b;
        int i11 = c7075s.f15683c;
        int i12 = i10 + 1;
        byte b10 = c7075s.f15681a[i10];
        m20727j0(size() - 1);
        if (i12 == i11) {
            this.f15638a = c7075s.m20836b();
            C7076t.m20842b(c7075s);
        } else {
            c7075s.f15682b = i12;
        }
        return b10;
    }

    @Override // dm.InterfaceC7060d
    public int readInt() {
        if (size() < 4) {
            throw new EOFException();
        }
        C7075s c7075s = this.f15638a;
        C9322n.m27778b(c7075s);
        int i10 = c7075s.f15682b;
        int i11 = c7075s.f15683c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c7075s.f15681a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        m20727j0(size() - 4);
        if (i17 == i11) {
            this.f15638a = c7075s.m20836b();
            C7076t.m20842b(c7075s);
        } else {
            c7075s.f15682b = i17;
        }
        return i18;
    }

    @Override // dm.InterfaceC7060d
    public short readShort() {
        if (size() < 2) {
            throw new EOFException();
        }
        C7075s c7075s = this.f15638a;
        C9322n.m27778b(c7075s);
        int i10 = c7075s.f15682b;
        int i11 = c7075s.f15683c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c7075s.f15681a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        m20727j0(size() - 2);
        if (i13 == i11) {
            this.f15638a = c7075s.m20836b();
            C7076t.m20842b(c7075s);
        } else {
            c7075s.f15682b = i13;
        }
        return (short) i14;
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: s1 */
    public long mo20686s1(C7056b sink, long j10) {
        C9322n.m27781e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.mo19710K0(this, j10);
        return j10;
    }

    public final long size() {
        return this.f15639b;
    }

    @Override // dm.InterfaceC7060d
    public void skip(long j10) {
        while (j10 > 0) {
            C7075s c7075s = this.f15638a;
            if (c7075s == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, c7075s.f15683c - c7075s.f15682b);
            long j11 = min;
            m20727j0(size() - j11);
            j10 -= j11;
            int i10 = c7075s.f15682b + min;
            c7075s.f15682b = i10;
            if (i10 == c7075s.f15683c) {
                this.f15638a = c7075s.m20836b();
                C7076t.m20842b(c7075s);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:36:0x00ae BREAK  A[LOOP:0: B:4:0x000d->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // dm.InterfaceC7060d
    /* renamed from: t1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo20737t1() {
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
            dm.s r6 = r14.f15638a
            kotlin.jvm.internal.C9322n.m27778b(r6)
            byte[] r7 = r6.f15681a
            int r8 = r6.f15682b
            int r9 = r6.f15683c
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
            dm.b r0 = r0.mo20711Z0(r4)
            dm.b r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m20723h0()
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
            java.lang.String r2 = dm.C7059c0.m20751h(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            dm.s r7 = r6.m20836b()
            r14.f15638a = r7
            dm.C7076t.m20842b(r6)
            goto La8
        La6:
            r6.f15682b = r8
        La8:
            if (r1 != 0) goto Lae
            dm.s r6 = r14.f15638a
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m20727j0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.C7056b.mo20737t1():long");
    }

    public String toString() {
        return m20730m0().toString();
    }

    /* renamed from: v0 */
    public final C7061e m20738v0(int i10) {
        if (i10 == 0) {
            return C7061e.f15650e;
        }
        C7059c0.m20745b(size(), 0L, i10);
        C7075s c7075s = this.f15638a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            C9322n.m27778b(c7075s);
            int i14 = c7075s.f15683c;
            int i15 = c7075s.f15682b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c7075s = c7075s.f15686f;
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        C7075s c7075s2 = this.f15638a;
        int i16 = 0;
        while (i11 < i10) {
            C9322n.m27778b(c7075s2);
            bArr[i16] = c7075s2.f15681a;
            i11 += c7075s2.f15683c - c7075s2.f15682b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c7075s2.f15682b;
            c7075s2.f15684d = true;
            i16++;
            c7075s2 = c7075s2.f15686f;
        }
        return new C7077u(bArr, iArr);
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: w0 */
    public C7061e mo20739w0(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C7061e(mo20722g0(j10));
        }
        C7061e m20738v0 = m20738v0((int) j10);
        skip(j10);
        return m20738v0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C9322n.m27781e(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            C7075s m20740z0 = m20740z0(1);
            int min = Math.min(i10, 8192 - m20740z0.f15683c);
            source.get(m20740z0.f15681a, m20740z0.f15683c, min);
            i10 -= min;
            m20740z0.f15683c += min;
        }
        this.f15639b += remaining;
        return remaining;
    }

    /* renamed from: z0 */
    public final C7075s m20740z0(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C7075s c7075s = this.f15638a;
        if (c7075s != null) {
            C9322n.m27778b(c7075s);
            C7075s c7075s2 = c7075s.f15687g;
            C9322n.m27778b(c7075s2);
            return (c7075s2.f15683c + i10 > 8192 || !c7075s2.f15685e) ? c7075s2.m20837c(C7076t.m20843c()) : c7075s2;
        }
        C7075s m20843c = C7076t.m20843c();
        this.f15638a = m20843c;
        m20843c.f15687g = m20843c;
        m20843c.f15686f = m20843c;
        return m20843c;
    }
}
