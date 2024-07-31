package dm;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.i */
/* loaded from: classes3.dex */
public final class C7065i implements InterfaceC7080x {

    /* renamed from: a */
    private byte f15657a;

    /* renamed from: b */
    private final C7074r f15658b;

    /* renamed from: c */
    private final Inflater f15659c;

    /* renamed from: d */
    private final C7066j f15660d;

    /* renamed from: e */
    private final CRC32 f15661e;

    public C7065i(InterfaceC7080x source) {
        C9322n.m27781e(source, "source");
        C7074r c7074r = new C7074r(source);
        this.f15658b = c7074r;
        Inflater inflater = new Inflater(true);
        this.f15659c = inflater;
        this.f15660d = new C7066j(c7074r, inflater);
        this.f15661e = new CRC32();
    }

    /* renamed from: a */
    private final void m20795a(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        C9322n.m27780d(format, "format(this, *args)");
        throw new IOException(format);
    }

    /* renamed from: b */
    private final void m20796b() {
        this.f15658b.mo20733q0(10L);
        byte m20729l = this.f15658b.f15678b.m20729l(3L);
        boolean z10 = ((m20729l >> 1) & 1) == 1;
        if (z10) {
            m20798f(this.f15658b.f15678b, 0L, 10L);
        }
        m20795a("ID1ID2", 8075, this.f15658b.readShort());
        this.f15658b.skip(8L);
        if (((m20729l >> 2) & 1) == 1) {
            this.f15658b.mo20733q0(2L);
            if (z10) {
                m20798f(this.f15658b.f15678b, 0L, 2L);
            }
            long m20704S = this.f15658b.f15678b.m20704S();
            this.f15658b.mo20733q0(m20704S);
            if (z10) {
                m20798f(this.f15658b.f15678b, 0L, m20704S);
            }
            this.f15658b.skip(m20704S);
        }
        if (((m20729l >> 3) & 1) == 1) {
            long m20830a = this.f15658b.m20830a((byte) 0);
            if (m20830a == -1) {
                throw new EOFException();
            }
            if (z10) {
                m20798f(this.f15658b.f15678b, 0L, m20830a + 1);
            }
            this.f15658b.skip(m20830a + 1);
        }
        if (((m20729l >> 4) & 1) == 1) {
            long m20830a2 = this.f15658b.m20830a((byte) 0);
            if (m20830a2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m20798f(this.f15658b.f15678b, 0L, m20830a2 + 1);
            }
            this.f15658b.skip(m20830a2 + 1);
        }
        if (z10) {
            m20795a("FHCRC", this.f15658b.m20833f(), (short) this.f15661e.getValue());
            this.f15661e.reset();
        }
    }

    /* renamed from: e */
    private final void m20797e() {
        m20795a("CRC", this.f15658b.m20832e(), (int) this.f15661e.getValue());
        m20795a("ISIZE", this.f15658b.m20832e(), (int) this.f15659c.getBytesWritten());
    }

    /* renamed from: f */
    private final void m20798f(C7056b c7056b, long j10, long j11) {
        C7075s c7075s = c7056b.f15638a;
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
            int min = (int) Math.min(c7075s.f15683c - r6, j11);
            this.f15661e.update(c7075s.f15681a, (int) (c7075s.f15682b + j10), min);
            j11 -= min;
            c7075s = c7075s.f15686f;
            C9322n.m27778b(c7075s);
            j10 = 0;
        }
    }

    @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15660d.close();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: m */
    public C7081y mo20685m() {
        return this.f15658b.mo20685m();
    }

    @Override // dm.InterfaceC7080x
    /* renamed from: s1 */
    public long mo20686s1(C7056b sink, long j10) {
        C9322n.m27781e(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f15657a == 0) {
            m20796b();
            this.f15657a = (byte) 1;
        }
        if (this.f15657a == 1) {
            long size = sink.size();
            long mo20686s1 = this.f15660d.mo20686s1(sink, j10);
            if (mo20686s1 != -1) {
                m20798f(sink, size, mo20686s1);
                return mo20686s1;
            }
            this.f15657a = (byte) 2;
        }
        if (this.f15657a == 2) {
            m20797e();
            this.f15657a = (byte) 3;
            if (!this.f15658b.mo20695G0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
