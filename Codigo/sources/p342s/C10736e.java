package p342s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.camera2.internal.compat.C0471z0;
import androidx.camera.core.impl.InterfaceC0665s1;
import java.util.List;

/* renamed from: s.e */
/* loaded from: classes.dex */
public class C10736e implements InterfaceC0665s1 {

    /* renamed from: a */
    private final C0471z0 f27170a;

    /* renamed from: b */
    private List<Size> f27171b = null;

    public C10736e(C0427d0 c0427d0) {
        this.f27170a = c0427d0.m2216b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m32680a(C0427d0 c0427d0) {
        Integer num = (Integer) c0427d0.m2215a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
