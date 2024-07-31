package xc;

import xc.f0;

/* loaded from: classes.dex */
final class d extends f0.a.AbstractC0503a {

    /* renamed from: a, reason: collision with root package name */
    private final String f30974a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30975b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30976c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.a.AbstractC0503a.AbstractC0504a {

        /* renamed from: a, reason: collision with root package name */
        private String f30977a;

        /* renamed from: b, reason: collision with root package name */
        private String f30978b;

        /* renamed from: c, reason: collision with root package name */
        private String f30979c;

        @Override // xc.f0.a.AbstractC0503a.AbstractC0504a
        public f0.a.AbstractC0503a a() {
            String str = "";
            if (this.f30977a == null) {
                str = " arch";
            }
            if (this.f30978b == null) {
                str = str + " libraryName";
            }
            if (this.f30979c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new d(this.f30977a, this.f30978b, this.f30979c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.a.AbstractC0503a.AbstractC0504a
        public f0.a.AbstractC0503a.AbstractC0504a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f30977a = str;
            return this;
        }

        @Override // xc.f0.a.AbstractC0503a.AbstractC0504a
        public f0.a.AbstractC0503a.AbstractC0504a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f30979c = str;
            return this;
        }

        @Override // xc.f0.a.AbstractC0503a.AbstractC0504a
        public f0.a.AbstractC0503a.AbstractC0504a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f30978b = str;
            return this;
        }
    }

    private d(String str, String str2, String str3) {
        this.f30974a = str;
        this.f30975b = str2;
        this.f30976c = str3;
    }

    @Override // xc.f0.a.AbstractC0503a
    public String b() {
        return this.f30974a;
    }

    @Override // xc.f0.a.AbstractC0503a
    public String c() {
        return this.f30976c;
    }

    @Override // xc.f0.a.AbstractC0503a
    public String d() {
        return this.f30975b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a.AbstractC0503a)) {
            return false;
        }
        f0.a.AbstractC0503a abstractC0503a = (f0.a.AbstractC0503a) obj;
        return this.f30974a.equals(abstractC0503a.b()) && this.f30975b.equals(abstractC0503a.d()) && this.f30976c.equals(abstractC0503a.c());
    }

    public int hashCode() {
        return ((((this.f30974a.hashCode() ^ 1000003) * 1000003) ^ this.f30975b.hashCode()) * 1000003) ^ this.f30976c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f30974a + ", libraryName=" + this.f30975b + ", buildId=" + this.f30976c + "}";
    }
}
