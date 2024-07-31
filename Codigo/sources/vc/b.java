package vc;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends u {

    /* renamed from: a */
    private final xc.f0 f28783a;

    /* renamed from: b */
    private final String f28784b;

    /* renamed from: c */
    private final File f28785c;

    public b(xc.f0 f0Var, String str, File file) {
        if (f0Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f28783a = f0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f28784b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f28785c = file;
    }

    @Override // vc.u
    public xc.f0 b() {
        return this.f28783a;
    }

    @Override // vc.u
    public File c() {
        return this.f28785c;
    }

    @Override // vc.u
    public String d() {
        return this.f28784b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f28783a.equals(uVar.b()) && this.f28784b.equals(uVar.d()) && this.f28785c.equals(uVar.c());
    }

    public int hashCode() {
        return ((((this.f28783a.hashCode() ^ 1000003) * 1000003) ^ this.f28784b.hashCode()) * 1000003) ^ this.f28785c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f28783a + ", sessionId=" + this.f28784b + ", reportFile=" + this.f28785c + "}";
    }
}
