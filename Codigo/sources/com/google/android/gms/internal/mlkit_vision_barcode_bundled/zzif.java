package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzif extends zzed implements zzfp {
    private static final zzif zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        zzif zzifVar = new zzif();
        zza = zzifVar;
        zzed.zzU(zzif.class, zzifVar);
    }

    private zzif() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzie.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzif();
        }
        if (i11 == 4) {
            return new zzid(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
