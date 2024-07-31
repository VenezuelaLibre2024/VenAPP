package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.C0854a;
import androidx.core.os.C0942a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public class C0777b extends C0854a {

    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3923a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m3924b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        /* renamed from: c */
        static void m3925c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m3926a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        static void m3927b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        static void m3928c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        static void m3929d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        static void m3930e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes.dex */
    static class c {
        /* renamed from: a */
        static void m3931a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m3932b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        /* renamed from: c */
        static boolean m3933c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes.dex */
    static class d {
        /* renamed from: a */
        static boolean m3934a(Activity activity) {
            boolean isLaunchedFromBubble;
            isLaunchedFromBubble = activity.isLaunchedFromBubble();
            return isLaunchedFromBubble;
        }

        /* renamed from: b */
        static boolean m3935b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static boolean m3936a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$f */
    /* loaded from: classes.dex */
    public interface f {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* renamed from: b */
    public static void m3911b(Activity activity) {
        a.m3923a(activity);
    }

    /* renamed from: c */
    public static void m3912c(Activity activity) {
        b.m3926a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m3913d(Activity activity) {
        if (activity.isFinishing() || C0788e.m3963i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: e */
    public static void m3914e(Activity activity) {
        b.m3927b(activity);
    }

    /* renamed from: f */
    public static void m3915f(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C0777b.m3913d(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m3916g(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (!C0942a.m4700d() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof f) {
            ((f) activity).validateRequestPermissionsRequestCode(i10);
        }
        c.m3932b(activity, strArr, i10);
    }

    /* renamed from: h */
    public static void m3917h(Activity activity, AbstractC0780b2 abstractC0780b2) {
        b.m3928c(activity, null);
    }

    /* renamed from: i */
    public static void m3918i(Activity activity, AbstractC0780b2 abstractC0780b2) {
        b.m3929d(activity, null);
    }

    /* renamed from: j */
    public static boolean m3919j(Activity activity, String str) {
        if (!C0942a.m4700d() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 32 ? e.m3936a(activity, str) : i10 == 31 ? d.m3935b(activity, str) : c.m3933c(activity, str);
    }

    /* renamed from: k */
    public static void m3920k(Activity activity, Intent intent, int i10, Bundle bundle) {
        a.m3924b(activity, intent, i10, bundle);
    }

    /* renamed from: l */
    public static void m3921l(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        a.m3925c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* renamed from: m */
    public static void m3922m(Activity activity) {
        b.m3930e(activity);
    }
}
