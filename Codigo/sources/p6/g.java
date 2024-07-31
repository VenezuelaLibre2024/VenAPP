package p6;

/* loaded from: classes.dex */
public final class g implements j6.b<String> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f22798a = new g();
    }

    public static g a() {
        return a.f22798a;
    }

    public static String b() {
        return (String) j6.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
