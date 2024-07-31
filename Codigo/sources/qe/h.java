package qe;

/* loaded from: classes.dex */
public final class h implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23978a;

    public h(a aVar) {
        this.f23978a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static ee.b<f6.g> c(a aVar) {
        return (ee.b) hi.b.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ee.b<f6.g> get() {
        return c(this.f23978a);
    }
}
