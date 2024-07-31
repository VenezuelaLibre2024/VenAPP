package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class zzff implements zzfm {
    private final zzfm[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzff(zzfm... zzfmVarArr) {
        this.zza = zzfmVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final zzfl zzb(Class cls) {
        zzfm[] zzfmVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzfm zzfmVar = zzfmVarArr[i10];
            if (zzfmVar.zzc(cls)) {
                return zzfmVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final boolean zzc(Class cls) {
        zzfm[] zzfmVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzfmVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
