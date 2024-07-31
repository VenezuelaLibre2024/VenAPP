package xc;

import xc.f0;

/* loaded from: classes.dex */
final class z extends f0.e.AbstractC0520e {

    /* renamed from: a, reason: collision with root package name */
    private final int f31174a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31175b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31176c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31177d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.AbstractC0520e.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f31178a;

        /* renamed from: b, reason: collision with root package name */
        private String f31179b;

        /* renamed from: c, reason: collision with root package name */
        private String f31180c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f31181d;

        @Override // xc.f0.e.AbstractC0520e.a
        public f0.e.AbstractC0520e a() {
            String str = "";
            if (this.f31178a == null) {
                str = " platform";
            }
            if (this.f31179b == null) {
                str = str + " version";
            }
            if (this.f31180c == null) {
                str = str + " buildVersion";
            }
            if (this.f31181d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new z(this.f31178a.intValue(), this.f31179b, this.f31180c, this.f31181d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.AbstractC0520e.a
        public f0.e.AbstractC0520e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f31180c = str;
            return this;
        }

        @Override // xc.f0.e.AbstractC0520e.a
        public f0.e.AbstractC0520e.a c(boolean z10) {
            this.f31181d = Boolean.valueOf(z10);
            return this;
        }

        @Override // xc.f0.e.AbstractC0520e.a
        public f0.e.AbstractC0520e.a d(int i10) {
            this.f31178a = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.AbstractC0520e.a
        public f0.e.AbstractC0520e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f31179b = str;
            return this;
        }
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f31174a = i10;
        this.f31175b = str;
        this.f31176c = str2;
        this.f31177d = z10;
    }

    @Override // xc.f0.e.AbstractC0520e
    public String b() {
        return this.f31176c;
    }

    @Override // xc.f0.e.AbstractC0520e
    public int c() {
        return this.f31174a;
    }

    @Override // xc.f0.e.AbstractC0520e
    public String d() {
        return this.f31175b;
    }

    @Override // xc.f0.e.AbstractC0520e
    public boolean e() {
        return this.f31177d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.AbstractC0520e)) {
            return false;
        }
        f0.e.AbstractC0520e abstractC0520e = (f0.e.AbstractC0520e) obj;
        return this.f31174a == abstractC0520e.c() && this.f31175b.equals(abstractC0520e.d()) && this.f31176c.equals(abstractC0520e.b()) && this.f31177d == abstractC0520e.e();
    }

    public int hashCode() {
        return ((((((this.f31174a ^ 1000003) * 1000003) ^ this.f31175b.hashCode()) * 1000003) ^ this.f31176c.hashCode()) * 1000003) ^ (this.f31177d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f31174a + ", version=" + this.f31175b + ", buildVersion=" + this.f31176c + ", jailbroken=" + this.f31177d + "}";
    }
}
