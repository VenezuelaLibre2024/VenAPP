package io.grpc.internal;

import io.grpc.internal.j2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import vi.l;

/* loaded from: classes3.dex */
public class k1 implements Closeable, y {
    private int B;

    /* renamed from: a, reason: collision with root package name */
    private b f18923a;

    /* renamed from: b, reason: collision with root package name */
    private int f18924b;

    /* renamed from: c, reason: collision with root package name */
    private final h2 f18925c;

    /* renamed from: d, reason: collision with root package name */
    private final n2 f18926d;

    /* renamed from: e, reason: collision with root package name */
    private vi.u f18927e;

    /* renamed from: f, reason: collision with root package name */
    private r0 f18928f;

    /* renamed from: r, reason: collision with root package name */
    private byte[] f18929r;

    /* renamed from: s, reason: collision with root package name */
    private int f18930s;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18933v;

    /* renamed from: w, reason: collision with root package name */
    private u f18934w;

    /* renamed from: y, reason: collision with root package name */
    private long f18936y;

    /* renamed from: t, reason: collision with root package name */
    private e f18931t = e.HEADER;

    /* renamed from: u, reason: collision with root package name */
    private int f18932u = 5;

    /* renamed from: x, reason: collision with root package name */
    private u f18935x = new u();

    /* renamed from: z, reason: collision with root package name */
    private boolean f18937z = false;
    private int A = -1;
    private boolean C = false;
    private volatile boolean D = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18938a;

