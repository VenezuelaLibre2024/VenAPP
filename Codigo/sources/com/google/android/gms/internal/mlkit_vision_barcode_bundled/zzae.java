package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzae extends zzed implements zzfp {
    private static final zzae zza;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        zzae zzaeVar = new zzae();
        zza = zzaeVar;
        zzed.zzU(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzr.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzae();
        }
        if (i11 == 4) {
            return new zzad(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
