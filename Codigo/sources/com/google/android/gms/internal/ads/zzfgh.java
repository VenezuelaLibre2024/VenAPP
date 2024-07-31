package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
final class zzfgh implements zzeqt {
    final /* synthetic */ zzfgj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgh(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqt
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeqt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdso zzdsoVar;
        zzfgz zzfgzVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdso) obj;
            if (((Boolean) a0.c().zza(zzbgc.zzdq)).booleanValue()) {
                zzfha zzd = ((zzdso) obj).zzd();
                zzfgzVar = this.zza.zzc;
                zzd.zza = zzfgzVar;
            }
            zzdsoVar = this.zza.zzd;
            zzdsoVar.zzj();
        }
    }
}
