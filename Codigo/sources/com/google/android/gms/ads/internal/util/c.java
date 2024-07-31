package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzehs;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class c {
    public /* synthetic */ c(b bVar) {
    }

    public CookieManager a(Context context) {
        throw null;
    }

    public WebResourceResponse b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public zzcjs c(zzcjk zzcjkVar, zzbbp zzbbpVar, boolean z10, zzehs zzehsVar) {
        throw null;
    }

    public boolean d(Activity activity, Configuration configuration) {
        throw null;
    }

    public Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void f(Context context, String str, String str2) {
    }

    public boolean g(Context context, String str) {
        return false;
    }

    public int h(Context context, TelephonyManager telephonyManager) {
        return AdError.NO_FILL_ERROR_CODE;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public void j(Activity activity) {
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE)).getNetworkType();
    }
}
