package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.o */
/* loaded from: classes.dex */
final class C12436o extends AbstractC12426f0.e.d.a.b.AbstractC13275a {

    /* renamed from: a */
    private final long f33618a;

    /* renamed from: b */
    private final long f33619b;

    /* renamed from: c */
    private final String f33620c;

    /* renamed from: d */
    private final String f33621d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.o$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a {

        /* renamed from: a */
        private Long f33622a;

        /* renamed from: b */
        private Long f33623b;

        /* renamed from: c */
        private String f33624c;

        /* renamed from: d */
        private String f33625d;

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.b.AbstractC13275a mo40305a() {
            String str = "";
            if (this.f33622a == null) {
                str = " baseAddress";
            }
            if (this.f33623b == null) {
                str = str + " size";
            }
            if (this.f33624c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C12436o(this.f33622a.longValue(), this.f33623b.longValue(), this.f33624c, this.f33625d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a mo40306b(long j10) {
            this.f33622a = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a mo40307c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f33624c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a mo40308d(long j10) {
            this.f33623b = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a
        /* renamed from: e */
        public AbstractC12426f0.e.d.a.b.AbstractC13275a.AbstractC13276a mo40309e(String str) {
            this.f33625d = str;
            return this;
        }
    }

    private C12436o(long j10, long j11, String str, String str2) {
        this.f33618a = j10;
        this.f33619b = j11;
        this.f33620c = str;
        this.f33621d = str2;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a
    /* renamed from: b */
    public long mo40300b() {
        return this.f33618a;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a
    /* renamed from: c */
    public String mo40301c() {
        return this.f33620c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a
    /* renamed from: d */
    public long mo40302d() {
        return this.f33619b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13275a
    /* renamed from: e */
    public String mo40303e() {
        return this.f33621d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.b.AbstractC13275a)) {
            return false;
        }
        AbstractC12426f0.e.d.a.b.AbstractC13275a abstractC13275a = (AbstractC12426f0.e.d.a.b.AbstractC13275a) obj;
        if (this.f33618a == abstractC13275a.mo40300b() && this.f33619b == abstractC13275a.mo40302d() && this.f33620c.equals(abstractC13275a.mo40301c())) {
            String str = this.f33621d;
            String mo40303e = abstractC13275a.mo40303e();
            if (str == null) {
                if (mo40303e == null) {
                    return true;
                }
            } else if (str.equals(mo40303e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f33618a;
        long j11 = this.f33619b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f33620c.hashCode()) * 1000003;
        String str = this.f33621d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f33618a + ", size=" + this.f33619b + ", name=" + this.f33620c + ", uuid=" + this.f33621d + "}";
    }
}
