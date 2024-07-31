package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import xa.e;

/* loaded from: classes2.dex */
public final class zzad implements e.d {
    private Status zza;
    private boolean zzb;

    public zzad() {
    }

    public zzad(Status status, boolean z10) {
        this.zza = status;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.common.api.n
    public final Status getStatus() {
        return this.zza;
    }

    @Override // xa.e.d
    public final boolean isVerifyAppsEnabled() {
        Status status = this.zza;
        if (status == null || !status.y1()) {
            return false;
        }
        return this.zzb;
    }
}
