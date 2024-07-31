package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
final class zzajr implements zzadu {
    final /* synthetic */ zzajs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzajr(zzajs zzajsVar, zzajq zzajqVar) {
        this.zza = zzajsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        zzake zzakeVar;
        long j10;
        zzajs zzajsVar = this.zza;
        zzakeVar = zzajsVar.zzd;
        j10 = zzajsVar.zzf;
        return zzakeVar.zzf(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        zzake zzakeVar;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        zzajs zzajsVar = this.zza;
        zzakeVar = zzajsVar.zzd;
        long zzg = zzakeVar.zzg(j10);
        j11 = zzajsVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzajs zzajsVar2 = this.zza;
        j12 = zzajsVar2.zzc;
        j13 = zzajsVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j12 - j13));
        j14 = this.zza.zzf;
        long longValue = j11 + multiply.divide(BigInteger.valueOf(j14)).longValue();
        zzajs zzajsVar3 = this.zza;
        j15 = zzajsVar3.zzb;
        j16 = zzajsVar3.zzc;
        zzadv zzadvVar = new zzadv(j10, Math.max(j15, Math.min(longValue - 30000, j16 - 1)));
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
