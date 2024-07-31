package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* loaded from: classes.dex */
public class c2 {

    /* renamed from: e, reason: collision with root package name */
    private static final Size f1833e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    private static final Size f1834f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    private static final Size f1835g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f1836h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile c2 f1837i;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f1838a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Size f1839b = null;

    /* renamed from: c, reason: collision with root package name */
    private final t.l f1840c = new t.l();

    /* renamed from: d, reason: collision with root package name */
    private final t.d f1841d = new t.d();

    private c2(Context context) {
        this.f1838a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size b10 = b();
        int width = b10.getWidth() * b10.getHeight();
        Size size = f1833e;
        if (width > size.getWidth() * size.getHeight()) {
            b10 = size;
        }
        return this.f1840c.a(b10);
    }

    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (f0.d.b(size, f1834f) && (size = this.f1841d.a()) == null) {
            size = f1835g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static c2 c(Context context) {
        if (f1837i == null) {
            synchronized (f1836h) {
                if (f1837i == null) {
                    f1837i = new c2(context);
                }
            }
        }
        return f1837i;
    }

    private Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f1838a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e10 = e(displays, z10);
        if (e10 == null && z10) {
            e10 = e(displays, false);
        }
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Size f() {
        if (this.f1839b != null) {
            return this.f1839b;
        }
        this.f1839b = a();
        return this.f1839b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f1839b = a();
    }
}
