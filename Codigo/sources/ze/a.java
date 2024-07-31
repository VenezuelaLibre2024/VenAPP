package ze;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: a */
    private final Set<String> f32789a;

    public a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f32789a = set;
    }

    @Override // ze.b
    public Set<String> b() {
        return this.f32789a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f32789a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f32789a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f32789a + "}";
    }
}
