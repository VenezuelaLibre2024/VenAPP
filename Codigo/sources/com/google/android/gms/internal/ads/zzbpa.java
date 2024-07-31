package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpa implements c.a {
    final /* synthetic */ zzceu zza;
    final /* synthetic */ zzbpc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpa(zzbpc zzbpcVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
        this.zzb = zzbpcVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        zzbop zzbopVar;
        try {
            zzceu zzceuVar = this.zza;
            zzbopVar = this.zzb.zza;
            zzceuVar.zzc(zzbopVar.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
