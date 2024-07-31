package g6;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: a */
    private final List<m> f15833a;

    public d(List<m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f15833a = list;
    }

    @Override // g6.j
    public List<m> c() {
        return this.f15833a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f15833a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f15833a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f15833a + "}";
    }
}
