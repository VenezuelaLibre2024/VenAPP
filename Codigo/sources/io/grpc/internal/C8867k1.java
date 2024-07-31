package io.grpc.internal;

import io.grpc.internal.InterfaceC8864j2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import p082eb.C7159o;
import vi.C11915g1;
import vi.InterfaceC11928l;
import vi.InterfaceC11948u;

/* renamed from: io.grpc.internal.k1 */
/* loaded from: classes3.dex */
public class C8867k1 implements Closeable, InterfaceC8913y {

    /* renamed from: B */
    private int f20667B;

    /* renamed from: a */
    private b f20670a;

    /* renamed from: b */
    private int f20671b;

    /* renamed from: c */
    private final C8856h2 f20672c;

    /* renamed from: d */
    private final C8880n2 f20673d;

    /* renamed from: e */
    private InterfaceC11948u f20674e;

    /* renamed from: f */
    private C8893r0 f20675f;

    /* renamed from: r */
    private byte[] f20676r;

    /* renamed from: s */
    private int f20677s;

    /* renamed from: v */
    private boolean f20680v;

    /* renamed from: w */
    private C8901u f20681w;

    /* renamed from: y */
    private long f20683y;

    /* renamed from: t */
    private e f20678t = e.HEADER;

    /* renamed from: u */
    private int f20679u = 5;

    /* renamed from: x */
    private C8901u f20682x = new C8901u();

    /* renamed from: z */
    private boolean f20684z = false;

    /* renamed from: A */
    private int f20666A = -1;

    /* renamed from: C */
    private boolean f20668C = false;

    /* renamed from: D */
    private volatile boolean f20669D = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.k1$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20685a;

