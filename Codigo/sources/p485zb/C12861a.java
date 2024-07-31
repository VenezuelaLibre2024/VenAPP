package p485zb;

/* renamed from: zb.a */
/* loaded from: classes.dex */
final class C12861a extends AbstractC12878r {

    /* renamed from: a */
    private final long f35060a;

    /* renamed from: b */
    private final long f35061b;

    /* renamed from: c */
    private final long f35062c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12861a(long j10, long j11, long j12) {
        this.f35060a = j10;
        this.f35061b = j11;
        this.f35062c = j12;
    }

    @Override // p485zb.AbstractC12878r
    /* renamed from: b */
    public long mo42600b() {
        return this.f35061b;
    }

    @Override // p485zb.AbstractC12878r
    /* renamed from: c */
    public long mo42601c() {
        return this.f35060a;
    }

    @Override // p485zb.AbstractC12878r
    /* renamed from: d */
    public long mo42602d() {
        return this.f35062c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12878r)) {
            return false;
        }
        AbstractC12878r abstractC12878r = (AbstractC12878r) obj;
        return this.f35060a == abstractC12878r.mo42601c() && this.f35061b == abstractC12878r.mo42600b() && this.f35062c == abstractC12878r.mo42602d();
    }

    public int hashCode() {
        long j10 = this.f35060a;
        long j11 = this.f35061b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f35062c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f35060a + ", elapsedRealtime=" + this.f35061b + ", uptimeMillis=" + this.f35062c + "}";
    }
}
