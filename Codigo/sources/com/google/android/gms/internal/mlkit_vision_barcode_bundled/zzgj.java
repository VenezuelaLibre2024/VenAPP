package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzgj {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgy zzc;
    private static final zzgy zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgy zzgyVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgyVar = (zzgy) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgyVar;
        zzd = new zzha();
    }

    public static Object zzA(Object obj, int i10, int i11, Object obj2, zzgy zzgyVar) {
        if (obj2 == null) {
            obj2 = zzgyVar.zzc(obj);
        }
        zzgyVar.zzf(obj2, i10, i11);
        return obj2;
    }

    public static void zzB(zzdp zzdpVar, Object obj, Object obj2) {
        zzdt zzb2 = zzdpVar.zzb(obj2);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzdpVar.zzc(obj).zzh(zzb2);
    }

    public static void zzC(zzgy zzgyVar, Object obj, Object obj2) {
        zzgyVar.zzh(obj, zzgyVar.zze(zzgyVar.zzd(obj), zzgyVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzed.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzE(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzc(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzhq zzhqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zze(i10, list);
    }

    public static void zzG(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzg(i10, list, z10);
    }

    public static void zzH(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzj(i10, list, z10);
    }

    public static void zzI(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzl(i10, list, z10);
    }

    public static void zzJ(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzn(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzp(i10, list, z10);
    }

    public static void zzL(int i10, List list, zzhq zzhqVar, zzgh zzghVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzdk) zzhqVar).zzq(i10, list.get(i11), zzghVar);
        }
    }

    public static void zzM(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzs(i10, list, z10);
    }

    public static void zzN(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzu(i10, list, z10);
    }

    public static void zzO(int i10, List list, zzhq zzhqVar, zzgh zzghVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzdk) zzhqVar).zzv(i10, list.get(i11), zzghVar);
        }
    }

    public static void zzP(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzy(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzA(i10, list, z10);
    }

    public static void zzR(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzC(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzE(i10, list, z10);
    }

    public static void zzT(int i10, List list, zzhq zzhqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzH(i10, list);
    }

    public static void zzU(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzJ(i10, list, z10);
    }

    public static void zzV(int i10, List list, zzhq zzhqVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhqVar.zzL(i10, list, z10);
    }

    public static boolean zzW(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdj.zzy(i10 << 3) + 1);
    }

    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = size * zzdj.zzy(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzdb) list.get(i11)).zzd();
            zzy += zzdj.zzy(zzd2) + zzd2;
        }
        return zzy;
    }

    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzdj.zzy(i10 << 3));
    }

    public static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzu(zzeeVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdj.zzy(i10 << 3) + 4);
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdj.zzy(i10 << 3) + 8);
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i10, List list, zzgh zzghVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzdj.zzt(i10, (zzfo) list.get(i12), zzghVar);
        }
        return i11;
    }

    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzdj.zzy(i10 << 3));
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzu(zzeeVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzdj.zzy(i10 << 3));
    }

    public static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfd) {
            zzfd zzfdVar = (zzfd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzz(zzfdVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzn(int i10, Object obj, zzgh zzghVar) {
        if (!(obj instanceof zzeu)) {
            return zzdj.zzy(i10 << 3) + zzdj.zzw((zzfo) obj, zzghVar);
        }
        int i11 = zzdj.zzb;
        int zza2 = ((zzeu) obj).zza();
        return zzdj.zzy(i10 << 3) + zzdj.zzy(zza2) + zza2;
    }

    public static int zzo(int i10, List list, zzgh zzghVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzdj.zzy(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzeu) {
                int zza2 = ((zzeu) obj).zza();
                zzy += zzdj.zzy(zza2) + zza2;
            } else {
                zzy += zzdj.zzw((zzfo) obj, zzghVar);
            }
        }
        return zzy;
    }

    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzdj.zzy(i10 << 3));
    }

    public static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzeeVar.zze(i11);
                i10 += zzdj.zzy((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzdj.zzy((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzdj.zzy(i10 << 3));
    }

    public static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfd) {
            zzfd zzfdVar = (zzfd) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzfdVar.zze(i11);
                i10 += zzdj.zzz((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzdj.zzz((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzt(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzew;
        int zzy = zzdj.zzy(i10 << 3) * size;
        if (z10) {
            zzew zzewVar = (zzew) list;
            while (i11 < size) {
                Object zzf = zzewVar.zzf(i11);
                if (zzf instanceof zzdb) {
                    int zzd2 = ((zzdb) zzf).zzd();
                    zzy += zzdj.zzy(zzd2) + zzd2;
                } else {
                    zzy += zzdj.zzx((String) zzf);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzdb) {
                    int zzd3 = ((zzdb) obj).zzd();
                    zzy += zzdj.zzy(zzd3) + zzd3;
                } else {
                    zzy += zzdj.zzx((String) obj);
                }
                i11++;
            }
        }
        return zzy;
    }

    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzdj.zzy(i10 << 3));
    }

    public static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzee) {
            zzee zzeeVar = (zzee) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzy(zzeeVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzdj.zzy(i10 << 3));
    }

    public static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfd) {
            zzfd zzfdVar = (zzfd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzz(zzfdVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzdj.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzgy zzy() {
        return zzc;
    }

    public static zzgy zzz() {
        return zzd;
    }
}
