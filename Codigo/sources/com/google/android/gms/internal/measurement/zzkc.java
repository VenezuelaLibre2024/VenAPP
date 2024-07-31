package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzkc implements zzkk {
    private zzkk[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkc(zzkk... zzkkVarArr) {
        this.zza = zzkkVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final zzkh zza(Class<?> cls) {
        for (zzkk zzkkVar : this.zza) {
            if (zzkkVar.zzb(cls)) {
                return zzkkVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean zzb(Class<?> cls) {
        for (zzkk zzkkVar : this.zza) {
            if (zzkkVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}