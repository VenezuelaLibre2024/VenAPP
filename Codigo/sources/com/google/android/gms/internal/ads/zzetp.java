package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzetp {
    public final com.google.common.util.concurrent.f zza;
    private final long zzb;
    private final la.f zzc;

    public zzetp(com.google.common.util.concurrent.f fVar, long j10, la.f fVar2) {
        this.zza = fVar;
        this.zzc = fVar2;
        this.zzb = fVar2.b() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.b();
    }
}
