package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.t0;

/* loaded from: classes2.dex */
final class zzcz extends t0 {
    private final zzcs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcz(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.location.u0
    public final void zzd(Location location) {
        this.zza.zza().c(new zzcx(this, location));
    }

    @Override // com.google.android.gms.location.u0
    public final void zze() {
        this.zza.zza().c(new zzcy(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcz zzf(k kVar) {
        this.zza.zzc(kVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg() {
        this.zza.zza().a();
    }
}
