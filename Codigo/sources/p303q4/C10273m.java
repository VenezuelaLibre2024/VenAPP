package p303q4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: q4.m */
/* loaded from: classes.dex */
public final class C10273m {

    /* renamed from: g */
    public static final a f25509g = new a(null);

    /* renamed from: a */
    private final Long f25510a;

    /* renamed from: b */
    private Long f25511b;

    /* renamed from: c */
    private UUID f25512c;

    /* renamed from: d */
    private int f25513d;

    /* renamed from: e */
    private Long f25514e;

    /* renamed from: f */
    private C10275o f25515f;

    /* renamed from: q4.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m30783a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            C10275o.f25519c.m30791a();
        }

        /* renamed from: b */
        public final C10273m m30784b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            C10273m c10273m = new C10273m(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            c10273m.f25513d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            c10273m.m30781l(C10275o.f25519c.m30792b());
            c10273m.m30778i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            C9322n.m27780d(fromString, "fromString(sessionIDStr)");
            c10273m.m30779j(fromString);
            return c10273m;
        }
    }

    public C10273m(Long l10, Long l11, UUID sessionId) {
        C9322n.m27781e(sessionId, "sessionId");
        this.f25510a = l10;
        this.f25511b = l11;
        this.f25512c = sessionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C10273m(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.C9315g r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.C9322n.m27780d(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p303q4.C10273m.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.g):void");
    }

    /* renamed from: b */
    public final Long m30771b() {
        Long l10 = this.f25514e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    /* renamed from: c */
    public final int m30772c() {
        return this.f25513d;
    }

    /* renamed from: d */
    public final UUID m30773d() {
        return this.f25512c;
    }

    /* renamed from: e */
    public final Long m30774e() {
        return this.f25511b;
    }

    /* renamed from: f */
    public final long m30775f() {
        Long l10;
        if (this.f25510a == null || (l10 = this.f25511b) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.f25510a.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public final C10275o m30776g() {
        return this.f25515f;
    }

    /* renamed from: h */
    public final void m30777h() {
        this.f25513d++;
    }

    /* renamed from: i */
    public final void m30778i(Long l10) {
        this.f25514e = l10;
    }

    /* renamed from: j */
    public final void m30779j(UUID uuid) {
        C9322n.m27781e(uuid, "<set-?>");
        this.f25512c = uuid;
    }

    /* renamed from: k */
    public final void m30780k(Long l10) {
        this.f25511b = l10;
    }

    /* renamed from: l */
    public final void m30781l(C10275o c10275o) {
        this.f25515f = c10275o;
    }

    /* renamed from: m */
    public final void m30782m() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l()).edit();
        Long l10 = this.f25510a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.f25511b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f25513d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f25512c.toString());
        edit.apply();
        C10275o c10275o = this.f25515f;
        if (c10275o == null || c10275o == null) {
            return;
        }
        c10275o.m30790a();
    }
}
