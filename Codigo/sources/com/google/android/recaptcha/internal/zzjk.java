package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes2.dex */
public final class zzjk extends AbstractList implements RandomAccess, zzhg {
    private final zzhg zza;

    public zzjk(zzhg zzhgVar) {
        this.zza = zzhgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzhf) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzjj(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzji(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final zzhg zze() {
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final void zzi(zzez zzezVar) {
        throw new UnsupportedOperationException();
    }
}
