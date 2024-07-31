package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes2.dex */
final class zzun extends zzuu {
    private final int zzc;
    private final int zzd;
    private final float zze;
    private final float zzf;
    private final boolean zzg;
    private final float zzh;
    private final float zzi;
    private final long zzj;
    private final long zzk;
    private final boolean zzl;
    private final float zzm;
    private final float zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzun(int i10, int i11, float f10, float f11, boolean z10, float f12, float f13, long j10, long j11, boolean z11, float f14, float f15, zzum zzumVar) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = f10;
        this.zzf = f11;
        this.zzg = z10;
        this.zzh = f12;
        this.zzi = f13;
        this.zzj = j10;
        this.zzk = j11;
        this.zzl = z11;
        this.zzm = f14;
        this.zzn = f15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuu) {
            zzuu zzuuVar = (zzuu) obj;
            if (this.zzc == zzuuVar.zzh() && this.zzd == zzuuVar.zzg() && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzuuVar.zzd()) && Float.floatToIntBits(this.zzf) == Float.floatToIntBits(zzuuVar.zzc()) && this.zzg == zzuuVar.zzl() && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzuuVar.zzb()) && Float.floatToIntBits(this.zzi) == Float.floatToIntBits(zzuuVar.zza()) && this.zzj == zzuuVar.zzj() && this.zzk == zzuuVar.zzi() && this.zzl == zzuuVar.zzk() && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzuuVar.zze()) && Float.floatToIntBits(this.zzn) == Float.floatToIntBits(zzuuVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = ((((((((((((this.zzc ^ 1000003) * 1000003) ^ this.zzd) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ Float.floatToIntBits(this.zzf)) * 1000003) ^ (true != this.zzg ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ Float.floatToIntBits(this.zzi);
        int i10 = (int) this.zzj;
        return (((((((((floatToIntBits * 1000003) ^ i10) * 1000003) ^ ((int) this.zzk)) * 1000003) ^ (true == this.zzl ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.zzm)) * 1000003) ^ Float.floatToIntBits(this.zzn);
    }

    public final String toString() {
        return "AutoZoomOptions{recentFramesToCheck=" + this.zzc + ", recentFramesContainingPredictedArea=" + this.zzd + ", recentFramesIou=" + this.zze + ", maxCoverage=" + this.zzf + ", useConfidenceScore=" + this.zzg + ", lowerConfidenceScore=" + this.zzh + ", higherConfidenceScore=" + this.zzi + ", zoomIntervalInMillis=" + this.zzj + ", resetIntervalInMillis=" + this.zzk + ", enableZoomThreshold=" + this.zzl + ", zoomInThreshold=" + this.zzm + ", zoomOutThreshold=" + this.zzn + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zza() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzb() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzc() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zze() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzf() {
        return this.zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final int zzg() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final int zzh() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final long zzi() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final long zzj() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final boolean zzk() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final boolean zzl() {
        return this.zzg;
    }
}
