package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f25071a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return f25071a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) d0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
