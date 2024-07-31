package androidx.core.util;

/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final S f3868b;

    public d(F f10, S s10) {
        this.f3867a = f10;
        this.f3868b = s10;
    }

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f3867a, this.f3867a) && c.a(dVar.f3868b, this.f3868b);
    }

    public int hashCode() {
        F f10 = this.f3867a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f3868b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3867a + " " + this.f3868b + "}";
    }
}
