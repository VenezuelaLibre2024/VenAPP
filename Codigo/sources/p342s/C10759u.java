package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.u */
/* loaded from: classes.dex */
public class C10759u implements InterfaceC10745i0 {

    /* renamed from: a */
    private static final List<String> f27187a = Arrays.asList("itel w6004");

    /* renamed from: b */
    private static final List<String> f27188b = Arrays.asList("sm-j700f", "sm-j710f");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32736a(C0427d0 c0427d0) {
        List<String> list = f27188b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f27187a.contains(str.toLowerCase(locale));
    }
}
