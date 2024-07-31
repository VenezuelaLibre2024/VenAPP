package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.m */
/* loaded from: classes.dex */
public final class C0812m {

    /* renamed from: androidx.core.app.m$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Intent m4066a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        static boolean m4067b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        static boolean m4068c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m4060a(Activity activity) {
        Intent m4066a = a.m4066a(activity);
        if (m4066a != null) {
            return m4066a;
        }
        String m4062c = m4062c(activity);
        if (m4062c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m4062c);
        try {
            return m4063d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m4062c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m4061b(Context context, ComponentName componentName) {
        String m4063d = m4063d(context, componentName);
        if (m4063d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m4063d);
        return m4063d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m4062c(Activity activity) {
        try {
            return m4063d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: d */
    public static String m4063d(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m4064e(Activity activity, Intent intent) {
        a.m4067b(activity, intent);
    }

    /* renamed from: f */
    public static boolean m4065f(Activity activity, Intent intent) {
        return a.m4068c(activity, intent);
    }
}
