package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import xa.e;
import xa.g;

/* loaded from: classes2.dex */
final class zzp implements e.b {
    private final Status zza;
    private final g zzb;

    public zzp(Status status, g gVar) {
        this.zza = status;
        this.zzb = gVar;
    }

    @Override // xa.e.b
    public final String getJwsResult() {
        g gVar = this.zzb;
        if (gVar == null) {
            return null;
        }
        return gVar.zza();
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }
}