        static {
            int[] iArr = new int[e.values().length];
            f20685a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20685a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.grpc.internal.k1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo25374a(InterfaceC8864j2.a aVar);

        /* renamed from: c */
        void mo25571c(int i10);

        /* renamed from: d */
        void mo25572d(Throwable th2);

        /* renamed from: e */
        void mo25233e(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.k1$c */
    /* loaded from: classes3.dex */
    public static class c implements InterfaceC8864j2.a {

        /* renamed from: a */
        private InputStream f20686a;

        private c(InputStream inputStream) {
            this.f20686a = inputStream;
        }

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.InterfaceC8864j2.a
        public InputStream next() {
            InputStream inputStream = this.f20686a;
            this.f20686a = null;
            return inputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.k1$d */
    /* loaded from: classes3.dex */
    public static final class d extends FilterInputStream {

        /* renamed from: a */
        private final int f20687a;

        /* renamed from: b */
        private final C8856h2 f20688b;

        /* renamed from: c */
        private long f20689c;

        /* renamed from: d */
        private long f20690d;

        /* renamed from: e */
        private long f20691e;

        d(InputStream inputStream, int i10, C8856h2 c8856h2) {
            super(inputStream);
            this.f20691e = -1L;
            this.f20687a = i10;
            this.f20688b = c8856h2;
        }

        /* renamed from: a */
        private void m25637a() {
            long j10 = this.f20690d;
            long j11 = this.f20689c;
            if (j10 > j11) {
                this.f20688b.m25597f(j10 - j11);
                this.f20689c = this.f20690d;
            }
        }

        /* renamed from: b */
        private void m25638b() {
            if (this.f20690d <= this.f20687a) {
                return;
            }
            throw C11915g1.f31543o.m38147r("Decompressed gRPC message exceeds maximum size " + this.f20687a).m38139d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f20691e = this.f20690d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f20690d++;
            }
            m25638b();
            m25637a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (read != -1) {
                this.f20690d += read;
            }
            m25638b();
            m25637a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f20691e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f20690d = this.f20691e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(j10);
            this.f20690d += skip;
            m25638b();
            m25637a();
            return skip;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.k1$e */
    /* loaded from: classes3.dex */
    public enum e {
        HEADER,
        BODY
    }

    public C8867k1(b bVar, InterfaceC11948u interfaceC11948u, int i10, C8856h2 c8856h2, C8880n2 c8880n2) {
        this.f20670a = (b) C7159o.m21313p(bVar, "sink");
        this.f20674e = (InterfaceC11948u) C7159o.m21313p(interfaceC11948u, "decompressor");
        this.f20671b = i10;
        this.f20672c = (C8856h2) C7159o.m21313p(c8856h2, "statsTraceCtx");
        this.f20673d = (C8880n2) C7159o.m21313p(c8880n2, "transportTracer");
    }

    /* renamed from: a */
    private void m25626a() {
        if (this.f20684z) {
            return;
        }
        this.f20684z = true;
        while (true) {
            try {
                if (this.f20669D || this.f20683y <= 0 || !m25633y()) {
                    break;
                }
                int i10 = a.f20685a[this.f20678t.ordinal()];
                if (i10 == 1) {
                    m25632r();
                } else {
                    if (i10 != 2) {
                        throw new AssertionError("Invalid state: " + this.f20678t);
                    }
                    m25631q();
                    this.f20683y--;
                }
            } finally {
                this.f20684z = false;
            }
        }
        if (this.f20669D) {
            close();
            return;
        }
        if (this.f20668C && m25630o()) {
            close();
        }
    }

    /* renamed from: j */
    private InputStream m25627j() {
        InterfaceC11948u interfaceC11948u = this.f20674e;
        if (interfaceC11948u == InterfaceC11928l.b.f31595a) {
            throw C11915g1.f31548t.m38147r("Can't decode compressed gRPC message as compression not configured").m38139d();
        }
        try {
            return new d(interfaceC11948u.mo38200b(C8906v1.m25868c(this.f20681w, true)), this.f20671b, this.f20672c);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: l */
    private InputStream m25628l() {
        this.f20672c.m25597f(this.f20681w.mo25686k());
        return C8906v1.m25868c(this.f20681w, true);
    }

    /* renamed from: n */
    private boolean m25629n() {
        return isClosed() || this.f20668C;
    }

    /* renamed from: o */
    private boolean m25630o() {
        C8893r0 c8893r0 = this.f20675f;
        return c8893r0 != null ? c8893r0.m25800H() : this.f20682x.mo25686k() == 0;
    }

    /* renamed from: q */
    private void m25631q() {
        this.f20672c.m25596e(this.f20666A, this.f20667B, -1L);
        this.f20667B = 0;
        InputStream m25627j = this.f20680v ? m25627j() : m25628l();
        this.f20681w = null;
        this.f20670a.mo25374a(new c(m25627j, null));
        this.f20678t = e.HEADER;
        this.f20679u = 5;
    }

    /* renamed from: r */
    private void m25632r() {
        int readUnsignedByte = this.f20681w.readUnsignedByte();
        if ((readUnsignedByte & 254) != 0) {
            throw C11915g1.f31548t.m38147r("gRPC frame header malformed: reserved bits not zero").m38139d();
        }
        this.f20680v = (readUnsignedByte & 1) != 0;
        int readInt = this.f20681w.readInt();
        this.f20679u = readInt;
        if (readInt < 0 || readInt > this.f20671b) {
            throw C11915g1.f31543o.m38147r(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f20671b), Integer.valueOf(this.f20679u))).m38139d();
        }
        int i10 = this.f20666A + 1;
        this.f20666A = i10;
        this.f20672c.m25595d(i10);
        this.f20673d.m25692d();
        this.f20678t = e.BODY;
    }

    /* renamed from: y */
    private boolean m25633y() {
        int i10;
        int i11;
        int i12 = 0;
        try {
            if (this.f20681w == null) {
                this.f20681w = new C8901u();
            }
            int i13 = 0;
            i10 = 0;
            while (true) {
                try {
                    int mo25686k = this.f20679u - this.f20681w.mo25686k();
                    if (mo25686k <= 0) {
                        if (i13 <= 0) {
                            return true;
                        }
                        this.f20670a.mo25571c(i13);
                        if (this.f20678t != e.BODY) {
                            return true;
                        }
                        if (this.f20675f != null) {
                            this.f20672c.m25598g(i10);
                            i11 = this.f20667B + i10;
                        } else {
                            this.f20672c.m25598g(i13);
                            i11 = this.f20667B + i13;
                        }
                        this.f20667B = i11;
                        return true;
                    }
                    if (this.f20675f != null) {
                        try {
                            byte[] bArr = this.f20676r;
                            if (bArr == null || this.f20677s == bArr.length) {
                                this.f20676r = new byte[Math.min(mo25686k, 2097152)];
                                this.f20677s = 0;
                            }
                            int m25799B = this.f20675f.m25799B(this.f20676r, this.f20677s, Math.min(mo25686k, this.f20676r.length - this.f20677s));
                            i13 += this.f20675f.m25802o();
                            i10 += this.f20675f.m25803q();
                            if (m25799B == 0) {
                                if (i13 > 0) {
                                    this.f20670a.mo25571c(i13);
                                    if (this.f20678t == e.BODY) {
                                        if (this.f20675f != null) {
                                            this.f20672c.m25598g(i10);
                                            this.f20667B += i10;
                                        } else {
                                            this.f20672c.m25598g(i13);
                                            this.f20667B += i13;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f20681w.m25848b(C8906v1.m25871f(this.f20676r, this.f20677s, m25799B));
                            this.f20677s += m25799B;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        } catch (DataFormatException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        if (this.f20682x.mo25686k() == 0) {
                            if (i13 > 0) {
                                this.f20670a.mo25571c(i13);
                                if (this.f20678t == e.BODY) {
                                    if (this.f20675f != null) {
                                        this.f20672c.m25598g(i10);
                                        this.f20667B += i10;
                                    } else {
                                        this.f20672c.m25598g(i13);
                                        this.f20667B += i13;
                                    }
                                }
                            }
                            return false;
                        }
                        int min = Math.min(mo25686k, this.f20682x.mo25686k());
                        i13 += min;
                        this.f20681w.m25848b(this.f20682x.mo25684A(min));
                    }
                } catch (Throwable th2) {
                    int i14 = i13;
                    th = th2;
                    i12 = i14;
                    if (i12 > 0) {
                        this.f20670a.mo25571c(i12);
                        if (this.f20678t == e.BODY) {
                            if (this.f20675f != null) {
                                this.f20672c.m25598g(i10);
                                this.f20667B += i10;
                            } else {
                                this.f20672c.m25598g(i12);
                                this.f20667B += i12;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 0;
        }
    }

    /* renamed from: B */
    public void m25634B(C8893r0 c8893r0) {
        C7159o.m21319v(this.f20674e == InterfaceC11928l.b.f31595a, "per-message decompressor already set");
        C7159o.m21319v(this.f20675f == null, "full stream decompressor already set");
        this.f20675f = (C8893r0) C7159o.m21313p(c8893r0, "Can't pass a null full stream decompressor");
        this.f20682x = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m25635E(b bVar) {
        this.f20670a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m25636H() {
        this.f20669D = true;
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: b */
    public void mo25436b(int i10) {
        C7159o.m21302e(i10 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f20683y += i10;
        m25626a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.InterfaceC8913y
    public void close() {
        if (isClosed()) {
            return;
        }
        C8901u c8901u = this.f20681w;
        boolean z10 = true;
        boolean z11 = c8901u != null && c8901u.mo25686k() > 0;
        try {
            C8893r0 c8893r0 = this.f20675f;
            if (c8893r0 != null) {
                if (!z11 && !c8893r0.m25804r()) {
                    z10 = false;
                }
                this.f20675f.close();
                z11 = z10;
            }
            C8901u c8901u2 = this.f20682x;
            if (c8901u2 != null) {
                c8901u2.close();
            }
            C8901u c8901u3 = this.f20681w;
            if (c8901u3 != null) {
                c8901u3.close();
            }
            this.f20675f = null;
            this.f20682x = null;
            this.f20681w = null;
            this.f20670a.mo25233e(z11);
        } catch (Throwable th2) {
            this.f20675f = null;
            this.f20682x = null;
            this.f20681w = null;
            throw th2;
        }
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: e */
    public void mo25437e(int i10) {
        this.f20671b = i10;
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: f */
    public void mo25438f(InterfaceC8903u1 interfaceC8903u1) {
        C7159o.m21313p(interfaceC8903u1, "data");
        boolean z10 = true;
        try {
            if (!m25629n()) {
                C8893r0 c8893r0 = this.f20675f;
                if (c8893r0 != null) {
                    c8893r0.m25801l(interfaceC8903u1);
                } else {
                    this.f20682x.m25848b(interfaceC8903u1);
                }
                z10 = false;
                m25626a();
            }
        } finally {
            if (z10) {
                interfaceC8903u1.close();
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: g */
    public void mo25439g(InterfaceC11948u interfaceC11948u) {
        C7159o.m21319v(this.f20675f == null, "Already set full stream decompressor");
        this.f20674e = (InterfaceC11948u) C7159o.m21313p(interfaceC11948u, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: i */
    public void mo25440i() {
        if (isClosed()) {
            return;
        }
        if (m25630o()) {
            close();
        } else {
            this.f20668C = true;
        }
    }

    public boolean isClosed() {
        return this.f20682x == null && this.f20675f == null;
    }
}
