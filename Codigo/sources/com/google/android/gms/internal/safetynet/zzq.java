package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import xa.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzq extends zzd {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzd(Status status, g gVar) {
        this.zza.setResult((zzr) new zzp(status, gVar));
    }
}
