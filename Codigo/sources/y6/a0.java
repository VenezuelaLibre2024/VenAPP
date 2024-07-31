package y6;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f31686c = new a0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f31687a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31688b;

    public a0(long j10, long j11) {
        this.f31687a = j10;
        this.f31688b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f31687a == a0Var.f31687a && this.f31688b == a0Var.f31688b;
    }

    public int hashCode() {
        return (((int) this.f31687a) * 31) + ((int) this.f31688b);
    }

    public String toString() {
        return "[timeUs=" + this.f31687a + ", position=" + this.f31688b + "]";
    }
}
