package cf;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<d> f7097a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f7097a = set;
    }

    @Override // cf.e
    public Set<d> b() {
        return this.f7097a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f7097a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f7097a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f7097a + "}";
    }
}
