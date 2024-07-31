package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzhca {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzhcp zzc;
    private static final zzhcp zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzhcp zzhcpVar = null;
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
                zzhcpVar = (zzhcp) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzhcpVar;
        zzd = new zzhcr();
    }

    public static void zzA(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzu(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzx(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzz(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzB(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzD(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzI(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzK(i10, list, z10);
    }

    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(zzgzvVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgza.zzz(i10 << 3) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgza.zzz(i10 << 3) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(zzgzvVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhat) {
            zzhat zzhatVar = (zzhat) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(zzhatVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(int i10, Object obj, zzhby zzhbyVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzhak)) {
            return zzgza.zzz(i11) + zzgza.zzx((zzhbe) obj, zzhbyVar);
        }
        int zzz = zzgza.zzz(i11);
        int zza2 = ((zzhak) obj).zza();
        return zzz + zzgza.zzz(zza2) + zza2;
    }

    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzgzvVar.zze(i11);
                i10 += zzgza.zzz((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzgza.zzz((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhat) {
            zzhat zzhatVar = (zzhat) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzhatVar.zze(i11);
                i10 += zzgza.zzA((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzgza.zzA((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzz(zzgzvVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzz(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhat) {
            zzhat zzhatVar = (zzhat) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(zzhatVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgza.zzA(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzhcp zzm() {
        return zzc;
    }

    public static zzhcp zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i10, List list, zzgzy zzgzyVar, Object obj2, zzhcp zzhcpVar) {
        if (zzgzyVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgzyVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, intValue, obj2, zzhcpVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgzyVar.zza(intValue2)) {
                    obj2 = zzp(obj, i10, intValue2, obj2, zzhcpVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i10, int i11, Object obj2, zzhcp zzhcpVar) {
        if (obj2 == null) {
            obj2 = zzhcpVar.zzc(obj);
        }
        zzhcpVar.zzl(obj2, i10, i11);
        return obj2;
    }

    public static void zzq(zzhcp zzhcpVar, Object obj, Object obj2) {
        zzhcpVar.zzo(obj, zzhcpVar.zze(zzhcpVar.zzd(obj), zzhcpVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzgzu.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzs(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzt(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzc(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzg(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzj(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzl(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzn(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzp(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzgzb zzgzbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzs(i10, list, z10);
    }
}
