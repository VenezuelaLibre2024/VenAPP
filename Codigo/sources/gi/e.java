package gi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import com.zt.shareextend.ShareExtendProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Context context, File file) {
        return ShareExtendProvider.d(context.getPackageName() + ".shareextend.fileprovider", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, List<Uri> list, Intent intent) {
        try {
            for (Uri uri : list) {
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    context.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
                }
            }
        } catch (Exception unused) {
        }
    }

    private static boolean c(String str) {
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    private static boolean d(String str) {
        return c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (d(it.next())) {
                return true;
            }
        }
        return false;
    }
}
