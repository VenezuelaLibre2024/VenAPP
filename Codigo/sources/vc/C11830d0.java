package vc;

import android.content.Context;

/* renamed from: vc.d0 */
/* loaded from: classes.dex */
class C11830d0 {

    /* renamed from: a */
    private String f31230a;

    /* renamed from: b */
    private static String m37694b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m37695a(Context context) {
        if (this.f31230a == null) {
            this.f31230a = m37694b(context);
        }
        return "".equals(this.f31230a) ? null : this.f31230a;
    }
}
