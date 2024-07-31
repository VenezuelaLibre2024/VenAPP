package qe;

/* loaded from: classes.dex */
public final class c implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23973a;

    public c(a aVar) {
        this.f23973a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static zb.g c(a aVar) {
        return (zb.g) hi.b.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public zb.g get() {
        return c(this.f23973a);
    }
}
