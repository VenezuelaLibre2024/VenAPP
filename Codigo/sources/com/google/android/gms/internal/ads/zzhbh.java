package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class zzhbh<T> implements zzhby<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhcz.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhbe zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhas zzm;
    private final zzhcp zzn;
    private final zzgzg zzo;
    private final zzhbj zzp;
    private final zzhaz zzq;

    private zzhbh(int[] iArr, Object[] objArr, int i10, int i11, zzhbe zzhbeVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzhbj zzhbjVar, zzhas zzhasVar, zzhcp zzhcpVar, zzgzg zzgzgVar, zzhaz zzhazVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhbeVar instanceof zzgzu;
        boolean z11 = false;
        if (zzgzgVar != null && zzgzgVar.zzh(zzhbeVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzhbjVar;
        this.zzm = zzhasVar;
        this.zzn = zzhcpVar;
        this.zzo = zzgzgVar;
        this.zzg = zzhbeVar;
        this.zzq = zzhazVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzhby zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzhby zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzhby zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzhby zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzhbq zzhbqVar) {
        zzhcz.zzv(obj, i10 & 1048575, zzM(i10) ? zzhbqVar.zzs() : this.zzi ? zzhbqVar.zzr() : zzhbqVar.zzp());
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzhcz.zzt(obj, j10, (1 << (zzr >>> 20)) | zzhcz.zzd(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzhcz.zzt(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 != 1048575) {
            return (zzhcz.zzd(obj, j10) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i10);
        long j11 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhcz.zzb(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhcz.zzc(obj, j11)) != 0;
            case 2:
                return zzhcz.zzf(obj, j11) != 0;
            case 3:
                return zzhcz.zzf(obj, j11) != 0;
            case 4:
                return zzhcz.zzd(obj, j11) != 0;
            case 5:
                return zzhcz.zzf(obj, j11) != 0;
            case 6:
                return zzhcz.zzd(obj, j11) != 0;
            case 7:
                return zzhcz.zzz(obj, j11);
            case 8:
                Object zzh = zzhcz.zzh(obj, j11);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgyl) {
                    return !zzgyl.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhcz.zzh(obj, j11) != null;
            case 10:
                return !zzgyl.zzb.equals(zzhcz.zzh(obj, j11));
            case 11:
                return zzhcz.zzd(obj, j11) != 0;
            case 12:
                return zzhcz.zzd(obj, j11) != 0;
            case 13:
                return zzhcz.zzd(obj, j11) != 0;
            case 14:
                return zzhcz.zzf(obj, j11) != 0;
            case 15:
                return zzhcz.zzd(obj, j11) != 0;
            case 16:
                return zzhcz.zzf(obj, j11) != 0;
            case 17:
                return zzhcz.zzh(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzhby zzhbyVar) {
        return zzhbyVar.zzk(zzhcz.zzh(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgzu) {
            return ((zzgzu) obj).zzaY();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzhcz.zzd(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzhcz.zzh(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzgzb zzgzbVar) {
        if (obj instanceof String) {
            zzgzbVar.zzF(i10, (String) obj);
        } else {
            zzgzbVar.zzd(i10, (zzgyl) obj);
        }
    }

    static zzhcq zzd(Object obj) {
        zzgzu zzgzuVar = (zzgzu) obj;
        zzhcq zzhcqVar = zzgzuVar.zzc;
        if (zzhcqVar != zzhcq.zzc()) {
            return zzhcqVar;
        }
        zzhcq zzf = zzhcq.zzf();
        zzgzuVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzhbh zzl(java.lang.Class r33, com.google.android.gms.internal.ads.zzhbb r34, com.google.android.gms.internal.ads.zzhbj r35, com.google.android.gms.internal.ads.zzhas r36, com.google.android.gms.internal.ads.zzhcp r37, com.google.android.gms.internal.ads.zzgzg r38, com.google.android.gms.internal.ads.zzhaz r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbh.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzhbb, com.google.android.gms.internal.ads.zzhbj, com.google.android.gms.internal.ads.zzhas, com.google.android.gms.internal.ads.zzhcp, com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzhaz):com.google.android.gms.internal.ads.zzhbh");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzhcz.zzh(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzhcz.zzh(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzhcz.zzh(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzhcz.zzh(obj, j10)).longValue();
    }

    private final zzgzy zzw(int i10) {
        int i11 = i10 / 3;
        return (zzgzy) this.zzd[i11 + i11 + 1];
    }

    private final zzhby zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzhby zzhbyVar = (zzhby) objArr[i12];
        if (zzhbyVar != null) {
            return zzhbyVar;
        }
        zzhby zzb2 = zzhbn.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzhcp zzhcpVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzh = zzhcz.zzh(obj, zzu(i10) & 1048575);
        if (zzh == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x04f8, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.ads.zzgyl) != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cf, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.ads.zzgyl) != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x04fb, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzgza.zzz(r0);
        r1 = com.google.android.gms.internal.ads.zzgza.zzy((java.lang.String) r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0055. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v199, types: [int] */
    /* JADX WARN: Type inference failed for: r0v207, types: [int] */
    /* JADX WARN: Type inference failed for: r0v212 */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v214 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v216 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v218 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v74, types: [com.google.android.gms.internal.ads.zzham] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v63, types: [int] */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzhby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbh.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        if (r2 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e6, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
    
        r6 = r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e0, code lost:
    
        if (r2 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzhby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbh.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0487, code lost:
    
        if (r1 == 0) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0489, code lost:
    
        r13.add(com.google.android.gms.internal.ads.zzgyl.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0497, code lost:
    
        if (r0 >= r10) goto L1252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0499, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzgxy.zzh(r35, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x049f, code lost:
    
        if (r14 != r12.zza) goto L1254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04a1, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzgxy.zzh(r35, r1, r12);
        r1 = r12.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04a7, code lost:
    
        if (r1 < 0) goto L1170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04ab, code lost:
    
        if (r1 > (r35.length - r0)) goto L1171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04ad, code lost:
    
        if (r1 != 0) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x048f, code lost:
    
        r13.add(com.google.android.gms.internal.ads.zzgyl.zzv(r35, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04b4, code lost:
    
        throw com.google.android.gms.internal.ads.zzhag.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04b9, code lost:
    
        throw com.google.android.gms.internal.ads.zzhag.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04ba, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0497, code lost:
    
        r13.add(com.google.android.gms.internal.ads.zzgyl.zzv(r35, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05ef, code lost:
    
        if (r12.zzb != 0) goto L925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x05f1, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x05f5, code lost:
    
        r13.zze(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05f8, code lost:
    
        if (r1 >= r3) goto L1268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05fa, code lost:
    
        r8 = com.google.android.gms.internal.ads.zzgxy.zzh(r35, r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0600, code lost:
    
        if (r7 != r12.zza) goto L1267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0602, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzgxy.zzk(r35, r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x060a, code lost:
    
        if (r12.zzb == 0) goto L926;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05f3, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x05f5, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0ad7, code lost:
    
        if (r5 == r0) goto L1136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0ad9, code lost:
    
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0add, code lost:
    
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0ae2, code lost:
    
        if (r11 >= r12.zzl) goto L1243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0ae4, code lost:
    
        zzy(r34, r12.zzj[r11], null, r12.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0af7, code lost:
    
        if (r9 != 0) goto L1145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0af9, code lost:
    
        if (r6 != r10) goto L1143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b00, code lost:
    
        throw com.google.android.gms.internal.ads.zzhag.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0b05, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0b01, code lost:
    
        if (r6 > r10) goto L1148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b03, code lost:
    
        if (r8 != r9) goto L1148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b0a, code lost:
    
        throw com.google.android.gms.internal.ads.zzhag.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:161:0x036b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x084c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:487:0x00ac. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0a52 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0a65 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x04ad -> B:221:0x0489). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x053a -> B:252:0x0519). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:276:0x0584 -> B:270:0x055b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x060a -> B:308:0x05f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgxx r39) {
        /*
            Method dump skipped, instructions count: 2972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final Object zze() {
        return ((zzgzu) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzf(Object obj) {
        int i10;
        if (zzQ(obj)) {
            if (obj instanceof zzgzu) {
                zzgzu zzgzuVar = (zzgzu) obj;
                zzgzuVar.zzaV(a.e.API_PRIORITY_OTHER);
                zzgzuVar.zza = 0;
                zzgzuVar.zzaT();
            }
            int[] iArr = this.zzc;
            while (i10 < iArr.length) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
                if (zzt != 9) {
                    if (zzt == 60 || zzt == 68) {
                        if (!zzR(obj, this.zzc[i10], i10)) {
                        }
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    } else {
                        switch (zzt) {
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
                                this.zzm.zzb(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzhay) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                i10 = zzN(obj, i10) ? 0 : i10 + 3;
                zzx(i10).zzf(zzb.getObject(obj, j10));
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzhcz.zzr(obj, j10, zzhcz.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzhcz.zzs(obj, j10, zzhcz.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzu(obj, j10, zzhcz.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzu(obj, j10, zzhcz.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzt(obj, j10, zzhcz.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzu(obj, j10, zzhcz.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzt(obj, j10, zzhcz.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 7:
                    if (zzN(obj2, i10)) {
                        zzhcz.zzp(obj, j10, zzhcz.zzz(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzv(obj, j10, zzhcz.zzh(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 9:
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzv(obj, j10, zzhcz.zzh(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzt(obj, j10, zzhcz.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzt(obj, j10, zzhcz.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzt(obj, j10, zzhcz.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzu(obj, j10, zzhcz.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzt(obj, j10, zzhcz.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzhcz.zzu(obj, j10, zzhcz.zzf(obj2, j10));
                    zzH(obj, i10);
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
                    this.zzm.zzc(obj, obj2, j10);
                    break;
                case 50:
                    int i13 = zzhca.zza;
                    zzhcz.zzv(obj, j10, zzhaz.zzb(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10)));
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
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    }
                    zzhcz.zzv(obj, j10, zzhcz.zzh(obj2, j10));
                    zzI(obj, i12, i10);
                    break;
                case 60:
                case 68:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    }
                    zzhcz.zzv(obj, j10, zzhcz.zzh(obj2, j10));
                    zzI(obj, i12, i10);
                    break;
            }
        }
        zzhca.zzq(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00bd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05db A[LOOP:2: B:38:0x05d7->B:40:0x05db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05a3 A[Catch: all -> 0x0598, TryCatch #4 {all -> 0x0598, blocks: (B:17:0x0577, B:46:0x059e, B:48:0x05a3, B:49:0x05a8), top: B:16:0x0577 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05ae A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzhbq r19, com.google.android.gms.internal.ads.zzgzf r20) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbh.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhbq, com.google.android.gms.internal.ads.zzgzf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgxx zzgxxVar) {
        zzc(obj, bArr, i10, i11, 0, zzgxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final boolean zzj(Object obj, Object obj2) {
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzhcz.zzb(obj, j10)) == Double.doubleToLongBits(zzhcz.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzhcz.zzc(obj, j10)) == Float.floatToIntBits(zzhcz.zzc(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzhcz.zzf(obj, j10) == zzhcz.zzf(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzhcz.zzf(obj, j10) == zzhcz.zzf(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzhcz.zzd(obj, j10) == zzhcz.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzhcz.zzf(obj, j10) == zzhcz.zzf(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzhcz.zzd(obj, j10) == zzhcz.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzhcz.zzz(obj, j10) == zzhcz.zzz(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzhca.zzs(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzhca.zzs(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzhca.zzs(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzhcz.zzd(obj, j10) == zzhcz.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzhcz.zzd(obj, j10) == zzhcz.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzhcz.zzd(obj, j10) == zzhcz.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzhcz.zzf(obj, j10) == zzhcz.zzf(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzhcz.zzd(obj, j10) == zzhcz.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzhcz.zzf(obj, j10) == zzhcz.zzf(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzhca.zzs(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10))) {
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
                    if (!zzhca.zzs(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10))) {
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
                    long zzr = zzr(i10) & 1048575;
                    if (zzhcz.zzd(obj, zzr) == zzhcz.zzd(obj2, zzr) && zzhca.zzs(zzhcz.zzh(obj, j10), zzhcz.zzh(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzhay) zzhcz.zzh(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhcz.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhby zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzm(Object obj, zzgzb zzgzbVar) {
        int i10;
        int i11;
        int i12;
        double zzb2;
        float zzc;
        long j10;
        long j11;
        int i13;
        long j12;
        int i14;
        boolean zzz;
        Object object;
        Object object2;
        Object object3;
        int i15;
        int i16;
        int i17;
        long j13;
        int i18;
        long j14;
        Object object4;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        List list;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i27 = 1048575;
        int i28 = 1048575;
        int i29 = 0;
        int i30 = 0;
        while (i30 < iArr.length) {
            int zzu = zzu(i30);
            int[] iArr2 = this.zzc;
            int zzt = zzt(zzu);
            int i31 = iArr2[i30];
            boolean z10 = true;
            if (zzt <= 17) {
                int i32 = iArr2[i30 + 2];
                int i33 = i32 & i27;
                if (i33 != i28) {
                    i29 = i33 == i27 ? 0 : unsafe.getInt(obj, i33);
                    i28 = i33;
                }
                i10 = i28;
                i11 = i29;
                i12 = 1 << (i32 >>> 20);
            } else {
                i10 = i28;
                i11 = i29;
                i12 = 0;
            }
            long j15 = zzu & i27;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        zzb2 = zzhcz.zzb(obj, j15);
                        zzgzbVar.zzf(i31, zzb2);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        zzc = zzhcz.zzc(obj, j15);
                        zzgzbVar.zzo(i31, zzc);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        j10 = unsafe.getLong(obj, j15);
                        zzgzbVar.zzt(i31, j10);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        j11 = unsafe.getLong(obj, j15);
                        zzgzbVar.zzJ(i31, j11);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        i13 = unsafe.getInt(obj, j15);
                        zzgzbVar.zzr(i31, i13);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        j12 = unsafe.getLong(obj, j15);
                        zzgzbVar.zzm(i31, j12);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        i14 = unsafe.getInt(obj, j15);
                        zzgzbVar.zzk(i31, i14);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        zzz = zzhcz.zzz(obj, j15);
                        zzgzbVar.zzb(i31, zzz);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        object = unsafe.getObject(obj, j15);
                        zzT(i31, object, zzgzbVar);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        object2 = unsafe.getObject(obj, j15);
                        zzgzbVar.zzv(i31, object2, zzx(i30));
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        object3 = unsafe.getObject(obj, j15);
                        zzgzbVar.zzd(i31, (zzgyl) object3);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        i15 = unsafe.getInt(obj, j15);
                        zzgzbVar.zzH(i31, i15);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        i16 = unsafe.getInt(obj, j15);
                        zzgzbVar.zzi(i31, i16);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        i17 = unsafe.getInt(obj, j15);
                        zzgzbVar.zzw(i31, i17);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        j13 = unsafe.getLong(obj, j15);
                        zzgzbVar.zzy(i31, j13);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        i18 = unsafe.getInt(obj, j15);
                        zzgzbVar.zzA(i31, i18);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        j14 = unsafe.getLong(obj, j15);
                        zzgzbVar.zzC(i31, j14);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i30, i10, i11, i12)) {
                        object4 = unsafe.getObject(obj, j15);
                        zzgzbVar.zzq(i31, object4, zzx(i30));
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 18:
                    z10 = false;
                    i19 = this.zzc[i30];
                    zzhca.zzu(i19, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 19:
                    z10 = false;
                    i20 = this.zzc[i30];
                    zzhca.zzy(i20, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 20:
                    z10 = false;
                    i21 = this.zzc[i30];
                    zzhca.zzA(i21, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 21:
                    z10 = false;
                    i22 = this.zzc[i30];
                    zzhca.zzG(i22, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 22:
                    z10 = false;
                    i23 = this.zzc[i30];
                    zzhca.zzz(i23, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 23:
                    z10 = false;
                    i24 = this.zzc[i30];
                    zzhca.zzx(i24, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 24:
                    z10 = false;
                    i25 = this.zzc[i30];
                    zzhca.zzw(i25, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 25:
                    i26 = this.zzc[i30];
                    list = (List) unsafe.getObject(obj, j15);
                    z10 = false;
                    zzhca.zzt(i26, list, zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 26:
                    int i34 = this.zzc[i30];
                    List list2 = (List) unsafe.getObject(obj, j15);
                    int i35 = zzhca.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        zzgzbVar.zzG(i34, list2);
                    }
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                    break;
                case 27:
                    int i36 = this.zzc[i30];
                    List list3 = (List) unsafe.getObject(obj, j15);
                    zzhby zzx = zzx(i30);
                    int i37 = zzhca.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i38 = 0; i38 < list3.size(); i38++) {
                            zzgzbVar.zzv(i36, list3.get(i38), zzx);
                        }
                    }
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                    break;
                case 28:
                    int i39 = this.zzc[i30];
                    List list4 = (List) unsafe.getObject(obj, j15);
                    int i40 = zzhca.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        zzgzbVar.zze(i39, list4);
                    }
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                    break;
                case 29:
                    zzhca.zzF(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, false);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 30:
                    zzhca.zzv(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, false);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 31:
                    zzhca.zzB(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, false);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 32:
                    zzhca.zzC(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, false);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 33:
                    zzhca.zzD(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, false);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 34:
                    zzhca.zzE(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, false);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 35:
                    i19 = this.zzc[i30];
                    zzhca.zzu(i19, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 36:
                    i20 = this.zzc[i30];
                    zzhca.zzy(i20, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 37:
                    i21 = this.zzc[i30];
                    zzhca.zzA(i21, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 38:
                    i22 = this.zzc[i30];
                    zzhca.zzG(i22, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 39:
                    i23 = this.zzc[i30];
                    zzhca.zzz(i23, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 40:
                    i24 = this.zzc[i30];
                    zzhca.zzx(i24, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 41:
                    i25 = this.zzc[i30];
                    zzhca.zzw(i25, (List) unsafe.getObject(obj, j15), zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 42:
                    i26 = this.zzc[i30];
                    list = (List) unsafe.getObject(obj, j15);
                    zzhca.zzt(i26, list, zzgzbVar, z10);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 43:
                    zzhca.zzF(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, true);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 44:
                    zzhca.zzv(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, true);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 45:
                    zzhca.zzB(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, true);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 46:
                    zzhca.zzC(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, true);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 47:
                    zzhca.zzD(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, true);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 48:
                    zzhca.zzE(this.zzc[i30], (List) unsafe.getObject(obj, j15), zzgzbVar, true);
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 49:
                    int i41 = this.zzc[i30];
                    List list5 = (List) unsafe.getObject(obj, j15);
                    zzhby zzx2 = zzx(i30);
                    int i42 = zzhca.zza;
                    if (list5 != null && !list5.isEmpty()) {
                        for (int i43 = 0; i43 < list5.size(); i43++) {
                            zzgzbVar.zzq(i41, list5.get(i43), zzx2);
                        }
                    }
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j15) != null) {
                        throw null;
                    }
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
                case 51:
                    if (zzR(obj, i31, i30)) {
                        zzb2 = zzn(obj, j15);
                        zzgzbVar.zzf(i31, zzb2);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 52:
                    if (zzR(obj, i31, i30)) {
                        zzc = zzo(obj, j15);
                        zzgzbVar.zzo(i31, zzc);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 53:
                    if (zzR(obj, i31, i30)) {
                        j10 = zzv(obj, j15);
                        zzgzbVar.zzt(i31, j10);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 54:
                    if (zzR(obj, i31, i30)) {
                        j11 = zzv(obj, j15);
                        zzgzbVar.zzJ(i31, j11);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 55:
                    if (zzR(obj, i31, i30)) {
                        i13 = zzp(obj, j15);
                        zzgzbVar.zzr(i31, i13);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i31, i30)) {
                        j12 = zzv(obj, j15);
                        zzgzbVar.zzm(i31, j12);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i31, i30)) {
                        i14 = zzp(obj, j15);
                        zzgzbVar.zzk(i31, i14);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i31, i30)) {
                        zzz = zzS(obj, j15);
                        zzgzbVar.zzb(i31, zzz);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i31, i30)) {
                        object = unsafe.getObject(obj, j15);
                        zzT(i31, object, zzgzbVar);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 60:
                    if (zzR(obj, i31, i30)) {
                        object2 = unsafe.getObject(obj, j15);
                        zzgzbVar.zzv(i31, object2, zzx(i30));
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 61:
                    if (zzR(obj, i31, i30)) {
                        object3 = unsafe.getObject(obj, j15);
                        zzgzbVar.zzd(i31, (zzgyl) object3);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i31, i30)) {
                        i15 = zzp(obj, j15);
                        zzgzbVar.zzH(i31, i15);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 63:
                    if (zzR(obj, i31, i30)) {
                        i16 = zzp(obj, j15);
                        zzgzbVar.zzi(i31, i16);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i31, i30)) {
                        i17 = zzp(obj, j15);
                        zzgzbVar.zzw(i31, i17);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i31, i30)) {
                        j13 = zzv(obj, j15);
                        zzgzbVar.zzy(i31, j13);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 66:
                    if (zzR(obj, i31, i30)) {
                        i18 = zzp(obj, j15);
                        zzgzbVar.zzA(i31, i18);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 67:
                    if (zzR(obj, i31, i30)) {
                        j14 = zzv(obj, j15);
                        zzgzbVar.zzC(i31, j14);
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i31, i30)) {
                        object4 = unsafe.getObject(obj, j15);
                        zzgzbVar.zzq(i31, object4, zzx(i30));
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    } else {
                        i30 += 3;
                        i28 = i10;
                        i29 = i11;
                        i27 = 1048575;
                    }
                default:
                    i30 += 3;
                    i28 = i10;
                    i29 = i11;
                    i27 = 1048575;
            }
        }
        zzhcp zzhcpVar = this.zzn;
        zzhcpVar.zzr(zzhcpVar.zzd(obj), zzgzbVar);
    }
}
