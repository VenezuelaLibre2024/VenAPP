package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhab extends AbstractList {
    private final List zza;
    private final zzhaa zzb;

    public zzhab(List list, zzhaa zzhaaVar) {
        this.zza = list;
        this.zzb = zzhaaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzbcn zzb = zzbcn.zzb(((Integer) this.zza.get(i10)).intValue());
        return zzb == null ? zzbcn.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
