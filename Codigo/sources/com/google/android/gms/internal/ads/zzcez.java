package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcez implements zzgej {
    final /* synthetic */ zzcfb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcez(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(1);
    }
}
