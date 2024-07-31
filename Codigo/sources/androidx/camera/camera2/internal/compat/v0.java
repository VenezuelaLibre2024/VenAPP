package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v0 extends u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.u0, androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public CameraCharacteristics b(String str) {
        try {
            return this.f1932a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.u0, androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f1932a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }
}
