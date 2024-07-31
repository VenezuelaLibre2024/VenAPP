package eb;

import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f14609a = Logger.getLogger(n.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final m f14610b = c();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b implements m {
        private b() {
        }
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    private static m c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }
}
