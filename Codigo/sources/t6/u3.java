package t6;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: c, reason: collision with root package name */
    public static final u3 f26550c;

    /* renamed from: d, reason: collision with root package name */
    public static final u3 f26551d;

    /* renamed from: e, reason: collision with root package name */
    public static final u3 f26552e;

    /* renamed from: f, reason: collision with root package name */
    public static final u3 f26553f;

    /* renamed from: g, reason: collision with root package name */
    public static final u3 f26554g;

    /* renamed from: a, reason: collision with root package name */
    public final long f26555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26556b;

    static {
        u3 u3Var = new u3(0L, 0L);
        f26550c = u3Var;
        f26551d = new u3(Long.MAX_VALUE, Long.MAX_VALUE);
        f26552e = new u3(Long.MAX_VALUE, 0L);
        f26553f = new u3(0L, Long.MAX_VALUE);
        f26554g = u3Var;
    }

    public u3(long j10, long j11) {
        t8.a.a(j10 >= 0);
        t8.a.a(j11 >= 0);
        this.f26555a = j10;
        this.f26556b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f26555a;
        if (j13 == 0 && this.f26556b == 0) {
            return j10;
        }
        long U0 = t8.r0.U0(j10, j13, Long.MIN_VALUE);
        long b10 = t8.r0.b(j10, this.f26556b, Long.MAX_VALUE);
        boolean z10 = U0 <= j11 && j11 <= b10;
        boolean z11 = U0 <= j12 && j12 <= b10;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : U0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u3.class != obj.getClass()) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.f26555a == u3Var.f26555a && this.f26556b == u3Var.f26556b;
    }

    public int hashCode() {
        return (((int) this.f26555a) * 31) + ((int) this.f26556b);
    }
}
