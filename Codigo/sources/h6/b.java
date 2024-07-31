package h6;

import h6.i;
import java.util.Map;

/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f16404a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f16405b;

    /* renamed from: c, reason: collision with root package name */
    private final h f16406c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16407d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16408e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f16409f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h6.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0272b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16410a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f16411b;

        /* renamed from: c, reason: collision with root package name */
        private h f16412c;

        /* renamed from: d, reason: collision with root package name */
        private Long f16413d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16414e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f16415f;

        @Override // h6.i.a
        public i d() {
            String str = "";
            if (this.f16410a == null) {
                str = " transportName";
            }
            if (this.f16412c == null) {
                str = str + " encodedPayload";
            }
            if (this.f16413d == null) {
                str = str + " eventMillis";
            }
            if (this.f16414e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f16415f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f16410a, this.f16411b, this.f16412c, this.f16413d.longValue(), this.f16414e.longValue(), this.f16415f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h6.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f16415f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h6.i.a
        public i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f16415f = map;
            return this;
        }

        @Override // h6.i.a
        public i.a g(Integer num) {
            this.f16411b = num;
            return this;
        }

        @Override // h6.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f16412c = hVar;
            return this;
        }

        @Override // h6.i.a
        public i.a i(long j10) {
            this.f16413d = Long.valueOf(j10);
            return this;
        }

        @Override // h6.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f16410a = str;
            return this;
        }

        @Override // h6.i.a
        public i.a k(long j10) {
            this.f16414e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f16404a = str;
        this.f16405b = num;
        this.f16406c = hVar;
        this.f16407d = j10;
        this.f16408e = j11;
        this.f16409f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h6.i
    public Map<String, String> c() {
        return this.f16409f;
    }

    @Override // h6.i
    public Integer d() {
        return this.f16405b;
    }

    @Override // h6.i
    public h e() {
        return this.f16406c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f16404a.equals(iVar.j()) && ((num = this.f16405b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f16406c.equals(iVar.e()) && this.f16407d == iVar.f() && this.f16408e == iVar.k() && this.f16409f.equals(iVar.c());
    }

    @Override // h6.i
    public long f() {
        return this.f16407d;
    }

    public int hashCode() {
        int hashCode = (this.f16404a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f16405b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16406c.hashCode()) * 1000003;
        long j10 = this.f16407d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16408e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f16409f.hashCode();
    }

    @Override // h6.i
    public String j() {
        return this.f16404a;
    }

    @Override // h6.i
    public long k() {
        return this.f16408e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f16404a + ", code=" + this.f16405b + ", encodedPayload=" + this.f16406c + ", eventMillis=" + this.f16407d + ", uptimeMillis=" + this.f16408e + ", autoMetadata=" + this.f16409f + "}";
    }
}