        static {
            int[] iArr = new int[e.values().length];
            f18938a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18938a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(j2.a aVar);

        void c(int i10);

        void d(Throwable th2);

        void e(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c implements j2.a {

        /* renamed from: a, reason: collision with root package name */
        private InputStream f18939a;

        private c(InputStream inputStream) {
            this.f18939a = inputStream;
        }

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.j2.a
        public InputStream next() {
            InputStream inputStream = this.f18939a;
            this.f18939a = null;
            return inputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final int f18940a;

        /* renamed from: b, reason: collision with root package name */
        private final h2 f18941b;

        /* renamed from: c, reason: collision with root package name */
        private long f18942c;

        /* renamed from: d, reason: collision with root package name */
        private long f18943d;

        /* renamed from: e, reason: collision with root package name */
        private long f18944e;

        d(InputStream inputStream, int i10, h2 h2Var) {
            super(inputStream);
            this.f18944e = -1L;
            this.f18940a = i10;
            this.f18941b = h2Var;
        }

        private void a() {
            long j10 = this.f18943d;
            long j11 = this.f18942c;
            if (j10 > j11) {
                this.f18941b.f(j10 - j11);
                this.f18942c = this.f18943d;
            }
        }

        private void b() {
            if (this.f18943d <= this.f18940a) {
                return;
            }
            throw vi.g1.f29109o.r("Decompressed gRPC message exceeds maximum size " + this.f18940a).d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f18944e = this.f18943d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f18943d++;
            }
            b();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (read != -1) {
                this.f18943d += read;
            }
            b();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f18944e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f18943d = this.f18944e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(j10);
            this.f18943d += skip;
            b();
            a();
            return skip;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum e {
        HEADER,
        BODY
    }

    public k1(b bVar, vi.u uVar, int i10, h2 h2Var, n2 n2Var) {
        this.f18923a = (b) eb.o.p(bVar, "sink");
        this.f18927e = (vi.u) eb.o.p(uVar, "decompressor");
        this.f18924b = i10;
        this.f18925c = (h2) eb.o.p(h2Var, "statsTraceCtx");
        this.f18926d = (n2) eb.o.p(n2Var, "transportTracer");
    }

    private void a() {
        if (this.f18937z) {
            return;
        }
        this.f18937z = true;
        while (true) {
            try {
                if (this.D || this.f18936y <= 0 || !y()) {
                    break;
                }
                int i10 = a.f18938a[this.f18931t.ordinal()];
                if (i10 == 1) {
                    r();
                } else {
                    if (i10 != 2) {
                        throw new AssertionError("Invalid state: " + this.f18931t);
                    }
                    q();
                    this.f18936y--;
                }
            } finally {
                this.f18937z = false;
            }
        }
        if (this.D) {
            close();
            return;
        }
        if (this.C && o()) {
            close();
        }
    }

    private InputStream j() {
        vi.u uVar = this.f18927e;
        if (uVar == l.b.f29160a) {
            throw vi.g1.f29114t.r("Can't decode compressed gRPC message as compression not configured").d();
        }
        try {
            return new d(uVar.b(v1.c(this.f18934w, true)), this.f18924b, this.f18925c);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private InputStream l() {
        this.f18925c.f(this.f18934w.k());
        return v1.c(this.f18934w, true);
    }

    private boolean n() {
        return isClosed() || this.C;
    }

    private boolean o() {
        r0 r0Var = this.f18928f;
        return r0Var != null ? r0Var.H() : this.f18935x.k() == 0;
    }

    private void q() {
        this.f18925c.e(this.A, this.B, -1L);
        this.B = 0;
        InputStream j10 = this.f18933v ? j() : l();
        this.f18934w = null;
        this.f18923a.a(new c(j10, null));
        this.f18931t = e.HEADER;
        this.f18932u = 5;
    }

    private void r() {
        int readUnsignedByte = this.f18934w.readUnsignedByte();
        if ((readUnsignedByte & 254) != 0) {
            throw vi.g1.f29114t.r("gRPC frame header malformed: reserved bits not zero").d();
        }
        this.f18933v = (readUnsignedByte & 1) != 0;
        int readInt = this.f18934w.readInt();
        this.f18932u = readInt;
        if (readInt < 0 || readInt > this.f18924b) {
            throw vi.g1.f29109o.r(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f18924b), Integer.valueOf(this.f18932u))).d();
        }
        int i10 = this.A + 1;
        this.A = i10;
        this.f18925c.d(i10);
        this.f18926d.d();
        this.f18931t = e.BODY;
    }

    private boolean y() {
        int i10;
        int i11;
        int i12 = 0;
        try {
            if (this.f18934w == null) {
                this.f18934w = new u();
            }
            int i13 = 0;
            i10 = 0;
            while (true) {
                try {
                    int k10 = this.f18932u - this.f18934w.k();
                    if (k10 <= 0) {
                        if (i13 <= 0) {
                            return true;
                        }
                        this.f18923a.c(i13);
                        if (this.f18931t != e.BODY) {
                            return true;
                        }
                        if (this.f18928f != null) {
                            this.f18925c.g(i10);
                            i11 = this.B + i10;
                        } else {
                            this.f18925c.g(i13);
                            i11 = this.B + i13;
                        }
                        this.B = i11;
                        return true;
                    }
                    if (this.f18928f != null) {
                        try {
                            byte[] bArr = this.f18929r;
                            if (bArr == null || this.f18930s == bArr.length) {
                                this.f18929r = new byte[Math.min(k10, 2097152)];
                                this.f18930s = 0;
                            }
                            int B = this.f18928f.B(this.f18929r, this.f18930s, Math.min(k10, this.f18929r.length - this.f18930s));
                            i13 += this.f18928f.o();
                            i10 += this.f18928f.q();
                            if (B == 0) {
                                if (i13 > 0) {
                                    this.f18923a.c(i13);
                                    if (this.f18931t == e.BODY) {
                                        if (this.f18928f != null) {
                                            this.f18925c.g(i10);
                                            this.B += i10;
                                        } else {
                                            this.f18925c.g(i13);
                                            this.B += i13;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f18934w.b(v1.f(this.f18929r, this.f18930s, B));
                            this.f18930s += B;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        } catch (DataFormatException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        if (this.f18935x.k() == 0) {
                            if (i13 > 0) {
                                this.f18923a.c(i13);
                                if (this.f18931t == e.BODY) {
                                    if (this.f18928f != null) {
                                        this.f18925c.g(i10);
                                        this.B += i10;
                                    } else {
                                        this.f18925c.g(i13);
                                        this.B += i13;
                                    }
                                }
                            }
                            return false;
                        }
                        int min = Math.min(k10, this.f18935x.k());
                        i13 += min;
                        this.f18934w.b(this.f18935x.A(min));
                    }
                } catch (Throwable th2) {
                    int i14 = i13;
                    th = th2;
                    i12 = i14;
                    if (i12 > 0) {
                        this.f18923a.c(i12);
                        if (this.f18931t == e.BODY) {
                            if (this.f18928f != null) {
                                this.f18925c.g(i10);
                                this.B += i10;
                            } else {
                                this.f18925c.g(i12);
                                this.B += i12;
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

    public void B(r0 r0Var) {
        eb.o.v(this.f18927e == l.b.f29160a, "per-message decompressor already set");
        eb.o.v(this.f18928f == null, "full stream decompressor already set");
        this.f18928f = (r0) eb.o.p(r0Var, "Can't pass a null full stream decompressor");
        this.f18935x = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(b bVar) {
        this.f18923a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        this.D = true;
    }

    @Override // io.grpc.internal.y
    public void b(int i10) {
        eb.o.e(i10 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f18936y += i10;
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.y
    public void close() {
        if (isClosed()) {
            return;
        }
        u uVar = this.f18934w;
        boolean z10 = true;
        boolean z11 = uVar != null && uVar.k() > 0;
        try {
            r0 r0Var = this.f18928f;
            if (r0Var != null) {
                if (!z11 && !r0Var.r()) {
                    z10 = false;
                }
                this.f18928f.close();
                z11 = z10;
            }
            u uVar2 = this.f18935x;
            if (uVar2 != null) {
                uVar2.close();
            }
            u uVar3 = this.f18934w;
            if (uVar3 != null) {
                uVar3.close();
            }
            this.f18928f = null;
            this.f18935x = null;
            this.f18934w = null;
            this.f18923a.e(z11);
        } catch (Throwable th2) {
            this.f18928f = null;
            this.f18935x = null;
            this.f18934w = null;
            throw th2;
        }
    }

    @Override // io.grpc.internal.y
    public void e(int i10) {
        this.f18924b = i10;
    }

    @Override // io.grpc.internal.y
    public void f(u1 u1Var) {
        eb.o.p(u1Var, "data");
        boolean z10 = true;
        try {
            if (!n()) {
                r0 r0Var = this.f18928f;
                if (r0Var != null) {
                    r0Var.l(u1Var);
                } else {
                    this.f18935x.b(u1Var);
                }
                z10 = false;
                a();
            }
        } finally {
            if (z10) {
                u1Var.close();
            }
        }
    }

    @Override // io.grpc.internal.y
    public void g(vi.u uVar) {
        eb.o.v(this.f18928f == null, "Already set full stream decompressor");
        this.f18927e = (vi.u) eb.o.p(uVar, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.y
    public void i() {
        if (isClosed()) {
            return;
        }
        if (o()) {
            close();
        } else {
            this.C = true;
        }
    }

    public boolean isClosed() {
        return this.f18935x == null && this.f18928f == null;
    }
}
