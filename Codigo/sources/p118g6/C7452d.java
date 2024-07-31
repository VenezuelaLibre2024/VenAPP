package p118g6;

import java.util.List;

/* renamed from: g6.d */
/* loaded from: classes.dex */
final class C7452d extends AbstractC7458j {

    /* renamed from: a */
    private final List<AbstractC7461m> f17415a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7452d(List<AbstractC7461m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f17415a = list;
    }

    @Override // p118g6.AbstractC7458j
    /* renamed from: c */
    public List<AbstractC7461m> mo22532c() {
        return this.f17415a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7458j) {
            return this.f17415a.equals(((AbstractC7458j) obj).mo22532c());
        }
        return false;
    }

    public int hashCode() {
        return this.f17415a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f17415a + "}";
    }
}
