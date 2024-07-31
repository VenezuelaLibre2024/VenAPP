package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.s1;

/* loaded from: classes.dex */
public class b implements s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) d0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
