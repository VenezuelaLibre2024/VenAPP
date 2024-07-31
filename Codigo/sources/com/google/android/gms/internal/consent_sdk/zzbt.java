package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbt extends WebViewClient {
    final /* synthetic */ zzbu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbt(zzbu zzbuVar, zzbs zzbsVar) {
        this.zza = zzbuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzca zzcaVar;
        if (zzbu.zzf(this.zza, str)) {
            zzcaVar = this.zza.zzb;
            zzcaVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z10;
        z10 = this.zza.zzc;
        if (z10) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.zza.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        zzca zzcaVar;
        zzcaVar = this.zza.zzb;
        zzcaVar.zzf(i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzca zzcaVar;
        String uri = webResourceRequest.getUrl().toString();
        if (!zzbu.zzf(this.zza, uri)) {
            return false;
        }
        zzcaVar = this.zza.zzb;
        zzcaVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzca zzcaVar;
        if (!zzbu.zzf(this.zza, str)) {
            return false;
        }
        zzcaVar = this.zza.zzb;
        zzcaVar.zze(str);
        return true;
    }
}