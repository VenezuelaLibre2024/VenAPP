package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.core.util.C0984h;
import p320r.C10574w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.m0 */
/* loaded from: classes.dex */
public class C0445m0 extends C0441k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0445m0(CameraDevice cameraDevice) {
        super((CameraDevice) C0984h.m4833k(cameraDevice), null);
    }

    @Override // androidx.camera.camera2.internal.compat.C0441k0, androidx.camera.camera2.internal.compat.C0429e0.a
    /* renamed from: a */
    public void mo2221a(C10574w c10574w) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c10574w.m32093j();
        C0984h.m4833k(sessionConfiguration);
        try {
            this.f2197a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }
}
