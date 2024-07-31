package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzauy implements zzfru {
    final /* synthetic */ zzfqr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauy(zzfqr zzfqrVar) {
        this.zza = zzfqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zza(int i10, long j10) {
        this.zza.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zzb(int i10, long j10, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
