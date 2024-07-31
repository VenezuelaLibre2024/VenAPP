package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfeo implements zzgej {
    final /* synthetic */ zzeqt zza;
    final /* synthetic */ zzfmz zzb;
    final /* synthetic */ zzfmo zzc;
    final /* synthetic */ zzdko zzd;
    final /* synthetic */ zzfep zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfeo(zzfep zzfepVar, zzeqt zzeqtVar, zzfmz zzfmzVar, zzfmo zzfmoVar, zzdko zzdkoVar) {
        this.zza = zzeqtVar;
        this.zzb = zzfmzVar;
        this.zzc = zzfmoVar;
        this.zzd = zzdkoVar;
        this.zze = zzfepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        Executor executor;
        Executor executor2;
        final c3 zza = this.zzd.zza().zza(th2);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzbK(zza);
            if (((Boolean) a0.c().zza(zzbgc.zzib)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfek
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeqe zzeqeVar;
                        zzeqeVar = zzfeo.this.zze.zzd;
                        zzeqeVar.zzbK(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfel
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzffp zzffpVar;
                        zzffpVar = zzfeo.this.zze.zze;
                        zzffpVar.zzbK(zza);
                    }
                });
            }
            zzfie.zzb(zza.f8626a, th2, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzg;
                zzfmo zzfmoVar = this.zzc;
                zzfmoVar.zza(zza);
                zzfmoVar.zzg(th2);
                zzfmoVar.zzf(false);
                zzfncVar.zzb(zzfmoVar.zzl());
            } else {
                zzfmzVar.zzc(zza);
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
        Executor executor;
        Executor executor2;
        zzeqe zzeqeVar;
        zzffp zzffpVar;
        zzdjn zzdjnVar = (zzdjn) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbfu zzbfuVar = zzbgc.zzib;
            if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue()) {
                zzdfc zzn = zzdjnVar.zzn();
                zzeqeVar = this.zze.zzd;
                zzn.zza(zzeqeVar);
                zzffpVar = this.zze.zze;
                zzn.zzd(zzffpVar);
            }
            this.zza.zzb(zzdjnVar);
            if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfem
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeqe zzeqeVar2;
                        zzeqeVar2 = zzfeo.this.zze.zzd;
                        zzeqeVar2.zzr();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfen
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzffp zzffpVar2;
                        zzffpVar2 = zzfeo.this.zze.zze;
                        zzffpVar2.zzr();
                    }
                });
            }
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzg;
                zzfmo zzfmoVar = this.zzc;
                zzfmoVar.zzb(zzdjnVar.zzp().zzb);
                zzfmoVar.zzd(zzdjnVar.zzl().zzg());
                zzfmoVar.zzf(true);
                zzfncVar.zzb(zzfmoVar.zzl());
            } else {
                zzfmzVar.zzf(zzdjnVar.zzp().zzb);
                zzfmzVar.zze(zzdjnVar.zzl().zzg());
                zzfmo zzfmoVar2 = this.zzc;
                zzfmoVar2.zzf(true);
                zzfmzVar.zza(zzfmoVar2);
                zzfmzVar.zzg();
            }
        }
    }
}
