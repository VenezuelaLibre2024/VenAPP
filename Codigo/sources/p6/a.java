package p6;

import p6.e;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: b */
    private final long f22779b;

    /* renamed from: c */
    private final int f22780c;

    /* renamed from: d */
    private final int f22781d;

    /* renamed from: e */
    private final long f22782e;

    /* renamed from: f */
    private final int f22783f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends e.a {

        /* renamed from: a */
        private Long f22784a;

        /* renamed from: b */
        private Integer f22785b;

        /* renamed from: c */
        private Integer f22786c;

        /* renamed from: d */
        private Long f22787d;

        /* renamed from: e */
        private Integer f22788e;

        @Override // p6.e.a
        e a() {
            String str = "";
            if (this.f22784a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f22785b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f22786c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f22787d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f22788e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f22784a.longValue(), this.f22785b.intValue(), this.f22786c.intValue(), this.f22787d.longValue(), this.f22788e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p6.e.a
        e.a b(int i10) {
            this.f22786c = Integer.valueOf(i10);
            return this;
        }

        @Override // p6.e.a
        e.a c(long j10) {
            this.f22787d = Long.valueOf(j10);
            return this;
        }

        @Override // p6.e.a
        e.a d(int i10) {
            this.f22785b = Integer.valueOf(i10);
            return this;
        }

        @Override // p6.e.a
        e.a e(int i10) {
            this.f22788e = Integer.valueOf(i10);
            return this;
        }

        @Override // p6.e.a
        e.a f(long j10) {
            this.f22784a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f22779b = j10;
        this.f22780c = i10;
        this.f22781d = i11;
        this.f22782e = j11;
        this.f22783f = i12;
    }

    /* synthetic */ a(long j10, int i10, int i11, long j11, int i12, C0376a c0376a) {
        this(j10, i10, i11, j11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p6.e
    public int b() {
        return this.f22781d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p6.e
    public long c() {
        return this.f22782e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p6.e
    public int d() {
        return this.f22780c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p6.e
    public int e() {
        return this.f22783f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f22779b == eVar.f() && this.f22780c == eVar.d() && this.f22781d == eVar.b() && this.f22782e == eVar.c() && this.f22783f == eVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p6.e
    public long f() {
        return this.f22779b;
    }

    public int hashCode() {
        long j10 = this.f22779b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f22780c) * 1000003) ^ this.f22781d) * 1000003;
        long j11 = this.f22782e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f22783f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f22779b + ", loadBatchSize=" + this.f22780c + ", criticalSectionEnterTimeoutMs=" + this.f22781d + ", eventCleanUpAge=" + this.f22782e + ", maxBlobByteSizePerRow=" + this.f22783f + "}";
    }
}
