package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzt {
    public static final zzt zza;
    public static final zzt zzb;

    @Deprecated
    public static final zzn zzc;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    public final int zzh;
    public final int zzi;
    private int zzp;

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzc(1);
        zzrVar.zzb(2);
        zzrVar.zzd(3);
        zza = zzrVar.zzg();
        zzr zzrVar2 = new zzr();
        zzrVar2.zzc(1);
        zzrVar2.zzb(1);
        zzrVar2.zzd(2);
        zzb = zzrVar2.zzg();
        zzj = Integer.toString(0, 36);
        zzk = Integer.toString(1, 36);
        zzl = Integer.toString(2, 36);
        zzm = Integer.toString(3, 36);
        zzn = Integer.toString(4, 36);
        zzo = Integer.toString(5, 36);
        zzc = zzp.zza;
    }

    public /* synthetic */ zzt(int i10, int i11, int i12, byte[] bArr, int i13, int i14, zzs zzsVar) {
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = bArr;
        this.zzh = i13;
        this.zzi = i14;
    }

    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzg(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzh(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzi(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzt.class == obj.getClass()) {
            zzt zztVar = (zzt) obj;
            if (this.zzd == zztVar.zzd && this.zze == zztVar.zze && this.zzf == zztVar.zzf && Arrays.equals(this.zzg, zztVar.zzg) && this.zzh == zztVar.zzh && this.zzi == zztVar.zzi) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzp;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf) * 31) + Arrays.hashCode(this.zzg)) * 31) + this.zzh) * 31) + this.zzi;
        this.zzp = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i10 = this.zzh;
        String str2 = "NA";
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        int i11 = this.zzi;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        byte[] bArr = this.zzg;
        int i12 = this.zzf;
        int i13 = this.zze;
        int i14 = this.zzd;
        return "ColorInfo(" + zzh(i14) + ", " + zzg(i13) + ", " + zzi(i12) + ", " + (bArr != null) + ", " + str + ", " + str2 + ")";
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        String str;
        String format = zzf() ? String.format(Locale.US, "%s/%s/%s", zzh(this.zzd), zzg(this.zze), zzi(this.zzf)) : "NA/NA/NA";
        if (zze()) {
            str = this.zzh + "/" + this.zzi;
        } else {
            str = "NA/NA";
        }
        return format + "/" + str;
    }

    public final boolean zze() {
        return (this.zzh == -1 || this.zzi == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
