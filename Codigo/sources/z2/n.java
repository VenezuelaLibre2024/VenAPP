package z2;

import android.content.Context;

/* loaded from: classes.dex */
public class n {
    public o a(Context context, y2.a aVar) {
        if (androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return o.precise;
        }
        if (androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return o.reduced;
        }
        aVar.a(y2.b.permissionDenied);
        return null;
    }
}
