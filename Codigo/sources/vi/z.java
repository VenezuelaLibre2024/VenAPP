package vi;

import java.util.List;

/* loaded from: classes3.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static List<h> f29288a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f29289b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized List<h> a() {
        List<h> list;
        synchronized (z.class) {
            f29289b = true;
            list = f29288a;
        }
        return list;
    }
}
