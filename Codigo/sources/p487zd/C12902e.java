package p487zd;

import com.google.firebase.installations.AbstractC6200g;

/* renamed from: zd.e */
/* loaded from: classes.dex */
final class C12902e extends AbstractC12935k2 {

    /* renamed from: a */
    private final String f35130a;

    /* renamed from: b */
    private final AbstractC6200g f35131b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12902e(String str, AbstractC6200g abstractC6200g) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f35130a = str;
        if (abstractC6200g == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f35131b = abstractC6200g;
    }

    @Override // p487zd.AbstractC12935k2
    /* renamed from: b */
    String mo42706b() {
        return this.f35130a;
    }

    @Override // p487zd.AbstractC12935k2
    /* renamed from: c */
    AbstractC6200g mo42707c() {
        return this.f35131b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12935k2)) {
            return false;
        }
        AbstractC12935k2 abstractC12935k2 = (AbstractC12935k2) obj;
        return this.f35130a.equals(abstractC12935k2.mo42706b()) && this.f35131b.equals(abstractC12935k2.mo42707c());
    }

    public int hashCode() {
        return ((this.f35130a.hashCode() ^ 1000003) * 1000003) ^ this.f35131b.hashCode();
    }

    public String toString() {
        return "InstallationIdResult{installationId=" + this.f35130a + ", installationTokenResult=" + this.f35131b + "}";
    }
}
