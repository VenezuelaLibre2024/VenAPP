package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.w */
/* loaded from: classes.dex */
final class C12444w extends AbstractC12426f0.e.d.AbstractC13287e {

    /* renamed from: a */
    private final AbstractC12426f0.e.d.AbstractC13287e.b f33680a;

    /* renamed from: b */
    private final String f33681b;

    /* renamed from: c */
    private final String f33682c;

    /* renamed from: d */
    private final long f33683d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.w$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.AbstractC13287e.a {

        /* renamed from: a */
        private AbstractC12426f0.e.d.AbstractC13287e.b f33684a;

        /* renamed from: b */
        private String f33685b;

        /* renamed from: c */
        private String f33686c;

        /* renamed from: d */
        private Long f33687d;

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.a
        /* renamed from: a */
        public AbstractC12426f0.e.d.AbstractC13287e mo40397a() {
            String str = "";
            if (this.f33684a == null) {
                str = " rolloutVariant";
            }
            if (this.f33685b == null) {
                str = str + " parameterKey";
            }
            if (this.f33686c == null) {
                str = str + " parameterValue";
            }
            if (this.f33687d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new C12444w(this.f33684a, this.f33685b, this.f33686c, this.f33687d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.a
        /* renamed from: b */
        public AbstractC12426f0.e.d.AbstractC13287e.a mo40398b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f33685b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.a
        /* renamed from: c */
        public AbstractC12426f0.e.d.AbstractC13287e.a mo40399c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f33686c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.a
        /* renamed from: d */
        public AbstractC12426f0.e.d.AbstractC13287e.a mo40400d(AbstractC12426f0.e.d.AbstractC13287e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f33684a = bVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.a
        /* renamed from: e */
        public AbstractC12426f0.e.d.AbstractC13287e.a mo40401e(long j10) {
            this.f33687d = Long.valueOf(j10);
            return this;
        }
    }

    private C12444w(AbstractC12426f0.e.d.AbstractC13287e.b bVar, String str, String str2, long j10) {
        this.f33680a = bVar;
        this.f33681b = str;
        this.f33682c = str2;
        this.f33683d = j10;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e
    /* renamed from: b */
    public String mo40393b() {
        return this.f33681b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e
    /* renamed from: c */
    public String mo40394c() {
        return this.f33682c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e
    /* renamed from: d */
    public AbstractC12426f0.e.d.AbstractC13287e.b mo40395d() {
        return this.f33680a;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e
    /* renamed from: e */
    public long mo40396e() {
        return this.f33683d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.AbstractC13287e)) {
            return false;
        }
        AbstractC12426f0.e.d.AbstractC13287e abstractC13287e = (AbstractC12426f0.e.d.AbstractC13287e) obj;
        return this.f33680a.equals(abstractC13287e.mo40395d()) && this.f33681b.equals(abstractC13287e.mo40393b()) && this.f33682c.equals(abstractC13287e.mo40394c()) && this.f33683d == abstractC13287e.mo40396e();
    }

    public int hashCode() {
        int hashCode = (((((this.f33680a.hashCode() ^ 1000003) * 1000003) ^ this.f33681b.hashCode()) * 1000003) ^ this.f33682c.hashCode()) * 1000003;
        long j10 = this.f33683d;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f33680a + ", parameterKey=" + this.f33681b + ", parameterValue=" + this.f33682c + ", templateVersion=" + this.f33683d + "}";
    }
}
