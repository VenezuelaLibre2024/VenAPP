package p092f0;

import android.util.Size;
import io.flutter.plugin.platform.PlatformPlugin;

/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C7264d {

    /* renamed from: a */
    public static final Size f16271a = new Size(0, 0);

    /* renamed from: b */
    public static final Size f16272b = new Size(320, 240);

    /* renamed from: c */
    public static final Size f16273c = new Size(640, 480);

    /* renamed from: d */
    public static final Size f16274d = new Size(720, 480);

    /* renamed from: e */
    public static final Size f16275e = new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720);

    /* renamed from: f */
    public static final Size f16276f = new Size(1920, 1080);

    /* renamed from: g */
    public static final Size f16277g = new Size(1920, 1440);

    /* renamed from: a */
    public static int m21736a(Size size) {
        return size.getWidth() * size.getHeight();
    }

    /* renamed from: b */
    public static boolean m21737b(Size size, Size size2) {
        return m21736a(size) < m21736a(size2);
    }
}
