package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;

/* loaded from: classes.dex */
final class b4 {
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var, int i10) {
        int[] iArr = (int[]) d0Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
