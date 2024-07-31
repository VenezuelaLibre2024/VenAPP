package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;

/* loaded from: classes2.dex */
public final class zzczl implements zzdds {
    private final Context zza;
    private final zzfhh zzb;
    private final zzcei zzc;
    private final w1 zzd;
    private final zzdyi zze;
    private final zzfnc zzf;

    public zzczl(Context context, zzfhh zzfhhVar, zzcei zzceiVar, w1 w1Var, zzdyi zzdyiVar, zzfnc zzfncVar) {
        this.zza = context;
        this.zzb = zzfhhVar;
        this.zzc = zzceiVar;
        this.zzd = w1Var;
        this.zze = zzdyiVar;
        this.zzf = zzfncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzdR)).booleanValue()) {
            w1 w1Var = this.zzd;
            Context context = this.zza;
            zzcei zzceiVar = this.zzc;
            zzfhh zzfhhVar = this.zzb;
            zzfnc zzfncVar = this.zzf;
            t.c().c(context, zzceiVar, zzfhhVar.zzf, w1Var.zzh(), zzfncVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
    }
}
