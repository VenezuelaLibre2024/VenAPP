package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m0 extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(CameraDevice cameraDevice) {
        super((CameraDevice) androidx.core.util.h.k(cameraDevice), null);
    }

    @Override // androidx.camera.camera2.internal.compat.k0, androidx.camera.camera2.internal.compat.e0.a
    public void a(r.w wVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) wVar.j();
        androidx.core.util.h.k(sessionConfiguration);
        try {
            this.f1894a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }
}
