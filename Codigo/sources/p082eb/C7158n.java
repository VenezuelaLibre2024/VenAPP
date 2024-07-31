package p082eb;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: eb.n */
/* loaded from: classes2.dex */
final class C7158n {

    /* renamed from: a */
    private static final Logger f16032a = Logger.getLogger(C7158n.class.getName());

    /* renamed from: b */
    private static final InterfaceC7157m f16033b = m21295c();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eb.n$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC7157m {
        private b() {
        }
    }

    private C7158n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m21293a(String str) {
        if (m21297e(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m21294b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    /* renamed from: c */
    private static InterfaceC7157m m21295c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m21296d(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m21297e(String str) {
        return str == null || str.isEmpty();
    }
}
