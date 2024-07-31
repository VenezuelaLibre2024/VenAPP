package p342s;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.InterfaceC0665s1;

/* renamed from: s.i */
/* loaded from: classes.dex */
public class C10744i implements InterfaceC0665s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32689a(C0427d0 c0427d0) {
        Integer num = (Integer) c0427d0.m2215a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
