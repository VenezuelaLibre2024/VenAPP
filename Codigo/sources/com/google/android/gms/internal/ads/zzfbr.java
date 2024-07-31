package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfbr implements zzgej {
    final /* synthetic */ zzeqt zza;
    final /* synthetic */ zzfmz zzb;
    final /* synthetic */ zzfmo zzc;
    final /* synthetic */ zzfbt zzd;
    final /* synthetic */ zzfbu zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbr(zzfbu zzfbuVar, zzeqt zzeqtVar, zzfmz zzfmzVar, zzfmo zzfmoVar, zzfbt zzfbtVar) {
        this.zza = zzeqtVar;
        this.zzb = zzfmzVar;
        this.zzc = zzfmoVar;
        this.zzd = zzfbtVar;
        this.zze = zzfbuVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.gms.internal.ads.zzdae] */
    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzfed zzfedVar;
        zzfck zzfckVar;
        zzdad zzm;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        Executor executor;
        zzfedVar = this.zze.zze;
        zzctp zzctpVar = (zzctp) zzfedVar.zzd();
        final c3 zzb = zzctpVar == null ? zzfij.zzb(th2, null) : zzctpVar.zzb().zza(th2);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzctpVar != null) {
                zzctpVar.zzc().zzbK(zzb);
                if (((Boolean) a0.c().zza(zzbgc.zzia)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbq
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfck zzfckVar2;
                            zzfckVar2 = zzfbr.this.zze.zzd;
                            zzfckVar2.zzbK(zzb);
                        }
                    });
                }
            } else {
                zzfckVar = this.zze.zzd;
                zzfckVar.zzbK(zzb);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzh();
            }
            zzfie.zzb(zzb.f8626a, th2, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzh;
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
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        zzfck zzfckVar;
        zzcwh zzcwhVar = (zzcwh) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) a0.c().zza(zzbgc.zzia)).booleanValue()) {
                zzdfc zzn = zzcwhVar.zzn();
                zzfckVar = this.zze.zzd;
                zzn.zzb(zzfckVar);
            }
            this.zza.zzb(zzcwhVar);
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzh;
                zzfmo zzfmoVar = this.zzc;
                zzfmoVar.zzb(zzcwhVar.zzp().zzb);
                zzfmoVar.zzd(zzcwhVar.zzl().zzg());
                zzfmoVar.zzf(true);
                zzfncVar.zzb(zzfmoVar.zzl());
            } else {
                zzfmzVar.zzf(zzcwhVar.zzp().zzb);
                zzfmzVar.zze(zzcwhVar.zzl().zzg());
                zzfmo zzfmoVar2 = this.zzc;
                zzfmoVar2.zzf(true);
                zzfmzVar.zza(zzfmoVar2);
                zzfmzVar.zzg();
            }
        }
    }
}
