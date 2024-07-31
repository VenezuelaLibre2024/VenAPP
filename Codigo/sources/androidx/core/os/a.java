package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3785a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3786b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3787c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3788d;

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0047a {

        /* renamed from: a, reason: collision with root package name */
        static final int f3789a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b, reason: collision with root package name */
        static final int f3790b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c, reason: collision with root package name */
        static final int f3791c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d, reason: collision with root package name */
        static final int f3792d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3785a = i10 >= 30 ? C0047a.f3789a : 0;
        f3786b = i10 >= 30 ? C0047a.f3790b : 0;
        f3787c = i10 >= 30 ? C0047a.f3791c : 0;
        f3788d = i10 >= 30 ? C0047a.f3792d : 0;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated
    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
