package la;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class s {
    @Deprecated
    public static void a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
