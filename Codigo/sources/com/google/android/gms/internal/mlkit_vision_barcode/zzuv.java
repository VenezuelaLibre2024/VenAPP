package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes2.dex */
public abstract class zzuv {
    public static zzuv zzg(float f10, float f11, float f12, float f13, float f14) {
        return new zzuo(f10, f11, f12, f13, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float zzb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float zzd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float zze();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzf() {
        if (zzh()) {
            return (zzb() - zzc()) * (zzd() - zze());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
