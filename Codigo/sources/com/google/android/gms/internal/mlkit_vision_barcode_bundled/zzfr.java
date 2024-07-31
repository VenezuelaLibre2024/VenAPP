package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.api.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class zzfr<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfo zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfc zzl;
    private final zzgy zzm;
    private final zzdp zzn;
    private final int zzo;
    private final zzfu zzp;
    private final zzfj zzq;

    private zzfr(int[] iArr, Object[] objArr, int i10, int i11, zzfo zzfoVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzfu zzfuVar, zzfc zzfcVar, zzgy zzgyVar, zzdp zzdpVar, zzfj zzfjVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzo = i12;
        boolean z11 = false;
        if (zzdpVar != null && zzdpVar.zzg(zzfoVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzp = zzfuVar;
        this.zzl = zzfcVar;
        this.zzm = zzgyVar;
        this.zzn = zzdpVar;
        this.zzg = zzfoVar;
        this.zzq = zzfjVar;
    }

    private final zzeh zzA(int i10) {
        int i11 = i10 / 3;
        return (zzeh) this.zzd[i11 + i11 + 1];
    }

    private final zzgh zzB(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgh zzghVar = (zzgh) this.zzd[i12];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzfx.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzD(Object obj, int i10) {
        zzgh zzB = zzB(i10);
        int zzy = zzy(i10) & 1048575;
        if (!zzP(obj, i10)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i10, int i11) {
        zzgh zzB = zzB(i11);
        if (!zzT(obj, i10, i11)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i11) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        if (zzP(obj2, i10)) {
            int zzy = zzy(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzy;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgh zzB = zzB(i10);
            if (!zzP(obj, i10)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzJ(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzT(obj2, i11, i10)) {
            int zzy = zzy(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzy;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgh zzB = zzB(i10);
            if (!zzT(obj, i11, i10)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzK(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = 1048575 & zzv;
        if (j10 == 1048575) {
            return;
        }
        zzhi.zzq(obj, j10, (1 << (zzv >>> 20)) | zzhi.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzhi.zzq(obj, zzv(i11) & 1048575, i10);
    }

    private final void zzL(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzJ(obj, i10);
    }

    private final void zzM(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzy(i11) & 1048575, obj2);
        zzK(obj, i10, i11);
    }

    private final void zzN(zzhq zzhqVar, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i10) {
        return zzP(obj, i10) == zzP(obj2, i10);
    }

    private final boolean zzP(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = zzv & 1048575;
        if (j10 != 1048575) {
            return (zzhi.zzc(obj, j10) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i10);
        long j11 = zzy & 1048575;
        switch (zzx(zzy)) {
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
                return zzhi.zzw(obj, j11);
            case 8:
                Object zzf = zzhi.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzdb) {
                    return !zzdb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j11) != null;
            case 10:
                return !zzdb.zzb.equals(zzhi.zzf(obj, j11));
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

    private final boolean zzQ(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzP(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzR(Object obj, int i10, zzgh zzghVar) {
        return zzghVar.zzk(zzhi.zzf(obj, i10 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzed) {
            return ((zzed) obj).zzX();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        return zzhi.zzc(obj, (long) (zzv(i11) & 1048575)) == i10;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzhi.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i10, Object obj, zzhq zzhqVar) {
        if (obj instanceof String) {
            zzhqVar.zzG(i10, (String) obj);
        } else {
            zzhqVar.zzd(i10, (zzdb) obj);
        }
    }

    static zzgz zzd(Object obj) {
        zzed zzedVar = (zzed) obj;
        zzgz zzgzVar = zzedVar.zzc;
        if (zzgzVar != zzgz.zzc()) {
            return zzgzVar;
        }
        zzgz zzf = zzgz.zzf();
        zzedVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr zzl(java.lang.Class r30, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r31, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r32, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfc r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj r36) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfc, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzhi.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzhi.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0168, code lost:
    
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzy(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0158, code lost:
    
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzy(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r4 = r11 << 3;
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzu(zzp(r16, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011c, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzz(zzz(r16, r3));
        r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzy(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        if (zzT(r16, r11, r5) != false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0199, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024c, code lost:
    
        r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzy(r11 << 3) + com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzy(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b5, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c3, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d1, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ef, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fc, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0209, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0216, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0223, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0230, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023d, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024a, code lost:
    
        if (r3 > 0) goto L355;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzo(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzo(java.lang.Object):int");
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzhi.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzco zzcoVar) {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzfi) object).zze()) {
            zzfi zzb2 = zzfi.zza().zzb();
            zzfj.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzco zzcoVar) {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzcp.zzq(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzcp.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzcp.zzm(bArr, i10, zzcoVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzcoVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzcp.zzj(bArr, i10, zzcoVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzcoVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzcp.zzq(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzcp.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzcp.zzm(bArr, i10, zzcoVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzcoVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzcp.zzj(bArr, i10, zzcoVar);
                    int i22 = zzcoVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !zzhn.zzh(bArr, zzj2, zzj2 + i22)) {
                            throw zzeo.zzc();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzem.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzE = zzE(obj, i13, i17);
                    int zzo = zzcp.zzo(zzE, zzB(i17), bArr, i10, i11, zzcoVar);
                    zzM(obj, i13, i17, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzcp.zza(bArr, i10, zzcoVar);
                    unsafe.putObject(obj, j10, zzcoVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzcp.zzj(bArr, i10, zzcoVar);
                    int i23 = zzcoVar.zza;
                    zzeh zzA = zzA(i17);
                    if (zzA == null || zzA.zza(i23)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        zzd(obj).zzj(i12, Long.valueOf(i23));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzcp.zzj(bArr, i10, zzcoVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzdf.zzb(zzcoVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzcp.zzm(bArr, i10, zzcoVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzdf.zzc(zzcoVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzE2 = zzE(obj, i13, i17);
                    int zzn = zzcp.zzn(zzE2, zzB(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzcoVar);
                    zzM(obj, i13, i17, zzE2);
                    return zzn;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x016e, code lost:
    
        if (r4 == 0) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0170, code lost:
    
        r13.add(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x017e, code lost:
    
        if (r1 >= r20) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0180, code lost:
    
        r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0186, code lost:
    
        if (r21 == r30.zza) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0189, code lost:
    
        r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r18, r4, r30);
        r4 = r30.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x018f, code lost:
    
        if (r4 < 0) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0193, code lost:
    
        if (r4 > (r18.length - r1)) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0195, code lost:
    
        if (r4 != 0) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0176, code lost:
    
        r13.add(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzr(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019c, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a1, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x017e, code lost:
    
        r13.add(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzr(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02a0, code lost:
    
        if (r30.zzb != 0) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02a2, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02a5, code lost:
    
        r13.zze(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02a8, code lost:
    
        if (r1 >= r20) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02aa, code lost:
    
        r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02b0, code lost:
    
        if (r21 == r30.zza) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02b3, code lost:
    
        r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02bb, code lost:
    
        if (r30.zzb == 0) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02a4, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02be, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02a5, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0236  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01fe -> B:111:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0246 -> B:128:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x02bb -> B:164:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0195 -> B:83:0x0170). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r30) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    private final int zzt(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzw(i10, 0);
    }

    private final int zzu(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzw(i10, i11);
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzw(int i10, int i11) {
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

    private static int zzx(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzz(Object obj, long j10) {
        return ((Long) zzhi.zzf(obj, j10)).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x031f, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009f, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0322, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj.zzx((java.lang.String) r4);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cf, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e7, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e3, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e1, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0543, code lost:
    
        if (r6 == r1) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0545, code lost:
    
        r32.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x054b, code lost:
    
        r2 = r9.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x054f, code lost:
    
        if (r2 >= r9.zzk) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0551, code lost:
    
        r4 = r9.zzi[r2];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhi.zzf(r12, r9.zzy(r4) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0563, code lost:
    
        if (r5 != null) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x056a, code lost:
    
        if (r9.zzA(r4) != null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x056f, code lost:
    
        r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi) r5;
        r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh) r9.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0577, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x056c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x057a, code lost:
    
        if (r7 != 0) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x057c, code lost:
    
        if (r0 != r38) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0583, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0588, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0584, code lost:
    
        if (r0 > r38) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0586, code lost:
    
        if (r3 != r7) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x058d, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:145:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x03f2. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r40) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final Object zze() {
        return ((zzed) this.zzg).zzJ();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final void zzf(Object obj) {
        int i10;
        if (zzS(obj)) {
            if (obj instanceof zzed) {
                zzed zzedVar = (zzed) obj;
                zzedVar.zzV(a.e.API_PRIORITY_OTHER);
                zzedVar.zzb = 0;
                zzedVar.zzT();
            }
            int length = this.zzc.length;
            while (i10 < length) {
                int zzy = zzy(i10);
                int i11 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j10 = i11;
                if (zzx != 9) {
                    if (zzx == 60 || zzx == 68) {
                        if (!zzT(obj, this.zzc[i10], i10)) {
                        }
                        zzB(i10).zzf(zzb.getObject(obj, j10));
                    } else {
                        switch (zzx) {
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
                                this.zzl.zza(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfi) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zzB(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                i10 = zzP(obj, i10) ? 0 : i10 + 3;
                zzB(i10).zzf(zzb.getObject(obj, j10));
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zze(obj);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzy = zzy(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 3:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 4:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 5:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 6:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 7:
                    if (zzP(obj2, i10)) {
                        zzhi.zzm(obj, j10, zzhi.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 9:
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 11:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 12:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 13:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 14:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 15:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzq(obj, j10, zzhi.zzc(obj2, j10));
                    zzJ(obj, i10);
                    break;
                case 16:
                    if (!zzP(obj2, i10)) {
                        break;
                    }
                    zzhi.zzr(obj, j10, zzhi.zzd(obj2, j10));
                    zzJ(obj, i10);
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
                    int i12 = zzgj.zza;
                    zzhi.zzs(obj, j10, zzfj.zzb(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10)));
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
                    if (!zzT(obj2, i11, i10)) {
                        break;
                    }
                    zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                    zzK(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzT(obj2, i11, i10)) {
                        break;
                    }
                    zzhi.zzs(obj, j10, zzhi.zzf(obj2, j10));
                    zzK(obj, i11, i10);
                    break;
            }
        }
        zzgj.zzC(this.zzm, obj, obj2);
        if (this.zzh) {
            zzgj.zzB(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0286, code lost:
    
        if (r0 != r5) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0288, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r18;
        r1 = r19;
        r2 = r22;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x029e, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02cb, code lost:
    
        if (r0 != r15) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ed, code lost:
    
        if (r0 != r15) goto L262;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x008d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r35) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:311:0x0545. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0991  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r18, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq r19) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzy = zzy(i10);
            long j10 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i10) && Double.doubleToLongBits(zzhi.zza(obj, j10)) == Double.doubleToLongBits(zzhi.zza(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i10) && Float.floatToIntBits(zzhi.zzb(obj, j10)) == Float.floatToIntBits(zzhi.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i10) && zzhi.zzw(obj, j10) == zzhi.zzw(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i10) && zzgj.zzW(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i10) && zzgj.zzW(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i10) && zzgj.zzW(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i10) && zzhi.zzc(obj, j10) == zzhi.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i10) && zzhi.zzd(obj, j10) == zzhi.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i10) && zzgj.zzW(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
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
                    if (!zzgj.zzW(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
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
                    long zzv = zzv(i10) & 1048575;
                    if (zzhi.zzc(obj, zzv) == zzhi.zzc(obj2, zzv) && zzgj.zzW(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzj) {
            int i15 = this.zzi[i13];
            int i16 = this.zzc[i15];
            int zzy = zzy(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i16, i15) && !zzR(obj, zzy, zzB(i15))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzfi) zzhi.zzf(obj, zzy & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzB = zzB(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzB.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i15, i10, i11, i19) && !zzR(obj, zzy, zzB(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        return !this.zzh || this.zzn.zzb(obj).zzk();
    }
}
