package ye;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    private final String f31833a;

    /* renamed from: b */
    private final String f31834b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f31833a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f31834b = str2;
    }

    @Override // ye.f
    public String b() {
        return this.f31833a;
    }

    @Override // ye.f
    public String c() {
        return this.f31834b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f31833a.equals(fVar.b()) && this.f31834b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f31833a.hashCode() ^ 1000003) * 1000003) ^ this.f31834b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f31833a + ", version=" + this.f31834b + "}";
    }
}
