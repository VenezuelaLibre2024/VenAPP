package g6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a */
    private final long f15866a;

    public h(long j10) {
        this.f15866a = j10;
    }

    @Override // g6.n
    public long c() {
        return this.f15866a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f15866a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f15866a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f15866a + "}";
    }
}
