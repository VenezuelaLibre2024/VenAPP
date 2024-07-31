package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzjf extends zzed implements zzfp {
    private static final zzjf zza;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        zzjf zzjfVar = new zzjf();
        zza = zzjfVar;
        zzed.zzU(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", zzjd.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzjf();
        }
        if (i11 == 4) {
            return new zzje(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
