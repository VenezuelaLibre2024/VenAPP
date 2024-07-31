package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class r extends f0.e.d.a.b.AbstractC0513e {

    /* renamed from: a, reason: collision with root package name */
    private final String f31122a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31123b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> f31124c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.b.AbstractC0513e.AbstractC0514a {

        /* renamed from: a, reason: collision with root package name */
        private String f31125a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f31126b;

        /* renamed from: c, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> f31127c;

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public f0.e.d.a.b.AbstractC0513e a() {
            String str = "";
            if (this.f31125a == null) {
                str = " name";
            }
            if (this.f31126b == null) {
                str = str + " importance";
            }
            if (this.f31127c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f31125a, this.f31126b.intValue(), this.f31127c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0514a b(List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f31127c = list;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0514a c(int i10) {
            this.f31126b = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0514a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f31125a = str;
            return this;
        }
    }

    private r(String str, int i10, List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> list) {
        this.f31122a = str;
        this.f31123b = i10;
        this.f31124c = list;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e
    public List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> b() {
        return this.f31124c;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e
    public int c() {
        return this.f31123b;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e
    public String d() {
        return this.f31122a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0513e)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0513e abstractC0513e = (f0.e.d.a.b.AbstractC0513e) obj;
        return this.f31122a.equals(abstractC0513e.d()) && this.f31123b == abstractC0513e.c() && this.f31124c.equals(abstractC0513e.b());
    }

    public int hashCode() {
        return ((((this.f31122a.hashCode() ^ 1000003) * 1000003) ^ this.f31123b) * 1000003) ^ this.f31124c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f31122a + ", importance=" + this.f31123b + ", frames=" + this.f31124c + "}";
    }
}
