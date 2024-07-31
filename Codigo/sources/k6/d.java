package k6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f20366c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f20367a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f20368b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f20369a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f20370b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f20369a, Collections.unmodifiableList(this.f20370b));
        }

        public a b(List<c> list) {
            this.f20370b = list;
            return this;
        }

        public a c(String str) {
            this.f20369a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f20367a = str;
        this.f20368b = list;
    }

    public static a c() {
        return new a();
    }

    @md.d(tag = 2)
    public List<c> a() {
        return this.f20368b;
    }

    @md.d(tag = 1)
    public String b() {
        return this.f20367a;
    }
}
