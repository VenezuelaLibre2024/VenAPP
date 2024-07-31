package oc;

/* loaded from: classes.dex */
final class k1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22404b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22405c;

    private k1(String str, String str2, String str3) {
        this.f22403a = str;
        this.f22404b = str2;
        this.f22405c = null;
    }

    @Override // oc.g1
    public final String a() {
        return this.f22404b;
    }

    @Override // oc.g1
    public final String b() {
        return this.f22405c;
    }

    @Override // oc.g1
    public final String c() {
        return this.f22403a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            String str = this.f22403a;
            if (str != null ? str.equals(g1Var.c()) : g1Var.c() == null) {
                String str2 = this.f22404b;
                if (str2 != null ? str2.equals(g1Var.a()) : g1Var.a() == null) {
                    String str3 = this.f22405c;
                    String b10 = g1Var.b();
                    if (str3 != null ? str3.equals(b10) : b10 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22403a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f22404b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22405c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f22403a + ", playIntegrityToken=" + this.f22404b + ", recaptchaEnterpriseToken=" + this.f22405c + "}";
    }
}
