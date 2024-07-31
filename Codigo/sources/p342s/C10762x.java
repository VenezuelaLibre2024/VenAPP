package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.x */
/* loaded from: classes.dex */
public class C10762x implements InterfaceC10745i0 {

    /* renamed from: a */
    public static final List<String> f27191a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32739a(C0427d0 c0427d0) {
        return f27191a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
