package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.a$a */
    /* loaded from: classes.dex */
    public static class C0077a {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }

    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        aVar.a(a(C0077a.a(context)) ? 14 : 15, null);
    }
}
