package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzdft implements zzdds {
    private int zza = ((Integer) a0.c().zza(zzbgc.zzbg)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzbx(zzfgy zzfgyVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzbh)).booleanValue()) {
            try {
                this.zza = zzfgyVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
