package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
/* loaded from: classes.dex */
public class C0942a {

    /* renamed from: a */
    public static final int f4457a;

    /* renamed from: b */
    public static final int f4458b;

    /* renamed from: c */
    public static final int f4459c;

    /* renamed from: d */
    public static final int f4460d;

    /* renamed from: androidx.core.os.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        static final int f4461a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b */
        static final int f4462b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c */
        static final int f4463c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d */
        static final int f4464d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f4457a = i10 >= 30 ? a.f4461a : 0;
        f4458b = i10 >= 30 ? a.f4462b : 0;
        f4459c = i10 >= 30 ? a.f4463c : 0;
        f4460d = i10 >= 30 ? a.f4464d : 0;
    }

    /* renamed from: a */
    protected static boolean m4697a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m4698b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m4699c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && m4697a("S", Build.VERSION.CODENAME));
    }

    /* renamed from: d */
    public static boolean m4700d() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && m4697a("Tiramisu", Build.VERSION.CODENAME));
    }
}
