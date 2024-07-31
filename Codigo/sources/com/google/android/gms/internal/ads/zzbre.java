package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbre implements zzcey {
    final /* synthetic */ zzbrd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbre(zzbri zzbriVar, zzbrd zzbrdVar) {
        this.zza = zzbrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        u1.a("Getting a new session for JS Engine.");
        this.zza.zzh(((zzbqe) obj).zzj());
    }
}
