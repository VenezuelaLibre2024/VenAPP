package f0;

import android.util.Size;
import io.flutter.plugin.platform.PlatformPlugin;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f14848a = new Size(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Size f14849b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f14850c = new Size(640, 480);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f14851d = new Size(720, 480);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f14852e = new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f14853f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f14854g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static boolean b(Size size, Size size2) {
        return a(size) < a(size2);
    }
}
