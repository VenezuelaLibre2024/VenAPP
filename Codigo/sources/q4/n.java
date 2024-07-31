package q4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.appevents.h0;
import com.facebook.appevents.o;
import com.facebook.internal.c0;
import i4.q0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.a0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f23548a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final String f23549b = n.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static final long[] f23550c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private n() {
    }

    private final String a(Context context) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String k10 = kotlin.jvm.internal.n.k("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(k10, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String c10 = l.c(context, null);
            if (c10 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                kotlin.jvm.internal.n.d(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                c10 = l.b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(k10, c10).apply();
            return c10;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final int b(long j10) {
        if (a5.a.d(n.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f23550c;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                a5.a.b(th2, n.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void c(String activityName, o oVar, String str, Context context) {
        String oVar2;
        if (a5.a.d(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(activityName, "activityName");
            kotlin.jvm.internal.n.e(context, "context");
            String str2 = "Unclassified";
            if (oVar != null && (oVar2 = oVar.toString()) != null) {
                str2 = oVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str2);
            bundle.putString("fb_mobile_pckg_fp", f23548a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", e5.a.a(context));
            h0.a aVar = h0.f7622b;
            h0 a10 = aVar.a(activityName, str, null);
            a10.d("fb_mobile_activate_app", bundle);
            if (aVar.c() != o.b.EXPLICIT_ONLY) {
                a10.a();
            }
        } catch (Throwable th2) {
            a5.a.b(th2, n.class);
        }
    }

    private final void d() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            c0.a aVar = c0.f7719e;
            q0 q0Var = q0.APP_EVENTS;
            String str = f23549b;
            kotlin.jvm.internal.n.b(str);
            aVar.b(q0Var, str, "Clock skew detected");
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void e(String activityName, m mVar, String str) {
        long longValue;
        String oVar;
        if (a5.a.d(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(activityName, "activityName");
            if (mVar == null) {
                return;
            }
            Long b10 = mVar.b();
            long j10 = 0;
            if (b10 == null) {
                Long e10 = mVar.e();
                longValue = 0 - (e10 == null ? 0L : e10.longValue());
            } else {
                longValue = b10.longValue();
            }
            if (longValue < 0) {
                f23548a.d();
                longValue = 0;
            }
            long f10 = mVar.f();
            if (f10 < 0) {
                f23548a.d();
                f10 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", mVar.c());
            a0 a0Var = a0.f20743a;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(longValue))}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            o g10 = mVar.g();
            String str2 = "Unclassified";
            if (g10 != null && (oVar = g10.toString()) != null) {
                str2 = oVar;
            }
            bundle.putString("fb_mobile_launch_source", str2);
            Long e11 = mVar.e();
            if (e11 != null) {
                j10 = e11.longValue();
            }
            bundle.putLong("_logTime", j10 / AdError.NETWORK_ERROR_CODE);
            h0.f7622b.a(activityName, str, null).c("fb_mobile_deactivate_app", f10 / 1000, bundle);
        } catch (Throwable th2) {
            a5.a.b(th2, n.class);
        }
    }
}
