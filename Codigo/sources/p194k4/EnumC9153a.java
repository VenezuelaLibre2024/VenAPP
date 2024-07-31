package p194k4;

import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: k4.a */
/* loaded from: classes.dex */
public enum EnumC9153a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final a Companion = new a(null);

    /* renamed from: k4.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC9153a m27012a(String rawValue) {
            C9322n.m27781e(rawValue, "rawValue");
            return C9322n.m27777a(rawValue, "MOBILE_APP_INSTALL") ? EnumC9153a.MOBILE_APP_INSTALL : C9322n.m27777a(rawValue, "CUSTOM_APP_EVENTS") ? EnumC9153a.CUSTOM : EnumC9153a.OTHER;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9153a[] valuesCustom() {
        EnumC9153a[] valuesCustom = values();
        return (EnumC9153a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
