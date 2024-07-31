package ke;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;
import nd.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20653a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f20654b;

    /* renamed from: c, reason: collision with root package name */
    private final c f20655c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20656d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f20653a = a10;
        this.f20654b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f20655c = cVar;
        this.f20656d = c();
    }

    private static Context a(Context context) {
        return androidx.core.content.a.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        return this.f20654b.contains("firebase_data_collection_default_enabled") ? this.f20654b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f20653a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f20653a.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f20656d != z10) {
            this.f20656d = z10;
            this.f20655c.a(new nd.a<>(zb.b.class, new zb.b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f20656d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f20654b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f20654b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}
