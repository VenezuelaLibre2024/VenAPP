package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbrb implements zzcey {
    final /* synthetic */ zzbrd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrb(zzbrd zzbrdVar) {
        this.zza = zzbrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbri zzbriVar;
        u1.a("Releasing engine reference.");
        zzbriVar = this.zza.zzb;
        zzbriVar.zzd();
    }
}
