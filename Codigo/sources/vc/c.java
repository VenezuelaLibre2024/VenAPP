package vc;

import vc.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends c0.a {

    /* renamed from: a */
    private final String f28794a;

    /* renamed from: b */
    private final String f28795b;

    public c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f28794a = str;
        this.f28795b = str2;
    }

    @Override // vc.c0.a
    public String c() {
        return this.f28794a;
    }

    @Override // vc.c0.a
    public String d() {
        return this.f28795b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        if (this.f28794a.equals(aVar.c())) {
            String str = this.f28795b;
            String d10 = aVar.d();
            if (str == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (str.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f28794a.hashCode() ^ 1000003) * 1000003;
        String str = this.f28795b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f28794a + ", firebaseInstallationId=" + this.f28795b + "}";
    }
}
