package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.k */
/* loaded from: classes.dex */
final class C12432k extends AbstractC12426f0.e.c {

    /* renamed from: a */
    private final int f33564a;

    /* renamed from: b */
    private final String f33565b;

    /* renamed from: c */
    private final int f33566c;

    /* renamed from: d */
    private final long f33567d;

    /* renamed from: e */
    private final long f33568e;

    /* renamed from: f */
    private final boolean f33569f;

    /* renamed from: g */
    private final int f33570g;

    /* renamed from: h */
    private final String f33571h;

    /* renamed from: i */
    private final String f33572i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.k$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.c.a {

        /* renamed from: a */
        private Integer f33573a;

        /* renamed from: b */
        private String f33574b;

        /* renamed from: c */
        private Integer f33575c;

        /* renamed from: d */
        private Long f33576d;

        /* renamed from: e */
        private Long f33577e;

        /* renamed from: f */
        private Boolean f33578f;

        /* renamed from: g */
        private Integer f33579g;

        /* renamed from: h */
        private String f33580h;

        /* renamed from: i */
        private String f33581i;

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: a */
        public AbstractC12426f0.e.c mo40258a() {
            String str = "";
            if (this.f33573a == null) {
                str = " arch";
            }
            if (this.f33574b == null) {
                str = str + " model";
            }
            if (this.f33575c == null) {
                str = str + " cores";
            }
            if (this.f33576d == null) {
                str = str + " ram";
            }
            if (this.f33577e == null) {
                str = str + " diskSpace";
            }
            if (this.f33578f == null) {
                str = str + " simulator";
            }
            if (this.f33579g == null) {
                str = str + " state";
            }
            if (this.f33580h == null) {
                str = str + " manufacturer";
            }
            if (this.f33581i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C12432k(this.f33573a.intValue(), this.f33574b, this.f33575c.intValue(), this.f33576d.longValue(), this.f33577e.longValue(), this.f33578f.booleanValue(), this.f33579g.intValue(), this.f33580h, this.f33581i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: b */
        public AbstractC12426f0.e.c.a mo40259b(int i10) {
            this.f33573a = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: c */
        public AbstractC12426f0.e.c.a mo40260c(int i10) {
            this.f33575c = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: d */
        public AbstractC12426f0.e.c.a mo40261d(long j10) {
            this.f33577e = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: e */
        public AbstractC12426f0.e.c.a mo40262e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f33580h = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: f */
        public AbstractC12426f0.e.c.a mo40263f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f33574b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: g */
        public AbstractC12426f0.e.c.a mo40264g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f33581i = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: h */
        public AbstractC12426f0.e.c.a mo40265h(long j10) {
            this.f33576d = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: i */
        public AbstractC12426f0.e.c.a mo40266i(boolean z10) {
            this.f33578f = Boolean.valueOf(z10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.c.a
        /* renamed from: j */
        public AbstractC12426f0.e.c.a mo40267j(int i10) {
            this.f33579g = Integer.valueOf(i10);
            return this;
        }
    }

    private C12432k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f33564a = i10;
        this.f33565b = str;
        this.f33566c = i11;
        this.f33567d = j10;
        this.f33568e = j11;
        this.f33569f = z10;
        this.f33570g = i12;
        this.f33571h = str2;
        this.f33572i = str3;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: b */
    public int mo40249b() {
        return this.f33564a;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: c */
    public int mo40250c() {
        return this.f33566c;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: d */
    public long mo40251d() {
        return this.f33568e;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: e */
    public String mo40252e() {
        return this.f33571h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.c)) {
            return false;
        }
        AbstractC12426f0.e.c cVar = (AbstractC12426f0.e.c) obj;
        return this.f33564a == cVar.mo40249b() && this.f33565b.equals(cVar.mo40253f()) && this.f33566c == cVar.mo40250c() && this.f33567d == cVar.mo40255h() && this.f33568e == cVar.mo40251d() && this.f33569f == cVar.mo40257j() && this.f33570g == cVar.mo40256i() && this.f33571h.equals(cVar.mo40252e()) && this.f33572i.equals(cVar.mo40254g());
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: f */
    public String mo40253f() {
        return this.f33565b;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: g */
    public String mo40254g() {
        return this.f33572i;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: h */
    public long mo40255h() {
        return this.f33567d;
    }

    public int hashCode() {
        int hashCode = (((((this.f33564a ^ 1000003) * 1000003) ^ this.f33565b.hashCode()) * 1000003) ^ this.f33566c) * 1000003;
        long j10 = this.f33567d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f33568e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f33569f ? 1231 : 1237)) * 1000003) ^ this.f33570g) * 1000003) ^ this.f33571h.hashCode()) * 1000003) ^ this.f33572i.hashCode();
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: i */
    public int mo40256i() {
        return this.f33570g;
    }

    @Override // p442xc.AbstractC12426f0.e.c
    /* renamed from: j */
    public boolean mo40257j() {
        return this.f33569f;
    }

    public String toString() {
        return "Device{arch=" + this.f33564a + ", model=" + this.f33565b + ", cores=" + this.f33566c + ", ram=" + this.f33567d + ", diskSpace=" + this.f33568e + ", simulator=" + this.f33569f + ", state=" + this.f33570g + ", manufacturer=" + this.f33571h + ", modelClass=" + this.f33572i + "}";
    }
}
