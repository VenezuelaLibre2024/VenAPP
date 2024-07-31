package p289p6;

import p289p6.AbstractC10069e;

/* renamed from: p6.a */
/* loaded from: classes.dex */
final class C10061a extends AbstractC10069e {

    /* renamed from: b */
    private final long f24712b;

    /* renamed from: c */
    private final int f24713c;

    /* renamed from: d */
    private final int f24714d;

    /* renamed from: e */
    private final long f24715e;

    /* renamed from: f */
    private final int f24716f;

    /* renamed from: p6.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC10069e.a {

        /* renamed from: a */
        private Long f24717a;

        /* renamed from: b */
        private Integer f24718b;

        /* renamed from: c */
        private Integer f24719c;

        /* renamed from: d */
        private Long f24720d;

        /* renamed from: e */
        private Integer f24721e;

        @Override // p289p6.AbstractC10069e.a
        /* renamed from: a */
        AbstractC10069e mo30011a() {
            String str = "";
            if (this.f24717a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f24718b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f24719c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f24720d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f24721e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C10061a(this.f24717a.longValue(), this.f24718b.intValue(), this.f24719c.intValue(), this.f24720d.longValue(), this.f24721e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p289p6.AbstractC10069e.a
        /* renamed from: b */
        AbstractC10069e.a mo30012b(int i10) {
            this.f24719c = Integer.valueOf(i10);
            return this;
        }

        @Override // p289p6.AbstractC10069e.a
        /* renamed from: c */
        AbstractC10069e.a mo30013c(long j10) {
            this.f24720d = Long.valueOf(j10);
            return this;
        }

        @Override // p289p6.AbstractC10069e.a
        /* renamed from: d */
        AbstractC10069e.a mo30014d(int i10) {
            this.f24718b = Integer.valueOf(i10);
            return this;
        }

        @Override // p289p6.AbstractC10069e.a
        /* renamed from: e */
        AbstractC10069e.a mo30015e(int i10) {
            this.f24721e = Integer.valueOf(i10);
            return this;
        }

        @Override // p289p6.AbstractC10069e.a
        /* renamed from: f */
        AbstractC10069e.a mo30016f(long j10) {
            this.f24717a = Long.valueOf(j10);
            return this;
        }
    }

    private C10061a(long j10, int i10, int i11, long j11, int i12) {
        this.f24712b = j10;
        this.f24713c = i10;
        this.f24714d = i11;
        this.f24715e = j11;
        this.f24716f = i12;
    }

    @Override // p289p6.AbstractC10069e
    /* renamed from: b */
    int mo30006b() {
        return this.f24714d;
    }

    @Override // p289p6.AbstractC10069e
    /* renamed from: c */
    long mo30007c() {
        return this.f24715e;
    }

    @Override // p289p6.AbstractC10069e
    /* renamed from: d */
    int mo30008d() {
        return this.f24713c;
    }

    @Override // p289p6.AbstractC10069e
    /* renamed from: e */
    int mo30009e() {
        return this.f24716f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10069e)) {
            return false;
        }
        AbstractC10069e abstractC10069e = (AbstractC10069e) obj;
        return this.f24712b == abstractC10069e.mo30010f() && this.f24713c == abstractC10069e.mo30008d() && this.f24714d == abstractC10069e.mo30006b() && this.f24715e == abstractC10069e.mo30007c() && this.f24716f == abstractC10069e.mo30009e();
    }

    @Override // p289p6.AbstractC10069e
    /* renamed from: f */
    long mo30010f() {
        return this.f24712b;
    }

    public int hashCode() {
        long j10 = this.f24712b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f24713c) * 1000003) ^ this.f24714d) * 1000003;
        long j11 = this.f24715e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f24716f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f24712b + ", loadBatchSize=" + this.f24713c + ", criticalSectionEnterTimeoutMs=" + this.f24714d + ", eventCleanUpAge=" + this.f24715e + ", maxBlobByteSizePerRow=" + this.f24716f + "}";
    }
}
