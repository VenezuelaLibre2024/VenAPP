package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzcto {
    private final zzflw zza;
    private final zzdwf zzb;
    private final zzfgy zzc;

    public zzcto(zzdwf zzdwfVar, zzfgy zzfgyVar, zzflw zzflwVar) {
        this.zza = zzflwVar;
        this.zzb = zzdwfVar;
        this.zzc = zzfgyVar;
    }

    private static String zzb(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j10, int i10) {
        if (((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
            zzflw zzflwVar = this.zza;
            zzfgy zzfgyVar = this.zzc;
            zzflv zzb = zzflv.zzb("ad_closed");
            zzb.zzg(zzfgyVar.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j10));
            zzb.zza("ad_format", "app_open_ad");
            zzb.zza("acr", zzb(i10));
            zzflwVar.zzb(zzb);
            return;
        }
        zzdwf zzdwfVar = this.zzb;
        zzfgy zzfgyVar2 = this.zzc;
        zzdwe zza = zzdwfVar.zza();
        zza.zze(zzfgyVar2.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j10));
        zza.zzb("ad_format", "app_open_ad");
        zza.zzb("acr", zzb(i10));
        zza.zzg();
    }
}
