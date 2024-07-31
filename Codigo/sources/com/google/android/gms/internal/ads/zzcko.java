package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzcko extends zzcjs {
    public zzcko(zzcjk zzcjkVar, zzbbp zzbbpVar, boolean z10, zzehs zzehsVar) {
        super(zzcjkVar, zzbbpVar, z10, new zzbvv(zzcjkVar, zzcjkVar.zzE(), new zzbfm(zzcjkVar.getContext())), null, zzehsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzO(WebView webView, String str, Map map) {
        if (!(webView instanceof zzcjk)) {
            zzcec.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcjk zzcjkVar = (zzcjk) webView;
        zzcbs zzcbsVar = this.zza;
        if (zzcbsVar != null) {
            zzcbsVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcjkVar.zzN() != null) {
            zzcjkVar.zzN().zzF();
        }
        String str2 = (String) a0.c().zza(zzcjkVar.zzO().zzi() ? zzbgc.zzO : zzcjkVar.zzaC() ? zzbgc.zzN : zzbgc.zzM);
        t.r();
        return j2.Y(zzcjkVar.getContext(), zzcjkVar.zzn().zza, str2);
    }
}
