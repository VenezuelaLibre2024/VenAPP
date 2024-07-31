package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.i;
import androidx.camera.camera2.internal.compat.n0;
import java.util.List;

/* loaded from: classes.dex */
public class k0 extends j0 {
    public k0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static k0 e(CameraDevice cameraDevice, Handler handler) {
        return new k0(cameraDevice, new n0.a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.e0.a
    public void a(r.w wVar) {
        n0.c(this.f1894a, wVar);
        i.c cVar = new i.c(wVar.a(), wVar.e());
        List<r.f> c10 = wVar.c();
        Handler handler = ((n0.a) androidx.core.util.h.k((n0.a) this.f1895b)).f1896a;
        r.e b10 = wVar.b();
        try {
            if (b10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                androidx.core.util.h.k(inputConfiguration);
                this.f1894a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, r.w.h(c10), cVar, handler);
            } else if (wVar.d() == 1) {
                this.f1894a.createConstrainedHighSpeedCaptureSession(n0.d(c10), cVar, handler);
            } else {
                this.f1894a.createCaptureSessionByOutputConfigurations(r.w.h(c10), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }
}
