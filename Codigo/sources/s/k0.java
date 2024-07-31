package s;

import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Locale;

/* loaded from: classes.dex */
public class k0 implements s1 {
    private static boolean a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-F936");
    }

    private static boolean b() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("MI 8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return a() || b();
    }
}
