package p487zd;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p485zb.C12867g;

/* renamed from: zd.q3 */
/* loaded from: classes.dex */
public class C12966q3 {

    /* renamed from: a */
    private final C12867g f35273a;

    public C12966q3(C12867g c12867g) {
        this.f35273a = c12867g;
    }

    /* renamed from: a */
    public void m42907a(String str) {
        SharedPreferences.Editor edit = ((Application) this.f35273a.m42630m()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    /* renamed from: b */
    public boolean m42908b(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f35273a.m42630m()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z10);
        }
        m42913g(str, z10);
        return z10;
    }

    /* renamed from: c */
    public boolean m42909c(String str, boolean z10) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f35273a.m42630m();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), RecognitionOptions.ITF)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z10;
    }

    /* renamed from: d */
    public boolean m42910d(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f35273a.m42630m()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getBoolean(str, z10) : z10;
    }

    /* renamed from: e */
    public boolean m42911e(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f35273a.m42630m();
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

    /* renamed from: f */
    public boolean m42912f(String str) {
        return ((Application) this.f35273a.m42630m()).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains(str);
    }

    /* renamed from: g */
    public void m42913g(String str, boolean z10) {
        SharedPreferences.Editor edit = ((Application) this.f35273a.m42630m()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }
}
