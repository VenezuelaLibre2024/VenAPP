package p485zb;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.C5285v;
import la.C9475t;

/* renamed from: zb.p */
/* loaded from: classes.dex */
public final class C12876p {

    /* renamed from: a */
    private final String f35083a;

    /* renamed from: b */
    private final String f35084b;

    /* renamed from: c */
    private final String f35085c;

    /* renamed from: d */
    private final String f35086d;

    /* renamed from: e */
    private final String f35087e;

    /* renamed from: f */
    private final String f35088f;

    /* renamed from: g */
    private final String f35089g;

    /* renamed from: zb.p$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private String f35090a;

        /* renamed from: b */
        private String f35091b;

        /* renamed from: c */
        private String f35092c;

        /* renamed from: d */
        private String f35093d;

        /* renamed from: e */
        private String f35094e;

        /* renamed from: f */
        private String f35095f;

        /* renamed from: g */
        private String f35096g;

        /* renamed from: a */
        public C12876p m42650a() {
            return new C12876p(this.f35091b, this.f35090a, this.f35092c, this.f35093d, this.f35094e, this.f35095f, this.f35096g);
        }

        /* renamed from: b */
        public b m42651b(String str) {
            this.f35090a = C5276s.m13321g(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public b m42652c(String str) {
            this.f35091b = C5276s.m13321g(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public b m42653d(String str) {
            this.f35092c = str;
            return this;
        }

        /* renamed from: e */
        public b m42654e(String str) {
            this.f35093d = str;
            return this;
        }

        /* renamed from: f */
        public b m42655f(String str) {
            this.f35094e = str;
            return this;
        }

        /* renamed from: g */
        public b m42656g(String str) {
            this.f35096g = str;
            return this;
        }

        /* renamed from: h */
        public b m42657h(String str) {
            this.f35095f = str;
            return this;
        }
    }

    private C12876p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C5276s.m13329o(!C9475t.m28180b(str), "ApplicationId must be set.");
        this.f35084b = str;
        this.f35083a = str2;
        this.f35085c = str3;
        this.f35086d = str4;
        this.f35087e = str5;
        this.f35088f = str6;
        this.f35089g = str7;
    }

    /* renamed from: a */
    public static C12876p m42642a(Context context) {
        C5285v c5285v = new C5285v(context);
        String m13351a = c5285v.m13351a("google_app_id");
        if (TextUtils.isEmpty(m13351a)) {
            return null;
        }
        return new C12876p(m13351a, c5285v.m13351a("google_api_key"), c5285v.m13351a("firebase_database_url"), c5285v.m13351a("ga_trackingId"), c5285v.m13351a("gcm_defaultSenderId"), c5285v.m13351a("google_storage_bucket"), c5285v.m13351a("project_id"));
    }

    /* renamed from: b */
    public String m42643b() {
        return this.f35083a;
    }

    /* renamed from: c */
    public String m42644c() {
        return this.f35084b;
    }

    /* renamed from: d */
    public String m42645d() {
        return this.f35085c;
    }

    /* renamed from: e */
    public String m42646e() {
        return this.f35086d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12876p)) {
            return false;
        }
        C12876p c12876p = (C12876p) obj;
        return C5270q.m13304b(this.f35084b, c12876p.f35084b) && C5270q.m13304b(this.f35083a, c12876p.f35083a) && C5270q.m13304b(this.f35085c, c12876p.f35085c) && C5270q.m13304b(this.f35086d, c12876p.f35086d) && C5270q.m13304b(this.f35087e, c12876p.f35087e) && C5270q.m13304b(this.f35088f, c12876p.f35088f) && C5270q.m13304b(this.f35089g, c12876p.f35089g);
    }

    /* renamed from: f */
    public String m42647f() {
        return this.f35087e;
    }

    /* renamed from: g */
    public String m42648g() {
        return this.f35089g;
    }

    /* renamed from: h */
    public String m42649h() {
        return this.f35088f;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f35084b, this.f35083a, this.f35085c, this.f35086d, this.f35087e, this.f35088f, this.f35089g);
    }

    public String toString() {
        return C5270q.m13306d(this).m13307a("applicationId", this.f35084b).m13307a("apiKey", this.f35083a).m13307a("databaseUrl", this.f35085c).m13307a("gcmSenderId", this.f35087e).m13307a("storageBucket", this.f35088f).m13307a("projectId", this.f35089g).toString();
    }
}
