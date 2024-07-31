package dg;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f14130a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14131b;

    public int a() {
        return this.f14131b;
    }

    public int b() {
        return this.f14130a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14130a == fVar.f14130a && this.f14131b == fVar.f14131b;
    }

    public int hashCode() {
        return (this.f14130a * 32713) + this.f14131b;
    }

    public String toString() {
        return this.f14130a + "x" + this.f14131b;
    }
}
