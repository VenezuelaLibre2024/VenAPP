package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.y0;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzelj implements zzeit {
    private final Context zza;
    private final zzdlk zzb;
    private final Executor zzc;

    public zzelj(Context context, zzdlk zzdlkVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdlkVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfgy zzfgyVar, int i10) {
        return zzfgyVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzdna zzah;
        zzbtg zzD = ((zzfif) zzeiqVar.zzb).zzD();
        zzbth zzE = ((zzfif) zzeiqVar.zzb).zzE();
        zzbtk zzd = ((zzfif) zzeiqVar.zzb).zzd();
        if (zzd != null && zzc(zzfgyVar, 6)) {
            zzah = zzdna.zzt(zzd);
        } else if (zzD != null && zzc(zzfgyVar, 6)) {
            zzah = zzdna.zzai(zzD);
        } else if (zzD != null && zzc(zzfgyVar, 2)) {
            zzah = zzdna.zzag(zzD);
        } else if (zzE != null && zzc(zzfgyVar, 6)) {
            zzah = zzdna.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfgyVar, 1)) {
                throw new zzeml(1, "No native ad mappers");
            }
            zzah = zzdna.zzah(zzE);
        }
        zzfhh zzfhhVar = zzfgyVar.zza.zza;
        if (!zzfhhVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        zzdnc zze = this.zzb.zze(new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza), new zzdnm(zzah), new zzdpd(zzE, zzD, zzd));
        ((zzekj) zzeiqVar.zzc).zzc(zze.zzj());
        zze.zzd().zzo(new zzcrv((zzfif) zzeiqVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        zzfif zzfifVar = (zzfif) zzeiqVar.zzb;
        zzfhh zzfhhVar = zzfgyVar.zza.zza;
        String jSONObject = zzfgmVar.zzw.toString();
        String l10 = y0.l(zzfgmVar.zzt);
        zzbtb zzbtbVar = (zzbtb) zzeiqVar.zzc;
        zzfhh zzfhhVar2 = zzfgyVar.zza.zza;
        zzfifVar.zzp(this.zza, zzfhhVar.zzd, jSONObject, l10, zzbtbVar, zzfhhVar2.zzi, zzfhhVar2.zzg);
    }
}
