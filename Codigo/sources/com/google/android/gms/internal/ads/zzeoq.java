package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public final class zzeoq implements com.google.android.gms.ads.internal.f {
    private com.google.android.gms.ads.internal.f zza;

    @Override // com.google.android.gms.ads.internal.f
    public final synchronized void zza(View view) {
        com.google.android.gms.ads.internal.f fVar = this.zza;
        if (fVar != null) {
            fVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.f
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.f fVar = this.zza;
        if (fVar != null) {
            fVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.f
    public final synchronized void zzc() {
        com.google.android.gms.ads.internal.f fVar = this.zza;
        if (fVar != null) {
            fVar.zzc();
        }
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.f fVar) {
        this.zza = fVar;
    }
}
