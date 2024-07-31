package ye;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ye.a */
/* loaded from: classes.dex */
public final class C12675a extends AbstractC12680f {

    /* renamed from: a */
    private final String f34369a;

    /* renamed from: b */
    private final String f34370b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12675a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f34369a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f34370b = str2;
    }

    @Override // ye.AbstractC12680f
    /* renamed from: b */
    public String mo41713b() {
        return this.f34369a;
    }

    @Override // ye.AbstractC12680f
    /* renamed from: c */
    public String mo41714c() {
        return this.f34370b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12680f)) {
            return false;
        }
        AbstractC12680f abstractC12680f = (AbstractC12680f) obj;
        return this.f34369a.equals(abstractC12680f.mo41713b()) && this.f34370b.equals(abstractC12680f.mo41714c());
    }

    public int hashCode() {
        return ((this.f34369a.hashCode() ^ 1000003) * 1000003) ^ this.f34370b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f34369a + ", version=" + this.f34370b + "}";
    }
}
