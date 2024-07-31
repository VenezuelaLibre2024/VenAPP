package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C0427d0;

/* renamed from: androidx.camera.camera2.internal.b4 */
/* loaded from: classes.dex */
final class C0412b4 {
    /* renamed from: a */
    public static boolean m2192a(C0427d0 c0427d0, int i10) {
        int[] iArr = (int[]) c0427d0.m2215a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
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
