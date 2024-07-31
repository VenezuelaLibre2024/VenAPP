package y;

import y.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends e0.a {

    /* renamed from: a */
    private final g0.v<e0.b> f31487a;

    /* renamed from: b */
    private final int f31488b;

    /* renamed from: c */
    private final int f31489c;

    public f(g0.v<e0.b> vVar, int i10, int i11) {
        if (vVar == null) {
            throw new NullPointerException("Null edge");
        }
        this.f31487a = vVar;
        this.f31488b = i10;
        this.f31489c = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.e0.a
    public g0.v<e0.b> a() {
        return this.f31487a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.e0.a
    public int b() {
        return this.f31488b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.e0.a
    public int c() {
        return this.f31489c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0.a)) {
            return false;
        }
        e0.a aVar = (e0.a) obj;
        return this.f31487a.equals(aVar.a()) && this.f31488b == aVar.b() && this.f31489c == aVar.c();
    }

    public int hashCode() {
        return ((((this.f31487a.hashCode() ^ 1000003) * 1000003) ^ this.f31488b) * 1000003) ^ this.f31489c;
    }

    public String toString() {
        return "In{edge=" + this.f31487a + ", inputFormat=" + this.f31488b + ", outputFormat=" + this.f31489c + "}";
    }
}
