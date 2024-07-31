package s;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class y implements s1 {

    /* renamed from: a, reason: collision with root package name */
    static final List<String> f25073a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    private static boolean a() {
        return f() || e();
    }

    private static boolean b() {
        return c() && a();
    }

    private static boolean c() {
        return f25073a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean d() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f();
    }

    private static boolean e() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    private static boolean f() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g() {
        return d() || b();
    }
}
