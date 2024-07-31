package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zzhgu extends AbstractList {
    private static final zzhgv zzc = zzhgv.zzb(zzhgu.class);
    final List zza;
    final Iterator zzb;

    public zzhgu(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (this.zza.size() > i10) {
            return this.zza.get(i10);
        }
        if (!this.zzb.hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza.add(this.zzb.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhgt(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzhgv zzhgvVar = zzc;
        zzhgvVar.zza("potentially expensive size() call");
        zzhgvVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
