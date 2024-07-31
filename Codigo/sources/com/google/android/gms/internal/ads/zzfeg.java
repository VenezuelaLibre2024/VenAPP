package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzfeg implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzfeg(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza */
    public final zzfed zzb() {
        Context context = (Context) this.zza.zzb();
        zzfir zzfirVar = (zzfir) this.zzb.zzb();
        zzfjj zzfjjVar = (zzfjj) this.zzc.zzb();
        zzcdf zzh = ((Boolean) a0.c().zza(zzbgc.zzgr)).booleanValue() ? t.q().zzi().zzh() : t.q().zzi().zzi();
        boolean z10 = false;
        if (zzh != null && zzh.zzh()) {
            z10 = true;
        }
        if (((Integer) a0.c().zza(zzbgc.zzgt)).intValue() > 0) {
            if (!((Boolean) a0.c().zza(zzbgc.zzgq)).booleanValue() || z10) {
                zzfji zza = zzfjjVar.zza(zzfiz.Rewarded, context, zzfirVar, new zzfdh(new zzfde()));
                zzfdt zzfdtVar = new zzfdt(new zzfds());
                zzfiv zzfivVar = zza.zza;
                zzgey zzgeyVar = zzcep.zza;
                return new zzfdj(zzfdtVar, new zzfdp(zzfivVar, zzgeyVar), zza.zzb, zza.zza.zza().zzf, zzgeyVar);
            }
        }
        return new zzfds();
    }
}
