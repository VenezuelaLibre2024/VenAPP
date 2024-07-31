package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.n;

/* loaded from: classes2.dex */
final class zzcx implements k.b {
    final /* synthetic */ Location zza;

    public zzcx(zzcz zzczVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((n) obj).onLocationChanged(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void onNotifyListenerFailed() {
    }
}
