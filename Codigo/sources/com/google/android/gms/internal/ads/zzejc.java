package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzejc implements zzeit {
    private final Context zza;
    private final zzctt zzb;
    private final Executor zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejc(Context context, zzctt zzcttVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcttVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, final zzeiq zzeiqVar) {
        zzctq zza = this.zzb.zza(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdjr(new zzdkw() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzdkw
            public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
                zzeiq zzeiqVar2 = zzeiq.this;
                try {
                    ((zzfif) zzeiqVar2.zzb).zzv(z10);
                    ((zzfif) zzeiqVar2.zzb).zzw(context);
                } catch (zzfho e10) {
                    throw new zzdkv(e10.getCause());
                }
            }
        }, null), new zzctr(zzfgmVar.zzab));
        zza.zzd().zzo(new zzcrv((zzfif) zzeiqVar.zzb), this.zzc);
        ((zzekj) zzeiqVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzfif zzfifVar = (zzfif) zzeiqVar.zzb;
        zzfhh zzfhhVar = zzfgyVar.zza.zza;
        zzfifVar.zzl(this.zza, zzfhhVar.zzd, zzfgmVar.zzw.toString(), (zzbtb) zzeiqVar.zzc);
    }
}
