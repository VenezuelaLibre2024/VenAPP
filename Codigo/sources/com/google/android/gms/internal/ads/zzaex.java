package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaex implements zzacf {
    private final zzadh zza;
    private final int zzb;
    private final zzadc zzc = new zzadc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaex(zzadh zzadhVar, int i10, zzaew zzaewVar) {
        this.zza = zzadhVar;
        this.zzb = i10;
    }

    private final long zzc(zzacv zzacvVar) {
        while (zzacvVar.zze() < zzacvVar.zzd() - 6) {
            zzadh zzadhVar = this.zza;
            int i10 = this.zzb;
            zzadc zzadcVar = this.zzc;
            long zze = zzacvVar.zze();
            byte[] bArr = new byte[2];
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzacvVar.zzj();
                zzackVar.zzl((int) (zze - zzacvVar.zzf()), false);
            } else {
                zzfp zzfpVar = new zzfp(16);
                System.arraycopy(bArr, 0, zzfpVar.zzM(), 0, 2);
                zzfpVar.zzJ(zzacy.zza(zzacvVar, zzfpVar.zzM(), 2, 14));
                zzacvVar.zzj();
                zzackVar.zzl((int) (zze - zzacvVar.zzf()), false);
                if (zzadd.zzc(zzfpVar, zzadhVar, i10, zzadcVar)) {
                    break;
                }
            }
            zzackVar.zzl(1, false);
        }
        if (zzacvVar.zze() < zzacvVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzack) zzacvVar).zzl((int) (zzacvVar.zzd() - zzacvVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j10) {
        int i10 = this.zza.zzc;
        long zzf = zzacvVar.zzf();
        long zzc = zzc(zzacvVar);
        long zze = zzacvVar.zze();
        ((zzack) zzacvVar).zzl(Math.max(6, i10), false);
        long zzc2 = zzc(zzacvVar);
        return (zzc > j10 || zzc2 <= j10) ? zzc2 <= j10 ? zzace.zzf(zzc2, zzacvVar.zze()) : zzace.zzd(zzc, zzf) : zzace.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final /* synthetic */ void zzb() {
    }
}
