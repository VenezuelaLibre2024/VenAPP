package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class j0 {

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static void a(Context context, e0 e0Var, w.p pVar) {
        Integer d10;
        if (pVar != null) {
            try {
                d10 = pVar.d();
                if (d10 == null) {
                    w.o0.k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                w.o0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            d10 = null;
        }
        w.o0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d10);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (pVar == null || d10.intValue() == 1)) {
                w.p.f29527c.e(e0Var.a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (pVar == null || d10.intValue() == 0) {
                    w.p.f29526b.e(e0Var.a());
                }
            }
        } catch (IllegalArgumentException e11) {
            w.o0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + e0Var.a());
            throw new a("Expected camera missing from device.", e11);
        }
    }
}
