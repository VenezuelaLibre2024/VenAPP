package p425wi;

import dm.C7056b;
import dm.C7061e;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import p448xi.C12491d;
import p448xi.C12496i;
import p448xi.EnumC12488a;

/* renamed from: wi.j */
/* loaded from: classes3.dex */
class C12209j {

    /* renamed from: a */
    private final Logger f32645a;

    /* renamed from: b */
    private final Level f32646b;

    /* renamed from: wi.j$a */
    /* loaded from: classes3.dex */
    enum a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wi.j$b */
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

        /* renamed from: b */
        public int m39302b() {
            return this.bit;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12209j(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    C12209j(Level level, Logger logger) {
        this.f32646b = (Level) C7159o.m21313p(level, "level");
        this.f32645a = (Logger) C7159o.m21313p(logger, "logger");
    }

    /* renamed from: a */
    private boolean m39289a() {
        return this.f32645a.isLoggable(this.f32646b);
    }

    /* renamed from: l */
    private static String m39290l(C7056b c7056b) {
        if (c7056b.size() <= 64) {
            return c7056b.m20730m0().mo20770r();
        }
        return c7056b.m20738v0((int) Math.min(c7056b.size(), 64L)).mo20770r() + "...";
    }

    /* renamed from: m */
    private static String m39291m(C12496i c12496i) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (c12496i.m40918d(bVar.m39302b())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(c12496i.m40915a(bVar.m39302b())));
            }
        }
        return enumMap.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m39292b(a aVar, int i10, C7056b c7056b, int i11, boolean z10) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + m39290l(c7056b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m39293c(a aVar, int i10, EnumC12488a enumC12488a, C7061e c7061e) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + enumC12488a + " length=" + c7061e.m20756B() + " bytes=" + m39290l(new C7056b().mo20715b0(c7061e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m39294d(a aVar, int i10, List<C12491d> list, boolean z10) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39295e(a aVar, long j10) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " PING: ack=false bytes=" + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39296f(a aVar, long j10) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " PING: ack=true bytes=" + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m39297g(a aVar, int i10, int i11, List<C12491d> list) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m39298h(a aVar, int i10, EnumC12488a enumC12488a) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " RST_STREAM: streamId=" + i10 + " errorCode=" + enumC12488a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m39299i(a aVar, C12496i c12496i) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " SETTINGS: ack=false settings=" + m39291m(c12496i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m39300j(a aVar) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m39301k(a aVar, int i10, long j10) {
        if (m39289a()) {
            this.f32645a.log(this.f32646b, aVar + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }
}
