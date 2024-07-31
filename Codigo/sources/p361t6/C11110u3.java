package p361t6;

import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.u3 */
/* loaded from: classes.dex */
public final class C11110u3 {

    /* renamed from: c */
    public static final C11110u3 f28836c;

    /* renamed from: d */
    public static final C11110u3 f28837d;

    /* renamed from: e */
    public static final C11110u3 f28838e;

    /* renamed from: f */
    public static final C11110u3 f28839f;

    /* renamed from: g */
    public static final C11110u3 f28840g;

    /* renamed from: a */
    public final long f28841a;

    /* renamed from: b */
    public final long f28842b;

    static {
        C11110u3 c11110u3 = new C11110u3(0L, 0L);
        f28836c = c11110u3;
        f28837d = new C11110u3(Long.MAX_VALUE, Long.MAX_VALUE);
        f28838e = new C11110u3(Long.MAX_VALUE, 0L);
        f28839f = new C11110u3(0L, Long.MAX_VALUE);
        f28840g = c11110u3;
    }

    public C11110u3(long j10, long j11) {
        C11137a.m34599a(j10 >= 0);
        C11137a.m34599a(j11 >= 0);
        this.f28841a = j10;
        this.f28842b = j11;
    }

    /* renamed from: a */
    public long m34560a(long j10, long j11, long j12) {
        long j13 = this.f28841a;
        if (j13 == 0 && this.f28842b == 0) {
            return j10;
        }
        long m34897U0 = C11172r0.m34897U0(j10, j13, Long.MIN_VALUE);
        long m34911b = C11172r0.m34911b(j10, this.f28842b, Long.MAX_VALUE);
        boolean z10 = m34897U0 <= j11 && j11 <= m34911b;
        boolean z11 = m34897U0 <= j12 && j12 <= m34911b;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : m34897U0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11110u3.class != obj.getClass()) {
            return false;
        }
        C11110u3 c11110u3 = (C11110u3) obj;
        return this.f28841a == c11110u3.f28841a && this.f28842b == c11110u3.f28842b;
    }

    public int hashCode() {
        return (((int) this.f28841a) * 31) + ((int) this.f28842b);
    }
}
