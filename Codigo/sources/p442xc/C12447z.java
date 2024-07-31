package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.z */
/* loaded from: classes.dex */
final class C12447z extends AbstractC12426f0.e.AbstractC13288e {

    /* renamed from: a */
    private final int f33694a;

    /* renamed from: b */
    private final String f33695b;

    /* renamed from: c */
    private final String f33696c;

    /* renamed from: d */
    private final boolean f33697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.z$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.AbstractC13288e.a {

        /* renamed from: a */
        private Integer f33698a;

        /* renamed from: b */
        private String f33699b;

        /* renamed from: c */
        private String f33700c;

        /* renamed from: d */
        private Boolean f33701d;

        @Override // p442xc.AbstractC12426f0.e.AbstractC13288e.a
        /* renamed from: a */
        public AbstractC12426f0.e.AbstractC13288e mo40417a() {
            String str = "";
            if (this.f33698a == null) {
                str = " platform";
            }
            if (this.f33699b == null) {
                str = str + " version";
            }
            if (this.f33700c == null) {
                str = str + " buildVersion";
            }
            if (this.f33701d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C12447z(this.f33698a.intValue(), this.f33699b, this.f33700c, this.f33701d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.AbstractC13288e.a
        /* renamed from: b */
        public AbstractC12426f0.e.AbstractC13288e.a mo40418b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f33700c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.AbstractC13288e.a
        /* renamed from: c */
        public AbstractC12426f0.e.AbstractC13288e.a mo40419c(boolean z10) {
            this.f33701d = Boolean.valueOf(z10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.AbstractC13288e.a
        /* renamed from: d */
        public AbstractC12426f0.e.AbstractC13288e.a mo40420d(int i10) {
            this.f33698a = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.AbstractC13288e.a
        /* renamed from: e */
        public AbstractC12426f0.e.AbstractC13288e.a mo40421e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f33699b = str;
            return this;
        }
    }

    private C12447z(int i10, String str, String str2, boolean z10) {
        this.f33694a = i10;
        this.f33695b = str;
        this.f33696c = str2;
        this.f33697d = z10;
    }

    @Override // p442xc.AbstractC12426f0.e.AbstractC13288e
    /* renamed from: b */
    public String mo40413b() {
        return this.f33696c;
    }

    @Override // p442xc.AbstractC12426f0.e.AbstractC13288e
    /* renamed from: c */
    public int mo40414c() {
        return this.f33694a;
    }

    @Override // p442xc.AbstractC12426f0.e.AbstractC13288e
    /* renamed from: d */
    public String mo40415d() {
        return this.f33695b;
    }

    @Override // p442xc.AbstractC12426f0.e.AbstractC13288e
    /* renamed from: e */
    public boolean mo40416e() {
        return this.f33697d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.AbstractC13288e)) {
            return false;
        }
        AbstractC12426f0.e.AbstractC13288e abstractC13288e = (AbstractC12426f0.e.AbstractC13288e) obj;
        return this.f33694a == abstractC13288e.mo40414c() && this.f33695b.equals(abstractC13288e.mo40415d()) && this.f33696c.equals(abstractC13288e.mo40413b()) && this.f33697d == abstractC13288e.mo40416e();
    }

    public int hashCode() {
        return ((((((this.f33694a ^ 1000003) * 1000003) ^ this.f33695b.hashCode()) * 1000003) ^ this.f33696c.hashCode()) * 1000003) ^ (this.f33697d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f33694a + ", version=" + this.f33695b + ", buildVersion=" + this.f33696c + ", jailbroken=" + this.f33697d + "}";
    }
}
