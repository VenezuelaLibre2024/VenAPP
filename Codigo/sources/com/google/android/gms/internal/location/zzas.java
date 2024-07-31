package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;

/* loaded from: classes2.dex */
final class zzas implements zzcs {
    private k zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(k kVar) {
        this.zza = kVar;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized k zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(k kVar) {
        k kVar2 = this.zza;
        if (kVar2 != kVar) {
            kVar2.a();
            this.zza = kVar;
        }
    }
}
