package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfpb {
    private static final zzfpb zza = new zzfpb();

    private zzfpb() {
    }

    public static final zzfpb zza() {
        return zza;
    }

    public static final boolean zzi(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView == null) {
            zzfoa.zza.booleanValue();
            return;
        }
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        if (objArr.length > 0) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    obj = "\"\"";
                } else {
                    if (obj2 instanceof String) {
                        obj = obj2.toString();
                        if (!obj.startsWith("{")) {
                            sb2.append('\"');
                            sb2.append(obj);
                            sb2.append('\"');
                        }
                    } else {
                        sb2.append(obj2);
                    }
                    sb2.append(",");
                }
                sb2.append(obj);
                sb2.append(",");
            }
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(")}");
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            zzi(webView, sb3);
        } else {
            handler.post(new zzfpa(this, webView, sb3));
        }
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f10) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public final void zzf(WebView webView, JSONObject jSONObject) {
        zzb(webView, "setLastActivity", jSONObject);
    }

    public final void zzg(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzh(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
