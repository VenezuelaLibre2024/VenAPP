package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzuo extends zzuv {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    public zzuo(float f10, float f11, float f12, float f13, float f14) {
        this.zza = f10;
        this.zzb = f11;
        this.zzc = f12;
        this.zzd = f13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuv) {
            zzuv zzuvVar = (zzuv) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzuvVar.zzc()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzuvVar.zze()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzuvVar.zzb()) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzuvVar.zzd())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                zzuvVar.zza();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.zza + ", yMin=" + this.zzb + ", xMax=" + this.zzc + ", yMax=" + this.zzd + ", confidenceScore=0.0}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zza() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zze() {
        return this.zzb;
    }
}
