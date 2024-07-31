package t;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.core.impl.t1;
import q.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f25689a;

    public a(t1 t1Var) {
        s.a aVar = (s.a) t1Var.b(s.a.class);
        this.f25689a = aVar == null ? null : aVar.b();
    }

    public void a(a.C0388a c0388a) {
        Range<Integer> range = this.f25689a;
        if (range != null) {
            c0388a.e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
