package com.google.android.gms.internal.ads;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzadh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzadg zzk;
    private final zzby zzl;

    private zzadh(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzadg zzadgVar, zzby zzbyVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzadgVar;
        this.zzl = zzbyVar;
    }

    public zzadh(byte[] bArr, int i10) {
        zzfo zzfoVar = new zzfo(bArr, bArr.length);
        zzfoVar.zzk(i10 * 8);
        this.zza = zzfoVar.zzd(16);
        this.zzb = zzfoVar.zzd(16);
        this.zzc = zzfoVar.zzd(24);
        this.zzd = zzfoVar.zzd(24);
        int zzd = zzfoVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzfoVar.zzd(3) + 1;
        int zzd2 = zzfoVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        int zzd3 = zzfoVar.zzd(4);
        int zzd4 = zzfoVar.zzd(32);
        int i11 = zzfy.zza;
        this.zzj = ((zzd3 & KeyboardMap.kValueMask) << 32) | (zzd4 & KeyboardMap.kValueMask);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.zze;
    }

    public final long zzb(long j10) {
        return Math.max(0L, Math.min((j10 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzam zzc(byte[] bArr, zzby zzbyVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzby zzd = zzd(zzbyVar);
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzakVar.zzO(i10);
        zzakVar.zzy(this.zzg);
        zzakVar.zzX(this.zze);
        zzakVar.zzQ(zzfy.zzk(this.zzh));
        zzakVar.zzL(Collections.singletonList(bArr));
        zzakVar.zzP(zzd);
        return zzakVar.zzac();
    }

    public final zzby zzd(zzby zzbyVar) {
        zzby zzbyVar2 = this.zzl;
        return zzbyVar2 == null ? zzbyVar : zzbyVar2.zzd(zzbyVar);
    }

    public final zzadh zze(List list) {
        return new zzadh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzby(list)));
    }

    public final zzadh zzf(zzadg zzadgVar) {
        return new zzadh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadgVar, this.zzl);
    }

    public final zzadh zzg(List list) {
        return new zzadh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaeg.zzb(list)));
    }
}
