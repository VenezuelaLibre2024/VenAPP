package n6;

/* loaded from: classes.dex */
public final class g implements j6.b<o6.f> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<r6.a> f21821a;

    public g(bk.a<r6.a> aVar) {
        this.f21821a = aVar;
    }

    public static o6.f a(r6.a aVar) {
        return (o6.f) j6.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(bk.a<r6.a> aVar) {
        return new g(aVar);
    }

    @Override // bk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o6.f get() {
        return a(this.f21821a.get());
    }
}
