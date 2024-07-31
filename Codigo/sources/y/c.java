package y;

import y.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends o.c {

    /* renamed from: a */
    private final g0.v<androidx.camera.core.o> f31464a;

    /* renamed from: b */
    private final g0.v<f0> f31465b;

    /* renamed from: c */
    private final int f31466c;

    /* renamed from: d */
    private final int f31467d;

    public c(g0.v<androidx.camera.core.o> vVar, g0.v<f0> vVar2, int i10, int i11) {
        if (vVar == null) {
            throw new NullPointerException("Null imageEdge");
        }
        this.f31464a = vVar;
        if (vVar2 == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f31465b = vVar2;
        this.f31466c = i10;
        this.f31467d = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.c
    public g0.v<androidx.camera.core.o> a() {
        return this.f31464a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.c
    public int b() {
        return this.f31466c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.c
    public int c() {
        return this.f31467d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.c
    public g0.v<f0> d() {
        return this.f31465b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.c)) {
            return false;
        }
        o.c cVar = (o.c) obj;
        return this.f31464a.equals(cVar.a()) && this.f31465b.equals(cVar.d()) && this.f31466c == cVar.b() && this.f31467d == cVar.c();
    }

    public int hashCode() {
        return ((((((this.f31464a.hashCode() ^ 1000003) * 1000003) ^ this.f31465b.hashCode()) * 1000003) ^ this.f31466c) * 1000003) ^ this.f31467d;
    }

    public String toString() {
        return "Out{imageEdge=" + this.f31464a + ", requestEdge=" + this.f31465b + ", inputFormat=" + this.f31466c + ", outputFormat=" + this.f31467d + "}";
    }
}
