package g0;

import g0.v0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends v0.b {

    /* renamed from: a */
    private final n0 f15567a;

    /* renamed from: b */
    private final List<v0.d> f15568b;

    public d(n0 n0Var, List<v0.d> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f15567a = n0Var;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f15568b = list;
    }

    @Override // g0.v0.b
    public List<v0.d> a() {
        return this.f15568b;
    }

    @Override // g0.v0.b
    public n0 b() {
        return this.f15567a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0.b)) {
            return false;
        }
        v0.b bVar = (v0.b) obj;
        return this.f15567a.equals(bVar.b()) && this.f15568b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f15567a.hashCode() ^ 1000003) * 1000003) ^ this.f15568b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f15567a + ", outConfigs=" + this.f15568b + "}";
    }
}
