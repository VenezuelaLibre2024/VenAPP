package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaor implements zzaoq {
    private final zzacx zza;
    private final zzaea zzb;
    private final zzaot zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaor(zzacx zzacxVar, zzaea zzaeaVar, zzaot zzaotVar, String str, int i10) {
        this.zza = zzacxVar;
        this.zzb = zzaeaVar;
        this.zzc = zzaotVar;
        int i11 = zzaotVar.zzb * zzaotVar.zze;
        int i12 = zzaotVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw zzcc.zza("Expected block size: " + i13 + "; got: " + i12, null);
        }
        int i14 = zzaotVar.zzc * i13;
        int i15 = i14 * 8;
        int max = Math.max(i13, i14 / 10);
        this.zze = max;
        zzak zzakVar = new zzak();
        zzakVar.zzW(str);
        zzakVar.zzx(i15);
        zzakVar.zzR(i15);
        zzakVar.zzO(max);
        zzakVar.zzy(zzaotVar.zzb);
        zzakVar.zzX(zzaotVar.zzc);
        zzakVar.zzQ(i10);
        this.zzd = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final void zza(int i10, long j10) {
        this.zza.zzO(new zzaow(this.zzc, 1, i10, j10));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final boolean zzc(zzacv zzacvVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int zza = zzady.zza(this.zzb, zzacvVar, (int) Math.min(i11 - i10, j11), true);
            if (zza == -1) {
                j11 = 0;
            } else {
                this.zzg += zza;
                j11 -= zza;
            }
        }
        zzaot zzaotVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzaotVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long zzs = this.zzf + zzfy.zzs(this.zzh, 1000000L, zzaotVar.zzc, RoundingMode.FLOOR);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zzt(zzs, 1, i15, i16, null);
            this.zzh += i14;
            this.zzg = i16;
        }
        return j11 <= 0;
    }
}
