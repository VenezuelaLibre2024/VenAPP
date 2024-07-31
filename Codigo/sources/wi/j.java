package wi;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Logger f30133a;

    /* renamed from: b, reason: collision with root package name */
    private final Level f30134b;

    /* loaded from: classes3.dex */
    enum a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);

        private final int bit;

        b(int i10) {
            this.bit = i10;
        }

        public int b() {
            return this.bit;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    j(Level level, Logger logger) {
        this.f30134b = (Level) eb.o.p(level, "level");
        this.f30133a = (Logger) eb.o.p(logger, "logger");
    }

    private boolean a() {
        return this.f30133a.isLoggable(this.f30134b);
    }

    private static String l(dm.b bVar) {
        if (bVar.size() <= 64) {
            return bVar.m0().r();
        }
        return bVar.v0((int) Math.min(bVar.size(), 64L)).r() + "...";
    }

    private static String m(xi.i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.b())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(iVar.a(bVar.b())));
            }
        }
        return enumMap.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar, int i10, dm.b bVar, int i11, boolean z10) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + l(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a aVar, int i10, xi.a aVar2, dm.e eVar) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + aVar2 + " length=" + eVar.B() + " bytes=" + l(new dm.b().b0(eVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a aVar, int i10, List<xi.d> list, boolean z10) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar, long j10) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " PING: ack=false bytes=" + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a aVar, long j10) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " PING: ack=true bytes=" + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(a aVar, int i10, int i11, List<xi.d> list) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(a aVar, int i10, xi.a aVar2) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(a aVar, xi.i iVar) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " SETTINGS: ack=false settings=" + m(iVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(a aVar) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(a aVar, int i10, long j10) {
        if (a()) {
            this.f30133a.log(this.f30134b, aVar + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }
}
