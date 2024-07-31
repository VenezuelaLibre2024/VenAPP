package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcl extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzcl() {
        zzm(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl(int i10) {
        zzm(12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzh(zzcl zzclVar) {
        Object obj = zzclVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzq(Object obj) {
        if (zzo()) {
            return -1;
        }
        int zza = zzcn.zza(obj);
        int zzp = zzp();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzcm.zzc(obj2, zza & zzp);
        if (zzc != 0) {
            int i10 = ~zzp;
            int i11 = zza & i10;
            do {
                int i12 = zzc - 1;
                int[] iArr = this.zza;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.zzb;
                    objArr.getClass();
                    if (zzay.zza(obj, objArr[i12])) {
                        return i12;
                    }
                }
                zzc = i13 & zzp;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzr(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object zzd2 = zzcm.zzd(i11);
        if (i13 != 0) {
            zzcm.zze(zzd2, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int zzc = zzcm.zzc(obj, i15);
            while (zzc != 0) {
                int i16 = zzc - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int zzc2 = zzcm.zzc(zzd2, i19);
                zzcm.zze(zzd2, i19, zzc);
                iArr[i16] = ((~i14) & i18) | (zzc2 & i14);
                zzc = i17 & i10;
            }
        }
        this.zze = zzd2;
        zzt(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzs(Object obj) {
        if (zzo()) {
            return zzd;
        }
        int zzp = zzp();
        Object obj2 = this.zze;
        obj2.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        int zzb = zzcm.zzb(obj, null, zzp, obj2, iArr, objArr, null);
        if (zzb == -1) {
            return zzd;
        }
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Object obj3 = objArr2[zzb];
        zzn(zzb, zzp);
        this.zzg--;
        zzl();
        return obj3;
    }

    private final void zzt(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzo()) {
            return;
        }
        zzl();
        Map zzj = zzj();
        if (zzj == null) {
            Object[] objArr = this.zzb;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.zzg, (Object) null);
            Object[] objArr2 = this.zzc;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.zzg, (Object) null);
            Object obj = this.zze;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.zza;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.zzg, 0);
        } else {
            this.zzf = zzdz.zza(size(), 3, 1073741823);
            zzj.clear();
            this.zze = null;
        }
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzj = zzj();
        return zzj != null ? zzj.containsKey(obj) : zzq(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            Object[] objArr = this.zzc;
            objArr.getClass();
            if (zzay.zza(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzcf zzcfVar = new zzcf(this);
        this.zzi = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.get(obj);
        }
        int zzq = zzq(obj);
        if (zzq == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr[zzq];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzci zzciVar = new zzci(this);
        this.zzh = zzciVar;
        return zzciVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int length;
        int min;
        if (zzo()) {
            zzbc.zze(zzo(), "Arrays already allocated");
            int i10 = this.zzf;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzcm.zzd(max2);
            zzt(max2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.put(obj, obj2);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int zza = zzcn.zza(obj);
        int zzp = zzp();
        int i13 = zza & zzp;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzcm.zzc(obj3, i13);
        if (zzc == 0) {
            if (i12 <= zzp) {
                Object obj4 = this.zze;
                obj4.getClass();
                zzcm.zze(obj4, i13, i12);
                int[] iArr2 = this.zza;
                iArr2.getClass();
                length = iArr2.length;
                if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    int[] iArr3 = this.zza;
                    iArr3.getClass();
                    this.zza = Arrays.copyOf(iArr3, min);
                    Object[] objArr3 = this.zzb;
                    objArr3.getClass();
                    this.zzb = Arrays.copyOf(objArr3, min);
                    Object[] objArr4 = this.zzc;
                    objArr4.getClass();
                    this.zzc = Arrays.copyOf(objArr4, min);
                }
                int i14 = (~zzp) & zza;
                int[] iArr4 = this.zza;
                iArr4.getClass();
                iArr4[i11] = i14;
                Object[] objArr5 = this.zzb;
                objArr5.getClass();
                objArr5[i11] = obj;
                Object[] objArr6 = this.zzc;
                objArr6.getClass();
                objArr6[i11] = obj2;
                this.zzg = i12;
                zzl();
                return null;
            }
            zzp = zzr(zzp, zzcm.zza(zzp), zza, i11);
            int[] iArr22 = this.zza;
            iArr22.getClass();
            length = iArr22.length;
            if (i12 > length) {
                int[] iArr32 = this.zza;
                iArr32.getClass();
                this.zza = Arrays.copyOf(iArr32, min);
                Object[] objArr32 = this.zzb;
                objArr32.getClass();
                this.zzb = Arrays.copyOf(objArr32, min);
                Object[] objArr42 = this.zzc;
                objArr42.getClass();
                this.zzc = Arrays.copyOf(objArr42, min);
            }
            int i142 = (~zzp) & zza;
            int[] iArr42 = this.zza;
            iArr42.getClass();
            iArr42[i11] = i142;
            Object[] objArr52 = this.zzb;
            objArr52.getClass();
            objArr52[i11] = obj;
            Object[] objArr62 = this.zzc;
            objArr62.getClass();
            objArr62[i11] = obj2;
            this.zzg = i12;
            zzl();
            return null;
        }
        int i15 = ~zzp;
        int i16 = zza & i15;
        int i17 = 0;
        while (true) {
            int i18 = zzc - 1;
            int i19 = iArr[i18];
            int i20 = i19 & i15;
            if (i20 == i16 && zzay.zza(obj, objArr[i18])) {
                Object obj5 = objArr2[i18];
                objArr2[i18] = obj2;
                return obj5;
            }
            int i21 = i19 & zzp;
            i17++;
            if (i21 != 0) {
                zzc = i21;
            } else {
                if (i17 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                    int zze = zze();
                    while (zze >= 0) {
                        Object[] objArr7 = this.zzb;
                        objArr7.getClass();
                        Object obj6 = objArr7[zze];
                        Object[] objArr8 = this.zzc;
                        objArr8.getClass();
                        linkedHashMap.put(obj6, objArr8[zze]);
                        zze = zzf(zze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzl();
                    return linkedHashMap.put(obj, obj2);
                }
                if (i12 <= zzp) {
                    iArr[i18] = (i12 & zzp) | i20;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.remove(obj);
        }
        Object zzs = zzs(obj);
        if (zzs == zzd) {
            return null;
        }
        return zzs;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzj = zzj();
        return zzj != null ? zzj.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzck zzckVar = new zzck(this);
        this.zzj = zzckVar;
        return zzckVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzj() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl() {
        this.zzf += 32;
    }

    final void zzm(int i10) {
        this.zzf = zzdz.zza(12, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(int i10, int i11) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int size = size() - 1;
        if (i10 >= size) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i10] = iArr[size];
        iArr[size] = 0;
        int zza = zzcn.zza(obj2) & i11;
        int zzc = zzcm.zzc(obj, zza);
        int i12 = size + 1;
        if (zzc == i12) {
            zzcm.zze(obj, zza, i10 + 1);
            return;
        }
        while (true) {
            int i13 = zzc - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == i12) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            zzc = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo() {
        return this.zze == null;
    }
}
