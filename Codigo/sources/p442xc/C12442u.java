package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.u */
/* loaded from: classes.dex */
final class C12442u extends AbstractC12426f0.e.d.c {

    /* renamed from: a */
    private final Double f33666a;

    /* renamed from: b */
    private final int f33667b;

    /* renamed from: c */
    private final boolean f33668c;

    /* renamed from: d */
    private final int f33669d;

    /* renamed from: e */
    private final long f33670e;

    /* renamed from: f */
    private final long f33671f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.u$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.c.a {

        /* renamed from: a */
        private Double f33672a;

        /* renamed from: b */
        private Integer f33673b;

        /* renamed from: c */
        private Boolean f33674c;

        /* renamed from: d */
        private Integer f33675d;

        /* renamed from: e */
        private Long f33676e;

        /* renamed from: f */
        private Long f33677f;

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: a */
        public AbstractC12426f0.e.d.c mo40381a() {
            String str = "";
            if (this.f33673b == null) {
                str = " batteryVelocity";
            }
            if (this.f33674c == null) {
                str = str + " proximityOn";
            }
            if (this.f33675d == null) {
                str = str + " orientation";
            }
            if (this.f33676e == null) {
                str = str + " ramUsed";
            }
            if (this.f33677f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C12442u(this.f33672a, this.f33673b.intValue(), this.f33674c.booleanValue(), this.f33675d.intValue(), this.f33676e.longValue(), this.f33677f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: b */
        public AbstractC12426f0.e.d.c.a mo40382b(Double d10) {
            this.f33672a = d10;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: c */
        public AbstractC12426f0.e.d.c.a mo40383c(int i10) {
            this.f33673b = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: d */
        public AbstractC12426f0.e.d.c.a mo40384d(long j10) {
            this.f33677f = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: e */
        public AbstractC12426f0.e.d.c.a mo40385e(int i10) {
            this.f33675d = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: f */
        public AbstractC12426f0.e.d.c.a mo40386f(boolean z10) {
            this.f33674c = Boolean.valueOf(z10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.c.a
        /* renamed from: g */
        public AbstractC12426f0.e.d.c.a mo40387g(long j10) {
            this.f33676e = Long.valueOf(j10);
            return this;
        }
    }

    private C12442u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f33666a = d10;
        this.f33667b = i10;
        this.f33668c = z10;
        this.f33669d = i11;
        this.f33670e = j10;
        this.f33671f = j11;
    }

    @Override // p442xc.AbstractC12426f0.e.d.c
    /* renamed from: b */
    public Double mo40375b() {
        return this.f33666a;
    }

    @Override // p442xc.AbstractC12426f0.e.d.c
    /* renamed from: c */
    public int mo40376c() {
        return this.f33667b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.c
    /* renamed from: d */
    public long mo40377d() {
        return this.f33671f;
    }

    @Override // p442xc.AbstractC12426f0.e.d.c
    /* renamed from: e */
    public int mo40378e() {
        return this.f33669d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.c)) {
            return false;
        }
        AbstractC12426f0.e.d.c cVar = (AbstractC12426f0.e.d.c) obj;
        Double d10 = this.f33666a;
        if (d10 != null ? d10.equals(cVar.mo40375b()) : cVar.mo40375b() == null) {
            if (this.f33667b == cVar.mo40376c() && this.f33668c == cVar.mo40380g() && this.f33669d == cVar.mo40378e() && this.f33670e == cVar.mo40379f() && this.f33671f == cVar.mo40377d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p442xc.AbstractC12426f0.e.d.c
    /* renamed from: f */
    public long mo40379f() {
        return this.f33670e;
    }

    @Override // p442xc.AbstractC12426f0.e.d.c
    /* renamed from: g */
    public boolean mo40380g() {
        return this.f33668c;
    }

    public int hashCode() {
        Double d10 = this.f33666a;
        int hashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f33667b) * 1000003) ^ (this.f33668c ? 1231 : 1237)) * 1000003) ^ this.f33669d) * 1000003;
        long j10 = this.f33670e;
        long j11 = this.f33671f;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f33666a + ", batteryVelocity=" + this.f33667b + ", proximityOn=" + this.f33668c + ", orientation=" + this.f33669d + ", ramUsed=" + this.f33670e + ", diskUsed=" + this.f33671f + "}";
    }
}
