package vi;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final p f29193a;

    /* renamed from: b, reason: collision with root package name */
    private final g1 f29194b;

    private q(p pVar, g1 g1Var) {
        this.f29193a = (p) eb.o.p(pVar, "state is null");
        this.f29194b = (g1) eb.o.p(g1Var, "status is null");
    }

    public static q a(p pVar) {
        eb.o.e(pVar != p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new q(pVar, g1.f29100f);
    }

    public static q b(g1 g1Var) {
        eb.o.e(!g1Var.p(), "The error status must not be OK");
        return new q(p.TRANSIENT_FAILURE, g1Var);
    }

    public p c() {
        return this.f29193a;
    }

    public g1 d() {
        return this.f29194b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f29193a.equals(qVar.f29193a) && this.f29194b.equals(qVar.f29194b);
    }

    public int hashCode() {
        return this.f29193a.hashCode() ^ this.f29194b.hashCode();
    }

    public String toString() {
        if (this.f29194b.p()) {
            return this.f29193a.toString();
        }
        return this.f29193a + "(" + this.f29194b + ")";
    }
}
