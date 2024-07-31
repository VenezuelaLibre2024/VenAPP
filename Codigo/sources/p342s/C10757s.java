package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: s.s */
/* loaded from: classes.dex */
public class C10757s implements InterfaceC10745i0 {

    /* renamed from: a */
    private static final List<String> f27185a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320");

    /* renamed from: a */
    private static boolean m32733a() {
        Iterator<String> it = f27185a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m32734b(C0427d0 c0427d0) {
        return m32733a() && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
