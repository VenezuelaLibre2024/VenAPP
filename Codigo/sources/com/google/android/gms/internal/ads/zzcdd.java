package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdd {
    final /* synthetic */ zzcde zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzcdd(zzcde zzcdeVar) {
        this.zza = zzcdeVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        la.f fVar;
        fVar = this.zza.zza;
        this.zzc = fVar.b();
    }

    public final void zzd() {
        la.f fVar;
        fVar = this.zza.zza;
        this.zzb = fVar.b();
    }
}
