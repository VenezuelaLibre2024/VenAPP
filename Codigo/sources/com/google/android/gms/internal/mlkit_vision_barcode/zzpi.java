package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes2.dex */
public enum zzpi implements zzfe {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzpi(int i10) {
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfe
    public final int zza() {
        return this.zzf;
    }
}
