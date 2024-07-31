package pc;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final e0<?> f23019a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23020b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23021c;

    private q(Class<?> cls, int i10, int i11) {
        this((e0<?>) e0.b(cls), i10, i11);
    }

    private q(e0<?> e0Var, int i10, int i11) {
        this.f23019a = (e0) d0.c(e0Var, "Null dependency anInterface.");
        this.f23020b = i10;
        this.f23021c = i11;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q k(e0<?> e0Var) {
        return new q(e0Var, 1, 0);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q m(e0<?> e0Var) {
        return new q(e0Var, 1, 1);
    }

    public static q n(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public e0<?> c() {
        return this.f23019a;
    }

    public boolean d() {
        return this.f23021c == 2;
    }

    public boolean e() {
        return this.f23021c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f23019a.equals(qVar.f23019a) && this.f23020b == qVar.f23020b && this.f23021c == qVar.f23021c;
    }

    public boolean f() {
        return this.f23020b == 1;
    }

    public boolean g() {
        return this.f23020b == 2;
    }

    public int hashCode() {
        return ((((this.f23019a.hashCode() ^ 1000003) * 1000003) ^ this.f23020b) * 1000003) ^ this.f23021c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f23019a);
        sb2.append(", type=");
        int i10 = this.f23020b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f23021c));
        sb2.append("}");
        return sb2.toString();
    }
}
