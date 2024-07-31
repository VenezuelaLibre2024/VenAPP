package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.w1;

/* loaded from: classes2.dex */
public final class zzcbv {
    private final la.f zza;
    private final w1 zzb;
    private final zzcch zzc;

    public zzcbv(la.f fVar, w1 w1Var, zzcch zzcchVar) {
        this.zza = fVar;
        this.zzb = w1Var;
        this.zzc = zzcchVar;
    }

    public final void zza(int i10, long j10) {
        if (((Boolean) a0.c().zza(zzbgc.zzap)).booleanValue()) {
            return;
        }
        if (j10 - this.zzb.zzf() < 0) {
            u1.a("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzaq)).booleanValue()) {
            this.zzb.g(i10);
            this.zzb.n(j10);
        } else {
            this.zzb.g(-1);
            this.zzb.n(j10);
        }
    }
}
