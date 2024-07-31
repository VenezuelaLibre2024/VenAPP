package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class zzgca {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    public static zzgbz zzb(Set set, Set set2) {
        zzfxe.zzc(set, "set1");
        zzfxe.zzc(set2, "set2");
        return new zzgbu(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfxf zzfxfVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgbv)) {
                set.getClass();
                return new zzgbv(set, zzfxfVar);
            }
            zzgbv zzgbvVar = (zzgbv) set;
            return new zzgbv(zzgbvVar.zza, zzfxi.zza(zzgbvVar.zzb, zzfxfVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgbv)) {
            sortedSet.getClass();
            return new zzgbw(sortedSet, zzfxfVar);
        }
        zzgbv zzgbvVar2 = (zzgbv) sortedSet;
        return new zzgbw((SortedSet) zzgbvVar2.zza, zzfxi.zza(zzgbvVar2.zzb, zzfxfVar));
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgbg) {
            collection = ((zzgbg) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
