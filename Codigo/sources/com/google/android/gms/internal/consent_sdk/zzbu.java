package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzbu extends WebView {
    private final Handler zza;
    private final zzca zzb;
    private boolean zzc;

    public zzbu(zzbw zzbwVar, Handler handler, zzca zzcaVar) {
        super(zzbwVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcaVar;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbu zzbuVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        zzca zzcaVar = this.zzb;
        Objects.requireNonNull(zzcaVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            public /* synthetic */ zzbr() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzca.this.zzc();
            }
        });
    }

    public final void zzd(String str, String str2) {
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbq
            public final /* synthetic */ String zzb;

            public /* synthetic */ zzbq(String str3) {
                r2 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcs.zza(zzbu.this, r2);
            }
        });
    }
}
