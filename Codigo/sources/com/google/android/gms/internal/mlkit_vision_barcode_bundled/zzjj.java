package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzjj extends zzed implements zzfp {
    private static final zzjj zza;
    private int zzd;
    private String zze = "";
    private zzjp zzf;

    static {
        zzjj zzjjVar = new zzjj();
        zza = zzjjVar;
        zzed.zzU(zzjj.class, zzjjVar);
    }

    private zzjj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzjj();
        }
        if (i11 == 4) {
            return new zzji(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
