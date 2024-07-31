package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import g9.u;

/* loaded from: classes2.dex */
public final class zzcjj extends WebChromeClient {
    private final zzcjk zza;

    public zzcjj(zzcjk zzcjkVar) {
        this.zza = zzcjkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcjk)) {
            return webView.getContext();
        }
        zzcjk zzcjkVar = (zzcjk) webView;
        Activity zzi = zzcjkVar.zzi();
        return zzi != null ? zzi : zzcjkVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzcjk) {
            u zzL = ((zzcjk) webView).zzL();
            if (zzL != null) {
                zzL.zzb();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        zzcec.zzj(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcji.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            zzcec.zzg(str);
        } else if (i10 == 2) {
            zzcec.zzj(str);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            zzcec.zzi(str);
        } else {
            zzcec.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(131072L, j13), 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            zzcjk zzcjkVar = this.zza;
            t.r();
            if (!j2.b0(zzcjkVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzcjk zzcjkVar2 = this.zza;
                t.r();
                if (!j2.b0(zzcjkVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        u zzL = this.zza.zzL();
        if (zzL == null) {
            zzcec.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        u zzL = this.zza.zzL();
        if (zzL == null) {
            zzcec.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzL.g2(view, customViewCallback);
            zzL.f2(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        zzcjk zzcjkVar;
        AlertDialog create;
        com.google.android.gms.ads.internal.b zzd;
        try {
            zzcjkVar = this.zza;
        } catch (WindowManager.BadTokenException e10) {
            zzcec.zzk("Fail to display Dialog.", e10);
        }
        if (zzcjkVar != null && zzcjkVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.c()) {
            zzd.b("window." + str + "('" + str3 + "')");
            return false;
        }
        t.r();
        AlertDialog.Builder j10 = j2.j(context);
        j10.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            create = j10.setView(linearLayout).setPositiveButton(R.string.ok, new zzcjh(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcjg(jsPromptResult)).setOnCancelListener(new zzcjf(jsPromptResult)).create();
        } else {
            create = j10.setMessage(str3).setPositiveButton(R.string.ok, new zzcje(jsResult)).setNegativeButton(R.string.cancel, new zzcjd(jsResult)).setOnCancelListener(new zzcjc(jsResult)).create();
        }
        create.show();
        return true;
    }
}
