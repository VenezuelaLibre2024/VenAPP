package i6;

import i6.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a */
    private final g.a f17163a;

    /* renamed from: b */
    private final long f17164b;

    public b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f17163a = aVar;
        this.f17164b = j10;
    }

    @Override // i6.g
    public long b() {
        return this.f17164b;
    }

    @Override // i6.g
    public g.a c() {
        return this.f17163a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17163a.equals(gVar.c()) && this.f17164b == gVar.b();
    }

    public int hashCode() {
        int hashCode = (this.f17163a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f17164b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f17163a + ", nextRequestWaitMillis=" + this.f17164b + "}";
    }
}
