package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import p092f0.C7264d;
import p354t.C10939d;
import p354t.C10947l;

/* renamed from: androidx.camera.camera2.internal.c2 */
/* loaded from: classes.dex */
public class C0416c2 {

    /* renamed from: e */
    private static final Size f2136e = new Size(1920, 1080);

    /* renamed from: f */
    private static final Size f2137f = new Size(320, 240);

    /* renamed from: g */
    private static final Size f2138g = new Size(640, 480);

    /* renamed from: h */
    private static final Object f2139h = new Object();

    /* renamed from: i */
    private static volatile C0416c2 f2140i;

    /* renamed from: a */
    private final DisplayManager f2141a;

    /* renamed from: b */
    private volatile Size f2142b = null;

    /* renamed from: c */
    private final C10947l f2143c = new C10947l();

    /* renamed from: d */
    private final C10939d f2144d = new C10939d();

    private C0416c2(Context context) {
        this.f2141a = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: a */
    private Size m2193a() {
        Size m2194b = m2194b();
        int width = m2194b.getWidth() * m2194b.getHeight();
        Size size = f2136e;
        if (width > size.getWidth() * size.getHeight()) {
            m2194b = size;
        }
        return this.f2143c.m33424a(m2194b);
    }

    /* renamed from: b */
    private Size m2194b() {
        Point point = new Point();
        m2197d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (C7264d.m21737b(size, f2137f) && (size = this.f2144d.m33411a()) == null) {
            size = f2138g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: c */
    public static C0416c2 m2195c(Context context) {
        if (f2140i == null) {
            synchronized (f2139h) {
                if (f2140i == null) {
                    f2140i = new C0416c2(context);
                }
            }
        }
        return f2140i;
    }

    /* renamed from: e */
    private Display m2196e(Display[] displayArr, boolean z10) {
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

    /* renamed from: d */
    public Display m2197d(boolean z10) {
        Display[] displays = this.f2141a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display m2196e = m2196e(displays, z10);
        if (m2196e == null && z10) {
            m2196e = m2196e(displays, false);
        }
        if (m2196e != null) {
            return m2196e;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Size m2198f() {
        if (this.f2142b != null) {
            return this.f2142b;
        }
        this.f2142b = m2193a();
        return this.f2142b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2199g() {
        this.f2142b = m2193a();
    }
}
