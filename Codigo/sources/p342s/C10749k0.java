package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Locale;

/* renamed from: s.k0 */
/* loaded from: classes.dex */
public class C10749k0 implements InterfaceC0665s1 {
    /* renamed from: a */
    private static boolean m32696a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-F936");
    }

    /* renamed from: b */
    private static boolean m32697b() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("MI 8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m32698c() {
        return m32696a() || m32697b();
    }
}
