package xc;

import xc.f0;

/* loaded from: classes.dex */
final class e extends f0.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f30989a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f30991a;

        /* renamed from: b, reason: collision with root package name */
        private String f30992b;

        @Override // xc.f0.c.a
        public f0.c a() {
            String str = "";
            if (this.f30991a == null) {
                str = " key";
            }
            if (this.f30992b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f30991a, this.f30992b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.c.a
        public f0.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f30991a = str;
            return this;
        }

        @Override // xc.f0.c.a
        public f0.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f30992b = str;
            return this;
        }
    }

    private e(String str, String str2) {
        this.f30989a = str;
        this.f30990b = str2;
    }

    @Override // xc.f0.c
    public String b() {
        return this.f30989a;
    }

    @Override // xc.f0.c
    public String c() {
        return this.f30990b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.c)) {
            return false;
        }
        f0.c cVar = (f0.c) obj;
        return this.f30989a.equals(cVar.b()) && this.f30990b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f30989a.hashCode() ^ 1000003) * 1000003) ^ this.f30990b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f30989a + ", value=" + this.f30990b + "}";
    }
}
