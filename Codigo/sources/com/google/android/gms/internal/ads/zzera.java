package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzera implements zzgej {
    final /* synthetic */ zzeqt zza;
    final /* synthetic */ zzfmz zzb;
    final /* synthetic */ zzfmo zzc;
    final /* synthetic */ zzdlk zzd;
    final /* synthetic */ zzerb zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzera(zzerb zzerbVar, zzeqt zzeqtVar, zzfmz zzfmzVar, zzfmo zzfmoVar, zzdlk zzdlkVar) {
        this.zza = zzeqtVar;
        this.zzb = zzfmzVar;
        this.zzc = zzfmoVar;
        this.zzd = zzdlkVar;
        this.zze = zzerbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzclg zzclgVar;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        final c3 zza = this.zzd.zza().zza(th2);
        this.zzd.zzb().zzbK(zza);
        zzclgVar = this.zze.zzb;
        zzclgVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqz
            @Override // java.lang.Runnable
            public final void run() {
                zzeqr zzeqrVar;
                zzeqrVar = zzera.this.zze.zzd;
                zzeqrVar.zza().zzbK(zza);
            }
        });
        zzfie.zzb(zza.f8626a, th2, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbht.zzc.zze()).booleanValue() && (zzfmzVar = this.zzb) != null) {
            zzfmzVar.zzc(zza);
            zzfmo zzfmoVar = this.zzc;
            zzfmoVar.zzg(th2);
            zzfmoVar.zzf(false);
            zzfmzVar.zza(zzfmoVar);
            zzfmzVar.zzg();
            return;
        }
        zzerb zzerbVar = this.zze;
        zzfmo zzfmoVar2 = this.zzc;
        zzfncVar = zzerbVar.zze;
        zzfmoVar2.zza(zza);
        zzfmoVar2.zzg(th2);
        zzfmoVar2.zzf(false);
        zzfncVar.zzb(zzfmoVar2.zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeqr zzeqrVar;
        zzclg zzclgVar;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        zzcwh zzcwhVar = (zzcwh) obj;
        synchronized (this.zze) {
            zzdfc zzn = zzcwhVar.zzn();
            zzeqrVar = this.zze.zzd;
            zzn.zza(zzeqrVar.zzd());
            this.zza.zzb(zzcwhVar);
            zzclgVar = this.zze.zzb;
            zzclgVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqy
                @Override // java.lang.Runnable
                public final void run() {
                    zzeqr zzeqrVar2;
                    zzeqrVar2 = zzera.this.zze.zzd;
                    zzeqrVar2.zzb().zzr();
                }
            });
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zze;
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
