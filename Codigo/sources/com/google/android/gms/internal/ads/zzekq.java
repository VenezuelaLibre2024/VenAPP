package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzekq implements zzein {
    private final Context zza;
    private final zzdtk zzb;
    private final zzdko zzc;
    private final zzfhh zzd;
    private final Executor zze;
    private final zzcei zzf;
    private final zzbni zzg;
    private final boolean zzh = ((Boolean) a0.c().zza(zzbgc.zziM)).booleanValue();
    private final zzehs zzi;

    public zzekq(Context context, zzcei zzceiVar, zzfhh zzfhhVar, Executor executor, zzdko zzdkoVar, zzdtk zzdtkVar, zzbni zzbniVar, zzehs zzehsVar) {
        this.zza = context;
        this.zzd = zzfhhVar;
        this.zzc = zzdkoVar;
        this.zze = executor;
        this.zzf = zzceiVar;
        this.zzb = zzdtkVar;
        this.zzg = zzbniVar;
        this.zzi = zzehsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        final zzdto zzdtoVar = new zzdto();
        com.google.common.util.concurrent.f zzn = zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzekq.this.zzc(zzfgmVar, zzfgyVar, zzdtoVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeko
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
        final zzdjo zze = this.zzc.zze(new zzcwx(zzfgyVar, zzfgmVar, null), new zzdjr(new zzekp(this.zza, this.zzf, zzceuVar, zzfgmVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza));
        zzceuVar.zzc(zze);
        zze.zzc().zzo(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zzq() {
                zzcjk zzcjkVar = zzcjk.this;
                if (zzcjkVar.zzN() != null) {
                    zzcjkVar.zzN().zzr();
                }
            }
        }, zzcep.zzf);
        zze.zzk().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzk();
        zzfgr zzfgrVar = zzfgmVar.zzt;
        return zzgen.zzm(zzdtj.zzj(zza, zzfgrVar.zzb, zzfgrVar.zza), new zzfws() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj2) {
                zzcjk zzcjkVar = zza;
                if (zzfgmVar.zzN) {
                    zzcjkVar.zzaf();
                }
                zzdjo zzdjoVar = zze;
                zzcjkVar.zzZ();
                zzcjkVar.onPause();
                return zzdjoVar.zzg();
            }
        }, this.zze);
    }
}
