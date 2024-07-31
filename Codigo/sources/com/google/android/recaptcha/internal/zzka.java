package com.google.android.recaptcha.internal;

import com.facebook.ads.AdError;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzka {
    public static final zzjd zza;
    public static final zzjd zzb;
    public static final zzjd zzc;
    private static final ThreadLocal zzd;

    static {
        zzjc zzi = zzjd.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zza = (zzjd) zzi.zzj();
        zzjc zzi2 = zzjd.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzb = (zzjd) zzi2.zzj();
        zzjc zzi3 = zzjd.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
        zzc = (zzjd) zzi3.zzj();
        zzd = new zzjz();
    }

    public static zzjd zza(zzjd zzjdVar) {
        long zzg = zzjdVar.zzg();
        int zzf = zzjdVar.zzf();
        if (zzg < -62135596800L || zzg > 253402300799L || zzf < 0 || zzf >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzjdVar;
    }

    public static zzjd zzb(long j10) {
        int i10 = (int) ((j10 % 1000) * 1000000);
        long j11 = j10 / 1000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j11 = zzee.zza(j11, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (i10 < 0) {
            i10 += 1000000000;
            j11 = zzee.zzb(j11, 1L);
        }
        zzjc zzi = zzjd.zzi();
        zzi.zze(j11);
        zzi.zzd(i10);
        zzjd zzjdVar = (zzjd) zzi.zzj();
        zza(zzjdVar);
        return zzjdVar;
    }

    public static String zzc(zzjd zzjdVar) {
        zza(zzjdVar);
        long zzg = zzjdVar.zzg();
        int zzf = zzjdVar.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zzd.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb2.append(".");
            sb2.append(zzf % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / 1000000)) : zzf % AdError.NETWORK_ERROR_CODE == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / AdError.NETWORK_ERROR_CODE)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf)));
        }
        sb2.append("Z");
        return sb2.toString();
    }
}
