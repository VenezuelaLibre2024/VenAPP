package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaop implements zzaoq {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacx zzc;
    private final zzaea zzd;
    private final zzaot zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfp zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaop(zzacx zzacxVar, zzaea zzaeaVar, zzaot zzaotVar) {
        this.zzc = zzacxVar;
        this.zzd = zzaeaVar;
        this.zze = zzaotVar;
        int max = Math.max(1, zzaotVar.zzc / 10);
        this.zzi = max;
        zzfp zzfpVar = new zzfp(zzaotVar.zzf);
        zzfpVar.zzk();
        int zzk = zzfpVar.zzk();
        this.zzf = zzk;
        int i10 = zzaotVar.zzb;
        int i11 = zzaotVar.zzd;
        int i12 = (((i11 - (i10 * 4)) * 8) / (zzaotVar.zze * i10)) + 1;
        if (zzk != i12) {
            throw zzcc.zza("Expected frames per block: " + i12 + "; got: " + zzk, null);
        }
        int i13 = zzfy.zza;
        int i14 = ((max + zzk) - 1) / zzk;
        this.zzg = new byte[i11 * i14];
        this.zzh = new zzfp(i14 * (zzk + zzk) * i10);
        int i15 = ((zzaotVar.zzc * zzaotVar.zzd) * 8) / zzk;
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/raw");
        zzakVar.zzx(i15);
        zzakVar.zzR(i15);
        zzakVar.zzO((max + max) * i10);
        zzakVar.zzy(zzaotVar.zzb);
        zzakVar.zzX(zzaotVar.zzc);
        zzakVar.zzQ(2);
        this.zzj = zzakVar.zzac();
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzs = this.zzl + zzfy.zzs(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i10);
        this.zzd.zzt(zzs, 1, zze, this.zzm - zze, null);
        this.zzn += i10;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final void zza(int i10, long j10) {
        this.zzc.zzO(new zzaow(this.zze, this.zzf, i10, j10));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzacv r21, long r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaop.zzc(com.google.android.gms.internal.ads.zzacv, long):boolean");
    }
}
