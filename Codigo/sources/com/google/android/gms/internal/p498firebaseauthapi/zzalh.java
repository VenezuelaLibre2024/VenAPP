package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzalh {
    private static final Class<?> zza = zzd();
    private static final zzame<?, ?> zzb = zzc();
    private static final zzame<?, ?> zzc = new zzamg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, Object obj, zzalf zzalfVar) {
        return obj instanceof zzajr ? zzaik.zzb(i10, (zzajr) obj) : zzaik.zzb(i10, (zzakn) obj, zzalfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List<zzahp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzaik.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzaik.zza(list.get(i11));
        }
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List<zzakn> list, zzalf zzalfVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzaik.zza(i10, list.get(i12), zzalfVar);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zza(i10, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzame<?, ?> zza() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzame<UT, UB> zzameVar) {
        if (ub2 == null) {
            ub2 = zzameVar.zzc(obj);
        }
        zzameVar.zzb(ub2, i10, i11);
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzajg zzajgVar, UB ub2, zzame<UT, UB> zzameVar) {
        if (zzajgVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzajgVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, intValue, ub2, zzameVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzajgVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i10, intValue2, ub2, zzameVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i10, List<zzahp> list, zzana zzanaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzana zzanaVar, zzalf zzalfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zza(i10, list, zzalfVar);
    }

    public static void zza(int i10, List<Boolean> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zza(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzaix<FT>> void zza(zzaiq<FT> zzaiqVar, T t10, T t11) {
        zzaiv<FT> zza2 = zzaiqVar.zza(t11);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzaiqVar.zzb(t10).zza(zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzakg zzakgVar, T t10, T t11, long j10) {
        zzamk.zza(t10, j10, zzakgVar.zza(zzamk.zze(t10, j10), zzamk.zze(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzame<UT, UB> zzameVar, T t10, T t11) {
        zzameVar.zzc(t10, zzameVar.zza(zzameVar.zzd(t10), zzameVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzajc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzaik.zzi(i10) * size;
        if (list instanceof zzajt) {
            zzajt zzajtVar = (zzajt) list;
            while (i11 < size) {
                Object zzb2 = zzajtVar.zzb(i11);
                zzi += zzb2 instanceof zzahp ? zzaik.zza((zzahp) zzb2) : zzaik.zza((String) zzb2);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzi += obj instanceof zzahp ? zzaik.zza((zzahp) obj) : zzaik.zza((String) obj);
                i11++;
            }
        }
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, List<?> list, zzalf zzalfVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzaik.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzi += obj instanceof zzajr ? zzaik.zza((zzajr) obj) : zzaik.zza((zzakn) obj, zzalfVar);
        }
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzc(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzame<?, ?> zzb() {
        return zzc;
    }

    public static void zzb(int i10, List<String> list, zzana zzanaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzb(i10, list);
    }

    public static void zzb(int i10, List<?> list, zzana zzanaVar, zzalf zzalfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzb(i10, list, zzalfVar);
    }

    public static void zzb(int i10, List<Double> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzb(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zzc(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    private static zzame<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzame) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzc(int i10, List<Integer> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzc(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zza(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    public static void zzd(int i10, List<Integer> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzd(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zze(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zze(list.get(i11).intValue());
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

    public static void zze(int i10, List<Long> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zze(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajy) {
            zzajy zzajyVar = (zzajy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzd(zzajyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzf(int i10, List<Float> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzf(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzh(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzg(int i10, List<Integer> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzg(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajy) {
            zzajy zzajyVar = (zzajy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzf(zzajyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzf(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzh(int i10, List<Long> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzh(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzj(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzj(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzi(int i10, List<Integer> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzi(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzaik.zzi(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajy) {
            zzajy zzajyVar = (zzajy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzg(zzajyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzj(int i10, List<Long> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzj(i10, list, z10);
    }

    public static void zzk(int i10, List<Integer> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzana zzanaVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanaVar.zzn(i10, list, z10);
    }
}
