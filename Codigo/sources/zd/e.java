package zd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends k2 {

    /* renamed from: a */
    private final String f32579a;

    /* renamed from: b */
    private final com.google.firebase.installations.g f32580b;

    public e(String str, com.google.firebase.installations.g gVar) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f32579a = str;
        if (gVar == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f32580b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zd.k2
    public String b() {
        return this.f32579a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zd.k2
    public com.google.firebase.installations.g c() {
        return this.f32580b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f32579a.equals(k2Var.b()) && this.f32580b.equals(k2Var.c());
    }

    public int hashCode() {
        return ((this.f32579a.hashCode() ^ 1000003) * 1000003) ^ this.f32580b.hashCode();
    }

    public String toString() {
        return "InstallationIdResult{installationId=" + this.f32579a + ", installationTokenResult=" + this.f32580b + "}";
    }
}
