package p6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f22789a;

    /* renamed from: b, reason: collision with root package name */
    private final h6.p f22790b;

    /* renamed from: c, reason: collision with root package name */
    private final h6.i f22791c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j10, h6.p pVar, h6.i iVar) {
        this.f22789a = j10;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f22790b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f22791c = iVar;
    }

    @Override // p6.k
    public h6.i b() {
        return this.f22791c;
    }

    @Override // p6.k
    public long c() {
        return this.f22789a;
    }

    @Override // p6.k
    public h6.p d() {
        return this.f22790b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f22789a == kVar.c() && this.f22790b.equals(kVar.d()) && this.f22791c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f22789a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f22790b.hashCode()) * 1000003) ^ this.f22791c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f22789a + ", transportContext=" + this.f22790b + ", event=" + this.f22791c + "}";
    }
}
