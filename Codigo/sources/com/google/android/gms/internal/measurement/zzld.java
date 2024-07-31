package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzld {
    private static final Class<?> zza = zzd();
    private static final zzma<?, ?> zzb = zzc();
    private static final zzma<?, ?> zzc = new zzmc();

    public static int zza(int i10, Object obj, zzlb zzlbVar) {
        return obj instanceof zzjn ? zzig.zzb(i10, (zzjn) obj) : zzig.zzc(i10, (zzkj) obj, zzlbVar);
    }

    public static int zza(int i10, List<zzhm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzig.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzig.zzb(list.get(i11));
        }
        return zzi;
    }

    public static int zza(int i10, List<zzkj> list, zzlb zzlbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzig.zzb(i10, list.get(i12), zzlbVar);
        }
        return i11;
    }

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.zzb(i10, true);
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzma<?, ?> zza() {
        return zzb;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzma<UT, UB> zzmaVar) {
        if (ub2 == null) {
            ub2 = zzmaVar.zzc(obj);
        }
        zzmaVar.zzb(ub2, i10, i11);
        return ub2;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzje zzjeVar, UB ub2, zzma<UT, UB> zzmaVar) {
        if (zzjeVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzjeVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, intValue, ub2, zzmaVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjeVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i10, intValue2, ub2, zzmaVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i10, List<zzhm> list, zzmw zzmwVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzmw zzmwVar, zzlb zzlbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zza(i10, list, zzlbVar);
    }

    public static void zza(int i10, List<Boolean> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zza(i10, list, z10);
    }

    public static <T, FT extends zzis<FT>> void zza(zzim<FT> zzimVar, T t10, T t11) {
        zziq<FT> zza2 = zzimVar.zza(t11);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzimVar.zzb(t10).zza(zza2);
    }

    public static <T> void zza(zzkg zzkgVar, T t10, T t11, long j10) {
        zzmg.zza(t10, j10, zzkgVar.zza(zzmg.zze(t10, j10), zzmg.zze(t11, j10)));
    }

    public static <T, UT, UB> void zza(zzma<UT, UB> zzmaVar, T t10, T t11) {
        zzmaVar.zzc(t10, zzmaVar.zza(zzmaVar.zzd(t10), zzmaVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzix.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zzb(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzig.zzi(i10) * size;
        if (list instanceof zzjp) {
            zzjp zzjpVar = (zzjp) list;
            while (i11 < size) {
                Object zzb2 = zzjpVar.zzb(i11);
                zzi += zzb2 instanceof zzhm ? zzig.zzb((zzhm) zzb2) : zzig.zzb((String) zzb2);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzi += obj instanceof zzhm ? zzig.zzb((zzhm) obj) : zzig.zzb((String) obj);
                i11++;
            }
        }
        return zzi;
    }

    public static int zzb(int i10, List<?> list, zzlb zzlbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzig.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzi += obj instanceof zzjn ? zzig.zza((zzjn) obj) : zzig.zza((zzkj) obj, zzlbVar);
        }
        return zzi;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzig.zzi(i10));
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzd(zzjaVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzd(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzma<?, ?> zzb() {
        return zzc;
    }

    public static void zzb(int i10, List<String> list, zzmw zzmwVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzb(i10, list);
    }

    public static void zzb(int i10, List<?> list, zzmw zzmwVar, zzlb zzlbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzb(i10, list, zzlbVar);
    }

    public static void zzb(int i10, List<Double> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzb(i10, list, z10);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.zzf(i10, 0);
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    private static zzma<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzma) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzc(int i10, List<Integer> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzc(i10, list, z10);
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.zzc(i10, 0L);
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i10, List<Integer> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzd(i10, list, z10);
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzig.zzi(i10));
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzf(zzjaVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zze(int i10, List<Long> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zze(i10, list, z10);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzig.zzi(i10));
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzd(zzjyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzf(int i10, List<Float> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzf(i10, list, z10);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzig.zzi(i10));
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzh(zzjaVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzg(int i10, List<Integer> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzg(i10, list, z10);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzig.zzi(i10));
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzf(zzjyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzf(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzh(int i10, List<Long> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzh(i10, list, z10);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzig.zzi(i10));
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzj(zzjaVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzj(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzi(int i10, List<Integer> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzi(i10, list, z10);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzig.zzi(i10));
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzg(zzjyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzj(int i10, List<Long> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzj(i10, list, z10);
    }

    public static void zzk(int i10, List<Integer> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzmw zzmwVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmwVar.zzn(i10, list, z10);
    }
}
