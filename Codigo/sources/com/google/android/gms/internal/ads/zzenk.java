package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzenk implements zzein {
    private final Context zza;
    private final zzdtk zzb;
    private final zzdst zzc;
    private final zzfhh zzd;
    private final Executor zze;
    private final zzcei zzf;
    private final zzbni zzg;
    private final boolean zzh = ((Boolean) a0.c().zza(zzbgc.zziM)).booleanValue();
    private final zzehs zzi;

    public zzenk(Context context, zzcei zzceiVar, zzfhh zzfhhVar, Executor executor, zzdst zzdstVar, zzdtk zzdtkVar, zzbni zzbniVar, zzehs zzehsVar) {
        this.zza = context;
        this.zzd = zzfhhVar;
        this.zzc = zzdstVar;
        this.zze = executor;
        this.zzf = zzceiVar;
        this.zzb = zzdtkVar;
        this.zzg = zzbniVar;
        this.zzi = zzehsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        final zzdto zzdtoVar = new zzdto();
        com.google.common.util.concurrent.f zzn = zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzenk.this.zzc(zzfgmVar, zzfgyVar, zzdtoVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // java.lang.Runnable
            public final void run() {
                zzdto.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final boolean zzb(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        zzfgr zzfgrVar = zzfgmVar.zzt;
        return (zzfgrVar == null || zzfgrVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(final zzfgm zzfgmVar, zzfgy zzfgyVar, zzdto zzdtoVar, Object obj) {
        final zzcjk zza = this.zzb.zza(this.zzd.zze, zzfgmVar, zzfgyVar.zzb.zzb);
        zza.zzaa(zzfgmVar.zzX);
        zzdtoVar.zza(this.zza, (View) zza);
        zzceu zzceuVar = new zzceu();
        final zzdsp zze = this.zzc.zze(new zzcwx(zzfgyVar, zzfgmVar, null), new zzdsq(new zzenj(this.zza, this.zzb, this.zzd, this.zzf, zzfgmVar, zzceuVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzceuVar.zzc(zze);
        zzbnx.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zzq() {
                zzcjk zzcjkVar = zzcjk.this;
                if (zzcjkVar.zzN() != null) {
                    zzcjkVar.zzN().zzr();
                }
            }
        }, zzcep.zzf);
        zze.zzl().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzl();
        zzfgr zzfgrVar = zzfgmVar.zzt;
        return zzgen.zzm(zzdtj.zzj(zza, zzfgrVar.zzb, zzfgrVar.zza), new zzfws() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj2) {
                zzcjk zzcjkVar = zza;
                if (zzfgmVar.zzN) {
                    zzcjkVar.zzaf();
                }
                zzdsp zzdspVar = zze;
                zzcjkVar.zzZ();
                zzcjkVar.onPause();
                return zzdspVar.zzk();
            }
        }, this.zze);
    }
}
