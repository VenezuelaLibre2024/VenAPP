package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.InterfaceC0665s1;

/* renamed from: s.b */
/* loaded from: classes.dex */
public class C10730b implements InterfaceC0665s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32673a(C0427d0 c0427d0) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c0427d0.m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
