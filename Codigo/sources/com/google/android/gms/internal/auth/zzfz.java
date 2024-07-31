package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i10, int i11, zzfw zzfwVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        long zzv = zzv(i10) & 1048575;
        if (zzG(obj2, i10)) {
            Object zzf = zzhi.zzf(obj, zzv);
            Object zzf2 = zzhi.zzf(obj2, zzv);
            if (zzf != null && zzf2 != null) {
                zzf2 = zzez.zzg(zzf, zzf2);
            } else if (zzf2 == null) {
                return;
            }
            zzhi.zzp(obj, zzv, zzf2);
            zzD(obj, i10);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int zzv = zzv(i10);
        int i11 = this.zzc[i10];
        long j10 = zzv & 1048575;
        if (zzJ(obj2, i11, i10)) {
            Object zzf = zzJ(obj, i11, i10) ? zzhi.zzf(obj, j10) : null;
            Object zzf2 = zzhi.zzf(obj2, j10);
            if (zzf != null && zzf2 != null) {
                zzf2 = zzez.zzg(zzf, zzf2);
            } else if (zzf2 == null) {
                return;
            }
            zzhi.zzp(obj, j10, zzf2);
            zzE(obj, i11, i10);
        }
    }

    private final void zzD(Object obj, int i10) {
        int zzs = zzs(i10);
        long j10 = 1048575 & zzs;
        if (j10 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j10, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzhi.zzn(obj, zzs(i11) & 1048575, i10);
    }

    private final boolean zzF(Object obj, Object obj2, int i10) {
        return zzG(obj, i10) == zzG(obj2, i10);
    }

    private final boolean zzG(Object obj, int i10) {
        int zzs = zzs(i10);
        long j10 = zzs & 1048575;
        if (j10 != 1048575) {
            return (zzhi.zzc(obj, j10) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i10);
        long j11 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j11)) != 0;
            case 2:
                return zzhi.zzd(obj, j11) != 0;
            case 3:
                return zzhi.zzd(obj, j11) != 0;
            case 4:
                return zzhi.zzc(obj, j11) != 0;
            case 5:
                return zzhi.zzd(obj, j11) != 0;
            case 6:
                return zzhi.zzc(obj, j11) != 0;
            case 7:
                return zzhi.zzt(obj, j11);
            case 8:
                Object zzf = zzhi.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzee) {
                    return !zzee.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j11) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j11));
            case 11:
                return zzhi.zzc(obj, j11) != 0;
            case 12:
                return zzhi.zzc(obj, j11) != 0;
            case 13:
                return zzhi.zzc(obj, j11) != 0;
            case 14:
                return zzhi.zzd(obj, j11) != 0;
            case 15:
                return zzhi.zzc(obj, j11) != 0;
            case 16:
                return zzhi.zzd(obj, j11) != 0;
            case 17:
                return zzhi.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzG(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzI(Object obj, int i10, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i10 & 1048575));
    }

    private final boolean zzJ(Object obj, int i10, int i11) {
        return zzhi.zzc(obj, (long) (zzs(i11) & 1048575)) == i10;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzc = zzgz.zzc();
        zzeuVar.zzc = zzc;
        return zzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzhi.zzf(obj, j10)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int zzn(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzds zzdsVar) {
        int zzm;
        long j11;
        int i18;
        Object valueOf;
        int zzj;
        Object obj2;
        Unsafe unsafe = zzb;
        long j12 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i10))));
                    unsafe.putInt(obj, j12, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i10))));
                    unsafe.putInt(obj, j12, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    zzm = zzdt.zzm(bArr, i10, zzdsVar);
                    j11 = zzdsVar.zzb;
                    valueOf = Long.valueOf(j11);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j12, i13);
                    return zzm;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    zzm = zzdt.zzj(bArr, i10, zzdsVar);
                    i18 = zzdsVar.zza;
                    valueOf = Integer.valueOf(i18);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j12, i13);
                    return zzm;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzdt.zzn(bArr, i10)));
                    unsafe.putInt(obj, j12, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzdt.zzb(bArr, i10)));
                    unsafe.putInt(obj, j12, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    zzm = zzdt.zzm(bArr, i10, zzdsVar);
                    valueOf = Boolean.valueOf(zzdsVar.zzb != 0);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j12, i13);
                    return zzm;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    zzj = zzdt.zzj(bArr, i10, zzdsVar);
                    int i19 = zzdsVar.zza;
                    if (i19 == 0) {
                        obj2 = "";
                        unsafe.putObject(obj, j10, obj2);
                        unsafe.putInt(obj, j12, i13);
                        return zzj;
                    }
                    if ((i15 & 536870912) != 0 && !zzhm.zzd(bArr, zzj, zzj + i19)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, zzj, i19, zzez.zzb));
                    zzj += i19;
                    unsafe.putInt(obj, j12, i13);
                    return zzj;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    zzj = zzdt.zzd(zzy(i17), bArr, i10, i11, zzdsVar);
                    Object object = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    obj2 = zzdsVar.zzc;
                    if (object != null) {
                        obj2 = zzez.zzg(object, obj2);
                    }
                    unsafe.putObject(obj, j10, obj2);
                    unsafe.putInt(obj, j12, i13);
                    return zzj;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    zzm = zzdt.zza(bArr, i10, zzdsVar);
                    valueOf = zzdsVar.zzc;
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j12, i13);
                    return zzm;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int zzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i20 = zzdsVar.zza;
                    zzex zzx = zzx(i17);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i20));
                        unsafe.putInt(obj, j12, i13);
                    } else {
                        zzc(obj).zzf(i12, Long.valueOf(i20));
                    }
                    return zzj2;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    zzm = zzdt.zzj(bArr, i10, zzdsVar);
                    i18 = zzei.zzb(zzdsVar.zza);
                    valueOf = Integer.valueOf(i18);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j12, i13);
                    return zzm;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    zzm = zzdt.zzm(bArr, i10, zzdsVar);
                    j11 = zzei.zzc(zzdsVar.zzb);
                    valueOf = Long.valueOf(j11);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j12, i13);
                    return zzm;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    zzj = zzdt.zzc(zzy(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j12) == i13 ? unsafe.getObject(obj, j10) : null;
                    obj2 = zzdsVar.zzc;
                    if (object2 != null) {
                        obj2 = zzez.zzg(object2, obj2);
                    }
                    unsafe.putObject(obj, j10, obj2);
                    unsafe.putInt(obj, j12, i13);
                    return zzj;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0080. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) {
        byte b10;
        int i12;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzm;
        Unsafe unsafe2;
        Object obj2;
        long j10;
        long j11;
        long j12;
        int zzd;
        Object zzg;
        long j13;
        int i20;
        int i21;
        int i22;
        int i23;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i24 = i11;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe3 = zzb;
        int i25 = 1048575;
        int i26 = -1;
        int i27 = i10;
        int i28 = -1;
        int i29 = 1048575;
        int i30 = 0;
        int i31 = 0;
        while (i27 < i24) {
            int i32 = i27 + 1;
            byte b11 = bArr2[i27];
            if (b11 < 0) {
                i12 = zzdt.zzk(b11, bArr2, i32, zzdsVar2);
                b10 = zzdsVar2.zza;
            } else {
                b10 = b11;
                i12 = i32;
            }
            int i33 = b10 >>> 3;
            int i34 = b10 & 7;
            int zzr = i33 > i28 ? zzfzVar.zzr(i33, i30 / 3) : zzfzVar.zzq(i33);
            if (zzr == i26) {
                i13 = i12;
                i14 = i33;
                i15 = i26;
                unsafe = unsafe3;
                i16 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i35 = iArr[zzr + 1];
                int zzu = zzu(i35);
                long j14 = i35 & i25;
                if (zzu <= 17) {
                    int i36 = iArr[zzr + 2];
                    int i37 = 1 << (i36 >>> 20);
                    int i38 = i36 & 1048575;
                    if (i38 != i29) {
                        if (i29 != 1048575) {
                            unsafe3.putInt(obj3, i29, i31);
                        }
                        if (i38 != 1048575) {
                            i31 = unsafe3.getInt(obj3, i38);
                        }
                        i29 = i38;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 1) {
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj3, j14, Double.longBitsToDouble(zzdt.zzn(bArr2, i18)));
                                i27 = i18 + 8;
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 5) {
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj3, j14, Float.intBitsToFloat(zzdt.zzb(bArr2, i18)));
                                i27 = i18 + 4;
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 0) {
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzm = zzdt.zzm(bArr2, i18, zzdsVar2);
                                unsafe2 = unsafe3;
                                obj2 = obj;
                                j10 = zzdsVar2.zzb;
                                j11 = j14;
                                unsafe2.putLong(obj2, j11, j10);
                                i31 |= i37;
                                i27 = zzm;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 0) {
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                i27 = zzdt.zzj(bArr2, i18, zzdsVar2);
                                unsafe3.putInt(obj3, j14, zzdsVar2.zza);
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 1) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                i18 = i12;
                                unsafe3.putLong(obj, j14, zzdt.zzn(bArr2, i12));
                                i27 = i18 + 8;
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 5) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj3, j14, zzdt.zzb(bArr2, i12));
                                i27 = i12 + 4;
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 0) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                i27 = zzdt.zzm(bArr2, i12, zzdsVar2);
                                zzhi.zzk(obj3, j14, zzdsVar2.zzb != 0);
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 != 2) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                i27 = (536870912 & i35) == 0 ? zzdt.zzg(bArr2, i12, zzdsVar2) : zzdt.zzh(bArr2, i12, zzdsVar2);
                                unsafe3.putObject(obj3, j14, zzdsVar2.zzc);
                                i31 |= i37;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            j12 = j14;
                            i14 = i33;
                            if (i34 != 2) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzd(zzfzVar.zzy(i17), bArr2, i12, i24, zzdsVar2);
                                Object object = unsafe3.getObject(obj3, j12);
                                zzg = object == null ? zzdsVar2.zzc : zzez.zzg(object, zzdsVar2.zzc);
                                unsafe3.putObject(obj3, j12, zzg);
                                i31 |= i37;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            j12 = j14;
                            i14 = i33;
                            if (i34 != 2) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzd = zzdt.zza(bArr2, i12, zzdsVar2);
                                zzg = zzdsVar2.zzc;
                                unsafe3.putObject(obj3, j12, zzg);
                                i31 |= i37;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            j13 = j14;
                            i14 = i33;
                            if (i34 != 0) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i12, zzdsVar2);
                                i20 = zzdsVar2.zza;
                                unsafe3.putInt(obj3, j13, i20);
                                i31 |= i37;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i17 = zzr;
                            i19 = 1048575;
                            j13 = j14;
                            i14 = i33;
                            if (i34 != 0) {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i12, zzdsVar2);
                                i20 = zzei.zzb(zzdsVar2.zza);
                                unsafe3.putInt(obj3, j13, i20);
                                i31 |= i37;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        case 16:
                            if (i34 != 0) {
                                i14 = i33;
                                i17 = zzr;
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe3;
                                i16 = i17;
                                i15 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i12, zzdsVar2);
                                j10 = zzei.zzc(zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj;
                                i17 = zzr;
                                j11 = j14;
                                i14 = i33;
                                i19 = 1048575;
                                unsafe2.putLong(obj2, j11, j10);
                                i31 |= i37;
                                i27 = zzm;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            }
                        default:
                            i14 = i33;
                            i17 = zzr;
                            i18 = i12;
                            i13 = i18;
                            unsafe = unsafe3;
                            i16 = i17;
                            i15 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i17 = zzr;
                    int i39 = i12;
                    i19 = 1048575;
                    i14 = i33;
                    if (zzu == 27) {
                        if (i34 == 2) {
                            zzey zzeyVar = (zzey) unsafe3.getObject(obj3, j14);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe3.putObject(obj3, j14, zzeyVar);
                            }
                            i27 = zzdt.zze(zzfzVar.zzy(i17), b10, bArr, i39, i11, zzeyVar, zzdsVar);
                            i31 = i31;
                            i30 = i17;
                            i28 = i14;
                            i25 = i19;
                            i26 = -1;
                        } else {
                            i21 = i39;
                            i22 = i31;
                            i23 = i29;
                            unsafe = unsafe3;
                            i16 = i17;
                            i15 = -1;
                        }
                    } else if (zzu <= 49) {
                        i22 = i31;
                        i23 = i29;
                        i15 = -1;
                        unsafe = unsafe3;
                        i16 = i17;
                        i27 = zzp(obj, bArr, i39, i11, b10, i14, i34, i17, i35, zzu, j14, zzdsVar);
                        if (i27 != i39) {
                            obj3 = obj;
                            bArr2 = bArr;
                            i24 = i11;
                            zzdsVar2 = zzdsVar;
                            i29 = i23;
                            i26 = i15;
                            i28 = i14;
                            i31 = i22;
                            i30 = i16;
                            unsafe3 = unsafe;
                            i25 = 1048575;
                            zzfzVar = this;
                        } else {
                            i13 = i27;
                            i29 = i23;
                            i31 = i22;
                        }
                    } else {
                        i21 = i39;
                        i22 = i31;
                        i23 = i29;
                        unsafe = unsafe3;
                        i16 = i17;
                        i15 = -1;
                        if (zzu != 50) {
                            i27 = zzn(obj, bArr, i21, i11, b10, i14, i34, i35, zzu, j14, i16, zzdsVar);
                            if (i27 != i21) {
                                obj3 = obj;
                                bArr2 = bArr;
                                i24 = i11;
                                zzdsVar2 = zzdsVar;
                                i29 = i23;
                                i26 = i15;
                                i28 = i14;
                                i31 = i22;
                                i30 = i16;
                                unsafe3 = unsafe;
                                i25 = 1048575;
                                zzfzVar = this;
                            } else {
                                i13 = i27;
                                i29 = i23;
                                i31 = i22;
                            }
                        } else if (i34 == 2) {
                            i27 = zzm(obj, bArr, i21, i11, i16, j14, zzdsVar);
                            if (i27 != i21) {
                                obj3 = obj;
                                bArr2 = bArr;
                                i24 = i11;
                                zzdsVar2 = zzdsVar;
                                i29 = i23;
                                i26 = i15;
                                i28 = i14;
                                i31 = i22;
                                i30 = i16;
                                unsafe3 = unsafe;
                                i25 = 1048575;
                                zzfzVar = this;
                            } else {
                                i13 = i27;
                                i29 = i23;
                                i31 = i22;
                            }
                        }
                    }
                    i13 = i21;
                    i29 = i23;
                    i31 = i22;
                }
            }
            i27 = zzdt.zzi(b10, bArr, i13, i11, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj3 = obj;
            bArr2 = bArr;
            i24 = i11;
            zzdsVar2 = zzdsVar;
            i26 = i15;
            i28 = i14;
            i30 = i16;
            unsafe3 = unsafe;
            i25 = 1048575;
        }
        int i40 = i31;
        int i41 = i29;
        Unsafe unsafe4 = unsafe3;
        if (i41 != i25) {
            unsafe4.putInt(obj, i41, i40);
        }
        if (i27 == i11) {
            return i27;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0156, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0132, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzk(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0258, code lost:
    
        if (r29.zzb != 0) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x025a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x025d, code lost:
    
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0260, code lost:
    
        if (r4 >= r19) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0262, code lost:
    
        r6 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0268, code lost:
    
        if (r20 == r29.zza) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x026b, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzdt.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0273, code lost:
    
        if (r29.zzb == 0) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x025c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0276, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x025d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
    
        if (r4 == 0) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0124, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0132, code lost:
    
        if (r1 >= r19) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
    
        if (r20 == r29.zza) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        r1 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r4 < 0) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        if (r4 > (r17.length - r1)) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0149, code lost:
    
        if (r4 != 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012a, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzk(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0150, code lost:
    
        throw com.google.android.gms.internal.auth.zzfa.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0155, code lost:
    
        throw com.google.android.gms.internal.auth.zzfa.zzc();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01b4 -> B:96:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01fc -> B:113:0x01d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0273 -> B:150:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0149 -> B:68:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzp(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzds r29) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzds):int");
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, 0);
    }

    private final int zzr(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, i11);
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzt(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzw(Object obj, long j10) {
        return ((Long) zzhi.zzf(obj, j10)).longValue();
    }

    private final zzex zzx(int i10) {
        int i11 = i10 / 3;
        return (zzex) this.zzd[i11 + i11 + 1];
    }

    private final zzgh zzy(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgh zzghVar = (zzgh) this.zzd[i12];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00da, code lost:
    
        if (r3 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ee, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ec, code lost:
    
        if (r3 != null) goto L172;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0325, code lost:
    
        if (r0 != r20) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0327, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r2 = r19;
        r3 = r21;
        r5 = r22;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x033f, code lost:
    
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0362, code lost:
    
        if (r0 != r15) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0388, code lost:
    
        if (r0 != r15) goto L322;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x008c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.auth.zzds r35) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i10;
        int i11 = this.zzj;
        while (true) {
            i10 = this.zzk;
            if (i11 >= i10) {
                break;
            }
            long zzv = zzv(this.zzi[i11]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i11++;
        }
        int length = this.zzi.length;
        while (i10 < length) {
            this.zzl.zza(obj, this.zzi[i10]);
            i10++;
        }
        this.zzm.zze(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzv = zzv(i10);
            long j10 = 1048575 & zzv;
            int i11 = this.zzc[i10];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i10)) {
                        zzhi.zzl(obj, j10, zzhi.zza(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i10)) {
                        zzhi.zzm(obj, j10, zzhi.zzb(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 3:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 4:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 5:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 6:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 7:
                    if (zzG(obj2, i10)) {
                        zzhi.zzk(obj, j10, zzhi.zzt(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 9:
                case 17:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 11:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 12:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 13:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 14:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 15:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 16:
                    if (!zzG(obj2, i10)) {
                        break;
                    }
                    zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                    zzD(obj, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzJ(obj2, i11, i10)) {
                        break;
                    }
                    zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                    zzE(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzJ(obj2, i11, i10)) {
                        break;
                    }
                    zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                    zzE(obj, i11, i10);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) {
        if (this.zzh) {
            zzo(obj, bArr, i10, i11, zzdsVar);
        } else {
            zzb(obj, bArr, i10, i11, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzv = zzv(i10);
            long j10 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i10) && Double.doubleToLongBits(zzhi.zza(obj, j10)) == Double.doubleToLongBits(zzhi.zza(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i10) && Float.floatToIntBits(zzhi.zzb(obj, j10)) == Float.floatToIntBits(zzhi.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i10) && zzhi.zzt(obj, j10) == zzhi.zzt(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i10) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzs = zzs(i10) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
            int i16 = this.zzc[i15];
            int zzv = zzv(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzv) != 0 && !zzH(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj, i16, i15) && !zzI(obj, zzv, zzy(i15))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzy.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj, i15, i10, i11, i19) && !zzI(obj, zzv, zzy(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return true;
    }
}
