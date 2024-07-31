package g6;

import g6.l;
import java.util.Arrays;

/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a */
    private final long f15838a;

    /* renamed from: b */
    private final Integer f15839b;

    /* renamed from: c */
    private final long f15840c;

    /* renamed from: d */
    private final byte[] f15841d;

    /* renamed from: e */
    private final String f15842e;

    /* renamed from: f */
    private final long f15843f;

    /* renamed from: g */
    private final o f15844g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends l.a {

        /* renamed from: a */
        private Long f15845a;

        /* renamed from: b */
        private Integer f15846b;

        /* renamed from: c */
        private Long f15847c;

        /* renamed from: d */
        private byte[] f15848d;

        /* renamed from: e */
        private String f15849e;

        /* renamed from: f */
        private Long f15850f;

        /* renamed from: g */
        private o f15851g;

        @Override // g6.l.a
        public l a() {
            String str = "";
            if (this.f15845a == null) {
                str = " eventTimeMs";
            }
            if (this.f15847c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f15850f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f15845a.longValue(), this.f15846b, this.f15847c.longValue(), this.f15848d, this.f15849e, this.f15850f.longValue(), this.f15851g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g6.l.a
        public l.a b(Integer num) {
            this.f15846b = num;
            return this;
        }

        @Override // g6.l.a
        public l.a c(long j10) {
            this.f15845a = Long.valueOf(j10);
            return this;
        }

        @Override // g6.l.a
        public l.a d(long j10) {
            this.f15847c = Long.valueOf(j10);
            return this;
        }

        @Override // g6.l.a
        public l.a e(o oVar) {
            this.f15851g = oVar;
            return this;
        }

        @Override // g6.l.a
        l.a f(byte[] bArr) {
            this.f15848d = bArr;
            return this;
        }

        @Override // g6.l.a
        l.a g(String str) {
            this.f15849e = str;
            return this;
        }

        @Override // g6.l.a
        public l.a h(long j10) {
            this.f15850f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f15838a = j10;
        this.f15839b = num;
        this.f15840c = j11;
        this.f15841d = bArr;
        this.f15842e = str;
        this.f15843f = j12;
        this.f15844g = oVar;
    }

    /* synthetic */ f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar, a aVar) {
        this(j10, num, j11, bArr, str, j12, oVar);
    }

    @Override // g6.l
    public Integer b() {
        return this.f15839b;
    }

    @Override // g6.l
    public long c() {
        return this.f15838a;
    }

    @Override // g6.l
    public long d() {
        return this.f15840c;
    }

    @Override // g6.l
    public o e() {
        return this.f15844g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f15838a == lVar.c() && ((num = this.f15839b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f15840c == lVar.d()) {
            if (Arrays.equals(this.f15841d, lVar instanceof f ? ((f) lVar).f15841d : lVar.f()) && ((str = this.f15842e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f15843f == lVar.h()) {
                o oVar = this.f15844g;
                o e10 = lVar.e();
                if (oVar == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (oVar.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g6.l
    public byte[] f() {
        return this.f15841d;
    }

    @Override // g6.l
    public String g() {
        return this.f15842e;
    }

    @Override // g6.l
    public long h() {
        return this.f15843f;
    }

    public int hashCode() {
        long j10 = this.f15838a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f15839b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f15840c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f15841d)) * 1000003;
        String str = this.f15842e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f15843f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f15844g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f15838a + ", eventCode=" + this.f15839b + ", eventUptimeMs=" + this.f15840c + ", sourceExtension=" + Arrays.toString(this.f15841d) + ", sourceExtensionJsonProto3=" + this.f15842e + ", timezoneOffsetSeconds=" + this.f15843f + ", networkConnectionInfo=" + this.f15844g + "}";
    }
}
