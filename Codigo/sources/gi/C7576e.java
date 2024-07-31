package gi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import com.p049zt.shareextend.ShareExtendProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: gi.e */
/* loaded from: classes3.dex */
class C7576e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Uri m23015a(Context context, File file) {
        return ShareExtendProvider.m19679d(context.getPackageName() + ".shareextend.fileprovider", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m23016b(Context context, List<Uri> list, Intent intent) {
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

    /* renamed from: c */
    private static boolean m23017c(String str) {
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    /* renamed from: d */
    private static boolean m23018d(String str) {
        return m23017c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m23019e(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (m23018d(it.next())) {
                return true;
            }
        }
        return false;
    }
}
