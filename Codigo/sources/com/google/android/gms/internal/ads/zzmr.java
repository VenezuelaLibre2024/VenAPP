package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class zzmr {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmr(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i10 = 0; i10 < zzahVar.zzb(); i10++) {
            int zza = zzahVar.zza(i10);
            zzmq zzmqVar = (zzmq) sparseArray.get(zza);
            zzmqVar.getClass();
            sparseArray2.append(zza, zzmqVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmq zzc(int i10) {
        zzmq zzmqVar = (zzmq) this.zzb.get(i10);
        zzmqVar.getClass();
        return zzmqVar;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
