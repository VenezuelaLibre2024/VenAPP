package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzfpl implements Runnable {
    final /* synthetic */ zzfpm zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpl(zzfpm zzfpmVar) {
        WebView webView;
        this.zza = zzfpmVar;
        webView = zzfpmVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
