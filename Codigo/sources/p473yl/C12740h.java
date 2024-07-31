package p473yl;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dm.C7056b;
import dm.C7061e;
import dm.C7081y;
import dm.InterfaceC7060d;
import dm.InterfaceC7080x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;
import p473yl.C12736d;
import uk.C11577d;
import uk.C11579f;
import uk.C11585l;

/* renamed from: yl.h */
/* loaded from: classes3.dex */
public final class C12740h implements Closeable {

    /* renamed from: e */
    public static final a f34699e = new a(null);

    /* renamed from: f */
    private static final Logger f34700f;

    /* renamed from: a */
    private final InterfaceC7060d f34701a;

    /* renamed from: b */
    private final boolean f34702b;

    /* renamed from: c */
    private final b f34703c;

    /* renamed from: d */
    private final C12736d.a f34704d;

    /* renamed from: yl.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final Logger m42190a() {
            return C12740h.f34700f;
        }

        /* renamed from: b */
        public final int m42191b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    /* renamed from: yl.h$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC7080x {

        /* renamed from: a */
        private final InterfaceC7060d f34705a;

        /* renamed from: b */
        private int f34706b;

        /* renamed from: c */
        private int f34707c;

        /* renamed from: d */
        private int f34708d;

        /* renamed from: e */
        private int f34709e;

        /* renamed from: f */
        private int f34710f;

        public b(InterfaceC7060d source) {
            C9322n.m27781e(source, "source");
            this.f34705a = source;
        }

