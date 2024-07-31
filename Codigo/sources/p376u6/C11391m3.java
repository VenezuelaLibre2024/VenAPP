package p376u6;

import android.media.metrics.LogSessionId;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: u6.m3 */
/* loaded from: classes.dex */
public final class C11391m3 {

    /* renamed from: b */
    public static final C11391m3 f29536b;

    /* renamed from: a */
    private final a f29537a;

    /* renamed from: u6.m3$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: b */
        public static final a f29538b;

        /* renamed from: a */
        public final LogSessionId f29539a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            f29538b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.f29539a = logSessionId;
        }
    }

    static {
        f29536b = C11172r0.f29040a < 31 ? new C11391m3() : new C11391m3(a.f29538b);
    }

    public C11391m3() {
        this((a) null);
        C11137a.m34605g(C11172r0.f29040a < 31);
    }

    public C11391m3(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private C11391m3(a aVar) {
        this.f29537a = aVar;
    }

    /* renamed from: a */
    public LogSessionId m35573a() {
        return ((a) C11137a.m34603e(this.f29537a)).f29539a;
    }
}
