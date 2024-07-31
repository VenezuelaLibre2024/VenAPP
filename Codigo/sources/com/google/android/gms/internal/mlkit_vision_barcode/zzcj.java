package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzcj extends zzbv {
    final /* synthetic */ zzcl zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcj(zzcl zzclVar, int i10) {
        this.zza = zzclVar;
        Object[] objArr = zzclVar.zzb;
        objArr.getClass();
        this.zzb = objArr[i10];
        this.zzc = i10;
    }

    private final void zza() {
        int zzq;
        int i10 = this.zzc;
        if (i10 != -1 && i10 < this.zza.size()) {
            Object obj = this.zzb;
            zzcl zzclVar = this.zza;
            int i11 = this.zzc;
            Object[] objArr = zzclVar.zzb;
            objArr.getClass();
            if (zzay.zza(obj, objArr[i11])) {
                return;
            }
        }
        zzq = this.zza.zzq(this.zzb);
        this.zzc = zzq;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object getValue() {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
