package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzka extends zzed implements zzfp {
    private static final zzka zza;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzka zzkaVar = new zzka();
        zza = zzkaVar;
        zzed.zzU(zzka.class, zzkaVar);
    }

    private zzka() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzjy.zza});
        }
        if (i11 == 3) {
            return new zzka();
        }
        if (i11 == 4) {
            return new zzjz(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
