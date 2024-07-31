package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
final class s1 extends androidx.camera.core.impl.k {

    /* renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f2216a;

    private s1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f2216a = captureCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s1 d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new s1(captureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraCaptureSession.CaptureCallback e() {
        return this.f2216a;
    }
}
