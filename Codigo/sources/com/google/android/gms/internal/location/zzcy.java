package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;

/* loaded from: classes2.dex */
final class zzcy implements k.b {
    final /* synthetic */ zzcz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcy(zzcz zzczVar) {
        this.zza = zzczVar;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzcs zzcsVar;
        zzcsVar = this.zza.zza;
        zzcsVar.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void onNotifyListenerFailed() {
    }
}
