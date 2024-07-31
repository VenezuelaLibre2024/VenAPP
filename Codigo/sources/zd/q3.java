package zd;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public class q3 {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f32722a;

    public q3(zb.g gVar) {
        this.f32722a = gVar;
    }

    public void a(String str) {
        SharedPreferences.Editor edit = ((Application) this.f32722a.m()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public boolean b(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f32722a.m()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z10);
        }
        g(str, z10);
        return z10;
    }

    public boolean c(String str, boolean z10) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f32722a.m();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), RecognitionOptions.ITF)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z10;
    }

    public boolean d(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f32722a.m()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getBoolean(str, z10) : z10;
    }

    public boolean e(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f32722a.m();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null) {
                return false;
            }
            return bundle.containsKey(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean f(String str) {
        return ((Application) this.f32722a.m()).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains(str);
    }

    public void g(String str, boolean z10) {
        SharedPreferences.Editor edit = ((Application) this.f32722a.m()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }
}
