package xc;

import xc.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b0 extends g0 {

    /* renamed from: a */
    private final g0.a f30947a;

    /* renamed from: b */
    private final g0.c f30948b;

    /* renamed from: c */
    private final g0.b f30949c;

    public b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f30947a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f30948b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f30949c = bVar;
    }

    @Override // xc.g0
    public g0.a a() {
        return this.f30947a;
    }

    @Override // xc.g0
    public g0.b c() {
        return this.f30949c;
    }

    @Override // xc.g0
    public g0.c d() {
        return this.f30948b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f30947a.equals(g0Var.a()) && this.f30948b.equals(g0Var.d()) && this.f30949c.equals(g0Var.c());
    }

    public int hashCode() {
        return ((((this.f30947a.hashCode() ^ 1000003) * 1000003) ^ this.f30948b.hashCode()) * 1000003) ^ this.f30949c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f30947a + ", osData=" + this.f30948b + ", deviceData=" + this.f30949c + "}";
    }
}
