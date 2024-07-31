package w5;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f29636a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29637b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29638c;

    public c(long j10, long j11, boolean z10) {
        this.f29636a = j10;
        this.f29637b = j11;
        this.f29638c = z10;
    }

    public final boolean a() {
        return this.f29638c;
    }

    public final long b() {
        return this.f29637b;
    }

    public final long c() {
        return this.f29636a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f29636a == cVar.f29636a && this.f29637b == cVar.f29637b && this.f29638c == cVar.f29638c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.f29636a) * 31) + Long.hashCode(this.f29637b)) * 31;
        boolean z10 = this.f29638c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DateCond(minMs=" + this.f29636a + ", maxMs=" + this.f29637b + ", ignore=" + this.f29638c + ')';
    }
}
