package x7;

import t6.u1;

/* loaded from: classes.dex */
public abstract class n extends f {

    /* renamed from: j, reason: collision with root package name */
    public final long f30644j;

    public n(s8.j jVar, s8.n nVar, u1 u1Var, int i10, Object obj, long j10, long j11, long j12) {
        super(jVar, nVar, 1, u1Var, i10, obj, j10, j11);
        t8.a.e(u1Var);
        this.f30644j = j12;
    }

    public long g() {
        long j10 = this.f30644j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean h();
}
