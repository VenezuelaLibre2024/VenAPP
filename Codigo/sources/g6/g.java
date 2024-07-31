package g6;

import g6.m;
import java.util.List;

/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f15852a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15853b;

    /* renamed from: c, reason: collision with root package name */
    private final k f15854c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15855d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15856e;

    /* renamed from: f, reason: collision with root package name */
    private final List<l> f15857f;

    /* renamed from: g, reason: collision with root package name */
    private final p f15858g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f15859a;

        /* renamed from: b, reason: collision with root package name */
        private Long f15860b;

        /* renamed from: c, reason: collision with root package name */
        private k f15861c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f15862d;

        /* renamed from: e, reason: collision with root package name */
        private String f15863e;

        /* renamed from: f, reason: collision with root package name */
        private List<l> f15864f;

        /* renamed from: g, reason: collision with root package name */
        private p f15865g;

        @Override // g6.m.a
        public m a() {
            String str = "";
            if (this.f15859a == null) {
                str = " requestTimeMs";
            }
            if (this.f15860b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f15859a.longValue(), this.f15860b.longValue(), this.f15861c, this.f15862d, this.f15863e, this.f15864f, this.f15865g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g6.m.a
        public m.a b(k kVar) {
            this.f15861c = kVar;
            return this;
        }

        @Override // g6.m.a
        public m.a c(List<l> list) {
            this.f15864f = list;
            return this;
        }

        @Override // g6.m.a
        m.a d(Integer num) {
            this.f15862d = num;
            return this;
        }

        @Override // g6.m.a
        m.a e(String str) {
            this.f15863e = str;
            return this;
        }

        @Override // g6.m.a
        public m.a f(p pVar) {
            this.f15865g = pVar;
            return this;
        }

        @Override // g6.m.a
        public m.a g(long j10) {
            this.f15859a = Long.valueOf(j10);
            return this;
        }

        @Override // g6.m.a
        public m.a h(long j10) {
            this.f15860b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f15852a = j10;
        this.f15853b = j11;
        this.f15854c = kVar;
        this.f15855d = num;
        this.f15856e = str;
        this.f15857f = list;
        this.f15858g = pVar;
    }

    @Override // g6.m
    public k b() {
        return this.f15854c;
    }

    @Override // g6.m
    public List<l> c() {
        return this.f15857f;
    }

    @Override // g6.m
    public Integer d() {
        return this.f15855d;
    }

    @Override // g6.m
    public String e() {
        return this.f15856e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f15852a == mVar.g() && this.f15853b == mVar.h() && ((kVar = this.f15854c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f15855d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f15856e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f15857f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f15858g;
            p f10 = mVar.f();
            if (pVar == null) {
                if (f10 == null) {
                    return true;
                }
            } else if (pVar.equals(f10)) {
                return true;
            }
        }
        return false;
    }

    @Override // g6.m
    public p f() {
        return this.f15858g;
    }

    @Override // g6.m
    public long g() {
        return this.f15852a;
    }

    @Override // g6.m
    public long h() {
        return this.f15853b;
    }

    public int hashCode() {
        long j10 = this.f15852a;
        long j11 = this.f15853b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f15854c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f15855d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f15856e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f15857f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f15858g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f15852a + ", requestUptimeMs=" + this.f15853b + ", clientInfo=" + this.f15854c + ", logSource=" + this.f15855d + ", logSourceName=" + this.f15856e + ", logEvents=" + this.f15857f + ", qosTier=" + this.f15858g + "}";
    }
}
