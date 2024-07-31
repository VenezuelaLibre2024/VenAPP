package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.u0;

/* loaded from: classes2.dex */
final class zzbls implements Runnable {
    final /* synthetic */ y8.b zza;
    final /* synthetic */ u0 zzb;
    final /* synthetic */ zzblt zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbls(zzblt zzbltVar, y8.b bVar, u0 u0Var) {
        this.zza = bVar;
        this.zzb = u0Var;
        this.zzc = zzbltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.g(this.zzb)) {
            zzblt.zzc(this.zzc);
            throw null;
        }
        zzcec.zzj("Could not bind.");
    }
}
