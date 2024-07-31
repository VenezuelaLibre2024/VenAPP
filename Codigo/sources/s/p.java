package s;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.s1;
import io.flutter.plugin.platform.PlatformPlugin;

/* loaded from: classes.dex */
public class p implements s1 {
    private Size[] b() {
        return new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
    }

    private static boolean c() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        return c();
    }

    public Size[] a(int i10) {
        return (i10 == 34 && c()) ? b() : new Size[0];
    }
}
