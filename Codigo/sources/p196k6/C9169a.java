package p196k6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.InterfaceC9569d;
import p132h6.AbstractC7643m;

/* renamed from: k6.a */
/* loaded from: classes.dex */
public final class C9169a {

    /* renamed from: e */
    private static final C9169a f22131e = new a().m27091b();

    /* renamed from: a */
    private final C9174f f22132a;

    /* renamed from: b */
    private final List<C9172d> f22133b;

    /* renamed from: c */
    private final C9170b f22134c;

    /* renamed from: d */
    private final String f22135d;

    /* renamed from: k6.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C9174f f22136a = null;

        /* renamed from: b */
        private List<C9172d> f22137b = new ArrayList();

        /* renamed from: c */
        private C9170b f22138c = null;

        /* renamed from: d */
        private String f22139d = "";

        a() {
        }

        /* renamed from: a */
        public a m27090a(C9172d c9172d) {
            this.f22137b.add(c9172d);
            return this;
        }

        /* renamed from: b */
        public C9169a m27091b() {
            return new C9169a(this.f22136a, Collections.unmodifiableList(this.f22137b), this.f22138c, this.f22139d);
        }

        /* renamed from: c */
        public a m27092c(String str) {
            this.f22139d = str;
            return this;
        }

        /* renamed from: d */
        public a m27093d(C9170b c9170b) {
            this.f22138c = c9170b;
            return this;
        }

        /* renamed from: e */
        public a m27094e(C9174f c9174f) {
            this.f22136a = c9174f;
            return this;
        }
    }

    C9169a(C9174f c9174f, List<C9172d> list, C9170b c9170b, String str) {
        this.f22132a = c9174f;
        this.f22133b = list;
        this.f22134c = c9170b;
        this.f22135d = str;
    }

    /* renamed from: e */
    public static a m27084e() {
        return new a();
    }

    @InterfaceC9569d(tag = 4)
    /* renamed from: a */
    public String m27085a() {
        return this.f22135d;
    }

    @InterfaceC9569d(tag = 3)
    /* renamed from: b */
    public C9170b m27086b() {
        return this.f22134c;
    }

    @InterfaceC9569d(tag = 2)
    /* renamed from: c */
    public List<C9172d> m27087c() {
        return this.f22133b;
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: d */
    public C9174f m27088d() {
        return this.f22132a;
    }

    /* renamed from: f */
    public byte[] m27089f() {
        return AbstractC7643m.m23221a(this);
    }
}
