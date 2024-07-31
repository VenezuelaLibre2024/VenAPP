package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* loaded from: classes.dex */
public class C0980d<F, S> {

    /* renamed from: a */
    public final F f4539a;

    /* renamed from: b */
    public final S f4540b;

    public C0980d(F f10, S s10) {
        this.f4539a = f10;
        this.f4540b = s10;
    }

    /* renamed from: a */
    public static <A, B> C0980d<A, B> m4819a(A a10, B b10) {
        return new C0980d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0980d)) {
            return false;
        }
        C0980d c0980d = (C0980d) obj;
        return C0979c.m4812a(c0980d.f4539a, this.f4539a) && C0979c.m4812a(c0980d.f4540b, this.f4540b);
    }

    public int hashCode() {
        F f10 = this.f4539a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f4540b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f4539a + " " + this.f4540b + "}";
    }
}
