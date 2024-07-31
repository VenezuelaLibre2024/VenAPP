package vc;

import vc.InterfaceC11828c0;

/* renamed from: vc.c */
/* loaded from: classes.dex */
final class C11827c extends InterfaceC11828c0.a {

    /* renamed from: a */
    private final String f31228a;

    /* renamed from: b */
    private final String f31229b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11827c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f31228a = str;
        this.f31229b = str2;
    }

    @Override // vc.InterfaceC11828c0.a
    /* renamed from: c */
    public String mo37689c() {
        return this.f31228a;
    }

    @Override // vc.InterfaceC11828c0.a
    /* renamed from: d */
    public String mo37690d() {
        return this.f31229b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC11828c0.a)) {
            return false;
        }
        InterfaceC11828c0.a aVar = (InterfaceC11828c0.a) obj;
        if (this.f31228a.equals(aVar.mo37689c())) {
            String str = this.f31229b;
            String mo37690d = aVar.mo37690d();
            if (str == null) {
                if (mo37690d == null) {
                    return true;
                }
            } else if (str.equals(mo37690d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f31228a.hashCode() ^ 1000003) * 1000003;
        String str = this.f31229b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f31228a + ", firebaseInstallationId=" + this.f31229b + "}";
    }
}
