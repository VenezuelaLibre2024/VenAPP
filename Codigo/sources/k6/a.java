package k6;

import h6.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f20349e = new C0320a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f20350a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f20351b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20352c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20353d;

    /* renamed from: k6.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0320a {

        /* renamed from: a, reason: collision with root package name */
        private f f20354a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<d> f20355b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f20356c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f20357d = "";

        C0320a() {
        }

        public C0320a a(d dVar) {
            this.f20355b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f20354a, Collections.unmodifiableList(this.f20355b), this.f20356c, this.f20357d);
        }

        public C0320a c(String str) {
            this.f20357d = str;
            return this;
        }

        public C0320a d(b bVar) {
            this.f20356c = bVar;
            return this;
        }

        public C0320a e(f fVar) {
            this.f20354a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f20350a = fVar;
        this.f20351b = list;
        this.f20352c = bVar;
        this.f20353d = str;
    }

    public static C0320a e() {
        return new C0320a();
    }

    @md.d(tag = 4)
    public String a() {
        return this.f20353d;
    }

    @md.d(tag = 3)
    public b b() {
        return this.f20352c;
    }

    @md.d(tag = 2)
    public List<d> c() {
        return this.f20351b;
    }

    @md.d(tag = 1)
    public f d() {
        return this.f20350a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
