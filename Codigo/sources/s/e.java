package s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.internal.compat.z0;
import androidx.camera.core.impl.s1;
import java.util.List;

/* loaded from: classes.dex */
public class e implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private final z0 f25051a;

    /* renamed from: b, reason: collision with root package name */
    private List<Size> f25052b = null;

    public e(androidx.camera.camera2.internal.compat.d0 d0Var) {
        this.f25051a = d0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        Integer num = (Integer) d0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
