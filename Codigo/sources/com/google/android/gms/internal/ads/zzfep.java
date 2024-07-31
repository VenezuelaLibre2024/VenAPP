package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfep implements zzequ {
    private final Context zza;
    private final Executor zzb;
    private final zzclg zzc;
    private final zzeqe zzd;
    private final zzffp zze;
    private zzbha zzf;
    private final zzfnc zzg;
    private final zzfhf zzh;
    private com.google.common.util.concurrent.f zzi;

    public zzfep(Context context, Executor executor, zzclg zzclgVar, zzeqe zzeqeVar, zzffp zzffpVar, zzfhf zzfhfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzclgVar;
        this.zzd = zzeqeVar;
        this.zzh = zzfhfVar;
        this.zze = zzffpVar;
        this.zzg = zzclgVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zza() {
        com.google.common.util.concurrent.f fVar = this.zzi;
        return (fVar == null || fVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zzb(u4 u4Var, String str, zzeqs zzeqsVar, zzeqt zzeqtVar) {
        zzdko zzf;
        zzfmz zzfmzVar;
        if (str == null) {
            zzcec.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfej
                @Override // java.lang.Runnable
                public final void run() {
                    zzfep.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue() && u4Var.f8754f) {
            this.zzc.zzk().zzn(true);
        }
        z4 z4Var = ((zzfei) zzeqsVar).zza;
        zzfhf zzfhfVar = this.zzh;
        zzfhfVar.zzs(str);
        zzfhfVar.zzr(z4Var);
        zzfhfVar.zzE(u4Var);
        Context context = this.zza;
        zzfhh zzG = zzfhfVar.zzG();
        zzfmo zzb = zzfmn.zzb(context, zzfmy.zzf(zzG), 4, u4Var);
        if (((Boolean) a0.c().zza(zzbgc.zzib)).booleanValue()) {
            zzdkn zzg = this.zzc.zzg();
            zzdaf zzdafVar = new zzdaf();
            zzdafVar.zze(this.zza);
            zzdafVar.zzi(zzG);
            zzg.zze(zzdafVar.zzj());
            zzdgm zzdgmVar = new zzdgm();
            zzdgmVar.zzj(this.zzd, this.zzb);
            zzdgmVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzdgmVar.zzn());
            zzg.zzc(new zzeon(this.zzf));
            zzf = zzg.zzf();
        } else {
            zzdgm zzdgmVar2 = new zzdgm();
            zzffp zzffpVar = this.zze;
            if (zzffpVar != null) {
                zzdgmVar2.zze(zzffpVar, this.zzb);
                zzdgmVar2.zzf(this.zze, this.zzb);
                zzdgmVar2.zzb(this.zze, this.zzb);
            }
            zzdkn zzg2 = this.zzc.zzg();
            zzdaf zzdafVar2 = new zzdaf();
            zzdafVar2.zze(this.zza);
            zzdafVar2.zzi(zzG);
            zzg2.zze(zzdafVar2.zzj());
            zzdgmVar2.zzj(this.zzd, this.zzb);
            zzdgmVar2.zze(this.zzd, this.zzb);
            zzdgmVar2.zzf(this.zzd, this.zzb);
            zzdgmVar2.zzb(this.zzd, this.zzb);
            zzdgmVar2.zza(this.zzd, this.zzb);
            zzdgmVar2.zzl(this.zzd, this.zzb);
            zzdgmVar2.zzk(this.zzd, this.zzb);
            zzdgmVar2.zzi(this.zzd, this.zzb);
            zzdgmVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzdgmVar2.zzn());
            zzg2.zzc(new zzeon(this.zzf));
            zzf = zzg2.zzf();
        }
        zzdko zzdkoVar = zzf;
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            zzfmz zzf2 = zzdkoVar.zzf();
            zzf2.zzh(4);
            zzf2.zzb(u4Var.A);
            zzfmzVar = zzf2;
        } else {
            zzfmzVar = null;
        }
        zzcxp zza = zzdkoVar.zza();
        com.google.common.util.concurrent.f zzi = zza.zzi(zza.zzj());
        this.zzi = zzi;
        zzgen.zzr(zzi, new zzfeo(this, zzeqtVar, zzfmzVar, zzb, zzdkoVar), this.zzb);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzbK(zzfij.zzd(6, null, null));
    }

    public final void zzi(zzbha zzbhaVar) {
        this.zzf = zzbhaVar;
    }
}
