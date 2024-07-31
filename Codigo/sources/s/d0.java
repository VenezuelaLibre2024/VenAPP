package s;

import android.os.Build;
import androidx.camera.core.impl.s1;

/* loaded from: classes.dex */
public class d0 implements s1 {
    public static boolean a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return a();
    }
}
