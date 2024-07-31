package p051d0;

import android.os.Build;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0665s1;

/* renamed from: d0.d */
/* loaded from: classes.dex */
public final class C6809d implements InterfaceC0665s1 {
    /* renamed from: a */
    private static boolean m19694a() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m19695b() {
        m19694a();
        return false;
    }

    /* renamed from: c */
    private static boolean m19696c() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    private static boolean m19697d() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m19698f() {
        return m19697d() || m19696c() || m19695b();
    }

    /* renamed from: e */
    public boolean m19699e(InterfaceC0649n0.a<?> aVar) {
        return aVar != C0642l0.f2875i;
    }
}
