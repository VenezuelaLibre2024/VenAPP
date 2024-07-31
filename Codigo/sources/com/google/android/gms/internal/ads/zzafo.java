package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafo extends zzadj {
    final /* synthetic */ zzadu zza;
    final /* synthetic */ zzafp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafo(zzafp zzafpVar, zzadu zzaduVar, zzadu zzaduVar2) {
        super(zzaduVar);
        this.zza = zzaduVar2;
        this.zzb = zzafpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadj, com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        long j11;
        long j12;
        zzads zzg = this.zza.zzg(j10);
        zzadv zzadvVar = zzg.zza;
        long j13 = zzadvVar.zzc;
        j11 = this.zzb.zzb;
        zzadv zzadvVar2 = new zzadv(zzadvVar.zzb, j13 + j11);
        zzadv zzadvVar3 = zzg.zzb;
        long j14 = zzadvVar3.zzc;
        j12 = this.zzb.zzb;
        return new zzads(zzadvVar2, new zzadv(zzadvVar3.zzb, j14 + j12));
    }
}
