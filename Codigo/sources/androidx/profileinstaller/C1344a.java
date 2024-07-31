package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
class C1344a {

    /* renamed from: androidx.profileinstaller.a$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        static File m7483a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* renamed from: a */
    static boolean m7481a(File file) {
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
            z10 = m7481a(file2) && z10;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m7482b(Context context, ProfileInstallReceiver.C1340a c1340a) {
        c1340a.mo7465a(m7481a(a.m7483a(context)) ? 14 : 15, null);
    }
}
