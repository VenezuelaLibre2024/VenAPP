package s;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.impl.s1;

/* loaded from: classes.dex */
public class c implements s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(androidx.camera.camera2.internal.compat.d0 d0Var) {
        Integer num = (Integer) d0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null) {
            return false;
        }
        num.intValue();
        return false;
    }

    public int a() {
        return 2;
    }
}
