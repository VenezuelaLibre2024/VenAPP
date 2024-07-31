package com.google.android.gms.internal.p498firebaseauthapi;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class zzanc {
    private static final zzamb zza = (zzamb) ((zzajc) zzamb.zzc().zza(-62135596800L).zza(0).zzf());
    private static final zzamb zzb = (zzamb) ((zzajc) zzamb.zzc().zza(253402300799L).zza(999999999).zzf());
    private static final zzamb zzc = (zzamb) ((zzajc) zzamb.zzc().zza(0L).zza(0).zzf());
    private static final ThreadLocal<SimpleDateFormat> zzd = new zzane();
    private static final Method zze = zzc("now");
    private static final Method zzf = zzc("getEpochSecond");
    private static final Method zzg = zzc("getNano");

    public static long zza(zzamb zzambVar) {
        return zzb(zzambVar).zzb();
    }

    public static zzamb zza(String str) {
        String str2;
        int i10;
        int indexOf = str.indexOf(84);
        if (indexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int indexOf2 = str.indexOf(90, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(43, indexOf);
        }
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(45, indexOf);
        }
        if (indexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String substring = str.substring(0, indexOf2);
        int indexOf3 = substring.indexOf(46);
        if (indexOf3 != -1) {
            String substring2 = substring.substring(0, indexOf3);
            str2 = substring.substring(indexOf3 + 1);
            substring = substring2;
        } else {
            str2 = "";
        }
        long time = zzd.get().parse(substring).getTime() / 1000;
        if (str2.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            for (int i11 = 0; i11 < 9; i11++) {
                i10 *= 10;
                if (i11 < str2.length()) {
                    if (str2.charAt(i11) < '0' || str2.charAt(i11) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i10 += str2.charAt(i11) - '0';
                }
            }
        }
        if (str.charAt(indexOf2) != 'Z') {
            long zzb2 = zzb(str.substring(indexOf2 + 1));
            time = str.charAt(indexOf2) == '+' ? time - zzb2 : time + zzb2;
        } else if (str.length() != indexOf2 + 1) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(indexOf2) + "\"", 0);
        }
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            try {
                time = zzbe.zza(time, i10 / 1000000000);
                i10 %= 1000000000;
            } catch (IllegalArgumentException e10) {
                ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
                parseException.initCause(e10);
                throw parseException;
            }
        }
        if (i10 < 0) {
            i10 += 1000000000;
            time = zzbe.zzb(time, 1L);
        }
        return zzb((zzamb) ((zzajc) zzamb.zzc().zza(time).zza(i10).zzf()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    private static long zzb(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        } catch (NumberFormatException e10) {
            ParseException parseException = new ParseException("Invalid offset value: " + str, 0);
            parseException.initCause(e10);
            throw parseException;
        }
    }

    private static zzamb zzb(zzamb zzambVar) {
        long zzb2 = zzambVar.zzb();
        int zza2 = zzambVar.zza();
        if (zzb2 >= -62135596800L && zzb2 <= 253402300799L && zza2 >= 0 && zza2 < 1000000000) {
            return zzambVar;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzb2), Integer.valueOf(zza2)));
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
