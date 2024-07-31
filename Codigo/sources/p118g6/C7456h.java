package p118g6;

/* renamed from: g6.h */
/* loaded from: classes.dex */
final class C7456h extends AbstractC7462n {

    /* renamed from: a */
    private final long f17448a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7456h(long j10) {
        this.f17448a = j10;
    }

    @Override // p118g6.AbstractC7462n
    /* renamed from: c */
    public long mo22568c() {
        return this.f17448a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC7462n) && this.f17448a == ((AbstractC7462n) obj).mo22568c();
    }

    public int hashCode() {
        long j10 = this.f17448a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f17448a + "}";
    }
}
