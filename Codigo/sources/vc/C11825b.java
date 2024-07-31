package vc;

import java.io.File;
import p442xc.AbstractC12426f0;

/* renamed from: vc.b */
/* loaded from: classes.dex */
final class C11825b extends AbstractC11863u {

    /* renamed from: a */
    private final AbstractC12426f0 f31217a;

    /* renamed from: b */
    private final String f31218b;

    /* renamed from: c */
    private final File f31219c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11825b(AbstractC12426f0 abstractC12426f0, String str, File file) {
        if (abstractC12426f0 == null) {
            throw new NullPointerException("Null report");
        }
        this.f31217a = abstractC12426f0;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f31218b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f31219c = file;
    }

    @Override // vc.AbstractC11863u
    /* renamed from: b */
    public AbstractC12426f0 mo37672b() {
        return this.f31217a;
    }

    @Override // vc.AbstractC11863u
    /* renamed from: c */
    public File mo37673c() {
        return this.f31219c;
    }

    @Override // vc.AbstractC11863u
    /* renamed from: d */
    public String mo37674d() {
        return this.f31218b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11863u)) {
            return false;
        }
        AbstractC11863u abstractC11863u = (AbstractC11863u) obj;
        return this.f31217a.equals(abstractC11863u.mo37672b()) && this.f31218b.equals(abstractC11863u.mo37674d()) && this.f31219c.equals(abstractC11863u.mo37673c());
    }

    public int hashCode() {
        return ((((this.f31217a.hashCode() ^ 1000003) * 1000003) ^ this.f31218b.hashCode()) * 1000003) ^ this.f31219c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f31217a + ", sessionId=" + this.f31218b + ", reportFile=" + this.f31219c + "}";
    }
}
