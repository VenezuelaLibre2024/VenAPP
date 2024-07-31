package com.google.android.gms.internal.mlkit_common;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzaq extends zzar {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzar zzc;

    public zzaq(zzar zzarVar, int i10, int i11) {
        this.zzc = zzarVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzaf.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzan
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzan
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzan
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    /* renamed from: zzf */
    public final zzar subList(int i10, int i11) {
        zzaf.zzd(i10, i11, this.zzb);
        zzar zzarVar = this.zzc;
        int i12 = this.zza;
        return zzarVar.subList(i10 + i12, i11 + i12);
    }
}
