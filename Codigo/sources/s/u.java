package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f25068a = Arrays.asList("itel w6004");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f25069b = Arrays.asList("sm-j700f", "sm-j710f");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        List<String> list = f25069b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) d0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f25068a.contains(str.toLowerCase(locale));
    }
}
