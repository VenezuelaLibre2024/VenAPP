package ke;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.C0854a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p254nd.C9705a;
import p254nd.InterfaceC9707c;
import p485zb.C12862b;

/* renamed from: ke.a */
/* loaded from: classes.dex */
public class C9256a {

    /* renamed from: a */
    private final Context f22475a;

    /* renamed from: b */
    private final SharedPreferences f22476b;

    /* renamed from: c */
    private final InterfaceC9707c f22477c;

    /* renamed from: d */
    private boolean f22478d;

    public C9256a(Context context, String str, InterfaceC9707c interfaceC9707c) {
        Context m27573a = m27573a(context);
        this.f22475a = m27573a;
        this.f22476b = m27573a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f22477c = interfaceC9707c;
        this.f22478d = m27574c();
    }

    /* renamed from: a */
    private static Context m27573a(Context context) {
        return C0854a.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: c */
    private boolean m27574c() {
        return this.f22476b.contains("firebase_data_collection_default_enabled") ? this.f22476b.getBoolean("firebase_data_collection_default_enabled", true) : m27575d();
    }

    /* renamed from: d */
    private boolean m27575d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f22475a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f22475a.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: f */
    private synchronized void m27576f(boolean z10) {
        if (this.f22478d != z10) {
            this.f22478d = z10;
            this.f22477c.mo29097a(new C9705a<>(C12862b.class, new C12862b(z10)));
        }
    }

    /* renamed from: b */
    public synchronized boolean m27577b() {
        return this.f22478d;
    }

    /* renamed from: e */
    public synchronized void m27578e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f22476b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = m27575d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f22476b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        m27576f(equals);
    }
}
