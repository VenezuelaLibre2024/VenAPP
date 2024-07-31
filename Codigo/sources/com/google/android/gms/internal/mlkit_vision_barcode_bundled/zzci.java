package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzci extends zzed implements zzfp {
    private static final zzci zza;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzci zzciVar = new zzci();
        zza = zzciVar;
        zzed.zzU(zzci.class, zzciVar);
    }

    private zzci() {
    }

    public static zzci zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final int zzd() {
        int zza2 = zzch.zza(this.zze);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzcg.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzci();
        }
        if (i11 == 4) {
            return new zzce(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
