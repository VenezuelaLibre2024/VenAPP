package cf;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cf.c */
/* loaded from: classes2.dex */
public final class C1960c extends AbstractC1962e {

    /* renamed from: a */
    private final Set<AbstractC1961d> f8049a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1960c(Set<AbstractC1961d> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f8049a = set;
    }

    @Override // cf.AbstractC1962e
    /* renamed from: b */
    public Set<AbstractC1961d> mo10211b() {
        return this.f8049a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1962e) {
            return this.f8049a.equals(((AbstractC1962e) obj).mo10211b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8049a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f8049a + "}";
    }
}
