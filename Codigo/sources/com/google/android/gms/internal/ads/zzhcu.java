package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes2.dex */
public final class zzhcu extends AbstractList implements RandomAccess, zzham {
    private final zzham zza;

    public zzhcu(zzham zzhamVar) {
        this.zza = zzhamVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzhal) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhct(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzhcs(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final zzham zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzi(zzgyl zzgylVar) {
        throw new UnsupportedOperationException();
    }
}
