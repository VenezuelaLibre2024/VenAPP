package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzgag {
    public static Object zza(Iterable iterable, Object obj) {
        zzgbt zzgbtVar = new zzgbt((zzgbu) iterable);
        return zzgbtVar.hasNext() ? zzgbtVar.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfxf zzfxfVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfxfVar.getClass();
            return zzd((List) iterable, zzfxfVar);
        }
        Iterator it = iterable.iterator();
        zzfxfVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfxfVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzc(List list, zzfxf zzfxfVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfxfVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }

    private static boolean zzd(List list, zzfxf zzfxfVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfxfVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfxfVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfxfVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
