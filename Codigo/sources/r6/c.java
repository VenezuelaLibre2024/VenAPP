package r6;

/* loaded from: classes.dex */
public final class c implements j6.b<r6.a> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f24743a = new c();
    }

    public static c a() {
        return a.f24743a;
    }

    public static r6.a b() {
        return (r6.a) j6.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public r6.a get() {
        return b();
    }
}
