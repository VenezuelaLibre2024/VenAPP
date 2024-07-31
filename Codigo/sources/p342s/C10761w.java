package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.w */
/* loaded from: classes.dex */
public class C10761w implements InterfaceC10745i0 {

    /* renamed from: a */
    public static final List<String> f27190a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32738a(C0427d0 c0427d0) {
        return f27190a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
