package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.y0;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeku implements zzeit {
    private final Context zza;
    private final zzdko zzb;
    private final zzcei zzc;
    private final Executor zzd;

    public zzeku(Context context, zzcei zzceiVar, zzdko zzdkoVar, Executor executor) {
        this.zza = context;
        this.zzc = zzceiVar;
        this.zzb = zzdkoVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, final zzeiq zzeiqVar) {
        zzdjo zze = this.zzb.zze(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdjr(new zzdkw() { // from class: com.google.android.gms.internal.ads.zzekt
            @Override // com.google.android.gms.internal.ads.zzdkw
            public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
                zzeku.this.zzc(zzeiqVar, z10, context, zzdbkVar);
            }
        }, null));
        zze.zzd().zzo(new zzcrv((zzfif) zzeiqVar.zzb), this.zzd);
        ((zzekj) zzeiqVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzfif zzfifVar = (zzfif) zzeiqVar.zzb;
        zzfhh zzfhhVar = zzfgyVar.zza.zza;
        zzfifVar.zzo(this.zza, zzfhhVar.zzd, zzfgmVar.zzw.toString(), y0.l(zzfgmVar.zzt), (zzbtb) zzeiqVar.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzeiq zzeiqVar, boolean z10, Context context, zzdbk zzdbkVar) {
        try {
            ((zzfif) zzeiqVar.zzb).zzv(z10);
            if (this.zzc.zzc < ((Integer) a0.c().zza(zzbgc.zzaH)).intValue()) {
                ((zzfif) zzeiqVar.zzb).zzx();
            } else {
                ((zzfif) zzeiqVar.zzb).zzy(context);
            }
        } catch (zzfho e10) {
            zzcec.zzi("Cannot show interstitial.");
            throw new zzdkv(e10.getCause());
        }
    }
}
