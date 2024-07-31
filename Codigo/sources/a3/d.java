package a3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public class d {
    private static PackageInfo a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        return Build.VERSION.SDK_INT < 33 ? packageManager.getPackageInfo(packageName, RecognitionOptions.AZTEC) : packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L));
    }

    public static boolean b(Context context, String str) {
        try {
            String[] strArr = a(context).requestedPermissions;
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
