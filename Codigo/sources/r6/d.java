package r6;

/* loaded from: classes.dex */
public final class d implements j6.b<r6.a> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f24744a = new d();
    }

    public static d a() {
        return a.f24744a;
    }

    public static r6.a c() {
        return (r6.a) j6.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r6.a get() {
        return c();
    }
}
