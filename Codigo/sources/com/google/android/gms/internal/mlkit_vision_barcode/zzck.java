package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzck extends AbstractCollection {
    final /* synthetic */ zzcl zza;

    public zzck(zzcl zzclVar) {
        this.zza = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzcl zzclVar = this.zza;
        Map zzj = zzclVar.zzj();
        return zzj != null ? zzj.values().iterator() : new zzce(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
