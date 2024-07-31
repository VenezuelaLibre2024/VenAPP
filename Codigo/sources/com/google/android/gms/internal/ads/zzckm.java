package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzckm {
    private final zzckn zza;
    private final zzckl zzb;

    public zzckm(zzckn zzcknVar, zzckl zzcklVar) {
        this.zzb = zzcklVar;
        this.zza = zzcknVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzckn, com.google.android.gms.internal.ads.zzckt] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r02 = this.zza;
            zzavi zzI = r02.zzI();
            if (zzI == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                zzave zzc = zzI.zzc();
                if (r02.getContext() != null) {
                    zzckn zzcknVar = this.zza;
                    return zzc.zzf(zzcknVar.getContext(), str, (View) zzcknVar, zzcknVar.zzi());
                }
                str2 = "Context is null, ignoring.";
            }
        }
        u1.a(str2);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzckn, com.google.android.gms.internal.ads.zzckt] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r02 = this.zza;
        zzavi zzI = r02.zzI();
        if (zzI == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            zzave zzc = zzI.zzc();
            if (r02.getContext() != null) {
                zzckn zzcknVar = this.zza;
                return zzc.zzh(zzcknVar.getContext(), (View) zzcknVar, zzcknVar.zzi());
            }
            str = "Context is null, ignoring.";
        }
        u1.a(str);
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzcec.zzj("URL is empty, ignoring message");
        } else {
            j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                public final /* synthetic */ String zzb;

                public /* synthetic */ zzckk(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzckm.this.zza(r2);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzcjs zzaL = ((zzckf) this.zzb.zza).zzaL();
        if (zzaL == null) {
            zzcec.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaL.zzj(parse);
        }
    }
}
