package xc;

import xc.f0;

/* loaded from: classes.dex */
final class x extends f0.e.d.AbstractC0519e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f31168a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31169b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.AbstractC0519e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31170a;

        /* renamed from: b, reason: collision with root package name */
        private String f31171b;

        @Override // xc.f0.e.d.AbstractC0519e.b.a
        public f0.e.d.AbstractC0519e.b a() {
            String str = "";
            if (this.f31170a == null) {
                str = " rolloutId";
            }
            if (this.f31171b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new x(this.f31170a, this.f31171b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.AbstractC0519e.b.a
        public f0.e.d.AbstractC0519e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f31170a = str;
            return this;
        }

        @Override // xc.f0.e.d.AbstractC0519e.b.a
        public f0.e.d.AbstractC0519e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f31171b = str;
            return this;
        }
    }

    private x(String str, String str2) {
        this.f31168a = str;
        this.f31169b = str2;
    }

    @Override // xc.f0.e.d.AbstractC0519e.b
    public String b() {
        return this.f31168a;
    }

    @Override // xc.f0.e.d.AbstractC0519e.b
    public String c() {
        return this.f31169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0519e.b)) {
            return false;
        }
        f0.e.d.AbstractC0519e.b bVar = (f0.e.d.AbstractC0519e.b) obj;
        return this.f31168a.equals(bVar.b()) && this.f31169b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f31168a.hashCode() ^ 1000003) * 1000003) ^ this.f31169b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f31168a + ", variantId=" + this.f31169b + "}";
    }
}
