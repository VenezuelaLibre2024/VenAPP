package s9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p000authapi.zbl;
import z9.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.common.api.a<c> f25399a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<C0422a> f25400b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f25401c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final x9.a f25402d;

    /* renamed from: e, reason: collision with root package name */
    public static final u9.a f25403e;

    /* renamed from: f, reason: collision with root package name */
    public static final y9.a f25404f;

    /* renamed from: g, reason: collision with root package name */
    public static final a.g f25405g;

    /* renamed from: h, reason: collision with root package name */
    public static final a.g f25406h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.AbstractC0146a f25407i;

    /* renamed from: j, reason: collision with root package name */
    private static final a.AbstractC0146a f25408j;

    @Deprecated
    /* renamed from: s9.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0422a implements a.d {

        /* renamed from: d, reason: collision with root package name */
        public static final C0422a f25409d = new C0422a(new C0423a());

        /* renamed from: a, reason: collision with root package name */
        private final String f25410a = null;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25411b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25412c;

        @Deprecated
        /* renamed from: s9.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0423a {

            /* renamed from: a, reason: collision with root package name */
            protected Boolean f25413a;

            /* renamed from: b, reason: collision with root package name */
            protected String f25414b;

            public C0423a() {
                this.f25413a = Boolean.FALSE;
            }

            public C0423a(C0422a c0422a) {
                this.f25413a = Boolean.FALSE;
                C0422a.b(c0422a);
                this.f25413a = Boolean.valueOf(c0422a.f25411b);
                this.f25414b = c0422a.f25412c;
            }

            public final C0423a a(String str) {
                this.f25414b = str;
                return this;
            }
        }

        public C0422a(C0423a c0423a) {
            this.f25411b = c0423a.f25413a.booleanValue();
            this.f25412c = c0423a.f25414b;
        }

        static /* bridge */ /* synthetic */ String b(C0422a c0422a) {
            String str = c0422a.f25410a;
            return null;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f25411b);
            bundle.putString("log_session_id", this.f25412c);
            return bundle;
        }

        public final String d() {
            return this.f25412c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0422a)) {
                return false;
            }
            C0422a c0422a = (C0422a) obj;
            String str = c0422a.f25410a;
            return q.b(null, null) && this.f25411b == c0422a.f25411b && q.b(this.f25412c, c0422a.f25412c);
        }

        public int hashCode() {
            return q.c(null, Boolean.valueOf(this.f25411b), this.f25412c);
        }
    }

    static {
        a.g gVar = new a.g();
        f25405g = gVar;
        a.g gVar2 = new a.g();
        f25406h = gVar2;
        d dVar = new d();
        f25407i = dVar;
        e eVar = new e();
        f25408j = eVar;
        f25399a = b.f25415a;
        f25400b = new com.google.android.gms.common.api.a<>("Auth.CREDENTIALS_API", dVar, gVar);
        f25401c = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
        f25402d = b.f25416b;
        f25403e = new zbl();
        f25404f = new h();
    }
}
