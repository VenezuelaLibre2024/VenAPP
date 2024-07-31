package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0818o;
import androidx.core.content.C0854a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes.dex */
public final class C6214c {

    /* renamed from: a */
    private static final AtomicInteger f13275a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final C0818o.e f13276a;

        /* renamed from: b */
        public final String f13277b;

        /* renamed from: c */
        public final int f13278c;

        a(C0818o.e eVar, String str, int i10) {
            this.f13276a = eVar;
            this.f13277b = str;
            this.f13278c = i10;
        }
    }

    /* renamed from: a */
    private static PendingIntent m16949a(Context context, C6239k0 c6239k0, String str, PackageManager packageManager) {
        Intent m16954f = m16954f(str, c6239k0, packageManager);
        if (m16954f == null) {
            return null;
        }
        m16954f.addFlags(67108864);
        m16954f.putExtras(c6239k0.m17105y());
        if (m16965q(c6239k0)) {
            m16954f.putExtra("gcm.n.analytics_data", c6239k0.m17104x());
        }
        return PendingIntent.getActivity(context, m16955g(), m16954f, m16960l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m16950b(Context context, Context context2, C6239k0 c6239k0) {
        if (m16965q(c6239k0)) {
            return m16951c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c6239k0.m17104x()));
        }
        return null;
    }

    /* renamed from: c */
    private static PendingIntent m16951c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m16955g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), m16960l(1073741824));
    }

    /* renamed from: d */
    public static a m16952d(Context context, Context context2, C6239k0 c6239k0, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C0818o.e eVar = new C0818o.e(context2, str);
        String m17099n = c6239k0.m17099n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(m17099n)) {
            eVar.m4146n(m17099n);
        }
        String m17099n2 = c6239k0.m17099n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(m17099n2)) {
            eVar.m4145m(m17099n2);
            eVar.m4127H(new C0818o.c().m4109n(m17099n2));
        }
        eVar.m4125F(m16961m(packageManager, resources, packageName, c6239k0.m17101p("gcm.n.icon"), bundle));
        Uri m16962n = m16962n(packageName, c6239k0, resources);
        if (m16962n != null) {
            eVar.m4126G(m16962n);
        }
        eVar.m4144l(m16949a(context, c6239k0, packageName, packageManager));
        PendingIntent m16950b = m16950b(context, context2, c6239k0);
        if (m16950b != null) {
            eVar.m4148p(m16950b);
        }
        Integer m16956h = m16956h(context2, c6239k0.m17101p("gcm.n.color"), bundle);
        if (m16956h != null) {
            eVar.m4142j(m16956h.intValue());
        }
        eVar.m4139g(!c6239k0.m17087a("gcm.n.sticky"));
        eVar.m4155x(c6239k0.m17087a("gcm.n.local_only"));
        String m17101p = c6239k0.m17101p("gcm.n.ticker");
        if (m17101p != null) {
            eVar.m4129J(m17101p);
        }
        Integer m17098m = c6239k0.m17098m();
        if (m17098m != null) {
            eVar.m4121B(m17098m.intValue());
        }
        Integer m17103r = c6239k0.m17103r();
        if (m17103r != null) {
            eVar.m4133N(m17103r.intValue());
        }
        Integer m17097l = c6239k0.m17097l();
        if (m17097l != null) {
            eVar.m4156y(m17097l.intValue());
        }
        Long m17095j = c6239k0.m17095j("gcm.n.event_time");
        if (m17095j != null) {
            eVar.m4124E(true);
            eVar.m4134O(m17095j.longValue());
        }
        long[] m17102q = c6239k0.m17102q();
        if (m17102q != null) {
            eVar.m4132M(m17102q);
        }
        int[] m17090e = c6239k0.m17090e();
        if (m17090e != null) {
            eVar.m4154w(m17090e[0], m17090e[1], m17090e[2]);
        }
        eVar.m4147o(m16957i(c6239k0));
        return new a(eVar, m16963o(c6239k0), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static a m16953e(Context context, C6239k0 c6239k0) {
        Bundle m16958j = m16958j(context.getPackageManager(), context.getPackageName());
        return m16952d(context, context, c6239k0, m16959k(context, c6239k0.m17096k(), m16958j), m16958j);
    }

    /* renamed from: f */
    private static Intent m16954f(String str, C6239k0 c6239k0, PackageManager packageManager) {
        String m17101p = c6239k0.m17101p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m17101p)) {
            Intent intent = new Intent(m17101p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m17091f = c6239k0.m17091f();
        if (m17091f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m17091f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m16955g() {
        return f13275a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m16956h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C0854a.getColor(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: i */
    private static int m16957i(C6239k0 c6239k0) {
        boolean m17087a = c6239k0.m17087a("gcm.n.default_sound");
        ?? r02 = m17087a;
        if (c6239k0.m17087a("gcm.n.default_vibrate_timings")) {
            r02 = (m17087a ? 1 : 0) | 2;
        }
        return c6239k0.m17087a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    /* renamed from: j */
    private static Bundle m16958j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, RecognitionOptions.ITF);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    /* renamed from: k */
    public static String m16959k(Context context, String str, Bundle bundle) {
        String str2;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m16960l(int i10) {
        return i10 | 67108864;
    }

    /* renamed from: m */
    private static int m16961m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m16964p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m16964p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !m16964p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !m16964p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    /* renamed from: n */
    private static Uri m16962n(String str, C6239k0 c6239k0, Resources resources) {
        String m17100o = c6239k0.m17100o();
        if (TextUtils.isEmpty(m17100o)) {
            return null;
        }
        if ("default".equals(m17100o) || resources.getIdentifier(m17100o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + m17100o);
    }

    /* renamed from: o */
    private static String m16963o(C6239k0 c6239k0) {
        String m17101p = c6239k0.m17101p("gcm.n.tag");
        if (!TextUtils.isEmpty(m17101p)) {
            return m17101p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: p */
    private static boolean m16964p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m16965q(C6239k0 c6239k0) {
        return c6239k0.m17087a("google.c.a.e");
    }
}
