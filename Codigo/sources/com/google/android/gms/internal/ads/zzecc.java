package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzecc implements zzece {
    private final Map zza;
    private final zzgey zzb;
    private final zzddq zzc;

    public zzecc(Map map, zzgey zzgeyVar, zzddq zzddqVar) {
        this.zza = map;
        this.zzb = zzgeyVar;
        this.zzc = zzddqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final com.google.common.util.concurrent.f zzb(final zzbze zzbzeVar) {
        this.zzc.zzbw(zzbzeVar);
        com.google.common.util.concurrent.f zzg = zzgen.zzg(new zzead(3));
        for (String str : ((String) a0.c().zza(zzbgc.zzic)).split(",")) {
            final zzhhu zzhhuVar = (zzhhu) this.zza.get(str.trim());
            if (zzhhuVar != null) {
                zzg = zzgen.zzf(zzg, zzead.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeca
                    @Override // com.google.android.gms.internal.ads.zzgdu
                    public final com.google.common.util.concurrent.f zza(Object obj) {
                        return ((zzece) zzhhu.this.zzb()).zzb(zzbzeVar);
                    }
                }, this.zzb);
            }
        }
        zzgen.zzr(zzg, new zzecb(this), zzcep.zzf);
        return zzg;
    }
}
