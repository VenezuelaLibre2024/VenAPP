package wc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: b */
    private final String f29833b;

    /* renamed from: c */
    private final String f29834c;

    /* renamed from: d */
    private final String f29835d;

    /* renamed from: e */
    private final String f29836e;

    /* renamed from: f */
    private final long f29837f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f29833b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f29834c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f29835d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f29836e = str4;
        this.f29837f = j10;
    }

    @Override // wc.i
    public String c() {
        return this.f29834c;
    }

    @Override // wc.i
    public String d() {
        return this.f29835d;
    }

    @Override // wc.i
    public String e() {
        return this.f29833b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f29833b.equals(iVar.e()) && this.f29834c.equals(iVar.c()) && this.f29835d.equals(iVar.d()) && this.f29836e.equals(iVar.g()) && this.f29837f == iVar.f();
    }

    @Override // wc.i
    public long f() {
        return this.f29837f;
    }

    @Override // wc.i
    public String g() {
        return this.f29836e;
    }

    public int hashCode() {
        int hashCode = (((((((this.f29833b.hashCode() ^ 1000003) * 1000003) ^ this.f29834c.hashCode()) * 1000003) ^ this.f29835d.hashCode()) * 1000003) ^ this.f29836e.hashCode()) * 1000003;
        long j10 = this.f29837f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f29833b + ", parameterKey=" + this.f29834c + ", parameterValue=" + this.f29835d + ", variantId=" + this.f29836e + ", templateVersion=" + this.f29837f + "}";
    }
}
