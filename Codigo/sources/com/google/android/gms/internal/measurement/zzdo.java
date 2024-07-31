package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdo extends zzdf.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzdf zzdfVar, Boolean bool) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    final void zza() {
        zzcu zzcuVar;
        zzcu zzcuVar2;
        if (this.zzc != null) {
            zzcuVar2 = this.zzd.zzj;
            ((zzcu) s.j(zzcuVar2)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzcuVar = this.zzd.zzj;
            ((zzcu) s.j(zzcuVar)).clearMeasurementEnabled(this.zza);
        }
    }
}
