package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.C0645m;
import androidx.core.util.C0984h;

/* renamed from: androidx.camera.camera2.internal.r1 */
/* loaded from: classes.dex */
final class C0544r1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final AbstractC0637k f2492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0544r1(AbstractC0637k abstractC0637k) {
        if (abstractC0637k == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f2492a = abstractC0637k;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C0620f2 m3069b;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C0984h.m4824b(tag instanceof C0620f2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            m3069b = (C0620f2) tag;
        } else {
            m3069b = C0620f2.m3069b();
        }
        this.f2492a.mo2411b(new C0487g(m3069b, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f2492a.mo2412c(new C0645m(C0645m.a.ERROR));
    }
}
