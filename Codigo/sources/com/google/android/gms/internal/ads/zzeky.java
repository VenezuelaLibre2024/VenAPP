package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzeky implements zzeit {
    private final Context zza;
    private final zzdko zzb;

    public zzeky(Context context, zzdko zzdkoVar) {
        this.zza = context;
        this.zzb = zzdkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzeks zzeksVar = new zzeks(zzfgmVar, (zzbus) zzeiqVar.zzb, x8.c.INTERSTITIAL);
        zzdjo zze = this.zzb.zze(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdjr(zzeksVar, null));
        zzeksVar.zzb(zze.zzc());
        ((zzekj) zzeiqVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        try {
            ((zzbus) zzeiqVar.zzb).zzq(zzfgmVar.zzaa);
            ((zzbus) zzeiqVar.zzb).zzl(zzfgmVar.zzV, zzfgmVar.zzw.toString(), zzfgyVar.zza.zza.zzd, com.google.android.gms.dynamic.d.h2(this.zza), new zzekx(this, zzeiqVar, null), (zzbtb) zzeiqVar.zzc);
        } catch (RemoteException e10) {
            u1.b("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfho(e10);
        }
    }
}
