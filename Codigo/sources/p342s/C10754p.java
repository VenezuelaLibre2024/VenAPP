package p342s;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0665s1;
import io.flutter.plugin.platform.PlatformPlugin;

/* renamed from: s.p */
/* loaded from: classes.dex */
public class C10754p implements InterfaceC0665s1 {
    /* renamed from: b */
    private Size[] m32717b() {
        return new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
    }

    /* renamed from: c */
    private static boolean m32718c() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m32719d() {
        return m32718c();
    }

    /* renamed from: a */
    public Size[] m32720a(int i10) {
        return (i10 == 34 && m32718c()) ? m32717b() : new Size[0];
    }
}
