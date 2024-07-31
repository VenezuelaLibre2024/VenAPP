package p303q4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.appevents.C4578h0;
import com.facebook.appevents.C4589o;
import com.facebook.internal.C4612c0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p076e5.C7123a;
import p152i4.EnumC7823q0;

/* renamed from: q4.n */
/* loaded from: classes.dex */
public final class C10274n {

    /* renamed from: a */
    public static final C10274n f25516a = new C10274n();

    /* renamed from: b */
    private static final String f25517b = C10274n.class.getCanonicalName();

    /* renamed from: c */
    private static final long[] f25518c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private C10274n() {
    }

    /* renamed from: a */
    private final String m30785a(Context context) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String m27787k = C9322n.m27787k("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(m27787k, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String m30768c = C10272l.m30768c(context, null);
            if (m30768c == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                C9322n.m27780d(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                m30768c = C10272l.m30767b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(m27787k, m30768c).apply();
            return m30768c;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: b */
    public static final int m30786b(long j10) {
        if (C0033a.m107d(C10274n.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f25518c;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                C0033a.m105b(th2, C10274n.class);
                return 0;
            }
        }
        return i10;
    }

    /* renamed from: c */
    public static final void m30787c(String activityName, C10275o c10275o, String str, Context context) {
        String c10275o2;
        if (C0033a.m107d(C10274n.class)) {
            return;
        }
        try {
            C9322n.m27781e(activityName, "activityName");
            C9322n.m27781e(context, "context");
            String str2 = "Unclassified";
            if (c10275o != null && (c10275o2 = c10275o.toString()) != null) {
                str2 = c10275o2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str2);
            bundle.putString("fb_mobile_pckg_fp", f25516a.m30785a(context));
            bundle.putString("fb_mobile_app_cert_hash", C7123a.m21021a(context));
            C4578h0.a aVar = C4578h0.f8597b;
            C4578h0 m11003a = aVar.m11003a(activityName, str, null);
            m11003a.m10996d("fb_mobile_activate_app", bundle);
            if (aVar.m11005c() != C4589o.b.EXPLICIT_ONLY) {
                m11003a.m10993a();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10274n.class);
        }
    }

    /* renamed from: d */
    private final void m30788d() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4612c0.a aVar = C4612c0.f8694e;
            EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
            String str = f25517b;
            C9322n.m27778b(str);
            aVar.m11138b(enumC7823q0, str, "Clock skew detected");
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: e */
    public static final void m30789e(String activityName, C10273m c10273m, String str) {
        long longValue;
        String c10275o;
        if (C0033a.m107d(C10274n.class)) {
            return;
        }
        try {
            C9322n.m27781e(activityName, "activityName");
            if (c10273m == null) {
                return;
            }
            Long m30771b = c10273m.m30771b();
            long j10 = 0;
            if (m30771b == null) {
                Long m30774e = c10273m.m30774e();
                longValue = 0 - (m30774e == null ? 0L : m30774e.longValue());
            } else {
                longValue = m30771b.longValue();
            }
            if (longValue < 0) {
                f25516a.m30788d();
                longValue = 0;
            }
            long m30775f = c10273m.m30775f();
            if (m30775f < 0) {
                f25516a.m30788d();
                m30775f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", c10273m.m30772c());
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m30786b(longValue))}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            C10275o m30776g = c10273m.m30776g();
            String str2 = "Unclassified";
            if (m30776g != null && (c10275o = m30776g.toString()) != null) {
                str2 = c10275o;
            }
            bundle.putString("fb_mobile_launch_source", str2);
            Long m30774e2 = c10273m.m30774e();
            if (m30774e2 != null) {
                j10 = m30774e2.longValue();
            }
            bundle.putLong("_logTime", j10 / AdError.NETWORK_ERROR_CODE);
            C4578h0.f8597b.m11003a(activityName, str, null).m10995c("fb_mobile_deactivate_app", m30775f / 1000, bundle);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10274n.class);
        }
    }
}
