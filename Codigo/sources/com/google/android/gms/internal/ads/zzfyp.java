package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfyp implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfyq zzc;

    public zzfyp(zzfyq zzfyqVar) {
        this.zzc = zzfyqVar;
        Collection collection = zzfyqVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public zzfyp(zzfyq zzfyqVar, Iterator it) {
        this.zzc = zzfyqVar;
        this.zzb = zzfyqVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.zza.remove();
        zzfyt zzfytVar = this.zzc.zze;
        i10 = zzfytVar.zzb;
        zzfytVar.zzb = i10 - 1;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
