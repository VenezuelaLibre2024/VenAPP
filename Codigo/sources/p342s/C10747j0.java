package p342s;

import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import p051d0.InterfaceC6812g;

/* renamed from: s.j0 */
/* loaded from: classes.dex */
public final class C10747j0 implements InterfaceC6812g {
    /* renamed from: a */
    private static boolean m32691a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m32692b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: c */
    private static boolean m32693c() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m32694d(C0427d0 c0427d0) {
        return m32691a() || m32692b() || m32693c();
    }
}
