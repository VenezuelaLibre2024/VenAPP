package zb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: a */
    private final long f32509a;

    /* renamed from: b */
    private final long f32510b;

    /* renamed from: c */
    private final long f32511c;

    public a(long j10, long j11, long j12) {
        this.f32509a = j10;
        this.f32510b = j11;
        this.f32511c = j12;
    }

    @Override // zb.r
    public long b() {
        return this.f32510b;
    }

    @Override // zb.r
    public long c() {
        return this.f32509a;
    }

    @Override // zb.r
    public long d() {
        return this.f32511c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f32509a == rVar.c() && this.f32510b == rVar.b() && this.f32511c == rVar.d();
    }

    public int hashCode() {
        long j10 = this.f32509a;
        long j11 = this.f32510b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f32511c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f32509a + ", elapsedRealtime=" + this.f32510b + ", uptimeMillis=" + this.f32511c + "}";
    }
}
