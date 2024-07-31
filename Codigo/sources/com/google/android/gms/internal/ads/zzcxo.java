package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcxo implements zzgej {
    final /* synthetic */ zzcxp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxo(zzcxp zzcxpVar) {
        this.zza = zzcxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzdgc zzdgcVar;
        zzdgcVar = this.zza.zzf;
        zzdgcVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdgc zzdgcVar;
        zzdgcVar = this.zza.zzf;
        zzdgcVar.zzl(true);
    }
}
