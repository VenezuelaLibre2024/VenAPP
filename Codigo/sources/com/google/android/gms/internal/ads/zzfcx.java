package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfcx implements zzgej {
    final /* synthetic */ zzeqt zza;
    final /* synthetic */ zzfmz zzb;
    final /* synthetic */ zzfmo zzc;
    final /* synthetic */ zzcvc zzd;
    final /* synthetic */ zzfcy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfcx(zzfcy zzfcyVar, zzeqt zzeqtVar, zzfmz zzfmzVar, zzfmo zzfmoVar, zzcvc zzcvcVar) {
        this.zza = zzeqtVar;
        this.zzb = zzfmzVar;
        this.zzc = zzfmoVar;
        this.zzd = zzcvcVar;
        this.zze = zzfcyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzddm zzddmVar;
        zzdft zzdftVar;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        Executor executor;
        final c3 zza = this.zzd.zzd().zza(th2);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzbK(zza);
            if (((Boolean) a0.c().zza(zzbgc.zzhZ)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeqe zzeqeVar;
                        zzeqeVar = zzfcx.this.zze.zzd;
                        zzeqeVar.zzbK(zza);
                    }
                });
            }
            zzfcy zzfcyVar = this.zze;
            zzddmVar = zzfcyVar.zzh;
            zzdftVar = zzfcyVar.zzj;
            zzddmVar.zzd(zzdftVar.zzc());
            zzfie.zzb(zza.f8626a, th2, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzi;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzddm zzddmVar;
        zzfnc zzfncVar;
        zzfmz zzfmzVar;
        Executor executor;
        final zzeqe zzeqeVar;
        zzeqe zzeqeVar2;
        zzeqi zzeqiVar;
        zzcuf zzcufVar = (zzcuf) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcufVar.zzc() != null) {
                ViewParent parent = zzcufVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    zzcec.zzj("Banner view provided from " + (zzcufVar.zzl() != null ? zzcufVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcufVar.zzc());
                }
            }
            zzbfu zzbfuVar = zzbgc.zzhZ;
            if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue()) {
                zzdfc zzn = zzcufVar.zzn();
                zzeqeVar2 = this.zze.zzd;
                zzn.zza(zzeqeVar2);
                zzeqiVar = this.zze.zze;
                zzn.zzc(zzeqiVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcufVar.zzc());
            this.zza.zzb(zzcufVar);
            if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue()) {
                zzfcy zzfcyVar = this.zze;
                executor = zzfcyVar.zzb;
                zzeqeVar = zzfcyVar.zzd;
                Objects.requireNonNull(zzeqeVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeqe.this.zzr();
                    }
                });
            }
            zzddmVar = this.zze.zzh;
            zzddmVar.zzd(zzcufVar.zza());
            if (!((Boolean) zzbht.zzc.zze()).booleanValue() || (zzfmzVar = this.zzb) == null) {
                zzfncVar = this.zze.zzi;
                zzfmo zzfmoVar = this.zzc;
                zzfmoVar.zzb(zzcufVar.zzp().zzb);
                zzfmoVar.zzd(zzcufVar.zzl().zzg());
                zzfmoVar.zzf(true);
                zzfncVar.zzb(zzfmoVar.zzl());
            } else {
                zzfmzVar.zzf(zzcufVar.zzp().zzb);
                zzfmzVar.zze(zzcufVar.zzl().zzg());
                zzfmo zzfmoVar2 = this.zzc;
                zzfmoVar2.zzf(true);
                zzfmzVar.zza(zzfmoVar2);
                zzfmzVar.zzg();
            }
        }
    }
}
