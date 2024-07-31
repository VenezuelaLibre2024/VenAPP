package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class zzakr<T> implements zzalf<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamk.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzakn zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzaky zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzakv zzo;
    private final zzajs zzp;
    private final zzame<?, ?> zzq;
    private final zzaiq<?> zzr;
    private final zzakg zzs;

    private zzakr(int[] iArr, Object[] objArr, int i10, int i11, zzakn zzaknVar, zzaky zzakyVar, boolean z10, int[] iArr2, int i12, int i13, zzakv zzakvVar, zzajs zzajsVar, zzame<?, ?> zzameVar, zzaiq<?> zzaiqVar, zzakg zzakgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzaknVar instanceof zzajc;
        this.zzj = zzakyVar;
        this.zzh = zzaiqVar != null && zzaiqVar.zza(zzaknVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i12;
        this.zzn = i13;
        this.zzo = zzakvVar;
        this.zzp = zzajsVar;
        this.zzq = zzameVar;
        this.zzr = zzaiqVar;
        this.zzg = zzaknVar;
        this.zzs = zzakgVar;
    }

    private static <T> double zza(T t10, long j10) {
        return ((Double) zzamk.zze(t10, j10)).doubleValue();
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
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

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i10, int i11, zzamr zzamrVar, Class<?> cls, zzahk zzahkVar) {
        int zzd;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i12;
        long j10;
        switch (zzakq.zza[zzamrVar.ordinal()]) {
            case 1:
                zzd = zzahl.zzd(bArr, i10, zzahkVar);
                valueOf = Boolean.valueOf(zzahkVar.zzb != 0);
                zzahkVar.zzc = valueOf;
                return zzd;
            case 2:
                return zzahl.zza(bArr, i10, zzahkVar);
            case 3:
                valueOf2 = Double.valueOf(zzahl.zza(bArr, i10));
                zzahkVar.zzc = valueOf2;
                return i10 + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(zzahl.zzc(bArr, i10));
                zzahkVar.zzc = valueOf3;
                return i10 + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(zzahl.zzd(bArr, i10));
                zzahkVar.zzc = valueOf2;
                return i10 + 8;
            case 8:
                valueOf3 = Float.valueOf(zzahl.zzb(bArr, i10));
                zzahkVar.zzc = valueOf3;
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                zzd = zzahl.zzc(bArr, i10, zzahkVar);
                i12 = zzahkVar.zza;
                valueOf = Integer.valueOf(i12);
                zzahkVar.zzc = valueOf;
                return zzd;
            case 12:
            case 13:
                zzd = zzahl.zzd(bArr, i10, zzahkVar);
                j10 = zzahkVar.zzb;
                valueOf = Long.valueOf(j10);
                zzahkVar.zzc = valueOf;
                return zzd;
            case 14:
                return zzahl.zza(zzalb.zza().zza((Class) cls), bArr, i10, i11, zzahkVar);
            case 15:
                zzd = zzahl.zzc(bArr, i10, zzahkVar);
                i12 = zzaia.zza(zzahkVar.zza);
                valueOf = Integer.valueOf(i12);
                zzahkVar.zzc = valueOf;
                return zzd;
            case 16:
                zzd = zzahl.zzd(bArr, i10, zzahkVar);
                j10 = zzaia.zza(zzahkVar.zzb);
                valueOf = Long.valueOf(j10);
                zzahkVar.zzc = valueOf;
                return zzd;
            case 17:
                return zzahl.zzb(bArr, i10, zzahkVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzakr<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p002firebaseauthapi.zzakl r33, com.google.android.gms.internal.p002firebaseauthapi.zzakv r34, com.google.android.gms.internal.p002firebaseauthapi.zzajs r35, com.google.android.gms.internal.p002firebaseauthapi.zzame<?, ?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzaiq<?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzakg r38) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzakl, com.google.android.gms.internal.firebase-auth-api.zzakv, com.google.android.gms.internal.firebase-auth-api.zzajs, com.google.android.gms.internal.firebase-auth-api.zzame, com.google.android.gms.internal.firebase-auth-api.zzaiq, com.google.android.gms.internal.firebase-auth-api.zzakg):com.google.android.gms.internal.firebase-auth-api.zzakr");
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzajg zzajgVar, UB ub2, zzame<UT, UB> zzameVar, Object obj) {
        zzake<?, ?> zza2 = this.zzs.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzajgVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzameVar.zzc(obj);
                }
                zzahu zzc = zzahp.zzc(zzakf.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzakf.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzameVar.zza((zzame<UT, UB>) ub2, i11, zzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10) {
        zzalf zze = zze(i10);
        long zzc = zzc(i10) & 1048575;
        if (!zzc((zzakr<T>) t10, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t10, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10, int i11) {
        zzalf zze = zze(i11);
        if (!zzc((zzakr<T>) t10, i10, i11)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzame<UT, UB> zzameVar, Object obj2) {
        zzajg zzd;
        int i11 = this.zzc[i10];
        Object zze = zzamk.zze(obj, zzc(i10) & 1048575);
        return (zze == null || (zzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzs.zze(zze), zzd, (zzajg) ub2, (zzame<UT, zzajg>) zzameVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
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

    private static void zza(int i10, Object obj, zzana zzanaVar) {
        if (obj instanceof String) {
            zzanaVar.zza(i10, (String) obj);
        } else {
            zzanaVar.zza(i10, (zzahp) obj);
        }
    }

    private static <UT, UB> void zza(zzame<UT, UB> zzameVar, T t10, zzana zzanaVar) {
        zzameVar.zzb((zzame<UT, UB>) zzameVar.zzd(t10), zzanaVar);
    }

    private final <K, V> void zza(zzana zzanaVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zzanaVar.zza(i10, this.zzs.zza(zzf(i11)), this.zzs.zzd(obj));
        }
    }

    private final void zza(T t10, int i10, int i11, Object obj) {
        zzb.putObject(t10, zzc(i11) & 1048575, obj);
        zzb((zzakr<T>) t10, i10, i11);
    }

    private final void zza(Object obj, int i10, zzalc zzalcVar) {
        long j10;
        Object zzp;
        if (zzg(i10)) {
            j10 = i10 & 1048575;
            zzp = zzalcVar.zzr();
        } else {
            int i11 = i10 & 1048575;
            if (this.zzi) {
                j10 = i11;
                zzp = zzalcVar.zzq();
            } else {
                j10 = i11;
                zzp = zzalcVar.zzp();
            }
        }
        zzamk.zza(obj, j10, zzp);
    }

    private final void zza(T t10, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((zzakr<T>) t10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i10) {
        if (zzc((zzakr<T>) t11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
            }
            zzalf zze = zze(i10);
            if (!zzc((zzakr<T>) t10, i10)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t10, zzc, zza2);
                } else {
                    unsafe.putObject(t10, zzc, object);
                }
                zzb((zzakr<T>) t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t10, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final boolean zza(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzc((zzakr<T>) t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzalf zzalfVar) {
        return zzalfVar.zzd(zzamk.zze(obj, i10 & 1048575));
    }

    private static <T> float zzb(T t10, long j10) {
        return ((Float) zzamk.zze(t10, j10)).floatValue();
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    private final void zzb(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = 1048575 & zzb2;
        if (j10 == 1048575) {
            return;
        }
        zzamk.zza((Object) t10, j10, (1 << (zzb2 >>> 20)) | zzamk.zzc(t10, j10));
    }

    private final void zzb(T t10, int i10, int i11) {
        zzamk.zza((Object) t10, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzakr<T>) t11, i11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
            }
            zzalf zze = zze(i10);
            if (!zzc((zzakr<T>) t10, i11, i10)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t10, zzc, zza2);
                } else {
                    unsafe.putObject(t10, zzc, object);
                }
                zzb((zzakr<T>) t10, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t10, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> int zzc(T t10, long j10) {
        return ((Integer) zzamk.zze(t10, j10)).intValue();
    }

    private final boolean zzc(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = zzb2 & 1048575;
        if (j10 != 1048575) {
            return (zzamk.zzc(t10, j10) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i10);
        long j11 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamk.zza(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamk.zzb(t10, j11)) != 0;
            case 2:
                return zzamk.zzd(t10, j11) != 0;
            case 3:
                return zzamk.zzd(t10, j11) != 0;
            case 4:
                return zzamk.zzc(t10, j11) != 0;
            case 5:
                return zzamk.zzd(t10, j11) != 0;
            case 6:
                return zzamk.zzc(t10, j11) != 0;
            case 7:
                return zzamk.zzh(t10, j11);
            case 8:
                Object zze = zzamk.zze(t10, j11);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzahp) {
                    return !zzahp.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamk.zze(t10, j11) != null;
            case 10:
                return !zzahp.zza.equals(zzamk.zze(t10, j11));
            case 11:
                return zzamk.zzc(t10, j11) != 0;
            case 12:
                return zzamk.zzc(t10, j11) != 0;
            case 13:
                return zzamk.zzc(t10, j11) != 0;
            case 14:
                return zzamk.zzd(t10, j11) != 0;
            case 15:
                return zzamk.zzc(t10, j11) != 0;
            case 16:
                return zzamk.zzd(t10, j11) != 0;
            case 17:
                return zzamk.zze(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t10, int i10, int i11) {
        return zzamk.zzc(t10, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final boolean zzc(T t10, T t11, int i10) {
        return zzc((zzakr<T>) t10, i10) == zzc((zzakr<T>) t11, i10);
    }

    private static <T> long zzd(T t10, long j10) {
        return ((Long) zzamk.zze(t10, j10)).longValue();
    }

    private final zzajg zzd(int i10) {
        return (zzajg) this.zzd[((i10 / 3) << 1) + 1];
    }

    private final zzalf zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzalf zzalfVar = (zzalf) this.zzd[i11];
        if (zzalfVar != null) {
            return zzalfVar;
        }
        zzalf<T> zza2 = zzalb.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private static zzamd zze(Object obj) {
        zzajc zzajcVar = (zzajc) obj;
        zzamd zzamdVar = zzajcVar.zzb;
        if (zzamdVar != zzamd.zzc()) {
            return zzamdVar;
        }
        zzamd zzd = zzamd.zzd();
        zzajcVar.zzb = zzd;
        return zzd;
    }

    private static <T> boolean zze(T t10, long j10) {
        return ((Boolean) zzamk.zze(t10, j10)).booleanValue();
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzajc) {
            return ((zzajc) obj).zzu();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0245, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0252, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a3, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0254, code lost:
    
        r12 = r12 + ((com.google.android.gms.internal.p002firebaseauthapi.zzaik.zzi(r13) + com.google.android.gms.internal.p002firebaseauthapi.zzaik.zzj(r0)) + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bf, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cd, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01db, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e9, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f7, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0204, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0211, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021e, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x005a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r19) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x099f, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaji.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0553, code lost:
    
        if (r1 == 0) goto L886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0555, code lost:
    
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzahp.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0563, code lost:
    
        if (r0 >= r7) goto L1348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0565, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzahl.zzc(r15, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x056b, code lost:
    
        if (r11 != r14.zza) goto L1350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x056d, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzahl.zzc(r15, r1, r14);
        r1 = r14.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0573, code lost:
    
        if (r1 < 0) goto L1258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0577, code lost:
    
        if (r1 > (r15.length - r0)) goto L1260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0579, code lost:
    
        if (r1 != 0) goto L887;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x055b, code lost:
    
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzahp.zza(r15, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0580, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaji.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0585, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaji.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0563, code lost:
    
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzahp.zza(r15, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06ab, code lost:
    
        if (r14.zzb != 0) goto L974;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06ad, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x06b1, code lost:
    
        r12.zza(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x06b4, code lost:
    
        if (r1 >= r7) goto L1363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x06b6, code lost:
    
        r2 = com.google.android.gms.internal.p002firebaseauthapi.zzahl.zzc(r15, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x06bc, code lost:
    
        if (r5 != r14.zza) goto L1365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x06be, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzahl.zzd(r15, r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x06c6, code lost:
    
        if (r14.zzb == 0) goto L975;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06af, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06b1, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0c84, code lost:
    
        if (r14 == r0) goto L1222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0c86, code lost:
    
        r28.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0c8c, code lost:
    
        r10 = r9.zzm;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0c93, code lost:
    
        if (r10 >= r9.zzn) goto L1339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0c95, code lost:
    
        r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzamd) zza((java.lang.Object) r32, r9.zzl[r10], (int) r3, (com.google.android.gms.internal.p002firebaseauthapi.zzame<UT, int>) r9.zzq, (java.lang.Object) r32);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0cab, code lost:
    
        if (r3 == null) goto L1228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0cad, code lost:
    
        r9.zzq.zzb((java.lang.Object) r7, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0cb4, code lost:
    
        if (r6 != 0) goto L1234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0cb6, code lost:
    
        if (r8 != r35) goto L1232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0cbd, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaji.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0cc2, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0cbe, code lost:
    
        if (r8 > r35) goto L1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0cc0, code lost:
    
        if (r11 != r6) goto L1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0cc7, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaji.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x09c5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:207:0x0426. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:534:0x00b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0884 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0876 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x062f  */
    /* JADX WARN: Type inference failed for: r1v132, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x0579 -> B:227:0x0555). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x05f7 -> B:256:0x05d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:280:0x063f -> B:274:0x0616). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:318:0x06c6 -> B:312:0x06ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.p002firebaseauthapi.zzahk r37) {
        /*
            Method dump skipped, instructions count: 3420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzahk):int");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00bd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05b2 A[Catch: all -> 0x026f, TryCatch #8 {all -> 0x026f, blocks: (B:15:0x0586, B:35:0x05ad, B:37:0x05b2, B:38:0x05b7, B:176:0x00cb, B:84:0x00d8, B:67:0x00dd, B:68:0x00f8, B:71:0x00eb, B:72:0x00fd, B:73:0x010b, B:74:0x0119, B:76:0x0123, B:79:0x012a, B:80:0x0131, B:81:0x013b, B:82:0x0149, B:83:0x0153, B:87:0x0162, B:88:0x016b, B:89:0x017a, B:90:0x0189, B:91:0x0198, B:92:0x01a7, B:93:0x01b6, B:94:0x01c5, B:95:0x01d4, B:96:0x01e3, B:98:0x01f3, B:99:0x0214, B:100:0x01fd, B:102:0x0205, B:103:0x0225, B:104:0x0237, B:105:0x0245, B:106:0x0253, B:107:0x0261), top: B:14:0x0586 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05e9 A[LOOP:3: B:52:0x05e5->B:54:0x05e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05fd  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzalc r19, com.google.android.gms.internal.p002firebaseauthapi.zzaio r20) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzalc, com.google.android.gms.internal.firebase-auth-api.zzaio):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x006a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:313:0x0559. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b32  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzana r25) {
        /*
            Method dump skipped, instructions count: 3178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzana):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final void zza(T t10, T t11) {
        zzf(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc = zzc(i10);
            long j10 = 1048575 & zzc;
            int i11 = this.zzc[i10];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzakr<T>) t11, i10)) {
                        zzamk.zza(t10, j10, zzamk.zza(t11, j10));
                        zzb((zzakr<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzakr<T>) t11, i10)) {
                        zzamk.zza((Object) t10, j10, zzamk.zzb(t11, j10));
                        zzb((zzakr<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 3:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 4:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 5:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 6:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 7:
                    if (zzc((zzakr<T>) t11, i10)) {
                        zzamk.zzc(t10, j10, zzamk.zzh(t11, j10));
                        zzb((zzakr<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza(t10, j10, zzamk.zze(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 9:
                case 17:
                    zza(t10, t11, i10);
                    break;
                case 10:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza(t10, j10, zzamk.zze(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 11:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 12:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 13:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 14:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 15:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzc(t11, j10));
                    zzb((zzakr<T>) t10, i10);
                    break;
                case 16:
                    if (!zzc((zzakr<T>) t11, i10)) {
                        break;
                    }
                    zzamk.zza((Object) t10, j10, zzamk.zzd(t11, j10));
                    zzb((zzakr<T>) t10, i10);
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
                    this.zzp.zza(t10, t11, j10);
                    break;
                case 50:
                    zzalh.zza(this.zzs, t10, t11, j10);
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
                    if (!zzc((zzakr<T>) t11, i11, i10)) {
                        break;
                    }
                    zzamk.zza(t10, j10, zzamk.zze(t11, j10));
                    zzb((zzakr<T>) t10, i11, i10);
                    break;
                case 60:
                case 68:
                    zzb(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzc((zzakr<T>) t11, i11, i10)) {
                        break;
                    }
                    zzamk.zza(t10, j10, zzamk.zze(t11, j10));
                    zzb((zzakr<T>) t10, i11, i10);
                    break;
            }
        }
        zzalh.zza(this.zzq, t10, t11);
        if (this.zzh) {
            zzalh.zza(this.zzr, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzahk zzahkVar) {
        zza((zzakr<T>) t10, bArr, i10, i11, 0, zzahkVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzh(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zzb(r11, r6))) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zza(r11, r6))) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalh.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamk.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6 A[LOOP:0: B:2:0x0005->B:85:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final void zzc(T t10) {
        int i10;
        if (zzg(t10)) {
            if (t10 instanceof zzajc) {
                zzajc zzajcVar = (zzajc) t10;
                zzajcVar.zzb(a.e.API_PRIORITY_OTHER);
                zzajcVar.zza = 0;
                zzajcVar.zzt();
            }
            int length = this.zzc.length;
            while (i10 < length) {
                int zzc = zzc(i10);
                long j10 = 1048575 & zzc;
                int i11 = (zzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (!zzc((zzakr<T>) t10, this.zzc[i10], i10)) {
                        }
                        zze(i10).zzc(zzb.getObject(t10, j10));
                    } else {
                        switch (i11) {
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
                                this.zzp.zzb(t10, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t10, j10);
                                if (object != null) {
                                    unsafe.putObject(t10, j10, this.zzs.zzc(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zze(i10).zzc(zzb.getObject(t10, j10));
                    }
                }
                i10 = zzc((zzakr<T>) t10, i10) ? 0 : i10 + 3;
                zze(i10).zzc(zzb.getObject(t10, j10));
            }
            this.zzq.zzf(t10);
            if (this.zzh) {
                this.zzr.zzc(t10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalf] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalf] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final boolean zzd(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t10).zzg();
            }
            int i15 = this.zzl[i14];
            int i16 = this.zzc[i15];
            int zzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (((268435456 & zzc) != 0) && !zza((zzakr<T>) t10, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & zzc) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc((zzakr<T>) t10, i16, i15) && !zza((Object) t10, zzc, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzs.zzd(zzamk.zze(t10, zzc & 1048575));
                            if (!zzd.isEmpty()) {
                                if (this.zzs.zza(zzf(i15)).zzc.zzb() == zzanb.MESSAGE) {
                                    Iterator<?> it = zzd.values().iterator();
                                    ?? r12 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r12 = r12;
                                        if (r12 == 0) {
                                            r12 = zzalb.zza().zza((Class) next.getClass());
                                        }
                                        if (!r12.zzd(next)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzamk.zze(t10, zzc & 1048575);
                if (!list.isEmpty()) {
                    ?? zze = zze(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        }
                        if (!zze.zzd(list.get(i21))) {
                            z10 = false;
                            break;
                        }
                        i21++;
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (zza((zzakr<T>) t10, i15, i10, i11, i19) && !zza((Object) t10, zzc, zze(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
    }
}
