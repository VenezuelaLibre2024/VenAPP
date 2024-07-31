package zb;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.v;
import la.t;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final String f32532a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32533b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32534c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32535d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32536e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32537f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32538g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f32539a;

        /* renamed from: b, reason: collision with root package name */
        private String f32540b;

        /* renamed from: c, reason: collision with root package name */
        private String f32541c;

        /* renamed from: d, reason: collision with root package name */
        private String f32542d;

        /* renamed from: e, reason: collision with root package name */
        private String f32543e;

        /* renamed from: f, reason: collision with root package name */
        private String f32544f;

        /* renamed from: g, reason: collision with root package name */
        private String f32545g;

        public p a() {
            return new p(this.f32540b, this.f32539a, this.f32541c, this.f32542d, this.f32543e, this.f32544f, this.f32545g);
        }

        public b b(String str) {
            this.f32539a = s.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f32540b = s.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f32541c = str;
            return this;
        }

        public b e(String str) {
            this.f32542d = str;
            return this;
        }

        public b f(String str) {
            this.f32543e = str;
            return this;
        }

        public b g(String str) {
            this.f32545g = str;
            return this;
        }

        public b h(String str) {
            this.f32544f = str;
            return this;
        }
    }

    private p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.o(!t.b(str), "ApplicationId must be set.");
        this.f32533b = str;
        this.f32532a = str2;
        this.f32534c = str3;
        this.f32535d = str4;
        this.f32536e = str5;
        this.f32537f = str6;
        this.f32538g = str7;
    }

    public static p a(Context context) {
        v vVar = new v(context);
        String a10 = vVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new p(a10, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.f32532a;
    }

    public String c() {
        return this.f32533b;
    }

    public String d() {
        return this.f32534c;
    }

    public String e() {
        return this.f32535d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return com.google.android.gms.common.internal.q.b(this.f32533b, pVar.f32533b) && com.google.android.gms.common.internal.q.b(this.f32532a, pVar.f32532a) && com.google.android.gms.common.internal.q.b(this.f32534c, pVar.f32534c) && com.google.android.gms.common.internal.q.b(this.f32535d, pVar.f32535d) && com.google.android.gms.common.internal.q.b(this.f32536e, pVar.f32536e) && com.google.android.gms.common.internal.q.b(this.f32537f, pVar.f32537f) && com.google.android.gms.common.internal.q.b(this.f32538g, pVar.f32538g);
    }

    public String f() {
        return this.f32536e;
    }

    public String g() {
        return this.f32538g;
    }

    public String h() {
        return this.f32537f;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f32533b, this.f32532a, this.f32534c, this.f32535d, this.f32536e, this.f32537f, this.f32538g);
    }

    public String toString() {
        return com.google.android.gms.common.internal.q.d(this).a("applicationId", this.f32533b).a("apiKey", this.f32532a).a("databaseUrl", this.f32534c).a("gcmSenderId", this.f32536e).a("storageBucket", this.f32537f).a("projectId", this.f32538g).toString();
    }
}
