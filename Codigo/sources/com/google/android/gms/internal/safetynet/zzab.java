package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import xa.l;

/* loaded from: classes2.dex */
final class zzab implements n {
    private final Status zza;
    private final l zzb;

    public zzab(Status status, l lVar) {
        this.zza = status;
        this.zzb = lVar;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }

    public final String getTokenResult() {
        l lVar = this.zzb;
        if (lVar == null) {
            return null;
        }
        return lVar.zza();
    }
}
