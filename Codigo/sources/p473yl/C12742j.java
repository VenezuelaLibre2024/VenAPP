package p473yl;

import com.google.android.gms.common.api.C5101a;
import dm.C7056b;
import dm.InterfaceC7058c;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;
import p473yl.C12736d;

/* renamed from: yl.j */
/* loaded from: classes3.dex */
public final class C12742j implements Closeable {

    /* renamed from: r */
    public static final a f34739r = new a(null);

    /* renamed from: s */
    private static final Logger f34740s = Logger.getLogger(C12737e.class.getName());

    /* renamed from: a */
    private final InterfaceC7058c f34741a;

    /* renamed from: b */
    private final boolean f34742b;

    /* renamed from: c */
    private final C7056b f34743c;

    /* renamed from: d */
    private int f34744d;

    /* renamed from: e */
    private boolean f34745e;

    /* renamed from: f */
    private final C12736d.b f34746f;

    /* renamed from: yl.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C12742j(InterfaceC7058c sink, boolean z10) {
        C9322n.m27781e(sink, "sink");
        this.f34741a = sink;
        this.f34742b = z10;
        C7056b c7056b = new C7056b();
        this.f34743c = c7056b;
        this.f34744d = 16384;
        this.f34746f = new C12736d.b(0, false, c7056b, 3, null);
    }

    /* renamed from: n */
    private final void m42246n(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f34744d, j10);
            j10 -= min;
            m42252e(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f34741a.mo19710K0(this.f34743c, min);
        }
    }

    /* renamed from: G */
    public final synchronized void m42247G() {
        if (this.f34745e) {
            throw new IOException("closed");
        }
        if (this.f34742b) {
            Logger logger = f34740s;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C10727d.m32660t(C9322n.m27787k(">> CONNECTION ", C12737e.f34586b.mo20770r()), new Object[0]));
            }
            this.f34741a.mo20715b0(C12737e.f34586b);
            this.f34741a.flush();
        }
    }

    /* renamed from: X0 */
    public final synchronized void m42248X0(boolean z10, int i10, C7056b c7056b, int i11) {
        if (this.f34745e) {
            throw new IOException("closed");
        }
        m42250b(i10, z10 ? 1 : 0, c7056b, i11);
    }

    /* renamed from: a */
    public final synchronized void m42249a(C12745m peerSettings) {
        C9322n.m27781e(peerSettings, "peerSettings");
        if (this.f34745e) {
            throw new IOException("closed");
        }
        this.f34744d = peerSettings.m42275e(this.f34744d);
        if (peerSettings.m42272b() != -1) {
            this.f34746f.m42077e(peerSettings.m42272b());
        }
        m42252e(0, 0, 4, 1);
        this.f34741a.flush();
    }

    /* renamed from: b */
    public final void m42250b(int i10, int i11, C7056b c7056b, int i12) {
        m42252e(i10, i12, 0, i11);
        if (i12 > 0) {
            InterfaceC7058c interfaceC7058c = this.f34741a;
            C9322n.m27778b(c7056b);
            interfaceC7058c.mo19710K0(c7056b, i12);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f34745e = true;
        this.f34741a.close();
    }

    /* renamed from: d */
    public final synchronized void m42251d(int i10, long j10) {
        if (this.f34745e) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(C9322n.m27787k("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
        }
        m42252e(i10, 4, 8, 0);
        this.f34741a.writeInt((int) j10);
        this.f34741a.flush();
    }

    /* renamed from: e */
    public final void m42252e(int i10, int i11, int i12, int i13) {
        Logger logger = f34740s;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C12737e.f34585a.m42083c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f34744d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f34744d + ": " + i11).toString());
        }
        if (!((Integer.MIN_VALUE & i10) == 0)) {
            throw new IllegalArgumentException(C9322n.m27787k("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        C10727d.m32640Z(this.f34741a, i11);
        this.f34741a.writeByte(i12 & 255);
        this.f34741a.writeByte(i13 & 255);
        this.f34741a.writeInt(i10 & C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: f */
    public final synchronized void m42253f(int i10, EnumC12734b errorCode, byte[] debugData) {
        C9322n.m27781e(errorCode, "errorCode");
        C9322n.m27781e(debugData, "debugData");
        if (this.f34745e) {
            throw new IOException("closed");
        }
        if (!(errorCode.m42048h() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        m42252e(0, debugData.length + 8, 7, 0);
        this.f34741a.writeInt(i10);
        this.f34741a.writeInt(errorCode.m42048h());
        if (!(debugData.length == 0)) {
            this.f34741a.write(debugData);
        }
        this.f34741a.flush();
    }

    public final synchronized void flush() {
        if (this.f34745e) {
            throw new IOException("closed");
        }
        this.f34741a.flush();
    }

    /* renamed from: g */
    public final synchronized void m42254g(boolean z10, int i10, List<C12735c> headerBlock) {
        C9322n.m27781e(headerBlock, "headerBlock");
        if (this.f34745e) {
            throw new IOException("closed");
        }
        this.f34746f.m42079g(headerBlock);
        long size = this.f34743c.size();
        long min = Math.min(this.f34744d, size);
        int i11 = size == min ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        m42252e(i10, (int) min, 1, i11);
        this.f34741a.mo19710K0(this.f34743c, min);
        if (size > min) {
            m42246n(i10, size - min);
        }
    }

    /* renamed from: h */
    public final synchronized void m42255h(boolean z10, int i10, int i11) {
        if (this.f34745e) {
            throw new IOException("closed");
        }
        m42252e(0, 8, 6, z10 ? 1 : 0);
        this.f34741a.writeInt(i10);
        this.f34741a.writeInt(i11);
        this.f34741a.flush();
    }

    /* renamed from: i */
    public final synchronized void m42256i(int i10, int i11, List<C12735c> requestHeaders) {
        C9322n.m27781e(requestHeaders, "requestHeaders");
        if (this.f34745e) {
            throw new IOException("closed");
        }
        this.f34746f.m42079g(requestHeaders);
        long size = this.f34743c.size();
        int min = (int) Math.min(this.f34744d - 4, size);
        long j10 = min;
        m42252e(i10, min + 4, 5, size == j10 ? 4 : 0);
        this.f34741a.writeInt(i11 & C5101a.e.API_PRIORITY_OTHER);
        this.f34741a.mo19710K0(this.f34743c, j10);
        if (size > j10) {
            m42246n(i10, size - j10);
        }
    }

    /* renamed from: j */
    public final synchronized void m42257j(int i10, EnumC12734b errorCode) {
        C9322n.m27781e(errorCode, "errorCode");
        if (this.f34745e) {
            throw new IOException("closed");
        }
        if (!(errorCode.m42048h() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m42252e(i10, 4, 3, 0);
        this.f34741a.writeInt(errorCode.m42048h());
        this.f34741a.flush();
    }

    /* renamed from: l */
    public final synchronized void m42258l(C12745m settings) {
        C9322n.m27781e(settings, "settings");
        if (this.f34745e) {
            throw new IOException("closed");
        }
        int i10 = 0;
        m42252e(0, settings.m42279i() * 6, 4, 0);
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (settings.m42276f(i10)) {
                this.f34741a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                this.f34741a.writeInt(settings.m42271a(i10));
            }
            i10 = i11;
        }
        this.f34741a.flush();
    }

    /* renamed from: p0 */
    public final int m42259p0() {
        return this.f34744d;
    }
}
