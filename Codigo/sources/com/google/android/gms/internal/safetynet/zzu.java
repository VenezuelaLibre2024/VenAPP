package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import xa.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzu extends zzd {
    final /* synthetic */ zzv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzg(Status status, j jVar) {
        this.zza.setResult((zzv) new zzaa(status, jVar));
    }
}
