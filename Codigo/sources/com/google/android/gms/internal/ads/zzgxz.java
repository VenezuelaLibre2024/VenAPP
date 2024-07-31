package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzgxz extends zzgxv implements RandomAccess, zzhbm {
    private static final zzgxz zza = new zzgxz(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    zzgxz() {
        this(new boolean[10], 0, true);
    }

    private zzgxz(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i10;
    }

    private final String zzf(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzc;
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbQ();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.zzb;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.zzb, i10, zArr2, i12, this.zzc - i10);
            this.zzb = zArr2;
        }
        this.zzb[i10] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbQ();
        byte[] bArr = zzhae.zzd;
        collection.getClass();
        if (!(collection instanceof zzgxz)) {
            return super.addAll(collection);
        }
        zzgxz zzgxzVar = (zzgxz) collection;
        int i10 = zzgxzVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.zzb;
        if (i12 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(zzgxzVar.zzb, 0, this.zzb, this.zzc, zzgxzVar.zzc);
        this.zzc = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxz)) {
            return super.equals(obj);
        }
        zzgxz zzgxzVar = (zzgxz) obj;
        if (this.zzc != zzgxzVar.zzc) {
            return false;
        }
        boolean[] zArr = zzgxzVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzhae.zza(this.zzb[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbQ();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzbQ();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbQ();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public final /* bridge */ /* synthetic */ zzhad zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgxz(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zzbQ();
        int i10 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zArr3[i11] = z10;
    }
}
