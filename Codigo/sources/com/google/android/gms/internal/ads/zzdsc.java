package com.google.android.gms.internal.ads;

import g9.w;

/* loaded from: classes2.dex */
public final class zzdsc extends zzdrm implements zzdiu {
    private zzdiu zza;

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final synchronized void zzbo() {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar != null) {
            zzdiuVar.zzbo();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.a aVar, zzblw zzblwVar, w wVar, zzbly zzblyVar, g9.b bVar, zzdiu zzdiuVar) {
        super.zzh(aVar, zzblwVar, wVar, zzblyVar, bVar);
        this.zza = zzdiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final synchronized void zzs() {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar != null) {
            zzdiuVar.zzs();
        }
    }
}
