package p342s;

import android.os.Build;
import androidx.camera.core.impl.InterfaceC0665s1;

/* renamed from: s.d0 */
/* loaded from: classes.dex */
public class C10735d0 implements InterfaceC0665s1 {
    /* renamed from: a */
    public static boolean m32678a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m32679b() {
        return m32678a();
    }
}
