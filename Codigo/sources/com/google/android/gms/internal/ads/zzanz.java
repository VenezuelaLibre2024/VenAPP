package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzanz {
    private final List zza;
    private final zzaea[] zzb;

    public zzanz(List list) {
        this.zza = list;
        this.zzb = new zzaea[list.size()];
    }

    public final void zza(long j10, zzfp zzfpVar) {
        zzach.zza(j10, zzfpVar, this.zzb);
    }

    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzaokVar.zzc();
            zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i10);
            String str = zzamVar.zzm;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzek.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String str2 = zzamVar.zzb;
            if (str2 == null) {
                str2 = zzaokVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzK(str2);
            zzakVar.zzW(str);
            zzakVar.zzY(zzamVar.zze);
            zzakVar.zzN(zzamVar.zzd);
            zzakVar.zzw(zzamVar.zzE);
            zzakVar.zzL(zzamVar.zzo);
            zzw.zzl(zzakVar.zzac());
            this.zzb[i10] = zzw;
        }
    }
}
