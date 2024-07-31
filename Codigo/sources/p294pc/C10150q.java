package p294pc;

/* renamed from: pc.q */
/* loaded from: classes.dex */
public final class C10150q {

    /* renamed from: a */
    private final C10137e0<?> f24952a;

    /* renamed from: b */
    private final int f24953b;

    /* renamed from: c */
    private final int f24954c;

    private C10150q(Class<?> cls, int i10, int i11) {
        this((C10137e0<?>) C10137e0.m30307b(cls), i10, i11);
    }

    private C10150q(C10137e0<?> c10137e0, int i10, int i11) {
        this.f24952a = (C10137e0) C10135d0.m30304c(c10137e0, "Null dependency anInterface.");
        this.f24953b = i10;
        this.f24954c = i11;
    }

    /* renamed from: a */
    public static C10150q m30349a(Class<?> cls) {
        return new C10150q(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m30350b(int i10) {
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
    /* renamed from: h */
    public static C10150q m30351h(Class<?> cls) {
        return new C10150q(cls, 0, 0);
    }

    /* renamed from: i */
    public static C10150q m30352i(Class<?> cls) {
        return new C10150q(cls, 0, 1);
    }

    /* renamed from: j */
    public static C10150q m30353j(Class<?> cls) {
        return new C10150q(cls, 1, 0);
    }

    /* renamed from: k */
    public static C10150q m30354k(C10137e0<?> c10137e0) {
        return new C10150q(c10137e0, 1, 0);
    }

    /* renamed from: l */
    public static C10150q m30355l(Class<?> cls) {
        return new C10150q(cls, 1, 1);
    }

    /* renamed from: m */
    public static C10150q m30356m(C10137e0<?> c10137e0) {
        return new C10150q(c10137e0, 1, 1);
    }

    /* renamed from: n */
    public static C10150q m30357n(Class<?> cls) {
        return new C10150q(cls, 2, 0);
    }

    /* renamed from: c */
    public C10137e0<?> m30358c() {
        return this.f24952a;
    }

    /* renamed from: d */
    public boolean m30359d() {
        return this.f24954c == 2;
    }

    /* renamed from: e */
    public boolean m30360e() {
        return this.f24954c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10150q)) {
            return false;
        }
        C10150q c10150q = (C10150q) obj;
        return this.f24952a.equals(c10150q.f24952a) && this.f24953b == c10150q.f24953b && this.f24954c == c10150q.f24954c;
    }

    /* renamed from: f */
    public boolean m30361f() {
        return this.f24953b == 1;
    }

    /* renamed from: g */
    public boolean m30362g() {
        return this.f24953b == 2;
    }

    public int hashCode() {
        return ((((this.f24952a.hashCode() ^ 1000003) * 1000003) ^ this.f24953b) * 1000003) ^ this.f24954c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f24952a);
        sb2.append(", type=");
        int i10 = this.f24953b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(m30350b(this.f24954c));
        sb2.append("}");
        return sb2.toString();
    }
}
