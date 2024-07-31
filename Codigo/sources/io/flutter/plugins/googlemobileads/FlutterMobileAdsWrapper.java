package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import e9.c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.webviewflutter.WebViewFlutterAndroidExternalApi;
import x8.s;
import x8.y;

/* loaded from: classes3.dex */
public class FlutterMobileAdsWrapper {
    private static final String TAG = "FlutterMobileAdsWrapper";

    public void disableMediationInitialization(Context context) {
        MobileAds.a(context);
    }

    public y getRequestConfiguration() {
        return MobileAds.b();
    }

    public String getVersionString() {
        return MobileAds.c().toString();
    }

    public void initialize(Context context, c cVar) {
        MobileAds.e(context, cVar);
    }

    public void openAdInspector(Context context, s sVar) {
        MobileAds.f(context, sVar);
    }

    public void openDebugMenu(Context context, String str) {
        MobileAds.g(context, str);
    }

    public void registerWebView(int i10, FlutterEngine flutterEngine) {
        WebView webView = WebViewFlutterAndroidExternalApi.getWebView(flutterEngine, i10);
        if (webView != null) {
            MobileAds.h(webView);
            return;
        }
        Log.w(TAG, "MobileAds.registerWebView unable to find webView with id: " + i10);
    }

    public void setAppMuted(boolean z10) {
        MobileAds.i(z10);
    }

    public void setAppVolume(double d10) {
        MobileAds.j((float) d10);
    }
}
