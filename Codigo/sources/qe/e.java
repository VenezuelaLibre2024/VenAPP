package qe;

/* loaded from: classes.dex */
public final class e implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23975a;

    public e(a aVar) {
        this.f23975a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static ee.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (ee.b) hi.b.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ee.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f23975a);
    }
}
