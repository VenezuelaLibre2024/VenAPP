package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class c extends f0.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f30950a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30951b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30952c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30953d;

    /* renamed from: e, reason: collision with root package name */
    private final long f30954e;

    /* renamed from: f, reason: collision with root package name */
    private final long f30955f;

    /* renamed from: g, reason: collision with root package name */
    private final long f30956g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30957h;

    /* renamed from: i, reason: collision with root package name */
    private final List<f0.a.AbstractC0503a> f30958i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.a.b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f30959a;

        /* renamed from: b, reason: collision with root package name */
        private String f30960b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f30961c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f30962d;

        /* renamed from: e, reason: collision with root package name */
        private Long f30963e;

        /* renamed from: f, reason: collision with root package name */
        private Long f30964f;

        /* renamed from: g, reason: collision with root package name */
        private Long f30965g;

        /* renamed from: h, reason: collision with root package name */
        private String f30966h;

        /* renamed from: i, reason: collision with root package name */
        private List<f0.a.AbstractC0503a> f30967i;

        @Override // xc.f0.a.b
        public f0.a a() {
            String str = "";
            if (this.f30959a == null) {
                str = " pid";
            }
            if (this.f30960b == null) {
                str = str + " processName";
            }
            if (this.f30961c == null) {
                str = str + " reasonCode";
            }
            if (this.f30962d == null) {
                str = str + " importance";
            }
            if (this.f30963e == null) {
                str = str + " pss";
            }
            if (this.f30964f == null) {
                str = str + " rss";
            }
            if (this.f30965g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f30959a.intValue(), this.f30960b, this.f30961c.intValue(), this.f30962d.intValue(), this.f30963e.longValue(), this.f30964f.longValue(), this.f30965g.longValue(), this.f30966h, this.f30967i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.a.b
        public f0.a.b b(List<f0.a.AbstractC0503a> list) {
            this.f30967i = list;
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b c(int i10) {
            this.f30962d = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b d(int i10) {
            this.f30959a = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f30960b = str;
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b f(long j10) {
            this.f30963e = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b g(int i10) {
            this.f30961c = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b h(long j10) {
            this.f30964f = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b i(long j10) {
            this.f30965g = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.a.b
        public f0.a.b j(String str) {
            this.f30966h = str;
            return this;
        }
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<f0.a.AbstractC0503a> list) {
        this.f30950a = i10;
        this.f30951b = str;
        this.f30952c = i11;
        this.f30953d = i12;
        this.f30954e = j10;
        this.f30955f = j11;
        this.f30956g = j12;
        this.f30957h = str2;
        this.f30958i = list;
    }

    @Override // xc.f0.a
    public List<f0.a.AbstractC0503a> b() {
        return this.f30958i;
    }

    @Override // xc.f0.a
    public int c() {
        return this.f30953d;
    }

    @Override // xc.f0.a
    public int d() {
        return this.f30950a;
    }

    @Override // xc.f0.a
    public String e() {
        return this.f30951b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (this.f30950a == aVar.d() && this.f30951b.equals(aVar.e()) && this.f30952c == aVar.g() && this.f30953d == aVar.c() && this.f30954e == aVar.f() && this.f30955f == aVar.h() && this.f30956g == aVar.i() && ((str = this.f30957h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<f0.a.AbstractC0503a> list = this.f30958i;
            List<f0.a.AbstractC0503a> b10 = aVar.b();
            if (list == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (list.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // xc.f0.a
    public long f() {
        return this.f30954e;
    }

    @Override // xc.f0.a
    public int g() {
        return this.f30952c;
    }

    @Override // xc.f0.a
    public long h() {
        return this.f30955f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f30950a ^ 1000003) * 1000003) ^ this.f30951b.hashCode()) * 1000003) ^ this.f30952c) * 1000003) ^ this.f30953d) * 1000003;
        long j10 = this.f30954e;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f30955f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f30956g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f30957h;
        int hashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC0503a> list = this.f30958i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // xc.f0.a
    public long i() {
        return this.f30956g;
    }

    @Override // xc.f0.a
    public String j() {
        return this.f30957h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f30950a + ", processName=" + this.f30951b + ", reasonCode=" + this.f30952c + ", importance=" + this.f30953d + ", pss=" + this.f30954e + ", rss=" + this.f30955f + ", timestamp=" + this.f30956g + ", traceFile=" + this.f30957h + ", buildIdMappingForArch=" + this.f30958i + "}";
    }
}
