package p413w5;

/* renamed from: w5.c */
/* loaded from: classes.dex */
public final class C12072c {

    /* renamed from: a */
    private final long f32099a;

    /* renamed from: b */
    private final long f32100b;

    /* renamed from: c */
    private final boolean f32101c;

    public C12072c(long j10, long j11, boolean z10) {
        this.f32099a = j10;
        this.f32100b = j11;
        this.f32101c = z10;
    }

    /* renamed from: a */
    public final boolean m38759a() {
        return this.f32101c;
    }

    /* renamed from: b */
    public final long m38760b() {
        return this.f32100b;
    }

    /* renamed from: c */
    public final long m38761c() {
        return this.f32099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12072c)) {
            return false;
        }
        C12072c c12072c = (C12072c) obj;
        return this.f32099a == c12072c.f32099a && this.f32100b == c12072c.f32100b && this.f32101c == c12072c.f32101c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.f32099a) * 31) + Long.hashCode(this.f32100b)) * 31;
        boolean z10 = this.f32101c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DateCond(minMs=" + this.f32099a + ", maxMs=" + this.f32100b + ", ignore=" + this.f32101c + ')';
    }
}
