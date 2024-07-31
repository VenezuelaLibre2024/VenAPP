package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private List<b> f14432a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f14433b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14434c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private boolean f14437c = false;

        /* renamed from: a, reason: collision with root package name */
        private List<b> f14435a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private List<String> f14436b = new ArrayList();

        private List<String> f() {
            return this.f14436b;
        }

        private List<b> h() {
            return this.f14435a;
        }

        private boolean j() {
            return this.f14437c;
        }

        public a a(String str) {
            this.f14436b.add(str);
            return this;
        }

        public a b(String str) {
            this.f14435a.add(new b(str, "direct://"));
            return this;
        }

        public a c(String str) {
            this.f14435a.add(new b(str));
            return this;
        }

        public a d(String str, String str2) {
            this.f14435a.add(new b(str2, str));
            return this;
        }

        public d e() {
            return new d(h(), f(), j());
        }

        public a g() {
            return a("<local>");
        }

        public a i() {
            return a("<-loopback>");
        }

        public a k(boolean z10) {
            this.f14437c = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f14438a;

        /* renamed from: b, reason: collision with root package name */
        private String f14439b;

        public b(String str) {
            this("*", str);
        }

        public b(String str, String str2) {
            this.f14438a = str;
            this.f14439b = str2;
        }

        public String a() {
            return this.f14438a;
        }

        public String b() {
            return this.f14439b;
        }
    }

    public d(List<b> list, List<String> list2, boolean z10) {
        this.f14432a = list;
        this.f14433b = list2;
        this.f14434c = z10;
    }

    public List<String> a() {
        return Collections.unmodifiableList(this.f14433b);
    }

    public List<b> b() {
        return Collections.unmodifiableList(this.f14432a);
    }

    public boolean c() {
        return this.f14434c;
    }
}
