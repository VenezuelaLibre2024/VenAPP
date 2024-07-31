package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzcbm implements zzgej {
    final /* synthetic */ com.google.common.util.concurrent.f zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbm(zzcbn zzcbnVar, com.google.common.util.concurrent.f fVar) {
        this.zza = fVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        List list;
        list = zzcbn.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzcbn.zzc;
        list.remove(this.zza);
    }
}