        /* renamed from: b */
        private final void m42192b() {
            int i10 = this.f34708d;
            int m32624J = C10727d.m32624J(this.f34705a);
            this.f34709e = m32624J;
            this.f34706b = m32624J;
            int m32644d = C10727d.m32644d(this.f34705a.readByte(), 255);
            this.f34707c = C10727d.m32644d(this.f34705a.readByte(), 255);
            a aVar = C12740h.f34699e;
            if (aVar.m42190a().isLoggable(Level.FINE)) {
                aVar.m42190a().fine(C12737e.f34585a.m42083c(true, this.f34708d, this.f34706b, m32644d, this.f34707c));
            }
            int readInt = this.f34705a.readInt() & C5101a.e.API_PRIORITY_OTHER;
            this.f34708d = readInt;
            if (m32644d == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(m32644d + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: a */
        public final int m42193a() {
            return this.f34709e;
        }

        @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: e */
        public final void m42194e(int i10) {
            this.f34707c = i10;
        }

        /* renamed from: f */
        public final void m42195f(int i10) {
            this.f34709e = i10;
        }

        /* renamed from: g */
        public final void m42196g(int i10) {
            this.f34706b = i10;
        }

        /* renamed from: i */
        public final void m42197i(int i10) {
            this.f34710f = i10;
        }

        /* renamed from: j */
        public final void m42198j(int i10) {
            this.f34708d = i10;
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: m */
        public C7081y mo20685m() {
            return this.f34705a.mo20685m();
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            while (true) {
                int i10 = this.f34709e;
                if (i10 != 0) {
                    long mo20686s1 = this.f34705a.mo20686s1(sink, Math.min(j10, i10));
                    if (mo20686s1 == -1) {
                        return -1L;
                    }
                    this.f34709e -= (int) mo20686s1;
                    return mo20686s1;
                }
                this.f34705a.skip(this.f34710f);
                this.f34710f = 0;
                if ((this.f34707c & 4) != 0) {
                    return -1L;
                }
                m42192b();
            }
        }
    }

    /* renamed from: yl.h$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo42160a(boolean z10, int i10, int i11, List<C12735c> list);

        /* renamed from: c */
        void mo42161c(int i10, EnumC12734b enumC12734b);

        /* renamed from: d */
        void mo42162d(int i10, long j10);

        /* renamed from: f */
        void mo42163f(boolean z10, C12745m c12745m);

        /* renamed from: g */
        void mo42164g(int i10, EnumC12734b enumC12734b, C7061e c7061e);

        /* renamed from: h */
        void mo42165h(boolean z10, int i10, int i11);

        /* renamed from: i */
        void mo42166i(boolean z10, int i10, InterfaceC7060d interfaceC7060d, int i11);

        /* renamed from: j */
        void mo42167j(int i10, int i11, List<C12735c> list);

        /* renamed from: k */
        void mo42168k();

        /* renamed from: l */
        void mo42169l(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(C12737e.class.getName());
        C9322n.m27780d(logger, "getLogger(Http2::class.java.name)");
        f34700f = logger;
    }

    public C12740h(InterfaceC7060d source, boolean z10) {
        C9322n.m27781e(source, "source");
        this.f34701a = source;
        this.f34702b = z10;
        b bVar = new b(source);
        this.f34703c = bVar;
        this.f34704d = new C12736d.a(bVar, RecognitionOptions.AZTEC, 0, 4, null);
    }

    /* renamed from: B */
    private final void m42176B(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException(C9322n.m27787k("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
        }
        long m32646f = C10727d.m32646f(this.f34701a.readInt(), 2147483647L);
        if (m32646f == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.mo42162d(i12, m32646f);
    }

    /* renamed from: f */
    private final void m42178f(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int m32644d = (i11 & 8) != 0 ? C10727d.m32644d(this.f34701a.readByte(), 255) : 0;
        cVar.mo42166i(z10, i12, this.f34701a, f34699e.m42191b(i10, i11, m32644d));
        this.f34701a.skip(m32644d);
    }

    /* renamed from: g */
    private final void m42179g(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException(C9322n.m27787k("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f34701a.readInt();
        int readInt2 = this.f34701a.readInt();
        int i13 = i10 - 8;
        EnumC12734b m42049a = EnumC12734b.Companion.m42049a(readInt2);
        if (m42049a == null) {
            throw new IOException(C9322n.m27787k("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        }
        C7061e c7061e = C7061e.f15650e;
        if (i13 > 0) {
            c7061e = this.f34701a.mo20739w0(i13);
        }
        cVar.mo42164g(readInt, m42049a, c7061e);
    }

    /* renamed from: i */
    private final List<C12735c> m42180i(int i10, int i11, int i12, int i13) {
        this.f34703c.m42195f(i10);
        b bVar = this.f34703c;
        bVar.m42196g(bVar.m42193a());
        this.f34703c.m42197i(i11);
        this.f34703c.m42194e(i12);
        this.f34703c.m42198j(i13);
        this.f34704d.m42071k();
        return this.f34704d.m42069e();
    }

    /* renamed from: j */
    private final void m42181j(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int m32644d = (i11 & 8) != 0 ? C10727d.m32644d(this.f34701a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            m42183n(cVar, i12);
            i10 -= 5;
        }
        cVar.mo42160a(z10, i12, -1, m42180i(f34699e.m42191b(i10, i11, m32644d), m32644d, i11, i12));
    }

    /* renamed from: l */
    private final void m42182l(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException(C9322n.m27787k("TYPE_PING length != 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo42165h((i11 & 1) != 0, this.f34701a.readInt(), this.f34701a.readInt());
    }

    /* renamed from: n */
    private final void m42183n(c cVar, int i10) {
        int readInt = this.f34701a.readInt();
        cVar.mo42169l(i10, readInt & C5101a.e.API_PRIORITY_OTHER, C10727d.m32644d(this.f34701a.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: o */
    private final void m42184o(c cVar, int i10, int i11, int i12) {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m42183n(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    /* renamed from: q */
    private final void m42185q(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int m32644d = (i11 & 8) != 0 ? C10727d.m32644d(this.f34701a.readByte(), 255) : 0;
        cVar.mo42167j(i12, this.f34701a.readInt() & C5101a.e.API_PRIORITY_OTHER, m42180i(f34699e.m42191b(i10 - 4, i11, m32644d), m32644d, i11, i12));
    }

    /* renamed from: r */
    private final void m42186r(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f34701a.readInt();
        EnumC12734b m42049a = EnumC12734b.Companion.m42049a(readInt);
        if (m42049a == null) {
            throw new IOException(C9322n.m27787k("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        }
        cVar.mo42161c(i12, m42049a);
    }

    /* renamed from: y */
    private final void m42187y(c cVar, int i10, int i11, int i12) {
        C11579f m36302k;
        C11577d m36301j;
        int readInt;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.mo42168k();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException(C9322n.m27787k("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i10)));
        }
        C12745m c12745m = new C12745m();
        m36302k = C11585l.m36302k(0, i10);
        m36301j = C11585l.m36301j(m36302k, 6);
        int m36268c = m36301j.m36268c();
        int m36269d = m36301j.m36269d();
        int m36270f = m36301j.m36270f();
        if ((m36270f > 0 && m36268c <= m36269d) || (m36270f < 0 && m36269d <= m36268c)) {
            while (true) {
                int i13 = m36268c + m36270f;
                int m32645e = C10727d.m32645e(this.f34701a.readShort(), 65535);
                readInt = this.f34701a.readInt();
                if (m32645e != 2) {
                    if (m32645e == 3) {
                        m32645e = 4;
                    } else if (m32645e != 4) {
                        if (m32645e == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        m32645e = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c12745m.m42278h(m32645e, readInt);
                if (m36268c == m36269d) {
                    break;
                } else {
                    m36268c = i13;
                }
            }
            throw new IOException(C9322n.m27787k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
        }
        cVar.mo42163f(false, c12745m);
    }

    /* renamed from: b */
    public final boolean m42188b(boolean z10, c handler) {
        C9322n.m27781e(handler, "handler");
        try {
            this.f34701a.mo20733q0(9L);
            int m32624J = C10727d.m32624J(this.f34701a);
            if (m32624J > 16384) {
                throw new IOException(C9322n.m27787k("FRAME_SIZE_ERROR: ", Integer.valueOf(m32624J)));
            }
            int m32644d = C10727d.m32644d(this.f34701a.readByte(), 255);
            int m32644d2 = C10727d.m32644d(this.f34701a.readByte(), 255);
            int readInt = this.f34701a.readInt() & C5101a.e.API_PRIORITY_OTHER;
            Logger logger = f34700f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C12737e.f34585a.m42083c(true, readInt, m32624J, m32644d, m32644d2));
            }
            if (z10 && m32644d != 4) {
                throw new IOException(C9322n.m27787k("Expected a SETTINGS frame but was ", C12737e.f34585a.m42082b(m32644d)));
            }
            switch (m32644d) {
                case 0:
                    m42178f(handler, m32624J, m32644d2, readInt);
                    return true;
                case 1:
                    m42181j(handler, m32624J, m32644d2, readInt);
                    return true;
                case 2:
                    m42184o(handler, m32624J, m32644d2, readInt);
                    return true;
                case 3:
                    m42186r(handler, m32624J, m32644d2, readInt);
                    return true;
                case 4:
                    m42187y(handler, m32624J, m32644d2, readInt);
                    return true;
                case 5:
                    m42185q(handler, m32624J, m32644d2, readInt);
                    return true;
                case 6:
                    m42182l(handler, m32624J, m32644d2, readInt);
                    return true;
                case 7:
                    m42179g(handler, m32624J, m32644d2, readInt);
                    return true;
                case 8:
                    m42176B(handler, m32624J, m32644d2, readInt);
                    return true;
                default:
                    this.f34701a.skip(m32624J);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34701a.close();
    }

    /* renamed from: e */
    public final void m42189e(c handler) {
        C9322n.m27781e(handler, "handler");
        if (this.f34702b) {
            if (!m42188b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC7060d interfaceC7060d = this.f34701a;
        C7061e c7061e = C12737e.f34586b;
        C7061e mo20739w0 = interfaceC7060d.mo20739w0(c7061e.m20756B());
        Logger logger = f34700f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C10727d.m32660t(C9322n.m27787k("<< CONNECTION ", mo20739w0.mo20770r()), new Object[0]));
        }
        if (!C9322n.m27777a(c7061e, mo20739w0)) {
            throw new IOException(C9322n.m27787k("Expected a connection header but was ", mo20739w0.m20760F()));
        }
    }
}
