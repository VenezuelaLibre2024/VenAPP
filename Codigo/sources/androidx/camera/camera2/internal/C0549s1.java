package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC0637k;

/* renamed from: androidx.camera.camera2.internal.s1 */
/* loaded from: classes.dex */
final class C0549s1 extends AbstractC0637k {

    /* renamed from: a */
    private final CameraCaptureSession.CaptureCallback f2537a;

    private C0549s1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f2537a = captureCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C0549s1 m2653d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C0549s1(captureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public CameraCaptureSession.CaptureCallback m2654e() {
        return this.f2537a;
    }
}
