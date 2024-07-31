package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: androidx.camera.camera2.internal.compat.e */
/* loaded from: classes.dex */
public class C0428e {
    /* renamed from: a */
    public static <T> OutputConfiguration m2217a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: b */
    public static void m2218b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
