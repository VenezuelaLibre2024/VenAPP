package vc;

import android.content.Context;

/* loaded from: classes.dex */
class d0 {

    /* renamed from: a, reason: collision with root package name */
    private String f28796a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.f28796a == null) {
            this.f28796a = b(context);
        }
        return "".equals(this.f28796a) ? null : this.f28796a;
    }
}
