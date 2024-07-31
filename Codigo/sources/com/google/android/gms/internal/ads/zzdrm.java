package com.google.android.gms.internal.ads;

import android.os.Bundle;
import g9.w;

/* loaded from: classes2.dex */
public class zzdrm implements com.google.android.gms.ads.internal.client.a, zzblw, w, zzbly, g9.b {
    private com.google.android.gms.ads.internal.client.a zza;
    private zzblw zzb;
    private w zzc;
    private zzbly zzd;
    private g9.b zze;

    @Override // com.google.android.gms.ads.internal.client.a
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zza(String str, Bundle bundle) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar != null) {
            zzblwVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final synchronized void zzb(String str, String str2) {
        zzbly zzblyVar = this.zzd;
        if (zzblyVar != null) {
            zzblyVar.zzb(str, str2);
        }
    }

    @Override // g9.w
    public final synchronized void zzbA() {
        w wVar = this.zzc;
        if (wVar != null) {
            wVar.zzbA();
        }
    }

    @Override // g9.w
    public final synchronized void zzbC() {
        w wVar = this.zzc;
        if (wVar != null) {
            wVar.zzbC();
        }
    }

    @Override // g9.w
    public final synchronized void zzbD(int i10) {
        w wVar = this.zzc;
        if (wVar != null) {
            wVar.zzbD(i10);
        }
    }

    @Override // g9.w
    public final synchronized void zzbP() {
        w wVar = this.zzc;
        if (wVar != null) {
            wVar.zzbP();
        }
    }

    @Override // g9.w
    public final synchronized void zzbt() {
        w wVar = this.zzc;
        if (wVar != null) {
            wVar.zzbt();
        }
    }

    @Override // g9.w
    public final synchronized void zzbz() {
        w wVar = this.zzc;
        if (wVar != null) {
            wVar.zzbz();
        }
    }

    @Override // g9.b
    public final synchronized void zzg() {
        g9.b bVar = this.zze;
        if (bVar != null) {
            bVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.a aVar, zzblw zzblwVar, w wVar, zzbly zzblyVar, g9.b bVar) {
        this.zza = aVar;
        this.zzb = zzblwVar;
        this.zzc = wVar;
        this.zzd = zzblyVar;
        this.zze = bVar;
    }
}
