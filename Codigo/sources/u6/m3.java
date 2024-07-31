package u6;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: b */
    public static final m3 f27233b;

    /* renamed from: a */
    private final a f27234a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        public static final a f27235b;

        /* renamed from: a */
        public final LogSessionId f27236a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            f27235b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.f27236a = logSessionId;
        }
    }

    static {
        f27233b = t8.r0.f26744a < 31 ? new m3() : new m3(a.f27235b);
    }

    public m3() {
        this((a) null);
        t8.a.g(t8.r0.f26744a < 31);
    }

    public m3(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private m3(a aVar) {
        this.f27234a = aVar;
    }

    public LogSessionId a() {
        return ((a) t8.a.e(this.f27234a)).f27236a;
    }
}
