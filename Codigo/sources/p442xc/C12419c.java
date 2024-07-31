package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.c */
/* loaded from: classes.dex */
final class C12419c extends AbstractC12426f0.a {

    /* renamed from: a */
    private final int f33470a;

    /* renamed from: b */
    private final String f33471b;

    /* renamed from: c */
    private final int f33472c;

    /* renamed from: d */
    private final int f33473d;

    /* renamed from: e */
    private final long f33474e;

    /* renamed from: f */
    private final long f33475f;

    /* renamed from: g */
    private final long f33476g;

    /* renamed from: h */
    private final String f33477h;

    /* renamed from: i */
    private final List<AbstractC12426f0.a.AbstractC13271a> f33478i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.a.b {

        /* renamed from: a */
        private Integer f33479a;

        /* renamed from: b */
        private String f33480b;

        /* renamed from: c */
        private Integer f33481c;

        /* renamed from: d */
        private Integer f33482d;

        /* renamed from: e */
        private Long f33483e;

        /* renamed from: f */
        private Long f33484f;

        /* renamed from: g */
        private Long f33485g;

        /* renamed from: h */
        private String f33486h;

        /* renamed from: i */
        private List<AbstractC12426f0.a.AbstractC13271a> f33487i;

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: a */
        public AbstractC12426f0.a mo40137a() {
            String str = "";
            if (this.f33479a == null) {
                str = " pid";
            }
            if (this.f33480b == null) {
                str = str + " processName";
            }
            if (this.f33481c == null) {
                str = str + " reasonCode";
            }
            if (this.f33482d == null) {
                str = str + " importance";
            }
            if (this.f33483e == null) {
                str = str + " pss";
            }
            if (this.f33484f == null) {
                str = str + " rss";
            }
            if (this.f33485g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C12419c(this.f33479a.intValue(), this.f33480b, this.f33481c.intValue(), this.f33482d.intValue(), this.f33483e.longValue(), this.f33484f.longValue(), this.f33485g.longValue(), this.f33486h, this.f33487i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: b */
        public AbstractC12426f0.a.b mo40138b(List<AbstractC12426f0.a.AbstractC13271a> list) {
            this.f33487i = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: c */
        public AbstractC12426f0.a.b mo40139c(int i10) {
            this.f33482d = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: d */
        public AbstractC12426f0.a.b mo40140d(int i10) {
            this.f33479a = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: e */
        public AbstractC12426f0.a.b mo40141e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f33480b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: f */
        public AbstractC12426f0.a.b mo40142f(long j10) {
            this.f33483e = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: g */
        public AbstractC12426f0.a.b mo40143g(int i10) {
            this.f33481c = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: h */
        public AbstractC12426f0.a.b mo40144h(long j10) {
            this.f33484f = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: i */
        public AbstractC12426f0.a.b mo40145i(long j10) {
            this.f33485g = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.b
        /* renamed from: j */
        public AbstractC12426f0.a.b mo40146j(String str) {
            this.f33486h = str;
            return this;
        }
    }

    private C12419c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<AbstractC12426f0.a.AbstractC13271a> list) {
        this.f33470a = i10;
        this.f33471b = str;
        this.f33472c = i11;
        this.f33473d = i12;
        this.f33474e = j10;
        this.f33475f = j11;
        this.f33476g = j12;
        this.f33477h = str2;
        this.f33478i = list;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: b */
    public List<AbstractC12426f0.a.AbstractC13271a> mo40128b() {
        return this.f33478i;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: c */
    public int mo40129c() {
        return this.f33473d;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: d */
    public int mo40130d() {
        return this.f33470a;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: e */
    public String mo40131e() {
        return this.f33471b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.a)) {
            return false;
        }
        AbstractC12426f0.a aVar = (AbstractC12426f0.a) obj;
        if (this.f33470a == aVar.mo40130d() && this.f33471b.equals(aVar.mo40131e()) && this.f33472c == aVar.mo40133g() && this.f33473d == aVar.mo40129c() && this.f33474e == aVar.mo40132f() && this.f33475f == aVar.mo40134h() && this.f33476g == aVar.mo40135i() && ((str = this.f33477h) != null ? str.equals(aVar.mo40136j()) : aVar.mo40136j() == null)) {
            List<AbstractC12426f0.a.AbstractC13271a> list = this.f33478i;
            List<AbstractC12426f0.a.AbstractC13271a> mo40128b = aVar.mo40128b();
            if (list == null) {
                if (mo40128b == null) {
                    return true;
                }
            } else if (list.equals(mo40128b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: f */
    public long mo40132f() {
        return this.f33474e;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: g */
    public int mo40133g() {
        return this.f33472c;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: h */
    public long mo40134h() {
        return this.f33475f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f33470a ^ 1000003) * 1000003) ^ this.f33471b.hashCode()) * 1000003) ^ this.f33472c) * 1000003) ^ this.f33473d) * 1000003;
        long j10 = this.f33474e;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f33475f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f33476g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f33477h;
        int hashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC12426f0.a.AbstractC13271a> list = this.f33478i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: i */
    public long mo40135i() {
        return this.f33476g;
    }

    @Override // p442xc.AbstractC12426f0.a
    /* renamed from: j */
    public String mo40136j() {
        return this.f33477h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f33470a + ", processName=" + this.f33471b + ", reasonCode=" + this.f33472c + ", importance=" + this.f33473d + ", pss=" + this.f33474e + ", rss=" + this.f33475f + ", timestamp=" + this.f33476g + ", traceFile=" + this.f33477h + ", buildIdMappingForArch=" + this.f33478i + "}";
    }
}
