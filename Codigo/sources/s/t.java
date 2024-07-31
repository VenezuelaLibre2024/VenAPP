package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class t implements s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f25067a = Arrays.asList("sm-j700f", "sm-j710f");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return f25067a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) d0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
