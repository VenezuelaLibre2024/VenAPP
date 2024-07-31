package x7;

import t6.u1;

/* loaded from: classes.dex */
public abstract class a extends n {

    /* renamed from: k, reason: collision with root package name */
    public final long f30574k;

    /* renamed from: l, reason: collision with root package name */
    public final long f30575l;

    /* renamed from: m, reason: collision with root package name */
    private c f30576m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f30577n;

    public a(s8.j jVar, s8.n nVar, u1 u1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(jVar, nVar, u1Var, i10, obj, j10, j11, j14);
        this.f30574k = j12;
        this.f30575l = j13;
    }

    public final int i(int i10) {
        return ((int[]) t8.a.i(this.f30577n))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c j() {
        return (c) t8.a.i(this.f30576m);
    }

    public void k(c cVar) {
        this.f30576m = cVar;
        this.f30577n = cVar.a();
    }
}
