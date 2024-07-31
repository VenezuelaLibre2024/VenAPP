package p118g6;

import java.util.List;
import p118g6.AbstractC7461m;

/* renamed from: g6.g */
/* loaded from: classes.dex */
final class C7455g extends AbstractC7461m {

    /* renamed from: a */
    private final long f17434a;

    /* renamed from: b */
    private final long f17435b;

    /* renamed from: c */
    private final AbstractC7459k f17436c;

    /* renamed from: d */
    private final Integer f17437d;

    /* renamed from: e */
    private final String f17438e;

    /* renamed from: f */
    private final List<AbstractC7460l> f17439f;

    /* renamed from: g */
    private final EnumC7464p f17440g;

    /* renamed from: g6.g$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7461m.a {

        /* renamed from: a */
        private Long f17441a;

        /* renamed from: b */
        private Long f17442b;

        /* renamed from: c */
        private AbstractC7459k f17443c;

        /* renamed from: d */
        private Integer f17444d;

        /* renamed from: e */
        private String f17445e;

        /* renamed from: f */
        private List<AbstractC7460l> f17446f;

        /* renamed from: g */
        private EnumC7464p f17447g;

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: a */
        public AbstractC7461m mo22560a() {
            String str = "";
            if (this.f17441a == null) {
                str = " requestTimeMs";
            }
            if (this.f17442b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C7455g(this.f17441a.longValue(), this.f17442b.longValue(), this.f17443c, this.f17444d, this.f17445e, this.f17446f, this.f17447g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: b */
        public AbstractC7461m.a mo22561b(AbstractC7459k abstractC7459k) {
            this.f17443c = abstractC7459k;
            return this;
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: c */
        public AbstractC7461m.a mo22562c(List<AbstractC7460l> list) {
            this.f17446f = list;
            return this;
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: d */
        AbstractC7461m.a mo22563d(Integer num) {
            this.f17444d = num;
            return this;
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: e */
        AbstractC7461m.a mo22564e(String str) {
            this.f17445e = str;
            return this;
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: f */
        public AbstractC7461m.a mo22565f(EnumC7464p enumC7464p) {
            this.f17447g = enumC7464p;
            return this;
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: g */
        public AbstractC7461m.a mo22566g(long j10) {
            this.f17441a = Long.valueOf(j10);
            return this;
        }

        @Override // p118g6.AbstractC7461m.a
        /* renamed from: h */
        public AbstractC7461m.a mo22567h(long j10) {
            this.f17442b = Long.valueOf(j10);
            return this;
        }
    }

    private C7455g(long j10, long j11, AbstractC7459k abstractC7459k, Integer num, String str, List<AbstractC7460l> list, EnumC7464p enumC7464p) {
        this.f17434a = j10;
        this.f17435b = j11;
        this.f17436c = abstractC7459k;
        this.f17437d = num;
        this.f17438e = str;
        this.f17439f = list;
        this.f17440g = enumC7464p;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: b */
    public AbstractC7459k mo22553b() {
        return this.f17436c;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: c */
    public List<AbstractC7460l> mo22554c() {
        return this.f17439f;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: d */
    public Integer mo22555d() {
        return this.f17437d;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: e */
    public String mo22556e() {
        return this.f17438e;
    }

    public boolean equals(Object obj) {
        AbstractC7459k abstractC7459k;
        Integer num;
        String str;
        List<AbstractC7460l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7461m)) {
            return false;
        }
        AbstractC7461m abstractC7461m = (AbstractC7461m) obj;
        if (this.f17434a == abstractC7461m.mo22558g() && this.f17435b == abstractC7461m.mo22559h() && ((abstractC7459k = this.f17436c) != null ? abstractC7459k.equals(abstractC7461m.mo22553b()) : abstractC7461m.mo22553b() == null) && ((num = this.f17437d) != null ? num.equals(abstractC7461m.mo22555d()) : abstractC7461m.mo22555d() == null) && ((str = this.f17438e) != null ? str.equals(abstractC7461m.mo22556e()) : abstractC7461m.mo22556e() == null) && ((list = this.f17439f) != null ? list.equals(abstractC7461m.mo22554c()) : abstractC7461m.mo22554c() == null)) {
            EnumC7464p enumC7464p = this.f17440g;
            EnumC7464p mo22557f = abstractC7461m.mo22557f();
            if (enumC7464p == null) {
                if (mo22557f == null) {
                    return true;
                }
            } else if (enumC7464p.equals(mo22557f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: f */
    public EnumC7464p mo22557f() {
        return this.f17440g;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: g */
    public long mo22558g() {
        return this.f17434a;
    }

    @Override // p118g6.AbstractC7461m
    /* renamed from: h */
    public long mo22559h() {
        return this.f17435b;
    }

    public int hashCode() {
        long j10 = this.f17434a;
        long j11 = this.f17435b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC7459k abstractC7459k = this.f17436c;
        int hashCode = (i10 ^ (abstractC7459k == null ? 0 : abstractC7459k.hashCode())) * 1000003;
        Integer num = this.f17437d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f17438e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC7460l> list = this.f17439f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC7464p enumC7464p = this.f17440g;
        return hashCode4 ^ (enumC7464p != null ? enumC7464p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f17434a + ", requestUptimeMs=" + this.f17435b + ", clientInfo=" + this.f17436c + ", logSource=" + this.f17437d + ", logSourceName=" + this.f17438e + ", logEvents=" + this.f17439f + ", qosTier=" + this.f17440g + "}";
    }
}
