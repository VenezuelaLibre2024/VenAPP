package h3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b */
    private final androidx.collection.a<g<?>, Object> f16375b = new c4.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(g<T> gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f16375b.size(); i10++) {
            g(this.f16375b.j(i10), this.f16375b.n(i10), messageDigest);
        }
    }

    public <T> T c(g<T> gVar) {
        return this.f16375b.containsKey(gVar) ? (T) this.f16375b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f16375b.k(hVar.f16375b);
    }

    public h e(g<?> gVar) {
        this.f16375b.remove(gVar);
        return this;
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f16375b.equals(((h) obj).f16375b);
        }
        return false;
    }

    public <T> h f(g<T> gVar, T t10) {
        this.f16375b.put(gVar, t10);
        return this;
    }

    @Override // h3.f
    public int hashCode() {
        return this.f16375b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f16375b + '}';
    }
}
