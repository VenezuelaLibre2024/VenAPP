package p488ze;

import java.util.Set;

/* renamed from: ze.a */
/* loaded from: classes2.dex */
final class C13004a extends AbstractC13005b {

    /* renamed from: a */
    private final Set<String> f35340a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13004a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f35340a = set;
    }

    @Override // p488ze.AbstractC13005b
    /* renamed from: b */
    public Set<String> mo42982b() {
        return this.f35340a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13005b) {
            return this.f35340a.equals(((AbstractC13005b) obj).mo42982b());
        }
        return false;
    }

    public int hashCode() {
        return this.f35340a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f35340a + "}";
    }
}
