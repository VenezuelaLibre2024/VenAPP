package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.internal.compat.b */
/* loaded from: classes.dex */
public class C0421b {
    /* renamed from: a */
    public static void m2206a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
