package df;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import ef.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f13963a = new a0();

    /* renamed from: b, reason: collision with root package name */
    private static final jd.a f13964b;

    static {
        jd.a h10 = new ld.d().i(c.f13973a).j(true).h();
        kotlin.jvm.internal.n.d(h10, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f13964b = h10;
    }

    private a0() {
    }

    private final d d(ef.b bVar) {
        return bVar == null ? d.COLLECTION_SDK_NOT_INSTALLED : bVar.a() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }

    public final z a(zb.g firebaseApp, y sessionDetails, ff.f sessionsSettings, t currentProcessDetails, List<t> appProcessDetails, Map<b.a, ? extends ef.b> subscribers, String firebaseInstallationId) {
        kotlin.jvm.internal.n.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.n.e(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.n.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.n.e(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.n.e(appProcessDetails, "appProcessDetails");
        kotlin.jvm.internal.n.e(subscribers, "subscribers");
        kotlin.jvm.internal.n.e(firebaseInstallationId, "firebaseInstallationId");
        return new z(i.SESSION_START, new e0(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new e(d(subscribers.get(b.a.PERFORMANCE)), d(subscribers.get(b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId), b(firebaseApp));
    }

    public final b b(zb.g firebaseApp) {
        String valueOf;
        long longVersionCode;
        kotlin.jvm.internal.n.e(firebaseApp, "firebaseApp");
        Context m10 = firebaseApp.m();
        kotlin.jvm.internal.n.d(m10, "firebaseApp.applicationContext");
        String packageName = m10.getPackageName();
        PackageInfo packageInfo = m10.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        String c10 = firebaseApp.r().c();
        kotlin.jvm.internal.n.d(c10, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.n.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.n.d(RELEASE, "RELEASE");
        s sVar = s.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.n.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? str : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.n.d(MANUFACTURER, "MANUFACTURER");
        u uVar = u.f14084a;
        Context m11 = firebaseApp.m();
        kotlin.jvm.internal.n.d(m11, "firebaseApp.applicationContext");
        t d10 = uVar.d(m11);
        Context m12 = firebaseApp.m();
        kotlin.jvm.internal.n.d(m12, "firebaseApp.applicationContext");
        return new b(c10, MODEL, "1.2.0", RELEASE, sVar, new a(packageName, str3, str, MANUFACTURER, d10, uVar.c(m12)));
    }

    public final jd.a c() {
        return f13964b;
    }
}
