package p105fd;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import gd.C7551g;
import io.flutter.plugins.firebase.analytics.Constants;

/* renamed from: fd.a */
/* loaded from: classes.dex */
public final class C7328a {

    /* renamed from: a */
    private final Bundle f16511a;

    /* renamed from: fd.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final Bundle f16512a;

        /* renamed from: fd.a$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private final Bundle f16513a;

            public a(String str) {
                Bundle bundle = new Bundle();
                this.f16513a = bundle;
                bundle.putString("apn", str);
            }

            /* renamed from: a */
            public b m21983a() {
                return new b(this.f16513a);
            }

            /* renamed from: b */
            public a m21984b(Uri uri) {
                this.f16513a.putParcelable("afl", uri);
                return this;
            }

            /* renamed from: c */
            public a m21985c(int i10) {
                this.f16513a.putInt("amv", i10);
                return this;
            }
        }

        private b(Bundle bundle) {
            this.f16512a = bundle;
        }
    }

    /* renamed from: fd.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final C7551g f16514a;

        /* renamed from: b */
        private final Bundle f16515b;

        /* renamed from: c */
        private final Bundle f16516c;

        public c(C7551g c7551g) {
            this.f16514a = c7551g;
            Bundle bundle = new Bundle();
            this.f16515b = bundle;
            bundle.putString("apiKey", c7551g.m22923h().m42632r().m42643b());
            Bundle bundle2 = new Bundle();
            this.f16516c = bundle2;
            bundle.putBundle(Constants.PARAMETERS, bundle2);
        }

        /* renamed from: l */
        private void m21986l() {
            if (this.f16515b.getString("apiKey") == null) {
                throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
            }
        }

        /* renamed from: a */
        public C7328a m21987a() {
            C7551g.m22921j(this.f16515b);
            return new C7328a(this.f16515b);
        }

        /* renamed from: b */
        public Task<InterfaceC7331d> m21988b(int i10) {
            m21986l();
            this.f16515b.putInt("suffix", i10);
            return this.f16514a.m22922g(this.f16515b);
        }

        /* renamed from: c */
        public c m21989c(b bVar) {
            this.f16516c.putAll(bVar.f16512a);
            return this;
        }

        /* renamed from: d */
        public c m21990d(String str) {
            if (str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                this.f16515b.putString("domain", str.replace("https://", ""));
            }
            this.f16515b.putString("domainUriPrefix", str);
            return this;
        }

        /* renamed from: e */
        public c m21991e(d dVar) {
            this.f16516c.putAll(dVar.f16517a);
            return this;
        }

        /* renamed from: f */
        public c m21992f(e eVar) {
            this.f16516c.putAll(eVar.f16519a);
            return this;
        }

        /* renamed from: g */
        public c m21993g(f fVar) {
            this.f16516c.putAll(fVar.f16521a);
            return this;
        }

        /* renamed from: h */
        public c m21994h(Uri uri) {
            this.f16516c.putParcelable("link", uri);
            return this;
        }

        /* renamed from: i */
        public c m21995i(Uri uri) {
            this.f16515b.putParcelable("dynamicLink", uri);
            return this;
        }

        /* renamed from: j */
        public c m21996j(g gVar) {
            this.f16516c.putAll(gVar.f16523a);
            return this;
        }

        /* renamed from: k */
        public c m21997k(h hVar) {
            this.f16516c.putAll(hVar.f16525a);
            return this;
        }
    }

    /* renamed from: fd.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        Bundle f16517a;

        /* renamed from: fd.a$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private final Bundle f16518a = new Bundle();

            /* renamed from: a */
            public d m21998a() {
                return new d(this.f16518a);
            }

            /* renamed from: b */
            public a m21999b(String str) {
                this.f16518a.putString("utm_campaign", str);
                return this;
            }

            /* renamed from: c */
            public a m22000c(String str) {
                this.f16518a.putString("utm_content", str);
                return this;
            }

            /* renamed from: d */
            public a m22001d(String str) {
                this.f16518a.putString("utm_medium", str);
                return this;
            }

            /* renamed from: e */
            public a m22002e(String str) {
                this.f16518a.putString("utm_source", str);
                return this;
            }

            /* renamed from: f */
            public a m22003f(String str) {
                this.f16518a.putString("utm_term", str);
                return this;
            }
        }

        private d(Bundle bundle) {
            this.f16517a = bundle;
        }
    }

    /* renamed from: fd.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        final Bundle f16519a;

        /* renamed from: fd.a$e$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private final Bundle f16520a;

            public a(String str) {
                Bundle bundle = new Bundle();
                this.f16520a = bundle;
                bundle.putString("ibi", str);
            }

            /* renamed from: a */
            public e m22004a() {
                return new e(this.f16520a);
            }

            /* renamed from: b */
            public a m22005b(String str) {
                this.f16520a.putString("isi", str);
                return this;
            }

            /* renamed from: c */
            public a m22006c(String str) {
                this.f16520a.putString("ius", str);
                return this;
            }

            /* renamed from: d */
            public a m22007d(Uri uri) {
                this.f16520a.putParcelable("ifl", uri);
                return this;
            }

            /* renamed from: e */
            public a m22008e(String str) {
                this.f16520a.putString("ipbi", str);
                return this;
            }

            /* renamed from: f */
            public a m22009f(Uri uri) {
                this.f16520a.putParcelable("ipfl", uri);
                return this;
            }

            /* renamed from: g */
            public a m22010g(String str) {
                this.f16520a.putString("imv", str);
                return this;
            }
        }

        private e(Bundle bundle) {
            this.f16519a = bundle;
        }
    }

    /* renamed from: fd.a$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        final Bundle f16521a;

        /* renamed from: fd.a$f$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private final Bundle f16522a = new Bundle();

            /* renamed from: a */
            public f m22011a() {
                return new f(this.f16522a);
            }

            /* renamed from: b */
            public a m22012b(String str) {
                this.f16522a.putString("at", str);
                return this;
            }

            /* renamed from: c */
            public a m22013c(String str) {
                this.f16522a.putString("ct", str);
                return this;
            }

            /* renamed from: d */
            public a m22014d(String str) {
                this.f16522a.putString("pt", str);
                return this;
            }
        }

        private f(Bundle bundle) {
            this.f16521a = bundle;
        }
    }

    /* renamed from: fd.a$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        final Bundle f16523a;

        /* renamed from: fd.a$g$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private final Bundle f16524a = new Bundle();

            /* renamed from: a */
            public g m22015a() {
                return new g(this.f16524a);
            }

            /* renamed from: b */
            public a m22016b(boolean z10) {
                this.f16524a.putInt("efr", z10 ? 1 : 0);
                return this;
            }
        }

        private g(Bundle bundle) {
            this.f16523a = bundle;
        }
    }

    /* renamed from: fd.a$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        final Bundle f16525a;

        /* renamed from: fd.a$h$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private final Bundle f16526a = new Bundle();

            /* renamed from: a */
            public h m22017a() {
                return new h(this.f16526a);
            }

            /* renamed from: b */
            public a m22018b(String str) {
                this.f16526a.putString("sd", str);
                return this;
            }

            /* renamed from: c */
            public a m22019c(Uri uri) {
                this.f16526a.putParcelable("si", uri);
                return this;
            }

            /* renamed from: d */
            public a m22020d(String str) {
                this.f16526a.putString("st", str);
                return this;
            }
        }

        private h(Bundle bundle) {
            this.f16525a = bundle;
        }
    }

    C7328a(Bundle bundle) {
        this.f16511a = bundle;
    }

    /* renamed from: a */
    public Uri m21982a() {
        return C7551g.m22920f(this.f16511a);
    }
}
