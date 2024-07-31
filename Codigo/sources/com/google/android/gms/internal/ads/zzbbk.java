package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbbk implements c.b {
    final /* synthetic */ zzceu zza;
    final /* synthetic */ zzbbl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbk(zzbbl zzbblVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
        this.zzb = zzbblVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
