package p066dg;

/* renamed from: dg.f */
/* loaded from: classes2.dex */
public final class C6945f {

    /* renamed from: a */
    private final int f15484a;

    /* renamed from: b */
    private final int f15485b;

    /* renamed from: a */
    public int m20092a() {
        return this.f15485b;
    }

    /* renamed from: b */
    public int m20093b() {
        return this.f15484a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6945f)) {
            return false;
        }
        C6945f c6945f = (C6945f) obj;
        return this.f15484a == c6945f.f15484a && this.f15485b == c6945f.f15485b;
    }

    public int hashCode() {
        return (this.f15484a * 32713) + this.f15485b;
    }

    public String toString() {
        return this.f15484a + "x" + this.f15485b;
    }
}
