package p065df;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p084ef.InterfaceC7185b;
import p107ff.C7345f;
import p181jd.InterfaceC9037a;
import p219ld.C9501d;
import p485zb.C12867g;

/* renamed from: df.a0 */
/* loaded from: classes2.dex */
public final class C6904a0 {

    /* renamed from: a */
    public static final C6904a0 f15317a = new C6904a0();

    /* renamed from: b */
    private static final InterfaceC9037a f15318b;

    static {
        InterfaceC9037a m28243h = new C9501d().m28244i(C6907c.f15327a).m28245j(true).m28243h();
        C9322n.m27780d(m28243h, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f15318b = m28243h;
    }

    private C6904a0() {
    }

    /* renamed from: d */
    private final EnumC6909d m19969d(InterfaceC7185b interfaceC7185b) {
        return interfaceC7185b == null ? EnumC6909d.COLLECTION_SDK_NOT_INSTALLED : interfaceC7185b.mo21389a() ? EnumC6909d.COLLECTION_ENABLED : EnumC6909d.COLLECTION_DISABLED;
    }

    /* renamed from: a */
    public final C6939z m19970a(C12867g firebaseApp, C6938y sessionDetails, C7345f sessionsSettings, C6933t currentProcessDetails, List<C6933t> appProcessDetails, Map<InterfaceC7185b.a, ? extends InterfaceC7185b> subscribers, String firebaseInstallationId) {
        C9322n.m27781e(firebaseApp, "firebaseApp");
        C9322n.m27781e(sessionDetails, "sessionDetails");
        C9322n.m27781e(sessionsSettings, "sessionsSettings");
        C9322n.m27781e(currentProcessDetails, "currentProcessDetails");
        C9322n.m27781e(appProcessDetails, "appProcessDetails");
        C9322n.m27781e(subscribers, "subscribers");
        C9322n.m27781e(firebaseInstallationId, "firebaseInstallationId");
        return new C6939z(EnumC6919i.SESSION_START, new C6912e0(sessionDetails.m20072b(), sessionDetails.m20071a(), sessionDetails.m20073c(), sessionDetails.m20074d(), new C6911e(m19969d(subscribers.get(InterfaceC7185b.a.PERFORMANCE)), m19969d(subscribers.get(InterfaceC7185b.a.CRASHLYTICS)), sessionsSettings.m22055b()), firebaseInstallationId), m19971b(firebaseApp));
    }

    /* renamed from: b */
    public final C6905b m19971b(C12867g firebaseApp) {
        String valueOf;
        long longVersionCode;
        C9322n.m27781e(firebaseApp, "firebaseApp");
        Context m42630m = firebaseApp.m42630m();
        C9322n.m27780d(m42630m, "firebaseApp.applicationContext");
        String packageName = m42630m.getPackageName();
        PackageInfo packageInfo = m42630m.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        String m42644c = firebaseApp.m42632r().m42644c();
        C9322n.m27780d(m42644c, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        C9322n.m27780d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        C9322n.m27780d(RELEASE, "RELEASE");
        EnumC6932s enumC6932s = EnumC6932s.LOG_ENVIRONMENT_PROD;
        C9322n.m27780d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? str : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        C9322n.m27780d(MANUFACTURER, "MANUFACTURER");
        C6934u c6934u = C6934u.f15438a;
        Context m42630m2 = firebaseApp.m42630m();
        C9322n.m27780d(m42630m2, "firebaseApp.applicationContext");
        C6933t m20051d = c6934u.m20051d(m42630m2);
        Context m42630m3 = firebaseApp.m42630m();
        C9322n.m27780d(m42630m3, "firebaseApp.applicationContext");
        return new C6905b(m42644c, MODEL, "1.2.0", RELEASE, enumC6932s, new C6903a(packageName, str3, str, MANUFACTURER, m20051d, c6934u.m20050c(m42630m3)));
    }

    /* renamed from: c */
    public final InterfaceC9037a m19972c() {
        return f15318b;
    }
}
