package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzdf;

/* loaded from: classes2.dex */
final class zzee extends zzdf.zza {
    private final /* synthetic */ zzdf.zzc zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdf zzdfVar, zzdf.zzc zzcVar) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzd.zzj;
        ((zzcu) s.j(zzcuVar)).setEventInterceptor(this.zzc);
    }
}
