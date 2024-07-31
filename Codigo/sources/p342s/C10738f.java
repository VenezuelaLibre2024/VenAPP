package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.f */
/* loaded from: classes.dex */
public class C10738f implements InterfaceC10745i0 {

    /* renamed from: a */
    public static final List<String> f27173a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32683a(C0427d0 c0427d0) {
        return f27173a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
