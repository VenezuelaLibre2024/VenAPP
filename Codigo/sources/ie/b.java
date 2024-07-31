package ie;

import ie.f;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a */
    private final String f17679a;

    /* renamed from: b */
    private final long f17680b;

    /* renamed from: c */
    private final f.b f17681c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ie.b$b */
    /* loaded from: classes.dex */
    public static final class C0288b extends f.a {

        /* renamed from: a */
        private String f17682a;

        /* renamed from: b */
        private Long f17683b;

        /* renamed from: c */
        private f.b f17684c;

        @Override // ie.f.a
        public f a() {
            String str = "";
            if (this.f17683b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f17682a, this.f17683b.longValue(), this.f17684c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ie.f.a
        public f.a b(f.b bVar) {
            this.f17684c = bVar;
            return this;
        }

        @Override // ie.f.a
        public f.a c(String str) {
            this.f17682a = str;
            return this;
        }

        @Override // ie.f.a
        public f.a d(long j10) {
            this.f17683b = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, f.b bVar) {
        this.f17679a = str;
        this.f17680b = j10;
        this.f17681c = bVar;
    }

    /* synthetic */ b(String str, long j10, f.b bVar, a aVar) {
        this(str, j10, bVar);
    }

    @Override // ie.f
    public f.b b() {
        return this.f17681c;
    }

    @Override // ie.f
    public String c() {
        return this.f17679a;
    }

    @Override // ie.f
    public long d() {
        return this.f17680b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f17679a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f17680b == fVar.d()) {
                f.b bVar = this.f17681c;
                f.b b10 = fVar.b();
                if (bVar == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (bVar.equals(b10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f17679a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f17680b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f17681c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f17679a + ", tokenExpirationTimestamp=" + this.f17680b + ", responseCode=" + this.f17681c + "}";
    }
}
