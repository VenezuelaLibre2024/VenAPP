package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzev extends zzcm implements RandomAccess, zzew {

    @Deprecated
    public static final zzew zza;
    private static final zzev zzb;
    private final List zzc;

    static {
        zzev zzevVar = new zzev(false);
        zzb = zzevVar;
        zza = zzevVar;
    }

    public zzev() {
        this(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzev(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzev(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zzi(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzdb ? ((zzdb) obj).zzt(zzem.zzb) : zzem.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzew) {
            collection = ((zzew) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzi(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final /* bridge */ /* synthetic */ zzel zzd(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.zzc);
        return new zzev(arrayList);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
    public final zzew zze() {
        return zzc() ? new zzhd(this) : this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdb) {
            zzdb zzdbVar = (zzdb) obj;
            String zzt = zzdbVar.zzt(zzem.zzb);
            if (zzdbVar.zzn()) {
                this.zzc.set(i10, zzt);
            }
            return zzt;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzem.zzd(bArr);
        if (zzhn.zzg(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }
}