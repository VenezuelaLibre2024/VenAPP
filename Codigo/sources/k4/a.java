package k4;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final C0317a Companion = new C0317a(null);

    /* renamed from: k4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0317a {
        private C0317a() {
        }

        public /* synthetic */ C0317a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a a(String rawValue) {
            kotlin.jvm.internal.n.e(rawValue, "rawValue");
            return kotlin.jvm.internal.n.a(rawValue, "MOBILE_APP_INSTALL") ? a.MOBILE_APP_INSTALL : kotlin.jvm.internal.n.a(rawValue, "CUSTOM_APP_EVENTS") ? a.CUSTOM : a.OTHER;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
