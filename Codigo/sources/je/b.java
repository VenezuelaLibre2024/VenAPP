package je;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f19887a;

    private b() {
    }

    public static b b() {
        if (f19887a == null) {
            f19887a = new b();
        }
        return f19887a;
    }

    @Override // je.a
    public long a() {
        return System.currentTimeMillis();
    }
}
