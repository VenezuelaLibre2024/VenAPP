package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C0436i;
import androidx.camera.camera2.internal.compat.C0447n0;
import androidx.core.util.C0984h;
import java.util.List;
import p320r.C10556e;
import p320r.C10557f;
import p320r.C10574w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.k0 */
/* loaded from: classes.dex */
public class C0441k0 extends C0439j0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0441k0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0441k0 m2269e(CameraDevice cameraDevice, Handler handler) {
        return new C0441k0(cameraDevice, new C0447n0.a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.C0429e0.a
    /* renamed from: a */
    public void mo2221a(C10574w c10574w) {
        C0447n0.m2272c(this.f2197a, c10574w);
        C0436i.c cVar = new C0436i.c(c10574w.m32086a(), c10574w.m32090e());
        List<C10557f> m32088c = c10574w.m32088c();
        Handler handler = ((C0447n0.a) C0984h.m4833k((C0447n0.a) this.f2198b)).f2199a;
        C10556e m32087b = c10574w.m32087b();
        try {
            if (m32087b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) m32087b.m32050a();
                C0984h.m4833k(inputConfiguration);
                this.f2197a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C10574w.m32084h(m32088c), cVar, handler);
            } else if (c10574w.m32089d() == 1) {
                this.f2197a.createConstrainedHighSpeedCaptureSession(C0447n0.m2273d(m32088c), cVar, handler);
            } else {
                this.f2197a.createCaptureSessionByOutputConfigurations(C10574w.m32084h(m32088c), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }
}
