package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import xa.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzy extends zzd {
    final /* synthetic */ zzz zza;

    public zzy(zzz zzzVar) {
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzj(Status status, b bVar) {
        this.zza.setResult((zzz) new zzac(status, bVar));
    }
}
