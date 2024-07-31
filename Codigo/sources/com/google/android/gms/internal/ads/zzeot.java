package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeot implements com.google.android.gms.ads.internal.f {
    final /* synthetic */ zzdjo zza;

    public zzeot(zzeou zzeouVar, zzdjo zzdjoVar) {
        this.zza = zzdjoVar;
    }

    @Override // com.google.android.gms.ads.internal.f
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.f
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.f
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
