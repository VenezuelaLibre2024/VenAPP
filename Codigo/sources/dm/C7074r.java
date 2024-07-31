package dm;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9322n;
import p090em.C7251a;
import p450xk.C12510b;

/* renamed from: dm.r */
/* loaded from: classes3.dex */
public final class C7074r implements InterfaceC7060d {

    /* renamed from: a */
    public final InterfaceC7080x f15677a;

    /* renamed from: b */
    public final C7056b f15678b;

    /* renamed from: c */
    public boolean f15679c;

    public C7074r(InterfaceC7080x source) {
        C9322n.m27781e(source, "source");
        this.f15677a = source;
        this.f15678b = new C7056b();
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: G0 */
    public boolean mo20695G0() {
        if (!this.f15679c) {
            return this.f15678b.mo20695G0() && this.f15677a.mo20686s1(this.f15678b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: L */
    public String mo20700L(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        byte b10 = (byte) 10;
        long m20831b = m20831b(b10, 0L, j11);
        if (m20831b != -1) {
            return C7251a.m21693b(this.f15678b, m20831b);
        }
        if (j11 < Long.MAX_VALUE && m20834g(j11) && this.f15678b.m20729l(j11 - 1) == ((byte) 13) && m20834g(1 + j11) && this.f15678b.m20729l(j11) == b10) {
            return C7251a.m21693b(this.f15678b, j11);
        }
        C7056b c7056b = new C7056b();
        C7056b c7056b2 = this.f15678b;
        c7056b2.m20726j(c7056b, 0L, Math.min(32, c7056b2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f15678b.size(), j10) + " content=" + c7056b.m20697I().mo20770r() + (char) 8230);
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: U0 */
    public String mo20708U0(Charset charset) {
        C9322n.m27781e(charset, "charset");
        this.f15678b.mo20693E0(this.f15677a);
        return this.f15678b.mo20708U0(charset);
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: Y */
    public long mo20710Y(InterfaceC7078v sink) {
        C9322n.m27781e(sink, "sink");
        long j10 = 0;
        while (this.f15677a.mo20686s1(this.f15678b, 8192L) != -1) {
            long m20721g = this.f15678b.m20721g();
            if (m20721g > 0) {
                j10 += m20721g;
                sink.mo19710K0(this.f15678b, m20721g);
            }
        }
        if (this.f15678b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f15678b.size();
        C7056b c7056b = this.f15678b;
        sink.mo19710K0(c7056b, c7056b.size());
        return size;
    }

    /* renamed from: a */
    public long m20830a(byte b10) {
        return m20831b(b10, 0L, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public long m20831b(byte b10, long j10, long j11) {
        if (!(!this.f15679c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j10 <= j11)) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long m20732q = this.f15678b.m20732q(b10, j10, j11);
            if (m20732q != -1) {
                return m20732q;
            }
            long size = this.f15678b.size();
            if (size >= j11 || this.f15677a.mo20686s1(this.f15678b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    @Override // dm.InterfaceC7060d, dm.InterfaceC7058c
    /* renamed from: c */
    public C7056b mo20717c() {
        return this.f15678b;
    }

    @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15679c) {
            return;
        }
        this.f15679c = true;
        this.f15677a.close();
        this.f15678b.m20714b();
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: d0 */
    public String mo20719d0() {
        return mo20700L(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public int m20832e() {
        mo20733q0(4L);
        return this.f15678b.m20703R();
    }

    /* renamed from: f */
    public short m20833f() {
        mo20733q0(2L);
        return this.f15678b.m20704S();
    }

    /* renamed from: g */
    public boolean m20834g(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f15679c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f15678b.size() < j10) {
            if (this.f15677a.mo20686s1(this.f15678b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: g0 */
    public byte[] mo20722g0(long j10) {
        mo20733q0(j10);
        return this.f15678b.mo20722g0(j10);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f15679c;
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: m */
    public C7081y mo20685m() {
        return this.f15677a.mo20685m();
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: n1 */
    public int mo20731n1(C7071o options) {
        C9322n.m27781e(options, "options");
        if (!(!this.f15679c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int m21694c = C7251a.m21694c(this.f15678b, options, true);
            if (m21694c != -2) {
                if (m21694c != -1) {
                    this.f15678b.skip(options.m20821k()[m21694c].m20756B());
                    return m21694c;
                }
            } else if (this.f15677a.mo20686s1(this.f15678b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: q0 */
    public void mo20733q0(long j10) {
        if (!m20834g(j10)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C9322n.m27781e(sink, "sink");
        if (this.f15678b.size() == 0 && this.f15677a.mo20686s1(this.f15678b, 8192L) == -1) {
            return -1;
        }
        return this.f15678b.read(sink);
    }

    @Override // dm.InterfaceC7060d
    public byte readByte() {
        mo20733q0(1L);
        return this.f15678b.readByte();
    }

    @Override // dm.InterfaceC7060d
    public int readInt() {
        mo20733q0(4L);
        return this.f15678b.readInt();
    }

    @Override // dm.InterfaceC7060d
    public short readShort() {
        mo20733q0(2L);
        return this.f15678b.readShort();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: s1 */
    public long mo20686s1(C7056b sink, long j10) {
        C9322n.m27781e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f15679c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f15678b.size() == 0 && this.f15677a.mo20686s1(this.f15678b, 8192L) == -1) {
            return -1L;
        }
        return this.f15678b.mo20686s1(sink, Math.min(j10, this.f15678b.size()));
    }

    @Override // dm.InterfaceC7060d
    public void skip(long j10) {
        if (!(!this.f15679c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.f15678b.size() == 0 && this.f15677a.mo20686s1(this.f15678b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f15678b.size());
            this.f15678b.skip(min);
            j10 -= min;
        }
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: t1 */
    public long mo20737t1() {
        byte m20729l;
        int m40956a;
        int m40956a2;
        mo20733q0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!m20834g(i11)) {
                break;
            }
            m20729l = this.f15678b.m20729l(i10);
            if ((m20729l < ((byte) 48) || m20729l > ((byte) 57)) && ((m20729l < ((byte) 97) || m20729l > ((byte) 102)) && (m20729l < ((byte) 65) || m20729l > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            m40956a = C12510b.m40956a(16);
            m40956a2 = C12510b.m40956a(m40956a);
            String num = Integer.toString(m20729l, m40956a2);
            C9322n.m27780d(num, "toString(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f15678b.mo20737t1();
    }

    public String toString() {
        return "buffer(" + this.f15677a + ')';
    }

    @Override // dm.InterfaceC7060d
    /* renamed from: w0 */
    public C7061e mo20739w0(long j10) {
        mo20733q0(j10);
        return this.f15678b.mo20739w0(j10);
    }
}
