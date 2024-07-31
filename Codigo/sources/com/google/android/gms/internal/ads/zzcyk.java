package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyk implements com.google.android.gms.ads.internal.client.a {
    private final zzcyo zza;
    private final zzfhh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyk(zzcyo zzcyoVar, zzfhh zzfhhVar) {
        this.zza = zzcyoVar;
        this.zzb = zzfhhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
