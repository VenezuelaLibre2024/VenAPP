package p6;

/* loaded from: classes.dex */
public final class j implements j6.b<e> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final j f22805a = new j();
    }

    public static j a() {
        return a.f22805a;
    }

    public static e c() {
        return (e) j6.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
