package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class m extends f0.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final f0.e.d.a.b f31074a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f0.c> f31075b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f0.c> f31076c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f31077d;

    /* renamed from: e, reason: collision with root package name */
    private final f0.e.d.a.c f31078e;

    /* renamed from: f, reason: collision with root package name */
    private final List<f0.e.d.a.c> f31079f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31080g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.AbstractC0506a {

        /* renamed from: a, reason: collision with root package name */
        private f0.e.d.a.b f31081a;

        /* renamed from: b, reason: collision with root package name */
        private List<f0.c> f31082b;

        /* renamed from: c, reason: collision with root package name */
        private List<f0.c> f31083c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f31084d;

        /* renamed from: e, reason: collision with root package name */
        private f0.e.d.a.c f31085e;

        /* renamed from: f, reason: collision with root package name */
        private List<f0.e.d.a.c> f31086f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f31087g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(f0.e.d.a aVar) {
            this.f31081a = aVar.f();
            this.f31082b = aVar.e();
            this.f31083c = aVar.g();
            this.f31084d = aVar.c();
            this.f31085e = aVar.d();
            this.f31086f = aVar.b();
            this.f31087g = Integer.valueOf(aVar.h());
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a a() {
            String str = "";
            if (this.f31081a == null) {
                str = " execution";
            }
            if (this.f31087g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f31081a, this.f31082b, this.f31083c, this.f31084d, this.f31085e, this.f31086f, this.f31087g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a b(List<f0.e.d.a.c> list) {
            this.f31086f = list;
            return this;
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a c(Boolean bool) {
            this.f31084d = bool;
            return this;
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a d(f0.e.d.a.c cVar) {
            this.f31085e = cVar;
            return this;
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a e(List<f0.c> list) {
            this.f31082b = list;
            return this;
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a f(f0.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f31081a = bVar;
            return this;
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a g(List<f0.c> list) {
            this.f31083c = list;
            return this;
        }

        @Override // xc.f0.e.d.a.AbstractC0506a
        public f0.e.d.a.AbstractC0506a h(int i10) {
            this.f31087g = Integer.valueOf(i10);
            return this;
        }
    }

    private m(f0.e.d.a.b bVar, List<f0.c> list, List<f0.c> list2, Boolean bool, f0.e.d.a.c cVar, List<f0.e.d.a.c> list3, int i10) {
        this.f31074a = bVar;
        this.f31075b = list;
        this.f31076c = list2;
        this.f31077d = bool;
        this.f31078e = cVar;
        this.f31079f = list3;
        this.f31080g = i10;
    }

    @Override // xc.f0.e.d.a
    public List<f0.e.d.a.c> b() {
        return this.f31079f;
    }

    @Override // xc.f0.e.d.a
    public Boolean c() {
        return this.f31077d;
    }

    @Override // xc.f0.e.d.a
    public f0.e.d.a.c d() {
        return this.f31078e;
    }

    @Override // xc.f0.e.d.a
    public List<f0.c> e() {
        return this.f31075b;
    }

    public boolean equals(Object obj) {
        List<f0.c> list;
        List<f0.c> list2;
        Boolean bool;
        f0.e.d.a.c cVar;
        List<f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a)) {
            return false;
        }
        f0.e.d.a aVar = (f0.e.d.a) obj;
        return this.f31074a.equals(aVar.f()) && ((list = this.f31075b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f31076c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f31077d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f31078e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f31079f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f31080g == aVar.h();
    }

    @Override // xc.f0.e.d.a
    public f0.e.d.a.b f() {
        return this.f31074a;
    }

    @Override // xc.f0.e.d.a
    public List<f0.c> g() {
        return this.f31076c;
    }

    @Override // xc.f0.e.d.a
    public int h() {
        return this.f31080g;
    }

    public int hashCode() {
        int hashCode = (this.f31074a.hashCode() ^ 1000003) * 1000003;
        List<f0.c> list = this.f31075b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.c> list2 = this.f31076c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f31077d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.e.d.a.c cVar = this.f31078e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d.a.c> list3 = this.f31079f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f31080g;
    }

    @Override // xc.f0.e.d.a
    public f0.e.d.a.AbstractC0506a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f31074a + ", customAttributes=" + this.f31075b + ", internalKeys=" + this.f31076c + ", background=" + this.f31077d + ", currentProcessDetails=" + this.f31078e + ", appProcessDetails=" + this.f31079f + ", uiOrientation=" + this.f31080g + "}";
    }
}
