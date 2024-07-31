package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class zzdo extends zzcv {
    final /* synthetic */ zzdp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdo(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzc;
        zzbc.zza(i10, i11, "index");
        zzdp zzdpVar = this.zza;
        objArr = zzdpVar.zzb;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = zzdpVar.zzb;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzc;
        return i10;
    }
}
