package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z extends a0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // androidx.camera.camera2.internal.compat.a0, androidx.camera.camera2.internal.compat.i.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int captureBurstRequests;
        captureBurstRequests = this.f1844a.captureBurstRequests(list, executor, captureCallback);
        return captureBurstRequests;
    }

    @Override // androidx.camera.camera2.internal.compat.a0, androidx.camera.camera2.internal.compat.i.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int singleRepeatingRequest;
        singleRepeatingRequest = this.f1844a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
        return singleRepeatingRequest;
    }
}
