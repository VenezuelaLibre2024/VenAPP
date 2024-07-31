package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.m;

/* loaded from: classes.dex */
final class r1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.k f2171a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(androidx.camera.core.impl.k kVar) {
        if (kVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f2171a = kVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.f2 b10;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            androidx.core.util.h.b(tag instanceof androidx.camera.core.impl.f2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            b10 = (androidx.camera.core.impl.f2) tag;
        } else {
            b10 = androidx.camera.core.impl.f2.b();
        }
        this.f2171a.b(new g(b10, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f2171a.c(new androidx.camera.core.impl.m(m.a.ERROR));
    }
}
