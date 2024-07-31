package be;

/* loaded from: classes.dex */
public final class g implements rd.b<zb.g> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6444a;

    public g(d dVar) {
        this.f6444a = dVar;
    }

    public static g a(d dVar) {
        return new g(dVar);
    }

    public static zb.g c(d dVar) {
        return (zb.g) rd.d.e(dVar.c());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public zb.g get() {
        return c(this.f6444a);
    }
}
