package be;

/* loaded from: classes.dex */
public final class m implements rd.b<nd.d> {

    /* renamed from: a, reason: collision with root package name */
    private final k f6459a;

    public m(k kVar) {
        this.f6459a = kVar;
    }

    public static m a(k kVar) {
        return new m(kVar);
    }

    public static nd.d c(k kVar) {
        return (nd.d) rd.d.e(kVar.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public nd.d get() {
        return c(this.f6459a);
    }
}
