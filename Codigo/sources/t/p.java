package t;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.y1;
import q.a;
import s.c0;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f25706a = new Rational(16, 9);

    private static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, y1.b bVar) {
        if (((c0) s.l.a(c0.class)) == null || a(size, f25706a)) {
            return;
        }
        a.C0388a c0388a = new a.C0388a();
        c0388a.e(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0388a.c());
    }
}
