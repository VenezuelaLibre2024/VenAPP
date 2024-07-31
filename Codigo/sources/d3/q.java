package d3;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class q {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("flutter_uploader_plugin", 0);
    }

    public static Long b(Context context) {
        return Long.valueOf(a(context).getLong("com.bluechilli.flutteruploader.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
    }

    public static void c(Context context, Long l10) {
        a(context).edit().putLong("com.bluechilli.flutteruploader.CALLBACK_DISPATCHER_HANDLE_KEY", l10.longValue()).apply();
    }
}
