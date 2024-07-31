package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C0834t0;
import androidx.core.content.res.C0871f;
import androidx.core.os.C0942a;
import androidx.core.os.C0946e;
import androidx.core.util.C0979c;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0854a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m4357a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m4358b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static File[] m4359a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m4360b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m4361c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    static class c {
        /* renamed from: a */
        static File m4362a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m4363b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        /* renamed from: c */
        static File m4364c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    static class d {
        /* renamed from: a */
        static int m4365a(Context context, int i10) {
            return context.getColor(i10);
        }

        /* renamed from: b */
        static <T> T m4366b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m4367c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static Context m4368a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m4369b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m4370c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        static Intent m4371a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C0854a.obtainAndCheckReceiverPermission(context), handler);
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
            return registerReceiver;
        }

        /* renamed from: b */
        static ComponentName m4372b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    /* renamed from: androidx.core.content.a$g */
    /* loaded from: classes.dex */
    static class g {
        /* renamed from: a */
        static Executor m4373a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    /* renamed from: androidx.core.content.a$h */
    /* loaded from: classes.dex */
    static class h {
        /* renamed from: a */
        static String m4374a(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        static Intent m4375a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
            return registerReceiver;
        }
    }

    protected C0854a() {
    }

    public static int checkSelfPermission(Context context, String str) {
        C0979c.m4815d(str, "permission must be non-null");
        return (C0942a.m4700d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C0834t0.m4279f(context).m4283a() ? 0 : -1;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return e.m4368a(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.m4374a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return c.m4362a(context);
    }

    public static int getColor(Context context, int i10) {
        return d.m4365a(context, i10);
    }

    public static ColorStateList getColorStateList(Context context, int i10) {
        return C0871f.m4452c(context.getResources(), i10, context.getTheme());
    }

    public static File getDataDir(Context context) {
        return e.m4369b(context);
    }

    public static Drawable getDrawable(Context context, int i10) {
        return c.m4363b(context, i10);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return b.m4359a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return b.m4360b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.m4373a(context) : C0946e.m4710a(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return c.m4364c(context);
    }

    public static File[] getObbDirs(Context context) {
        return b.m4361c(context);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) d.m4366b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return d.m4367c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return e.m4370c(context);
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (C0859f.m4384b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 == 0 || (i12 & 4) == 0) {
            return C0942a.m4700d() ? i.m4375a(context, broadcastReceiver, intentFilter, str, handler, i12) : Build.VERSION.SDK_INT >= 26 ? f.m4371a(context, broadcastReceiver, intentFilter, str, handler, i12) : ((i12 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        a.m4357a(context, intentArr, bundle);
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        a.m4358b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.m4372b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
