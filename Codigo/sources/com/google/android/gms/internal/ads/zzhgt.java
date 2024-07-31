package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzhgt implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhgu zzb;

    public zzhgt(zzhgu zzhguVar) {
        this.zzb = zzhguVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhgu zzhguVar = this.zzb;
            zzhguVar.zza.add(zzhguVar.zzb.next());
            return next();
        }
        zzhgu zzhguVar2 = this.zzb;
        int i10 = this.zza;
        this.zza = i10 + 1;
        return zzhguVar2.zza.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
