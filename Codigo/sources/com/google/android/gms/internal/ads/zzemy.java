package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzemy implements zzeit {
    private final Context zza;
    private final zzdst zzb;

    public zzemy(Context context, zzdst zzdstVar) {
        this.zza = context;
        this.zzb = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzeks zzeksVar = new zzeks(zzfgmVar, (zzbus) zzeiqVar.zzb, x8.c.REWARDED);
        zzdsp zze = this.zzb.zze(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdsq(zzeksVar));
        zzeksVar.zzb(zze.zzc());
        ((zzekj) zzeiqVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        try {
            ((zzbus) zzeiqVar.zzb).zzq(zzfgmVar.zzaa);
            if (zzfgyVar.zza.zza.zzo.zza == 3) {
                ((zzbus) zzeiqVar.zzb).zzo(zzfgmVar.zzV, zzfgmVar.zzw.toString(), zzfgyVar.zza.zza.zzd, com.google.android.gms.dynamic.d.h2(this.zza), new zzemx(this, zzeiqVar, null), (zzbtb) zzeiqVar.zzc);
            } else {
                ((zzbus) zzeiqVar.zzb).zzp(zzfgmVar.zzV, zzfgmVar.zzw.toString(), zzfgyVar.zza.zza.zzd, com.google.android.gms.dynamic.d.h2(this.zza), new zzemx(this, zzeiqVar, null), (zzbtb) zzeiqVar.zzc);
            }
        } catch (RemoteException e10) {
            u1.b("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
