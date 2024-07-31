package yl;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dm.x;
import dm.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import yl.d;

/* loaded from: classes3.dex */
public final class h implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32148e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f32149f;

    /* renamed from: a, reason: collision with root package name */
    private final dm.d f32150a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32151b;

    /* renamed from: c, reason: collision with root package name */
    private final b f32152c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a f32153d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Logger a() {
            return h.f32149f;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        private final dm.d f32154a;

        /* renamed from: b, reason: collision with root package name */
        private int f32155b;

        /* renamed from: c, reason: collision with root package name */
        private int f32156c;

        /* renamed from: d, reason: collision with root package name */
        private int f32157d;

        /* renamed from: e, reason: collision with root package name */
        private int f32158e;

        /* renamed from: f, reason: collision with root package name */
        private int f32159f;

        public b(dm.d source) {
            kotlin.jvm.internal.n.e(source, "source");
            this.f32154a = source;
        }

        private final void b() {
            int i10 = this.f32157d;
            int J = rl.d.J(this.f32154a);
            this.f32158e = J;
            this.f32155b = J;
            int d10 = rl.d.d(this.f32154a.readByte(), 255);
            this.f32156c = rl.d.d(this.f32154a.readByte(), 255);
            a aVar = h.f32148e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f32049a.c(true, this.f32157d, this.f32155b, d10, this.f32156c));
            }
            int readInt = this.f32154a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f32157d = readInt;
            if (d10 == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(d10 + " != TYPE_CONTINUATION");
            }
        }

        public final int a() {
            return this.f32158e;
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void e(int i10) {
            this.f32156c = i10;
        }

        public final void f(int i10) {
            this.f32158e = i10;
        }

        public final void g(int i10) {
            this.f32155b = i10;
        }

        public final void i(int i10) {
            this.f32159f = i10;
        }

        public final void j(int i10) {
            this.f32157d = i10;
        }

        @Override // dm.x
        public y m() {
            return this.f32154a.m();
        }

        @Override // dm.x
        public long s1(dm.b sink, long j10) {
            kotlin.jvm.internal.n.e(sink, "sink");
            while (true) {
                int i10 = this.f32158e;
                if (i10 != 0) {
                    long s12 = this.f32154a.s1(sink, Math.min(j10, i10));
                    if (s12 == -1) {
                        return -1L;
                    }
                    this.f32158e -= (int) s12;
                    return s12;
                }
                this.f32154a.skip(this.f32159f);
                this.f32159f = 0;
                if ((this.f32156c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z10, int i10, int i11, List<yl.c> list);

        void c(int i10, yl.b bVar);

        void d(int i10, long j10);

        void f(boolean z10, m mVar);

        void g(int i10, yl.b bVar, dm.e eVar);

        void h(boolean z10, int i10, int i11);

        void i(boolean z10, int i10, dm.d dVar, int i11);

        void j(int i10, int i11, List<yl.c> list);

        void k();

        void l(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        kotlin.jvm.internal.n.d(logger, "getLogger(Http2::class.java.name)");
        f32149f = logger;
    }

    public h(dm.d source, boolean z10) {
        kotlin.jvm.internal.n.e(source, "source");
        this.f32150a = source;
        this.f32151b = z10;
        b bVar = new b(source);
        this.f32152c = bVar;
        this.f32153d = new d.a(bVar, RecognitionOptions.AZTEC, 0, 4, null);
    }

    private final void B(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException(kotlin.jvm.internal.n.k("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
        }
        long f10 = rl.d.f(this.f32150a.readInt(), 2147483647L);
        if (f10 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.d(i12, f10);
    }

    private final void f(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int d10 = (i11 & 8) != 0 ? rl.d.d(this.f32150a.readByte(), 255) : 0;
        cVar.i(z10, i12, this.f32150a, f32148e.b(i10, i11, d10));
        this.f32150a.skip(d10);
    }

    private final void g(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException(kotlin.jvm.internal.n.k("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f32150a.readInt();
        int readInt2 = this.f32150a.readInt();
        int i13 = i10 - 8;
        yl.b a10 = yl.b.Companion.a(readInt2);
        if (a10 == null) {
            throw new IOException(kotlin.jvm.internal.n.k("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        }
        dm.e eVar = dm.e.f14292e;
        if (i13 > 0) {
            eVar = this.f32150a.w0(i13);
        }
        cVar.g(readInt, a10, eVar);
    }

    private final List<yl.c> i(int i10, int i11, int i12, int i13) {
        this.f32152c.f(i10);
        b bVar = this.f32152c;
        bVar.g(bVar.a());
        this.f32152c.i(i11);
        this.f32152c.e(i12);
        this.f32152c.j(i13);
        this.f32153d.k();
        return this.f32153d.e();
    }

    private final void j(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int d10 = (i11 & 8) != 0 ? rl.d.d(this.f32150a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            n(cVar, i12);
            i10 -= 5;
        }
        cVar.a(z10, i12, -1, i(f32148e.b(i10, i11, d10), d10, i11, i12));
    }

    private final void l(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException(kotlin.jvm.internal.n.k("TYPE_PING length != 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.h((i11 & 1) != 0, this.f32150a.readInt(), this.f32150a.readInt());
    }

    private final void n(c cVar, int i10) {
        int readInt = this.f32150a.readInt();
        cVar.l(i10, readInt & a.e.API_PRIORITY_OTHER, rl.d.d(this.f32150a.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private final void o(c cVar, int i10, int i11, int i12) {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            n(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void q(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int d10 = (i11 & 8) != 0 ? rl.d.d(this.f32150a.readByte(), 255) : 0;
        cVar.j(i12, this.f32150a.readInt() & a.e.API_PRIORITY_OTHER, i(f32148e.b(i10 - 4, i11, d10), d10, i11, i12));
    }

    private final void r(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f32150a.readInt();
        yl.b a10 = yl.b.Companion.a(readInt);
        if (a10 == null) {
            throw new IOException(kotlin.jvm.internal.n.k("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        }
        cVar.c(i12, a10);
    }

    private final void y(c cVar, int i10, int i11, int i12) {
        uk.f k10;
        uk.d j10;
        int readInt;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.k();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException(kotlin.jvm.internal.n.k("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i10)));
        }
        m mVar = new m();
        k10 = uk.l.k(0, i10);
        j10 = uk.l.j(k10, 6);
        int c10 = j10.c();
        int d10 = j10.d();
        int f10 = j10.f();
        if ((f10 > 0 && c10 <= d10) || (f10 < 0 && d10 <= c10)) {
            while (true) {
                int i13 = c10 + f10;
                int e10 = rl.d.e(this.f32150a.readShort(), 65535);
                readInt = this.f32150a.readInt();
                if (e10 != 2) {
                    if (e10 == 3) {
                        e10 = 4;
                    } else if (e10 != 4) {
                        if (e10 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        e10 = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(e10, readInt);
                if (c10 == d10) {
                    break;
                } else {
                    c10 = i13;
                }
            }
            throw new IOException(kotlin.jvm.internal.n.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
        }
        cVar.f(false, mVar);
    }

    public final boolean b(boolean z10, c handler) {
        kotlin.jvm.internal.n.e(handler, "handler");
        try {
            this.f32150a.q0(9L);
            int J = rl.d.J(this.f32150a);
            if (J > 16384) {
                throw new IOException(kotlin.jvm.internal.n.k("FRAME_SIZE_ERROR: ", Integer.valueOf(J)));
            }
            int d10 = rl.d.d(this.f32150a.readByte(), 255);
            int d11 = rl.d.d(this.f32150a.readByte(), 255);
            int readInt = this.f32150a.readInt() & a.e.API_PRIORITY_OTHER;
            Logger logger = f32149f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f32049a.c(true, readInt, J, d10, d11));
            }
            if (z10 && d10 != 4) {
                throw new IOException(kotlin.jvm.internal.n.k("Expected a SETTINGS frame but was ", e.f32049a.b(d10)));
            }
            switch (d10) {
                case 0:
                    f(handler, J, d11, readInt);
                    return true;
                case 1:
                    j(handler, J, d11, readInt);
                    return true;
                case 2:
                    o(handler, J, d11, readInt);
                    return true;
                case 3:
                    r(handler, J, d11, readInt);
                    return true;
                case 4:
                    y(handler, J, d11, readInt);
                    return true;
                case 5:
                    q(handler, J, d11, readInt);
                    return true;
                case 6:
                    l(handler, J, d11, readInt);
                    return true;
                case 7:
                    g(handler, J, d11, readInt);
                    return true;
                case 8:
                    B(handler, J, d11, readInt);
                    return true;
                default:
                    this.f32150a.skip(J);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32150a.close();
    }

    public final void e(c handler) {
        kotlin.jvm.internal.n.e(handler, "handler");
        if (this.f32151b) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        dm.d dVar = this.f32150a;
        dm.e eVar = e.f32050b;
        dm.e w02 = dVar.w0(eVar.B());
        Logger logger = f32149f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(rl.d.t(kotlin.jvm.internal.n.k("<< CONNECTION ", w02.r()), new Object[0]));
        }
        if (!kotlin.jvm.internal.n.a(eVar, w02)) {
            throw new IOException(kotlin.jvm.internal.n.k("Expected a connection header but was ", w02.F()));
        }
    }
}
