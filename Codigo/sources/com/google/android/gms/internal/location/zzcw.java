package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.q0;

/* loaded from: classes2.dex */
final class zzcw extends q0 {
    private final zzcs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcw(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.location.r0
    public final void zzd(LocationAvailability locationAvailability) {
        this.zza.zza().c(new zzcu(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.r0
    public final void zze(LocationResult locationResult) {
        this.zza.zza().c(new zzct(this, locationResult));
    }

    @Override // com.google.android.gms.location.r0
    public final void zzf() {
        this.zza.zza().c(new zzcv(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcw zzg(k kVar) {
        this.zza.zzc(kVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh() {
        this.zza.zza().a();
    }
}
