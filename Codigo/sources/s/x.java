package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class x implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f25072a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return f25072a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) d0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
