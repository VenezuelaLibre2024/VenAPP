package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzajq extends zzahj<String> implements zzajt, RandomAccess {
    private static final zzajq zza;

    @Deprecated
    private static final zzajt zzb;
    private final List<Object> zzc;

    static {
        zzajq zzajqVar = new zzajq(false);
        zza = zzajqVar;
        zzb = zzajqVar;
    }

    public zzajq() {
        this(10);
    }

    public zzajq(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private zzajq(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzajq(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zza(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzahp ? ((zzahp) obj).zzd() : zzajf.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzajt) {
            collection = ((zzajt) collection).zze();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzahp) {
            zzahp zzahpVar = (zzahp) obj;
            String zzd = zzahpVar.zzd();
            if (zzahpVar.zzf()) {
                this.zzc.set(i10, zzd);
            }
            return zzd;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zzajf.zzb(bArr);
        if (zzajf.zzc(bArr)) {
            this.zzc.set(i10, zzb2);
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zza(remove);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zza(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj
    public final /* synthetic */ zzajj zza(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.zzc);
        return new zzajq((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final void zza(zzahp zzahpVar) {
        zza();
        this.zzc.add(zzahpVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final Object zzb(int i10) {
        return this.zzc.get(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahj, com.google.android.gms.internal.p002firebaseauthapi.zzajj
    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final zzajt zzd() {
        return zzc() ? new zzamf(this) : this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final List<?> zze() {
        return Collections.unmodifiableList(this.zzc);
    }
}
