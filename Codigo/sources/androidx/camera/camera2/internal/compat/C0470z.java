package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.z */
/* loaded from: classes.dex */
public class C0470z extends C0419a0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0470z(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // androidx.camera.camera2.internal.compat.C0419a0, androidx.camera.camera2.internal.compat.C0436i.a
    /* renamed from: b */
    public int mo2203b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int captureBurstRequests;
        captureBurstRequests = this.f2147a.captureBurstRequests(list, executor, captureCallback);
        return captureBurstRequests;
    }

    @Override // androidx.camera.camera2.internal.compat.C0419a0, androidx.camera.camera2.internal.compat.C0436i.a
    /* renamed from: c */
    public int mo2204c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int singleRepeatingRequest;
        singleRepeatingRequest = this.f2147a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
        return singleRepeatingRequest;
    }
}
