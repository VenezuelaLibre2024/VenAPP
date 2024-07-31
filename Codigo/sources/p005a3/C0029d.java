package p005a3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: a3.d */
/* loaded from: classes.dex */
public class C0029d {
    /* renamed from: a */
    private static PackageInfo m100a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        return Build.VERSION.SDK_INT < 33 ? packageManager.getPackageInfo(packageName, RecognitionOptions.AZTEC) : packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L));
    }

    /* renamed from: b */
    public static boolean m101b(Context context, String str) {
        try {
            String[] strArr = m100a(context).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
