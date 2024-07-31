package s;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.impl.s1;

/* loaded from: classes.dex */
public class i implements s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        Integer num = (Integer) d0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
