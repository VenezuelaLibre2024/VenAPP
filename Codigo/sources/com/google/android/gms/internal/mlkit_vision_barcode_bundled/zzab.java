package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzab extends zzed implements zzfp {
    private static final zzab zza;
    private int zzd;
    private zzae zze;
    private boolean zzf;

    static {
        zzab zzabVar = new zzab();
        zza = zzabVar;
        zzed.zzU(zzab.class, zzabVar);
    }

    private zzab() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzab();
        }
        if (i11 == 4) {
            return new zzaa(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
