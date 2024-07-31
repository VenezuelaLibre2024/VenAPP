package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: s.t */
/* loaded from: classes.dex */
public class C10758t implements InterfaceC0665s1 {

    /* renamed from: a */
    private static final List<String> f27186a = Arrays.asList("sm-j700f", "sm-j710f");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32735a(C0427d0 c0427d0) {
        return f27186a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
