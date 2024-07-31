package p354t;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C0701y1;
import p298q.C10214a;
import p342s.C10733c0;
import p342s.C10750l;

/* renamed from: t.p */
/* loaded from: classes.dex */
public class C10951p {

    /* renamed from: a */
    public static final Rational f27850a = new Rational(16, 9);

    /* renamed from: a */
    private static boolean m33431a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    /* renamed from: b */
    public static void m33432b(Size size, C0701y1.b bVar) {
        if (((C10733c0) C10750l.m32699a(C10733c0.class)) == null || m33431a(size, f27850a)) {
            return;
        }
        C10214a.a aVar = new C10214a.a();
        aVar.m30571e(CaptureRequest.TONEMAP_MODE, 2);
        bVar.m3398g(aVar.m30569c());
    }
}
