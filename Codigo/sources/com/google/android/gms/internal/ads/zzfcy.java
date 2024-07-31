package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfcy implements zzequ {
    private final Context zza;
    private final Executor zzb;
    private final zzclg zzc;
    private final zzeqe zzd;
    private final zzeqi zze;
    private final ViewGroup zzf;
    private zzbha zzg;
    private final zzddm zzh;
    private final zzfnc zzi;
    private final zzdft zzj;
    private final zzfhf zzk;
    private com.google.common.util.concurrent.f zzl;

    public zzfcy(Context context, Executor executor, z4 z4Var, zzclg zzclgVar, zzeqe zzeqeVar, zzeqi zzeqiVar, zzfhf zzfhfVar, zzdft zzdftVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzclgVar;
        this.zzd = zzeqeVar;
        this.zze = zzeqiVar;
        this.zzk = zzfhfVar;
        this.zzh = zzclgVar.zzf();
        this.zzi = zzclgVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdftVar;
        zzfhfVar.zzr(z4Var);
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zza() {
        com.google.common.util.concurrent.f fVar = this.zzl;
        return (fVar == null || fVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zzb(u4 u4Var, String str, zzeqs zzeqsVar, zzeqt zzeqtVar) {
        zzcvb zze;
        zzcuc zzcucVar;
        zzfmz zzfmzVar;
        if (str == null) {
            zzcec.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcu
                public /* synthetic */ zzfcu() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzfcy.this.zzm();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue() && u4Var.f8754f) {
                this.zzc.zzk().zzn(true);
            }
            zzfhf zzfhfVar = this.zzk;
            zzfhfVar.zzs(str);
            zzfhfVar.zzE(u4Var);
            Context context = this.zza;
            zzfhh zzG = zzfhfVar.zzG();
            zzfmo zzb = zzfmn.zzb(context, zzfmy.zzf(zzG), 3, u4Var);
            if (!((Boolean) zzbig.zze.zze()).booleanValue() || !this.zzk.zzg().f8841v) {
                if (((Boolean) a0.c().zza(zzbgc.zzhZ)).booleanValue()) {
                    zze = this.zzc.zze();
                    zzdaf zzdafVar = new zzdaf();
                    zzdafVar.zze(this.zza);
                    zzdafVar.zzi(zzG);
                    zze.zzi(zzdafVar.zzj());
                    zzdgm zzdgmVar = new zzdgm();
                    zzdgmVar.zzj(this.zzd, this.zzb);
                    zzdgmVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzdgmVar.zzn());
                    zze.zze(new zzeon(this.zzg));
                    zze.zzd(new zzdlf(zzdnl.zza, null));
                    zze.zzg(new zzcvz(this.zzh, this.zzj));
                    zzcucVar = new zzcuc(this.zzf);
                } else {
                    zze = this.zzc.zze();
                    zzdaf zzdafVar2 = new zzdaf();
                    zzdafVar2.zze(this.zza);
                    zzdafVar2.zzi(zzG);
                    zze.zzi(zzdafVar2.zzj());
                    zzdgm zzdgmVar2 = new zzdgm();
                    zzdgmVar2.zzj(this.zzd, this.zzb);
                    zzdgmVar2.zza(this.zzd, this.zzb);
                    zzdgmVar2.zza(this.zze, this.zzb);
                    zzdgmVar2.zzl(this.zzd, this.zzb);
                    zzdgmVar2.zzd(this.zzd, this.zzb);
                    zzdgmVar2.zze(this.zzd, this.zzb);
                    zzdgmVar2.zzf(this.zzd, this.zzb);
                    zzdgmVar2.zzb(this.zzd, this.zzb);
                    zzdgmVar2.zzk(this.zzd, this.zzb);
                    zzdgmVar2.zzi(this.zzd, this.zzb);
                    zze.zzf(zzdgmVar2.zzn());
                    zze.zze(new zzeon(this.zzg));
                    zze.zzd(new zzdlf(zzdnl.zza, null));
                    zze.zzg(new zzcvz(this.zzh, this.zzj));
                    zzcucVar = new zzcuc(this.zzf);
                }
                zze.zzc(zzcucVar);
                zzcvc zzh = zze.zzh();
                if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                    zzfmz zzj = zzh.zzj();
                    zzj.zzh(3);
                    zzj.zzb(u4Var.A);
                    zzfmzVar = zzj;
                } else {
                    zzfmzVar = null;
                }
                zzcxp zzd = zzh.zzd();
                com.google.common.util.concurrent.f zzi = zzd.zzi(zzd.zzj());
                this.zzl = zzi;
                zzgen.zzr(zzi, new zzfcx(this, zzeqtVar, zzfmzVar, zzb, zzh), this.zzb);
                return true;
            }
            zzeqe zzeqeVar = this.zzd;
            if (zzeqeVar != null) {
                zzeqeVar.zzbK(zzfij.zzd(7, null, null));
            }
        }
        return false;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfhf zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        this.zzd.zzbK(zzfij.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(e0 e0Var) {
        this.zze.zza(e0Var);
    }

    public final void zzp(zzddn zzddnVar) {
        this.zzh.zzo(zzddnVar, this.zzb);
    }

    public final void zzq(zzbha zzbhaVar) {
        this.zzg = zzbhaVar;
    }

    public final boolean zzr() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        t.r();
        return j2.v(view, view.getContext());
    }
}
