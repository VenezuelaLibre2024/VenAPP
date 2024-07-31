package qe;

/* loaded from: classes.dex */
public final class b implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23972a;

    public b(a aVar) {
        this.f23972a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) hi.b.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f23972a);
    }
}
