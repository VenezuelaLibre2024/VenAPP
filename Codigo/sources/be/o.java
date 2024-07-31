package be;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements rd.b<zd.s> {

    /* renamed from: a, reason: collision with root package name */
    private final n f6461a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Executor> f6462b;

    public o(n nVar, bk.a<Executor> aVar) {
        this.f6461a = nVar;
        this.f6462b = aVar;
    }

    public static o a(n nVar, bk.a<Executor> aVar) {
        return new o(nVar, aVar);
    }

    public static zd.s b(n nVar, Executor executor) {
        return (zd.s) rd.d.e(nVar.a(executor));
    }

    @Override // bk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zd.s get() {
        return b(this.f6461a, this.f6462b.get());
    }
}
