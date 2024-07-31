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

/* renamed from: com.google.android.gms.ads.internal.util.c */
/* loaded from: classes.dex */
public class C4974c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4974c(C4970b c4970b) {
    }

    /* renamed from: a */
    public CookieManager mo12605a(Context context) {
        throw null;
    }

    /* renamed from: b */
    public WebResourceResponse mo12606b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    /* renamed from: c */
    public zzcjs mo12607c(zzcjk zzcjkVar, zzbbp zzbbpVar, boolean z10, zzehs zzehsVar) {
        throw null;
    }

    /* renamed from: d */
    public boolean mo12608d(Activity activity, Configuration configuration) {
        throw null;
    }

    /* renamed from: e */
    public Intent mo12609e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    /* renamed from: f */
    public void mo12610f(Context context, String str, String str2) {
    }

    /* renamed from: g */
    public boolean mo12611g(Context context, String str) {
        return false;
    }

    /* renamed from: h */
    public int mo12612h(Context context, TelephonyManager telephonyManager) {
        return AdError.NO_FILL_ERROR_CODE;
    }

    /* renamed from: i */
    public int mo12613i(AudioManager audioManager) {
        return 0;
    }

    /* renamed from: j */
    public void mo12614j(Activity activity) {
    }

    /* renamed from: k */
    public int mo12615k(Context context) {
        return ((TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE)).getNetworkType();
    }
}
