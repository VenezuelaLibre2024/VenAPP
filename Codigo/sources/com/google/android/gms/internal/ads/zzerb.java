package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzerb implements zzequ {
    private final zzfhf zza;
    private final zzclg zzb;
    private final Context zzc;
    private final zzeqr zzd;
    private final zzfnc zze;
    private zzcww zzf;

    public zzerb(zzclg zzclgVar, Context context, zzeqr zzeqrVar, zzfhf zzfhfVar) {
        this.zzb = zzclgVar;
        this.zzc = context;
        this.zzd = zzeqrVar;
        this.zza = zzfhfVar;
        this.zze = zzclgVar.zzz();
        zzfhfVar.zzu(zzeqrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zza() {
        zzcww zzcwwVar = this.zzf;
        return zzcwwVar != null && zzcwwVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zzb(u4 u4Var, String str, zzeqs zzeqsVar, zzeqt zzeqtVar) {
        zzfmz zzfmzVar;
        Executor zzB;
        Runnable runnable;
        t.r();
        if (j2.g(this.zzc) && u4Var.D == null) {
            zzcec.zzg("Failed to load the ad because app ID is missing.");
            zzB = this.zzb.zzB();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqw
                @Override // java.lang.Runnable
                public final void run() {
                    zzerb.this.zzf();
                }
            };
        } else {
            if (str != null) {
                zzfie.zza(this.zzc, u4Var.f8754f);
                if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue() && u4Var.f8754f) {
                    this.zzb.zzk().zzn(true);
                }
                int i10 = ((zzeqv) zzeqsVar).zza;
                zzfhf zzfhfVar = this.zza;
                zzfhfVar.zzE(u4Var);
                zzfhfVar.zzz(i10);
                Context context = this.zzc;
                zzfhh zzG = zzfhfVar.zzG();
                zzfmo zzb = zzfmn.zzb(context, zzfmy.zzf(zzG), 8, u4Var);
                c1 c1Var = zzG.zzn;
                if (c1Var != null) {
                    this.zzd.zzd().zzm(c1Var);
                }
                zzdlj zzh = this.zzb.zzh();
                zzdaf zzdafVar = new zzdaf();
                zzdafVar.zze(this.zzc);
                zzdafVar.zzi(zzG);
                zzh.zzf(zzdafVar.zzj());
                zzdgm zzdgmVar = new zzdgm();
                zzdgmVar.zzk(this.zzd.zzd(), this.zzb.zzB());
                zzh.zze(zzdgmVar.zzn());
                zzh.zzd(this.zzd.zzc());
                zzh.zzc(new zzcuc(null));
                zzdlk zzg = zzh.zzg();
                if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                    zzfmz zzf = zzg.zzf();
                    zzf.zzh(8);
                    zzf.zzb(u4Var.A);
                    zzfmzVar = zzf;
                } else {
                    zzfmzVar = null;
                }
                this.zzb.zzx().zzc(1);
                zzgey zzgeyVar = zzcep.zza;
                zzhhl.zzb(zzgeyVar);
                ScheduledExecutorService zzC = this.zzb.zzC();
                zzcxp zza = zzg.zza();
                zzcww zzcwwVar = new zzcww(zzgeyVar, zzC, zza.zzi(zza.zzj()));
                this.zzf = zzcwwVar;
                zzcwwVar.zze(new zzera(this, zzeqtVar, zzfmzVar, zzb, zzg));
                return true;
            }
            zzcec.zzg("Ad unit ID should not be null for NativeAdLoader.");
            zzB = this.zzb.zzB();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqx
                @Override // java.lang.Runnable
                public final void run() {
                    zzerb.this.zzg();
                }
            };
        }
        zzB.execute(runnable);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzbK(zzfij.zzd(4, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzbK(zzfij.zzd(6, null, null));
    }
}
