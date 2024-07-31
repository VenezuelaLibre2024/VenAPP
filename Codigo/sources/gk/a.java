package gk;

import gk.f;
import kotlin.jvm.internal.n;
import ok.p;

/* loaded from: classes3.dex */
public abstract class a implements f.b {

    /* renamed from: a, reason: collision with root package name */
    private final f.c<?> f16281a;

    public a(f.c<?> key) {
        n.e(key, "key");
        this.f16281a = key;
    }

    @Override // gk.f
    public f Q(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    @Override // gk.f
    public f U(f fVar) {
        return f.b.a.d(this, fVar);
    }

    @Override // gk.f.b, gk.f
    public <E extends f.b> E b(f.c<E> cVar) {
        return (E) f.b.a.b(this, cVar);
    }

    @Override // gk.f.b
    public f.c<?> getKey() {
        return this.f16281a;
    }

    @Override // gk.f
    public <R> R z0(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r10, pVar);
    }
}
