package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
final class zzeks implements zzdkw {
    private final zzfgm zza;
    private final zzbus zzb;
    private final x8.c zzc;
    private zzdbp zzd = null;

    public zzeks(zzfgm zzfgmVar, zzbus zzbusVar, x8.c cVar) {
        this.zza = zzfgmVar;
        this.zzb = zzbusVar;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkw
    public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
        boolean zzs;
        try {
            x8.c cVar = x8.c.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(com.google.android.gms.dynamic.d.h2(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzs = this.zzb.zzr(com.google.android.gms.dynamic.d.h2(context));
                    }
                    throw new zzdkv("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(com.google.android.gms.dynamic.d.h2(context));
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) a0.c().zza(zzbgc.zzbw)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdkv("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdkv(th2);
        }
    }

    public final void zzb(zzdbp zzdbpVar) {
        this.zzd = zzdbpVar;
    }
}
