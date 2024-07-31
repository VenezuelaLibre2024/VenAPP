package dl;

import gk.f;
import ok.p;

/* loaded from: classes3.dex */
public final class e implements gk.f {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f14251a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ gk.f f14252b;

    public e(Throwable th2, gk.f fVar) {
        this.f14251a = th2;
        this.f14252b = fVar;
    }

    @Override // gk.f
    public gk.f Q(f.c<?> cVar) {
        return this.f14252b.Q(cVar);
    }

    @Override // gk.f
    public gk.f U(gk.f fVar) {
        return this.f14252b.U(fVar);
    }

    @Override // gk.f
    public <E extends f.b> E b(f.c<E> cVar) {
        return (E) this.f14252b.b(cVar);
    }

    @Override // gk.f
    public <R> R z0(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) this.f14252b.z0(r10, pVar);
    }
}
