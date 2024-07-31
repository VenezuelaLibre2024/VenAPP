package p272oc;

/* renamed from: oc.k1 */
/* loaded from: classes.dex */
final class C9865k1 extends AbstractC9853g1 {

    /* renamed from: a */
    private final String f24336a;

    /* renamed from: b */
    private final String f24337b;

    /* renamed from: c */
    private final String f24338c;

    private C9865k1(String str, String str2, String str3) {
        this.f24336a = str;
        this.f24337b = str2;
        this.f24338c = null;
    }

    @Override // p272oc.AbstractC9853g1
    /* renamed from: a */
    public final String mo29536a() {
        return this.f24337b;
    }

    @Override // p272oc.AbstractC9853g1
    /* renamed from: b */
    public final String mo29537b() {
        return this.f24338c;
    }

    @Override // p272oc.AbstractC9853g1
    /* renamed from: c */
    public final String mo29538c() {
        return this.f24336a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9853g1) {
            AbstractC9853g1 abstractC9853g1 = (AbstractC9853g1) obj;
            String str = this.f24336a;
            if (str != null ? str.equals(abstractC9853g1.mo29538c()) : abstractC9853g1.mo29538c() == null) {
                String str2 = this.f24337b;
                if (str2 != null ? str2.equals(abstractC9853g1.mo29536a()) : abstractC9853g1.mo29536a() == null) {
                    String str3 = this.f24338c;
                    String mo29537b = abstractC9853g1.mo29537b();
                    if (str3 != null ? str3.equals(mo29537b) : mo29537b == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24336a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f24337b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24338c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f24336a + ", playIntegrityToken=" + this.f24337b + ", recaptchaEnterpriseToken=" + this.f24338c + "}";
    }
}
