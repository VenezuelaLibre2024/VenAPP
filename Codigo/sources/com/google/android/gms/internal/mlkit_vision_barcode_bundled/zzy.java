package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzy extends zzed implements zzfp {
    private static final zzy zza;
    private int zzd;
    private zzab zze;

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzed.zzU(zzy.class, zzyVar);
    }

    private zzy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzy();
        }
        if (i11 == 4) {
            return new zzx(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
