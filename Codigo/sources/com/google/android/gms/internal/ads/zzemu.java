package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzemu implements zzeit {
    private final Context zza;
    private final Executor zzb;
    private final zzdst zzc;

    public zzemu(Context context, Executor executor, zzdst zzdstVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, final zzeiq zzeiqVar) {
        zzdsp zze = this.zzc.zze(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdsq(new zzdkw() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // com.google.android.gms.internal.ads.zzdkw
            public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
                zzeiq zzeiqVar2 = zzeiq.this;
                try {
                    ((zzfif) zzeiqVar2.zzb).zzv(z10);
                    ((zzfif) zzeiqVar2.zzb).zzz(context);
                } catch (zzfho e10) {
                    throw new zzdkv(e10.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcrv((zzfif) zzeiqVar.zzb), this.zzb);
        ((zzekj) zzeiqVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        try {
            zzfhh zzfhhVar = zzfgyVar.zza.zza;
            if (zzfhhVar.zzo.zza == 3) {
                ((zzfif) zzeiqVar.zzb).zzr(this.zza, zzfhhVar.zzd, zzfgmVar.zzw.toString(), (zzbtb) zzeiqVar.zzc);
            } else {
                ((zzfif) zzeiqVar.zzb).zzq(this.zza, zzfhhVar.zzd, zzfgmVar.zzw.toString(), (zzbtb) zzeiqVar.zzc);
            }
        } catch (Exception e10) {
            zzcec.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeiqVar.zza)), e10);
        }
    }
}
