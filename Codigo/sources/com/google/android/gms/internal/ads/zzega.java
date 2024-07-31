package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.util.w1;

/* loaded from: classes2.dex */
public final class zzega implements zzdcl, zzdba {
    private static final Object zza = new Object();
    private static int zzb;
    private final w1 zzc;
    private final zzegk zzd;

    public zzega(zzegk zzegkVar, w1 w1Var) {
        this.zzd = zzegkVar;
        this.zzc = w1Var;
    }

    private final void zzb(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue() && !this.zzc.zzQ()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                intValue = ((Integer) a0.c().zza(zzbgc.zzgk)).intValue();
            }
            if (i10 < intValue) {
                this.zzd.zzd(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        zzb(true);
    }
}
