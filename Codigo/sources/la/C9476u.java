package la;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import ca.C1914l;
import na.C9696e;

/* renamed from: la.u */
/* loaded from: classes.dex */
public final class C9476u {
    /* renamed from: a */
    public static boolean m28181a(Context context, int i10) {
        if (!m28182b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1914l.m10108a(context).m10112b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m28182b(Context context, int i10, String str) {
        return C9696e.m29080a(context).m29079h(i10, str);
    }
}
