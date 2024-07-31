package p054d3;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: d3.q */
/* loaded from: classes.dex */
public class C6836q {
    /* renamed from: a */
    public static SharedPreferences m19750a(Context context) {
        return context.getSharedPreferences("flutter_uploader_plugin", 0);
    }

    /* renamed from: b */
    public static Long m19751b(Context context) {
        return Long.valueOf(m19750a(context).getLong("com.bluechilli.flutteruploader.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
    }

    /* renamed from: c */
    public static void m19752c(Context context, Long l10) {
        m19750a(context).edit().putLong("com.bluechilli.flutteruploader.CALLBACK_DISPATCHER_HANDLE_KEY", l10.longValue()).apply();
    }
}
