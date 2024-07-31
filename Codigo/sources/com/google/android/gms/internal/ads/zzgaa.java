package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class zzgaa<E> extends zzfzv<E> implements List<E>, RandomAccess {
    private static final zzgcf zza = new zzfzy(zzgbk.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgaa zzi(Object[] objArr, int i10) {
        return i10 == 0 ? zzgbk.zza : new zzgbk(objArr, i10);
    }

    public static zzgaa zzj(Collection collection) {
        if (!(collection instanceof zzfzv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgbi.zzb(array, length);
            return zzi(array, length);
        }
        zzgaa zzd2 = ((zzfzv) collection).zzd();
        if (!zzd2.zzf()) {
            return zzd2;
        }
        Object[] array2 = zzd2.toArray();
        return zzi(array2, array2.length);
    }

    public static zzgaa zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgbk.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgbi.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzgaa zzl() {
        return zzgbk.zza;
    }

    public static zzgaa zzm(Object obj) {
        Object[] objArr = {obj};
        zzgbi.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzgaa zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgbi.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzgaa zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgbi.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzgaa zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgbi.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzgaa zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgbi.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzfwy.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfwy.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzv
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    @Deprecated
    public final zzgaa zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    /* renamed from: zze */
    public final zzgce iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzgaa subList(int i10, int i11) {
        zzfxe.zzh(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzgbk.zza : new zzfzz(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzr */
    public final zzgcf listIterator(int i10) {
        zzfxe.zzb(i10, size(), "index");
        return isEmpty() ? zza : new zzfzy(this, i10);
    }
}
