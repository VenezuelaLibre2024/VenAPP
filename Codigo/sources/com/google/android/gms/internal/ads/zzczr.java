package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.v;

/* loaded from: classes2.dex */
public final class zzczr implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzczr(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzcei zza = ((zzcly) this.zzb).zza();
        final zzfhh zza2 = ((zzdao) this.zzc).zza();
        return new zzfws() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                zzfgm zzfgmVar = (zzfgm) obj;
                v vVar = new v(context);
                vVar.p(zzfgmVar.zzC);
                vVar.q(zzfgmVar.zzD.toString());
                vVar.o(zza.zza);
                vVar.n(zza2.zzf);
                return vVar;
            }
        };
    }
}
