package p132h6;

import java.util.Map;
import p132h6.AbstractC7639i;

/* renamed from: h6.b */
/* loaded from: classes.dex */
final class C7632b extends AbstractC7639i {

    /* renamed from: a */
    private final String f18041a;

    /* renamed from: b */
    private final Integer f18042b;

    /* renamed from: c */
    private final C7638h f18043c;

    /* renamed from: d */
    private final long f18044d;

    /* renamed from: e */
    private final long f18045e;

    /* renamed from: f */
    private final Map<String, String> f18046f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h6.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC7639i.a {

        /* renamed from: a */
        private String f18047a;

        /* renamed from: b */
        private Integer f18048b;

        /* renamed from: c */
        private C7638h f18049c;

        /* renamed from: d */
        private Long f18050d;

        /* renamed from: e */
        private Long f18051e;

        /* renamed from: f */
        private Map<String, String> f18052f;

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: d */
        public AbstractC7639i mo23172d() {
            String str = "";
            if (this.f18047a == null) {
                str = " transportName";
            }
            if (this.f18049c == null) {
                str = str + " encodedPayload";
            }
            if (this.f18050d == null) {
                str = str + " eventMillis";
            }
            if (this.f18051e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f18052f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C7632b(this.f18047a, this.f18048b, this.f18049c, this.f18050d.longValue(), this.f18051e.longValue(), this.f18052f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: e */
        protected Map<String, String> mo23173e() {
            Map<String, String> map = this.f18052f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p132h6.AbstractC7639i.a
        /* renamed from: f */
        public AbstractC7639i.a mo23174f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f18052f = map;
            return this;
        }

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: g */
        public AbstractC7639i.a mo23175g(Integer num) {
            this.f18048b = num;
            return this;
        }

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: h */
        public AbstractC7639i.a mo23176h(C7638h c7638h) {
            if (c7638h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f18049c = c7638h;
            return this;
        }

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: i */
        public AbstractC7639i.a mo23177i(long j10) {
            this.f18050d = Long.valueOf(j10);
            return this;
        }

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: j */
        public AbstractC7639i.a mo23178j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f18047a = str;
            return this;
        }

        @Override // p132h6.AbstractC7639i.a
        /* renamed from: k */
        public AbstractC7639i.a mo23179k(long j10) {
            this.f18051e = Long.valueOf(j10);
            return this;
        }
    }

    private C7632b(String str, Integer num, C7638h c7638h, long j10, long j11, Map<String, String> map) {
        this.f18041a = str;
        this.f18042b = num;
        this.f18043c = c7638h;
        this.f18044d = j10;
        this.f18045e = j11;
        this.f18046f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p132h6.AbstractC7639i
    /* renamed from: c */
    public Map<String, String> mo23166c() {
        return this.f18046f;
    }

    @Override // p132h6.AbstractC7639i
    /* renamed from: d */
    public Integer mo23167d() {
        return this.f18042b;
    }

    @Override // p132h6.AbstractC7639i
    /* renamed from: e */
    public C7638h mo23168e() {
        return this.f18043c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7639i)) {
            return false;
        }
        AbstractC7639i abstractC7639i = (AbstractC7639i) obj;
        return this.f18041a.equals(abstractC7639i.mo23170j()) && ((num = this.f18042b) != null ? num.equals(abstractC7639i.mo23167d()) : abstractC7639i.mo23167d() == null) && this.f18043c.equals(abstractC7639i.mo23168e()) && this.f18044d == abstractC7639i.mo23169f() && this.f18045e == abstractC7639i.mo23171k() && this.f18046f.equals(abstractC7639i.mo23166c());
    }

    @Override // p132h6.AbstractC7639i
    /* renamed from: f */
    public long mo23169f() {
        return this.f18044d;
    }

    public int hashCode() {
        int hashCode = (this.f18041a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f18042b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f18043c.hashCode()) * 1000003;
        long j10 = this.f18044d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f18045e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f18046f.hashCode();
    }

    @Override // p132h6.AbstractC7639i
    /* renamed from: j */
    public String mo23170j() {
        return this.f18041a;
    }

    @Override // p132h6.AbstractC7639i
    /* renamed from: k */
    public long mo23171k() {
        return this.f18045e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f18041a + ", code=" + this.f18042b + ", encodedPayload=" + this.f18043c + ", eventMillis=" + this.f18044d + ", uptimeMillis=" + this.f18045e + ", autoMetadata=" + this.f18046f + "}";
    }
}
