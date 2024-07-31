package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p407w.C12029o0;
import p407w.C12030p;

/* renamed from: androidx.camera.core.impl.j0 */
/* loaded from: classes.dex */
public final class C0634j0 {

    /* renamed from: androidx.camera.core.impl.j0$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: a */
    public static void m3103a(Context context, C0614e0 c0614e0, C12030p c12030p) {
        Integer m38653d;
        if (c12030p != null) {
            try {
                m38653d = c12030p.m38653d();
                if (m38653d == null) {
                    C12029o0.m38648k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                C12029o0.m38641d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            m38653d = null;
        }
        C12029o0.m38638a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + m38653d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c12030p == null || m38653d.intValue() == 1)) {
                C12030p.f31982c.m38654e(c0614e0.m3037a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c12030p == null || m38653d.intValue() == 0) {
                    C12030p.f31981b.m38654e(c0614e0.m3037a());
                }
            }
        } catch (IllegalArgumentException e11) {
            C12029o0.m38640c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c0614e0.m3037a());
            throw new a("Expected camera missing from device.", e11);
        }
    }
}
