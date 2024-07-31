package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
final class zzak extends zzat {
    final /* synthetic */ k zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzau zzauVar, f fVar, k kVar, LocationRequest locationRequest) {
        super(fVar);
        this.zza = kVar;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzda) bVar).zzv(new zzas(this.zza), this.zzb, zzau.zza(this));
    }
}
