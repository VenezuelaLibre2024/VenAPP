package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.m;

/* loaded from: classes2.dex */
final class zzct implements k.b {
    final /* synthetic */ LocationResult zza;

    public zzct(zzcw zzcwVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((m) obj).onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void onNotifyListenerFailed() {
    }
}
