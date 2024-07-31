package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public class g {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
