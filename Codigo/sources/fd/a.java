package fd;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.analytics.Constants;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f15088a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f15089a;

        /* renamed from: fd.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0244a {

            /* renamed from: a, reason: collision with root package name */
            private final Bundle f15090a;

            public C0244a(String str) {
                Bundle bundle = new Bundle();
                this.f15090a = bundle;
                bundle.putString("apn", str);
            }

            public b a() {
                return new b(this.f15090a);
            }

            public C0244a b(Uri uri) {
                this.f15090a.putParcelable("afl", uri);
                return this;
            }

            public C0244a c(int i10) {
                this.f15090a.putInt("amv", i10);
                return this;
            }
        }

        private b(Bundle bundle) {
            this.f15089a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final gd.g f15091a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f15092b;

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f15093c;

        public c(gd.g gVar) {
            this.f15091a = gVar;
            Bundle bundle = new Bundle();
            this.f15092b = bundle;
            bundle.putString("apiKey", gVar.h().r().b());
            Bundle bundle2 = new Bundle();
            this.f15093c = bundle2;
            bundle.putBundle(Constants.PARAMETERS, bundle2);
        }

        private void l() {
            if (this.f15092b.getString("apiKey") == null) {
                throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
            }
        }

        public a a() {
            gd.g.j(this.f15092b);
            return new a(this.f15092b);
        }

        public Task<fd.d> b(int i10) {
            l();
            this.f15092b.putInt("suffix", i10);
            return this.f15091a.g(this.f15092b);
        }

        public c c(b bVar) {
            this.f15093c.putAll(bVar.f15089a);
            return this;
        }

        public c d(String str) {
            if (str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                this.f15092b.putString("domain", str.replace("https://", ""));
            }
            this.f15092b.putString("domainUriPrefix", str);
            return this;
        }

        public c e(d dVar) {
            this.f15093c.putAll(dVar.f15094a);
            return this;
        }

        public c f(e eVar) {
            this.f15093c.putAll(eVar.f15096a);
            return this;
        }

        public c g(f fVar) {
            this.f15093c.putAll(fVar.f15098a);
            return this;
        }

        public c h(Uri uri) {
            this.f15093c.putParcelable("link", uri);
            return this;
        }

        public c i(Uri uri) {
            this.f15092b.putParcelable("dynamicLink", uri);
            return this;
        }

        public c j(g gVar) {
            this.f15093c.putAll(gVar.f15100a);
            return this;
        }

        public c k(h hVar) {
            this.f15093c.putAll(hVar.f15102a);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        Bundle f15094a;

        /* renamed from: fd.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0245a {

            /* renamed from: a, reason: collision with root package name */
            private final Bundle f15095a = new Bundle();

            public d a() {
                return new d(this.f15095a);
            }

            public C0245a b(String str) {
                this.f15095a.putString("utm_campaign", str);
                return this;
            }

            public C0245a c(String str) {
                this.f15095a.putString("utm_content", str);
                return this;
            }

            public C0245a d(String str) {
                this.f15095a.putString("utm_medium", str);
                return this;
            }

            public C0245a e(String str) {
                this.f15095a.putString("utm_source", str);
                return this;
            }

            public C0245a f(String str) {
                this.f15095a.putString("utm_term", str);
                return this;
            }
        }

        private d(Bundle bundle) {
            this.f15094a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f15096a;

        /* renamed from: fd.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0246a {

            /* renamed from: a, reason: collision with root package name */
            private final Bundle f15097a;

            public C0246a(String str) {
                Bundle bundle = new Bundle();
                this.f15097a = bundle;
                bundle.putString("ibi", str);
            }

            public e a() {
                return new e(this.f15097a);
            }

            public C0246a b(String str) {
                this.f15097a.putString("isi", str);
                return this;
            }

            public C0246a c(String str) {
                this.f15097a.putString("ius", str);
                return this;
            }

            public C0246a d(Uri uri) {
                this.f15097a.putParcelable("ifl", uri);
                return this;
            }

            public C0246a e(String str) {
                this.f15097a.putString("ipbi", str);
                return this;
            }

            public C0246a f(Uri uri) {
                this.f15097a.putParcelable("ipfl", uri);
                return this;
            }

            public C0246a g(String str) {
                this.f15097a.putString("imv", str);
                return this;
            }
        }

        private e(Bundle bundle) {
            this.f15096a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f15098a;

        /* renamed from: fd.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0247a {

            /* renamed from: a, reason: collision with root package name */
            private final Bundle f15099a = new Bundle();

            public f a() {
                return new f(this.f15099a);
            }

            public C0247a b(String str) {
                this.f15099a.putString("at", str);
                return this;
            }

            public C0247a c(String str) {
                this.f15099a.putString("ct", str);
                return this;
            }

            public C0247a d(String str) {
                this.f15099a.putString("pt", str);
                return this;
            }
        }

        private f(Bundle bundle) {
            this.f15098a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f15100a;

        /* renamed from: fd.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0248a {

            /* renamed from: a, reason: collision with root package name */
            private final Bundle f15101a = new Bundle();

            public g a() {
                return new g(this.f15101a);
            }

            public C0248a b(boolean z10) {
                this.f15101a.putInt("efr", z10 ? 1 : 0);
                return this;
            }
        }

        private g(Bundle bundle) {
            this.f15100a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f15102a;

        /* renamed from: fd.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0249a {

            /* renamed from: a, reason: collision with root package name */
            private final Bundle f15103a = new Bundle();

            public h a() {
                return new h(this.f15103a);
            }

            public C0249a b(String str) {
                this.f15103a.putString("sd", str);
                return this;
            }

            public C0249a c(Uri uri) {
                this.f15103a.putParcelable("si", uri);
                return this;
            }

            public C0249a d(String str) {
                this.f15103a.putString("st", str);
                return this;
            }
        }

        private h(Bundle bundle) {
            this.f15102a = bundle;
        }
    }

    a(Bundle bundle) {
        this.f15088a = bundle;
    }

    public Uri a() {
        return gd.g.f(this.f15088a);
    }
}
