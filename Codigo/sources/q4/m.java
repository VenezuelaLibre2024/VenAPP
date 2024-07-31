package q4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import i4.e0;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final a f23541g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f23542a;

    /* renamed from: b, reason: collision with root package name */
    private Long f23543b;

    /* renamed from: c, reason: collision with root package name */
    private UUID f23544c;

    /* renamed from: d, reason: collision with root package name */
    private int f23545d;

    /* renamed from: e, reason: collision with root package name */
    private Long f23546e;

    /* renamed from: f, reason: collision with root package name */
    private o f23547f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(e0.l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            o.f23551c.a();
        }

        public final m b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(e0.l());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            m mVar = new m(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            mVar.f23545d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            mVar.l(o.f23551c.b());
            mVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            kotlin.jvm.internal.n.d(fromString, "fromString(sessionIDStr)");
            mVar.j(fromString);
            return mVar;
        }
    }

    public m(Long l10, Long l11, UUID sessionId) {
        kotlin.jvm.internal.n.e(sessionId, "sessionId");
        this.f23542a = l10;
        this.f23543b = l11;
        this.f23544c = sessionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ m(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.g r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.n.d(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.m.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.g):void");
    }

    public final Long b() {
        Long l10 = this.f23546e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int c() {
        return this.f23545d;
    }

    public final UUID d() {
        return this.f23544c;
    }

    public final Long e() {
        return this.f23543b;
    }

    public final long f() {
        Long l10;
        if (this.f23542a == null || (l10 = this.f23543b) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.f23542a.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final o g() {
        return this.f23547f;
    }

    public final void h() {
        this.f23545d++;
    }

    public final void i(Long l10) {
        this.f23546e = l10;
    }

    public final void j(UUID uuid) {
        kotlin.jvm.internal.n.e(uuid, "<set-?>");
        this.f23544c = uuid;
    }

    public final void k(Long l10) {
        this.f23543b = l10;
    }

    public final void l(o oVar) {
        this.f23547f = oVar;
    }

    public final void m() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(e0.l()).edit();
        Long l10 = this.f23542a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.f23543b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f23545d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f23544c.toString());
        edit.apply();
        o oVar = this.f23547f;
        if (oVar == null || oVar == null) {
            return;
        }
        oVar.a();
    }
}
