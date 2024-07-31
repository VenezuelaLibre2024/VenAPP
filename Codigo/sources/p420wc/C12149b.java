package p420wc;

/* renamed from: wc.b */
/* loaded from: classes.dex */
final class C12149b extends AbstractC12156i {

    /* renamed from: b */
    private final String f32298b;

    /* renamed from: c */
    private final String f32299c;

    /* renamed from: d */
    private final String f32300d;

    /* renamed from: e */
    private final String f32301e;

    /* renamed from: f */
    private final long f32302f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12149b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f32298b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f32299c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f32300d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f32301e = str4;
        this.f32302f = j10;
    }

    @Override // p420wc.AbstractC12156i
    /* renamed from: c */
    public String mo38915c() {
        return this.f32299c;
    }

    @Override // p420wc.AbstractC12156i
    /* renamed from: d */
    public String mo38916d() {
        return this.f32300d;
    }

    @Override // p420wc.AbstractC12156i
    /* renamed from: e */
    public String mo38917e() {
        return this.f32298b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12156i)) {
            return false;
        }
        AbstractC12156i abstractC12156i = (AbstractC12156i) obj;
        return this.f32298b.equals(abstractC12156i.mo38917e()) && this.f32299c.equals(abstractC12156i.mo38915c()) && this.f32300d.equals(abstractC12156i.mo38916d()) && this.f32301e.equals(abstractC12156i.mo38919g()) && this.f32302f == abstractC12156i.mo38918f();
    }

    @Override // p420wc.AbstractC12156i
    /* renamed from: f */
    public long mo38918f() {
        return this.f32302f;
    }

    @Override // p420wc.AbstractC12156i
    /* renamed from: g */
    public String mo38919g() {
        return this.f32301e;
    }

    public int hashCode() {
        int hashCode = (((((((this.f32298b.hashCode() ^ 1000003) * 1000003) ^ this.f32299c.hashCode()) * 1000003) ^ this.f32300d.hashCode()) * 1000003) ^ this.f32301e.hashCode()) * 1000003;
        long j10 = this.f32302f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f32298b + ", parameterKey=" + this.f32299c + ", parameterValue=" + this.f32300d + ", variantId=" + this.f32301e + ", templateVersion=" + this.f32302f + "}";
    }
}
