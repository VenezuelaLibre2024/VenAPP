package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f25066a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320");

    private static boolean a() {
        Iterator<String> it = f25066a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return a() && ((Integer) d0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
