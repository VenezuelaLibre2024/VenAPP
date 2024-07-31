package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.m;

/* loaded from: classes2.dex */
final class zzcu implements k.b {
    final /* synthetic */ LocationAvailability zza;

    public zzcu(zzcw zzcwVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((m) obj).onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void onNotifyListenerFailed() {
    }
}
