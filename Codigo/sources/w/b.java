package w;

import w.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: a */
    private final q.b f29435a;

    /* renamed from: b */
    private final q.a f29436b;

    public b(q.b bVar, q.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f29435a = bVar;
        this.f29436b = aVar;
    }

    @Override // w.q
    public q.a c() {
        return this.f29436b;
    }

    @Override // w.q
    public q.b d() {
        return this.f29435a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f29435a.equals(qVar.d())) {
            q.a aVar = this.f29436b;
            q.a c10 = qVar.c();
            if (aVar == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (aVar.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f29435a.hashCode() ^ 1000003) * 1000003;
        q.a aVar = this.f29436b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f29435a + ", error=" + this.f29436b + "}";
    }
}
