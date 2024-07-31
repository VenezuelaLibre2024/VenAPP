package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class zzbon extends zzboa {
    public static final /* synthetic */ int zza = 0;
    private WebViewClient zzb;
    private final b9.a zzc;
    private final WebView zzd;

    public zzbon(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfxe.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new b9.a(context, new b9.b() { // from class: com.google.android.gms.internal.ads.zzbom
            @Override // b9.b
            public final void onH5AdsEvent(String str) {
                int i10 = zzbon.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        zzcec.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboa, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.b(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboa, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.b(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzboa, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzc(webView)) {
            return false;
        }
        if (this.zzc.b(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final void zza() {
        this.zzc.a();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzfxe.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }
}
