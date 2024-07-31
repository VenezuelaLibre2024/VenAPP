package xc;

import xc.f0;

/* loaded from: classes.dex */
final class a0 extends f0.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f30923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f30924a;

        @Override // xc.f0.e.f.a
        public f0.e.f a() {
            String str = "";
            if (this.f30924a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new a0(this.f30924a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.f.a
        public f0.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f30924a = str;
            return this;
        }
    }

    private a0(String str) {
        this.f30923a = str;
    }

    @Override // xc.f0.e.f
    public String b() {
        return this.f30923a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.f) {
            return this.f30923a.equals(((f0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f30923a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f30923a + "}";
    }
}
