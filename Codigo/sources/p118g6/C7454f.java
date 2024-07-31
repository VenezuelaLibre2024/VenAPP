package p118g6;

import java.util.Arrays;
import p118g6.AbstractC7460l;

/* renamed from: g6.f */
/* loaded from: classes.dex */
final class C7454f extends AbstractC7460l {

    /* renamed from: a */
    private final long f17420a;

    /* renamed from: b */
    private final Integer f17421b;

    /* renamed from: c */
    private final long f17422c;

    /* renamed from: d */
    private final byte[] f17423d;

    /* renamed from: e */
    private final String f17424e;

    /* renamed from: f */
    private final long f17425f;

    /* renamed from: g */
    private final AbstractC7463o f17426g;

    /* renamed from: g6.f$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7460l.a {

        /* renamed from: a */
        private Long f17427a;

        /* renamed from: b */
        private Integer f17428b;

        /* renamed from: c */
        private Long f17429c;

        /* renamed from: d */
        private byte[] f17430d;

        /* renamed from: e */
        private String f17431e;

        /* renamed from: f */
        private Long f17432f;

        /* renamed from: g */
        private AbstractC7463o f17433g;

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: a */
        public AbstractC7460l mo22545a() {
            String str = "";
            if (this.f17427a == null) {
                str = " eventTimeMs";
            }
            if (this.f17429c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f17432f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C7454f(this.f17427a.longValue(), this.f17428b, this.f17429c.longValue(), this.f17430d, this.f17431e, this.f17432f.longValue(), this.f17433g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: b */
        public AbstractC7460l.a mo22546b(Integer num) {
            this.f17428b = num;
            return this;
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: c */
        public AbstractC7460l.a mo22547c(long j10) {
            this.f17427a = Long.valueOf(j10);
            return this;
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: d */
        public AbstractC7460l.a mo22548d(long j10) {
            this.f17429c = Long.valueOf(j10);
            return this;
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: e */
        public AbstractC7460l.a mo22549e(AbstractC7463o abstractC7463o) {
            this.f17433g = abstractC7463o;
            return this;
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: f */
        AbstractC7460l.a mo22550f(byte[] bArr) {
            this.f17430d = bArr;
            return this;
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: g */
        AbstractC7460l.a mo22551g(String str) {
            this.f17431e = str;
            return this;
        }

        @Override // p118g6.AbstractC7460l.a
        /* renamed from: h */
        public AbstractC7460l.a mo22552h(long j10) {
            this.f17432f = Long.valueOf(j10);
            return this;
        }
    }

    private C7454f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC7463o abstractC7463o) {
        this.f17420a = j10;
        this.f17421b = num;
        this.f17422c = j11;
        this.f17423d = bArr;
        this.f17424e = str;
        this.f17425f = j12;
        this.f17426g = abstractC7463o;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: b */
    public Integer mo22538b() {
        return this.f17421b;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: c */
    public long mo22539c() {
        return this.f17420a;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: d */
    public long mo22540d() {
        return this.f17422c;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: e */
    public AbstractC7463o mo22541e() {
        return this.f17426g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7460l)) {
            return false;
        }
        AbstractC7460l abstractC7460l = (AbstractC7460l) obj;
        if (this.f17420a == abstractC7460l.mo22539c() && ((num = this.f17421b) != null ? num.equals(abstractC7460l.mo22538b()) : abstractC7460l.mo22538b() == null) && this.f17422c == abstractC7460l.mo22540d()) {
            if (Arrays.equals(this.f17423d, abstractC7460l instanceof C7454f ? ((C7454f) abstractC7460l).f17423d : abstractC7460l.mo22542f()) && ((str = this.f17424e) != null ? str.equals(abstractC7460l.mo22543g()) : abstractC7460l.mo22543g() == null) && this.f17425f == abstractC7460l.mo22544h()) {
                AbstractC7463o abstractC7463o = this.f17426g;
                AbstractC7463o mo22541e = abstractC7460l.mo22541e();
                if (abstractC7463o == null) {
                    if (mo22541e == null) {
                        return true;
                    }
                } else if (abstractC7463o.equals(mo22541e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: f */
    public byte[] mo22542f() {
        return this.f17423d;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: g */
    public String mo22543g() {
        return this.f17424e;
    }

    @Override // p118g6.AbstractC7460l
    /* renamed from: h */
    public long mo22544h() {
        return this.f17425f;
    }

    public int hashCode() {
        long j10 = this.f17420a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f17421b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f17422c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f17423d)) * 1000003;
        String str = this.f17424e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f17425f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC7463o abstractC7463o = this.f17426g;
        return i11 ^ (abstractC7463o != null ? abstractC7463o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f17420a + ", eventCode=" + this.f17421b + ", eventUptimeMs=" + this.f17422c + ", sourceExtension=" + Arrays.toString(this.f17423d) + ", sourceExtensionJsonProto3=" + this.f17424e + ", timezoneOffsetSeconds=" + this.f17425f + ", networkConnectionInfo=" + this.f17426g + "}";
    }
}
