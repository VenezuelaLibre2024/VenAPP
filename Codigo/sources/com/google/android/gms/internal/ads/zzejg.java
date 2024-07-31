package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzejg implements zzeit {
    private final Context zza;
    private final zzctt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejg(Context context, zzctt zzcttVar) {
        this.zza = context;
        this.zzb = zzcttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzeks zzeksVar = new zzeks(zzfgmVar, (zzbus) zzeiqVar.zzb, x8.c.APP_OPEN_AD);
        zzctq zza = this.zzb.zza(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdjr(zzeksVar, null), new zzctr(zzfgmVar.zzab));
        zzeksVar.zzb(zza.zzc());
        ((zzekj) zzeiqVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        try {
            ((zzbus) zzeiqVar.zzb).zzq(zzfgmVar.zzaa);
            ((zzbus) zzeiqVar.zzb).zzi(zzfgmVar.zzV, zzfgmVar.zzw.toString(), zzfgyVar.zza.zza.zzd, com.google.android.gms.dynamic.d.h2(this.zza), new zzejf(zzeiqVar, null), (zzbtb) zzeiqVar.zzc);
        } catch (RemoteException e10) {
            u1.b("Remote exception loading an app open RTB ad", e10);
            throw new zzfho(e10);
        }
    }
}
