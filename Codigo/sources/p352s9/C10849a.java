package p352s9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.internal.p496authapi.zbl;
import p379u9.InterfaceC11474a;
import p439x9.InterfaceC12389a;
import p462y9.InterfaceC12653a;
import p484z9.C12835h;

/* renamed from: s9.a */
/* loaded from: classes.dex */
public final class C10849a {

    /* renamed from: a */
    @Deprecated
    public static final C5101a<C10851c> f27518a;

    /* renamed from: b */
    public static final C5101a<a> f27519b;

    /* renamed from: c */
    public static final C5101a<GoogleSignInOptions> f27520c;

    /* renamed from: d */
    @Deprecated
    public static final InterfaceC12389a f27521d;

    /* renamed from: e */
    public static final InterfaceC11474a f27522e;

    /* renamed from: f */
    public static final InterfaceC12653a f27523f;

    /* renamed from: g */
    public static final C5101a.g f27524g;

    /* renamed from: h */
    public static final C5101a.g f27525h;

    /* renamed from: i */
    private static final C5101a.a f27526i;

    /* renamed from: j */
    private static final C5101a.a f27527j;

    @Deprecated
    /* renamed from: s9.a$a */
    /* loaded from: classes.dex */
    public static class a implements C5101a.d {

        /* renamed from: d */
        public static final a f27528d = new a(new C13250a());

        /* renamed from: a */
        private final String f27529a = null;

        /* renamed from: b */
        private final boolean f27530b;

        /* renamed from: c */
        private final String f27531c;

        @Deprecated
        /* renamed from: s9.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13250a {

            /* renamed from: a */
            protected Boolean f27532a;

            /* renamed from: b */
            protected String f27533b;

            public C13250a() {
                this.f27532a = Boolean.FALSE;
            }

            public C13250a(a aVar) {
                this.f27532a = Boolean.FALSE;
                a.m33089b(aVar);
                this.f27532a = Boolean.valueOf(aVar.f27530b);
                this.f27533b = aVar.f27531c;
            }

            /* renamed from: a */
            public final C13250a m33094a(String str) {
                this.f27533b = str;
                return this;
            }
        }

        public a(C13250a c13250a) {
            this.f27530b = c13250a.f27532a.booleanValue();
            this.f27531c = c13250a.f27533b;
        }

        /* renamed from: b */
        static /* bridge */ /* synthetic */ String m33089b(a aVar) {
            String str = aVar.f27529a;
            return null;
        }

        /* renamed from: a */
        public final Bundle m33092a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f27530b);
            bundle.putString("log_session_id", this.f27531c);
            return bundle;
        }

        /* renamed from: d */
        public final String m33093d() {
            return this.f27531c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = aVar.f27529a;
            return C5270q.m13304b(null, null) && this.f27530b == aVar.f27530b && C5270q.m13304b(this.f27531c, aVar.f27531c);
        }

        public int hashCode() {
            return C5270q.m13305c(null, Boolean.valueOf(this.f27530b), this.f27531c);
        }
    }

    static {
        C5101a.g gVar = new C5101a.g();
        f27524g = gVar;
        C5101a.g gVar2 = new C5101a.g();
        f27525h = gVar2;
        C10852d c10852d = new C10852d();
        f27526i = c10852d;
        C10853e c10853e = new C10853e();
        f27527j = c10853e;
        f27518a = C10850b.f27534a;
        f27519b = new C5101a<>("Auth.CREDENTIALS_API", c10852d, gVar);
        f27520c = new C5101a<>("Auth.GOOGLE_SIGN_IN_API", c10853e, gVar2);
        f27521d = C10850b.f27535b;
        f27522e = new zbl();
        f27523f = new C12835h();
    }
}
