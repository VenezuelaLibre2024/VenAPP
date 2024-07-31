package p035c3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: c3.a */
/* loaded from: classes.dex */
final class C1839a {

    @FunctionalInterface
    /* renamed from: c3.a$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo9872a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9871a(Context context, a aVar, InterfaceC1840b interfaceC1840b) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            interfaceC1840b.onError("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.mo9872a(true);
        } catch (Exception unused) {
            aVar.mo9872a(false);
        }
    }
}
