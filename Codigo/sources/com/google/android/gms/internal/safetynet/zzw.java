package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import xa.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzw extends zzd {
    final /* synthetic */ zzx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(zzx zzxVar) {
        this.zza = zzxVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzh(Status status, l lVar) {
        this.zza.setResult((zzx) new zzab(status, lVar));
    }
}
