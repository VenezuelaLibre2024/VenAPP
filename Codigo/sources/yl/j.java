package yl;

import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import yl.d;

/* loaded from: classes3.dex */
public final class j implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final a f32188r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final Logger f32189s = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final dm.c f32190a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32191b;

    /* renamed from: c, reason: collision with root package name */
    private final dm.b f32192c;

    /* renamed from: d, reason: collision with root package name */
    private int f32193d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32194e;

    /* renamed from: f, reason: collision with root package name */
    private final d.b f32195f;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public j(dm.c sink, boolean z10) {
        kotlin.jvm.internal.n.e(sink, "sink");
        this.f32190a = sink;
        this.f32191b = z10;
        dm.b bVar = new dm.b();
        this.f32192c = bVar;
        this.f32193d = 16384;
        this.f32195f = new d.b(0, false, bVar, 3, null);
    }

    private final void n(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f32193d, j10);
            j10 -= min;
            e(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f32190a.K0(this.f32192c, min);
        }
    }

    public final synchronized void G() {
        if (this.f32194e) {
            throw new IOException("closed");
        }
        if (this.f32191b) {
            Logger logger = f32189s;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(rl.d.t(kotlin.jvm.internal.n.k(">> CONNECTION ", e.f32050b.r()), new Object[0]));
            }
            this.f32190a.b0(e.f32050b);
            this.f32190a.flush();
        }
    }

    public final synchronized void X0(boolean z10, int i10, dm.b bVar, int i11) {
        if (this.f32194e) {
            throw new IOException("closed");
        }
        b(i10, z10 ? 1 : 0, bVar, i11);
    }

    public final synchronized void a(m peerSettings) {
        kotlin.jvm.internal.n.e(peerSettings, "peerSettings");
        if (this.f32194e) {
            throw new IOException("closed");
        }
        this.f32193d = peerSettings.e(this.f32193d);
        if (peerSettings.b() != -1) {
            this.f32195f.e(peerSettings.b());
        }
        e(0, 0, 4, 1);
        this.f32190a.flush();
    }

    public final void b(int i10, int i11, dm.b bVar, int i12) {
        e(i10, i12, 0, i11);
        if (i12 > 0) {
            dm.c cVar = this.f32190a;
            kotlin.jvm.internal.n.b(bVar);
            cVar.K0(bVar, i12);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f32194e = true;
        this.f32190a.close();
    }

    public final synchronized void d(int i10, long j10) {
        if (this.f32194e) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.n.k("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
        }
        e(i10, 4, 8, 0);
        this.f32190a.writeInt((int) j10);
        this.f32190a.flush();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Logger logger = f32189s;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f32049a.c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f32193d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f32193d + ": " + i11).toString());
        }
        if (!((Integer.MIN_VALUE & i10) == 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.n.k("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        rl.d.Z(this.f32190a, i11);
        this.f32190a.writeByte(i12 & 255);
        this.f32190a.writeByte(i13 & 255);
        this.f32190a.writeInt(i10 & a.e.API_PRIORITY_OTHER);
    }

    public final synchronized void f(int i10, b errorCode, byte[] debugData) {
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        kotlin.jvm.internal.n.e(debugData, "debugData");
        if (this.f32194e) {
            throw new IOException("closed");
        }
        if (!(errorCode.h() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        e(0, debugData.length + 8, 7, 0);
        this.f32190a.writeInt(i10);
        this.f32190a.writeInt(errorCode.h());
        if (!(debugData.length == 0)) {
            this.f32190a.write(debugData);
        }
        this.f32190a.flush();
    }

    public final synchronized void flush() {
        if (this.f32194e) {
            throw new IOException("closed");
        }
        this.f32190a.flush();
    }

    public final synchronized void g(boolean z10, int i10, List<c> headerBlock) {
        kotlin.jvm.internal.n.e(headerBlock, "headerBlock");
        if (this.f32194e) {
            throw new IOException("closed");
        }
        this.f32195f.g(headerBlock);
        long size = this.f32192c.size();
        long min = Math.min(this.f32193d, size);
        int i11 = size == min ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        e(i10, (int) min, 1, i11);
        this.f32190a.K0(this.f32192c, min);
        if (size > min) {
            n(i10, size - min);
        }
    }

    public final synchronized void h(boolean z10, int i10, int i11) {
        if (this.f32194e) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z10 ? 1 : 0);
        this.f32190a.writeInt(i10);
        this.f32190a.writeInt(i11);
        this.f32190a.flush();
    }

    public final synchronized void i(int i10, int i11, List<c> requestHeaders) {
        kotlin.jvm.internal.n.e(requestHeaders, "requestHeaders");
        if (this.f32194e) {
            throw new IOException("closed");
        }
        this.f32195f.g(requestHeaders);
        long size = this.f32192c.size();
        int min = (int) Math.min(this.f32193d - 4, size);
        long j10 = min;
        e(i10, min + 4, 5, size == j10 ? 4 : 0);
        this.f32190a.writeInt(i11 & a.e.API_PRIORITY_OTHER);
        this.f32190a.K0(this.f32192c, j10);
        if (size > j10) {
            n(i10, size - j10);
        }
    }

    public final synchronized void j(int i10, b errorCode) {
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        if (this.f32194e) {
            throw new IOException("closed");
        }
        if (!(errorCode.h() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        e(i10, 4, 3, 0);
        this.f32190a.writeInt(errorCode.h());
        this.f32190a.flush();
    }

    public final synchronized void l(m settings) {
        kotlin.jvm.internal.n.e(settings, "settings");
        if (this.f32194e) {
            throw new IOException("closed");
        }
        int i10 = 0;
        e(0, settings.i() * 6, 4, 0);
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (settings.f(i10)) {
                this.f32190a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                this.f32190a.writeInt(settings.a(i10));
            }
            i10 = i11;
        }
        this.f32190a.flush();
    }

    public final int p0() {
        return this.f32193d;
    }
}
