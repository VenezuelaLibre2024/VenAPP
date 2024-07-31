package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzm extends zzed implements zzfp {
    private static final zzm zza;
    private int zzd;
    private zzel zze = zzed.zzO();
    private String zzf = "";

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzed.zzU(zzm.class, zzmVar);
    }

    private zzm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i11 == 4) {
            return new zzl(zzkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
