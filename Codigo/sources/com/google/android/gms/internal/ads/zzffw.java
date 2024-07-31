package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzffw implements zzgej {
    final /* synthetic */ zzeqt zza;
    final /* synthetic */ zzfmz zzb;
    final /* synthetic */ zzfmo zzc;
    final /* synthetic */ zzffy zzd;
    final /* synthetic */ zzffz zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffw(zzffz zzffzVar, zzeqt zzeqtVar, zzfmz zzfmzVar, zzfmo zzfmoVar, zzffy zzffyVar) {
        this.zza = zzeqtVar;
        this.zzb = zzfmzVar;
        this.zzc = zzfmoVar;
        this.zzd = zzffyVar;
        this.zze = zzffzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzfed zzfedVar;
        zzffp zzffpVar;
        zzdss zzk;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        Executor executor;
        zzfedVar = this.zze.zze;
        zzdst zzdstVar = (zzdst) zzfedVar.zzd();
        final c3 zzb = zzdstVar == null ? zzfij.zzb(th2, null) : zzdstVar.zzb().zza(th2);
        synchronized (this.zze) {
            if (zzdstVar != null) {
                zzdstVar.zza().zzbK(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzffp zzffpVar2;
                        zzffpVar2 = zzffw.this.zze.zzd;
                        zzffpVar2.zzbK(zzb);
                    }
                });
            } else {
                zzffpVar = this.zze.zzd;
                zzffpVar.zzbK(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzh();
            }
            zzfie.zzb(zzb.f8626a, th2, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzg;
                zzfmo zzfmoVar = this.zzc;
                zzfmoVar.zza(zzb);
                zzfmoVar.zzg(th2);
                zzfmoVar.zzf(false);
                zzfncVar.zzb(zzfmoVar.zzl());
            } else {
                zzfmzVar.zzc(zzb);
                zzfmo zzfmoVar2 = this.zzc;
                zzfmoVar2.zzg(th2);
                zzfmoVar2.zzf(false);
                zzfmzVar.zza(zzfmoVar2);
                zzfmzVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffp zzffpVar;
        Executor executor;
        final zzffp zzffpVar2;
        zzffp zzffpVar3;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        zzdso zzdsoVar = (zzdso) obj;
        synchronized (this.zze) {
            zzdfc zzn = zzdsoVar.zzn();
            zzffpVar = this.zze.zzd;
            zzn.zzd(zzffpVar);
            this.zza.zzb(zzdsoVar);
            zzffz zzffzVar = this.zze;
            executor = zzffzVar.zzb;
            zzffpVar2 = zzffzVar.zzd;
            Objects.requireNonNull(zzffpVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffv
                @Override // java.lang.Runnable
                public final void run() {
                    zzffp.this.zzr();
                }
            });
            zzffpVar3 = this.zze.zzd;
            zzffpVar3.onAdMetadataChanged();
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzg;
                zzfmo zzfmoVar = this.zzc;
                zzfmoVar.zzb(zzdsoVar.zzp().zzb);
                zzfmoVar.zzd(zzdsoVar.zzl().zzg());
                zzfmoVar.zzf(true);
                zzfncVar.zzb(zzfmoVar.zzl());
            } else {
                zzfmzVar.zzf(zzdsoVar.zzp().zzb);
                zzfmzVar.zze(zzdsoVar.zzl().zzg());
                zzfmo zzfmoVar2 = this.zzc;
                zzfmoVar2.zzf(true);
                zzfmzVar.zza(zzfmoVar2);
                zzfmzVar.zzg();
            }
        }
    }
}
