package dg;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f14127a;

    /* renamed from: b, reason: collision with root package name */
    private kg.b f14128b;

    public c(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f14127a = bVar;
    }

    public kg.b a() {
        if (this.f14128b == null) {
            this.f14128b = this.f14127a.b();
        }
        return this.f14128b;
    }

    public kg.a b(int i10, kg.a aVar) {
        return this.f14127a.c(i10, aVar);
    }

    public int c() {
        return this.f14127a.d();
    }

    public int d() {
        return this.f14127a.f();
    }

    public boolean e() {
        return this.f14127a.e().f();
    }

    public c f() {
        return new c(this.f14127a.a(this.f14127a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (m unused) {
            return "";
        }
    }
}
