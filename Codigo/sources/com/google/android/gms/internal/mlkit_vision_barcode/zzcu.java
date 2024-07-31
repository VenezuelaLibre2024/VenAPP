package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzcu extends zzcv {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcv zzc;

    public zzcu(zzcv zzcvVar, int i10, int i11) {
        this.zzc = zzcvVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbc.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv
    /* renamed from: zzf */
    public final zzcv subList(int i10, int i11) {
        zzbc.zzd(i10, i11, this.zzb);
        zzcv zzcvVar = this.zzc;
        int i12 = this.zza;
        return zzcvVar.subList(i10 + i12, i11 + i12);
    }
}
