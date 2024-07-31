package qe;

/* loaded from: classes.dex */
public final class d implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23974a;

    public d(a aVar) {
        this.f23974a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static fe.f c(a aVar) {
        return (fe.f) hi.b.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public fe.f get() {
        return c(this.f23974a);
    }
}
