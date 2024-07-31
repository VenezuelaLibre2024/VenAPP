package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.s */
/* loaded from: classes.dex */
final class C12440s extends AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b {

    /* renamed from: a */
    private final long f33648a;

    /* renamed from: b */
    private final String f33649b;

    /* renamed from: c */
    private final String f33650c;

    /* renamed from: d */
    private final long f33651d;

    /* renamed from: e */
    private final int f33652e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.s$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a {

        /* renamed from: a */
        private Long f33653a;

        /* renamed from: b */
        private String f33654b;

        /* renamed from: c */
        private String f33655c;

        /* renamed from: d */
        private Long f33656d;

        /* renamed from: e */
        private Integer f33657e;

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b mo40351a() {
            String str = "";
            if (this.f33653a == null) {
                str = " pc";
            }
            if (this.f33654b == null) {
                str = str + " symbol";
            }
            if (this.f33656d == null) {
                str = str + " offset";
            }
            if (this.f33657e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C12440s(this.f33653a.longValue(), this.f33654b, this.f33655c, this.f33656d.longValue(), this.f33657e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a mo40352b(String str) {
            this.f33655c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a mo40353c(int i10) {
            this.f33657e = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a mo40354d(long j10) {
            this.f33656d = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a
        /* renamed from: e */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a mo40355e(long j10) {
            this.f33653a = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a
        /* renamed from: f */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a mo40356f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f33654b = str;
            return this;
        }
    }

    private C12440s(long j10, String str, String str2, long j11, int i10) {
        this.f33648a = j10;
        this.f33649b = str;
        this.f33650c = str2;
        this.f33651d = j11;
        this.f33652e = i10;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b
    /* renamed from: b */
    public String mo40346b() {
        return this.f33650c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b
    /* renamed from: c */
    public int mo40347c() {
        return this.f33652e;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b
    /* renamed from: d */
    public long mo40348d() {
        return this.f33651d;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b
    /* renamed from: e */
    public long mo40349e() {
        return this.f33648a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b)) {
            return false;
        }
        AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b abstractC13283b = (AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b) obj;
        return this.f33648a == abstractC13283b.mo40349e() && this.f33649b.equals(abstractC13283b.mo40350f()) && ((str = this.f33650c) != null ? str.equals(abstractC13283b.mo40346b()) : abstractC13283b.mo40346b() == null) && this.f33651d == abstractC13283b.mo40348d() && this.f33652e == abstractC13283b.mo40347c();
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b
    /* renamed from: f */
    public String mo40350f() {
        return this.f33649b;
    }

    public int hashCode() {
        long j10 = this.f33648a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f33649b.hashCode()) * 1000003;
        String str = this.f33650c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f33651d;
        return ((hashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f33652e;
    }

    public String toString() {
        return "Frame{pc=" + this.f33648a + ", symbol=" + this.f33649b + ", file=" + this.f33650c + ", offset=" + this.f33651d + ", importance=" + this.f33652e + "}";
    }
}
