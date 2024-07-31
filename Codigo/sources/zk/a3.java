package zk;

import gk.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a3 implements f.b, f.c<a3> {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f32842a = new a3();

    private a3() {
    }

    @Override // gk.f
    public gk.f Q(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    @Override // gk.f
    public gk.f U(gk.f fVar) {
        return f.b.a.d(this, fVar);
    }

    @Override // gk.f.b, gk.f
    public <E extends f.b> E b(f.c<E> cVar) {
        return (E) f.b.a.b(this, cVar);
    }

    @Override // gk.f.b
    public f.c<?> getKey() {
        return this;
    }

    @Override // gk.f
    public <R> R z0(R r10, ok.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r10, pVar);
    }
}
